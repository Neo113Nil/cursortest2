package com.vk.im.ui.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.contacts.AndroidContact;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.SelectedMembers;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.a;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.a1w;
import xsna.afw;
import xsna.awt0;
import xsna.b8g;
import xsna.bc6;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cau0;
import xsna.d02;
import xsna.dhr0;
import xsna.dxh;
import xsna.e1w;
import xsna.e3m;
import xsna.ekh;
import xsna.eqq;
import xsna.f4m;
import xsna.fgm;
import xsna.fnj;
import xsna.foi;
import xsna.g2v;
import xsna.g5z;
import xsna.gko;
import xsna.gv5;
import xsna.iah0;
import xsna.ies;
import xsna.ikv0;
import xsna.izs;
import xsna.j5g;
import xsna.jbs;
import xsna.jgq;
import xsna.jjc;
import xsna.lcw;
import xsna.lpj;
import xsna.m33;
import xsna.mcw;
import xsna.mxv;
import xsna.myc0;
import xsna.nyq;
import xsna.o3p0;
import xsna.oq;
import xsna.oz50;
import xsna.pbm;
import xsna.pf1;
import xsna.q1w;
import xsna.q2a0;
import xsna.qhh0;
import xsna.qtd0;
import xsna.rl3;
import xsna.s3q0;
import xsna.sbg;
import xsna.tcn;
import xsna.tlo0;
import xsna.tq;
import xsna.utk0;
import xsna.v9b;
import xsna.vam;
import xsna.vfk;
import xsna.vtk0;
import xsna.w8j;
import xsna.x8j;
import xsna.x8m;
import xsna.xa4;
import xsna.y1z;
import xsna.z4w;

/* compiled from: ImSelectContactsFragment.kt */
/* loaded from: classes2.dex */
public class ImSelectContactsFragment extends ImFragment implements qhh0, ies, gv5 {
    public static final int v0 = iah0.a(68);
    public VkTopBar Q;
    public Toolbar R;
    public o3p0 S;
    public VkButton T;
    public VkBottomBar U;
    public BottomConfirmButton V;
    public FrameLayout W;
    public View X;
    public TextView Y;
    public ImageView Z;
    public ImageView a0;
    public ViewGroup b0;
    public com.vk.im.ui.components.contacts.a c0;
    public ContactsListFactory d0;
    public String e0;
    public String f0;
    public String g0;
    public String h0;
    public Set<Long> i0;
    public Set<Long> j0;
    public Drawable k0;
    public Peer m0;
    public String n0;
    public final boolean t0;
    public final bpn0 u0;
    public final c P = new c();
    public boolean l0 = true;
    public int o0 = 1;
    public boolean p0 = true;
    public int q0 = Integer.MAX_VALUE;
    public final b r0 = new b();
    public final utk0 s0 = vtk0.a("");

    /* compiled from: ImSelectContactsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(ImSelectContactsFragment.class, null, null);
            s(true);
            y(true);
        }

        public final void A(boolean z) {
            this.j.putBoolean("multiselect", z);
        }

        public final void B(boolean z, boolean z2) {
            Bundle bundle = this.j;
            if (z2) {
                bundle.putInt("searchMode", 2);
            } else if (z) {
                bundle.putInt("searchMode", 0);
            } else {
                bundle.putInt("searchMode", 1);
            }
        }

        public final void C(List list) {
            this.j.putStringArray("selectedPhoneNumbers", (String[]) list.toArray(new String[0]));
        }

        public final void D(ArrayList arrayList) {
            this.j.putLongArray("selected_ids", j5g.P0(arrayList));
        }

        public final void E(String str) {
            this.j.putString("text", str);
        }

        public final void F(Integer num, String str) {
            Bundle bundle = this.j;
            bundle.putString("description", str);
            bundle.putInt("description_icon", num != null ? num.intValue() : 0);
        }

        public final void G(ContactsListFactory contactsListFactory) {
            this.j.putSerializable("factory", contactsListFactory);
        }

        public final void H() {
            this.j.putInt("max_selection_count", Integer.MAX_VALUE);
        }

        public final void I(Peer peer, boolean z) {
            Bundle bundle = this.j;
            bundle.putParcelable("root_dialog_peer", peer);
            bundle.putBoolean("root_dialog_mark_inchat", z);
        }

        public final void J(String str) {
            this.j.putString("root_dialog_title", str);
        }

        public final void K(String str) {
            this.j.putString("hint", str);
        }

        public final void L(String str) {
            this.j.putString("title", str);
        }

        public final void M(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this.j.putSerializable("visitSource", mobileOfficialAppsCoreNavStat$EventScreen);
        }

        public final void y(boolean z) {
            this.j.putBoolean("allow_empty", z);
        }

        public final void z(ArrayList arrayList) {
            this.j.putLongArray("ids", j5g.P0(arrayList));
        }
    }

    /* compiled from: ImSelectContactsFragment.kt */
    public static final class c extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public ImSelectContactsFragment() {
        ImFeatures imFeatures = ImFeatures.IM_SELECT_CONTACTS_FR_REDESIGN;
        imFeatures.getClass();
        this.t0 = com.vk.toggle.b.A.a(imFeatures);
        this.u0 = new bpn0(new foi(this, 14));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.P;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        boolean z = this.t0;
        if (z) {
            VkTopBar vkTopBar = this.Q;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            if (vkTopBar.getMiddle() instanceof VkTopBar.Middle.d) {
                ho();
                return true;
            }
        }
        if (!z) {
            o3p0 o3p0Var = this.S;
            if (o3p0Var == null) {
                o3p0Var = null;
            }
            if (o3p0Var.a()) {
                return true;
            }
        }
        com.vk.im.ui.components.contacts.a aVar = this.c0;
        if (aVar == null) {
            aVar = null;
        }
        if (((Collection) aVar.b1().r).isEmpty()) {
            return false;
        }
        com.vk.im.ui.components.contacts.a aVar2 = this.c0;
        (aVar2 != null ? aVar2 : null).Z0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final void eo() {
        UiTracker.b();
        com.vk.im.ui.components.contacts.a aVar = this.c0;
        if (aVar == null) {
            aVar = null;
        }
        ?? r0 = aVar.b1().r;
        Peer peer = this.m0;
        if (peer == null || !peer.Ab(Peer.Type.USER)) {
            go(r0);
            return;
        }
        com.vk.im.ui.components.contacts.a aVar2 = this.c0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        jgq jgqVar = aVar2.b1().d().k;
        com.vk.im.ui.components.contacts.a aVar3 = this.c0;
        List<qtd0> list = (aVar3 != null ? aVar3 : null).b1().d().a;
        Intent intent = new Intent();
        boolean z = jgqVar.a;
        ArrayList arrayList = new ArrayList();
        if (r0.size() <= 500) {
            Iterable iterable = (Iterable) r0;
            ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((qtd0) it.next()).G3()));
            }
            arrayList.addAll(arrayList2);
        } else {
            List t0 = j5g.t0(list, (Iterable) r0);
            ArrayList arrayList3 = new ArrayList(c5g.u(t0, 10));
            Iterator it2 = t0.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((qtd0) it2.next()).G3()));
            }
            arrayList.addAll(arrayList3);
            z = !z;
        }
        intent.putExtra("ids", j5g.P0(arrayList));
        intent.putExtra("channel_select_all", z);
        intent.putExtra("channel_select_subscribers", jgqVar.b);
        s3q0 s3q0Var = s3q0.a;
        Mf(-1, intent);
    }

    public final boolean fo() {
        return ((Boolean) this.u0.getValue()).booleanValue();
    }

    public void go(List<? extends qtd0> list) {
        Intent intent = new Intent();
        List<? extends qtd0> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!(((qtd0) obj) instanceof com.vk.im.engine.models.contacts.a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof com.vk.im.engine.models.contacts.a) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.vk.im.engine.models.contacts.a) it.next()).b);
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Long.valueOf(((qtd0) it2.next()).G3()));
        }
        intent.putExtra("ids", j5g.P0(arrayList4));
        intent.putExtra("selectedContacts", (Parcelable[]) arrayList3.toArray(new AndroidContact[0]));
        intent.putExtra("based_on_other_chat", this.m0 != null);
        s3q0 s3q0Var = s3q0.a;
        Mf(-1, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ho() {
        requireContext();
        VkTopBar vkTopBar = this.Q;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        tlo0.a aVar = tlo0.Companion;
        String str = this.e0;
        if (str == null) {
            str = null;
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(aVar, str), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        VkTopBar vkTopBar2 = this.Q;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        gko.b bVar = gko.Companion;
        vkTopBar2.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_lego_search_28), null, new sbg(this, 27), null, new b8g(e3m.f(R.attr.vk_ui_icon_accent_themed, requireContext())), com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.Merge, new x8m(13), 2), 10), null, 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        String string;
        String string2;
        String string3;
        String str;
        Set<Long> set;
        Set<Long> set2;
        long[] longArray;
        long[] longArray2;
        int i;
        super.onAttach(activity);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("factory") : null;
        ContactsListFactory contactsListFactory = serializable instanceof ContactsListFactory ? (ContactsListFactory) serializable : null;
        Peer peer = arguments != null ? (Peer) arguments.getParcelable("root_dialog_peer") : null;
        if (peer == null) {
            peer = null;
        }
        boolean z = peer != null;
        boolean z2 = arguments != null ? arguments.getBoolean("root_dialog_mark_inchat") : false;
        if (contactsListFactory == null) {
            contactsListFactory = (z && z2) ? ContactsListFactory.SELECT_USERS_TO_EXISTED_CHAT : z ? ContactsListFactory.SELECT_USERS_TO_NEW_BASED_ON_EXISTED_CHAT : ContactsListFactory.SELECT_USERS_TO_NEW_CHAT;
        }
        this.d0 = contactsListFactory;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("title")) == null) {
            string = requireContext().getString(R.string.im_accessibility_contacts_tab);
        }
        this.e0 = string;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("hint")) == null) {
            string2 = requireContext().getString(R.string.vkim_empty_selection_hint);
        }
        this.f0 = string2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("text")) == null) {
            string3 = requireContext().getString(R.string.vkim_create_chat);
        }
        this.g0 = string3;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str = arguments5.getString("description")) == null) {
            str = "";
        }
        this.h0 = str;
        Bundle arguments6 = getArguments();
        this.k0 = (arguments6 == null || (i = arguments6.getInt("description_icon")) == 0) ? null : m33.a(i, requireContext());
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (longArray2 = arguments7.getLongArray("ids")) == null || (set = rl3.x0(longArray2)) == null) {
            set = EmptySet.b;
        }
        this.i0 = set;
        Bundle arguments8 = getArguments();
        if (arguments8 == null || (longArray = arguments8.getLongArray("selected_ids")) == null || (set2 = rl3.x0(longArray)) == null) {
            set2 = EmptySet.b;
        }
        this.j0 = set2;
        Bundle arguments9 = getArguments();
        Peer peer2 = arguments9 != null ? (Peer) arguments9.getParcelable("root_dialog_peer") : null;
        if (peer2 == null) {
            peer2 = null;
        }
        this.m0 = peer2;
        Bundle arguments10 = getArguments();
        this.n0 = arguments10 != null ? arguments10.getString("root_dialog_title") : null;
        Bundle arguments11 = getArguments();
        this.l0 = arguments11 != null ? arguments11.getBoolean("allow_empty") : true;
        Bundle arguments12 = getArguments();
        this.p0 = arguments12 != null ? arguments12.getBoolean("multiselect") : true;
        Bundle arguments13 = getArguments();
        this.o0 = arguments13 != null ? arguments13.getInt("searchMode", 1) : 1;
        Bundle arguments14 = getArguments();
        this.q0 = arguments14 != null ? arguments14.getInt("max_selection_count", Integer.MAX_VALUE) : Integer.MAX_VALUE;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List list;
        String[] stringArray;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (stringArray = arguments.getStringArray("selectedPhoneNumbers")) == null || (list = rl3.u0(stringArray)) == null) {
            list = EmptyList.b;
        }
        List list2 = list;
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar != null ? a1wVar : null;
        mxv c2 = g2v.c();
        a1w a1wVar3 = q1w.a;
        if (a1wVar3 == null) {
            a1wVar3 = null;
        }
        cau0 cau0Var = a1wVar3.r().h;
        bc6 L = xa4.L(requireContext());
        b bVar = this.r0;
        ContactsListFactory contactsListFactory = this.d0;
        if (contactsListFactory == null) {
            contactsListFactory = null;
        }
        Set<ContactsViews> invoke = contactsListFactory.s().invoke();
        ContactsListFactory contactsListFactory2 = this.d0;
        if (contactsListFactory2 == null) {
            contactsListFactory2 = null;
        }
        boolean j = contactsListFactory2.j();
        ContactsListFactory contactsListFactory3 = this.d0;
        if (contactsListFactory3 == null) {
            contactsListFactory3 = null;
        }
        boolean n = contactsListFactory3.n();
        ContactsListFactory contactsListFactory4 = this.d0;
        if (contactsListFactory4 == null) {
            contactsListFactory4 = null;
        }
        izs<x8j, e1w<ContactsList>> k = contactsListFactory4.k();
        ContactsListFactory contactsListFactory5 = this.d0;
        if (contactsListFactory5 == null) {
            contactsListFactory5 = null;
        }
        izs<w8j, e1w<pbm>> h = contactsListFactory5.h();
        boolean z = this.p0;
        String str = this.f0;
        String str2 = str == null ? null : str;
        SortOrder sortOrder = SortOrder.BY_NAME;
        int i = this.o0;
        Set<Long> set = this.i0;
        Set<Long> set2 = set == null ? null : set;
        Serializer.c<SelectedMembers> cVar = SelectedMembers.CREATOR;
        Set<Long> set3 = this.j0;
        SelectedMembers a2 = SelectedMembers.a.a(set3 != null ? set3 : null);
        int i2 = this.q0;
        Peer peer = this.m0;
        String str3 = this.n0;
        boolean z2 = this.t0;
        com.vk.im.ui.components.contacts.a aVar = new com.vk.im.ui.components.contacts.a(a1wVar2, c2, cau0Var, L, bVar, invoke, j, n, k, sortOrder, i, z, i2, str2, a2, list2, false, false, !z2, set2, peer, str3, h, false, z2, false, 1577853440);
        this.c0 = aVar;
        this.O.add(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_select_contacts_fragment, viewGroup, false);
        this.V = (BottomConfirmButton) viewGroup2.findViewById(R.id.vkim_confirm_btn);
        this.T = (VkButton) viewGroup2.findViewById(R.id.vkim_confirm_vkui_button);
        this.U = (VkBottomBar) viewGroup2.findViewById(R.id.bottom_bar);
        View findViewById = viewGroup2.findViewById(R.id.vkim_confirm_button_container);
        if (fo()) {
            ((FrameLayout) findViewById).setBackground(null);
        }
        this.W = (FrameLayout) findViewById;
        this.Q = (VkTopBar) viewGroup2.findViewById(R.id.toolbar_new);
        if (fo()) {
            dhr0.a.e0(R.attr.vk_ui_background, viewGroup2);
        }
        this.R = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        View findViewById2 = viewGroup2.findViewById(R.id.shadow);
        boolean z = this.t0;
        if (z) {
            f4m.j((AppBarShadowView) findViewById2);
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.vkim_list_container);
        this.b0 = viewGroup3;
        com.vk.im.ui.components.contacts.a aVar = this.c0;
        if (aVar == null) {
            aVar = null;
        }
        viewGroup3.addView(aVar.F0(viewGroup2, bundle));
        if (!fo()) {
            ViewGroup viewGroup4 = this.b0;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            if (!this.p0) {
                i = 0;
            } else if (z) {
                i = v0;
            } else {
                BottomConfirmButton bottomConfirmButton = this.V;
                if (bottomConfirmButton == null) {
                    bottomConfirmButton = null;
                }
                i = bottomConfirmButton.getExpectedHeight();
            }
            f4m.v(i, viewGroup4);
        }
        this.X = viewGroup2.findViewById(R.id.vkim_description_container);
        this.Y = (TextView) viewGroup2.findViewById(R.id.vkim_description_text);
        this.Z = (ImageView) viewGroup2.findViewById(R.id.vkim_description_icon);
        this.a0 = (ImageView) viewGroup2.findViewById(R.id.vkim_description_close);
        if (z) {
            myc0.h(g5z.a(getViewLifecycleOwner()), null, null, new mcw(this, null), 3);
        }
        if (z) {
            VkTopBar vkTopBar = this.Q;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            vkTopBar.setVisibility(0);
            Toolbar toolbar = this.R;
            if (toolbar == null) {
                toolbar = null;
            }
            f4m.j(toolbar);
            ho();
            VkTopBar vkTopBar2 = this.Q;
            if (vkTopBar2 == null) {
                vkTopBar2 = null;
            }
            vkTopBar2.setBack(fnj.d(kn()) ? null : new VkTopBar.b(new fgm(this, 16), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new nyq(6), 3), 14));
            return viewGroup2;
        }
        Toolbar toolbar2 = this.R;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setVisibility(0);
        VkTopBar vkTopBar3 = this.Q;
        if (vkTopBar3 == null) {
            vkTopBar3 = null;
        }
        f4m.j(vkTopBar3);
        Toolbar toolbar3 = this.R;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        toolbar3.setNavigationIcon(fnj.d(kn()) ? null : e3m.e(R.attr.im_ic_back_toolbar, requireContext()));
        Toolbar toolbar4 = this.R;
        if (toolbar4 == null) {
            toolbar4 = null;
        }
        String str = this.e0;
        if (str == null) {
            str = null;
        }
        toolbar4.setTitle(str);
        Toolbar toolbar5 = this.R;
        (toolbar5 != null ? toolbar5 : null).setNavigationOnClickListener(new v9b(this, 4));
        o3p0 o3p0Var = new o3p0(viewGroup2);
        this.S = o3p0Var;
        this.N.b(d02.y(o3p0Var.b, 200L, 2).subscribe(new pf1(new vam(this, 17), 22)));
        return viewGroup2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = this.t0;
        if (z && !fo()) {
            BottomConfirmButton bottomConfirmButton = this.V;
            if (bottomConfirmButton == null) {
                bottomConfirmButton = null;
            }
            f4m.j(bottomConfirmButton);
            VkBottomBar vkBottomBar = this.U;
            if (vkBottomBar == null) {
                vkBottomBar = null;
            }
            f4m.j(vkBottomBar);
            VkButton vkButton = this.T;
            if (vkButton == null) {
                vkButton = null;
            }
            bwt0.p0(vkButton, this.p0);
            VkButton vkButton2 = this.T;
            if (vkButton2 == null) {
                vkButton2 = null;
            }
            String str = this.g0;
            if (str == null) {
                str = null;
            }
            vkButton2.setText(str);
            VkButton vkButton3 = this.T;
            if (vkButton3 == null) {
                vkButton3 = null;
            }
            jjc.g(vkButton3, new vfk(this, 17));
        } else if (z || fo()) {
            VkBottomBar vkBottomBar2 = this.U;
            if (vkBottomBar2 == null) {
                vkBottomBar2 = null;
            }
            vkBottomBar2.setVisibility(0);
            FrameLayout frameLayout = this.W;
            if (frameLayout == null) {
                frameLayout = null;
            }
            f4m.j(frameLayout);
            BottomConfirmButton bottomConfirmButton2 = this.V;
            if (bottomConfirmButton2 == null) {
                bottomConfirmButton2 = null;
            }
            f4m.j(bottomConfirmButton2);
            VkButton vkButton4 = this.T;
            if (vkButton4 == null) {
                vkButton4 = null;
            }
            f4m.j(vkButton4);
            VkBottomBar vkBottomBar3 = this.U;
            if (vkBottomBar3 == null) {
                vkBottomBar3 = null;
            }
            f4m.j(vkBottomBar3.getTabBar());
            VkBottomBar vkBottomBar4 = this.U;
            if (vkBottomBar4 == null) {
                vkBottomBar4 = null;
            }
            f4m.j(vkBottomBar4.getButton());
            VkBottomBar vkBottomBar5 = this.U;
            if (vkBottomBar5 == null) {
                vkBottomBar5 = null;
            }
            jjc.g(vkBottomBar5.getButton(), new ekh(this, 13));
            VkBottomBar vkBottomBar6 = this.U;
            if (vkBottomBar6 == null) {
                vkBottomBar6 = null;
            }
            VkButton button = vkBottomBar6.getButton();
            String str2 = this.g0;
            if (str2 == null) {
                str2 = null;
            }
            button.setText(str2);
        } else {
            FrameLayout frameLayout2 = this.W;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            f4m.j(frameLayout2);
            VkButton vkButton5 = this.T;
            if (vkButton5 == null) {
                vkButton5 = null;
            }
            f4m.j(vkButton5);
            VkBottomBar vkBottomBar7 = this.U;
            if (vkBottomBar7 == null) {
                vkBottomBar7 = null;
            }
            f4m.j(vkBottomBar7);
            BottomConfirmButton bottomConfirmButton3 = this.V;
            if (bottomConfirmButton3 == null) {
                bottomConfirmButton3 = null;
            }
            bottomConfirmButton3.a(false);
            BottomConfirmButton bottomConfirmButton4 = this.V;
            if (bottomConfirmButton4 == null) {
                bottomConfirmButton4 = null;
            }
            bwt0.p0(bottomConfirmButton4, this.p0);
            BottomConfirmButton bottomConfirmButton5 = this.V;
            if (bottomConfirmButton5 == null) {
                bottomConfirmButton5 = null;
            }
            String str3 = this.g0;
            if (str3 == null) {
                str3 = null;
            }
            bottomConfirmButton5.setConfirmText(str3);
            BottomConfirmButton bottomConfirmButton6 = this.V;
            if (bottomConfirmButton6 == null) {
                bottomConfirmButton6 = null;
            }
            jjc.g(bottomConfirmButton6, new dxh(this, 19));
        }
        View view2 = this.X;
        if (view2 == null) {
            view2 = null;
        }
        String str4 = this.h0;
        if (str4 == null) {
            str4 = null;
        }
        bwt0.p0(view2, str4.length() > 0);
        View view3 = this.X;
        if (view3 == null) {
            view3 = null;
        }
        view3.setOnClickListener(new lcw());
        TextView textView = this.Y;
        if (textView == null) {
            textView = null;
        }
        String str5 = this.h0;
        if (str5 == null) {
            str5 = null;
        }
        textView.setText(str5);
        ImageView imageView = this.Z;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, this.k0 != null);
        ImageView imageView2 = this.Z;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageDrawable(this.k0);
        ImageView imageView3 = this.a0;
        jjc.g(imageView3 != null ? imageView3 : null, new eqq(this, 10));
    }

    @Override // xsna.qhh0
    public final boolean s() {
        com.vk.im.ui.components.contacts.a aVar = this.c0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.j1();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("visitSource") : null;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = serializable instanceof MobileOfficialAppsCoreNavStat$EventScreen ? (MobileOfficialAppsCoreNavStat$EventScreen) serializable : null;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    /* compiled from: ImSelectContactsFragment.kt */
    public final class b implements a.InterfaceC1144a {
        public boolean a;

        public b() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void d(boolean z) {
            throw new IllegalStateException("Unexpected call to create chat! ImCreateConversationFragment should be used");
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void e(Peer peer) {
            ImSelectContactsFragment imSelectContactsFragment = ImSelectContactsFragment.this;
            new z4w(imSelectContactsFragment.requireContext(), peer, new tcn(imSelectContactsFragment, 12)).show();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void f() {
            Context requireContext = ImSelectContactsFragment.this.requireContext();
            tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_contacts_import_success_snackbar);
            ikv0.a aVar = new ikv0.a(requireContext);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
            aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, requireContext).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            aVar.n();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final boolean h(qtd0 qtd0Var) {
            return true;
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void k(int i, List list) {
            String str;
            ImSelectContactsFragment imSelectContactsFragment = ImSelectContactsFragment.this;
            if (!imSelectContactsFragment.p0 && i > 0) {
                imSelectContactsFragment.eo();
                return;
            }
            Peer peer = imSelectContactsFragment.m0;
            boolean z = true;
            if (peer != null && peer.Ab(Peer.Type.USER)) {
                if (i > 0) {
                    str = imSelectContactsFragment.requireContext().getString(R.string.vkim_continue);
                } else {
                    str = imSelectContactsFragment.g0;
                    if (str == null) {
                        str = null;
                    }
                }
                if (imSelectContactsFragment.t0 && !imSelectContactsFragment.fo()) {
                    VkButton vkButton = imSelectContactsFragment.T;
                    if (vkButton == null) {
                        vkButton = null;
                    }
                    vkButton.setText(str);
                } else if (imSelectContactsFragment.t0 || imSelectContactsFragment.fo()) {
                    VkBottomBar vkBottomBar = imSelectContactsFragment.U;
                    if (vkBottomBar == null) {
                        vkBottomBar = null;
                    }
                    vkBottomBar.getButton().setText(str);
                } else {
                    BottomConfirmButton bottomConfirmButton = imSelectContactsFragment.V;
                    if (bottomConfirmButton == null) {
                        bottomConfirmButton = null;
                    }
                    bottomConfirmButton.setConfirmText(str);
                }
            }
            boolean z2 = imSelectContactsFragment.t0;
            boolean z3 = imSelectContactsFragment.t0;
            if (z2 && imSelectContactsFragment.fo() && i > 0) {
                VkBottomBar vkBottomBar2 = imSelectContactsFragment.U;
                if (vkBottomBar2 == null) {
                    vkBottomBar2 = null;
                }
                vkBottomBar2.getButton().setCount(Integer.valueOf(i));
            } else if (z3 && imSelectContactsFragment.fo() && i == 0) {
                VkBottomBar vkBottomBar3 = imSelectContactsFragment.U;
                if (vkBottomBar3 == null) {
                    vkBottomBar3 = null;
                }
                vkBottomBar3.getButton().setCount(null);
            } else if (z3 && i > 0) {
                VkButton vkButton2 = imSelectContactsFragment.T;
                if (vkButton2 == null) {
                    vkButton2 = null;
                }
                vkButton2.setCount(Integer.valueOf(i));
            } else if (z3 && i == 0) {
                VkButton vkButton3 = imSelectContactsFragment.T;
                if (vkButton3 == null) {
                    vkButton3 = null;
                }
                vkButton3.setCount(null);
            } else if (!z3) {
                BottomConfirmButton bottomConfirmButton2 = imSelectContactsFragment.V;
                if (bottomConfirmButton2 == null) {
                    bottomConfirmButton2 = null;
                }
                bottomConfirmButton2.setCounter(i);
            }
            if (!imSelectContactsFragment.l0 && i <= 0) {
                z = false;
            }
            BottomConfirmButton bottomConfirmButton3 = imSelectContactsFragment.V;
            if (bottomConfirmButton3 == null) {
                bottomConfirmButton3 = null;
            }
            bottomConfirmButton3.setEnabled(z);
            VkButton vkButton4 = imSelectContactsFragment.T;
            if (vkButton4 == null) {
                vkButton4 = null;
            }
            vkButton4.setEnabled(z);
            if (!imSelectContactsFragment.fo() || z == this.a) {
                return;
            }
            VkBottomBar vkBottomBar4 = imSelectContactsFragment.U;
            if (vkBottomBar4 == null) {
                vkBottomBar4 = null;
            }
            awt0.u(vkBottomBar4.getButton(), z);
            this.a = z;
            VkBottomBar vkBottomBar5 = imSelectContactsFragment.U;
            (vkBottomBar5 != null ? vkBottomBar5 : null).requestLayout();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void m() {
            ImSelectContactsFragment imSelectContactsFragment = ImSelectContactsFragment.this;
            new afw(imSelectContactsFragment.requireContext(), new jbs(imSelectContactsFragment)).show();
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void c() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void g() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void l() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void a(boolean z) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void b(q2a0 q2a0Var) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void i(qtd0 qtd0Var) {
        }
    }
}
