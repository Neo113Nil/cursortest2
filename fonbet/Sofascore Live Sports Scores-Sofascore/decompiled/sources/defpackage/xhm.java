package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xhm extends hoi implements Function1 {
    public final /* synthetic */ w3m r;
    public final /* synthetic */ BlazeVideosAdsConfigType s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhm(w3m w3mVar, BlazeVideosAdsConfigType blazeVideosAdsConfigType, int i, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = w3mVar;
        this.s = blazeVideosAdsConfigType;
        this.t = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new xhm(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((xhm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        w3m w3mVar = this.r;
        qom qomVar = w3mVar.k0;
        String H = w3mVar.H();
        qomVar.getClass();
        ArrayList U0 = CollectionsKt.U0(qom.l(H));
        if (w3mVar.n0 != null) {
            Iterator it = U0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.c(((VideoModel) it.next()).id, w3mVar.n0)) {
                    break;
                }
                i++;
            }
            w3mVar.m0 = i;
        }
        w3mVar.i0(U0, this.s, this.t);
        return Unit.a;
    }
}
