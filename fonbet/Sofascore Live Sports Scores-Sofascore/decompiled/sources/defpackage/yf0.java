package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.appsflyer.share.deeplink.DeepLink;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.main.start.StartActivity;
import java.util.List;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yf0 implements DeepLinkListener, eni {
    public final /* synthetic */ Context a;

    public /* synthetic */ yf0(Context context) {
        this.a = context;
    }

    @Override // defpackage.eni
    public fni a(ge6 ge6Var) {
        String str = (String) ge6Var.d;
        ffb ffbVar = (ffb) ge6Var.e;
        ffbVar.getClass();
        if (str != null && str.length() != 0) {
            return new xr8(this.a, str, ffbVar, true, true);
        }
        a70.p("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    @Override // com.appsflyer.share.deeplink.DeepLinkListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        String str;
        Object u2gVar;
        Integer num;
        Object u2gVar2;
        xf0 xf0Var;
        List<String> pathSegments;
        String lastPathSegment;
        Integer intOrNull;
        SharedPreferences d;
        DeepLink deepLink;
        Context context = this.a;
        deepLinkResult.getClass();
        boolean z = dg0.a;
        DeepLinkResult deepLinkResult2 = deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND ? deepLinkResult : null;
        if (deepLinkResult2 == null || (deepLink = deepLinkResult2.getDeepLink()) == null || (str = deepLink.getDeepLinkValue()) == null || str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            dg0.a();
            return;
        }
        try {
            p2g p2gVar = w2g.b;
            String optString = deepLinkResult.getDeepLink().getClickEvent().optString("link");
            if (StringsKt.R(optString)) {
                optString = null;
            }
            if (optString != null) {
                Uri parse = Uri.parse(optString);
                parse.getClass();
                u2gVar = parse.getQueryParameter("shortlink");
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("source", (String) u2gVar);
        ia0 ia0Var = ia0.q;
        boolean z2 = false;
        me4.d((f5d) me4.e(), "af_link_open", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "af_link_open", false);
        if (!v8a.d) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (!sharedPreferences.getBoolean("show_onboarding", true)) {
                zf0 zf0Var = new zf0(str);
                synchronized (dg0.f) {
                    qa3 qa3Var = dg0.g;
                    if (qa3Var != null) {
                        if (qa3Var.V(zf0Var)) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                int i = StartActivity.q;
                Uri parse2 = Uri.parse(str);
                parse2.getClass();
                i9a.L(context, parse2, null);
                return;
            }
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext2);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences2 = d;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.getClass();
        edit.putString("PendingAppsflyerDeeplink", str);
        edit.apply();
        ri6 d2 = ok3.p().c().d(l8f.a);
        if (d2 != null) {
            qi6 qi6Var = d2 instanceof qi6 ? (qi6) d2 : null;
            if (qi6Var != null) {
                num = Integer.valueOf(qi6Var.a);
                if (num != null) {
                    try {
                        Uri parse3 = Uri.parse(str);
                        parse3.getClass();
                        pathSegments = parse3.getPathSegments();
                        lastPathSegment = parse3.getLastPathSegment();
                    } catch (Throwable th2) {
                        p2g p2gVar3 = w2g.b;
                        u2gVar2 = new u2g(th2);
                    }
                    if (lastPathSegment != null && (intOrNull = StringsKt.toIntOrNull(lastPathSegment)) != null) {
                        int intValue = intOrNull.intValue();
                        if (pathSegments.contains(SearchResponseKt.PLAYER_ENTITY)) {
                            u2gVar2 = new vf0(intValue);
                        } else if (pathSegments.contains("team")) {
                            u2gVar2 = new wf0(intValue);
                        } else if (pathSegments.contains("tournament")) {
                            u2gVar2 = new uf0(intValue);
                        }
                        if (u2gVar2 instanceof u2g) {
                            u2gVar2 = null;
                        }
                        xf0Var = (xf0) u2gVar2;
                        if (xf0Var != null) {
                            fdi fdiVar = fg0.a;
                            fdiVar.getClass();
                            fdiVar.m(null, xf0Var);
                        }
                    }
                    u2gVar2 = null;
                    if (u2gVar2 instanceof u2g) {
                    }
                    xf0Var = (xf0) u2gVar2;
                    if (xf0Var != null) {
                    }
                }
                dg0.a();
            }
        }
        num = null;
        if (num != null) {
        }
        dg0.a();
    }
}
