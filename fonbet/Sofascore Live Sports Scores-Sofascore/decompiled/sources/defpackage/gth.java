package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gth extends m2g implements Function2 {
    public mze s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ hsk w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Function0 y;
    public final /* synthetic */ Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gth(Function1 function1, hsk hskVar, boolean z, Function0 function0, Function0 function02, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = function1;
        this.w = hskVar;
        this.x = z;
        this.y = function0;
        this.z = function02;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        gth gthVar = new gth(this.v, this.w, this.x, this.y, this.z, rq3Var);
        gthVar.u = obj;
        return gthVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((gth) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        return lu3.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r12 == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r12 != r1) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004a -> B:6:0x004d). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mze mzeVar;
        noi noiVar = (noi) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        Function1 function1 = this.v;
        if (i == 0) {
            y6a.M(obj);
            this.u = noiVar;
            this.s = null;
            this.t = 1;
            obj = rti.b(noiVar, this, 3);
        } else if (i == 1) {
            y6a.M(obj);
            mzeVar = (mze) obj;
            function1.invoke(Boolean.TRUE);
            this.u = noiVar;
            this.s = mzeVar;
            this.t = 2;
            xf2 xf2Var = rti.a;
            obj = rti.i(noiVar, gze.b, this);
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mzeVar = this.s;
            y6a.M(obj);
            mze mzeVar2 = (mze) obj;
            function1.invoke(Boolean.FALSE);
            if (mzeVar2 != null && mzeVar2.b - mzeVar.b < this.w.b()) {
                float intBitsToFloat = Float.intBitsToFloat((int) (mzeVar2.c >> 32));
                float f = ((int) (noiVar.f.x >> 32)) / 2;
                Function0 function0 = this.z;
                Function0 function02 = this.y;
                boolean z = this.x;
                if (intBitsToFloat >= f) {
                    if (z) {
                        function0.invoke();
                    } else {
                        function02.invoke();
                    }
                } else if (z) {
                    function02.invoke();
                } else {
                    function0.invoke();
                }
            }
            this.u = noiVar;
            this.s = null;
            this.t = 1;
            obj = rti.b(noiVar, this, 3);
        }
    }
}
