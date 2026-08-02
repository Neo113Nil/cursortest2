package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mw2 extends m2g implements Function2 {
    public final /* synthetic */ int s;
    public int t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw2(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.s = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.s) {
            case 0:
                mw2 mw2Var = new mw2(2, rq3Var, 0);
                mw2Var.u = obj;
                return mw2Var;
            default:
                mw2 mw2Var2 = new mw2(2, rq3Var, 1);
                mw2Var2.u = obj;
                return mw2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        noi noiVar = (noi) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.s) {
            case 0:
                ((mw2) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((mw2) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[LOOP:0: B:21:0x005c->B:23:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0050 -> B:18:0x0054). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.s
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L2f;
                default: goto L9;
            }
        L9:
            lu3 r0 = defpackage.lu3.a
            int r4 = r6.t
            if (r4 == 0) goto L19
            if (r4 != r3) goto L15
            defpackage.y6a.M(r7)
            goto L2c
        L15:
            defpackage.a70.r(r2)
            goto L2e
        L19:
            defpackage.y6a.M(r7)
            java.lang.Object r7 = r6.u
            noi r7 = (defpackage.noi) r7
            r6.t = r3
            gze r1 = defpackage.gze.c
            java.lang.Object r6 = defpackage.oyn.r(r7, r1, r6)
            if (r6 != r0) goto L2c
            r1 = r0
            goto L2e
        L2c:
            kotlin.Unit r1 = kotlin.Unit.a
        L2e:
            return r1
        L2f:
            java.lang.Object r0 = r6.u
            noi r0 = (defpackage.noi) r0
            lu3 r4 = defpackage.lu3.a
            int r5 = r6.t
            if (r5 == 0) goto L43
            if (r5 != r3) goto L3f
            defpackage.y6a.M(r7)
            goto L54
        L3f:
            defpackage.a70.r(r2)
            goto L53
        L43:
            defpackage.y6a.M(r7)
        L46:
            gze r7 = defpackage.gze.a
            r6.u = r0
            r6.t = r3
            java.lang.Object r7 = r0.b(r7, r6)
            if (r7 != r4) goto L54
            r1 = r4
        L53:
            return r1
        L54:
            fze r7 = (defpackage.fze) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r7.next()
            mze r1 = (defpackage.mze) r1
            r1.a()
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
