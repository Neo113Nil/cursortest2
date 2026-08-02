package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class or7 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b98 b;
    public final /* synthetic */ rr7 c;

    public /* synthetic */ or7(b98 b98Var, rr7 rr7Var, int i) {
        this.a = i;
        this.b = b98Var;
        this.c = rr7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r3.emit(r12, r0) != r14) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r12 == r14) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (r3.emit(r12, r0) != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        if (r12 == r14) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        nr7 nr7Var;
        int i;
        qr7 qr7Var;
        int i2;
        int i3 = this.a;
        rr7 rr7Var = this.c;
        b98 b98Var = this.b;
        int i4 = 0;
        switch (i3) {
            case 0:
                if (rq3Var instanceof nr7) {
                    nr7Var = (nr7) rq3Var;
                    int i5 = nr7Var.s;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        nr7Var.s = i5 - Integer.MIN_VALUE;
                        Object obj2 = nr7Var.r;
                        lu3 lu3Var = lu3.a;
                        i = nr7Var.s;
                        if (i != 0) {
                            y6a.M(obj2);
                            nr7Var.t = b98Var;
                            nr7Var.u = 0;
                            nr7Var.s = 1;
                            obj2 = rr7Var.n((List) obj, null, nr7Var);
                            break;
                        } else if (i == 1) {
                            i4 = nr7Var.u;
                            b98Var = nr7Var.t;
                            y6a.M(obj2);
                        } else if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj2);
                            break;
                        }
                        List L0 = CollectionsKt.L0((Iterable) obj2, 10);
                        nr7Var.t = null;
                        nr7Var.u = i4;
                        nr7Var.s = 2;
                        break;
                    }
                }
                nr7Var = new nr7(this, rq3Var);
                Object obj22 = nr7Var.r;
                lu3 lu3Var2 = lu3.a;
                i = nr7Var.s;
                if (i != 0) {
                }
                List L02 = CollectionsKt.L0((Iterable) obj22, 10);
                nr7Var.t = null;
                nr7Var.u = i4;
                nr7Var.s = 2;
            default:
                if (rq3Var instanceof qr7) {
                    qr7Var = (qr7) rq3Var;
                    int i6 = qr7Var.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        qr7Var.s = i6 - Integer.MIN_VALUE;
                        Object obj3 = qr7Var.r;
                        Object obj4 = lu3.a;
                        i2 = qr7Var.s;
                        if (i2 != 0) {
                            y6a.M(obj3);
                            qr7Var.t = b98Var;
                            qr7Var.u = 0;
                            qr7Var.s = 1;
                            obj3 = rr7Var.o((List) obj, null, qr7Var);
                            break;
                        } else if (i2 == 1) {
                            i4 = qr7Var.u;
                            b98Var = qr7Var.t;
                            y6a.M(obj3);
                        } else if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj3);
                            break;
                        }
                        List L03 = CollectionsKt.L0((Iterable) obj3, 10);
                        qr7Var.t = null;
                        qr7Var.u = i4;
                        qr7Var.s = 2;
                        break;
                    }
                }
                qr7Var = new qr7(this, rq3Var);
                Object obj32 = qr7Var.r;
                Object obj42 = lu3.a;
                i2 = qr7Var.s;
                if (i2 != 0) {
                }
                List L032 = CollectionsKt.L0((Iterable) obj32, 10);
                qr7Var.t = null;
                qr7Var.u = i4;
                qr7Var.s = 2;
        }
        return Unit.a;
    }
}
