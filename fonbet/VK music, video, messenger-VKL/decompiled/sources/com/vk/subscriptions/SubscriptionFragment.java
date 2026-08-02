package com.vk.subscriptions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vkontakte.android.R;
import java.util.List;
import xsna.gzm0;
import xsna.h3p0;
import xsna.iml0;
import xsna.lxm0;
import xsna.lym0;
import xsna.n9m0;
import xsna.oz50;
import xsna.pvo0;
import xsna.u1u0;
import xsna.v16;
import xsna.vxm0;
import xsna.wxm0;

/* compiled from: SubscriptionFragment.kt */
/* loaded from: classes6.dex */
public final class SubscriptionFragment extends BaseMvpFragment<vxm0> {
    public static final /* synthetic */ int W = 0;
    public Toolbar T;
    public final lxm0 U = new lxm0(new ListDataSet(), new iml0(this, 2));
    public final b V = new b();

    /* compiled from: SubscriptionFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: SubscriptionFragment.kt */
    public static final class b implements wxm0 {
        public b() {
        }

        @Override // xsna.wxm0
        public final String a(String str) {
            return SubscriptionFragment.this.getString(R.string.vk_subscription_before, str);
        }

        @Override // xsna.wxm0
        public final String b() {
            return SubscriptionFragment.this.getString(R.string.vk_subscription_game_title);
        }

        @Override // xsna.wxm0
        public final String c(int i) {
            return SubscriptionFragment.this.requireContext().getResources().getQuantityString(R.plurals.balance_votes, i, Integer.valueOf(i));
        }

        @Override // xsna.wxm0
        public final String d() {
            return SubscriptionFragment.this.getString(R.string.vk_subscription_miniapp_title);
        }

        @Override // xsna.wxm0
        public final String e() {
            return SubscriptionFragment.this.getString(R.string.vk_subscription_price_title);
        }

        @Override // xsna.wxm0
        public final String f(int i) {
            return pvo0.o(i, false, true);
        }

        @Override // xsna.wxm0
        public final String g() {
            return SubscriptionFragment.this.getString(R.string.vk_subscription_date_title);
        }

        @Override // xsna.wxm0
        public final String h() {
            return SubscriptionFragment.this.getString(R.string.vk_susbscription_title_info);
        }
    }

    public final void jo(List<? extends lym0> list) {
        this.U.setItems(list);
    }

    public final void ko(boolean z) {
        Toast.makeText(getActivity(), z ? R.string.vk_retry_subscription_error : R.string.vk_cancel_subscription_error, 0).show();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = new gzm0(this, this.V, (GameSubscription) requireArguments().getParcelable("extra_game_subscription"));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.layout_game_subscription, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (toolbar != null) {
            n9m0 n9m0Var = new n9m0(this, 5);
            if (!h3p0.f(this, toolbar)) {
                u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
                toolbar.setNavigationOnClickListener(new v16(n9m0Var, 9));
            }
        } else {
            toolbar = null;
        }
        this.T = toolbar;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        if (recyclerView != null) {
            getActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(this.U);
        }
        return inflate;
    }
}
