package com.vk.balance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.balance.BalanceFragment;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import xsna.a06;
import xsna.d06;
import xsna.f4m;
import xsna.hvt0;
import xsna.oz50;
import xsna.t5;
import xsna.tlo0;
import xsna.tq;
import xsna.uz5;
import xsna.wz5;
import xsna.xz5;
import xsna.yz5;
import xsna.zz5;

/* compiled from: BalanceFragment.kt */
/* loaded from: classes15.dex */
public final class BalanceFragment extends BaseMvpFragment<uz5> {
    public static final /* synthetic */ int i0 = 0;
    public View T;
    public View U;
    public SwipeRefreshLayout V;
    public TextView W;
    public ProgressBar X;
    public View Y;
    public View Z;
    public SwitchCompat a0;
    public View c0;
    public SwitchCompat d0;
    public boolean f0;
    public boolean g0;
    public final a06 h0;
    public final yz5 b0 = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.yz5
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i = BalanceFragment.i0;
            uz5 uz5Var = (uz5) BalanceFragment.this.S;
            if (uz5Var != null) {
                uz5Var.B4(z);
            }
        }
    };
    public final zz5 e0 = new zz5(0, this);

    /* compiled from: BalanceFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(BalanceFragment.class, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.yz5] */
    public BalanceFragment() {
        this.S = new d06(this);
        this.h0 = new a06(this, 0);
    }

    public final void jo() {
        SwitchCompat switchCompat = this.d0;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setEnabled(true);
        SwitchCompat switchCompat2 = this.a0;
        (switchCompat2 != null ? switchCompat2 : null).setEnabled(true);
    }

    public final void ko(boolean z) {
        SwitchCompat switchCompat = this.a0;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setOnCheckedChangeListener(null);
        SwitchCompat switchCompat2 = this.a0;
        if (switchCompat2 == null) {
            switchCompat2 = null;
        }
        switchCompat2.setChecked(z);
        SwitchCompat switchCompat3 = this.a0;
        (switchCompat3 != null ? switchCompat3 : null).setOnCheckedChangeListener(this.b0);
    }

    public final void lo(boolean z) {
        SwitchCompat switchCompat = this.d0;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setOnCheckedChangeListener(null);
        SwitchCompat switchCompat2 = this.d0;
        if (switchCompat2 == null) {
            switchCompat2 = null;
        }
        switchCompat2.setChecked(z);
        SwitchCompat switchCompat3 = this.d0;
        (switchCompat3 != null ? switchCompat3 : null).setOnCheckedChangeListener(this.e0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        uz5 uz5Var = (uz5) this.S;
        if (uz5Var != null) {
            uz5Var.refresh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.balance_fragment, viewGroup, false);
        a06 a06Var = this.h0;
        this.U = hvt0.b(inflate, R.id.buy_btn, a06Var);
        View findViewById = inflate.findViewById(R.id.promo_btn);
        if (findViewById != null) {
            findViewById.setOnClickListener(a06Var);
        }
        this.T = findViewById;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.V = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.vz5
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                int i = BalanceFragment.i0;
                uz5 uz5Var = (uz5) BalanceFragment.this.S;
                if (uz5Var != null) {
                    uz5Var.refresh();
                }
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.balance);
        this.W = textView;
        if (textView == null) {
            textView = null;
        }
        f4m.j(textView);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress);
        this.X = progressBar;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(0);
        View findViewById2 = inflate.findViewById(R.id.games_auto_buy_switch_container);
        this.Z = findViewById2;
        if (findViewById2 == null) {
            findViewById2 = null;
        }
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.settings_title);
        textView2.setSingleLine(false);
        textView2.setMaxLines(3);
        textView2.setText(R.string.vk_games_auto_buy_setting_title);
        ((TextView) findViewById2.findViewById(R.id.settings_description)).setText(R.string.vk_games_auto_buy_setting_description);
        findViewById2.setOnClickListener(new wz5(this, 0));
        View view = this.Z;
        if (view == null) {
            view = null;
        }
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.settings_switch);
        this.a0 = switchCompat;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setOnCheckedChangeListener(this.b0);
        View findViewById3 = inflate.findViewById(R.id.mini_apps_auto_buy_switch_container);
        this.c0 = findViewById3;
        if (findViewById3 == null) {
            findViewById3 = null;
        }
        TextView textView3 = (TextView) findViewById3.findViewById(R.id.settings_title);
        textView3.setSingleLine(false);
        textView3.setMaxLines(3);
        textView3.setText(R.string.vk_mini_apps_auto_buy_setting_title);
        ((TextView) findViewById3.findViewById(R.id.settings_description)).setText(R.string.vk_mini_apps_auto_buy_setting_description);
        findViewById3.setOnClickListener(new xz5(this, 0));
        View view2 = this.c0;
        if (view2 == null) {
            view2 = null;
        }
        SwitchCompat switchCompat2 = (SwitchCompat) view2.findViewById(R.id.settings_switch);
        this.d0 = switchCompat2;
        if (switchCompat2 == null) {
            switchCompat2 = null;
        }
        switchCompat2.setOnCheckedChangeListener(this.e0);
        View a2 = hvt0.a(R.id.retry_button, inflate, new com.vk.movika.sdk.base.data.a(this, 9));
        this.Y = a2;
        f4m.j(a2 != null ? a2 : null);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.top_bar);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.votes), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        vkTopBar.setBack(new VkTopBar.b(new t5(this, 7), new tlo0.f(R.string.accessibility_back), null, null, null, 28));
        ((AppBarLayout.d) vkTopBar.getLayoutParams()).a = 0;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.g0 = false;
        View view = this.U;
        if (view == null) {
            view = null;
        }
        view.setEnabled(true);
        View view2 = this.T;
        (view2 != null ? view2 : null).setEnabled(true);
    }
}
