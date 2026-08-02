package defpackage;

import com.sofascore.model.database.MediaReactionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ly7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public int u;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly7(my7 my7Var, int i, MediaReactionType mediaReactionType, MediaReactionType mediaReactionType2, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.v = my7Var;
        this.t = i;
        this.w = mediaReactionType;
        this.x = mediaReactionType2;
        this.u = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                return new ly7((my7) this.v, this.t, (MediaReactionType) obj3, (MediaReactionType) obj2, this.u, rq3Var);
            case 1:
                return new ly7((olb) this.v, (yda) obj3, this.t, this.u, (flb) obj2, rq3Var);
            case 2:
                return new ly7((vmc) obj3, this.t, this.u, (String) obj2, rq3Var);
            case 3:
                return new ly7((znc) this.v, this.t, (t6e) obj3, this.u, (s6e) obj2, rq3Var, 3);
            case 4:
                return new ly7((vpc) this.v, this.t, (t6e) obj3, this.u, (s6e) obj2, rq3Var, 4);
            case 5:
                return new ly7((zsf) this.v, this.t, (t6e) obj3, this.u, (aaf) obj2, rq3Var, 5);
            case 6:
                return new ly7(this.u, (e1d) this.v, (ksa) obj3, (e1d) obj2, rq3Var);
            default:
                return new ly7((ill) obj3, (String) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ly7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e2  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly7(q8 q8Var, int i, t6e t6eVar, int i2, Object obj, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.v = q8Var;
        this.t = i;
        this.w = t6eVar;
        this.u = i2;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly7(int i, e1d e1dVar, ksa ksaVar, e1d e1dVar2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 6;
        this.u = i;
        this.v = e1dVar;
        this.w = ksaVar;
        this.x = e1dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly7(olb olbVar, yda ydaVar, int i, int i2, flb flbVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.v = olbVar;
        this.w = ydaVar;
        this.t = i;
        this.u = i2;
        this.x = flbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly7(vmc vmcVar, int i, int i2, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.w = vmcVar;
        this.t = i;
        this.u = i2;
        this.x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly7(ill illVar, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 7;
        this.w = illVar;
        this.x = str;
    }
}
