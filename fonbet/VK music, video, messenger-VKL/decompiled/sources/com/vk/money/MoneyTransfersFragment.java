package com.vk.money;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyTransfer;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.money.holders.MoneyTransferHolder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.d0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a0a;
import xsna.anj;
import xsna.b830;
import xsna.bd0;
import xsna.bwt0;
import xsna.cau0;
import xsna.ci0;
import xsna.e9i;
import xsna.f3h0;
import xsna.fgz;
import xsna.fkq0;
import xsna.fnj;
import xsna.g0;
import xsna.g3p0;
import xsna.hf8;
import xsna.iah0;
import xsna.iin0;
import xsna.j6r0;
import xsna.jbs;
import xsna.jx2;
import xsna.koc;
import xsna.lhg;
import xsna.lz;
import xsna.m730;
import xsna.o010;
import xsna.o0r0;
import xsna.o25;
import xsna.oh;
import xsna.oqu;
import xsna.oz50;
import xsna.q1w;
import xsna.qa;
import xsna.r4;
import xsna.rsg0;
import xsna.rwi;
import xsna.s11;
import xsna.t730;
import xsna.tfx;
import xsna.to;
import xsna.u730;
import xsna.uq;
import xsna.v16;
import xsna.v730;
import xsna.v98;
import xsna.vr6;
import xsna.w16;
import xsna.w730;
import xsna.xwk;
import xsna.yfb;

/* loaded from: classes3.dex */
public class MoneyTransfersFragment extends VKRecyclerFragment<MoneyTransfer> implements iin0 {
    public static final int b1;
    public ViewGroup I0;
    public ViewGroup J0;
    public View K0;
    public View L0;
    public c M0;
    public UserId N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public int Y0;
    public volatile boolean Z0;
    public final a a1;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i = MoneyTransfersFragment.b1;
            MoneyTransfersFragment moneyTransfersFragment = MoneyTransfersFragment.this;
            if (moneyTransfersFragment.v0 != null) {
                String action = intent.getAction();
                action.getClass();
                switch (action) {
                    case "com.vkontakte.android.ACTION_MONEY_TRANSFER_ACCEPTED":
                        MoneyTransfersFragment.Io(moneyTransfersFragment, intent.getIntExtra("transfer_id", 0), 1);
                        break;
                    case "com.vkontakte.android.ACTION_MONEY_TRANSFER_SENT":
                        moneyTransfersFragment.Do();
                        break;
                    case "com.vkontakte.android.ACTION_MONEY_TRANSFER_CANCELLED":
                        MoneyTransfersFragment.Io(moneyTransfersFragment, intent.getIntExtra("transfer_id", 0), 2);
                        break;
                }
            }
        }
    }

    public class b extends fgz<MoneyTransfer> {
        @Override // xsna.fgz, xsna.hx2
        public final void b(Object obj) {
            super.b((VKList) obj);
        }
    }

    public class c extends UsableRecyclerView.c<UsableRecyclerView.x> {
        public final boolean c;

        public c(boolean z) {
            this.c = z;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            int i3 = MoneyTransfersFragment.b1;
            return ((MoneyTransfer) MoneyTransfersFragment.this.v0.get(this.c ? i - 2 : i - 1)).f().h;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            boolean z = this.c;
            if (!z || i >= 2) {
                return (z || i != 0) ? 1 : 0;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = MoneyTransfersFragment.b1;
            MoneyTransfersFragment moneyTransfersFragment = MoneyTransfersFragment.this;
            if (moneyTransfersFragment.v0.size() > 0) {
                return moneyTransfersFragment.Q0 ? moneyTransfersFragment.v0.size() + 2 : moneyTransfersFragment.v0.size() + 1;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            boolean z = this.c;
            if (z && i == 0) {
                return 0;
            }
            if (z && i == 1) {
                return 2;
            }
            return (z || i != 0) ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            UsableRecyclerView.x xVar = (UsableRecyclerView.x) e0Var;
            L.A("MoneyTransfersAdapter", lhg.a(i, "onBindViewHolder + position = "));
            if (xVar instanceof MoneyTransferHolder) {
                MoneyTransferHolder moneyTransferHolder = (MoneyTransferHolder) xVar;
                int i2 = MoneyTransfersFragment.b1;
                moneyTransferHolder.V5((MoneyTransfer) MoneyTransfersFragment.this.v0.get(this.c ? i - 2 : i - 1));
            }
            if (xVar instanceof f) {
                ((TextView) ((f) xVar).itemView.findViewById(R.id.title)).setText(R.string.money_transfer_transfers_history);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new e(MoneyTransfersFragment.this.I0);
            }
            if (i == 1) {
                return new MoneyTransferHolder(viewGroup, MoneyTransferHolder.TransferType.TRANSFER);
            }
            if (i != 2) {
                return null;
            }
            return new f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_text_title, (ViewGroup) null));
        }
    }

    public static class d extends oz50 {
        public d() {
            super(MoneyTransfersFragment.class, null, null);
            x();
        }

        public final void A(boolean z) {
            this.j.putBoolean("start_with_link", z);
        }

        public final void B(boolean z) {
            this.j.putBoolean("start_with_request", z);
        }

        public final void C() {
            this.j.putBoolean("show_toolbar", true);
        }

        public final void y(String str) {
            this.j.putString("amount", str);
        }

        public final void z(boolean z) {
            this.j.putBoolean("start_for_friends_picker", z);
        }
    }

    public class e extends UsableRecyclerView.x {
    }

    public class f extends UsableRecyclerView.x {
    }

    static {
        WeakHashMap weakHashMap = j6r0.a;
        b1 = iah0.a(16.0f);
    }

    public MoneyTransfersFragment() {
        super(20);
        this.N0 = UserId.d;
        this.Z0 = false;
        this.a1 = new a();
    }

    public static void Io(MoneyTransfersFragment moneyTransfersFragment, int i, int i2) {
        MoneyTransfer moneyTransfer;
        c cVar = (c) moneyTransfersFragment.wo();
        Iterator it = moneyTransfersFragment.v0.iterator();
        while (true) {
            if (!it.hasNext()) {
                moneyTransfer = null;
                break;
            } else {
                moneyTransfer = (MoneyTransfer) it.next();
                if (moneyTransfer.c == i) {
                    break;
                }
            }
        }
        if (moneyTransfer != null) {
            moneyTransfer.j = i2;
            int i3 = moneyTransfer.c;
            MoneyTransfersFragment moneyTransfersFragment2 = MoneyTransfersFragment.this;
            int i4 = 0;
            while (true) {
                if (i4 >= moneyTransfersFragment2.v0.size()) {
                    i4 = -1;
                    break;
                } else if (((MoneyTransfer) moneyTransfersFragment2.v0.get(i4)).c == i3) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 != -1) {
                i4 = cVar.c ? i4 + 2 : i4 + 1;
            }
            cVar.notifyItemChanged(i4);
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public final boolean Ci() {
        return this.T0;
    }

    public final void Jo() {
        if (fkq0.d(this.N0) && this.Z0) {
            new f3h0(requireContext()).a(this.N0, 0, "", null);
        } else {
            MoneyTransferPagerFragment.a aVar = new MoneyTransferPagerFragment.a();
            aVar.B(this.N0);
            aVar.k(getActivity());
        }
        if (this.S0) {
            finish();
        }
    }

    public final void Ko() {
        new MoneyTransferLinkFragment.a(false).g(1008, this);
        if (this.S0) {
            finish();
        }
    }

    public final void Lo() {
        MoneyTransferPagerFragment.a aVar = new MoneyTransferPagerFragment.a();
        aVar.B(this.N0);
        aVar.j.putBoolean("isChatRequest", this.X0);
        if (!this.X0) {
            aVar.A(true);
        }
        aVar.k(getActivity());
        if (this.S0) {
            finish();
        }
    }

    public final void Mo(int i) {
        Context requireContext = requireContext();
        String string = i == 1006 ? requireContext.getString(R.string.money_transfer_send) : requireContext.getString(R.string.money_transfer_request);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = i == 1006 ? MobileOfficialAppsCoreNavStat$EventScreen.MONEY_FRIENDS_SEND : MobileOfficialAppsCoreNavStat$EventScreen.MONEY_FRIENDS_REQUEST;
        o0r0 e2 = xwk.e();
        jbs jbsVar = new jbs(this);
        List list = Collections.EMPTY_LIST;
        e2.b(jbsVar, false, false, false, false, i, string, null, null, null, null, list, list, list, mobileOfficialAppsCoreNavStat$EventScreen, null);
    }

    public final void No() {
        if (this.J0 == null || this.S0 || fnj.d(mo2getContext())) {
            return;
        }
        ((ImageView) this.J0.findViewById(R.id.iv_money_transfer)).setVisibility(8);
        this.J0.findViewById(R.id.ll_friends_container).setVisibility(8);
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        return this.Q;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        long[] longArrayExtra;
        if (i2 != -1) {
            if (getArguments().getBoolean("start_for_friends_picker", false) || getArguments().getBoolean("start_with_link", false)) {
                finish();
                return;
            }
            return;
        }
        if ((i != 1006 && i != 1007) || (longArrayExtra = intent.getLongArrayExtra("ids")) == null || longArrayExtra.length == 0) {
            return;
        }
        this.U0 = i == 1007;
        UserId userId = new UserId(longArrayExtra[0]);
        String string = getArguments().getString("amount", "");
        getArguments().getString(InAppPurchaseMetaData.KEY_CURRENCY, "");
        MoneyTransferPagerFragment.a aVar = new MoneyTransferPagerFragment.a();
        aVar.B(userId);
        aVar.y(string);
        if (this.U0) {
            aVar.A(true);
        }
        aVar.k(getActivity());
        if (this.S0) {
            finish();
        }
        if (getArguments().getBoolean("start_for_friends_picker", false)) {
            finish();
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.N0 = getArguments().getParcelable("peer_id") != null ? (UserId) getArguments().getParcelable("peer_id") : UserId.d;
        this.O0 = getArguments().getInt(CommonUrlParts.REQUEST_ID, 0);
        this.P0 = getArguments().getInt("filter", 0);
        boolean z = getArguments().getBoolean("show_toolbar", false);
        this.T0 = z;
        if (z) {
            setTitle(getResources().getString(R.string.money_transfer_hub_toolbar_title));
        } else {
            setTitle(getResources().getString(R.string.money_transfer_money));
        }
        this.Q0 = getArguments().getBoolean("show_header", true) && o25.a().w();
        boolean z2 = getArguments().getBoolean("allow_refresh", true);
        this.R0 = z2;
        this.S0 = !z2;
        this.V0 = getArguments().getBoolean("allow_requests", true);
        this.W0 = getArguments().getBoolean("allow_transfers", true);
        this.X0 = getArguments().getBoolean("for_chat", false);
        this.Y0 = getArguments().getBoolean("start_with_request", false) ? 1007 : 1006;
        this.Z0 = false;
        qo();
        if (this.T0) {
            setHasOptionsMenu(true);
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = getResources().getDisplayMetrics().heightPixels;
        if (configuration.orientation == 1) {
            WeakHashMap weakHashMap = j6r0.a;
            if (i < iah0.a(650.0f)) {
                No();
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.ACTION_MONEY_TRANSFER_ACCEPTED");
        intentFilter.addAction("com.vkontakte.android.ACTION_MONEY_TRANSFER_SENT");
        intentFilter.addAction("com.vkontakte.android.ACTION_MONEY_TRANSFER_CANCELLED");
        anj.d(kn(), this.a1, intentFilter, hf8.a, 4);
        if (getArguments().getBoolean("start_with_link", false)) {
            new Handler().post(new g0(this, 15));
        } else if (getArguments().getBoolean("start_for_friends_picker", false)) {
            new Handler().post(new oh(this, 9));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem add = menu.add(R.string.help);
        add.setIcon(R.drawable.vk_icon_help_outline_28);
        add.setShowAsAction(2);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        bwt0.Z(R.attr.vk_legacy_background_content, onCreateView);
        Ho(this.R0);
        View view = this.a0;
        if (view != null) {
            this.L0 = view.findViewById(R.id.error_retry);
        }
        return onCreateView;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getActivity().unregisterReceiver(this.a1);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, xsna.cbs
    public final void onError(@NonNull Throwable th) {
        super.onError(th);
        if (th == null || this.L0 == null) {
            return;
        }
        if (((VKApiExecutionException) th).s() == 5800) {
            this.L0.setVisibility(8);
        } else {
            this.L0.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        rwi.d().e().b(mo2getContext(), MoneyTransfer.n(a0a.d));
        return true;
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            if (this.S0) {
                bwt0.Z(R.attr.vk_ui_background_modal, toolbar);
                g3p0.c(toolbar);
            }
            if (!this.T0) {
                this.Q.setVisibility(8);
            }
            ((AppBarLayout.d) toolbar.getLayoutParams()).a = 0;
        }
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = this.S0;
        int i = 5;
        int i2 = R.id.fl_send_money;
        if (z) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.money_transfer_header, (ViewGroup) null);
            this.I0 = viewGroup2;
            View findViewById = viewGroup2.findViewById(R.id.fl_send_money);
            View findViewById2 = this.I0.findViewById(R.id.fl_divider);
            if (this.W0) {
                findViewById.setOnClickListener(new r4(this, i));
            } else {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
            }
            View findViewById3 = this.I0.findViewById(R.id.fl_request_money);
            boolean z2 = this.V0;
            if (z2 && !this.W0) {
                View findViewById4 = this.I0.findViewById(R.id.fl_request_money_chat);
                findViewById4.setVisibility(0);
                findViewById4.setOnClickListener(new ci0(this, 9));
                findViewById3.setVisibility(8);
                findViewById2.setVisibility(8);
            } else if (z2) {
                findViewById3.setOnClickListener(new vr6(this, 5));
            } else {
                findViewById3.setVisibility(8);
                findViewById2.setVisibility(8);
            }
        } else {
            ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(R.layout.money_transfer_header_list, (ViewGroup) null);
            this.I0 = viewGroup3;
            RecyclerView recyclerView = (RecyclerView) viewGroup3.findViewById(R.id.recycler);
            mo2getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            FragmentActivity activity = getActivity();
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(mo2getContext());
            activity.getMenuInflater().inflate(R.menu.money_transfer_menu, fVar);
            ListDataSet listDataSet = new ListDataSet();
            for (int i3 = 0; i3 < fVar.f.size(); i3++) {
                MenuItem item = fVar.getItem(i3);
                int itemId = item.getItemId();
                if (itemId == R.id.money_transfer_send) {
                    if (this.W0) {
                        listDataSet.s(new w730(item));
                    }
                } else if (itemId == R.id.money_transfer_request) {
                    if (this.V0) {
                        listDataSet.s(new w730(item));
                    }
                } else if (itemId == R.id.money_transfer_link) {
                    listDataSet.s(new w730(item));
                }
            }
            recyclerView.setAdapter(new t730(new o010(this, 6), listDataSet));
        }
        View ro = super.ro(layoutInflater, viewGroup, bundle);
        UsableRecyclerView usableRecyclerView = this.n0;
        int i4 = b1;
        usableRecyclerView.addItemDecoration(new v98(0, i4, i4, false));
        if (this.Q0) {
            if (this.K0 != null) {
                ((ViewGroup) this.n0.getParent()).removeView(this.K0);
            }
            View inflate = layoutInflater.inflate(this.S0 ? R.layout.money_transfer_info_attach : R.layout.money_transfer_info, (ViewGroup) null);
            this.K0 = inflate;
            this.J0 = (ViewGroup) inflate.findViewById(R.id.ll_container);
            this.K0.setVisibility(8);
            ((ViewGroup) this.n0.getParent()).addView(this.K0);
            Go("");
            this.n0.setEmptyView(this.K0);
            this.J0.findViewById(R.id.tv_read_more).setOnClickListener(new b830());
            ViewGroup viewGroup4 = this.J0;
            if (!this.S0) {
                i2 = R.id.btn_send;
            }
            View findViewById5 = viewGroup4.findViewById(i2);
            if (this.W0) {
                findViewById5.setOnClickListener(new bd0(this, 9));
            } else {
                findViewById5.setVisibility(8);
            }
            View findViewById6 = this.J0.findViewById(R.id.btn_link);
            if (findViewById6 != null) {
                findViewById6.setOnClickListener(new e9i(this, 8));
            }
            if (this.S0) {
                View findViewById7 = this.J0.findViewById(R.id.fl_request_money);
                View findViewById8 = this.J0.findViewById(R.id.fl_divider);
                if (!this.W0) {
                    findViewById8.setVisibility(8);
                }
                boolean z3 = this.V0;
                if (z3 && !this.W0) {
                    View findViewById9 = this.J0.findViewById(R.id.fl_request_money_chat);
                    findViewById9.setVisibility(0);
                    findViewById9.setOnClickListener(new v16(this, 5));
                    ((TextView) this.J0.findViewById(R.id.tv_title)).setText(R.string.money_transfer_request_money_to_friend_desc_title);
                    ((TextView) this.J0.findViewById(R.id.tv_description)).setText(R.string.money_transfer_request_money_to_friend_desc_subtitle);
                    findViewById7.setVisibility(8);
                    findViewById8.setVisibility(8);
                } else if (z3) {
                    findViewById7.setOnClickListener(new w16(this, 9));
                } else {
                    findViewById7.setVisibility(8);
                    findViewById8.setVisibility(8);
                }
            }
            if (!this.S0) {
                Configuration configuration = getResources().getConfiguration();
                int i5 = getResources().getDisplayMetrics().heightPixels;
                if (configuration.orientation == 1) {
                    WeakHashMap weakHashMap = j6r0.a;
                    if (i5 < iah0.a(650.0f)) {
                        No();
                    }
                }
            }
        }
        return ro;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        cau0 cau0Var = q1w.a.r().h;
        if (i == 0) {
            Features.Type type = Features.Type.FEATURE_IM_MONEY_ATTACH_DEFAULT_SBP;
            type.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.a(type)) {
                Features.Type type2 = Features.Type.FEATURE_IM_SBP_MINIAPP_TRANSFER;
                type2.getClass();
                if (bVar.a(type2)) {
                    fgz fgzVar = new fgz(this);
                    int i3 = this.P0;
                    UserId userId = this.N0;
                    int i4 = this.O0;
                    tfx tfxVar = new tfx("money.getTransferMethods", new s11(17), new to(21));
                    tfx.n(tfxVar, "receiver_id", userId, 0L, 0L, 12);
                    tfxVar.j("need_sbp_include", true);
                    this.i0 = x.B(new d0(rsg0.w0(yfb.x(tfxVar)).l(new qa(new oqu(11), 28)), new uq(12), null), rsg0.w0(new m730(i3, userId, i, i2, i4)), new u730(v730.b, 0)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new koc(1, this, fgzVar), new lz(fgzVar, 23));
                    return;
                }
            }
        }
        this.i0 = new jx2(new m730(this.P0, this.N0, i, i2, this.O0), new b(this)).a();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter wo() {
        if (this.M0 == null) {
            this.M0 = new c(this.Q0);
        }
        return this.M0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = !getArguments().getBoolean("allow_refresh", true) ? MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_MONEY_TRANSFER : this.N0.b != 0 ? MobileOfficialAppsCoreNavStat$EventScreen.MONEY_TRANSFERS_WITH_PEER : MobileOfficialAppsCoreNavStat$EventScreen.MONEY_TRANSFERS;
    }
}
