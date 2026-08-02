package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j6g extends hoi implements Function2 {
    public String[] r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ String[] x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6g(boolean z, String[] strArr, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = z;
        this.x = strArr;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        j6g j6gVar = new j6g(this.w, this.x, rq3Var);
        j6gVar.v = obj;
        return j6gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j6g) create((mae) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (defpackage.v7a.n(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        if (defpackage.v7a.n(r6, r10, r9) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0064 -> B:6:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mae maeVar;
        mae maeVar2;
        int length;
        int i;
        String[] strArr;
        lu3 lu3Var = lu3.a;
        int i2 = this.u;
        if (i2 == 0) {
            y6a.M(obj);
            maeVar = (mae) this.v;
            if (this.w) {
                this.v = maeVar;
                this.u = 1;
            }
        } else if (i2 == 1) {
            maeVar = (mae) this.v;
            y6a.M(obj);
        } else {
            if (i2 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.t;
            i = this.s;
            strArr = this.r;
            maeVar2 = (mae) this.v;
            y6a.M(obj);
            i++;
            if (i < length) {
                return Unit.a;
            }
            String j = dmi.j('`', "DELETE FROM `", strArr[i]);
            this.v = maeVar2;
            this.r = strArr;
            this.s = i;
            this.t = length;
            this.u = 2;
        }
        String[] strArr2 = this.x;
        maeVar2 = maeVar;
        length = strArr2.length;
        i = 0;
        strArr = strArr2;
        if (i < length) {
        }
    }
}
