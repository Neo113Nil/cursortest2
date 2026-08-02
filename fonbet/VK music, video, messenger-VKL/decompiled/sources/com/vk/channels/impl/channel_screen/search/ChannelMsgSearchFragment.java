package com.vk.channels.impl.channel_screen.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.movika.sdk.base.ui.f;
import xsna.bpn0;
import xsna.i5b;
import xsna.i7o0;
import xsna.ies;
import xsna.l1;
import xsna.oz50;
import xsna.zdw;

/* compiled from: ChannelMsgSearchFragment.kt */
/* loaded from: classes16.dex */
public final class ChannelMsgSearchFragment extends FragmentImpl implements ies {
    public static final /* synthetic */ int Q = 0;
    public i5b N;
    public final bpn0 O = new bpn0(new f(this, 14));
    public final bpn0 P = new bpn0(new l1(this, 15));

    /* compiled from: ChannelMsgSearchFragment.kt */
    public static final class a extends oz50 {
        public a(long j, String str) {
            super(ChannelMsgSearchFragment.class, null, null);
            if (j == 0) {
                throw new IllegalArgumentException("Channel id is invalid = 0");
            }
            this.j.putLong("channel_id", j);
            this.j.putString("text", str);
        }
    }

    /* compiled from: ChannelMsgSearchFragment.kt */
    public final class b {
        public b() {
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        i5b i5bVar = new i5b(zdwVar.b, requireContext(), ((Number) this.O.getValue()).longValue());
        this.N = i5bVar;
        i5bVar.s = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i5b i5bVar = this.N;
        if (i5bVar == null) {
            i5bVar = null;
        }
        return i5bVar.D0(requireContext(), viewGroup, null, bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        i5b i5bVar = this.N;
        if (i5bVar == null) {
            i5bVar = null;
        }
        i5bVar.G0();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        i5b i5bVar = this.N;
        if (i5bVar == null) {
            i5bVar = null;
        }
        i5bVar.H0();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        i5b i5bVar = this.N;
        if (i5bVar == null) {
            i5bVar = null;
        }
        i5bVar.W0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        i5b i5bVar = this.N;
        if (i5bVar == null) {
            i5bVar = null;
        }
        i5bVar.V0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        i5b i5bVar = this.N;
        if (i5bVar == null) {
            i5bVar = null;
        }
        i5bVar.V0();
        bpn0 bpn0Var = this.P;
        if (((String) bpn0Var.getValue()).length() > 0) {
            i5b i5bVar2 = this.N;
            if (i5bVar2 == null) {
                i5bVar2 = null;
            }
            String str = (String) bpn0Var.getValue();
            VkSearchView vkSearchView = i5bVar2.Y0().g;
            (vkSearchView != null ? vkSearchView : null).setQuery(str);
            i5bVar2.Z0(str);
        }
    }
}
