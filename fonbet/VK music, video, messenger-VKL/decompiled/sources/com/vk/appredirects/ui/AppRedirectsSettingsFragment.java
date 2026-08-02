package com.vk.appredirects.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.entity.LinkType;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import xsna.asu0;
import xsna.bwt0;
import xsna.e4;
import xsna.go1;
import xsna.h3p0;
import xsna.hg1;
import xsna.izs;
import xsna.j83;
import xsna.k1u0;
import xsna.p83;
import xsna.q83;
import xsna.tlo0;
import xsna.tq;
import xsna.ul1;
import xsna.vif0;
import xsna.xo2;
import xsna.y53;

/* compiled from: AppRedirectsSettingsFragment.kt */
/* loaded from: classes15.dex */
public final class AppRedirectsSettingsFragment extends VKRecyclerFragment<j83> {
    public static final /* synthetic */ int L0 = 0;
    public c I0;
    public d J0;
    public VkTopBar K0;

    /* compiled from: AppRedirectsSettingsFragment.kt */
    public final class a extends vif0<j83> {
        public final VkCell n;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.app_redirect_setting_item, 0);
            this.n = (VkCell) this.itemView;
        }

        @Override // xsna.vif0
        public final void i6(j83 j83Var) {
            App app2;
            j83 j83Var2 = j83Var;
            if (j83Var2 == null || (app2 = j83Var2.b) == null) {
                return;
            }
            VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, j83Var2.a.h()), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14);
            VkCell vkCell = this.n;
            vkCell.setMiddle(a);
            VkCell.Right.c cVar = VkCell.Right.Companion;
            tlo0.h hVar = new tlo0.h(y53.b(app2, this.itemView.getContext()));
            vkCell.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.e(hVar, hVar), null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 22));
            bwt0.i0(this.itemView, new p83(AppRedirectsSettingsFragment.this, this, j83Var2, 0));
        }
    }

    /* compiled from: AppRedirectsSettingsFragment.kt */
    public final class b extends RecyclerView.Adapter<a> {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = AppRedirectsSettingsFragment.L0;
            ArrayList<T> arrayList = AppRedirectsSettingsFragment.this.v0;
            if (arrayList != 0) {
                return arrayList.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            int i2 = AppRedirectsSettingsFragment.L0;
            aVar.V5(AppRedirectsSettingsFragment.this.v0.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return AppRedirectsSettingsFragment.this.new a(viewGroup);
        }
    }

    public AppRedirectsSettingsFragment() {
        super(LinkType.values().length);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.g0) {
            return;
        }
        this.f0 = false;
        Do();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        c cVar = this.I0;
        if (cVar != null) {
            cVar.dispose();
        }
        d dVar = this.J0;
        if (dVar != null) {
            dVar.dismiss();
        }
        View view = this.b0;
        if (view != null) {
            xo2.f(view, false, true, 300L);
        }
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.e0.setVisibility(8);
        VkTopBar vkTopBar = new VkTopBar(requireContext(), null, 6, 0);
        vkTopBar.setShowBottomDivider(false);
        vkTopBar.setBack(new VkTopBar.b(new q83(0, this, AppRedirectsSettingsFragment.class, "onToolbarNavigationClick", "onToolbarNavigationClick()V", 0, 0), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new com.vk.movika.sdk.base.observable.c(vkTopBar, 6), 3), 14));
        if (!h3p0.g(this, this.K0)) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(vkTopBar.getContext().getString(R.string.app_redirects_preference_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, com.vk.core.compose.component.semantics.b.a(null, new go1(vkTopBar, 4), 3), 6));
        }
        this.K0 = vkTopBar;
        jo(vkTopBar);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        v vVar = new v(new Callable() { // from class: xsna.m83
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AppRedirectsSettingsFragment appRedirectsSettingsFragment = AppRedirectsSettingsFragment.this;
                int i3 = AppRedirectsSettingsFragment.L0;
                LinkType[] values = LinkType.values();
                ArrayList arrayList = new ArrayList(values.length);
                for (LinkType linkType : values) {
                    LinkedHashMap a2 = i83.a(appRedirectsSettingsFragment.requireContext(), new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, jeq0.g("https://" + a0a.d + '/' + linkType.i())), TimeUnit.SECONDS.toMillis(30L));
                    App b2 = i83.b(a2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : a2.entrySet()) {
                        if (((e83) entry.getValue()).a) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((App) ((Map.Entry) it.next()).getKey());
                    }
                    arrayList.add(new j83(linkType, b2, arrayList2));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((j83) next).b != null) {
                        arrayList3.add(next);
                    }
                }
                return arrayList3;
            }
        });
        asu0 asu0Var = asu0.a;
        this.I0 = hg1.i(vVar.q(asu0Var.c()).m(asu0Var.d()), new ul1(this, 4));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter<?> wo() {
        return new b();
    }
}
