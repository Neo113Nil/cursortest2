package defpackage;

import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.ads.custom_native.models.b;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dyl extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ BlazeAdRequestData s;
    public final /* synthetic */ BlazeContentExtraInfo t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyl(BlazeAdRequestData blazeAdRequestData, BlazeContentExtraInfo blazeContentExtraInfo, int i, String str, boolean z, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = blazeAdRequestData;
        this.t = blazeContentExtraInfo;
        this.u = i;
        this.v = str;
        this.w = z;
        this.x = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new dyl(this.s, this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((dyl) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            BlazeContentExtraInfo blazeContentExtraInfo = this.t;
            BlazeAdRequestData blazeAdRequestData = this.s;
            blazeAdRequestData.setExtraInfo(blazeContentExtraInfo);
            pwl pwlVar = pwl.a;
            this.r = 1;
            obj = pwlVar.a(blazeAdRequestData, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = (BlazeGoogleCustomNativeAdModel) obj;
        if (blazeGoogleCustomNativeAdModel != null) {
            blazeGoogleCustomNativeAdModel.setAdIndex(new Integer(this.u));
        }
        if (blazeGoogleCustomNativeAdModel != null) {
            blazeGoogleCustomNativeAdModel.setAdInsertionLogicForAnalytics(this.v);
        }
        this.x.invoke(blazeGoogleCustomNativeAdModel != null ? b.a(blazeGoogleCustomNativeAdModel, this.w) : null);
        return Unit.a;
    }
}
