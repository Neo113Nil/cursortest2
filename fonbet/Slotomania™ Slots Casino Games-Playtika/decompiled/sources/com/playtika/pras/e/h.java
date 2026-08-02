package com.playtika.pras.e;

/* loaded from: classes4.dex */
public interface h {
    void clearTimer();

    String getInitData();

    String getOrientation();

    boolean isPackageInstalled(String str);

    void loadingCompleted();

    void onAfterExternalBrowserClosed();

    void onBeforeExternalBrowserOpened(String str);

    void onResult(String str);

    void openWebPage(String str);

    void setDoneButtonKeyboardMode(boolean z);

    void setOrientation(String str);

    void setResult(String str);

    void setScrollKeyboard(boolean z);
}
