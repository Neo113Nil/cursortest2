package com.vk.auth.qr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.fragments.FragmentImpl;
import com.vk.lists.DefaultErrorView;
import com.vkontakte.android.R;
import xsna.atm;
import xsna.bir0;
import xsna.bpn0;
import xsna.dne0;
import xsna.f4m;
import xsna.oz50;
import xsna.q9k;
import xsna.sg0;
import xsna.wz70;
import xsna.yme0;

/* compiled from: OldQrAuthFragment.kt */
/* loaded from: classes15.dex */
public final class OldQrAuthFragment extends FragmentImpl {
    public static final /* synthetic */ int U = 0;
    public FrameLayout N;
    public ProgressBar O;
    public DefaultErrorView P;
    public Toolbar Q;
    public dne0 R;
    public String S;
    public final bpn0 T = new bpn0(new atm(this, 28));

    /* compiled from: OldQrAuthFragment.kt */
    public static final class a {
        public static void a(Context context, String str) {
            oz50 oz50Var = new oz50(OldQrAuthFragment.class, null, q9k.a("key_url", str));
            oz50Var.s(true);
            oz50Var.k(context);
        }
    }

    /* compiled from: OldQrAuthFragment.kt */
    public static final class b implements yme0 {
        public b() {
        }

        @Override // xsna.yme0
        public final void a() {
            OldQrAuthFragment oldQrAuthFragment = OldQrAuthFragment.this;
            DefaultErrorView defaultErrorView = oldQrAuthFragment.P;
            if (defaultErrorView == null) {
                defaultErrorView = null;
            }
            f4m.j(defaultErrorView);
            ProgressBar progressBar = oldQrAuthFragment.O;
            (progressBar != null ? progressBar : null).setVisibility(0);
        }

        @Override // xsna.yme0
        public final void b() {
            OldQrAuthFragment oldQrAuthFragment = OldQrAuthFragment.this;
            DefaultErrorView defaultErrorView = oldQrAuthFragment.P;
            if (defaultErrorView == null) {
                defaultErrorView = null;
            }
            f4m.j(defaultErrorView);
            ProgressBar progressBar = oldQrAuthFragment.O;
            f4m.j(progressBar != null ? progressBar : null);
        }

        @Override // xsna.yme0
        public final void c() {
            int i = OldQrAuthFragment.U;
            OldQrAuthFragment.this.finish();
        }

        @Override // xsna.yme0
        public final void onError() {
            OldQrAuthFragment oldQrAuthFragment = OldQrAuthFragment.this;
            DefaultErrorView defaultErrorView = oldQrAuthFragment.P;
            if (defaultErrorView == null) {
                defaultErrorView = null;
            }
            defaultErrorView.setVisibility(0);
            ProgressBar progressBar = oldQrAuthFragment.O;
            f4m.j(progressBar != null ? progressBar : null);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.S = arguments != null ? arguments.getString("key_url") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_qr_auth, viewGroup, false);
        this.O = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        DefaultErrorView defaultErrorView = (DefaultErrorView) inflate.findViewById(R.id.error_view);
        this.P = defaultErrorView;
        defaultErrorView.setRetryClickListener(new wz70(0, this));
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.Q = toolbar;
        toolbar.setNavigationIcon(requireContext().getDrawable(R.drawable.vk_icon_cancel_24));
        Toolbar toolbar2 = this.Q;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationOnClickListener(new sg0(this, 13));
        this.N = (FrameLayout) inflate.findViewById(R.id.web_view_container);
        dne0 dne0Var = new dne0(requireContext().getApplicationContext());
        dne0Var.setCallback((b) this.T.getValue());
        this.R = dne0Var;
        FrameLayout frameLayout = this.N;
        (frameLayout != null ? frameLayout : null).addView(dne0Var);
        dne0 dne0Var2 = this.R;
        if (dne0Var2 != null) {
            String str = this.S;
            yme0 yme0Var = dne0Var2.d;
            if (yme0Var != null) {
                yme0Var.a();
            }
            dne0Var2.c.c(str, true);
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        try {
            FrameLayout frameLayout = this.N;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.removeAllViews();
            dne0 dne0Var = this.R;
            if (dne0Var != null) {
                bir0 bir0Var = dne0Var.b;
                bir0Var.b = null;
                bir0Var.c = null;
                bir0Var.d = null;
                dne0Var.d = null;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.R = null;
            throw th;
        }
        this.R = null;
        super.onDestroyView();
    }
}
