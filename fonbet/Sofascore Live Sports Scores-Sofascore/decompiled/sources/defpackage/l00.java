package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l00 extends m2g implements Function2 {
    public final /* synthetic */ int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l00(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.s = i;
        this.v = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.s;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                l00 l00Var = new l00((n00) obj2, rq3Var, 0);
                l00Var.u = obj;
                return l00Var;
            case 1:
                l00 l00Var2 = new l00((gze) obj2, rq3Var, 1);
                l00Var2.u = obj;
                return l00Var2;
            case 2:
                l00 l00Var3 = new l00((Function1) obj2, rq3Var, 2);
                l00Var3.u = obj;
                return l00Var3;
            case 3:
                l00 l00Var4 = new l00((gt3) obj2, rq3Var, 3);
                l00Var4.u = obj;
                return l00Var4;
            default:
                l00 l00Var5 = new l00((lcj) obj2, rq3Var, 4);
                l00Var5.u = obj;
                return l00Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        noi noiVar = (noi) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((l00) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
                break;
            default:
                ((l00) create(noiVar, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return lu3.a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:19:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0144 -> B:57:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:7:0x0036). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
