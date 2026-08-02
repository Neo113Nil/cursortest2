package com.vk.money;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.money.MoneyWebViewFragment;
import com.vkontakte.android.R;
import kotlin.text.Regex;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.a0a;
import xsna.bir0;
import xsna.cvk;
import xsna.dsw;
import xsna.hf8;
import xsna.l6v0;
import xsna.laz;
import xsna.mnh0;
import xsna.n2i0;
import xsna.nr2;
import xsna.os90;
import xsna.oz50;
import xsna.peq0;
import xsna.ply;
import xsna.rjx0;
import xsna.rwi;
import xsna.u1u0;
import xsna.ujx0;
import xsna.v390;
import xsna.y390;
import xsna.ysg0;

/* loaded from: classes3.dex */
public class MoneyWebViewFragment extends LoaderFragment {
    public static final /* synthetic */ int q0 = 0;
    public String l0;
    public WebView m0;
    public ujx0 n0;
    public c o0;
    public final a p0 = new a();

    public class a extends bir0 {
        public a() {
        }

        @Override // xsna.bir0, android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                MoneyWebViewFragment moneyWebViewFragment = MoneyWebViewFragment.this;
                if (moneyWebViewFragment.f0) {
                    return;
                }
                int i2 = MoneyWebViewFragment.q0;
                if (moneyWebViewFragment.g0) {
                    moneyWebViewFragment.oo();
                }
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MoneyWebViewFragment.this.finish();
        }
    }

    public class c extends rjx0 {
        public c(ujx0 ujx0Var) {
            super(ujx0Var);
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            MoneyWebViewFragment.this.onError(new VKApiExecutionException(0, "money_webview_client", true, str));
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.rjx0, xsna.dir0, android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            MoneyWebViewFragment.this.l0 = str;
            Uri parse = Uri.parse(str);
            if (mnh0.p(parse)) {
                Uri parse2 = Uri.parse(str.replace('#', '?'));
                String queryParameter = parse2.getQueryParameter("cancel");
                if (queryParameter != null && queryParameter.equals("1")) {
                    MoneyWebViewFragment.this.Mf(0, null);
                    return true;
                }
                if (parse2.getQueryParameter("success") != null || parse2.getQueryParameter("Success") != null) {
                    if (MoneyWebViewFragment.this.getArguments().getInt("request_code") != 1003) {
                        MoneyWebViewFragment.uo(MoneyWebViewFragment.this, false);
                        return true;
                    }
                    MoneyWebViewFragment moneyWebViewFragment = MoneyWebViewFragment.this;
                    cvk.u(R.string.money_transfer_add_card_success, false);
                    moneyWebViewFragment.Mf(-1, null);
                    return true;
                }
                if (parse2.getQueryParameter("repeat") != null) {
                    MoneyWebViewFragment.uo(MoneyWebViewFragment.this, true);
                    return true;
                }
            } else {
                if (str.contains(a0a.d.concat("/support"))) {
                    rwi.d().e().b(MoneyWebViewFragment.this.mo2getContext(), str);
                    return true;
                }
                if (peq0.p(new peq0(parse), (Regex) laz.s.getValue(), null, null, 14)) {
                    MoneyWebViewFragment.uo(MoneyWebViewFragment.this, false);
                    return true;
                }
            }
            return false;
        }
    }

    public static void uo(MoneyWebViewFragment moneyWebViewFragment, boolean z) {
        int i = moneyWebViewFragment.getArguments().getInt("request_code");
        Intent intent = i != 1000 ? i != 1001 ? null : new Intent("com.vkontakte.android.ACTION_MONEY_TRANSFER_ACCEPTED") : new Intent("com.vkontakte.android.ACTION_MONEY_TRANSFER_SENT");
        if (intent != null) {
            intent.putExtra("transfer_id", moneyWebViewFragment.getArguments().getInt("transfer_id"));
            n2i0.a(moneyWebViewFragment.requireContext(), hf8.a, intent);
        }
        ysg0.b.a(new os90(moneyWebViewFragment.getArguments().getInt("transfer_id"), 0));
        Intent putExtra = new Intent().putExtra("transfer_id", moneyWebViewFragment.getArguments().getInt("transfer_id"));
        if (!z) {
            moneyWebViewFragment.Mf(-1, putExtra);
        } else {
            if (!moneyWebViewFragment.getArguments().getBoolean("handle_result_self")) {
                moneyWebViewFragment.Mf(5, putExtra);
                return;
            }
            moneyWebViewFragment.l0 = moneyWebViewFragment.getArguments().getString("url_to_load");
            moneyWebViewFragment.f0 = false;
            moneyWebViewFragment.qo();
        }
    }

    public static Intent vo(Context context, int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url_to_load", str);
        bundle.putInt("transfer_id", i);
        return new oz50(MoneyWebViewFragment.class, null, bundle).n(context);
    }

    public static void wo(FragmentImpl fragmentImpl, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url_to_load", str);
        bundle.putInt("request_code", 1003);
        bundle.putInt("transfer_id", 0);
        new oz50(MoneyWebViewFragment.class, null, bundle).g(1003, fragmentImpl);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        WebView webView = this.m0;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        this.m0.goBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        to(R.layout.loader_fragment_progress);
        super.onAttach(activity);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.o0 = null;
        this.n0 = null;
        WebView webView = this.m0;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.m0.setWebViewClient(null);
            this.m0.destroy();
            this.m0 = null;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("url_to_load", this.l0);
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.m0 = (WebView) view.findViewById(R.id.webview);
        this.n0 = new ujx0(this.m0, ujx0.a.a());
        c cVar = new c(this.n0);
        this.o0 = cVar;
        this.m0.setWebViewClient(cVar);
        this.m0.setWebChromeClient(this.p0);
        nr2.n(this.m0, this.o0);
        if (bundle == null) {
            this.l0 = getArguments().getString("url_to_load");
        } else {
            this.l0 = bundle.getString("url_to_load");
        }
        this.m0.setDownloadListener(new DownloadListener() { // from class: xsna.c830
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                MoneyWebViewFragment moneyWebViewFragment = MoneyWebViewFragment.this;
                int i = MoneyWebViewFragment.q0;
                try {
                    Uri parse = Uri.parse(str);
                    if (parse != null) {
                        vao.b(moneyWebViewFragment.requireContext(), parse.getLastPathSegment(), str, true, null, Boolean.TRUE, false);
                    }
                } catch (Throwable th) {
                    L.i(th);
                }
            }
        });
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.m0, true);
        this.m0.getSettings().setJavaScriptEnabled(true);
        u1u0.k(this.Q, R.drawable.vk_icon_cancel_24, R.string.accessibility_cancel);
        this.Q.setNavigationOnClickListener(new b());
        if (getArguments().getInt("request_code") == 1002) {
            this.Q.setTitle(getResources().getString(R.string.money_transfer_money_transfers));
        } else if (getArguments().getInt("request_code") == 1003) {
            this.Q.setTitle(getResources().getString(R.string.money_transfer_add_card));
        } else if (getArguments().getInt("request_code") == 1005) {
            this.Q.setTitle(getResources().getString(R.string.votes_fill_balance));
        } else {
            this.Q.setTitle(R.string.money_transfer_payment);
        }
        if (this.f0) {
            return;
        }
        qo();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        dsw<UserId, v390> dswVar = y390.a;
        v390 a2 = y390.a.a();
        String b2 = v390.b(this.l0, a2.c(a2.h));
        this.l0 = b2;
        this.n0.c(Uri.parse(b2).buildUpon().appendQueryParameter("lang", ply.a()).toString(), true);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l6v0 l6v0Var = new l6v0((Context) getActivity());
        l6v0Var.setId(R.id.webview);
        return l6v0Var;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
