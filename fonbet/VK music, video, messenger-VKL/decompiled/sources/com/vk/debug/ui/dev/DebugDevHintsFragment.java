package com.vk.debug.ui.dev;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.bwt0;
import xsna.cw;
import xsna.d22;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.ept;
import xsna.fnj;
import xsna.fux;
import xsna.h7v;
import xsna.iah0;
import xsna.itg0;
import xsna.j5g;
import xsna.j6r0;
import xsna.kt9;
import xsna.l7v;
import xsna.lrk;
import xsna.m33;
import xsna.mf7;
import xsna.o9;
import xsna.oz50;
import xsna.pd90;
import xsna.pla;
import xsna.qcy;
import xsna.qno0;
import xsna.rl3;
import xsna.rsg0;
import xsna.ss;
import xsna.u01;
import xsna.u1u0;
import xsna.vif0;
import xsna.wr0;
import xsna.x7c;
import xsna.xz5;
import xsna.zoj0;

/* compiled from: DebugDevHintsFragment.kt */
/* loaded from: classes17.dex */
public final class DebugDevHintsFragment extends BaseFragment implements fux<HintId> {
    public static final /* synthetic */ int W = 0;
    public c S;
    public RecyclerView T;
    public RoundedSearchView U;
    public List<? extends HintId> V;

    /* compiled from: DebugDevHintsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DebugDevHintsFragment.kt */
    public static final class b extends vif0<HintId> implements View.OnClickListener {
        public final fux<HintId> n;
        public final TextView o;

        public b(ViewGroup viewGroup, DebugDevHintsFragment debugDevHintsFragment) {
            super(new TextView(viewGroup.getContext()));
            this.n = debugDevHintsFragment;
            View view = this.itemView;
            TextView textView = (TextView) view;
            this.o = textView;
            int b0 = dhr0.b0(R.attr.selectableItemBackground);
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.h0(b0, view);
            this.itemView.setLayoutParams(new RecyclerView.p(-1, -2));
            bwt0.h0(this, this.itemView);
            int a = iah0.a(16);
            textView.setGravity(16);
            textView.setPadding(a, a, a, a);
            textView.setTextSize(2, 16.0f);
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        }

        @Override // xsna.vif0
        public final void i6(HintId hintId) {
            HintId hintId2 = hintId;
            this.o.setText(hintId2 != null ? hintId2.getId() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HintId hintId = (HintId) this.m;
            if (hintId != null) {
                this.n.li(getAdapterPosition(), hintId);
            }
        }
    }

    /* compiled from: DebugDevHintsFragment.kt */
    public static final class c extends zoj0<HintId, b> implements mf7 {
        public final DebugDevHintsFragment e;

        public c(DebugDevHintsFragment debugDevHintsFragment) {
            this.e = debugDevHintsFragment;
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            return 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            ((b) e0Var).V5(this.c.c(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(viewGroup, this.e);
        }
    }

    @Override // xsna.fux
    public final void li(int i, Object obj) {
        l7v b2 = pla.e().b();
        String id = ((HintId) obj).getId();
        b2.getClass();
        ss ssVar = new ss("account.showHelpHint");
        ssVar.K("hint_id", id);
        itg0.i(4, rsg0.y0(ssVar, null, null, 3).L(new d22(new ept(2), 21), false), null, new o9(26, b2, id), h7v.a.a);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List u0 = rl3.u0(HintId.values());
        final x7c x7cVar = new x7c(5);
        this.V = j5g.D0(new Comparator() { // from class: xsna.r2l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = DebugDevHintsFragment.W;
                return ((Number) x7c.this.invoke(obj, obj2)).intValue();
            }
        }, u0);
        c cVar = new c(this);
        this.S = cVar;
        List<? extends HintId> list = this.V;
        if (list == null) {
            list = null;
        }
        cVar.setItems(list);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.debug_hints_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.debug_hints_toolbar);
        int i = 2;
        if (toolbar != null) {
            toolbar.setTitle(getString(R.string.debug_hints));
            Context context = toolbar.getContext();
            e3m.a aVar = e3m.a;
            toolbar.setNavigationIcon(m33.a(R.drawable.vk_icon_arrow_left_outline_28, context));
            u1u0.d(this, toolbar);
            toolbar.setNavigationOnClickListener(new xz5(this, 2));
        }
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.debug_hints_recycler_view);
        c cVar = this.S;
        if (cVar == null) {
            cVar = null;
        }
        recyclerView.setAdapter(cVar);
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        int i2 = context2.getResources().getConfiguration().screenWidthDp;
        Context context3 = recyclerView.getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context3);
        Object adapter = recyclerView.getAdapter();
        if (adapter instanceof pd90) {
            adapter = ((pd90) adapter).c;
        }
        kt9 kt9Var = new kt9(recyclerView, (mf7) adapter, !d);
        WeakHashMap weakHashMap = j6r0.a;
        int a2 = iah0.a(6.0f);
        int a3 = iah0.a(6.0f);
        int a4 = d ? iah0.a(8.0f) : 0;
        kt9Var.i = a2;
        kt9Var.j = a3;
        kt9Var.k = a4;
        kt9Var.l = 0;
        recyclerView.addItemDecoration(kt9Var);
        int i3 = 16;
        int a5 = d ? iah0.a(Math.max(16, (i2 - 924) / 2)) : 0;
        recyclerView.setScrollBarStyle(33554432);
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(a5, 0, a5, 0);
        this.T = recyclerView;
        RoundedSearchView roundedSearchView = (RoundedSearchView) viewGroup2.findViewById(R.id.search_view);
        this.U = roundedSearchView;
        roundedSearchView.setEditMode(roundedSearchView.j);
        RoundedSearchView roundedSearchView2 = this.U;
        this.P.b(new qno0((roundedSearchView2 != null ? roundedSearchView2 : null).d).U(new com.vk.movika.sdk.base.flow.binding.c(new wr0(13), i3)).subscribe(new cw(new lrk(this, i), i3)));
        return viewGroup2;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        Hint p;
        String str;
        super.onResume();
        if (!pla.e().b().a("test:resources_item") || (p = pla.e().b().p("test:resources_item")) == null) {
            return;
        }
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_test_hint_resource, (ViewGroup) getView(), false);
        androidx.appcompat.app.d create = new d.a(requireContext()).setView(inflate).create();
        Map<String, String> map = p.e;
        if (map != null && (str = map.get("simple_resource")) != null) {
            ((VKImageView) inflate.findViewById(R.id.image)).load(str);
        }
        Button button = (Button) inflate.findViewById(R.id.close_btn);
        if (button != null) {
            button.setOnClickListener(new u01(create, 3));
        }
        create.show();
        pla.e().b().b("test:resources_item");
    }
}
