package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface NativeAdViewBinderInterface {
    void setAdvertiserView(@Nullable View view);

    void setBodyView(@Nullable View view);

    void setCallToActionView(@Nullable View view);

    void setIconView(@Nullable View view);

    void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView);

    void setTitleView(@Nullable View view);
}
