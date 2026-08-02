package defpackage;

import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.custom_native.a;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.ads.custom_native.models.BlazeTrackingPixel;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsLoopBehavior;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.gim;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pyl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ syl b;

    public /* synthetic */ pyl(syl sylVar, int i) {
        this.a = i;
        this.b = sylVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a aVar;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        int i = this.a;
        syl sylVar = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                int i2 = syl.C;
                sqm sqmVar = (sqm) sylVar.getViewModel();
                sqmVar.y.k(null);
                sqmVar.k(a1n.a, false);
                return Unit.a;
            case 1:
                String str = (String) obj;
                int i3 = syl.C;
                if (str != null) {
                    n1n n1nVar = n1n.a;
                    syl sylVar2 = this.b;
                    sylVar2.e(n1nVar, false);
                    ful.invokeShareChooser$default(sylVar2, str, null, tub.h(new Pair("momentId", String.valueOf(sylVar2.p.h)), new Pair("link text", str)), 2, null);
                }
                return Unit.a;
            case 2:
                fqm fqmVar = (fqm) obj;
                int i4 = syl.C;
                fqmVar.getClass();
                sylVar.o(new nka(sylVar, fqmVar, null));
                return Unit.a;
            case 3:
                htl htlVar = (htl) obj;
                int i5 = syl.C;
                int i6 = htlVar == null ? -1 : rqm.b[htlVar.ordinal()];
                if (i6 != -1) {
                    if (i6 == 1) {
                        sqm sqmVar2 = (sqm) sylVar.getViewModel();
                        sqmVar2.getClass();
                        try {
                            sqmVar2.i0();
                            n4m D = sqmVar2.D();
                            if (((D != null ? D.b : null) instanceof gim.a) && sqmVar2.q0 == 0 && (blazeGoogleCustomNativeAdModel = (aVar = sqmVar2.s0).b) != null) {
                                BlazeTrackingPixel a = aVar.a(BlazeTrackingPixel.PixelAdsEvents.AD_PAGE_COMPLETE);
                                if (a != null) {
                                    aVar.e(a);
                                }
                                BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
                                if (googleCustomNativeAdsHandler$blazesdk_release != null) {
                                    googleCustomNativeAdsHandler$blazesdk_release.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.AD_PAGE_COMPLETE, blazeGoogleCustomNativeAdModel);
                                }
                            }
                            sqmVar2.q0++;
                            Integer t = tz9.t(sqmVar2.t, sqmVar2.D());
                            if (t != null && t.intValue() < b.i(sqmVar2.t)) {
                                com.blaze.blazesdk.features.moments.models.ui.a aVar2 = sqmVar2.y0;
                                if (aVar2 == null) {
                                    aVar2 = gvl.a;
                                }
                                int i7 = sqmVar2.q0;
                                BlazeMomentsLoopBehavior blazeMomentsLoopBehavior = aVar2.a;
                                if (!(blazeMomentsLoopBehavior instanceof BlazeMomentsLoopBehavior.InfiniteLoop)) {
                                    if (!(blazeMomentsLoopBehavior instanceof BlazeMomentsLoopBehavior.LoopAndAdvance)) {
                                        throw new ndd();
                                    }
                                    if (i7 >= ((BlazeMomentsLoopBehavior.LoopAndAdvance) blazeMomentsLoopBehavior).get_numberOfPlays()) {
                                        sqmVar2.z0.b(Unit.a);
                                    }
                                }
                            }
                            ysm.h(sqmVar2);
                        } catch (Throwable th) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        }
                    } else if (i6 != 2 && i6 != 3 && i6 != 4) {
                        zzl.b();
                        return null;
                    }
                }
                return Unit.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i8 = syl.C;
                sylVar.o(new xca(sylVar, booleanValue, null));
                return Unit.a;
        }
    }
}
