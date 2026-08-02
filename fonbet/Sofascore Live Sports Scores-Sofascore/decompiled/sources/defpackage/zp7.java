package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zp7 extends m2g implements Function2 {
    public final /* synthetic */ int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ e1d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp7(e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.s = i;
        this.v = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.s;
        e1d e1dVar = this.v;
        switch (i) {
            case 0:
                zp7 zp7Var = new zp7(e1dVar, rq3Var, 0);
                zp7Var.u = obj;
                return zp7Var;
            default:
                zp7 zp7Var2 = new zp7(e1dVar, rq3Var, 1);
                zp7Var2.u = obj;
                return zp7Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        noi noiVar = (noi) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.s) {
            case 0:
                ((zp7) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((zp7) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0075 -> B:25:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.s
            e1d r1 = r10.v
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L54;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r10.u
            noi r0 = (defpackage.noi) r0
            lu3 r5 = defpackage.lu3.a
            int r6 = r10.t
            r7 = 2
            if (r6 == 0) goto L26
            if (r6 == r3) goto L22
            if (r6 != r7) goto L1e
            defpackage.y6a.M(r11)
            goto L44
        L1e:
            defpackage.a70.r(r2)
            goto L53
        L22:
            defpackage.y6a.M(r11)
            goto L36
        L26:
            defpackage.y6a.M(r11)
            gze r11 = defpackage.gze.a
            r10.u = r0
            r10.t = r3
            java.lang.Object r11 = defpackage.rti.b(r0, r10, r3)
            if (r11 != r5) goto L36
            goto L42
        L36:
            gze r11 = defpackage.gze.a
            r10.u = r4
            r10.t = r7
            java.lang.Object r11 = defpackage.rti.i(r0, r11, r10)
            if (r11 != r5) goto L44
        L42:
            r4 = r5
            goto L53
        L44:
            mze r11 = (defpackage.mze) r11
            if (r11 == 0) goto L51
            java.lang.Object r10 = r1.getValue()
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r10.invoke()
        L51:
            kotlin.Unit r4 = kotlin.Unit.a
        L53:
            return r4
        L54:
            java.lang.Object r0 = r10.u
            noi r0 = (defpackage.noi) r0
            lu3 r5 = defpackage.lu3.a
            int r6 = r10.t
            if (r6 == 0) goto L68
            if (r6 != r3) goto L64
            defpackage.y6a.M(r11)
            goto L79
        L64:
            defpackage.a70.r(r2)
            goto L78
        L68:
            defpackage.y6a.M(r11)
        L6b:
            gze r11 = defpackage.gze.a
            r10.u = r0
            r10.t = r3
            java.lang.Object r11 = r0.b(r11, r10)
            if (r11 != r5) goto L79
            r4 = r5
        L78:
            return r4
        L79:
            fze r11 = (defpackage.fze) r11
            java.util.List r11 = r11.a
            java.util.Iterator r11 = r11.iterator()
        L81:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r11.next()
            mze r2 = (defpackage.mze) r2
            boolean r4 = defpackage.qea.k(r2)
            if (r4 != 0) goto La0
            r4 = 0
            long r6 = defpackage.qea.E(r2, r4)
            r8 = 0
            boolean r2 = defpackage.dnd.c(r6, r8)
            if (r2 != 0) goto La1
        La0:
            r4 = r3
        La1:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r1.setValue(r2)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
