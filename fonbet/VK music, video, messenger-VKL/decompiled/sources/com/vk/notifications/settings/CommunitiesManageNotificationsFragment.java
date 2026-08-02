package com.vk.notifications.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.movika.sdk.base.observable.p;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.blu;
import xsna.bpn0;
import xsna.dqu;
import xsna.ed4;
import xsna.epx;
import xsna.f3p0;
import xsna.gjf0;
import xsna.gpu0;
import xsna.iah0;
import xsna.iz;
import xsna.jjv0;
import xsna.lt9;
import xsna.mf7;
import xsna.mre;
import xsna.nd90;
import xsna.nz;
import xsna.oap;
import xsna.od90;
import xsna.oz50;
import xsna.q6r0;
import xsna.rsg0;
import xsna.ttp0;
import xsna.vif0;
import xsna.whp;
import xsna.wwf0;
import xsna.xcd;
import xsna.xqf;
import xsna.xqu;
import xsna.yfb;
import xsna.yn3;
import xsna.ysg0;
import xsna.ze90;
import xsna.zqu;

/* compiled from: CommunitiesManageNotificationsFragment.kt */
/* loaded from: classes4.dex */
public final class CommunitiesManageNotificationsFragment extends BaseFragment {
    public static final /* synthetic */ int Z = 0;
    public RecyclerPaginatedView V;
    public com.vk.lists.c W;
    public final lt9 S = new lt9(new RecyclerView.Adapter[0]);
    public final c T = new c();
    public final a U = new a();
    public boolean X = true;
    public final bpn0 Y = new bpn0(new xqf(this, 4));

    /* compiled from: CommunitiesManageNotificationsFragment.kt */
    public static final class PaginatedView extends RecyclerPaginatedView {
        public PaginatedView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
        }

        @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
        public final void qg(whp whpVar) {
            f0();
        }
    }

    /* compiled from: CommunitiesManageNotificationsFragment.kt */
    public static final class b extends oz50 {
        public b() {
            super(CommunitiesManageNotificationsFragment.class, null, null);
        }
    }

    /* compiled from: CommunitiesManageNotificationsFragment.kt */
    public static final class d implements od90<Group> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.od90
        public final q<VKList<Group>> a(oap<Integer, String> oapVar, int i) {
            if (!(oapVar instanceof oap.a)) {
                throw new IllegalStateException("You must use pagination with offset or change paginationType");
            }
            return rsg0.y0(yfb.x(xqu.h(new zqu(), q6r0.f().y(), Collections.singletonList(GroupsFilterDto.ENABLED_NOTIFICATIONS), Collections.singletonList(GroupsFieldsDto.ACTIVITY), (Integer) ((oap.a) oapVar).a, Integer.valueOf(i), 32)), null, null, 3).U(new nz(new mre(5, CommunitiesManageNotificationsFragment.this, new dqu()), 13));
        }
    }

    public final void io(UserId userId) {
        Group group;
        c cVar = this.T;
        ArrayList<Group> arrayList = cVar.d;
        Iterator<Group> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                group = null;
                break;
            } else {
                group = it.next();
                if (epx.f(group.c, userId)) {
                    break;
                }
            }
        }
        Group group2 = group;
        ttp0.a(arrayList).remove(group2);
        if (group2 != null) {
            cVar.c--;
        }
        cVar.notifyDataSetChanged();
        ysg0<Object> ysg0Var = ysg0.b;
        ysg0.b.a(new wwf0());
        kn().getSupportFragmentManager().k0(yfb.b(new Pair("count", Integer.valueOf(cVar.c))), "notification_setting_status_change");
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || i2 != -1) {
            if (i == 2 && i2 == -1 && intent != null) {
                io(new UserId(intent.getLongExtra("id", 0L)));
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        }
        ysg0<Object> ysg0Var = ysg0.b;
        ysg0.b.a(new wwf0());
        kn().getSupportFragmentManager().k0(yfb.b(new Pair("count", Integer.valueOf(this.T.c + 1))), "notification_setting_status_change");
        com.vk.lists.c cVar = this.W;
        if (cVar == null) {
            cVar = null;
        }
        cVar.p(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.layout_base_fragment, viewGroup, false);
        this.V = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        f3p0.a(toolbar, this, new iz(this, 29));
        toolbar.setTitle(R.string.groups);
        RecyclerPaginatedView recyclerPaginatedView = this.V;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerPaginatedView recyclerPaginatedView2 = this.V;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        lt9 lt9Var = this.S;
        recyclerPaginatedView2.setAdapter(lt9Var);
        lt9Var.K0(this.U);
        c cVar = this.T;
        lt9Var.K0(cVar);
        RecyclerPaginatedView recyclerPaginatedView3 = this.V;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        gjf0.e(recyclerPaginatedView3, requireContext(), 0, 14);
        RecyclerPaginatedView recyclerPaginatedView4 = this.V;
        if (recyclerPaginatedView4 == null) {
            recyclerPaginatedView4 = null;
        }
        RecyclerView recyclerView2 = recyclerPaginatedView4.getRecyclerView();
        gpu0 gpu0Var = new gpu0(inflate.getContext());
        gpu0Var.j = lt9Var;
        recyclerView2.addItemDecoration(gpu0Var);
        c.h a2 = ze90.a(0, new d(), cVar, null);
        a2.f = cVar;
        RecyclerPaginatedView recyclerPaginatedView5 = this.V;
        this.W = f.a(a2, recyclerPaginatedView5 != null ? recyclerPaginatedView5 : null);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.vk.lists.c cVar = this.W;
        if (cVar == null) {
            cVar = null;
        }
        cVar.v();
    }

    /* compiled from: CommunitiesManageNotificationsFragment.kt */
    public final class a extends RecyclerView.Adapter<C1442a> implements mf7, jjv0 {
        public a() {
            iah0.a(4);
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            return 6;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void onBindViewHolder(C1442a c1442a, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final C1442a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C1442a c1442a = new C1442a(viewGroup, R.layout.profile_show_info, 0);
            ((ImageView) c1442a.itemView.findViewById(R.id.icon)).setImageResource(R.drawable.vk_icon_add_24);
            ((TextView) c1442a.itemView.findViewById(R.id.text)).setText(R.string.include_community);
            c1442a.itemView.setOnClickListener(new yn3(CommunitiesManageNotificationsFragment.this, 5));
            return c1442a;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }

        /* compiled from: CommunitiesManageNotificationsFragment.kt */
        /* renamed from: com.vk.notifications.settings.CommunitiesManageNotificationsFragment$a$a, reason: collision with other inner class name */
        public final class C1442a extends vif0<Object> {
            @Override // xsna.vif0
            public final void i6(Object obj) {
            }
        }
    }

    /* compiled from: CommunitiesManageNotificationsFragment.kt */
    public final class c extends RecyclerView.Adapter<vif0<?>> implements mf7, nd90<Group>, c.i {
        public int c;
        public final ArrayList<Group> d = new ArrayList<>();

        public c() {
            iah0.a(8);
        }

        @Override // com.vk.lists.c.i
        public final boolean I() {
            return this.d.size() == 0;
        }

        @Override // xsna.nd90, com.vk.lists.c.i
        public final void clear() {
            this.d.clear();
            CommunitiesManageNotificationsFragment.this.S.notifyDataSetChanged();
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            if (this.d.isEmpty()) {
                return 0;
            }
            if (i == 0) {
                return 2;
            }
            return i == getItemCount() - 1 ? 4 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            ArrayList<Group> arrayList = this.d;
            if (arrayList.isEmpty()) {
                return 1;
            }
            return arrayList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.d.isEmpty() ? 2 : 1;
        }

        @Override // xsna.nd90
        public final void h0(List<Group> list) {
            this.d.addAll(list);
            CommunitiesManageNotificationsFragment.this.S.notifyDataSetChanged();
            if (list != null) {
                this.c = ((VKList) list).i();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(vif0<?> vif0Var, int i) {
            vif0<?> vif0Var2 = vif0Var;
            ArrayList<Group> arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            ((blu) vif0Var2).V5(arrayList.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final vif0<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (this.d.isEmpty()) {
                return new a(viewGroup, R.layout.group_notifications_settings_stub_item, 0);
            }
            CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = CommunitiesManageNotificationsFragment.this;
            p pVar = new p(communitiesManageNotificationsFragment, 27);
            blu bluVar = new blu(viewGroup, R.layout.group_item_with_options);
            bluVar.t = new ed4(3, pVar, communitiesManageNotificationsFragment);
            bluVar.s = new xcd(pVar, 4);
            return bluVar;
        }

        /* compiled from: CommunitiesManageNotificationsFragment.kt */
        public final class a extends vif0<Object> {
            @Override // xsna.vif0
            public final void i6(Object obj) {
            }
        }
    }
}
