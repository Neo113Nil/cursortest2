package com.vk.voip.ui.scheduled.creation.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.c;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallReportType;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import kotlin.NoWhenBranchMatchedException;
import xsna.a201;
import xsna.bsb0;
import xsna.enw0;
import xsna.gm50;
import xsna.gqq0;
import xsna.hww0;
import xsna.i2s0;
import xsna.kj50;
import xsna.km50;
import xsna.lnw0;
import xsna.mhy;
import xsna.mk50;
import xsna.n6h0;
import xsna.o25;
import xsna.o6h0;
import xsna.oxw0;
import xsna.oz50;
import xsna.pww0;
import xsna.pxw0;
import xsna.pyw0;
import xsna.q7h0;
import xsna.qxw0;
import xsna.qz8;
import xsna.r9c0;
import xsna.rd9;
import xsna.u98;
import xsna.uq80;
import xsna.vg20;
import xsna.vk50;
import xsna.vxw0;
import xsna.www0;
import xsna.x5h0;
import xsna.xn50;

/* compiled from: VoipCreateScheduleCallFragment.kt */
/* loaded from: classes7.dex */
public class VoipCreateScheduleCallFragment extends MviImplFragment<pww0, VoipScheduleCallViewState, hww0> {
    public static final /* synthetic */ int S = 0;
    public final b Q = new b();
    public final uq80 R = new uq80(this, 12);

    /* compiled from: VoipCreateScheduleCallFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VoipCreateScheduleCallFragment.kt */
    public static final class b implements qxw0<pxw0> {
        public b() {
        }

        @Override // xsna.qxw0
        public final void a(pxw0 pxw0Var) {
            kj50 kj50Var;
            kj50 nVar;
            boolean z = pxw0Var instanceof pxw0.o;
            VoipCreateScheduleCallFragment voipCreateScheduleCallFragment = VoipCreateScheduleCallFragment.this;
            if (z) {
                kj50Var = hww0.q.b;
            } else if (pxw0Var instanceof pxw0.a) {
                kj50Var = hww0.h.b;
            } else if (pxw0Var instanceof pxw0.p.a) {
                kj50Var = hww0.a.b;
            } else if (pxw0Var instanceof pxw0.p.c) {
                kj50Var = hww0.i.b;
            } else if (pxw0Var instanceof pxw0.p.e) {
                kj50Var = hww0.l.e.b;
            } else if (pxw0Var instanceof pxw0.p.f) {
                kj50Var = hww0.l.d.b;
            } else if (pxw0Var instanceof pxw0.p.g) {
                kj50Var = hww0.l.g.b;
            } else if (pxw0Var instanceof pxw0.p.i) {
                kj50Var = hww0.v.b;
            } else if (pxw0Var instanceof pxw0.p.d) {
                kj50Var = hww0.m.b;
            } else if (pxw0Var instanceof pxw0.n) {
                mhy.b(voipCreateScheduleCallFragment.kn());
                kj50Var = hww0.l.f.b;
            } else {
                if (pxw0Var instanceof pxw0.f) {
                    nVar = new hww0.e(((pxw0.f) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.g) {
                    nVar = new hww0.f(((pxw0.g) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.j) {
                    nVar = new hww0.o(((pxw0.j) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.l) {
                    nVar = new hww0.s(((pxw0.l) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.h) {
                    nVar = new hww0.g(((pxw0.h) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.e) {
                    nVar = new hww0.d(((pxw0.e) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.d) {
                    nVar = new hww0.c(((pxw0.d) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.c) {
                    kj50Var = hww0.l.a.b;
                } else if (pxw0Var instanceof pxw0.k) {
                    kj50Var = hww0.j.b;
                } else if (pxw0Var.equals(pxw0.p.b.a)) {
                    kj50Var = hww0.l.c.b;
                } else if (pxw0Var.equals(pxw0.p.h.a)) {
                    kj50Var = hww0.l.h.b;
                } else if (pxw0Var instanceof pxw0.b) {
                    nVar = new hww0.b(((pxw0.b) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.m) {
                    nVar = new hww0.u(((pxw0.m) pxw0Var).a);
                } else if (pxw0Var instanceof pxw0.p.j) {
                    kj50Var = hww0.w.b;
                } else if (pxw0Var instanceof pxw0.i) {
                    nVar = new hww0.n(((pxw0.i) pxw0Var).a);
                } else {
                    if (!(pxw0Var instanceof pxw0.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kj50Var = hww0.l.b.b;
                }
                kj50Var = nVar;
            }
            xn50.a.c(voipCreateScheduleCallFragment, kj50Var);
        }
    }

    @Override // xsna.xn50
    public mk50 Fl() {
        return new mk50.c(new oxw0(requireContext(), this.Q, go() != null));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        pww0 pww0Var = (pww0) vk50Var;
        pww0Var.o.a(new gqq0(this, 10), this);
        pww0Var.n.a(new r9c0(this, 27), this);
    }

    public lnw0 fo(Context context) {
        return new enw0(o25.a(), context, new vxw0(context));
    }

    public x5h0 go() {
        return null;
    }

    @Override // xsna.xn50
    /* renamed from: ho, reason: merged with bridge method [inline-methods] */
    public void Jh(VoipScheduleCallViewState voipScheduleCallViewState, View view) {
        gm50.a.b(this, voipScheduleCallViewState.a, new i2s0(4, this, view));
    }

    public void io(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
        xn50.a.c(this, new hww0.r(new pyw0(VoipScheduledCallReportType.SCHEDULED, callId, sharingChannel)));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        In().a.l0("REQUEST_KEY_SCHEDULE_AS", this, this.R);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        xn50.a.c(this, hww0.t.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Context requireContext = requireContext();
        lnw0 fo = fo(requireContext);
        c.b.getClass();
        return new pww0(new www0(requireContext, fo, c.k0()), new q7h0(new vg20(), new rd9()), o25.a(), go(), new u98(new qz8(requireContext.getContentResolver()), new bsb0(requireContext)), a201.b().b(), c.k0(), (n6h0) o6h0.a.getValue());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.VOIP_SCHEDULED_CALLS;
    }
}
