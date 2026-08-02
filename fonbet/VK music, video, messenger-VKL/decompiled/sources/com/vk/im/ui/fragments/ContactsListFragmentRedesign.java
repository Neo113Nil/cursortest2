package com.vk.im.ui.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.a1w;
import xsna.aqx0;
import xsna.b0u0;
import xsna.bc6;
import xsna.bqx0;
import xsna.cau0;
import xsna.d02;
import xsna.dhr0;
import xsna.dsc;
import xsna.e1w;
import xsna.f4m;
import xsna.g2v;
import xsna.iah0;
import xsna.iut0;
import xsna.izs;
import xsna.lpj;
import xsna.mn9;
import xsna.mxv;
import xsna.n5i;
import xsna.oq;
import xsna.pbm;
import xsna.q1w;
import xsna.sa30;
import xsna.tlo0;
import xsna.um0;
import xsna.w8j;
import xsna.x8j;
import xsna.xa4;
import xsna.y1z;
import xsna.ypg0;

/* compiled from: ContactsListFragmentRedesign.kt */
/* loaded from: classes2.dex */
public final class ContactsListFragmentRedesign extends ImContactsListFragment {
    public static final /* synthetic */ int q0 = 0;
    public VkSearchView m0;
    public AppBarShadowView n0;
    public io.reactivex.rxjava3.disposables.c o0;
    public final c l0 = new c();
    public final d p0 = new d();

    /* compiled from: ContactsListFragmentRedesign.kt */
    public static final class a extends ImContactsListFragment.a {
        public a() {
            super(ContactsListFragmentRedesign.class);
            s(true);
            this.j.putBoolean("EXTERNAL_SEARCH", true);
        }
    }

    /* compiled from: ContactsListFragmentRedesign.kt */
    public static final class b extends ImContactsListFragment.b {
        public b() {
            super();
        }

        @Override // com.vk.im.ui.fragments.ImContactsListFragment.b, com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void a(boolean z) {
            ContactsListFragmentRedesign contactsListFragmentRedesign = ContactsListFragmentRedesign.this;
            if (z) {
                AppBarShadowView appBarShadowView = contactsListFragmentRedesign.n0;
                (appBarShadowView != null ? appBarShadowView : null).setForceMode(0);
            } else {
                AppBarShadowView appBarShadowView2 = contactsListFragmentRedesign.n0;
                (appBarShadowView2 != null ? appBarShadowView2 : null).setForceMode(2);
            }
        }
    }

    /* compiled from: ContactsListFragmentRedesign.kt */
    public static final class c extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.l0;
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final com.vk.im.ui.components.contacts.a eo() {
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar != null ? a1wVar : null;
        mxv c2 = g2v.c();
        a1w a1wVar3 = q1w.a;
        if (a1wVar3 == null) {
            a1wVar3 = null;
        }
        cau0 cau0Var = a1wVar3.r().h;
        bc6 L = xa4.L(requireContext());
        b bVar = new b();
        ContactsListFactory contactsListFactory = this.a0;
        if (contactsListFactory == null) {
            contactsListFactory = null;
        }
        Set<ContactsViews> invoke = contactsListFactory.s().invoke();
        ContactsListFactory contactsListFactory2 = this.a0;
        if (contactsListFactory2 == null) {
            contactsListFactory2 = null;
        }
        boolean j = contactsListFactory2.j();
        ContactsListFactory contactsListFactory3 = this.a0;
        if (contactsListFactory3 == null) {
            contactsListFactory3 = null;
        }
        boolean n = contactsListFactory3.n();
        ContactsListFactory contactsListFactory4 = this.a0;
        if (contactsListFactory4 == null) {
            contactsListFactory4 = null;
        }
        izs<x8j, e1w<ContactsList>> k = contactsListFactory4.k();
        ContactsListFactory contactsListFactory5 = this.a0;
        if (contactsListFactory5 == null) {
            contactsListFactory5 = null;
        }
        izs<w8j, e1w<pbm>> h = contactsListFactory5.h();
        ContactsListFactory contactsListFactory6 = this.a0;
        if (contactsListFactory6 == null) {
            contactsListFactory6 = null;
        }
        boolean i = contactsListFactory6.i();
        ContactsListFactory contactsListFactory7 = this.a0;
        if (contactsListFactory7 == null) {
            contactsListFactory7 = null;
        }
        boolean q = contactsListFactory7.q();
        SortOrder sortOrder = this.c0;
        SortOrder sortOrder2 = sortOrder != null ? sortOrder : null;
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        return new com.vk.im.ui.components.contacts.a(a1wVar2, c2, cau0Var, L, bVar, invoke, j, n, k, sortOrder2, 0, false, 0, null, null, null, i, true, q, null, null, null, h, false, com.vk.toggle.b.A.a(imFeatures), false, 1390664192);
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final ImContactsListFragment.b fo() {
        return new b();
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    /* renamed from: go */
    public final FragmentImpl.b Jn() {
        return this.l0;
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final void ko() {
        TextView textView = this.U;
        if (textView == null) {
            textView = null;
        }
        String str = this.b0;
        if (str == null) {
            str = null;
        }
        textView.setText(str);
        Toolbar toolbar = this.T;
        if (toolbar == null) {
            toolbar = null;
        }
        int a2 = iah0.a(16);
        if (toolbar.u == null) {
            toolbar.u = new ypg0();
        }
        toolbar.u.g(a2, 0);
        Toolbar toolbar2 = this.T;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationIcon((Drawable) null);
        Toolbar toolbar3 = this.T;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        toolbar3.getMenu().clear();
        Toolbar toolbar4 = this.T;
        if (toolbar4 == null) {
            toolbar4 = null;
        }
        toolbar4.setNavigationOnClickListener(new mn9(this, 2));
        AppBarLayout appBarLayout = this.Y;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        Toolbar toolbar5 = this.T;
        if (toolbar5 == null) {
            toolbar5 = null;
        }
        TextView textView2 = this.U;
        if (textView2 == null) {
            textView2 = null;
        }
        String str2 = this.b0;
        if (str2 == null) {
            str2 = null;
        }
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("icon_res") : 0;
        sa30.P(appBarLayout, toolbar5, textView2, str2, i != 0 ? Integer.valueOf(i) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final void lo() {
        VkTopBar vkTopBar = this.S;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        tlo0.a aVar = tlo0.Companion;
        String str = this.b0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(aVar, str != null ? str : null), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        vkTopBar.setBack(new VkTopBar.b(new n5i(this, 1), null, null, null, null, 30));
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_contacts_fragment_redesign, viewGroup, false);
        jo((ViewStub) viewGroup2.findViewById(R.id.im_appbar_stub));
        this.W = (ViewGroup) viewGroup2.findViewById(R.id.vkim_list_container);
        this.m0 = (VkSearchView) viewGroup2.findViewById(R.id.redesign_search_view);
        this.n0 = (AppBarShadowView) viewGroup2.findViewById(R.id.search_shadow_view);
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            AppBarShadowView appBarShadowView = this.n0;
            if (appBarShadowView == null) {
                appBarShadowView = null;
            }
            f4m.j(appBarShadowView);
        } else {
            AppBarShadowView appBarShadowView2 = this.n0;
            if (appBarShadowView2 == null) {
                appBarShadowView2 = null;
            }
            appBarShadowView2.setForceMode(0);
        }
        ViewGroup viewGroup3 = this.W;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        com.vk.im.ui.components.contacts.a aVar = this.Z;
        viewGroup3.addView((aVar != null ? aVar : null).F0(viewGroup2, bundle));
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.o0;
        if (cVar != null) {
            cVar.dispose();
        }
        VkSearchView vkSearchView = this.m0;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        aqx0.a(vkSearchView, null);
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkSearchView vkSearchView = this.m0;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        vkSearchView.X4(false);
        VkSearchView vkSearchView2 = this.m0;
        if (vkSearchView2 == null) {
            vkSearchView2 = null;
        }
        this.o0 = d02.y(vkSearchView2, 0L, 3).subscribe(new um0(new dsc(this, 16), 22));
        VkSearchView vkSearchView3 = this.m0;
        VkSearchView vkSearchView4 = vkSearchView3 != null ? vkSearchView3 : null;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        aqx0.a(vkSearchView4, this.p0);
    }

    /* compiled from: ContactsListFragmentRedesign.kt */
    public static final class d extends aqx0.b {
        public d() {
            super(0);
        }

        @Override // xsna.aqx0.b
        public final void a(aqx0 aqx0Var) {
            ContactsListFragmentRedesign contactsListFragmentRedesign = ContactsListFragmentRedesign.this;
            VkSearchView vkSearchView = contactsListFragmentRedesign.m0;
            if (vkSearchView == null) {
                vkSearchView = null;
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            bqx0 a = iut0.e.a(vkSearchView);
            if (a != null ? a.a.u(8) : false) {
                return;
            }
            VkSearchView vkSearchView2 = contactsListFragmentRedesign.m0;
            if (vkSearchView2 == null) {
                vkSearchView2 = null;
            }
            if (vkSearchView2.w.isFocused()) {
                VkSearchView vkSearchView3 = contactsListFragmentRedesign.m0;
                (vkSearchView3 != null ? vkSearchView3 : null).T4();
            }
        }

        @Override // xsna.aqx0.b
        public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
            return bqx0Var;
        }
    }
}
