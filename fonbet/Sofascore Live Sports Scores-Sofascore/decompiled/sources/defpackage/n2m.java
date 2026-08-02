package defpackage;

import defpackage.vyd;
import defpackage.w3m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class n2m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3m b;

    public /* synthetic */ n2m(w3m w3mVar, int i) {
        this.a = i;
        this.b = w3mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        w3m w3mVar = this.b;
        switch (i) {
            case 0:
                w3mVar.u0 = ((Long) obj).longValue();
                break;
            case 1:
                w3mVar.v0 = ((Long) obj).longValue();
                break;
            case 2:
                vyd.a aVar = (vyd.a) obj;
                aVar.getClass();
                w3mVar.s0 = aVar.a;
                w3mVar.t0 = aVar.b;
                w3mVar.C = Long.valueOf(aVar.c);
                w3mVar.D = Long.valueOf(aVar.d);
                mzm.c(w3mVar, Long.valueOf(aVar.e));
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                w3mVar.P0.b = null;
                w3mVar.i0 = booleanValue;
                w3mVar.h0(new w3m.a.C1357a(false));
                List Z = w3mVar.Z(2, w3mVar.o0);
                w3mVar.o0 = Z;
                ArrayList Y = w3m.Y(Z);
                w3mVar.t = Y;
                if (!Y.isEmpty()) {
                    fdi fdiVar = w3mVar.u;
                    fdiVar.getClass();
                    fdiVar.m(null, Y);
                }
                break;
        }
        return Unit.a;
    }
}
