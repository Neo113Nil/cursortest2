package com.vk.im.ui.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.a;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a1w;
import xsna.a6p;
import xsna.afw;
import xsna.b1j;
import xsna.b25;
import xsna.bc6;
import xsna.bzb0;
import xsna.c5v0;
import xsna.cau0;
import xsna.cwb0;
import xsna.d22;
import xsna.dfw;
import xsna.dhr0;
import xsna.e1w;
import xsna.f4m;
import xsna.fbh;
import xsna.fpf0;
import xsna.g2v;
import xsna.gko;
import xsna.gv5;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.jbs;
import xsna.k9u0;
import xsna.l380;
import xsna.lpj;
import xsna.m33;
import xsna.m7m;
import xsna.msy;
import xsna.mxv;
import xsna.o0w;
import xsna.o25;
import xsna.oq;
import xsna.oz50;
import xsna.p5h;
import xsna.pbm;
import xsna.q1w;
import xsna.q2a0;
import xsna.qas;
import xsna.qcy;
import xsna.qhh0;
import xsna.qtd0;
import xsna.qv20;
import xsna.r230;
import xsna.sa30;
import xsna.tlo0;
import xsna.tq;
import xsna.tzv;
import xsna.ui90;
import xsna.uko;
import xsna.uzv;
import xsna.vb;
import xsna.vbs;
import xsna.w8j;
import xsna.x01;
import xsna.x8j;
import xsna.xa4;
import xsna.y1z;
import xsna.ypg0;
import xsna.z4w;

/* compiled from: ImContactsListFragment.kt */
/* loaded from: classes2.dex */
public class ImContactsListFragment extends ImFragment implements qhh0, gv5, r230 {
    public static final /* synthetic */ qcy<Object>[] k0;
    public final c P = new c();
    public final mxv Q = g2v.c();
    public final a1w R;
    public VkTopBar S;
    public Toolbar T;
    public TextView U;
    public View V;
    public ViewGroup W;
    public ViewStub X;
    public AppBarLayout Y;
    public com.vk.im.ui.components.contacts.a Z;
    public ContactsListFactory a0;
    public String b0;
    public SortOrder c0;
    public bzb0 d0;
    public int e0;
    public final Object f0;
    public com.vk.im.ui.components.contacts.c g0;
    public boolean h0;
    public final e i0;
    public final qas j0;

    /* compiled from: ImContactsListFragment.kt */
    public static class a extends oz50 {
        public a(Class<? extends FragmentImpl> cls) {
            super(cls, null, null);
            this.j.putSerializable("factory", ContactsListFactory.CONTACTS_LIST_VKME);
            this.j.putString("force_entry_point_for_create_contact", "contact_list_me_create_contact");
        }

        public final void A(String str) {
            this.j.putString("title", str);
        }

        public final void y(int i) {
            this.j.putInt("icon_res", i);
        }

        public final void z(boolean z) {
            this.j.putBoolean("needShowPersChanOnboarding", z);
        }
    }

    /* compiled from: ImContactsListFragment.kt */
    public static final class c extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: ImContactsListFragment.kt */
    public static final class d {
        public d() {
        }
    }

    /* compiled from: ImContactsListFragment.kt */
    public static final class e implements ui90.a {
        public e() {
        }

        @Override // xsna.ui90.a
        public final void b(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2) {
            FragmentImpl fragmentImpl3 = fragmentImpl != null ? fragmentImpl : null;
            if (fragmentImpl3 == null) {
                return;
            }
            qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
            ImContactsListFragment imContactsListFragment = ImContactsListFragment.this;
            vbs Ln = imContactsListFragment.Ln();
            com.vk.core.fragments.a aVar = Ln != null ? Ln.h : null;
            if (aVar == null || !aVar.y(fragmentImpl3) || fragmentImpl == imContactsListFragment) {
                return;
            }
            imContactsListFragment.h0 = true;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImContactsListFragment.class, "createContactEntryPoint", "getCreateContactEntryPoint()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        k0 = new qcy[]{propertyReference1Impl};
    }

    public ImContactsListFragment() {
        a1w a1wVar = q1w.a;
        this.R = a1wVar == null ? null : a1wVar;
        this.f0 = msy.a(LazyThreadSafetyMode.NONE, new fbh(this, 26));
        this.h0 = true;
        this.i0 = new e();
        this.j0 = new qas("force_entry_point_for_create_contact", "contact_list_me_create_contact");
    }

    @Override // xsna.r230
    public final boolean Ya() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public boolean a0() {
        com.vk.im.ui.components.contacts.c cVar = this.g0;
        if (cVar != null) {
            return cVar.a1();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    public com.vk.im.ui.components.contacts.a eo() {
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar != null ? a1wVar : null;
        mxv c2 = g2v.c();
        a1w a1wVar3 = q1w.a;
        if (a1wVar3 == null) {
            a1wVar3 = null;
        }
        cau0 cau0Var = a1wVar3.r().h;
        bc6 L = xa4.L(requireContext());
        b fo = fo();
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
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("needShowPersChanOnboarding") : false;
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        return new com.vk.im.ui.components.contacts.a(a1wVar2, c2, cau0Var, L, fo, invoke, j, n, k, sortOrder2, 0, false, 0, null, null, null, i, true, q, null, null, null, h, z, com.vk.toggle.b.A.a(imFeatures), ((Boolean) this.f0.getValue()).booleanValue(), 249821696);
    }

    public b fo() {
        return new b();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    /* renamed from: go, reason: merged with bridge method [inline-methods] */
    public FragmentImpl.b Jn() {
        return this.P;
    }

    public final ViewGroup ho() {
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            VkTopBar vkTopBar = this.S;
            if (vkTopBar != null) {
                return vkTopBar;
            }
            return null;
        }
        Toolbar toolbar = this.T;
        if (toolbar != null) {
            return toolbar;
        }
        return null;
    }

    public final com.vk.im.ui.components.contacts.c io() {
        com.vk.im.ui.components.contacts.c cVar = this.g0;
        if (cVar != null) {
            return cVar;
        }
        ViewGroup viewGroup = (ViewGroup) requireView();
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar != null ? a1wVar : null;
        mxv c2 = g2v.c();
        b25 a2 = o25.a();
        Context requireContext = requireContext();
        ContactsListFactory contactsListFactory = this.a0;
        if (contactsListFactory == null) {
            contactsListFactory = null;
        }
        boolean j = contactsListFactory.j();
        ContactsListFactory contactsListFactory2 = this.a0;
        if (contactsListFactory2 == null) {
            contactsListFactory2 = null;
        }
        boolean o = contactsListFactory2.o();
        ContactsListFactory contactsListFactory3 = this.a0;
        if (contactsListFactory3 == null) {
            contactsListFactory3 = null;
        }
        boolean p = contactsListFactory3.p();
        a6p x7 = ((EduCommonComponent) m7m.d(this).mo408a(fpf0.a(EduCommonComponent.class))).x7();
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        com.vk.im.ui.components.contacts.c cVar2 = new com.vk.im.ui.components.contacts.c(a1wVar2, c2, a2, requireContext, j, o, p, x7, com.vk.toggle.b.A.a(imFeatures));
        Context requireContext2 = requireContext();
        ViewStub viewStub = this.X;
        if (viewStub == null) {
            viewStub = null;
        }
        cVar2.D0(requireContext2, viewGroup, viewStub, null);
        this.g0 = cVar2;
        cVar2.B = new d();
        this.O.add(cVar2);
        return cVar2;
    }

    public final void jo(ViewStub viewStub) {
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            viewStub.setLayoutResource(R.layout.vkim_contacts_appbar);
            AppBarLayout appBarLayout = (AppBarLayout) viewStub.inflate();
            this.Y = appBarLayout;
            this.S = (VkTopBar) (appBarLayout != null ? appBarLayout : null).findViewById(R.id.im_topbar);
            return;
        }
        viewStub.setLayoutResource(R.layout.vkim_contacts_appbar_old);
        AppBarLayout appBarLayout2 = (AppBarLayout) viewStub.inflate();
        this.Y = appBarLayout2;
        if (appBarLayout2 == null) {
            appBarLayout2 = null;
        }
        this.T = (Toolbar) appBarLayout2.findViewById(R.id.im_toolbar);
        AppBarLayout appBarLayout3 = this.Y;
        this.U = (TextView) (appBarLayout3 != null ? appBarLayout3 : null).findViewById(R.id.vkim_toolbar_title);
    }

    public void ko() {
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
        toolbar3.l(R.menu.vkim_menu_contacts);
        Toolbar toolbar4 = this.T;
        if (toolbar4 == null) {
            toolbar4 = null;
        }
        toolbar4.setNavigationOnClickListener(new x01(this, 2));
        Bundle arguments = getArguments();
        if (!(arguments != null ? arguments.getBoolean("EXTERNAL_SEARCH") : false)) {
            Toolbar toolbar5 = this.T;
            if (toolbar5 == null) {
                toolbar5 = null;
            }
            toolbar5.setOnMenuItemClickListener(new d22(this, 22));
        }
        AppBarLayout appBarLayout = this.Y;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        Toolbar toolbar6 = this.T;
        if (toolbar6 == null) {
            toolbar6 = null;
        }
        TextView textView2 = this.U;
        if (textView2 == null) {
            textView2 = null;
        }
        String str2 = this.b0;
        if (str2 == null) {
            str2 = null;
        }
        Bundle arguments2 = getArguments();
        int i = arguments2 != null ? arguments2.getInt("icon_res") : 0;
        sa30.P(appBarLayout, toolbar6, textView2, str2, i != 0 ? Integer.valueOf(i) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public void lo() {
        VkTopBar vkTopBar = this.S;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        tlo0.a aVar = tlo0.Companion;
        String str = this.b0;
        if (str == null) {
            str = null;
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(aVar, str), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(((Boolean) this.f0.getValue()).booleanValue() ? R.drawable.vk_icon_lego_search_28 : R.drawable.vk_icon_search_24), new tlo0.f(R.string.search), new tzv(this, 0), null, null, null, 56), null, 6));
        vkTopBar.setBack(new VkTopBar.b(new p5h(this, 24), null, null, null, null, 30));
    }

    public void mo() {
        throw new UnsupportedOperationException("Unexpected method call! ImCreateConversationFragment should be used");
    }

    public void no() {
        throw new UnsupportedOperationException("Unexpected method call! ImCreateConversationFragment should be used");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("factory") : null;
        ContactsListFactory contactsListFactory = serializable instanceof ContactsListFactory ? (ContactsListFactory) serializable : null;
        if (contactsListFactory == null) {
            contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKME;
        }
        this.a0 = contactsListFactory;
        Bundle arguments2 = getArguments();
        this.b0 = (arguments2 == null || !arguments2.containsKey("TITLE_RES")) ? (arguments2 == null || !arguments2.containsKey("title")) ? requireContext().getString(R.string.im_accessibility_contacts_tab) : arguments2.getString("title") : requireContext().getString(arguments2.getInt("TITLE_RES"));
        Bundle arguments3 = getArguments();
        Serializable serializable2 = arguments3 != null ? arguments3.getSerializable("sort") : null;
        SortOrder sortOrder = serializable2 instanceof SortOrder ? (SortOrder) serializable2 : null;
        if (sortOrder == null) {
            sortOrder = SortOrder.BY_NAME;
        }
        this.c0 = sortOrder;
        com.vk.im.ui.components.contacts.a eo = eo();
        this.Z = eo;
        this.O.add(eo);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d0 = new bzb0(kn());
        vbs Ln = Ln();
        com.vk.core.fragments.a aVar = Ln != null ? Ln.h : null;
        if (aVar != null) {
            aVar.z(this.i0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_contacts_fragment, viewGroup, false);
        this.V = viewGroup2.findViewById(R.id.im_appbar_shadow);
        this.W = (ViewGroup) viewGroup2.findViewById(R.id.vkim_list_container);
        this.X = (ViewStub) viewGroup2.findViewById(R.id.im_contacts_search_stub);
        jo((ViewStub) viewGroup2.findViewById(R.id.im_appbar_stub));
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            View view = this.V;
            if (view == null) {
                view = null;
            }
            f4m.j(view);
        }
        ViewGroup viewGroup3 = this.W;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        com.vk.im.ui.components.contacts.a aVar = this.Z;
        viewGroup3.addView((aVar != null ? aVar : null).F0(viewGroup2, bundle));
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        bzb0 bzb0Var = this.d0;
        if (bzb0Var == null) {
            bzb0Var = null;
        }
        bzb0Var.a();
        vbs Ln = Ln();
        com.vk.core.fragments.a aVar = Ln != null ? Ln.h : null;
        if (aVar != null) {
            aVar.u(this.i0);
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.R.x(l380.b);
        b25 a2 = o25.a();
        a1w a1wVar = this.R;
        Peer q = a1wVar.q();
        cau0 cau0Var = a1wVar.r().h;
        q.getClass();
        if (q.Ab(Peer.Type.GROUP)) {
            return;
        }
        if ((!o25.b(a2) || a2.i().S) && this.h0) {
            int i = 0;
            this.h0 = false;
            this.Q.getClass();
            boolean b2 = k9u0.a.b(requireContext());
            a1w a1wVar2 = q1w.a;
            if (a1wVar2 == null) {
                a1wVar2 = null;
            }
            a1wVar2.r().getClass();
            if (b2) {
                return;
            }
            ContactsListFactory contactsListFactory = this.a0;
            if (contactsListFactory == null) {
                contactsListFactory = null;
            }
            if (contactsListFactory.r()) {
                boolean b3 = o25.b(o25.a());
                bzb0 bzb0Var = this.d0;
                bzb0 bzb0Var2 = bzb0Var == null ? null : bzb0Var;
                Context requireContext = requireContext();
                int c2 = dhr0.t.c(R.attr.vk_ui_icon_accent_themed);
                cwb0.c1.b bVar = cwb0.c1.b.a;
                uko.a aVar = uko.a;
                bzb0.d(bzb0Var2, new cwb0.r(b3 ? R.string.vkim_popup_edu_contacts_permission_title : R.string.vkim_popup_contacts_permission_title, null, b3 ? R.string.vkim_popup_edu_contacts_permission_descr : R.string.vkim_popup_contacts_permission_descr, null, R.string.im_contacts_permission_bootom_sheet_positive, null, 0, null, uko.e(m33.a(R.drawable.ic_contacts_book_outline_56, requireContext), ColorStateList.valueOf(c2)), bVar, 234), new uzv(this, b3, i), null, null, 28);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.vk.im.ui.components.contacts.a aVar = this.Z;
        if (aVar == null) {
            aVar = null;
        }
        aVar.P0(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            lo();
        } else {
            ko();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        com.vk.im.ui.components.contacts.a aVar = this.Z;
        if (aVar == null) {
            aVar = null;
        }
        aVar.O0(bundle);
    }

    public void oo(boolean z) {
        throw new UnsupportedOperationException("Unexpected method call! ImCreateConversationFragment should be used");
    }

    public void po(qtd0 qtd0Var) {
        String string;
        boolean k5 = qtd0Var.k5();
        String str = "contacts";
        if (k5) {
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("force_entry_point_for_new")) != null) {
                str = string;
            }
        } else if (k5) {
            throw new NoWhenBranchMatchedException();
        }
        qo(qtd0Var, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if ((r3 != null ? r3.n : true) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qo(qtd0 qtd0Var, String str) {
        boolean z;
        ContactsListFactory contactsListFactory = this.a0;
        if (contactsListFactory == null) {
            contactsListFactory = null;
        }
        if (contactsListFactory.l()) {
            Contact contact = qtd0Var instanceof Contact ? (Contact) qtd0Var : null;
            z = true;
        }
        z = false;
        o0w.x(this.Q.b(), kn(), null, qtd0Var.G3(), qv20.m(qtd0Var), null, null, false, null, null, null, null, null, null, str, null, null, null, z, null, null, null, null, null, 1071636466);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        com.vk.im.ui.components.contacts.c cVar = this.g0;
        if (cVar != null && cVar.a1()) {
            return true;
        }
        com.vk.im.ui.components.contacts.a aVar = this.Z;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.j1();
    }

    /* compiled from: ImContactsListFragment.kt */
    public class b implements a.InterfaceC1144a {
        public b() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void b(q2a0 q2a0Var) {
            Peer.Type t8 = q2a0Var.t8();
            Peer.Type type = Peer.Type.UNKNOWN;
            ImContactsListFragment imContactsListFragment = ImContactsListFragment.this;
            if (t8 == type) {
                imContactsListFragment.Q.getClass();
                k9u0.a.g(imContactsListFragment.kn(), q2a0Var);
            } else {
                qas qasVar = imContactsListFragment.j0;
                qcy<Object> qcyVar = ImContactsListFragment.k0[0];
                imContactsListFragment.qo(q2a0Var, (String) qasVar.b(imContactsListFragment));
            }
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void d(boolean z) {
            ImContactsListFragment.this.oo(z);
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void e(Peer peer) {
            new z4w(ImContactsListFragment.this.requireContext(), peer, null).show();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void g() {
            ImContactsListFragment.this.mo();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final boolean h(qtd0 qtd0Var) {
            return true;
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void k(int i, List list) {
            if (list.isEmpty()) {
                return;
            }
            qtd0 qtd0Var = (qtd0) j5g.Y(list);
            ImContactsListFragment imContactsListFragment = ImContactsListFragment.this;
            imContactsListFragment.po(qtd0Var);
            com.vk.im.ui.components.contacts.a aVar = imContactsListFragment.Z;
            if (aVar == null) {
                aVar = null;
            }
            aVar.Z0();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void l() {
            ImContactsListFragment.this.no();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void m() {
            qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
            ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
            imFeatures.getClass();
            boolean a = com.vk.toggle.b.A.a(imFeatures);
            ImContactsListFragment imContactsListFragment = ImContactsListFragment.this;
            if (!a) {
                new afw(imContactsListFragment.requireContext(), new jbs(imContactsListFragment)).show();
                return;
            }
            Context requireContext = imContactsListFragment.requireContext();
            dfw dfwVar = new dfw(requireContext, ((ImCmdCoroutinesExecutorComponent) m7m.d(imContactsListFragment).a(fpf0.a(ImCmdCoroutinesExecutorComponent.class))).g(), ((AuthBridgeComponent) m7m.d(imContactsListFragment).a(fpf0.a(AuthBridgeComponent.class))).s(), ((BridgeComponent) m7m.d(imContactsListFragment).a(fpf0.a(BridgeComponent.class))).F());
            c5v0.c cVar = null;
            View view = dfwVar.f;
            VkModal vkModal = new VkModal(VkModal.Mode.Card, new b.a.C0790b(cVar, new c5v0.b(12, tq.h(tlo0.Companion, R.string.vkim_contacts_write_by_phone_number_popup_title), new tlo0.f(R.string.vkim_contacts_write_by_phone_number_popup_description)), view, null, 25), new b1j(dfwVar, 27), false, 4);
            vkModal.b(requireContext, null);
            dfwVar.i = vkModal;
            dfwVar.h.getEditText().postDelayed(new vb(dfwVar, 10), 200L);
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void c() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void f() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public void a(boolean z) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void i(qtd0 qtd0Var) {
        }
    }
}
