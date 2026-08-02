package com.vk.common.links;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ironsource.D1;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.device.store.AppStore;
import com.vk.log.L;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import xsna.a0a;
import xsna.aq80;
import xsna.brm0;
import xsna.cvk;
import xsna.d3r0;
import xsna.fbz;
import xsna.gbz;
import xsna.jaz;
import xsna.js2;
import xsna.naz;
import xsna.ner0;
import xsna.nr2;
import xsna.qdz;
import xsna.u1u0;
import xsna.xwk;

/* compiled from: LinkUtils.java */
/* loaded from: classes17.dex */
public final class b {
    public static final qdz a = xwk.d();

    /* compiled from: LinkUtils.java */
    public class a extends aq80 {
        public final /* synthetic */ Context c;
        public final /* synthetic */ Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Context context2, Uri uri) {
            super(context);
            this.c = context2;
            this.d = uri;
        }

        @Override // xsna.yp80
        public final void U() {
            b.a.getBrowser().i(this.c, this.d, new LaunchContext(), null);
        }
    }

    public static boolean a(Uri uri, String str) {
        if (naz.u(uri) || naz.s(uri)) {
            return true;
        }
        return str != null && (brm0.B(str, a0a.d.concat(DomExceptionUtils.SEPARATOR), false) || brm0.B(str, "vkontakte.ru/", false));
    }

    public static void b(Context context, String str, Bundle bundle) {
        boolean z = true;
        boolean z2 = false;
        if (Preference.j().getBoolean("useChromeCustomTabs", true)) {
            FeedFeatures feedFeatures = FeedFeatures.FEED_ADS_FORCE_OPEN_BROWSER;
            feedFeatures.getClass();
            if (!com.vk.toggle.b.A.a(feedFeatures)) {
                z = false;
            }
        }
        if (str != null && str.startsWith("tel:") && !str.startsWith("tel://")) {
            z2 = gbz.a(context, str);
        } else if (str != null && str.startsWith("mailto:") && !str.startsWith("mailto://")) {
            z2 = c.B(context, str);
        }
        if (z2) {
            return;
        }
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.i = z;
        a.getBrowser().f(context, bundle, aVar.a(), str);
    }

    public static void c(Context context, String str, Bundle bundle) {
        boolean z = !Preference.j().getBoolean("useChromeCustomTabs", true);
        if ((str == null || !str.startsWith("tel:") || str.startsWith("tel://")) ? (str == null || !str.startsWith("mailto:") || str.startsWith("mailto://")) ? false : c.B(context, str) : gbz.a(context, str)) {
            return;
        }
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.i = z;
        a.getBrowser().f(context, bundle, aVar.a(), str);
    }

    public static void d(Context context, String str, LaunchContext launchContext) {
        Activity a2 = d3r0.a(context);
        if (a2 == null) {
            return;
        }
        ner0 ner0Var = new ner0(context);
        ner0Var.setMessage(context.getString(R.string.loading));
        ner0Var.setCancelable(false);
        ner0Var.show();
        Handler handler = new Handler(Looper.getMainLooper());
        WebView webView = new WebView(context);
        webView.setVisibility(8);
        nr2.n(webView, new fbz(context, ner0Var, launchContext));
        handler.postAtTime(new js2(3, webView, ner0Var), webView, SystemClock.uptimeMillis() + 10000);
        ((ViewGroup) a2.getWindow().getDecorView()).addView(webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(jaz.a(str));
    }

    public static void e(Context context, Bundle bundle, @NonNull LaunchContext launchContext, String str) {
        if ((str == null || !str.startsWith("tel:") || str.startsWith("tel://")) ? (str == null || !str.startsWith("mailto:") || str.startsWith("mailto://")) ? false : c.B(context, str) : gbz.a(context, str)) {
            return;
        }
        String a2 = jaz.a(str);
        Uri parse = Uri.parse(a2);
        qdz qdzVar = a;
        Uri b = qdzVar.getBrowser().b(parse, null, bundle);
        if (a(parse, a2) || (naz.C(a2) && a(b, b.toString()))) {
            qdzVar.e().l(context, a2, launchContext, null, new a(context, context, parse));
        } else {
            qdzVar.getBrowser().c(context, bundle, launchContext, str);
        }
    }

    public static void f(Context context, String str) {
        e(context, null, new LaunchContext(), str);
    }

    public static void g(Activity activity, String str, String str2) {
        h(activity, str, str2, null, null);
    }

    public static void h(Context context, String str, String str2, Bundle bundle, LaunchContext launchContext) {
        i(context, str, str2, bundle, launchContext, Boolean.FALSE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void i(Context context, String str, String str2, Bundle bundle, LaunchContext launchContext, Boolean bool) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(naz.a(str));
            if (naz.s(parse) || naz.u(parse)) {
                str2 = "internal";
            }
        }
        String valueOf = String.valueOf(str2);
        switch (valueOf.hashCode()) {
            case -1820761141:
                if (valueOf.equals(D1.e)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1544407700:
                if (valueOf.equals("internal_hidden")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 570410685:
                if (valueOf.equals("internal")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1475610601:
                if (valueOf.equals("authorize")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (bool.booleanValue()) {
                b(context, str, bundle);
                return;
            } else {
                c(context, str, bundle);
                return;
            }
        }
        if (c != 1) {
            if (c != 2) {
                d(context, str, launchContext);
                return;
            } else {
                j(context, str);
                return;
            }
        }
        if (launchContext == null) {
            LaunchContext.a aVar = new LaunchContext.a();
            aVar.h = str;
            launchContext = aVar.a();
        } else {
            String str3 = launchContext.i;
            if (str3 == null || str3.isEmpty()) {
                launchContext = LaunchContext.a(launchContext, str, 67108607);
            }
        }
        e(context, bundle, launchContext, str);
    }

    public static void j(Context context, String str) {
        WebViewFragment.c cVar = new WebViewFragment.c(str);
        cVar.F(false, false);
        cVar.I(true);
        cVar.A();
        cVar.k(context);
    }

    public static void k(Context context, WebView webView, String str, ner0 ner0Var, @Nullable LaunchContext launchContext) {
        Uri parse = Uri.parse(str);
        if (l(context, parse)) {
            return;
        }
        if (CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equals(parse.getScheme())) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent parseUri = Intent.parseUri(str, 1);
                if (packageManager.resolveActivity(parseUri, 65536) != null) {
                    context.startActivity(parseUri);
                } else {
                    String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                    if (stringExtra == null) {
                        f(context, str);
                    } else {
                        if (stringExtra.startsWith("http")) {
                            k(context, webView, stringExtra, ner0Var, launchContext);
                            return;
                        }
                        Uri parse2 = Uri.parse(stringExtra);
                        Intent parseUri2 = Intent.parseUri(stringExtra, 0);
                        if (!l(context, parse2)) {
                            if (packageManager.resolveActivity(parseUri2, 65536) != null) {
                                context.startActivity(parseUri2);
                            } else {
                                l(context, Uri.parse("market://details?id=" + parseUri.getPackage()));
                            }
                        }
                    }
                }
            } catch (Exception e) {
                cvk.u(R.string.error, false);
                L.g("open link error", e);
            }
        } else {
            if (launchContext == null) {
                launchContext = new LaunchContext();
            }
            e(context, null, launchContext, str);
        }
        webView.destroy();
        u1u0.b(ner0Var);
        ((ViewGroup) d3r0.a(context).getWindow().getDecorView()).removeView(webView);
    }

    public static boolean l(Context context, Uri uri) {
        AppStore.Companion.getClass();
        AppStore a2 = AppStore.a.a(uri);
        if (a2 != null) {
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri).setPackage(a2.j());
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                    return true;
                }
                intent.setPackage(AppStore.GOOGLE.j());
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                    return true;
                }
            } catch (Exception e) {
                L.g("open link error", e);
                return false;
            }
        }
        return false;
    }
}
