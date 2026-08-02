package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.AdClosedListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes2.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i);

    void setIconSizeDp(int i);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z);
}
