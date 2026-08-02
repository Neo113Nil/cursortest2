package com.vk.voip.ui.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cdz;
import xsna.dhr0;
import xsna.g2v;
import xsna.gzs;
import xsna.kcz;
import xsna.l7s;
import xsna.o25;
import xsna.o3w;
import xsna.s3q0;

/* compiled from: LinkFragment.kt */
/* loaded from: classes7.dex */
public final class LinkFragment extends StaticBottomSheetFragment {
    public static final /* synthetic */ int R = 0;
    public final cdz P = new cdz(new a(0, this, LinkFragment.class, "backToParticipants", "backToParticipants()V", 0), new b(0, this, LinkFragment.class, "dismissAllowingStateLoss", "dismissAllowingStateLoss()V", 0), new o3w(this, 5));
    public kcz Q;

    /* compiled from: LinkFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            LinkFragment linkFragment = (LinkFragment) this.receiver;
            int i = LinkFragment.R;
            linkFragment.fo();
            return s3q0.a;
        }
    }

    /* compiled from: LinkFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((LinkFragment) this.receiver).tn();
            return s3q0.a;
        }
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment
    public final View eo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context requireContext = requireContext();
        o25.b(o25.a());
        g2v.c().getClass();
        boolean z = o25.a().i().c;
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.voip_link_settings_view, viewGroup, false);
        kcz kczVar = new kcz(requireContext, inflate, true, z);
        this.Q = kczVar;
        this.P.a(kczVar);
        return inflate;
    }

    public final void fo() {
        tn();
        if (requireFragmentManager().H("CallSettingsFragment") != null) {
            return;
        }
        new CallParticipantsFragment().Td(requireFragmentManager(), "CallSettingsFragment");
    }

    @Override // com.vk.voip.ui.utils.ContextHolderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        dhr0.a.getClass();
        super.onAttach(new l7s(context, dhr0.u().c));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        cdz cdzVar = this.P;
        cdzVar.d.w();
        cdzVar.e.dispose();
        cdzVar.g.e();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        kcz kczVar = this.Q;
        if (kczVar != null) {
            kczVar.f.a();
            kczVar.m.j.dispose();
        }
        this.Q = null;
        this.P.e.e();
    }

    @Override // androidx.fragment.app.d
    public final void wn() {
        fo();
    }

    @Override // androidx.fragment.app.d
    public final void xn() {
        fo();
    }
}
