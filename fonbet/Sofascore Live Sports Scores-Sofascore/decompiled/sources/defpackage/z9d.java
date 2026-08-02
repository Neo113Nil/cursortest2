package defpackage;

import android.content.Context;
import com.unity3d.services.core.network.model.HttpRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z9d implements bz7 {
    public final mqi a;
    public final mqi b;
    public final y3g c;
    public final mqi d;

    public z9d(Function0 function0, b7h b7hVar, int i) {
        Function0 ivcVar = (i & 2) != 0 ? new ivc(11) : b7hVar;
        y9d y9dVar = y9d.b;
        ivc ivcVar2 = new ivc(12);
        this.a = ypa.b(function0);
        this.b = ypa.b(ivcVar);
        y3g y3gVar = new y3g(13, false);
        y3gVar.b = y9dVar;
        y3gVar.c = p4h.j;
        this.c = y3gVar;
        this.d = ypa.b(ivcVar2);
    }

    @Override // defpackage.bz7
    public final dz7 a(Object obj, tvd tvdVar, apf apfVar) {
        eek eekVar = (eek) obj;
        if (!Intrinsics.c(eekVar.c, "http") && !Intrinsics.c(eekVar.c, HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        String str = eekVar.a;
        mqi mqiVar = this.a;
        mqi b = ypa.b(new xxb(apfVar, 13));
        mqi mqiVar2 = this.b;
        y3g y3gVar = this.c;
        Context context = tvdVar.a;
        Object obj2 = y3gVar.c;
        p4h p4hVar = p4h.j;
        if (obj2 == p4hVar) {
            synchronized (y3gVar) {
                obj2 = y3gVar.c;
                if (obj2 == p4hVar) {
                    Function1 function1 = (Function1) y3gVar.b;
                    function1.getClass();
                    Object invoke = function1.invoke(context);
                    y3gVar.c = invoke;
                    y3gVar.b = null;
                    obj2 = invoke;
                }
            }
        }
        return new ead(str, tvdVar, mqiVar, b, mqiVar2, new j3a(obj2), this.d);
    }
}
