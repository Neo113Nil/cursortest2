package com.vk.components;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.a06;
import xsna.cai;
import xsna.fnj;
import xsna.iah0;
import xsna.m33;
import xsna.oz50;
import xsna.p5h;
import xsna.qhh0;
import xsna.v01;

/* compiled from: ComponentsFragment.kt */
/* loaded from: classes17.dex */
public final class ComponentsFragment extends BaseFragment implements qhh0 {
    public static final /* synthetic */ int T = 0;
    public cai S;

    /* compiled from: ComponentsFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.S = new cai(kn(), new p5h(this, 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_components_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        cai caiVar = this.S;
        if (caiVar == null) {
            caiVar = null;
        }
        caiVar.getClass();
        caiVar.c = (RecyclerView) view.findViewById(R.id.list);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        FragmentActivity fragmentActivity = caiVar.a;
        if (toolbar != null) {
            toolbar.setTitle(fragmentActivity.getString(R.string.vk_components_title));
            toolbar.setNavigationIcon(m33.a(R.drawable.vk_icon_arrow_left_outline_28, fragmentActivity));
            toolbar.setNavigationOnClickListener(new v01(caiVar, 4));
            toolbar.setOnClickListener(new a06(caiVar, 3));
        }
        RecyclerView recyclerView = caiVar.c;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(caiVar.d);
            int i = fragmentActivity.getResources().getConfiguration().screenWidthDp;
            Context context = caiVar.c.getContext();
            HashSet hashSet = iah0.a;
            int a2 = fnj.d(context) ? iah0.a(Math.max(16, (i - 924) / 2)) : 0;
            RecyclerView recyclerView2 = caiVar.c;
            if (recyclerView2 != null) {
                recyclerView2.setScrollBarStyle(33554432);
            }
            RecyclerView recyclerView3 = caiVar.c;
            if (recyclerView3 != null) {
                recyclerView3.setClipToPadding(false);
            }
            RecyclerView recyclerView4 = caiVar.c;
            if (recyclerView4 != null) {
                recyclerView4.setPadding(a2, 0, a2, 0);
            }
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        cai caiVar = this.S;
        if (caiVar == null) {
            caiVar = null;
        }
        RecyclerView recyclerView = caiVar.c;
        if (recyclerView == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }
}
