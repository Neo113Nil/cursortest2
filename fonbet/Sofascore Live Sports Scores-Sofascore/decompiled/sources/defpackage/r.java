package defpackage;

import android.app.Application;
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
public final class r extends hoi implements Function2 {
    public Object r;
    public obm s;
    public orm t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ obm w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        r rVar = new r(this.w, rq3Var);
        rVar.v = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r rVar = new r(this.w, (rq3) obj2);
        rVar.v = (ywl) obj;
        return rVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r3.C(r1, r12) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0139, code lost:
    
        if (r13.C(r1, r12) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        if (r13.C(r1, r12) == r0) goto L71;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ywl ywlVar;
        obm obmVar;
        orm ormVar;
        orm ormVar2;
        obm obmVar2;
        a aVar;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        obm obmVar3;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        if (i == 0) {
            y6a.M(obj);
            ywlVar = (ywl) this.v;
            obmVar = this.w;
            ormVar = obmVar.q;
            if (obmVar.G()) {
                urm urmVar = obmVar.r;
                if (urmVar != null) {
                    int currentItem = ormVar.e.getCurrentItem();
                    boolean z = ywlVar == ywl.c;
                    this.v = ywlVar;
                    this.r = ormVar;
                    this.s = obmVar;
                    this.t = ormVar;
                    this.u = 1;
                    if (urmVar.w(currentItem, z, this) != lu3Var) {
                        obmVar2 = obmVar;
                        ormVar2 = ormVar;
                        obmVar = obmVar2;
                    }
                    return lu3Var;
                }
                ormVar2 = ormVar;
            }
            return Unit.a;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                y6a.M(obj);
                return Unit.a;
            }
            if (i != 4) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obmVar3 = (obm) this.r;
            y6a.M(obj);
            int i2 = obm.D;
            ilm ilmVar = (ilm) obmVar3.getViewModel();
            ilmVar.T.k(Boolean.valueOf(ilmVar.S.getAndSet(false)));
            ilmVar.u(qvm.a);
            return Unit.a;
        }
        ormVar = this.t;
        obmVar2 = this.s;
        ormVar2 = (orm) this.r;
        ywlVar = (ywl) this.v;
        y6a.M(obj);
        obmVar = obmVar2;
        switch (ywlVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                obmVar.j(H.ASSETS_EXPIRY);
                break;
            case 5:
                urm urmVar2 = obmVar.r;
                if (urmVar2 != null) {
                    int currentItem2 = ormVar.e.getCurrentItem();
                    this.v = ormVar2;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = 2;
                    break;
                }
                break;
            case 6:
                urm urmVar3 = obmVar.r;
                if (urmVar3 != null) {
                    int currentItem3 = ormVar.e.getCurrentItem();
                    this.v = ormVar2;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = 3;
                    break;
                }
                break;
            case 7:
                int i3 = obm.D;
                ilm ilmVar2 = (ilm) obmVar.getViewModel();
                ilmVar2.getClass();
                n4m D = ilmVar2.D();
                if (((D != null ? D.b : null) instanceof gim.a) && (blazeGoogleCustomNativeAdModel = (aVar = ilmVar2.x0).b) != null) {
                    BlazeTrackingPixel a = aVar.a(BlazeTrackingPixel.PixelAdsEvents.AD_PAGE_COMPLETE);
                    if (a != null) {
                        aVar.e(a);
                    }
                    BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
                    if (googleCustomNativeAdsHandler$blazesdk_release != null) {
                        googleCustomNativeAdsHandler$blazesdk_release.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.AD_PAGE_COMPLETE, blazeGoogleCustomNativeAdModel);
                    }
                }
                Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                if (!(application$blazesdk_release != null ? f6a.f(application$blazesdk_release) : false)) {
                    ilmVar2.a0(cxl.NEXT);
                }
                break;
            case 8:
                Context context = obmVar.getContext();
                if (context != null) {
                    if (cnb.g(context)) {
                        ((ilm) obmVar.getViewModel()).T();
                    } else {
                        urm urmVar4 = obmVar.r;
                        if (urmVar4 != null) {
                            int currentItem4 = ormVar.e.getCurrentItem();
                            this.v = ormVar2;
                            this.r = obmVar;
                            this.s = null;
                            this.t = null;
                            this.u = 4;
                            break;
                        }
                        obmVar3 = obmVar;
                        int i22 = obm.D;
                        ilm ilmVar3 = (ilm) obmVar3.getViewModel();
                        ilmVar3.T.k(Boolean.valueOf(ilmVar3.S.getAndSet(false)));
                        ilmVar3.u(qvm.a);
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
