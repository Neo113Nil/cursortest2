package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vfm extends hoi implements Function1 {
    public w3m r;
    public BlazeVideosAdsConfigType s;
    public int t;
    public int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ w3m w;
    public final /* synthetic */ String x;
    public final /* synthetic */ BlazeVideosAdsConfigType y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfm(String str, w3m w3mVar, String str2, BlazeVideosAdsConfigType blazeVideosAdsConfigType, int i, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = str;
        this.w = w3mVar;
        this.x = str2;
        this.y = blazeVideosAdsConfigType;
        this.z = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new vfm(this.v, this.w, this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((vfm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i;
        Object videos$default;
        w3m w3mVar;
        BlazeVideosAdsConfigType blazeVideosAdsConfigType;
        lu3 lu3Var = lu3.a;
        int i2 = this.u;
        if (i2 == 0) {
            y6a.M(obj);
            String str = this.v;
            if (str != null) {
                BlazeDataSourceType.Ids ids = new BlazeDataSourceType.Ids(a.c(str), null, null, 6, null);
                w3m w3mVar2 = this.w;
                w3mVar2.k0.getClass();
                List l = qom.l(str);
                boolean isEmpty = l.isEmpty();
                BlazeVideosAdsConfigType blazeVideosAdsConfigType2 = this.y;
                i = this.z;
                if (isEmpty) {
                    qom qomVar = w3mVar2.k0;
                    String C = w3mVar2.C();
                    this.r = w3mVar2;
                    this.s = blazeVideosAdsConfigType2;
                    this.t = i;
                    this.u = 1;
                    videos$default = fsl.getVideos$default(qomVar, ids, this.x, C, true, true, null, null, null, this, 224, null);
                    if (videos$default == lu3Var) {
                        return lu3Var;
                    }
                    w3mVar = w3mVar2;
                    blazeVideosAdsConfigType = blazeVideosAdsConfigType2;
                } else {
                    w3mVar2.i0(l, blazeVideosAdsConfigType2, i);
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.t;
        blazeVideosAdsConfigType = this.s;
        w3mVar = this.r;
        y6a.M(obj);
        i = i3;
        videos$default = obj;
        a9m a9mVar = (a9m) videos$default;
        if (a9mVar instanceof qbm) {
            w3mVar.i0((List) ((qbm) a9mVar).a, blazeVideosAdsConfigType, i);
        }
        return Unit.a;
    }
}
