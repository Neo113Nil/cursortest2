package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qp1 extends m2g implements Function2 {
    public final /* synthetic */ int s;
    public int t;
    public /* synthetic */ Object u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp1(b10 b10Var, jwc jwcVar, b9j b9jVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = 3;
        this.v = b10Var;
        this.w = jwcVar;
        this.x = b9jVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.s;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                qp1 qp1Var = new qp1((ku3) this.w, (ykj) obj2, rq3Var, 0);
                qp1Var.u = obj;
                return qp1Var;
            case 1:
                qp1 qp1Var2 = new qp1((a6e) obj2, rq3Var, 1);
                qp1Var2.u = obj;
                return qp1Var2;
            case 2:
                qp1 qp1Var3 = new qp1((fjg) this.w, (mo1) obj2, rq3Var, 2);
                qp1Var3.u = obj;
                return qp1Var3;
            case 3:
                qp1 qp1Var4 = new qp1((b10) this.v, (jwc) this.w, (b9j) obj2, rq3Var);
                qp1Var4.u = obj;
                return qp1Var4;
            default:
                qp1 qp1Var5 = new qp1((nji) obj2, rq3Var, 4);
                qp1Var5.u = obj;
                return qp1Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        noi noiVar = (noi) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.s) {
            case 0:
                ((qp1) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return ((qp1) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0513  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x00cf -> B:30:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x03da -> B:193:0x03de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x046d -> B:224:0x0471). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0236 -> B:9:0x023a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x04e3 -> B:245:0x04e7). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp1(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.s = i;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp1(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.s = i;
        this.w = obj;
        this.x = obj2;
    }
}
