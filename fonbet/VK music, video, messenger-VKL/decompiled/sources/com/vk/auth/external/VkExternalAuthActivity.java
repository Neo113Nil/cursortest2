package com.vk.auth.external;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.external.VkExternalAuthFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.text.Regex;
import xsna.arm0;
import xsna.hl10;
import xsna.j5g;
import xsna.ozl;
import xsna.tk5;
import xsna.zsu0;

/* compiled from: VkExternalAuthActivity.kt */
/* loaded from: classes15.dex */
public final class VkExternalAuthActivity extends FragmentActivity {
    public a f;

    /* compiled from: VkExternalAuthActivity.kt */
    public static final class a {
        public final int a;

        public a(FrameLayout frameLayout, int i) {
            this.a = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O1(Intent intent) {
        Uri data;
        String queryParameter;
        String queryParameter2;
        int i;
        String scheme;
        hl10 e;
        List<String> b;
        String str;
        Integer m;
        if (intent != null && (data = intent.getData()) != null) {
            Regex regex = zsu0.g;
            if (zsu0.a.a(data) && (queryParameter = data.getQueryParameter("uuid")) != null && (queryParameter2 = data.getQueryParameter("redirect_uri")) != null) {
                try {
                    scheme = Uri.parse(queryParameter2).getScheme();
                } catch (Exception unused) {
                }
                if (scheme != null && (e = zsu0.g.e(scheme)) != null && (b = e.b()) != null && (str = (String) j5g.b0(1, b)) != null && (m = arm0.m(10, str)) != null) {
                    i = m.intValue();
                    if (i != 0) {
                        try {
                            Uri parse = Uri.parse(queryParameter2);
                            Regex regex2 = zsu0.g;
                            String queryParameter3 = data.getQueryParameter("code_challenge");
                            String queryParameter4 = data.getQueryParameter("state");
                            FragmentManager supportFragmentManager = getSupportFragmentManager();
                            a aVar = this.f;
                            if (aVar == null) {
                                aVar = null;
                            }
                            Fragment G = supportFragmentManager.G(aVar.a);
                            VkExternalAuthFragment.LaunchParams launchParams = new VkExternalAuthFragment.LaunchParams(i, queryParameter, queryParameter2, parse, queryParameter3, queryParameter4);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("launch_params", launchParams);
                            VkExternalAuthFragment vkExternalAuthFragment = new VkExternalAuthFragment();
                            vkExternalAuthFragment.setArguments(bundle);
                            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                            androidx.fragment.app.a b2 = tk5.b(supportFragmentManager2, supportFragmentManager2);
                            if (G instanceof VkExternalAuthFragment) {
                                a aVar2 = this.f;
                                if (aVar2 == null) {
                                    aVar2 = null;
                                }
                                b2.g(aVar2.a, vkExternalAuthFragment, null);
                            } else {
                                a aVar3 = this.f;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                b2.f(aVar3.a, vkExternalAuthFragment, null, 1);
                            }
                            b2.k(false);
                            return true;
                        } catch (Throwable unused2) {
                            return false;
                        }
                    }
                }
                i = 0;
                if (i != 0) {
                }
            }
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        boolean z;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        a aVar = this.f;
        if (aVar == null) {
            aVar = null;
        }
        Fragment G = supportFragmentManager.G(aVar.a);
        boolean z2 = false;
        if (G instanceof VkExternalAuthFragment) {
            VkExternalAuthFragment vkExternalAuthFragment = (VkExternalAuthFragment) G;
            vkExternalAuthFragment.getClass();
            try {
                WebView webView = vkExternalAuthFragment.h;
                if (webView == null) {
                    webView = null;
                }
                z = webView.canGoBack();
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                WebView webView2 = vkExternalAuthFragment.h;
                (webView2 != null ? webView2 : null).goBack();
                z2 = true;
            }
        }
        if (z2) {
            return;
        }
        if (getSupportFragmentManager().K() > 1) {
            getSupportFragmentManager().W();
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.vk_external_auth_fragment_container);
        this.f = new a(frameLayout, frameLayout.getId());
        setContentView(frameLayout);
        if (O1(getIntent())) {
            return;
        }
        finishAndRemoveTask();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (O1(intent)) {
            return;
        }
        finishAndRemoveTask();
    }
}
