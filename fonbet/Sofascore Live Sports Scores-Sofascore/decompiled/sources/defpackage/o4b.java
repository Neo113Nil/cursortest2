package defpackage;

import android.app.Application;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lo4b;", "Lynb;", "Lm4b;", "Lc4b;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class o4b extends ynb {
    public final w3b l;
    public e4b m;
    public final hof n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4b(w3b w3bVar, Application application) {
        super(application, tnb.a);
        w3bVar.getClass();
        this.l = w3bVar;
        this.n = pco.w(la8.a(hkg.I(this.k, new isa(19), hkg.q), new tl((rq3) null, this, 15)), un0.z(this));
    }

    public final void t(final c4b c4bVar) {
        rq3 rq3Var = null;
        if (c4bVar instanceof a4b) {
            final int i = 0;
            n(null, new Function1() { // from class: n4b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    c4b c4bVar2 = c4bVar;
                    switch (i2) {
                        case 0:
                            m4b m4bVar = (m4b) obj;
                            m4bVar.getClass();
                            return m4b.a(m4bVar, null, null, ((a4b) c4bVar2).a, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                        default:
                            m4b m4bVar2 = (m4b) obj;
                            m4bVar2.getClass();
                            return m4b.a(m4bVar2, ((b4b) c4bVar2).a, null, null, false, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                    }
                }
            });
            return;
        }
        if (c4bVar instanceof b4b) {
            final int i2 = 1;
            n(null, new Function1() { // from class: n4b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    c4b c4bVar2 = c4bVar;
                    switch (i22) {
                        case 0:
                            m4b m4bVar = (m4b) obj;
                            m4bVar.getClass();
                            return m4b.a(m4bVar, null, null, ((a4b) c4bVar2).a, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                        default:
                            m4b m4bVar2 = (m4b) obj;
                            m4bVar2.getClass();
                            return m4b.a(m4bVar2, ((b4b) c4bVar2).a, null, null, false, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                    }
                }
            });
        } else {
            if (!(c4bVar instanceof z3b)) {
                zzl.b();
                return;
            }
            z3b z3bVar = (z3b) c4bVar;
            xw3.L(un0.z(this), null, null, new z23(this, z3bVar.a, z3bVar.b, rq3Var, 12), 3);
        }
    }
}
