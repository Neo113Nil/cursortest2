package defpackage;

import android.content.Context;
import com.sofascore.results.crowdsourcing.CrowdsourcingDeleteIncidentModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class m24 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrowdsourcingDeleteIncidentModal b;

    public /* synthetic */ m24(CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal, int i) {
        this.a = i;
        this.b = crowdsourcingDeleteIncidentModal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal = this.b;
        Object[] objArr = 0;
        final int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1825694781, av8Var, new m24(crowdsourcingDeleteIncidentModal, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    s24 s24Var = (s24) rfo.x(((w24) crowdsourcingDeleteIncidentModal.C.getValue()).l, av8Var2, 0).getValue();
                    if (s24Var == null) {
                        av8Var2.d0(-2102205109);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-2102205108);
                        boolean i3 = av8Var2.i(crowdsourcingDeleteIncidentModal);
                        Object O = av8Var2.O();
                        a99 a99Var = nf3.a;
                        if (i3 || O == a99Var) {
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            O = new Function0() { // from class: n24
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i4 = objArr2;
                                    CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal2 = crowdsourcingDeleteIncidentModal;
                                    switch (i4) {
                                        case 0:
                                            Context requireContext = crowdsourcingDeleteIncidentModal2.requireContext();
                                            requireContext.getClass();
                                            nv.z0(requireContext, kv.CLICK, "delete", "crowdsourcing_edit");
                                            w24 w24Var = (w24) crowdsourcingDeleteIncidentModal2.C.getValue();
                                            xw3.L(un0.z(w24Var), null, null, new t24(w24Var, null), 3);
                                            break;
                                        default:
                                            crowdsourcingDeleteIncidentModal2.j();
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(O);
                        }
                        Function0 function0 = (Function0) O;
                        boolean i4 = av8Var2.i(crowdsourcingDeleteIncidentModal);
                        Object O2 = av8Var2.O();
                        if (i4 || O2 == a99Var) {
                            O2 = new Function0() { // from class: n24
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i42 = i2;
                                    CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal2 = crowdsourcingDeleteIncidentModal;
                                    switch (i42) {
                                        case 0:
                                            Context requireContext = crowdsourcingDeleteIncidentModal2.requireContext();
                                            requireContext.getClass();
                                            nv.z0(requireContext, kv.CLICK, "delete", "crowdsourcing_edit");
                                            w24 w24Var = (w24) crowdsourcingDeleteIncidentModal2.C.getValue();
                                            xw3.L(un0.z(w24Var), null, null, new t24(w24Var, null), 3);
                                            break;
                                        default:
                                            crowdsourcingDeleteIncidentModal2.j();
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(O2);
                        }
                        oyn.a(s24Var, function0, (Function0) O2, av8Var2, 0);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
