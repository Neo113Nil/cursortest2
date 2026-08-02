package com.vk.profile.community.details.impl.name_history;

import android.os.Bundle;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.profile.community.details.impl.name_history.a;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.ao50;
import xsna.aud;
import xsna.b1h;
import xsna.cn70;
import xsna.df90;
import xsna.e4;
import xsna.f4m;
import xsna.fkq0;
import xsna.gb;
import xsna.gm50;
import xsna.ht;
import xsna.jcg;
import xsna.km50;
import xsna.mk50;
import xsna.nv2;
import xsna.oz50;
import xsna.qah;
import xsna.qb6;
import xsna.tlo0;
import xsna.tq;
import xsna.vk50;
import xsna.xn50;
import xsna.zqu;

/* compiled from: CommunityNameHistoryFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityNameHistoryFragment extends MviImplFragment<com.vk.profile.community.details.impl.name_history.b, e, com.vk.profile.community.details.impl.name_history.a> {
    public static final /* synthetic */ int S = 0;
    public final qah Q = new qah();
    public final b R = new b();

    /* compiled from: CommunityNameHistoryFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(CommunityNameHistoryFragment.class, null, null);
            this.j.putParcelable("GROUP_ID", userId);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.community_name_history_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        e eVar = (e) ao50Var;
        UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) view.findViewById(R.id.paginated_view);
        usableRecyclerPaginatedView.setAdapter(this.Q);
        usableRecyclerPaginatedView.setOnRefreshListener(new e4(this, 25));
        usableRecyclerPaginatedView.setOnReloadRetryClickListener(new jcg(this, 3));
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, usableRecyclerPaginatedView).a();
        usableRecyclerPaginatedView.Om(this.R);
        f4m.y(cn70.b(8), usableRecyclerPaginatedView.getRecyclerView());
        usableRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        vkTopBar.setBack(new VkTopBar.b(new b1h(this, 1), tq.h(tlo0.Companion, R.string.community_profile_accessibility_back), null, null, com.vk.core.compose.component.semantics.b.a(null, new ht(15), 3), 12));
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.group_name_history), null, null, null, null, 30), cVar, objArr, objArr2, 14));
        gm50.a.b(this, eVar.a, new qb6(7, this, usableRecyclerPaginatedView));
        gm50.a.b(this, eVar.b, new nv2(14, this, usableRecyclerPaginatedView));
        gm50.a.b(this, eVar.c, new gb(10, this, usableRecyclerPaginatedView));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId = (UserId) bundle.getParcelable("GROUP_ID");
        if (userId == null) {
            userId = UserId.d;
        }
        return new com.vk.profile.community.details.impl.name_history.b(new aud(new zqu(), userId));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        UserId userId;
        Bundle arguments = getArguments();
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, Long.valueOf(((arguments == null || (userId = (UserId) arguments.getParcelable("GROUP_ID")) == null) ? UserId.d : fkq0.e(userId)).b), null, null, null, null, 60, null);
    }

    /* compiled from: CommunityNameHistoryFragment.kt */
    public static final class b implements df90 {
        public b() {
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            if (i - 5 > i3 || i3 > i) {
                return;
            }
            xn50.a.c(CommunityNameHistoryFragment.this, a.b.b);
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }
}
