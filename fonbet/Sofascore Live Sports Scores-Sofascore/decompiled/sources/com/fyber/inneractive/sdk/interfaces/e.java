package com.fyber.inneractive.sdk.interfaces;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface e {
    void destroy();

    void disableCloseButton();

    void dismissAd(boolean z);

    View getCloseButton();

    ViewGroup getLayout();

    boolean isCloseButtonDisplay();

    void secondEndCardWasDisplayed();

    void setActivityOrientation(boolean z, Orientation orientation);

    void showCloseButton(boolean z, int i, int i2);

    void showCloseCountdown();

    void updateCloseCountdown(int i);

    boolean wasDismissedByUser();
}
