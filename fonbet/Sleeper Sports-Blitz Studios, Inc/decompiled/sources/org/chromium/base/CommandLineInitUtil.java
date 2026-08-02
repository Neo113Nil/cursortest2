package org.chromium.base;

import android.content.Context;
import android.provider.Settings;
import java.io.File;
import java.util.function.Supplier;

/* loaded from: classes10.dex */
public final class CommandLineInitUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String COMMAND_LINE_FILE_PATH = "/data/local";
    private static final String COMMAND_LINE_FILE_PATH_DEBUG_APP = "/data/local/tmp";
    private static String sFilenameOverrideForTesting;

    private CommandLineInitUtil() {
    }

    public static void setFilenameOverrideForTesting(String value) {
        sFilenameOverrideForTesting = value;
    }

    public static void initCommandLine(String fileName, Supplier<Boolean> shouldUseDebugFlags) {
        String str = sFilenameOverrideForTesting;
        if (str != null) {
            fileName = str;
        }
        File file = new File(COMMAND_LINE_FILE_PATH_DEBUG_APP, fileName);
        if (!file.exists() || !shouldUseDebugCommandLine(shouldUseDebugFlags)) {
            file = new File(COMMAND_LINE_FILE_PATH, fileName);
        }
        CommandLine.initFromFile(file.getPath());
    }

    private static boolean shouldUseDebugCommandLine(Supplier<Boolean> shouldUseDebugFlags) {
        if (shouldUseDebugFlags != null && shouldUseDebugFlags.get().booleanValue()) {
            return true;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext.getPackageName().equals(getDebugApp(applicationContext)) || AndroidInfo.isDebugAndroid();
    }

    private static String getDebugApp(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            return Settings.Global.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }
}
