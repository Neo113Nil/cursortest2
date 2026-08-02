package org.chromium.base;

import android.text.TextUtils;
import internal.org.chromium.build.NullUtil;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class CommandLine {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String SWITCH_PREFIX = "--";
    private static final String SWITCH_TERMINATOR = "--";
    private static final String SWITCH_VALUE_SEPARATOR = "=";
    private static final String TAG = "CommandLine";
    private static final CommandLine sInstance = new CommandLine();
    private ArrayList<String> mArgs;
    private volatile int mArgsBegin;
    private Map<String, String> mSwitches;

    interface Natives {
        void appendSwitchWithValue(String switchString, String value);

        void appendSwitchesAndArguments(String[] array);

        String getSwitchValue(String switchString);

        Map<String, String> getSwitches();

        boolean hasSwitch(String switchString);

        void init(List<String> args);

        void removeSwitch(String switchString);
    }

    public static boolean isInitialized() {
        return sInstance.mArgsBegin != 0;
    }

    public static boolean hasSwitchedToNative() {
        return sInstance.mArgs == null;
    }

    public static CommandLine getInstance() {
        return sInstance;
    }

    public static void init(String[] args) {
        sInstance.initInternal(args);
    }

    private static char[] readFileAsUtf8(String fileName) {
        File file = new File(fileName);
        try {
            FileReader fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                char[] copyOfRange = Arrays.copyOfRange(cArr, 0, fileReader.read(cArr));
                fileReader.close();
                return copyOfRange;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void initFromFile(String file) {
        char[] readFileAsUtf8 = readFileAsUtf8(file);
        String[] strArr = readFileAsUtf8 == null ? null : tokenizeQuotedArguments(readFileAsUtf8);
        init(strArr);
        if (strArr != null) {
            Log.i(TAG, "COMMAND-LINE FLAGS: %s (from %s)", Arrays.toString(strArr), file);
        }
    }

    public static void resetForTesting(boolean initialize) {
        final CommandLine commandLine = sInstance;
        final Map<String, String> map = commandLine.mSwitches;
        final ArrayList<String> arrayList = commandLine.mArgs;
        final int i = commandLine.mArgsBegin;
        commandLine.mSwitches = null;
        commandLine.mArgs = null;
        commandLine.mArgsBegin = 0;
        if (initialize) {
            commandLine.initInternal(null);
        }
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.CommandLine$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CommandLine.lambda$resetForTesting$0(CommandLine.this, map, arrayList, i);
            }
        });
    }

    static /* synthetic */ void lambda$resetForTesting$0(CommandLine commandLine, Map map, ArrayList arrayList, int i) {
        commandLine.mSwitches = map;
        commandLine.mArgs = arrayList;
        commandLine.mArgsBegin = i;
    }

    static String[] tokenizeQuotedArguments(char[] buffer) {
        if (buffer.length > 98304) {
            throw new RuntimeException("Flags file too big: " + buffer.length);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = null;
        char c = 0;
        for (char c2 : buffer) {
            if ((c == 0 && (c2 == '\'' || c2 == '\"')) || c2 == c) {
                if (sb == null || sb.length() <= 0 || sb.charAt(sb.length() - 1) != '\\') {
                    c = c == 0 ? c2 : (char) 0;
                } else {
                    sb.setCharAt(sb.length() - 1, c2);
                }
            } else if (c != 0 || !Character.isWhitespace(c2)) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(c2);
            } else if (sb != null) {
                arrayList.add(sb.toString());
                sb = null;
            }
        }
        if (sb != null) {
            if (c != 0) {
                Log.w(TAG, "Unterminated quoted string: %s", sb);
            }
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public synchronized void switchToNativeImpl() {
        if (hasSwitchedToNative()) {
            return;
        }
        CommandLineJni.get().init((List) NullUtil.assumeNonNull(this.mArgs));
        this.mArgs = null;
        this.mSwitches = null;
        Log.v(TAG, "Switched to native command-line", new Object[0]);
    }

    public static String[] getJavaSwitchesForTesting() {
        CommandLine commandLine = sInstance;
        if (commandLine == null) {
            return new String[0];
        }
        return (String[]) ((ArrayList) NullUtil.assumeNonNull(commandLine.mArgs)).toArray(new String[0]);
    }

    private synchronized void initInternal(String[] args) {
        String str;
        this.mArgs = new ArrayList<>();
        this.mSwitches = new HashMap();
        this.mArgsBegin = 1;
        if (args != null && args.length != 0 && (str = args[0]) != null) {
            this.mArgs.add(str);
            appendSwitchesInternalLocked(args, 1);
        }
        this.mArgs.add("");
    }

    public String getSwitchValue(String switchString, String defaultValue) {
        String switchValue = getSwitchValue(switchString);
        return TextUtils.isEmpty(switchValue) ? defaultValue : switchValue;
    }

    public boolean hasSwitch(String switchString) {
        boolean containsKey;
        Map<String, String> map = this.mSwitches;
        if (map == null) {
            return CommandLineJni.get().hasSwitch(switchString);
        }
        synchronized (this) {
            containsKey = map.containsKey(switchString);
        }
        return containsKey;
    }

    public String getSwitchValue(String switchString) {
        String str;
        Map<String, String> map = this.mSwitches;
        if (map == null) {
            str = CommandLineJni.get().getSwitchValue(switchString);
        } else {
            synchronized (this) {
                str = map.get(switchString);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public Map<String, String> getSwitches() {
        HashMap hashMap;
        Map<String, String> map = this.mSwitches;
        if (map == null) {
            return CommandLineJni.get().getSwitches();
        }
        synchronized (this) {
            hashMap = new HashMap(map);
        }
        return hashMap;
    }

    public void appendSwitch(String switchString) {
        appendSwitchWithValue(switchString, null);
    }

    public synchronized void appendSwitchWithValue(String switchString, String value) {
        if (value == null) {
            value = "";
        }
        Map<String, String> map = this.mSwitches;
        if (map == null) {
            CommandLineJni.get().appendSwitchWithValue(switchString, value);
            return;
        }
        map.put(switchString, value);
        String str = "--" + switchString;
        if (!value.isEmpty()) {
            str = str + SWITCH_VALUE_SEPARATOR + value;
        }
        NullUtil.assumeNonNull(this.mArgs);
        ArrayList<String> arrayList = this.mArgs;
        int i = this.mArgsBegin;
        this.mArgsBegin = i + 1;
        arrayList.add(i, str);
    }

    public synchronized void appendSwitchesAndArguments(String[] array) {
        if (this.mArgs == null) {
            CommandLineJni.get().appendSwitchesAndArguments(array);
        } else {
            appendSwitchesInternalLocked(array, 0);
        }
    }

    private void appendSwitchesInternalLocked(String[] array, int skipCount) {
        boolean z = true;
        for (String str : array) {
            if (skipCount > 0) {
                skipCount--;
            } else {
                if (str.equals("--")) {
                    z = false;
                }
                if (z && str.startsWith("--")) {
                    String[] split = str.split(SWITCH_VALUE_SEPARATOR, 2);
                    appendSwitchWithValue(split[0].substring(2), split.length > 1 ? split[1] : null);
                } else {
                    this.mArgs.add(str);
                }
            }
        }
    }

    public synchronized void removeSwitch(String switchString) {
        ArrayList<String> arrayList = this.mArgs;
        if (arrayList == null) {
            CommandLineJni.get().removeSwitch(switchString);
            return;
        }
        NullUtil.assumeNonNull(this.mSwitches);
        this.mSwitches.remove(switchString);
        String str = "--" + switchString;
        for (int i = this.mArgsBegin - 1; i > 0; i--) {
            if (!arrayList.get(i).equals(str)) {
                if (!arrayList.get(i).startsWith(str + SWITCH_VALUE_SEPARATOR)) {
                }
            }
            this.mArgsBegin--;
            arrayList.remove(i);
        }
    }
}
