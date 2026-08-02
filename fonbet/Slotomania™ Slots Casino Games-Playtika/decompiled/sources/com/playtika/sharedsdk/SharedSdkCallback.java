package com.playtika.sharedsdk;

/* loaded from: classes5.dex */
public interface SharedSdkCallback {
    String GetKeyValueFromAccountStorage(String str, String str2);

    String RetrieveLastSentryAnrEvent();

    void SetKeyValueToAccountStorage(String str, String str2);

    void SetNotificationEnabledMode(boolean z);

    void ShowAppExitDialog();

    void Vibrate(long[] jArr);

    void allowSleep();

    void closeWebView();

    long getFreeMemoryMb();

    String getProxyInfo();

    long getTotalMemoryMb();

    void hideInput();

    void keepAwake();

    void onNativeAppReloaded();

    void openUrl(String str);

    void openWebView(String str, String str2);

    void postMessage(String str);

    void postMessageToWebView(String str);

    void reload();

    void requestDebugConfig(String str);

    void setWebViewVisibility(boolean z);

    void showAlert(String str);

    void showInput(int i);

    default void Vibrate(long[] jArr, HapticDescriptor hapticDescriptor) {
        Vibrate(jArr);
    }
}
