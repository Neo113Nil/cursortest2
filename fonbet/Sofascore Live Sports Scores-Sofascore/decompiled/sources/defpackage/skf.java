package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class skf extends m2g implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ dsf B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ z69 D;
    public final /* synthetic */ e1d E;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ esf u;
    public final /* synthetic */ fsf v;
    public final /* synthetic */ View w;
    public final /* synthetic */ float x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skf(esf esfVar, fsf fsfVar, View view, float f, boolean z, int i, int i2, dsf dsfVar, Function1 function1, z69 z69Var, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = esfVar;
        this.v = fsfVar;
        this.w = view;
        this.x = f;
        this.y = z;
        this.z = i;
        this.A = i2;
        this.B = dsfVar;
        this.C = function1;
        this.D = z69Var;
        this.E = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        skf skfVar = new skf(this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, rq3Var);
        skfVar.t = obj;
        return skfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((skf) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        return lu3.a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0029 -> B:5:0x002c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
