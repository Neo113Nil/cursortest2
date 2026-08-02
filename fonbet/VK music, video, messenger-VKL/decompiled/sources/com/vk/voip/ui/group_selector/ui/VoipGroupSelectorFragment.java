package com.vk.voip.ui.group_selector.ui;

import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.apw0;
import xsna.dpw0;
import xsna.gm50;
import xsna.hto0;
import xsna.iq6;
import xsna.km50;
import xsna.mk50;
import xsna.o25;
import xsna.oow0;
import xsna.r9c0;
import xsna.sow0;
import xsna.vg20;
import xsna.vk50;
import xsna.w7w0;
import xsna.wow0;
import xsna.xn50;

/* compiled from: VoipGroupSelectorFragment.kt */
/* loaded from: classes7.dex */
public final class VoipGroupSelectorFragment extends MviImplFragment<wow0, b, oow0> {
    public static final /* synthetic */ int R = 0;
    public final a Q = new a();

    /* compiled from: VoipGroupSelectorFragment.kt */
    public static final class a implements dpw0<com.vk.voip.ui.group_selector.ui.a> {
        public a() {
        }

        @Override // xsna.dpw0
        public final void a(com.vk.voip.ui.group_selector.ui.a aVar) {
            boolean z = aVar instanceof a.g;
            VoipGroupSelectorFragment voipGroupSelectorFragment = VoipGroupSelectorFragment.this;
            if (z) {
                xn50.a.c(voipGroupSelectorFragment, oow0.b.b);
                return;
            }
            if (aVar instanceof a.i.b) {
                xn50.a.c(voipGroupSelectorFragment, oow0.e.c.b);
                return;
            }
            if (aVar instanceof a.i.C2044a) {
                xn50.a.c(voipGroupSelectorFragment, oow0.a.C3458a.b);
                return;
            }
            if (aVar instanceof a.h.C2043a) {
                xn50.a.c(voipGroupSelectorFragment, oow0.e.a.b);
                return;
            }
            if (aVar instanceof a.h.b) {
                xn50.a.c(voipGroupSelectorFragment, new oow0.e.b(((a.h.b) aVar).a));
                return;
            }
            if (aVar instanceof a.e) {
                xn50.a.c(voipGroupSelectorFragment, oow0.f.b.b);
                return;
            }
            if (aVar instanceof a.C2042a) {
                xn50.a.c(voipGroupSelectorFragment, oow0.f.a.b);
                return;
            }
            if (aVar instanceof a.f) {
                xn50.a.c(voipGroupSelectorFragment, new oow0.f.c(((a.f) aVar).a));
                return;
            }
            if (aVar instanceof a.b) {
                xn50.a.d(voipGroupSelectorFragment, oow0.d.a.b, oow0.a.C3458a.b);
            } else if (aVar instanceof a.d) {
                xn50.a.c(voipGroupSelectorFragment, oow0.e.a.b);
            } else {
                if (!(aVar instanceof a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(voipGroupSelectorFragment, oow0.c.a.b);
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(new View(requireContext()));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((b) ao50Var).a, new hto0(9, this, new sow0(view.getContext(), getFeature().f, this.Q)));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        wow0 wow0Var = (wow0) vk50Var;
        wow0Var.h.a(new r9c0(this, 28), this);
        wow0Var.i.a(new w7w0(this, 2), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(2, 0);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        VoipGroupSelectorConfig voipGroupSelectorConfig = (VoipGroupSelectorConfig) bundle.getParcelable("arg_config");
        if (voipGroupSelectorConfig != null) {
            return new wow0(new apw0(voipGroupSelectorConfig, o25.a()), voipGroupSelectorConfig, new iq6(new vg20()));
        }
        throw new IllegalStateException("No config passed");
    }
}
