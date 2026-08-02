package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hu8 extends hoi implements Function2 {
    public int r;

    public hu8(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new hu8(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hu8((rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r6.a(r1, false, r5) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        lu3 lu3Var = lu3.a;
        int i2 = this.r;
        if (i2 == 0) {
            y6a.M(obj);
            m4m m4mVar = ljd.c;
            if (m4mVar == null) {
                i = 0;
                if (i >= ljd.d && i > 0) {
                    ljd ljdVar = ljd.a;
                    int i3 = ljd.e;
                    this.r = 2;
                }
                return Unit.a;
            }
            this.r = 1;
            obj = m4mVar.b(this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        i = ((Number) obj).intValue();
        if (i >= ljd.d) {
            ljd ljdVar2 = ljd.a;
            int i32 = ljd.e;
            this.r = 2;
        }
        return Unit.a;
    }
}
