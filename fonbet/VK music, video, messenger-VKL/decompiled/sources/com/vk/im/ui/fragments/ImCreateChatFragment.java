package com.vk.im.ui.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.contacts.AndroidContact;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.bk1;
import xsna.bwt0;
import xsna.d0w;
import xsna.dhr0;
import xsna.e3m;
import xsna.ekh;
import xsna.f1w;
import xsna.f4m;
import xsna.fnj;
import xsna.fpf0;
import xsna.g2v;
import xsna.i7o0;
import xsna.iah0;
import xsna.ies;
import xsna.j5g;
import xsna.j7k;
import xsna.jbs;
import xsna.jjc;
import xsna.l7m;
import xsna.lpj;
import xsna.lzv;
import xsna.m33;
import xsna.m7m;
import xsna.maj;
import xsna.msy;
import xsna.mxv;
import xsna.naj;
import xsna.og8;
import xsna.oz50;
import xsna.rl3;
import xsna.sbg;
import xsna.sjo;
import xsna.t6k;
import xsna.tlo0;
import xsna.tq;
import xsna.v230;
import xsna.xq;
import xsna.y1z;
import xsna.y6k;
import xsna.zdw;

/* compiled from: ImCreateChatFragment.kt */
/* loaded from: classes2.dex */
public final class ImCreateChatFragment extends ImFragment implements ies {
    public static final /* synthetic */ int d0 = 0;
    public final c P = new c();
    public VkTopBar Q;
    public Toolbar R;
    public View S;
    public VkButton T;
    public BottomConfirmButton U;
    public VkBottomBar V;
    public FrameLayout W;
    public y6k X;
    public boolean Y;
    public List<Long> Z;
    public Object a0;
    public String b0;
    public final Object c0;

    /* compiled from: ImCreateChatFragment.kt */
    public static final class a extends oz50 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Collection collection, Collection collection2, boolean z, boolean z2, Peer peer, int i) {
            super(ImCreateChatFragment.class, null, null);
            collection2 = (i & 2) != 0 ? EmptyList.b : collection2;
            z = (i & 4) != 0 ? false : z;
            z2 = (i & 16) != 0 ? false : z2;
            if ((i & 32) != 0) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.Unknown.e;
            }
            s(true);
            this.j.putParcelable("owner_id", peer);
            this.j.putLongArray("ids", j5g.P0(collection));
            this.j.putParcelableArray("selectedContacts", (Parcelable[]) collection2.toArray(new AndroidContact[0]));
            this.j.putBoolean("casper_chat", z);
            this.j.putString("title", "");
            this.j.putBoolean("based_on_other_chat", z2);
        }
    }

    /* compiled from: ImCreateChatFragment.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: ImCreateChatFragment.kt */
    public static final class c extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: ImCreateChatFragment.kt */
    public static final class d implements BottomConfirmButton.a {
        public d() {
        }

        @Override // com.vk.core.view.BottomConfirmButton.a
        public final void b() {
            y6k y6kVar = ImCreateChatFragment.this.X;
            if (y6kVar == null) {
                y6kVar = null;
            }
            y6kVar.X0();
        }

        @Override // com.vk.core.view.BottomConfirmButton.a
        public final void c() {
            ImCreateChatFragment.this.finish();
        }
    }

    public ImCreateChatFragment() {
        EmptyList emptyList = EmptyList.b;
        this.Z = emptyList;
        this.a0 = emptyList;
        this.b0 = "";
        this.c0 = msy.a(LazyThreadSafetyMode.NONE, new maj(this, 22));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.P;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        y6k y6kVar = this.X;
        if (y6kVar == null) {
            y6kVar = null;
        }
        v230 v230Var = y6kVar.t;
        if (i2 != -1 || intent == null) {
            return;
        }
        if (i == 2020) {
            y6kVar.s = (ChatControls) intent.getParcelableExtra("chat_controls");
            v230Var.k = Integer.valueOf(intent.getIntExtra("chat_type", 0));
            j7k Y0 = y6kVar.Y0();
            t6k t6kVar = Y0.h;
            if (t6kVar == null) {
                t6kVar = null;
            }
            t6kVar.J0(v230Var);
            RecyclerView recyclerView = Y0.f;
            RecyclerView.Adapter adapter = (recyclerView != null ? recyclerView : null).getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(1);
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra(X3.i.b);
        if (stringExtra != null && stringExtra.length() != 0) {
            v230Var.j = stringExtra;
            RecyclerView recyclerView2 = y6kVar.Y0().f;
            RecyclerView.Adapter adapter2 = (recyclerView2 != null ? recyclerView2 : null).getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(0);
                return;
            }
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("output");
        if (uri != null) {
            v230Var.j = uri.toString();
            RecyclerView recyclerView3 = y6kVar.Y0().f;
            RecyclerView.Adapter adapter3 = (recyclerView3 != null ? recyclerView3 : null).getAdapter();
            if (adapter3 != null) {
                adapter3.notifyItemChanged(0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r3.getBoolean("based_on_other_chat") == true) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttach(Activity activity) {
        List<Long> list;
        Object obj;
        String str;
        Peer peer;
        String str2;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable[] parcelableArray;
        long[] longArray;
        super.onAttach(activity);
        Bundle arguments = getArguments();
        this.Y = arguments != null ? arguments.getBoolean("casper_chat") : false;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (longArray = arguments2.getLongArray("ids")) == null || (list = rl3.t0(longArray)) == null) {
            list = EmptyList.b;
        }
        this.Z = list;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (parcelableArray = arguments3.getParcelableArray("selectedContacts")) == null) {
            obj = EmptyList.b;
        } else {
            obj = new ArrayList();
            for (Parcelable parcelable3 : parcelableArray) {
                if (parcelable3 instanceof AndroidContact) {
                    obj.add(parcelable3);
                }
            }
        }
        this.a0 = obj;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("title")) == null) {
            str = "";
        }
        this.b0 = str;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments5.getParcelable("owner_id", Peer.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable4 = arguments5.getParcelable("owner_id");
                if (!(parcelable4 instanceof Peer)) {
                    parcelable4 = null;
                }
                parcelable = (Peer) parcelable4;
            }
            peer = (Peer) parcelable;
        }
        peer = Peer.Unknown.e;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            str2 = "based_on_other_chat";
        }
        str2 = this.Y ? "chat_info_copy_phantom" : "create_new";
        String str3 = str2;
        Context requireContext = requireContext();
        l7m d2 = m7m.d(this);
        f1w b0 = ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d2).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
        l7m d3 = m7m.d(this);
        lzv g = ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d3.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d3).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
        l7m d4 = m7m.d(this);
        com.vk.im.engine.models.c experiments = ((ImExperimentsScopedComponent) xq.f((ImFeatureScopeProviderComponent) d4.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d4).a(fpf0.a(ImExperimentsScopedComponent.class))).getExperiments();
        mxv c2 = g2v.c();
        jbs jbsVar = new jbs(this);
        zdw zdwVar = i7o0.b;
        y6k y6kVar = new y6k(requireContext, c2, jbsVar, zdwVar != null ? zdwVar : null, str3, this.b0, this.Z, this.a0, this.Y, g, b0, experiments);
        this.X = y6kVar;
        this.O.add(y6kVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(imFeatures);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(a2 ? R.layout.vkim_new_chat_fragment : R.layout.vkim_new_chat_fragment_old, viewGroup, false);
        if (a2) {
            this.Q = (VkTopBar) viewGroup2.findViewById(R.id.im_topbar);
            this.S = viewGroup2.findViewById(R.id.vkim_create_chat_container);
            this.T = (VkButton) viewGroup2.findViewById(R.id.vkim_confirm_btn);
            this.V = (VkBottomBar) viewGroup2.findViewById(R.id.vkim_create_chat_bottom_bar);
        } else {
            this.R = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
            BottomConfirmButton bottomConfirmButton = (BottomConfirmButton) viewGroup2.findViewById(R.id.vkim_confirm_btn);
            bottomConfirmButton.a(false);
            bottomConfirmButton.setAlpha(0.4f);
            if (this.Y) {
                int a3 = iah0.a(20);
                int f = e3m.f(R.attr.vk_ui_text_contrast_themed, requireContext());
                Drawable mutate = m33.a(R.drawable.vk_icon_ghost_20, bottomConfirmButton.getContext()).mutate();
                mutate.setBounds(0, 0, a3, a3);
                sjo.b(mutate, f, PorterDuff.Mode.SRC_IN);
                bottomConfirmButton.c.setCompoundDrawablesRelative(mutate, null, null, null);
            }
            this.U = bottomConfirmButton;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.vkim_list_container);
        this.W = frameLayout;
        y6k y6kVar = this.X;
        (y6kVar == null ? null : y6kVar).u = new b();
        frameLayout.addView((y6kVar != null ? y6kVar : null).F0(viewGroup2, bundle));
        return viewGroup2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        y6k y6kVar = this.X;
        if (y6kVar == null) {
            y6kVar = null;
        }
        y6kVar.P0(bundle);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(imFeatures)) {
            VkTopBar vkTopBar = this.Q;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            FragmentActivity kn = kn();
            HashSet hashSet = iah0.a;
            vkTopBar.setBack(fnj.d(kn) ? null : new VkTopBar.b(new sbg(this, 24), null, null, null, null, 30));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.vkim_create_chat_title), null, null, null, null, 30), null, null, null, 14));
        } else {
            Toolbar toolbar = this.R;
            if (toolbar == null) {
                toolbar = null;
            }
            FragmentActivity kn2 = kn();
            HashSet hashSet2 = iah0.a;
            toolbar.setNavigationIcon(fnj.d(kn2) ? null : e3m.e(R.attr.im_ic_back_toolbar, requireContext()));
            toolbar.setTitle(R.string.vkim_create_chat_title);
            toolbar.setNavigationOnClickListener(new naj(this, 1));
            toolbar.setOnMenuItemClickListener(new bk1(this, 19));
        }
        boolean a2 = bVar.a(imFeatures);
        ?? r1 = this.c0;
        if (a2 && ((Boolean) r1.getValue()).booleanValue()) {
            View view2 = this.S;
            if (view2 == null) {
                view2 = null;
            }
            f4m.j(view2);
            VkBottomBar vkBottomBar = this.V;
            if (vkBottomBar == null) {
                vkBottomBar = null;
            }
            vkBottomBar.setVisibility(0);
            VkBottomBar vkBottomBar2 = this.V;
            if (vkBottomBar2 == null) {
                vkBottomBar2 = null;
            }
            f4m.j(vkBottomBar2.getTabBar());
            VkBottomBar vkBottomBar3 = this.V;
            if (vkBottomBar3 == null) {
                vkBottomBar3 = null;
            }
            vkBottomBar3.getButton().setVisibility(0);
            VkBottomBar vkBottomBar4 = this.V;
            if (vkBottomBar4 == null) {
                vkBottomBar4 = null;
            }
            vkBottomBar4.getButton().setText(R.string.vkim_create_chat);
            VkBottomBar vkBottomBar5 = this.V;
            jjc.g((vkBottomBar5 != null ? vkBottomBar5 : null).getButton(), new ekh(this, 10));
            return;
        }
        if (!bVar.a(imFeatures) || ((Boolean) r1.getValue()).booleanValue()) {
            BottomConfirmButton bottomConfirmButton = this.U;
            if (bottomConfirmButton == null) {
                bottomConfirmButton = null;
            }
            bottomConfirmButton.setListener(new d());
            BottomConfirmButton bottomConfirmButton2 = this.U;
            if (bottomConfirmButton2 == null) {
                bottomConfirmButton2 = null;
            }
            bottomConfirmButton2.setVisibility(0);
            FrameLayout frameLayout = this.W;
            if (frameLayout == null) {
                frameLayout = null;
            }
            BottomConfirmButton bottomConfirmButton3 = this.U;
            f4m.q((bottomConfirmButton3 != null ? bottomConfirmButton3 : null).getExpectedHeight(), frameLayout);
            return;
        }
        VkBottomBar vkBottomBar6 = this.V;
        if (vkBottomBar6 == null) {
            vkBottomBar6 = null;
        }
        f4m.j(vkBottomBar6);
        VkButton vkButton = this.T;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setOnClickListener(new og8(this, 2));
        VkButton vkButton2 = this.T;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        vkButton2.setVisibility(0);
        View view3 = this.S;
        bwt0.S(view3 != null ? view3 : null, new d0w(this, 0));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        y6k y6kVar = this.X;
        if (y6kVar == null) {
            y6kVar = null;
        }
        y6kVar.O0(bundle);
    }
}
