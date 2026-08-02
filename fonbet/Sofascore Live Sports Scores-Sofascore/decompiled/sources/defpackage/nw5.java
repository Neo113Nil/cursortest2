package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.R;
import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import com.sofascore.results.crowdsourcing.CrowdsourcingOnboardingModal;
import com.sofascore.results.crowdsourcing.CrowdsourcingStatusDescriptionModal;
import com.sofascore.results.crowdsourcing.EventContributeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nw5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ EventContributeFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw5(EventContributeFragment eventContributeFragment, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = eventContributeFragment;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        EventContributeFragment eventContributeFragment = this.t;
        switch (i) {
            case 0:
                nw5 nw5Var = new nw5(eventContributeFragment, rq3Var, 0);
                nw5Var.s = obj;
                return nw5Var;
            default:
                nw5 nw5Var2 = new nw5(eventContributeFragment, rq3Var, 1);
                nw5Var2.s = obj;
                return nw5Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((nw5) create((g34) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((nw5) create((qmh) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        EventContributeFragment eventContributeFragment = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                g34 g34Var = (g34) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (Intrinsics.c(g34Var, e34.a)) {
                    new CrowdsourcingIncidentDetailsFullScreenDialog().p(eventContributeFragment.requireActivity().k(), "IncidentDetailsBottomSheet");
                } else if (Intrinsics.c(g34Var, d34.a)) {
                    Context requireContext = eventContributeFragment.requireContext();
                    requireContext.getClass();
                    CrowdsourcingOnboardingModal crowdsourcingOnboardingModal = new CrowdsourcingOnboardingModal();
                    if (requireContext instanceof csk) {
                        requireContext = ((csk) requireContext).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(crowdsourcingOnboardingModal, appCompatActivity, null, 3));
                    }
                } else if (g34Var instanceof f34) {
                    Context requireContext2 = eventContributeFragment.requireContext();
                    requireContext2.getClass();
                    f34 f34Var = (f34) g34Var;
                    int i2 = f34Var.a;
                    l64 l64Var = f34Var.b;
                    boolean z = f34Var.c;
                    l64Var.getClass();
                    CrowdsourcingStatusDescriptionModal crowdsourcingStatusDescriptionModal = new CrowdsourcingStatusDescriptionModal();
                    Bundle bundle = new Bundle();
                    bundle.putInt("event_id", i2);
                    bundle.putSerializable("state", l64Var);
                    bundle.putBoolean("validated", z);
                    crowdsourcingStatusDescriptionModal.setArguments(bundle);
                    if (requireContext2 instanceof csk) {
                        requireContext2 = ((csk) requireContext2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = requireContext2 instanceof AppCompatActivity ? (AppCompatActivity) requireContext2 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(crowdsourcingStatusDescriptionModal, appCompatActivity2, null, 3));
                    }
                } else {
                    final int i3 = 0;
                    final int i4 = 1;
                    if (Intrinsics.c(g34Var, b34.a)) {
                        Context requireContext3 = eventContributeFragment.requireContext();
                        requireContext3.getClass();
                        final iw5 iw5Var = new iw5(eventContributeFragment, 1);
                        final AlertDialog h = lnb.h(R.style.RedesignDialog, requireContext3);
                        h04 b = h04.b(LayoutInflater.from(requireContext3));
                        b.d.setText(requireContext3.getString(R.string.score_change_suggestion_confirmation_title));
                        b.c.setText(requireContext3.getString(R.string.score_change_suggestion_confirmation_text));
                        h.setView(b.b);
                        h.setButton(-1, requireContext3.getString(R.string.confirm_button), new DialogInterface.OnClickListener() { // from class: tn
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = i3;
                                AlertDialog alertDialog = h;
                                iw5 iw5Var2 = iw5Var;
                                switch (i6) {
                                    case 0:
                                        iw5Var2.invoke(Boolean.TRUE);
                                        alertDialog.dismiss();
                                        break;
                                    default:
                                        iw5Var2.invoke(Boolean.FALSE);
                                        alertDialog.dismiss();
                                        break;
                                }
                            }
                        });
                        h.setButton(-2, requireContext3.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: tn
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = i4;
                                AlertDialog alertDialog = h;
                                iw5 iw5Var2 = iw5Var;
                                switch (i6) {
                                    case 0:
                                        iw5Var2.invoke(Boolean.TRUE);
                                        alertDialog.dismiss();
                                        break;
                                    default:
                                        iw5Var2.invoke(Boolean.FALSE);
                                        alertDialog.dismiss();
                                        break;
                                }
                            }
                        });
                        h.show();
                    } else {
                        if (!Intrinsics.c(g34Var, c34.a)) {
                            zzl.b();
                            return null;
                        }
                        Context requireContext4 = eventContributeFragment.requireContext();
                        requireContext4.getClass();
                        final iw5 iw5Var2 = new iw5(eventContributeFragment, 2);
                        final AlertDialog h2 = lnb.h(R.style.RedesignDialog, requireContext4);
                        h04 b2 = h04.b(LayoutInflater.from(requireContext4));
                        b2.d.setText(requireContext4.getString(R.string.crowdsourcing_goal_order_error_title));
                        b2.c.setText(requireContext4.getString(R.string.crowdsourcing_goal_order_error_body));
                        h2.setView(b2.b);
                        h2.setButton(-1, requireContext4.getString(R.string.submit_anyway_button), new DialogInterface.OnClickListener() { // from class: sn
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = i3;
                                AlertDialog alertDialog = h2;
                                iw5 iw5Var3 = iw5Var2;
                                switch (i6) {
                                    case 0:
                                        iw5Var3.invoke(Boolean.TRUE);
                                        alertDialog.dismiss();
                                        break;
                                    default:
                                        iw5Var3.invoke(Boolean.FALSE);
                                        alertDialog.dismiss();
                                        break;
                                }
                            }
                        });
                        h2.setButton(-2, requireContext4.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: sn
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = i4;
                                AlertDialog alertDialog = h2;
                                iw5 iw5Var3 = iw5Var2;
                                switch (i6) {
                                    case 0:
                                        iw5Var3.invoke(Boolean.TRUE);
                                        alertDialog.dismiss();
                                        break;
                                    default:
                                        iw5Var3.invoke(Boolean.FALSE);
                                        alertDialog.dismiss();
                                        break;
                                }
                            }
                        });
                        h2.show();
                    }
                }
                return Unit.a;
            default:
                qmh qmhVar = (qmh) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                krk krkVar = eventContributeFragment.l;
                krkVar.getClass();
                Object parent = ((yrh) krkVar).a.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    int i5 = ze3.C;
                    Context requireContext5 = eventContributeFragment.requireContext();
                    requireContext5.getClass();
                    ze3 I = fkf.I(requireContext5, view, qmhVar);
                    if (I != null) {
                        I.i();
                    }
                }
                return Unit.a;
        }
    }
}
