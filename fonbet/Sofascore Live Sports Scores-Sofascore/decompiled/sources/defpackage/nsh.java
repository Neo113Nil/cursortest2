package defpackage;

import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nsh extends hoi implements Function2 {
    public final /* synthetic */ e1d A;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;
    public long w;
    public int x;
    public final /* synthetic */ q50 y;
    public final /* synthetic */ kth z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsh(q50 q50Var, kth kthVar, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = q50Var;
        this.z = kthVar;
        this.A = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new nsh(this.y, this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nsh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0124, code lost:
    
        if (r10.f(r19, r0) == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0147, code lost:
    
        if (r10.f(r19, r0) == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0150, code lost:
    
        if (r10.g(r19) == r6) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        List list;
        int i;
        Object a;
        int i2;
        int i3;
        int i4;
        float f;
        lu3 lu3Var = lu3.a;
        int i5 = this.x;
        kth kthVar = this.z;
        q50 q50Var = this.y;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = this.u;
                    i3 = this.t;
                    i2 = this.s;
                    long j2 = this.w;
                    f = this.v;
                    i4 = this.r;
                    y6a.M(obj);
                    j = j2;
                    i = i6;
                    a = obj;
                    if (((a80) a).b == u70.b) {
                        kthVar.k();
                        if (i == 0) {
                            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.r = i4;
                            this.v = f;
                            this.w = j;
                            this.s = i2;
                            this.t = i3;
                            this.u = i;
                            this.x = 3;
                        }
                    }
                    return Unit.a;
                }
                if (i5 != 3 && i5 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            y6a.M(obj);
            return Unit.a;
        }
        y6a.M(obj);
        int i7 = SofaSeasonActivity.L;
        e1d e1dVar = this.A;
        fm8 b = ((hth) e1dVar.getValue()).b();
        if (((hth) e1dVar.getValue()).e || b == null) {
            this.x = 1;
        } else {
            int a2 = b.a();
            float floatValue = 1.0f - ((Number) q50Var.d()).floatValue();
            j = (long) (a2 * floatValue);
            int i8 = ((hth) e1dVar.getValue()).b == b.i(((hth) e1dVar.getValue()).a) ? 1 : 0;
            tfi tfiVar = (tfi) CollectionsKt.a0(((hth) e1dVar.getValue()).b, ((hth) e1dVar.getValue()).a);
            if (tfiVar == null || (list = tfiVar.e()) == null) {
                list = km5.a;
            }
            int i9 = ((hth) e1dVar.getValue()).c == b.i(list) ? 1 : 0;
            int i10 = (i8 == 0 || i9 == 0) ? 0 : 1;
            if (j <= 0) {
                int i11 = i10;
                int i12 = i8;
                kthVar.k();
                if (i11 == 0) {
                    Float f3 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.r = a2;
                    this.v = floatValue;
                    this.w = j;
                    this.s = i12;
                    this.t = i9;
                    this.u = i11;
                    this.x = 4;
                }
                return Unit.a;
            }
            Float f4 = new Float(1.0f);
            i4k h0 = s02.h0((int) j, 0, jg5.d, 2);
            this.r = a2;
            this.v = floatValue;
            this.w = j;
            this.s = i8;
            this.t = i9;
            this.u = i10;
            this.x = 2;
            int i13 = i8;
            i = i10;
            a = q50.a(this.y, f4, h0, null, this, 12);
            if (a != lu3Var) {
                i2 = i13;
                i3 = i9;
                i4 = a2;
                f = floatValue;
                if (((a80) a).b == u70.b) {
                }
                return Unit.a;
            }
        }
        return lu3Var;
    }
}
