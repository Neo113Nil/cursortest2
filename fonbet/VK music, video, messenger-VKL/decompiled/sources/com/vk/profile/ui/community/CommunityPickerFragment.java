package com.vk.profile.ui.community;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.blu;
import xsna.bz;
import xsna.dqu;
import xsna.f3p0;
import xsna.fq1;
import xsna.gla;
import xsna.iah0;
import xsna.mf7;
import xsna.nd90;
import xsna.oap;
import xsna.od90;
import xsna.oz50;
import xsna.q6r0;
import xsna.rsg0;
import xsna.vic;
import xsna.vif0;
import xsna.wze;
import xsna.xqu;
import xsna.yfb;
import xsna.ze90;
import xsna.zqu;

/* compiled from: CommunityPickerFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityPickerFragment extends BaseFragment {
    public static final /* synthetic */ int T = 0;
    public RecyclerPaginatedView S;

    /* compiled from: CommunityPickerFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(CommunityPickerFragment.class, null, null);
        }
    }

    /* compiled from: CommunityPickerFragment.kt */
    public static final class c extends RecyclerView.n {
        public final /* synthetic */ b b;

        public c(b bVar) {
            this.b = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            b bVar = this.b;
            int i = bVar.e;
            rect.bottom = childAdapterPosition == bVar.d.size() + (-1) ? i : 0;
            if (childAdapterPosition != 0) {
                i = 0;
            }
            rect.top = i;
        }
    }

    /* compiled from: CommunityPickerFragment.kt */
    public static final class d implements od90<Group> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.od90
        public final q<VKList<Group>> a(oap<Integer, String> oapVar, int i) {
            if (!(oapVar instanceof oap.a)) {
                throw new IllegalStateException("You must use pagination with offset or change paginationType");
            }
            return rsg0.y0(yfb.x(xqu.h(new zqu(), q6r0.f().y(), Collections.singletonList(GroupsFilterDto.CAN_ENABLE_NOTIFICATIONS), Collections.singletonList(GroupsFieldsDto.ACTIVITY), (Integer) ((oap.a) oapVar).a, Integer.valueOf(i), 32)), null, null, 3).U(new fq1(new bz(new dqu()), 10));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 3 && i2 == -1) {
            setResult(-1);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("filter");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.layout_base_fragment, viewGroup, false);
        this.S = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        f3p0.a(toolbar, this, new wze(this, 8));
        toolbar.setTitle(R.string.community_picker_title);
        RecyclerPaginatedView recyclerPaginatedView = this.S;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        b bVar = new b();
        RecyclerPaginatedView recyclerPaginatedView2 = this.S;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        recyclerPaginatedView2.setAdapter(bVar);
        RecyclerPaginatedView recyclerPaginatedView3 = this.S;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        recyclerPaginatedView3.getRecyclerView().addItemDecoration(new c(bVar));
        c.h a2 = ze90.a(0, new d(), bVar, null);
        a2.f = bVar;
        RecyclerPaginatedView recyclerPaginatedView4 = this.S;
        f.a(a2, recyclerPaginatedView4 != null ? recyclerPaginatedView4 : null);
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
    }

    /* compiled from: CommunityPickerFragment.kt */
    public final class b extends RecyclerView.Adapter<vif0<?>> implements mf7, nd90<Group>, vic, c.i {
        public final int c = 1;
        public final ArrayList<Group> d = new ArrayList<>();
        public final int e = iah0.a(8);

        public b() {
        }

        @Override // com.vk.lists.c.i
        public final boolean I() {
            return this.d.size() == 0;
        }

        @Override // xsna.nd90, com.vk.lists.c.i
        public final void clear() {
            this.d.clear();
            notifyDataSetChanged();
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
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.c;
        }

        @Override // xsna.nd90
        public final void h0(List<Group> list) {
            this.d.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(vif0<?> vif0Var, int i) {
            vif0<?> vif0Var2 = vif0Var;
            ArrayList<Group> arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            vif0Var2.itemView.setTag(Integer.valueOf(i));
            ((blu) vif0Var2).i6(arrayList.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final vif0<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (this.d.isEmpty()) {
                return new a(viewGroup, R.layout.group_notifications_settings_stub_item, 0);
            }
            blu bluVar = new blu(viewGroup, R.layout.group_item_simple);
            bluVar.itemView.setOnClickListener(new gla(2, this, CommunityPickerFragment.this));
            return bluVar;
        }

        /* compiled from: CommunityPickerFragment.kt */
        public final class a extends vif0<Object> {
            @Override // xsna.vif0
            public final void i6(Object obj) {
            }
        }
    }
}
