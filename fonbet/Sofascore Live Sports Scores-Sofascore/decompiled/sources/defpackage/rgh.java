package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.facebook.internal.g;
import com.facebook.login.s;
import com.facebook.login.w;
import com.facebook.t;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rgh implements View.OnClickListener {
    public final BaseActivity a;
    public final joa b;
    public final mqi c;
    public final mqi d = ypa.b(new b7h(17));
    public final g e = new g();
    public de f;
    public boolean g;

    public rgh(BaseActivity baseActivity) {
        this.a = baseActivity;
        final int i = 0;
        this.b = ypa.a(ysa.c, new Function0(this) { // from class: ogh
            public final /* synthetic */ rgh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                rgh rghVar = this.b;
                switch (i2) {
                    case 0:
                        return new csh(rghVar.a);
                    default:
                        return new m19(rghVar.a);
                }
            }
        });
        final int i2 = 1;
        this.c = ypa.b(new Function0(this) { // from class: ogh
            public final /* synthetic */ rgh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                rgh rghVar = this.b;
                switch (i22) {
                    case 0:
                        return new csh(rghVar.a);
                    default:
                        return new m19(rghVar.a);
                }
            }
        });
        wca.x(baseActivity.getLifecycle()).a(new rrd(this, null, i2));
    }

    public static void c(rgh rghVar, ida idaVar, int i) {
        n19 n19Var = n19.b;
        dt8 dt8Var = idaVar;
        if ((i & 1) != 0) {
            dt8Var = new z1h(10);
        }
        dt8 dt8Var2 = dt8Var;
        if ((i & 2) != 0) {
            n19Var = n19.a;
        }
        rghVar.getClass();
        xw3.L(wca.x(rghVar.a.getLifecycle()), null, null, new v1f(rghVar, n19Var, dt8Var2, (rq3) null, 21), 3);
    }

    public final void a() {
        joa joaVar = this.b;
        if (((csh) joaVar.getValue()).isShowing()) {
            ((csh) joaVar.getValue()).dismiss();
        }
    }

    public final void b() {
        List c = a.c(NotificationCompat.CATEGORY_EMAIL);
        w wVar = (w) this.d.getValue();
        cqa cqaVar = new cqa(this);
        wVar.getClass();
        g gVar = this.e;
        if (gVar == null) {
            t.a("Unexpected CallbackManager, please use the provided Factory.");
            return;
        }
        int a = i.a(1);
        s sVar = new s(wVar, cqaVar);
        gVar.a.put(Integer.valueOf(a), sVar);
        de deVar = this.f;
        if (deVar != null) {
            deVar.a(c, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(i19 i19Var, sq3 sq3Var) {
        qgh qghVar;
        int i;
        if (sq3Var instanceof qgh) {
            qghVar = (qgh) sq3Var;
            int i2 = qghVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qghVar.t = i2 - Integer.MIN_VALUE;
                Object obj = qghVar.r;
                lu3 lu3Var = lu3.a;
                i = qghVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    bfk g = ok3.p().g();
                    String str = i19Var.b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = i19Var.a;
                    qghVar.t = 1;
                    Object a = rf4.a(g.a).a(new t53(str, "google", str2, (rq3) null, 11), qghVar);
                    if (a != lu3Var) {
                        a = Unit.a;
                    }
                    if (a == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                BaseActivity baseActivity = this.a;
                String string = baseActivity.getString(R.string.signing_in, "Sofascore");
                string.getClass();
                e(string);
                u0a.G(baseActivity);
                return Unit.a;
            }
        }
        qghVar = new qgh(this, sq3Var);
        Object obj2 = qghVar.r;
        lu3 lu3Var2 = lu3.a;
        i = qghVar.t;
        if (i != 0) {
        }
        BaseActivity baseActivity2 = this.a;
        String string2 = baseActivity2.getString(R.string.signing_in, "Sofascore");
        string2.getClass();
        e(string2);
        u0a.G(baseActivity2);
        return Unit.a;
    }

    public final void e(String str) {
        str.getClass();
        if (this.a.isFinishing()) {
            return;
        }
        joa joaVar = this.b;
        dk2 dk2Var = ((csh) joaVar.getValue()).a;
        dk2Var.c.setVisibility(0);
        dk2Var.c.setText(str);
        if (((csh) joaVar.getValue()).isShowing()) {
            return;
        }
        ((csh) joaVar.getValue()).show();
    }

    public final void f(Function0 function0) {
        Uri.Builder encodedPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("accounts.google.com").encodedPath("/o/oauth2/v2/auth");
        BaseActivity baseActivity = this.a;
        Uri build = encodedPath.appendQueryParameter("client_id", baseActivity.getString(R.string.google_login_id)).appendQueryParameter("redirect_uri", "https://www.sofascore.com/android-auth").appendQueryParameter("response_type", "id_token").appendQueryParameter("scope", "openid").appendQueryParameter("nonce", UUID.randomUUID().toString()).appendQueryParameter("prompt", "select_account").appendQueryParameter("isDeepLinkEnabled", "true").appendQueryParameter("ux_mode", "redirect").appendQueryParameter("cookiepolicy", "single_host_origin").build();
        try {
            try {
                if (this.g) {
                    Intent intent = new Intent("android.intent.action.VIEW", build);
                    intent.setPackage("com.android.chrome");
                    baseActivity.startActivity(intent);
                } else {
                    int color = baseActivity.getColor(R.color.primary_variant);
                    da4 da4Var = new da4();
                    Bundle bundle = new Bundle();
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color | (-16777216));
                    da4Var.d = bundle;
                    da4Var.e();
                    ea4 a = da4Var.a();
                    a.a.setPackage("com.android.chrome");
                    a.a(baseActivity, build);
                }
            } catch (Exception unused) {
                baseActivity.startActivity(new Intent("android.intent.action.VIEW", build));
            }
        } catch (ActivityNotFoundException unused2) {
            function0.invoke();
        }
        this.g = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        if (!waa.D(this.a)) {
            ad2 ad2Var = qv5.a;
            qv5.a(k42.a);
        } else if (view.getId() == R.id.button_login_google) {
            c(this, null, 3);
        }
    }
}
