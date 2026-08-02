package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tfd extends hoi implements Function2 {
    public int r;
    public int s;
    public int t;
    public int u;
    public q50 v;
    public int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Function0 y;
    public final /* synthetic */ q50 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfd(boolean z, Function0 function0, q50 q50Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = z;
        this.y = function0;
        this.z = q50Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new tfd(this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tfd) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
    
        if (defpackage.n4o.y(100, r17) != r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (defpackage.n4o.y(700, r17) == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00d1 -> B:8:0x0020). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q50 q50Var;
        int i;
        int i2;
        int i3;
        int i4;
        q50 q50Var2;
        int i5;
        int i6;
        int i7;
        q50 q50Var3;
        int i8;
        Float f;
        i4k h0;
        q50 q50Var4;
        lu3 lu3Var = lu3.a;
        int i9 = this.w;
        if (i9 == 0) {
            y6a.M(obj);
            if (this.x) {
                this.w = 1;
            }
            return Unit.a;
        }
        if (i9 == 1) {
            y6a.M(obj);
        } else {
            if (i9 == 2) {
                int i10 = this.u;
                int i11 = this.t;
                int i12 = this.s;
                int i13 = this.r;
                q50Var3 = this.v;
                y6a.M(obj);
                i4 = i10;
                i3 = i11;
                i7 = i12;
                i8 = i13;
                f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                h0 = s02.h0(300, 0, jg5.c, 2);
                this.v = q50Var3;
                this.r = i8;
                this.s = i7;
                this.t = i3;
                this.u = i4;
                this.w = 3;
                int i14 = i8;
                q50Var4 = q50Var3;
                if (q50.a(q50Var4, f, h0, null, this, 12) != lu3Var) {
                }
                return lu3Var;
            }
            if (i9 != 3) {
                if (i9 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i6 = this.s;
                i5 = this.r;
                q50Var2 = this.v;
                y6a.M(obj);
                i2 = i5;
                i = i6 + 1;
                q50Var = q50Var2;
                if (i < i2) {
                    this.y.invoke();
                    return Unit.a;
                }
                Float f2 = new Float(0.8f);
                i4k h02 = s02.h0(300, 0, jg5.b, 2);
                this.v = q50Var;
                this.r = i2;
                this.s = i;
                this.t = i;
                this.u = 0;
                this.w = 2;
                if (q50.a(q50Var, f2, h02, null, this, 12) != lu3Var) {
                    q50Var3 = q50Var;
                    i7 = i;
                    i8 = i2;
                    i4 = 0;
                    i3 = i7;
                    f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h0 = s02.h0(300, 0, jg5.c, 2);
                    this.v = q50Var3;
                    this.r = i8;
                    this.s = i7;
                    this.t = i3;
                    this.u = i4;
                    this.w = 3;
                    int i142 = i8;
                    q50Var4 = q50Var3;
                    if (q50.a(q50Var4, f, h0, null, this, 12) != lu3Var) {
                        q50Var2 = q50Var4;
                        i6 = i7;
                        i5 = i142;
                        this.v = q50Var2;
                        this.r = i5;
                        this.s = i6;
                        this.t = i3;
                        this.u = i4;
                        this.w = 4;
                    }
                }
                return lu3Var;
            }
            int i15 = this.u;
            int i16 = this.t;
            int i17 = this.s;
            int i18 = this.r;
            q50 q50Var5 = this.v;
            y6a.M(obj);
            i4 = i15;
            i3 = i16;
            i6 = i17;
            i5 = i18;
            q50Var2 = q50Var5;
            this.v = q50Var2;
            this.r = i5;
            this.s = i6;
            this.t = i3;
            this.u = i4;
            this.w = 4;
        }
        q50Var = this.z;
        i = 0;
        i2 = 2;
        if (i < i2) {
        }
    }
}
