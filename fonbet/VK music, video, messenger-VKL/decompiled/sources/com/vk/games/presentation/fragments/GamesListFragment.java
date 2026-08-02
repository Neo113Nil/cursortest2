package com.vk.games.presentation.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.apps.dto.AppsGetAndroidCatalogFilterDto;
import com.vk.api.request.rx.VkListWithPayload;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.CatalogInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.af3;
import xsna.anj;
import xsna.e370;
import xsna.e43;
import xsna.e7;
import xsna.epx;
import xsna.ew;
import xsna.hf8;
import xsna.hx2;
import xsna.iah0;
import xsna.j6r0;
import xsna.j6t;
import xsna.jx2;
import xsna.om1;
import xsna.oz50;
import xsna.pf;
import xsna.rdx0;
import xsna.rsg0;
import xsna.te3;
import xsna.ue3;
import xsna.ve3;
import xsna.vf3;
import xsna.we3;
import xsna.xe3;
import xsna.ye3;
import xsna.z23;
import xsna.ze3;

/* loaded from: classes17.dex */
public class GamesListFragment extends VKRecyclerFragment<ApiApplication> {

    @Nullable
    public static SparseArray<String> L0;
    public final boolean I0;
    public d J0;
    public final a K0;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.vkontakte.android.games.RELOAD_INSTALLED".equals(intent.getAction())) {
                SparseArray<String> sparseArray = GamesListFragment.L0;
                GamesListFragment.this.Do();
            }
        }
    }

    public class b implements hx2<VKList<ApiApplication>> {
        public b() {
        }

        @Override // xsna.hx2
        public final void b(VKList<ApiApplication> vKList) {
            VKList<ApiApplication> vKList2 = vKList;
            boolean z = vKList2 instanceof VkListWithPayload;
            GamesListFragment gamesListFragment = GamesListFragment.this;
            if (z) {
                VkListWithPayload vkListWithPayload = (VkListWithPayload) vKList2;
                if (vkListWithPayload.q() instanceof xe3.a) {
                    String str = ((xe3.a) vkListWithPayload.q()).b;
                    SparseArray<String> sparseArray = GamesListFragment.L0;
                    gamesListFragment.setTitle(str);
                }
            }
            gamesListFragment.zo(vKList2);
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            GamesListFragment.this.onError(vKApiExecutionException);
        }
    }

    public class d extends UsableRecyclerView.c<j6t> {
        public d() {
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            SparseArray<String> sparseArray = GamesListFragment.L0;
            ApiApplication apiApplication = (ApiApplication) GamesListFragment.this.v0.get(i);
            int i3 = j6t.t;
            Photo photo = apiApplication.d;
            WeakHashMap weakHashMap = j6r0.a;
            return photo.Fb(iah0.a(72.0f), false).d.d;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            SparseArray<String> sparseArray = GamesListFragment.L0;
            return GamesListFragment.this.v0.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            SparseArray<String> sparseArray = GamesListFragment.L0;
            ((j6t) e0Var).V5((ApiApplication) GamesListFragment.this.v0.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            GamesListFragment gamesListFragment = GamesListFragment.this;
            Bundle arguments = gamesListFragment.getArguments();
            String str = SignalingProtocol.KEY_CHAT_DIRECT;
            if (arguments != null) {
                str = gamesListFragment.getArguments().getString("visit_source", SignalingProtocol.KEY_CHAT_DIRECT);
            }
            return new j6t(viewGroup, str);
        }
    }

    public static class e extends oz50 {
    }

    public GamesListFragment() {
        super(10);
        this.I0 = com.vk.toggle.b.A.a(SaFeatures.SA_MINI_APPS_CATALOG_ALIAS);
        this.K0 = new a();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void Bo(List<ApiApplication> list, boolean z) {
        if (list != null) {
            CatalogInfo catalogInfo = (CatalogInfo) getArguments().getParcelable("key_filter");
            Iterator<ApiApplication> it = list.iterator();
            while (it.hasNext()) {
                it.next().D = catalogInfo;
            }
        }
        super.Bo(list, z);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        qo();
        Bundle arguments = getArguments();
        if (arguments.containsKey("key_title")) {
            setTitle(arguments.getString("key_title"));
        } else if (arguments.containsKey("key_title_res")) {
            setTitle(arguments.getInt("key_title_res"));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter a2 = z23.a("com.vkontakte.android.games.RELOAD_INSTALLED");
        anj.d(e43.a, this.K0, a2, hf8.a, 4);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            e43.a.unregisterReceiver(this.K0);
        } catch (Exception unused) {
        }
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View ro = super.ro(layoutInflater, viewGroup, bundle);
        this.n0.setPadding(0, 0, 0, 0);
        return ro;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        rsg0 te3Var;
        io.reactivex.rxjava3.disposables.c a2;
        Integer num;
        Object obj;
        CatalogInfo catalogInfo = (CatalogInfo) getArguments().getParcelable("key_filter");
        int i3 = 2;
        if (this.I0) {
            Object obj2 = ue3.a;
            Iterator<E> it = AppsGetAndroidCatalogFilterDto.i().iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((AppsGetAndroidCatalogFilterDto) obj).j(), catalogInfo.zb())) {
                        break;
                    }
                }
            }
            AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto = (AppsGetAndroidCatalogFilterDto) obj;
            int i4 = catalogInfo.d;
            if (i4 != -1 && i4 > 0) {
                num = Integer.valueOf(i4);
            }
            a2 = rdx0.u(e370.e(vf3.a.c((53233 & 2) != 0 ? null : Integer.valueOf(i), Integer.valueOf(i2), null, null, (53233 & 4096) != 0 ? null : num, (53233 & 8192) != 0 ? null : appsGetAndroidCatalogFilterDto))).U(new e7(new pf(2), i3)).subscribe(new om1(this, 20), new ew(this, 23));
        } else {
            String str = catalogInfo.g;
            int i5 = catalogInfo.d;
            CatalogInfo.FilterType filterType = catalogInfo.f;
            if (filterType == CatalogInfo.FilterType.RECOMMENDED) {
                te3Var = new ze3("apps.getRecommendations", new ye3());
                if (str != null) {
                    te3Var.K("platform", str);
                }
                te3Var.C(i2, "count");
                te3Var.C(i, SignalingProtocol.KEY_OFFSET);
            } else if (i5 != -1) {
                String zb = catalogInfo.zb();
                te3 te3Var2 = new te3("apps.getCatalog", ApiApplication.k0);
                if (!TextUtils.isEmpty(zb)) {
                    te3Var2.K("filter", zb);
                }
                if (i5 > 0) {
                    te3Var2.C(i5, "section_id");
                }
                te3Var2.C(i, SignalingProtocol.KEY_OFFSET);
                te3Var2.C(i2, "count");
                if (str == null || str.isEmpty()) {
                    te3Var2.K("platform", "html5");
                } else {
                    te3Var2.K("platform", str);
                }
                te3Var2.C(1, "return_friends");
                te3Var = te3Var2;
            } else if (filterType == CatalogInfo.FilterType.GAMES_CATALOG) {
                long j = catalogInfo.e;
                te3Var = new xe3(new ve3(), new we3());
                te3Var.D(j, "collection_id");
                te3Var.C(i2, "count");
                te3Var.C(i, SignalingProtocol.KEY_OFFSET);
            } else {
                String zb2 = catalogInfo.zb();
                te3Var = new te3("apps.getCatalog", ApiApplication.k0);
                if (zb2 == null || !zb2.equals("html5")) {
                    if (!TextUtils.isEmpty(zb2)) {
                        te3Var.K("filter", zb2);
                    }
                    te3Var.K("platform", "android");
                } else {
                    te3Var.K("platform", "html5");
                }
                if (str != null && !str.isEmpty()) {
                    te3Var.K("platform", str);
                }
                te3Var.C(i, SignalingProtocol.KEY_OFFSET);
                te3Var.C(i2, "count");
                te3Var.C(1, "return_friends");
            }
            a2 = new jx2(te3Var, new b()).a();
        }
        if (catalogInfo.d == -1 || !TextUtils.isEmpty(this.O)) {
            this.i0 = a2;
            return;
        }
        int i6 = catalogInfo.d;
        SparseArray<String> sparseArray = L0;
        if (sparseArray != null) {
            setTitle(sparseArray.get(i6));
            this.i0 = a2;
        } else {
            af3 af3Var = new af3("apps.getSections", af3.t);
            af3Var.K("platform", "html5");
            this.i0 = new io.reactivex.rxjava3.disposables.b(a2, new jx2(af3Var, new c(i6)).a());
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter wo() {
        if (this.J0 == null) {
            this.J0 = new d();
        }
        return this.J0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        if (arguments == null || !getArguments().containsKey("GamesListFragment.ref")) {
            return;
        }
        uiTrackingScreen.a = (MobileOfficialAppsCoreNavStat$EventScreen) arguments.getSerializable("GamesListFragment.ref");
    }

    public class c implements hx2<VKList<af3.a>> {
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // xsna.hx2
        public final void b(VKList<af3.a> vKList) {
            VKList<af3.a> vKList2 = vKList;
            GamesListFragment.L0 = new SparseArray<>(vKList2.size());
            Iterator<af3.a> it = vKList2.iterator();
            while (it.hasNext()) {
                af3.a next = it.next();
                GamesListFragment.L0.put(next.a, next.b);
            }
            GamesListFragment.this.setTitle(GamesListFragment.L0.get(this.b));
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
        }
    }
}
