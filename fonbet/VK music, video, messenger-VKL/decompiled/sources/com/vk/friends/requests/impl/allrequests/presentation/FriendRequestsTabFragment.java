package com.vk.friends.requests.impl.allrequests.presentation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.base.GridFragment;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.af50;
import xsna.anj;
import xsna.asu0;
import xsna.dhr0;
import xsna.dv4;
import xsna.enj;
import xsna.fos;
import xsna.h03;
import xsna.h1j;
import xsna.h7u0;
import xsna.hf8;
import xsna.hx2;
import xsna.iah0;
import xsna.j6r0;
import xsna.jx2;
import xsna.mf1;
import xsna.msy;
import xsna.n1r;
import xsna.nh40;
import xsna.ots;
import xsna.oz50;
import xsna.qis;
import xsna.rsg0;
import xsna.vfk;
import xsna.vif0;
import xsna.w8i;
import xsna.wos;
import xsna.wwf0;
import xsna.yrn;
import xsna.zi50;

/* loaded from: classes16.dex */
public class FriendRequestsTabFragment extends GridFragment<RequestUserProfile> implements w8i {
    public static final /* synthetic */ int X0 = 0;
    public final Object L0;
    public final ots M0;
    public final zi50 N0;
    public final vfk O0;
    public final com.vk.friends.requests.impl.allrequests.presentation.a P0;
    public final dv4 Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public int U0;
    public final io.reactivex.rxjava3.disposables.b V0;
    public final a W0;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            UserId userId;
            if (!"com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED".equals(intent.getAction()) || (userId = (UserId) intent.getParcelableExtra("id")) == null) {
                return;
            }
            int intExtra = intent.getIntExtra("status", 0);
            int i = FriendRequestsTabFragment.X0;
            FriendRequestsTabFragment friendRequestsTabFragment = FriendRequestsTabFragment.this;
            if (friendRequestsTabFragment.v0 != null) {
                for (int i2 = 0; i2 < friendRequestsTabFragment.v0.size(); i2++) {
                    RequestUserProfile requestUserProfile = (RequestUserProfile) friendRequestsTabFragment.v0.get(i2);
                    if (requestUserProfile.c.equals(userId)) {
                        requestUserProfile.i0 = Boolean.valueOf(intExtra == 1 || intExtra == 3);
                        GridFragment<RequestUserProfile>.b<?> wo = friendRequestsTabFragment.wo();
                        if (wo != null) {
                            wo.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {

        public class a implements hx2<Boolean> {
            public a() {
            }

            @Override // xsna.hx2
            public final void b(Boolean bool) {
                b bVar = b.this;
                if (FriendRequestsTabFragment.this.isResumed()) {
                    FriendRequestsTabFragment.this.finish();
                }
            }

            @Override // xsna.hx2
            public final void e(VKApiExecutionException vKApiExecutionException) {
                h03.b(vKApiExecutionException);
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            jx2 jx2Var = new jx2(new fos("friends.deleteAllRequests"), new a());
            jx2Var.g = FriendRequestsTabFragment.this.mo2getContext();
            jx2Var.a();
        }
    }

    public class c extends GridFragment<RequestUserProfile>.b<qis> implements yrn.a {
        public c() {
            super();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String B(int i, int i2) {
            RequestUserProfile requestUserProfile;
            if (i >= 0) {
                int i3 = FriendRequestsTabFragment.X0;
                FriendRequestsTabFragment friendRequestsTabFragment = FriendRequestsTabFragment.this;
                if (i < friendRequestsTabFragment.v0.size()) {
                    requestUserProfile = (RequestUserProfile) friendRequestsTabFragment.v0.get(i);
                    if (requestUserProfile != null) {
                        if (i2 == 0) {
                            return requestUserProfile.h;
                        }
                        UserProfile[] userProfileArr = requestUserProfile.j0;
                        int i4 = i2 - 1;
                        if (userProfileArr != null && i4 >= 0 && i4 < userProfileArr.length) {
                            return userProfileArr[i4].h;
                        }
                    }
                    return null;
                }
            }
            requestUserProfile = null;
            if (requestUserProfile != null) {
            }
            return null;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            int i2 = FriendRequestsTabFragment.X0;
            UserProfile[] userProfileArr = ((RequestUserProfile) FriendRequestsTabFragment.this.v0.get(i)).j0;
            return (userProfileArr == null ? 0 : userProfileArr.length) + 1;
        }

        @Override // xsna.yrn.a
        public final boolean Z(RecyclerView.e0 e0Var) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            qis qisVar = new qis(viewGroup, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_REQUESTS));
            FriendRequestsTabFragment friendRequestsTabFragment = FriendRequestsTabFragment.this;
            vfk vfkVar = friendRequestsTabFragment.O0;
            com.vk.friends.requests.impl.allrequests.presentation.a aVar = friendRequestsTabFragment.P0;
            dv4 dv4Var = friendRequestsTabFragment.Q0;
            qisVar.E = vfkVar;
            qisVar.F = aVar;
            qisVar.G = dv4Var;
            return qisVar;
        }
    }

    public static class d extends oz50 {
        public final void y() {
            this.j.putBoolean("out", true);
        }
    }

    public FriendRequestsTabFragment() {
        super(20);
        this.L0 = msy.a(LazyThreadSafetyMode.NONE, new h1j(this, 14));
        this.M0 = new ots();
        this.N0 = new zi50();
        this.O0 = new vfk(this, 10);
        this.P0 = new com.vk.friends.requests.impl.allrequests.presentation.a(this, 0);
        this.Q0 = new dv4(this, 6);
        this.V0 = new io.reactivex.rxjava3.disposables.b();
        this.W0 = new a();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final GridFragment<RequestUserProfile>.b<?> Io() {
        return new c();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final int Ko() {
        return (!this.U || this.V < 800) ? 1 : 2;
    }

    public final void Mo(RequestUserProfile requestUserProfile, int i) {
        UsableRecyclerView usableRecyclerView = this.n0;
        if (usableRecyclerView == null) {
            return;
        }
        vif0 vif0Var = (vif0) usableRecyclerView.findViewHolderForAdapterPosition(i);
        if (vif0Var != null && vif0Var.m == requestUserProfile) {
            vif0Var.o6();
            return;
        }
        c cVar = (c) wo();
        FriendRequestsTabFragment friendRequestsTabFragment = FriendRequestsTabFragment.this;
        if (((i < 0 || i >= friendRequestsTabFragment.v0.size()) ? null : (RequestUserProfile) friendRequestsTabFragment.v0.get(i)) != null) {
            FriendRequestsTabFragment.this.v0.set(i, requestUserProfile);
            cVar.notifyItemChanged(i);
        }
    }

    @Nullable
    public String getRef() {
        return null;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        I();
        Do();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.S0 = arguments.getBoolean("out", false);
            this.T0 = arguments.getBoolean("suggests", false);
            this.R0 = arguments.getBoolean("menu_clear_all", false);
        }
        setHasOptionsMenu(this.R0);
        anj.d(kn(), this.W0, new IntentFilter("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED"), hf8.a, 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (this.R0) {
            MenuItem add = menu.add(0, R.id.btn_clear, 0, R.string.clear);
            add.setShowAsAction(2);
            add.setIcon(R.drawable.vk_icon_delete_24);
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.V0.dispose();
        enj.s(kn(), this.W0);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.btn_clear || this.v0.isEmpty()) {
            return super.onOptionsItemSelected(menuItem);
        }
        h7u0.a aVar = new h7u0.a(getActivity());
        aVar.g0(R.string.requests_list_requests);
        aVar.U(R.string.all_requests_list_delete_all_requests);
        aVar.W(R.string.no, null);
        aVar.c0(R.string.yes, new b());
        aVar.m();
        return true;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setTitle(this.T0 ? R.string.all_requests_list_friend_suggestions : R.string.requests_list_requests);
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            dhr0.a.getClass();
            dhr0.n0(toolbar, R.attr.vk_legacy_header_text);
        }
        UsableRecyclerView usableRecyclerView = this.n0;
        int a2 = iah0.a(0.5f);
        boolean z = this.U;
        int i = 0;
        int i2 = z ? 0 : R.attr.vk_legacy_background_content;
        if (!z) {
            WeakHashMap weakHashMap = j6r0.a;
            i = iah0.a(9.0f);
        }
        yrn yrnVar = new yrn(R.attr.vk_legacy_separator_alpha, a2);
        if (i2 != 0) {
            yrnVar.k = i2;
            yrnVar.c = new ColorDrawable(dhr0.t.c(i2));
            yrnVar.e = i;
        }
        yrnVar.m = (yrn.a) wo();
        usableRecyclerView.addItemDecoration(yrnVar);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        boolean z = this.T0;
        this.i0 = new o0(rsg0.T(new wos(i, i2, z, this.S0 && !z, getRef(), new wwf0())), new nh40(new af50(this.N0, 1), 3)).a0(asu0.a.d()).subscribe(new n1r(this, 1), new mf1(this, 25));
    }
}
