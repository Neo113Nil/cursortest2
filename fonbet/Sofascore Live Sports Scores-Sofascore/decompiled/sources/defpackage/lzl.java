package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lzl extends hoi implements Function1 {
    public final /* synthetic */ sqm r;
    public final /* synthetic */ BlazeMomentsAdsConfigType s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzl(sqm sqmVar, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = sqmVar;
        this.s = blazeMomentsAdsConfigType;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new lzl(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new lzl(this.r, this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        sqm sqmVar = this.r;
        gum gumVar = sqmVar.k0;
        String H = sqmVar.H();
        gumVar.getClass();
        ArrayList U0 = CollectionsKt.U0(gum.q(H));
        if (sqmVar.n0 != null) {
            Iterator it = U0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.c(((MomentModel) it.next()).id, sqmVar.n0)) {
                    break;
                }
                i++;
            }
            sqmVar.m0 = i;
        }
        sqm.c0(sqmVar, U0, this.s);
        return Unit.a;
    }
}
