package com.sleeperbot.modules;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.microsoft.codepush.react.CodePushConstants;
import io.sentry.protocol.Request;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class EnvironmentResolver extends ReactContextBaseJavaModule {
    private static final String DEV_ENVIRONMENT_KEY = "dev_environment";
    private static final String MODULE_NAME = "EnvironmentResolver";

    public EnvironmentResolver(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void resolveDevEnvironment(Promise promise) {
        try {
            promise.resolve(resolve(getReactApplicationContext()));
        } catch (Exception e) {
            promise.reject("ERR_ENV_RESOLVE_FAILED", e.getMessage());
        }
    }

    public static String resolve(Context context) {
        String stringSync = PrefsManager.getStringSync(context, DEV_ENVIRONMENT_KEY);
        if (stringSync != null && !stringSync.isEmpty()) {
            return stringSync;
        }
        String codepushEnvOverride = codepushEnvOverride(context);
        return (codepushEnvOverride == null || codepushEnvOverride.isEmpty()) ? builtInEnv(context) : codepushEnvOverride;
    }

    private static String builtInEnv(Context context) {
        try {
            InputStream open = context.getAssets().open("env.json");
            try {
                String optString = new JSONObject(readStreamToString(open)).optString(DEV_ENVIRONMENT_KEY, "");
                if (optString.isEmpty()) {
                    optString = null;
                }
                if (open != null) {
                    open.close();
                }
                return optString;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static String codepushEnvOverride(Context context) {
        String optString;
        try {
            File file = new File(context.getFilesDir(), "CodePush/codepush.json");
            if (file.exists() && (optString = new JSONObject(readFileToString(file)).optString(CodePushConstants.CURRENT_PACKAGE_KEY, null)) != null && !optString.isEmpty()) {
                File file2 = new File(context.getFilesDir(), "CodePush/" + optString + "/codepush_env.json");
                if (file2.exists()) {
                    return new JSONObject(readFileToString(file2)).optString(Request.JsonKeys.ENV, null);
                }
                return null;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String readStreamToString(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static String readFileToString(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
