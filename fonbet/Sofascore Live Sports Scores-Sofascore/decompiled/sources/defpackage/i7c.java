package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i7c extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ m7c t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7c(m7c m7cVar, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = m7cVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        m7c m7cVar = this.t;
        switch (i) {
            case 0:
                return new i7c(m7cVar, i2, rq3Var, 0);
            case 1:
                return new i7c(m7cVar, i2, rq3Var, 1);
            case 2:
                return new i7c(m7cVar, i2, rq3Var, 2);
            default:
                return new i7c(m7cVar, i2, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((i7c) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        m7c m7cVar = this.t;
        int i3 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = m7cVar.a;
                this.s = 1;
                Object addMediaPostShare = networkCoroutineAPI.addMediaPostShare(i2, this);
                return addMediaPostShare == lu3Var ? lu3Var : addMediaPostShare;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = m7cVar.a;
                this.s = 1;
                Object mediaPost = networkCoroutineAPI2.mediaPost(i2, this);
                return mediaPost == lu3Var2 ? lu3Var2 : mediaPost;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = m7cVar.a;
                this.s = 1;
                Object mediaPostReactions = networkCoroutineAPI3.mediaPostReactions(i2, this);
                return mediaPostReactions == lu3Var3 ? lu3Var3 : mediaPostReactions;
            default:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                x8c x8cVar = m7cVar.b;
                this.s = 1;
                Object U = gz8.U(this, x8cVar.a, true, false, new bvb(i2, x8cVar, i3));
                return U == lu3Var4 ? lu3Var4 : U;
        }
    }
}
