package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface L4 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        @Nullable
        ISDemandOnlyBannerLayout a(@Nullable Activity activity, @Nullable ISBannerSize iSBannerSize);

        void a(@Nullable Activity activity, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str);

        void e(@Nullable String str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface b {
        void a(@Nullable Activity activity, @Nullable String str);

        void a(@Nullable ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        void b(@Nullable Activity activity, @Nullable String str, @Nullable String str2);

        void c(@Nullable String str);

        boolean d(@Nullable String str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface c {
        void a(@Nullable Activity activity, @Nullable String str, @Nullable String str2);

        void a(@Nullable ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        void a(@Nullable String str);

        void b(@Nullable Activity activity, @Nullable String str);

        boolean h(@Nullable String str);
    }

    @Nullable
    String a(@NotNull Context context);
}
