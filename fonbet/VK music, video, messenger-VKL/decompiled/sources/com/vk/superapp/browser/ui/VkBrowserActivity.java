package com.vk.superapp.browser.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.browser.ui.a;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aeg0;
import xsna.brm0;
import xsna.e370;
import xsna.f7r0;
import xsna.f870;
import xsna.gfx0;
import xsna.gi6;
import xsna.i9u0;
import xsna.izs;
import xsna.j990;
import xsna.ker0;
import xsna.lvv0;
import xsna.mz80;
import xsna.ozl;
import xsna.qex0;
import xsna.s3q0;
import xsna.tb0;
import xsna.tgn0;
import xsna.tk5;
import xsna.uhx;
import xsna.vdx0;
import xsna.wdx0;
import xsna.xgx0;

/* compiled from: VkBrowserActivity.kt */
/* loaded from: classes6.dex */
public class VkBrowserActivity extends VkDelegatingActivity {
    public static final /* synthetic */ int l = 0;
    public com.vk.superapp.browser.ui.a g;
    public io.reactivex.rxjava3.disposables.c h;
    public int i;
    public final ArrayList j = new ArrayList();
    public final c k = new c();

    /* compiled from: VkBrowserActivity.kt */
    public static final class a {
        @ozl
        public static Intent a(Context context, Bundle bundle) {
            Intent putExtra = new Intent(context, (Class<?>) VkBrowserActivity.class).putExtra("fragmentClass", com.vk.superapp.browser.internal.ui.changephone.a.class).putExtra("args", bundle);
            if (context.getApplicationContext() == context) {
                putExtra.addFlags(268435456);
            }
            return putExtra;
        }

        public static Intent b(Context context, WebApiApplication webApiApplication, String str) {
            if (str == null || str.length() == 0) {
                str = webApiApplication.D;
            }
            Intent intent = new Intent(context, (Class<?>) VkBrowserActivity.class);
            if (context.getApplicationContext() == context) {
                intent.addFlags(268435456);
            }
            return intent.putExtra("webApp", webApiApplication).putExtra("directUrl", str);
        }

        public static void c(Context context, String str, boolean z) {
            qex0 qex0Var = e370.y;
            if (qex0Var == null) {
                qex0Var = null;
            }
            long r = f870.r(str, qex0Var.b());
            Intent intent = new Intent(context, (Class<?>) VkBrowserActivity.class);
            if (context.getApplicationContext() == context) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent.putExtra("directUrl", str).putExtra("webAppId", r).putExtra("forceDarkTheme", z));
        }
    }

    /* compiled from: VkBrowserActivity.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<lvv0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(lvv0 lvv0Var) {
            ((VkBrowserActivity) this.receiver).finish();
            return s3q0.a;
        }
    }

    /* compiled from: VkBrowserActivity.kt */
    public static final class c implements aeg0 {
        public c() {
        }

        @Override // xsna.aeg0
        public final void Li(tb0 tb0Var) {
            if (tb0Var != null) {
                VkBrowserActivity.this.j.add(tb0Var);
            }
        }

        @Override // xsna.aeg0
        public final void yk(tb0 tb0Var) {
            if (tb0Var != null) {
                VkBrowserActivity.this.j.remove(tb0Var);
            }
        }
    }

    public com.vk.superapp.browser.ui.a Q1() {
        return null;
    }

    public final void R1() {
        Serializable serializableExtra = getIntent().getSerializableExtra("fragmentClass");
        if (serializableExtra != null) {
            xgx0.a.getClass();
            xgx0.g("Forbid arbitrary fragment " + serializableExtra);
            finish();
        }
    }

    public final void T1(WebApiApplication webApiApplication, String str) {
        com.vk.superapp.browser.ui.a a2;
        InternalMiniApps.a aVar = InternalMiniApps.Companion;
        long j = webApiApplication.b;
        aVar.getClass();
        if (InternalMiniApps.a.b(j)) {
            Bundle bundle = new Bundle();
            long j2 = InternalMiniApps.VK_PAY.h().a;
            wdx0 wdx0Var = e370.f;
            String j3 = (wdx0Var != null ? wdx0Var : null).h().j();
            if (str.length() == 0) {
                str = j3;
            } else if (brm0.B(str, "vkpay", false)) {
                str = Uri.parse(brm0.A(str, "vkpay", j3)).buildUpon().toString();
            }
            if (j2 != 0) {
                bundle.putString("key_url", str);
                bundle.putLong("key_application_id", j2);
            } else {
                bundle.putString("key_url", str);
                bundle.putLong("key_application_id", InternalMiniApps.VK_PAY_OLD.h().a);
            }
            a2 = new ker0();
            a2.setArguments(bundle);
        } else {
            a2 = a.C1874a.a(webApiApplication, str, null, null, 60);
        }
        X1(a2);
        V1(a2);
    }

    public final void U1(long j, String str) {
        com.vk.superapp.browser.ui.a aVar;
        InternalMiniApps.Companion.getClass();
        if (InternalMiniApps.a.b(j)) {
            Bundle bundle = new Bundle();
            long j2 = InternalMiniApps.VK_PAY.h().a;
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            String j3 = wdx0Var.h().j();
            if (str.length() == 0) {
                str = j3;
            } else if (brm0.B(str, "vkpay", false)) {
                str = Uri.parse(brm0.A(str, "vkpay", j3)).buildUpon().toString();
            }
            if (j2 != 0) {
                bundle.putString("key_url", str);
                bundle.putLong("key_application_id", j2);
            } else {
                bundle.putString("key_url", str);
                bundle.putLong("key_application_id", InternalMiniApps.VK_PAY_OLD.h().a);
            }
            aVar = new ker0();
            aVar.setArguments(bundle);
        } else {
            com.vk.superapp.browser.ui.a aVar2 = new com.vk.superapp.browser.ui.a();
            Bundle bundle2 = new Bundle(2);
            bundle2.putString("key_url", str);
            bundle2.putLong("key_application_id", j);
            aVar2.setArguments(bundle2);
            aVar = aVar2;
        }
        X1(aVar);
        V1(aVar);
    }

    public final void V1(com.vk.superapp.browser.ui.a aVar) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a b2 = tk5.b(supportFragmentManager, supportFragmentManager);
        b2.g(this.i, aVar, null);
        b2.k(false);
    }

    public final void W1(String str) {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        int i = 20;
        this.h = vdx0Var.d().X(str).subscribe(new j990(new i9u0(this, 2), i), new f7r0(new mz80(i, this, str), 2));
    }

    public final void X1(com.vk.superapp.browser.ui.a aVar) {
        this.g = aVar;
        if (aVar != null) {
            aVar.Hn(new b(1, this, VkBrowserActivity.class, "onClose", "onClose(Lcom/vk/superapp/base/js/bridge/data/VkUiCloseData;)V", 0));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((tb0) it.next()).onActivityResult(i, i2, intent);
        }
        if (i == 140) {
            onBackPressed();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onBackPressed() {
        Fragment G = getSupportFragmentManager().G(this.i);
        if (G instanceof com.vk.superapp.browser.ui.a ? ((com.vk.superapp.browser.ui.a) G).a0() : G instanceof gi6 ? ((gi6) G).a0() : false) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.vk.superapp.browser.ui.a aVar = this.g;
        if (aVar != null) {
            aVar.xb();
        }
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!getPackageManager().hasSystemFeature("android.software.webview")) {
            Toast.makeText(getApplicationContext(), R.string.vk_error_no_browser, 0).show();
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("forceDarkTheme", false)) {
            tgn0 tgn0Var = e370.x;
            if (tgn0Var == null) {
                tgn0Var = null;
            }
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            setTheme(tgn0Var.c(gfx0Var));
        } else {
            tgn0 tgn0Var2 = e370.x;
            if (tgn0Var2 == null) {
                tgn0Var2 = null;
            }
            setTheme(tgn0Var2.a());
        }
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.vk_fragment_container);
        int id = frameLayout.getId();
        setContentView(frameLayout);
        this.i = id;
        Fragment G = getSupportFragmentManager().G(this.i);
        if (G instanceof com.vk.superapp.browser.ui.a) {
            X1((com.vk.superapp.browser.ui.a) G);
            return;
        }
        Intent intent2 = getIntent();
        Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("fragmentClass") : null;
        Intent intent3 = getIntent();
        WebApiApplication webApiApplication = intent3 != null ? (WebApiApplication) intent3.getParcelableExtra("webApp") : null;
        Intent intent4 = getIntent();
        long longExtra = intent4 != null ? intent4.getLongExtra("webAppId", uhx.a().a) : uhx.a().a;
        Intent intent5 = getIntent();
        String stringExtra = intent5 != null ? intent5.getStringExtra("directUrl") : null;
        Intent intent6 = getIntent();
        String stringExtra2 = intent6 != null ? intent6.getStringExtra("urlToResolve") : null;
        Serializable serializableExtra2 = getIntent().getSerializableExtra("fragmentClass");
        Class cls = serializableExtra2 instanceof Class ? (Class) serializableExtra2 : null;
        Bundle bundle2 = (Bundle) getIntent().getParcelableExtra("args");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        try {
            com.vk.superapp.browser.ui.a Q1 = Q1();
            if (Q1 != null) {
                X1(Q1);
                V1(Q1);
                return;
            }
            if (serializableExtra != null) {
                Fragment O1 = O1(this.i);
                if (O1 instanceof com.vk.superapp.browser.ui.a) {
                    X1((com.vk.superapp.browser.ui.a) O1);
                    return;
                }
                return;
            }
            if (webApiApplication != null) {
                if (stringExtra == null) {
                    stringExtra = "";
                }
                T1(webApiApplication, stringExtra);
                return;
            }
            if (cls == null) {
                if (stringExtra != null) {
                    U1(longExtra, stringExtra);
                    return;
                } else if (stringExtra2 != null) {
                    W1(stringExtra2);
                    return;
                } else {
                    finish();
                    return;
                }
            }
            com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) cls.newInstance();
            aVar.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.f(this.i, aVar, null, 1);
            aVar2.k(false);
            X1(aVar);
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
