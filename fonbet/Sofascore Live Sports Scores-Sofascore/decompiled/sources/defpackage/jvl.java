package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jvl extends hoi implements Function1 {
    public sqm r;
    public BlazeMomentsAdsConfigType s;
    public int t;
    public final /* synthetic */ String u;
    public final /* synthetic */ sqm v;
    public final /* synthetic */ String w;
    public final /* synthetic */ BlazeMomentsAdsConfigType x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvl(String str, sqm sqmVar, String str2, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, rq3 rq3Var) {
        super(1, rq3Var);
        this.u = str;
        this.v = sqmVar;
        this.w = str2;
        this.x = blazeMomentsAdsConfigType;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new jvl(this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jvl) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        BlazeMomentsAdsConfigType blazeMomentsAdsConfigType;
        Object momentsAndSaveToCache$default;
        sqm sqmVar;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        if (i == 0) {
            y6a.M(obj);
            String str = this.u;
            if (str != null) {
                BlazeDataSourceType.Ids ids = new BlazeDataSourceType.Ids(a.c(str), null, null, 6, null);
                sqm sqmVar2 = this.v;
                sqmVar2.k0.getClass();
                List q = gum.q(str);
                boolean isEmpty = q.isEmpty();
                blazeMomentsAdsConfigType = this.x;
                if (isEmpty) {
                    gum gumVar = sqmVar2.k0;
                    String C = sqmVar2.C();
                    this.r = sqmVar2;
                    this.s = blazeMomentsAdsConfigType;
                    this.t = 1;
                    momentsAndSaveToCache$default = jrl.getMomentsAndSaveToCache$default(gumVar, ids, this.w, C, true, true, null, null, null, false, this, 480, null);
                    if (momentsAndSaveToCache$default == lu3Var) {
                        return lu3Var;
                    }
                    sqmVar = sqmVar2;
                } else {
                    sqm.c0(sqmVar2, q, blazeMomentsAdsConfigType);
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        BlazeMomentsAdsConfigType blazeMomentsAdsConfigType2 = this.s;
        sqmVar = this.r;
        y6a.M(obj);
        blazeMomentsAdsConfigType = blazeMomentsAdsConfigType2;
        momentsAndSaveToCache$default = obj;
        a9m a9mVar = (a9m) momentsAndSaveToCache$default;
        if (a9mVar instanceof qbm) {
            sqm.c0(sqmVar, (List) ((qbm) a9mVar).a, blazeMomentsAdsConfigType);
        }
        return Unit.a;
    }
}
