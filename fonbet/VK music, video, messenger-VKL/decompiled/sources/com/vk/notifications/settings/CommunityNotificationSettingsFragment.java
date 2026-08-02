package com.vk.notifications.settings;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.gbh;
import xsna.gjf0;
import xsna.gpu0;
import xsna.gzs;
import xsna.is1;
import xsna.jkc;
import xsna.jpf;
import xsna.js1;
import xsna.kbe;
import xsna.kf6;
import xsna.oq;
import xsna.oz50;
import xsna.ozf;
import xsna.q3j0;
import xsna.rmg;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sfg;
import xsna.tlo0;
import xsna.tq;
import xsna.vif0;
import xsna.we6;
import xsna.whp;
import xsna.wqt;
import xsna.y6;
import xsna.yve;
import xsna.zvw;

/* compiled from: CommunityNotificationSettingsFragment.kt */
/* loaded from: classes4.dex */
public final class CommunityNotificationSettingsFragment extends BaseFragment {
    public static final /* synthetic */ int b0 = 0;
    public long T;
    public VkTopBar U;
    public com.vk.notifications.settings.c V;
    public MenuItem W;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public final bpn0 S = new bpn0(new ozf(this, 6));
    public final d X = new d(null);

    /* compiled from: CommunityNotificationSettingsFragment.kt */
    public static final class a extends oz50 {
        public a(long j, String str) {
            super(CommunityNotificationSettingsFragment.class, null, null);
            this.j.putLong("id", j);
            this.j.putString("title", str);
        }

        public final void y() {
            this.j.putBoolean("already_added", true);
        }
    }

    /* compiled from: CommunityNotificationSettingsFragment.kt */
    public final class b extends we6 {
        public final int g = 3;

        /* compiled from: CommunityNotificationSettingsFragment.kt */
        public final class a extends vif0<b> {
            @Override // xsna.vif0
            public final /* bridge */ /* synthetic */ void i6(b bVar) {
            }
        }

        public b() {
        }

        @Override // xsna.we6
        public final vif0 a(ViewGroup viewGroup) {
            a aVar = new a(new VkCellButton(viewGroup.getContext(), null, 6));
            VkCellButton vkCellButton = (VkCellButton) aVar.itemView;
            vkCellButton.setTitle(R.string.disable_community);
            vkCellButton.setAppearance(Appearance.Negative);
            vkCellButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vkCellButton.setOnClickListener(new jkc(2, aVar, CommunityNotificationSettingsFragment.this));
            return aVar;
        }

        @Override // xsna.we6
        public final int h() {
            return this.g;
        }
    }

    /* compiled from: CommunityNotificationSettingsFragment.kt */
    public interface c extends whp {
        boolean d();

        String getTitle();

        gzs<s3q0> j();

        String k();
    }

    /* compiled from: CommunityNotificationSettingsFragment.kt */
    public final class d extends zvw {
        @Override // xsna.zvw, xsna.jjv0
        public final int n1(int i) {
            return (i != 0 && (((we6) this.c.c(i)).b() & 2) == 2) ? 1 : 0;
        }
    }

    /* compiled from: CommunityNotificationSettingsFragment.kt */
    public final class e extends we6 {
        public final q3j0 g;
        public final int h = 2;

        /* compiled from: CommunityNotificationSettingsFragment.kt */
        public final class a extends vif0<e> {
            public a(ViewGroup viewGroup) {
                super(new VkCell(viewGroup.getContext(), null, 6, 0), viewGroup);
            }

            @Override // xsna.vif0
            public final void i6(e eVar) {
                e eVar2 = eVar;
                VkCell vkCell = (VkCell) this.itemView;
                vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                VkCell.Middle.a aVar = VkCell.Middle.Companion;
                tlo0.a aVar2 = tlo0.Companion;
                q3j0 q3j0Var = eVar2.g;
                vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(oq.d(aVar2, q3j0Var.c), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
                vkCell.setRight(q6(eVar2));
                vkCell.setEnabled(q3j0Var.e);
            }

            public final VkCell.Right.d q6(e eVar) {
                VkCell.Right.c cVar = VkCell.Right.Companion;
                q3j0 q3j0Var = eVar.g;
                return VkCell.Right.c.a(cVar, new VkCell.Right.a.f(new y6(this, 29), q3j0Var.d, q3j0Var.e), null, null, null, 30);
            }
        }

        public e(q3j0 q3j0Var) {
            this.g = q3j0Var;
        }

        @Override // xsna.we6
        public final vif0 a(ViewGroup viewGroup) {
            return new a(viewGroup);
        }

        @Override // xsna.we6
        public final int h() {
            return this.h;
        }
    }

    /* compiled from: CommunityNotificationSettingsFragment.kt */
    public static final class f extends we6 {
        public final String g;
        public final int h = 1;

        /* compiled from: CommunityNotificationSettingsFragment.kt */
        public static final class a extends vif0<f> {
            public final VkGroupHeader n;

            public a(ViewGroup viewGroup) {
                super(new VkGroupHeader(viewGroup.getContext(), null, 6));
                this.n = (VkGroupHeader) this.itemView;
            }

            @Override // xsna.vif0
            public final void i6(f fVar) {
                String str = fVar.g;
                if (str == null) {
                    return;
                }
                VkGroupHeader.Size size = VkGroupHeader.Size.Small;
                VkGroupHeader vkGroupHeader = this.n;
                vkGroupHeader.setSize(size);
                vkGroupHeader.setTitle(new VkGroupHeader.d(str, null, null, null, 0, null, 510));
            }
        }

        public f(String str) {
            this.g = str;
        }

        @Override // xsna.we6
        public final vif0 a(ViewGroup viewGroup) {
            return new a(viewGroup);
        }

        @Override // xsna.we6
        public final int h() {
            return this.h;
        }
    }

    @SuppressLint({"CheckResult"})
    public final void io() {
        rsg0.y0(new wqt(this.T, this.a0 || this.Y || !this.Z), null, null, 3).subscribe(new is1(new rmg(this, 1), 15), new js1(new yve(this, 5), 19));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            io();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.T = (arguments != null ? Long.valueOf(arguments.getLong("id")) : null).longValue();
        Bundle arguments2 = getArguments();
        this.Y = arguments2 != null ? arguments2.getBoolean("already_added", false) : false;
        Bundle arguments3 = getArguments();
        this.Z = arguments3 != null ? arguments3.getBoolean("from_url", false) : false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_done, menu);
        MenuItem findItem = menu.findItem(R.id.done);
        this.W = findItem;
        findItem.setVisible(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_community_notification_settings, viewGroup, false);
        this.V = new com.vk.notifications.settings.c(mo2getContext());
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.recycler_container);
        if (viewGroup2 != null) {
            com.vk.notifications.settings.c cVar = this.V;
            if (cVar == null) {
                cVar = null;
            }
            viewGroup2.addView(cVar);
        }
        com.vk.notifications.settings.c cVar2 = this.V;
        if (cVar2 == null) {
            cVar2 = null;
        }
        d dVar = this.X;
        cVar2.setAdapter(dVar);
        com.vk.notifications.settings.c cVar3 = this.V;
        if (cVar3 == null) {
            cVar3 = null;
        }
        RecyclerView recyclerView = cVar3.getRecyclerView();
        mo2getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        kbe kbeVar = new kbe(this, 4);
        gpu0 gpu0Var = new gpu0(recyclerView.getContext());
        gpu0Var.j = new kf6(kbeVar);
        recyclerView.addItemDecoration(gpu0Var);
        com.vk.notifications.settings.c cVar4 = this.V;
        if (cVar4 == null) {
            cVar4 = null;
        }
        gjf0.e(cVar4, requireContext(), 0, 14);
        com.vk.notifications.settings.c cVar5 = this.V;
        if (cVar5 == null) {
            cVar5 = null;
        }
        gpu0 gpu0Var2 = new gpu0(inflate.getContext());
        gpu0Var2.j = dVar;
        cVar5.setItemDecoration(gpu0Var2);
        com.vk.notifications.settings.c cVar6 = this.V;
        if (cVar6 == null) {
            cVar6 = null;
        }
        cVar6.setOnRefreshListener(new jpf(this, 3));
        com.vk.notifications.settings.c cVar7 = this.V;
        if (cVar7 == null) {
            cVar7 = null;
        }
        cVar7.setOnReloadRetryClickListener(new sfg(this, 2));
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        this.U = vkTopBar;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("title") : null;
        if (string == null) {
            string = "";
        }
        vkTopBar.setBack(new VkTopBar.b(new gbh(this, 0), tq.h(tlo0.Companion, R.string.community_notifications_back), null, null, null, 28));
        tlo0.h hVar = new tlo0.h(string);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(hVar, null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        setHasOptionsMenu(true);
        io();
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, Long.valueOf(this.T), null, null, null, null, 60, null);
    }
}
