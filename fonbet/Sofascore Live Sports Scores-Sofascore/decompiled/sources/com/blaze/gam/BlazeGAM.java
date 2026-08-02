package com.blaze.gam;

import android.content.Context;
import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.gam.banner.BlazeGAMBannerAdsDelegate;
import com.blaze.gam.banner.DefaultBlazeGAMBannerAdsHandler;
import com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDefaultConfig;
import com.blaze.gam.custom_native.BlazeGAMCustomNativeAdsDelegate;
import com.blaze.gam.custom_native.DefaultBlazeGoogleCustomNativeAdsHandler;
import defpackage.hgd;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u001c\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/blaze/gam/BlazeGAM;", "", "<init>", "()V", "isMobileAdsInitializeCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enableCustomNativeAds", "", "context", "Landroid/content/Context;", "defaultAdsConfig", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDefaultConfig;", "delegate", "Lcom/blaze/gam/custom_native/BlazeGAMCustomNativeAdsDelegate;", "disableCustomNativeAds", "enableBannerAds", "Lcom/blaze/gam/banner/BlazeGAMBannerAdsDelegate;", "setBlazeAdBannerHandler", "disableBannerAds", "initializeMobileAdsSdk", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeGAM {

    @NotNull
    public static final BlazeGAM INSTANCE = new BlazeGAM();

    @NotNull
    private static final AtomicBoolean isMobileAdsInitializeCalled = new AtomicBoolean(false);

    private BlazeGAM() {
    }

    public static /* synthetic */ void enableBannerAds$default(BlazeGAM blazeGAM, Context context, BlazeGAMBannerAdsDelegate blazeGAMBannerAdsDelegate, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeGAMBannerAdsDelegate = null;
        }
        blazeGAM.enableBannerAds(context, blazeGAMBannerAdsDelegate);
    }

    public static /* synthetic */ void enableCustomNativeAds$default(BlazeGAM blazeGAM, Context context, BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig, BlazeGAMCustomNativeAdsDelegate blazeGAMCustomNativeAdsDelegate, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeGAMCustomNativeAdsDefaultConfig = null;
        }
        if ((i & 4) != 0) {
            blazeGAMCustomNativeAdsDelegate = null;
        }
        blazeGAM.enableCustomNativeAds(context, blazeGAMCustomNativeAdsDefaultConfig, blazeGAMCustomNativeAdsDelegate);
    }

    private final void initializeMobileAdsSdk(Context context) {
        if (isMobileAdsInitializeCalled.getAndSet(true)) {
            return;
        }
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(hq4.c), null, null, new hgd(3, null, context), 3);
    }

    private final void setBlazeAdBannerHandler(BlazeGAMBannerAdsDelegate delegate) {
        BlazeSDK.INSTANCE.setGoogleBannerAdsHandler(new DefaultBlazeGAMBannerAdsHandler(delegate));
    }

    @Keep
    public final void disableBannerAds() {
        BlazeSDK.INSTANCE.setGoogleBannerAdsHandler(null);
    }

    @Keep
    public final void disableCustomNativeAds() {
        BlazeSDK.INSTANCE.setGoogleCustomNativeAdsHandler(null);
    }

    @Keep
    public final void enableBannerAds(@NotNull Context context, @Nullable BlazeGAMBannerAdsDelegate delegate) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        initializeMobileAdsSdk(applicationContext);
        setBlazeAdBannerHandler(delegate);
    }

    @Keep
    public final void enableCustomNativeAds(@NotNull Context context, @Nullable BlazeGAMCustomNativeAdsDefaultConfig defaultAdsConfig, @Nullable BlazeGAMCustomNativeAdsDelegate delegate) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        initializeMobileAdsSdk(applicationContext);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        BlazeSDK.INSTANCE.setGoogleCustomNativeAdsHandler(new DefaultBlazeGoogleCustomNativeAdsHandler(applicationContext2, defaultAdsConfig, delegate));
    }

    @Keep
    public final void enableCustomNativeAds(@NotNull Context context, @Nullable BlazeGAMCustomNativeAdsDefaultConfig blazeGAMCustomNativeAdsDefaultConfig) {
        context.getClass();
        enableCustomNativeAds$default(this, context, blazeGAMCustomNativeAdsDefaultConfig, null, 4, null);
    }

    @Keep
    public final void enableCustomNativeAds(@NotNull Context context) {
        context.getClass();
        enableCustomNativeAds$default(this, context, null, null, 6, null);
    }
}
