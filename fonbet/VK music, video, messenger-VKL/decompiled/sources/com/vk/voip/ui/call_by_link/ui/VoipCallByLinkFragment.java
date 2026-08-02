package com.vk.voip.ui.call_by_link.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.ui.call_by_link.feature.a;
import com.vk.voip.ui.call_by_link.feature.events.VoipCallByLinkNavigationEvent;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.bgw0;
import xsna.ecs0;
import xsna.f0j0;
import xsna.fpf0;
import xsna.gm50;
import xsna.hgw0;
import xsna.kgw0;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.nl;
import xsna.o25;
import xsna.s3q0;
import xsna.vg20;
import xsna.vk50;
import xsna.xn50;
import xsna.zkj0;

/* compiled from: VoipCallByLinkFragment.kt */
/* loaded from: classes7.dex */
public final class VoipCallByLinkFragment extends MviImplFragment<com.vk.voip.ui.call_by_link.feature.b, VoipCallByLinkViewState, com.vk.voip.ui.call_by_link.feature.a> {
    public static final /* synthetic */ int T = 0;
    public final c Q = new c();
    public final f0j0 R = new f0j0(this, 14);
    public final d S = new d();

    /* compiled from: VoipCallByLinkFragment.kt */
    public static final class a {
        public final bgw0 a;
        public final hgw0 b;

        public a(bgw0 bgw0Var, hgw0 hgw0Var) {
            this.a = bgw0Var;
            this.b = hgw0Var;
        }
    }

    /* compiled from: VoipCallByLinkFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones.values().length];
            try {
                iArr[VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones.DISABLED_ON_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones.DISABLED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo.values().length];
            try {
                iArr2[VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo.DISABLED_ON_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo.DISABLED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VoipCallByLinkFragment.kt */
    public static final class c implements kgw0<com.vk.voip.ui.call_by_link.ui.a> {
        public c() {
        }

        @Override // xsna.kgw0
        public final void a(com.vk.voip.ui.call_by_link.ui.a aVar) {
            boolean z = aVar instanceof a.AbstractC2032a.b;
            VoipCallByLinkFragment voipCallByLinkFragment = VoipCallByLinkFragment.this;
            if (z) {
                a.i.C2021a c2021a = a.i.C2021a.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, c2021a);
            } else if (aVar instanceof a.AbstractC2032a.C2033a) {
                com.vk.voip.ui.call_by_link.feature.a[] aVarArr = {a.i.b.b, a.c.C2017a.b};
                voipCallByLinkFragment.getClass();
                xn50.a.d(voipCallByLinkFragment, aVarArr);
            } else if (aVar instanceof a.AbstractC2032a.c.e) {
                a.j jVar = a.j.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, jVar);
            } else if (aVar instanceof a.AbstractC2032a.c.C2034a) {
                a.C2014a c2014a = a.C2014a.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, c2014a);
            } else if (aVar instanceof a.AbstractC2032a.c.b) {
                a.d dVar = a.d.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, dVar);
            } else if (aVar instanceof a.AbstractC2032a.c.C2035c) {
                a.g.f fVar = a.g.f.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, fVar);
            } else if (aVar instanceof a.AbstractC2032a.c.d) {
                a.g.C2020g c2020g = a.g.C2020g.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, c2020g);
            } else if (aVar instanceof a.AbstractC2032a.d) {
                com.vk.voip.ui.call_by_link.feature.a[] aVarArr2 = {a.i.c.b, a.c.C2018c.b};
                voipCallByLinkFragment.getClass();
                xn50.a.d(voipCallByLinkFragment, aVarArr2);
            } else if (aVar instanceof a.b.C2036a) {
                a.g.d dVar2 = a.g.d.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, dVar2);
            } else if (aVar instanceof a.b.d) {
                a.g.c cVar = a.g.c.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, cVar);
            } else if (aVar instanceof a.b.C2037b) {
                a.g.C2019a c2019a = a.g.C2019a.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, c2019a);
            } else if (aVar instanceof a.b.c) {
                a.g.b bVar = a.g.b.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, bVar);
            } else if (aVar instanceof a.b.e) {
                com.vk.voip.ui.call_by_link.feature.a[] aVarArr3 = {a.g.e.b, a.g.d.b};
                voipCallByLinkFragment.getClass();
                xn50.a.d(voipCallByLinkFragment, aVarArr3);
            } else {
                if (!aVar.equals(a.AbstractC2032a.c.f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.k kVar = a.k.b;
                voipCallByLinkFragment.getClass();
                xn50.a.c(voipCallByLinkFragment, kVar);
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* compiled from: VoipCallByLinkFragment.kt */
    public static final class d extends FragmentManager.m {
        public d() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void d(FragmentManager fragmentManager, Fragment fragment) {
            if (fragmentManager.c.f().isEmpty()) {
                xn50.a.c(VoipCallByLinkFragment.this, a.c.b.b);
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(new View(requireContext()));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        Context context = view.getContext();
        c cVar = this.Q;
        gm50.a.b(this, ((VoipCallByLinkViewState) ao50Var).a, new ecs0(1, new a(new bgw0(context, cVar), new hgw0(view.getContext(), cVar)), this));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((com.vk.voip.ui.call_by_link.feature.b) vk50Var).h.a(new zkj0(7, new ArrayList(), this), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(2, 0);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentManager fragmentManager = In().a;
        fragmentManager.l0("REQUEST_KEY_CALL_AS", this, this.R);
        fragmentManager.c0(this.S, false);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.voip.ui.call_by_link.feature.b(new com.vk.voip.ui.call_by_link.feature.d(o25.a()), new nl(new vg20(), false), ((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df());
    }
}
