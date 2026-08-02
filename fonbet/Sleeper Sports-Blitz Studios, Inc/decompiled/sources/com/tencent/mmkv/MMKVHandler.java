package com.tencent.mmkv;

/* loaded from: classes8.dex */
public interface MMKVHandler {
    default long getNativeLogHandler() {
        return 0L;
    }

    void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i, String str2, String str3);

    default void onContentChangedByOuterProcess(String str) {
    }

    MMKVRecoverStrategic onMMKVCRCCheckFail(String str);

    default void onMMKVContentLoadSuccessfully(String str) {
    }

    MMKVRecoverStrategic onMMKVFileLengthError(String str);

    default boolean wantContentChangeNotification() {
        return false;
    }

    boolean wantLogRedirecting();
}
