package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b3h extends m2g implements Function2 {
    public final /* synthetic */ int s = 0;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3h(long j, esf esfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = j;
        this.w = esfVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.s;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                b3h b3hVar = new b3h(this.t, (esf) obj2, rq3Var);
                b3hVar.v = obj;
                return b3hVar;
            default:
                b3h b3hVar2 = new b3h((mze) obj2, rq3Var);
                b3hVar2.v = obj;
                return b3hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        noi noiVar = (noi) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.s) {
        }
        return ((b3h) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:7:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.s
            java.lang.Object r1 = r8.w
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Lb;
            }
        Lb:
            lu3 r0 = defpackage.lu3.a
            int r5 = r8.u
            if (r5 == 0) goto L21
            if (r5 != r4) goto L1d
            long r1 = r8.t
            java.lang.Object r3 = r8.v
            noi r3 = (defpackage.noi) r3
            defpackage.y6a.M(r9)
            goto L47
        L1d:
            defpackage.a70.r(r3)
            goto L50
        L21:
            defpackage.y6a.M(r9)
            java.lang.Object r9 = r8.v
            noi r9 = (defpackage.noi) r9
            mze r1 = (defpackage.mze) r1
            long r1 = r1.b
            hsk r3 = r9.e()
            r3.getClass()
            r5 = 40
            long r5 = r5 + r1
            r3 = r9
            r1 = r5
        L38:
            r8.v = r3
            r8.t = r1
            r8.u = r4
            r9 = 3
            java.lang.Object r9 = defpackage.rti.b(r3, r8, r9)
            if (r9 != r0) goto L47
            r2 = r0
            goto L50
        L47:
            mze r9 = (defpackage.mze) r9
            long r5 = r9.b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto L38
            r2 = r9
        L50:
            return r2
        L51:
            esf r1 = (defpackage.esf) r1
            lu3 r0 = defpackage.lu3.a
            int r5 = r8.u
            if (r5 == 0) goto L67
            if (r5 != r4) goto L63
            java.lang.Object r8 = r8.v
            noi r8 = (defpackage.noi) r8
            defpackage.y6a.M(r9)
            goto L86
        L63:
            defpackage.a70.r(r3)
            goto Lb8
        L67:
            defpackage.y6a.M(r9)
            java.lang.Object r9 = r8.v
            noi r9 = (defpackage.noi) r9
            long r2 = r8.t
            fvg r5 = new fvg
            r6 = 8
            r5.<init>(r1, r6)
            r8.v = r9
            r8.u = r4
            java.lang.Object r8 = defpackage.e95.d(r9, r2, r5, r8)
            if (r8 != r0) goto L83
            r2 = r0
            goto Lb8
        L83:
            r7 = r9
            r9 = r8
            r8 = r7
        L86:
            mze r9 = (defpackage.mze) r9
            if (r9 == 0) goto L9e
            long r0 = r1.a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L9e
            i75 r2 = defpackage.i75.b
            goto Lb8
        L9e:
            ooi r8 = r8.f
            fze r8 = r8.s
            java.util.List r8 = r8.a
            java.lang.Object r8 = kotlin.collections.CollectionsKt.Y(r8)
            mze r8 = (defpackage.mze) r8
            boolean r9 = defpackage.qea.n(r8)
            if (r9 == 0) goto Lb6
            r8.a()
            i75 r2 = defpackage.i75.a
            goto Lb8
        Lb6:
            i75 r2 = defpackage.i75.d
        Lb8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b3h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3h(mze mzeVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = mzeVar;
    }
}
