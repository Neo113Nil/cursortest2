package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0017J%\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/react/devsupport/StackTraceHelper;", "", "<init>", "()V", "COLUMN_KEY", "", "LINE_NUMBER_KEY", "FILE_KEY", "METHOD_NAME_KEY", "COLLAPSE_KEY", "MESSAGE_KEY", "ORIGINAL_MESSAGE_KEY", "NAME_KEY", "COMPONENT_STACK_KEY", "STACK_KEY", "ID_KEY", "IS_FATAL_KEY", "EXTRA_DATA_KEY", "STACK_FRAME_PATTERN1", "Ljava/util/regex/Pattern;", "STACK_FRAME_PATTERN2", "convertJsStackTrace", "", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", StackTraceHelper.STACK_KEY, "Lcom/facebook/react/bridge/ReadableArray;", "(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "(Ljava/lang/String;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "convertJavaStackTrace", "exception", "", "(Ljava/lang/Throwable;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "formatFrameSource", "frame", "formatStackTrace", "title", "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)Ljava/lang/String;", "convertProcessedError", "Lcom/facebook/react/bridge/JavaOnlyMap;", "error", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;", "convertProcessedError$ReactAndroid_release", "StackFrameImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStackTraceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceHelper.kt\ncom/facebook/react/devsupport/StackTraceHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n739#2,9:264\n37#3:273\n36#3,3:274\n1#4:277\n*S KotlinDebug\n*F\n+ 1 StackTraceHelper.kt\ncom/facebook/react/devsupport/StackTraceHelper\n*L\n130#1:264,9\n130#1:273\n130#1:274,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StackTraceHelper {

    @NotNull
    public static final String COLLAPSE_KEY = "collapse";

    @NotNull
    public static final String COLUMN_KEY = "column";

    @NotNull
    public static final String COMPONENT_STACK_KEY = "componentStack";

    @NotNull
    public static final String EXTRA_DATA_KEY = "extraData";

    @NotNull
    public static final String FILE_KEY = "file";

    @NotNull
    public static final String ID_KEY = "id";

    @NotNull
    public static final StackTraceHelper INSTANCE = new StackTraceHelper();

    @NotNull
    public static final String IS_FATAL_KEY = "isFatal";

    @NotNull
    public static final String LINE_NUMBER_KEY = "lineNumber";

    @NotNull
    public static final String MESSAGE_KEY = "message";

    @NotNull
    public static final String METHOD_NAME_KEY = "methodName";

    @NotNull
    public static final String NAME_KEY = "name";

    @NotNull
    public static final String ORIGINAL_MESSAGE_KEY = "originalMessage";

    @NotNull
    private static final Pattern STACK_FRAME_PATTERN1;

    @NotNull
    private static final Pattern STACK_FRAME_PATTERN2;

    @NotNull
    public static final String STACK_KEY = "stack";

    static {
        Pattern compile = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        STACK_FRAME_PATTERN1 = compile;
        Pattern compile2 = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");
        Intrinsics.checkNotNullExpressionValue(compile2, "compile(...)");
        STACK_FRAME_PATTERN2 = compile2;
    }

    private StackTraceHelper() {
    }

    @JvmStatic
    @NotNull
    public static final StackFrame[] convertJavaStackTrace(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        StackTraceElement[] stackTrace = exception.getStackTrace();
        int length = stackTrace.length;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i10 = 0; i10 < length; i10++) {
            String className = stackTrace[i10].getClassName();
            String fileName = stackTrace[i10].getFileName();
            String methodName = stackTrace[i10].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "getMethodName(...)");
            stackFrameArr[i10] = new StackFrameImpl(className, fileName, methodName, stackTrace[i10].getLineNumber(), -1, false, 32, null);
        }
        return stackFrameArr;
    }

    @JvmStatic
    @NotNull
    public static final StackFrame[] convertJsStackTrace(@Nullable ReadableArray stack) {
        StackFrameImpl stackFrameImpl;
        int size = stack != null ? stack.size() : 0;
        if (stack == null) {
            return new StackFrame[0];
        }
        StackFrame[] stackFrameArr = new StackFrame[size];
        for (int i10 = 0; i10 < size; i10++) {
            ReadableType type = stack.getType(i10);
            if (type == ReadableType.Map) {
                ReadableMap map = stack.getMap(i10);
                if (map == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string = map.getString("methodName");
                if (string == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string2 = map.getString("file");
                if (string2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z10 = map.hasKey(COLLAPSE_KEY) && !map.isNull(COLLAPSE_KEY) && map.getBoolean(COLLAPSE_KEY);
                int i11 = -1;
                int i12 = (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber");
                if (map.hasKey("column") && !map.isNull("column")) {
                    i11 = map.getInt("column");
                }
                stackFrameImpl = new StackFrameImpl(string2, null, string, i12, i11, z10, 2, null);
            } else {
                if (type != ReadableType.String) {
                    throw new IllegalStateException(("Cannot parse the stackframe for " + stack).toString());
                }
                String string3 = stack.getString(i10);
                if (string3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                stackFrameImpl = new StackFrameImpl(null, null, string3, -1, -1, false, 34, null);
            }
            stackFrameArr[i10] = stackFrameImpl;
        }
        return stackFrameArr;
    }

    @JvmStatic
    @NotNull
    public static final JavaOnlyMap convertProcessedError$ReactAndroid_release(@NotNull ReactJsExceptionHandler.ProcessedError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (ReactJsExceptionHandler.ProcessedError.StackFrame stackFrame : error.getStack()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (stackFrame.getColumn() != null) {
                javaOnlyMap.putDouble("column", r4.intValue());
            }
            if (stackFrame.getLineNumber() != null) {
                javaOnlyMap.putDouble("lineNumber", r4.intValue());
            }
            javaOnlyMap.putString("file", stackFrame.getFile());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            javaOnlyArray.pushMap(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", error.getMessage());
        String originalMessage = error.getOriginalMessage();
        if (originalMessage != null) {
            javaOnlyMap2.putString(ORIGINAL_MESSAGE_KEY, originalMessage);
        }
        String name = error.getName();
        if (name != null) {
            javaOnlyMap2.putString("name", name);
        }
        String componentStack = error.getComponentStack();
        if (componentStack != null) {
            javaOnlyMap2.putString(COMPONENT_STACK_KEY, componentStack);
        }
        javaOnlyMap2.putArray(STACK_KEY, javaOnlyArray);
        javaOnlyMap2.putInt(ID_KEY, error.getId());
        javaOnlyMap2.putBoolean(IS_FATAL_KEY, error.isFatal());
        javaOnlyMap2.putMap("extraData", error.getExtraData());
        return javaOnlyMap2;
    }

    @JvmStatic
    @NotNull
    public static final String formatStackTrace(@Nullable String title, @NotNull StackFrame[] stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(title);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        for (StackFrame stackFrame : stack) {
            sb2.append(stackFrame.getMethod());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append("    ");
            sb2.append(INSTANCE.formatFrameSource(stackFrame));
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public final String formatFrameSource(@NotNull StackFrame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(frame.getFileName());
        int line = frame.getLine();
        if (line > 0) {
            sb2.append(":");
            sb2.append(line);
            int column = frame.getColumn();
            if (column > 0) {
                sb2.append(":");
                sb2.append(column);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "file", "", "fileName", "method", "line", "", "column", "isCollapsed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getFile", "()Ljava/lang/String;", "getFileName", "getMethod", "getLine", "()I", "getColumn", "()Z", "toJSON", "Lorg/json/JSONObject;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStackTraceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceHelper.kt\ncom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    public static final class StackFrameImpl implements StackFrame {
        private final int column;

        @Nullable
        private final String file;

        @Nullable
        private final String fileName;
        private final boolean isCollapsed;
        private final int line;

        @NotNull
        private final String method;

        public StackFrameImpl(@Nullable String str, @Nullable String str2, @NotNull String method, int i10, int i11, boolean z10) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.file = str;
            this.fileName = str2;
            this.method = method;
            this.line = i10;
            this.column = i11;
            this.isCollapsed = z10;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getColumn() {
            return this.column;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        @Nullable
        public String getFile() {
            return this.file;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        @Nullable
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getLine() {
            return this.line;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        @NotNull
        public String getMethod() {
            return this.method;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        /* renamed from: isCollapsed, reason: from getter */
        public boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        @NotNull
        public JSONObject toJSON() {
            String file = getFile();
            if (file == null) {
                file = "";
            }
            return new JSONObject(MapsKt.mapOf(TuplesKt.to("file", file), TuplesKt.to("methodName", getMethod()), TuplesKt.to("lineNumber", Integer.valueOf(getLine())), TuplesKt.to("column", Integer.valueOf(getColumn())), TuplesKt.to(StackTraceHelper.COLLAPSE_KEY, Boolean.valueOf(getIsCollapsed()))));
        }

        public /* synthetic */ StackFrameImpl(String str, String str2, String str3, int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i12 & 2) != 0 ? str != null ? new File(str).getName() : null : str2, str3, i10, i11, (i12 & 32) != 0 ? false : z10);
        }
    }

    @NotNull
    public final StackFrame[] convertJsStackTrace(@Nullable JSONArray stack) {
        if (stack == null) {
            return new StackFrame[0];
        }
        int length = stack.length();
        try {
            StackFrame[] stackFrameArr = new StackFrame[length];
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = stack.getJSONObject(i10);
                String string = jSONObject.getString("methodName");
                String string2 = jSONObject.getString("file");
                int i11 = -1;
                int i12 = (!jSONObject.has("lineNumber") || jSONObject.isNull("lineNumber")) ? -1 : jSONObject.getInt("lineNumber");
                if (jSONObject.has("column") && !jSONObject.isNull("column")) {
                    i11 = jSONObject.getInt("column");
                }
                int i13 = i11;
                boolean z10 = jSONObject.has(COLLAPSE_KEY) && !jSONObject.isNull(COLLAPSE_KEY) && jSONObject.getBoolean(COLLAPSE_KEY);
                Intrinsics.checkNotNull(string);
                stackFrameArr[i10] = new StackFrameImpl(string2, null, string, i12, i13, z10, 2, null);
            }
            return stackFrameArr;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NotNull
    public final StackFrame[] convertJsStackTrace(@NotNull String stack) {
        List emptyList;
        StackFrameImpl stackFrameImpl;
        Intrinsics.checkNotNullParameter(stack, "stack");
        List<String> split = new Regex(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).split(stack, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        String[] strArr = (String[]) emptyList.toArray(new String[0]);
        int length = strArr.length;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i10 = 0; i10 < length; i10++) {
            Matcher matcher = STACK_FRAME_PATTERN1.matcher(strArr[i10]);
            Matcher matcher2 = STACK_FRAME_PATTERN2.matcher(strArr[i10]);
            if (matcher2.find()) {
                matcher = matcher2;
            } else if (!matcher.find()) {
                matcher = null;
            }
            if (matcher != null) {
                String group = matcher.group(2);
                String group2 = matcher.group(1);
                if (group2 == null) {
                    group2 = "(unknown)";
                }
                String str = group2;
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                if (group3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int parseInt = Integer.parseInt(group3);
                if (group4 != null) {
                    stackFrameImpl = new StackFrameImpl(group, null, str, parseInt, Integer.parseInt(group4), false, 34, null);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                stackFrameImpl = new StackFrameImpl(null, null, strArr[i10], -1, -1, false, 34, null);
            }
            stackFrameArr[i10] = stackFrameImpl;
        }
        return stackFrameArr;
    }
}
