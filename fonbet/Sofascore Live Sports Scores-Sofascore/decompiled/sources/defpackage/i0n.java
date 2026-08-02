package defpackage;

import android.content.Context;
import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.custom_native.a;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.ads.custom_native.models.BlazeTrackingPixel;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i0n extends hoi implements Function2 {
    public Object r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ syl u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0n(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        i0n i0nVar = new i0n(this.u, rq3Var);
        i0nVar.t = obj;
        return i0nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i0n i0nVar = new i0n(this.u, (rq3) obj2);
        i0nVar.t = (ywl) obj;
        return i0nVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r1.A(r5, r12) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (r1.A(r2, r12) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r1.A(r2, r12) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006a, code lost:
    
        if (r9.v(r10, r11, r12) == r0) goto L48;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ywl ywlVar;
        a aVar;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        syl sylVar = this.u;
        if (i == 0) {
            y6a.M(obj);
            ywlVar = (ywl) this.t;
            udm udmVar = sylVar.q;
            if (sylVar.H() && (r9 = sylVar.t) != null) {
                int currentItem = udmVar.j.getCurrentItem();
                boolean z = ywlVar == ywl.c;
                this.t = ywlVar;
                this.r = udmVar;
                this.s = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (i != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sylVar = (syl) this.r;
                y6a.M(obj);
                int i2 = syl.C;
                sqm sqmVar = (sqm) sylVar.getViewModel();
                sqmVar.T.k(Boolean.valueOf(sqmVar.S.getAndSet(false)));
                sqmVar.u(qvm.a);
                return Unit.a;
            }
            ywlVar = (ywl) this.t;
            y6a.M(obj);
        }
        udm udmVar2 = sylVar.q;
        switch (ywlVar.ordinal()) {
            case 0:
            case 1:
            case 7:
                break;
            case 2:
                sylVar.p();
                break;
            case 3:
                sqm sqmVar2 = (sqm) sylVar.getViewModel();
                sqmVar2.getClass();
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
                break;
            case 4:
                sylVar.j(H.ASSETS_EXPIRY);
                break;
            case 5:
                mpm mpmVar = sylVar.t;
                if (mpmVar != null) {
                    int currentItem2 = udmVar2.j.getCurrentItem();
                    this.t = udmVar2;
                    this.r = null;
                    this.s = 2;
                    break;
                }
                break;
            case 6:
                mpm mpmVar2 = sylVar.t;
                if (mpmVar2 != null) {
                    int currentItem3 = udmVar2.j.getCurrentItem();
                    this.t = udmVar2;
                    this.r = null;
                    this.s = 3;
                    break;
                }
                break;
            case 8:
                Context context = sylVar.getContext();
                if (context != null) {
                    if (cnb.g(context)) {
                        ((sqm) sylVar.getViewModel()).T();
                    } else {
                        mpm mpmVar3 = sylVar.t;
                        if (mpmVar3 != null) {
                            int currentItem4 = udmVar2.j.getCurrentItem();
                            this.t = udmVar2;
                            this.r = sylVar;
                            this.s = 4;
                            break;
                        }
                        int i22 = syl.C;
                        sqm sqmVar3 = (sqm) sylVar.getViewModel();
                        sqmVar3.T.k(Boolean.valueOf(sqmVar3.S.getAndSet(false)));
                        sqmVar3.u(qvm.a);
                    }
                }
                break;
            default:
                zzl.b();
                break;
        }
        return null;
    }
}
