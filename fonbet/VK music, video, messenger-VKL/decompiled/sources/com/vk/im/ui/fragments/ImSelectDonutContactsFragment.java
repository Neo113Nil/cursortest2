package com.vk.im.ui.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.BottomConfirmButton;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.SelectedMembers;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.a;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.a1w;
import xsna.bo8;
import xsna.bwt0;
import xsna.c5g;
import xsna.cau0;
import xsna.d02;
import xsna.e1w;
import xsna.e3m;
import xsna.f2s;
import xsna.f4m;
import xsna.fnj;
import xsna.g2v;
import xsna.gv5;
import xsna.i4h;
import xsna.iah0;
import xsna.ies;
import xsna.izs;
import xsna.j5g;
import xsna.jbs;
import xsna.jjc;
import xsna.k0j;
import xsna.mxv;
import xsna.ncw;
import xsna.o3p0;
import xsna.oz50;
import xsna.pbm;
import xsna.q1w;
import xsna.q2a0;
import xsna.qhh0;
import xsna.qp4;
import xsna.qtd0;
import xsna.rl3;
import xsna.s3q0;
import xsna.w8j;
import xsna.zqh;
import xsna.zyu;

/* compiled from: ImSelectDonutContactsFragment.kt */
/* loaded from: classes2.dex */
public final class ImSelectDonutContactsFragment extends ImFragment implements qhh0, ies, gv5 {
    public static final /* synthetic */ int k0 = 0;
    public Toolbar P;
    public o3p0 Q;
    public BottomConfirmButton R;
    public View S;
    public TextView T;
    public ImageView U;
    public ImageView V;
    public ViewGroup W;
    public com.vk.im.ui.components.contacts.a X;
    public DonutContactsListFactory Y;
    public String Z;
    public String a0;
    public String b0;
    public Set<Long> c0;
    public Set<Long> d0;
    public long i0;
    public final String e0 = "";
    public final int f0 = 1;
    public final boolean g0 = true;
    public final int h0 = Integer.MAX_VALUE;
    public final b j0 = new b();

    /* compiled from: ImSelectDonutContactsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(ImSelectDonutContactsFragment.class, null, null);
            s(true);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        o3p0 o3p0Var = this.Q;
        if (o3p0Var == null) {
            o3p0Var = null;
        }
        if (o3p0Var.a()) {
            return true;
        }
        com.vk.im.ui.components.contacts.a aVar = this.X;
        if (aVar == null) {
            aVar = null;
        }
        if (((Collection) aVar.b1().r).isEmpty()) {
            return false;
        }
        com.vk.im.ui.components.contacts.a aVar2 = this.X;
        (aVar2 != null ? aVar2 : null).Z0();
        return true;
    }

    public final void eo() {
        UiTracker.b();
        com.vk.im.ui.components.contacts.a aVar = this.X;
        if (aVar == null) {
            aVar = null;
        }
        Object obj = aVar.b1().r;
        Intent intent = new Intent();
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((qtd0) it.next()).G3()));
        }
        intent.putExtra("ids", j5g.P0(arrayList));
        s3q0 s3q0Var = s3q0.a;
        Mf(-1, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        String string;
        String string2;
        String string3;
        Set<Long> set;
        Set<Long> set2;
        Long e;
        long[] longArray;
        long[] longArray2;
        super.onAttach(activity);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("factory") : null;
        DonutContactsListFactory donutContactsListFactory = serializable instanceof DonutContactsListFactory ? (DonutContactsListFactory) serializable : null;
        if (donutContactsListFactory == null) {
            donutContactsListFactory = DonutContactsListFactory.SELECT_DONUT_FRIENDS_VKAPP;
        }
        this.Y = donutContactsListFactory;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("title")) == null) {
            string = requireContext().getString(R.string.im_accessibility_contacts_tab);
        }
        this.Z = string;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("hint")) == null) {
            string2 = requireContext().getString(R.string.vkim_empty_selection_hint);
        }
        this.a0 = string2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("text")) == null) {
            string3 = requireContext().getString(R.string.vkim_create_chat);
        }
        this.b0 = string3;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (longArray2 = arguments5.getLongArray("ids")) == null || (set = rl3.x0(longArray2)) == null) {
            set = EmptySet.b;
        }
        this.c0 = set;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (longArray = arguments6.getLongArray("selected_ids")) == null || (set2 = rl3.x0(longArray)) == null) {
            set2 = EmptySet.b;
        }
        this.d0 = set2;
        Bundle arguments7 = getArguments();
        this.i0 = (arguments7 == null || (e = bo8.e(arguments7, "donut_chat_owner_id")) == null) ? 0L : e.longValue();
        DonutContactsListFactory donutContactsListFactory2 = this.Y;
        if (donutContactsListFactory2 == null) {
            donutContactsListFactory2 = null;
        }
        donutContactsListFactory2.getClass();
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar != null ? a1wVar : null;
        mxv c = g2v.c();
        a1w a1wVar3 = q1w.a;
        if (a1wVar3 == null) {
            a1wVar3 = null;
        }
        cau0 cau0Var = a1wVar3.r().h;
        jbs jbsVar = new jbs(this);
        b bVar = this.j0;
        DonutContactsListFactory donutContactsListFactory3 = this.Y;
        if (donutContactsListFactory3 == null) {
            donutContactsListFactory3 = null;
        }
        Set<ContactsViews> l = donutContactsListFactory3.l();
        DonutContactsListFactory donutContactsListFactory4 = this.Y;
        if (donutContactsListFactory4 == null) {
            donutContactsListFactory4 = null;
        }
        boolean i = donutContactsListFactory4.i();
        DonutContactsListFactory donutContactsListFactory5 = this.Y;
        if (donutContactsListFactory5 == null) {
            donutContactsListFactory5 = null;
        }
        boolean k = donutContactsListFactory5.k();
        DonutContactsListFactory donutContactsListFactory6 = this.Y;
        if (donutContactsListFactory6 == null) {
            donutContactsListFactory6 = null;
        }
        izs<w8j, e1w<pbm>> h = donutContactsListFactory6.h();
        Bundle arguments8 = getArguments();
        Peer peer = arguments8 != null ? (Peer) arguments8.getParcelable("donut_root_dialog_peer") : null;
        Peer peer2 = peer != null ? peer : null;
        boolean z = this.g0;
        String str = this.a0;
        String str2 = str == null ? null : str;
        SortOrder sortOrder = SortOrder.BY_NAME;
        int i2 = this.f0;
        Set<Long> set3 = this.c0;
        Set<Long> set4 = set3 == null ? null : set3;
        Serializer.c<SelectedMembers> cVar = SelectedMembers.CREATOR;
        Set<Long> set5 = this.d0;
        com.vk.im.ui.components.contacts.a aVar = new com.vk.im.ui.components.contacts.a(a1wVar2, c, cau0Var, jbsVar, bVar, l, i, k, new f2s(this, 13), sortOrder, i2, z, this.h0, str2, SelectedMembers.a.a(set5 != null ? set5 : null), null, false, false, false, set4, peer2, null, h, false, false, false, 2124292608);
        this.X = aVar;
        this.O.add(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_select_contacts_fragment, viewGroup, false);
        BottomConfirmButton bottomConfirmButton = (BottomConfirmButton) viewGroup2.findViewById(R.id.vkim_confirm_btn);
        this.R = bottomConfirmButton;
        bottomConfirmButton.a(false);
        BottomConfirmButton bottomConfirmButton2 = this.R;
        if (bottomConfirmButton2 == null) {
            bottomConfirmButton2 = null;
        }
        boolean z = this.g0;
        bwt0.p0(bottomConfirmButton2, z);
        this.P = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.vkim_list_container);
        this.W = viewGroup3;
        com.vk.im.ui.components.contacts.a aVar = this.X;
        if (aVar == null) {
            aVar = null;
        }
        viewGroup3.addView(aVar.F0(viewGroup2, bundle));
        ViewGroup viewGroup4 = this.W;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        if (z) {
            BottomConfirmButton bottomConfirmButton3 = this.R;
            i = (bottomConfirmButton3 != null ? bottomConfirmButton3 : null).getExpectedHeight();
        }
        f4m.v(i, viewGroup4);
        this.S = viewGroup2.findViewById(R.id.vkim_description_container);
        this.T = (TextView) viewGroup2.findViewById(R.id.vkim_description_text);
        this.U = (ImageView) viewGroup2.findViewById(R.id.vkim_description_icon);
        this.V = (ImageView) viewGroup2.findViewById(R.id.vkim_description_close);
        return viewGroup2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = this.P;
        if (toolbar == null) {
            toolbar = null;
        }
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        toolbar.setNavigationIcon(fnj.d(kn) ? null : e3m.e(R.attr.im_ic_back_toolbar, requireContext()));
        Toolbar toolbar2 = this.P;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        String str = this.Z;
        if (str == null) {
            str = null;
        }
        toolbar2.setTitle(str);
        Toolbar toolbar3 = this.P;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        toolbar3.setNavigationOnClickListener(new qp4(this, 2));
        o3p0 o3p0Var = new o3p0(view);
        this.Q = o3p0Var;
        int i = 21;
        this.N.b(d02.y(o3p0Var.b, 200L, 2).subscribe(new zyu(new zqh(this, i), 1 == true ? 1 : 0)));
        BottomConfirmButton bottomConfirmButton = this.R;
        if (bottomConfirmButton == null) {
            bottomConfirmButton = null;
        }
        String str2 = this.b0;
        if (str2 == null) {
            str2 = null;
        }
        bottomConfirmButton.setConfirmText(str2);
        BottomConfirmButton bottomConfirmButton2 = this.R;
        if (bottomConfirmButton2 == null) {
            bottomConfirmButton2 = null;
        }
        jjc.g(bottomConfirmButton2, new i4h(this, 28));
        View view2 = this.S;
        if (view2 == null) {
            view2 = null;
        }
        String str3 = this.e0;
        bwt0.p0(view2, str3.length() > 0);
        View view3 = this.S;
        if (view3 == null) {
            view3 = null;
        }
        view3.setOnClickListener(new ncw());
        TextView textView = this.T;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str3);
        ImageView imageView = this.U;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, false);
        ImageView imageView2 = this.U;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        ImageView imageView3 = this.V;
        jjc.g(imageView3 != null ? imageView3 : null, new k0j(this, i));
    }

    @Override // xsna.qhh0
    public final boolean s() {
        com.vk.im.ui.components.contacts.a aVar = this.X;
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

    /* compiled from: ImSelectDonutContactsFragment.kt */
    public final class b implements a.InterfaceC1144a {
        public b() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void d(boolean z) {
            throw new IllegalStateException("Unexpected call to create chat! ImCreateConversationFragment should be used");
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final boolean h(qtd0 qtd0Var) {
            return true;
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void k(int i, List list) {
            int size = list.size();
            ImSelectDonutContactsFragment imSelectDonutContactsFragment = ImSelectDonutContactsFragment.this;
            if (!imSelectDonutContactsFragment.g0 && size > 0) {
                imSelectDonutContactsFragment.eo();
                return;
            }
            BottomConfirmButton bottomConfirmButton = imSelectDonutContactsFragment.R;
            if (bottomConfirmButton == null) {
                bottomConfirmButton = null;
            }
            bottomConfirmButton.setCounter(size);
            BottomConfirmButton bottomConfirmButton2 = imSelectDonutContactsFragment.R;
            (bottomConfirmButton2 != null ? bottomConfirmButton2 : null).setEnabled(size > 0);
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void c() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void f() {
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
        public final void m() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void a(boolean z) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void b(q2a0 q2a0Var) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void e(Peer peer) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void i(qtd0 qtd0Var) {
        }
    }
}
