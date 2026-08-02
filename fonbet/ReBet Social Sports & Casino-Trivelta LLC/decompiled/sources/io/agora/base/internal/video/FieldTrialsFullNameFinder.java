package io.agora.base.internal.video;

import io.agora.base.internal.Logging;

/* loaded from: classes2.dex */
public class FieldTrialsFullNameFinder {
    private static final String TAG = "FieldTrialsFullNameFinder";
    private static FieldTrialsFullNameCallback fieldTrialsFullNameCallback;

    public interface FieldTrialsFullNameCallback {
        String onFinding(String str);
    }

    public static String findFieldTrialsFullName(String str) {
        FieldTrialsFullNameCallback fieldTrialsFullNameCallback2 = fieldTrialsFullNameCallback;
        if (fieldTrialsFullNameCallback2 != null) {
            return fieldTrialsFullNameCallback2.onFinding(str);
        }
        Logging.e(TAG, "fieldTrialsFullNameCallback is null");
        return "";
    }

    public static void setFieldTrialsFullNameCallback(FieldTrialsFullNameCallback fieldTrialsFullNameCallback2) {
        Logging.d(TAG, "Set FieldTrialsFullName callback");
        fieldTrialsFullNameCallback = fieldTrialsFullNameCallback2;
    }
}
