package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ow2 extends m2g implements Function2 {
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ long u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ e1d w;
    public final /* synthetic */ boh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow2(long j, Function0 function0, e1d e1dVar, boh bohVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = j;
        this.v = function0;
        this.w = e1dVar;
        this.x = bohVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ow2 ow2Var = new ow2(this.u, this.v, this.w, this.x, rq3Var);
        ow2Var.t = obj;
        return ow2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ow2) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        return lu3.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r13 == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r13 != r1) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0046 -> B:6:0x0049). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noi noiVar = (noi) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        e1d e1dVar = this.w;
        if (i == 0) {
            y6a.M(obj);
            this.t = noiVar;
            this.s = 1;
            obj = rti.b(noiVar, this, 3);
        } else if (i == 1) {
            y6a.M(obj);
            e1dVar.setValue(Boolean.TRUE);
            ((mze) obj).a();
            this.t = noiVar;
            this.s = 2;
            xf2 xf2Var = rti.a;
            obj = rti.i(noiVar, gze.b, this);
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            mze mzeVar = (mze) obj;
            e1dVar.setValue(Boolean.FALSE);
            if (mzeVar != null && !mzeVar.b()) {
                long v = yaa.v();
                boh bohVar = this.x;
                if (v - bohVar.h() >= this.u) {
                    bohVar.i(v);
                    this.v.invoke();
                }
                mzeVar.a();
            }
            this.t = noiVar;
            this.s = 1;
            obj = rti.b(noiVar, this, 3);
        }
    }
}
