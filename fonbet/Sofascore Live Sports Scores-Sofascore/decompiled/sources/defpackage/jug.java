package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jug extends m2g implements Function2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ csf u;
    public final /* synthetic */ csf v;
    public final /* synthetic */ asf w;
    public final /* synthetic */ asf x;
    public final /* synthetic */ View y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jug(csf csfVar, csf csfVar2, asf asfVar, asf asfVar2, View view, Function1 function1, float f, boolean z, Function0 function0, Function0 function02, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = csfVar;
        this.v = csfVar2;
        this.w = asfVar;
        this.x = asfVar2;
        this.y = view;
        this.z = function1;
        this.A = f;
        this.B = z;
        this.C = function0;
        this.D = function02;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        jug jugVar = new jug(this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, rq3Var);
        jugVar.t = obj;
        return jugVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((jug) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        return lu3.a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:72:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0029 -> B:5:0x002c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jug.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
