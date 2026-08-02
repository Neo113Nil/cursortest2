package com.moloco.sdk.publisher;

import android.widget.FrameLayout;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ d(FrameLayout frameLayout, int i) {
        this.a = i;
        this.b = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit MolocoCreateMREC$lambda$4;
        Unit MolocoCreateBanner$lambda$2;
        Unit MolocoCreateBannerTablet$lambda$3;
        Unit MolocoCreateMolocoBanner$lambda$5;
        Unit MolocoCreateMolocoBanner$lambda$6;
        Unit MolocoCreateMolocoBanner$lambda$7;
        int i = this.a;
        Banner banner = (Banner) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        FrameLayout frameLayout = this.b;
        switch (i) {
            case 0:
                MolocoCreateMREC$lambda$4 = MolocoSamplesKt.MolocoCreateMREC$lambda$4(frameLayout, banner, adCreateError);
                return MolocoCreateMREC$lambda$4;
            case 1:
                MolocoCreateBanner$lambda$2 = MolocoSamplesKt.MolocoCreateBanner$lambda$2(frameLayout, banner, adCreateError);
                return MolocoCreateBanner$lambda$2;
            case 2:
                MolocoCreateBannerTablet$lambda$3 = MolocoSamplesKt.MolocoCreateBannerTablet$lambda$3(frameLayout, banner, adCreateError);
                return MolocoCreateBannerTablet$lambda$3;
            case 3:
                MolocoCreateMolocoBanner$lambda$5 = MolocoSamplesKt.MolocoCreateMolocoBanner$lambda$5(frameLayout, banner, adCreateError);
                return MolocoCreateMolocoBanner$lambda$5;
            case 4:
                MolocoCreateMolocoBanner$lambda$6 = MolocoSamplesKt.MolocoCreateMolocoBanner$lambda$6(frameLayout, banner, adCreateError);
                return MolocoCreateMolocoBanner$lambda$6;
            default:
                MolocoCreateMolocoBanner$lambda$7 = MolocoSamplesKt.MolocoCreateMolocoBanner$lambda$7(frameLayout, banner, adCreateError);
                return MolocoCreateMolocoBanner$lambda$7;
        }
    }
}
