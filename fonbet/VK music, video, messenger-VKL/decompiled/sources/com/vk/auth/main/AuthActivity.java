package com.vk.auth.main;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.a;
import com.vk.core.apps.BuildInfo;
import com.vk.core.util.RecreateActivity;
import com.vk.dto.common.id.UserId;
import com.vk.fullscreen.promo.core.FullscreenPromoComponent;
import com.vk.fullscreen.promo.core.FullscreenPromoEvent;
import com.vk.fullscreen.promo.core.PromoArguments;
import com.vk.onepasspromo.api.OnePassPromoComponent;
import com.vk.superapp.api.dto.auth.AuthTarget;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import xsna.a0a;
import xsna.ao8;
import xsna.bpn0;
import xsna.d75;
import xsna.dhr0;
import xsna.er;
import xsna.ezi;
import xsna.fpf0;
import xsna.h7u0;
import xsna.hg1;
import xsna.i0q0;
import xsna.i9r0;
import xsna.ieq0;
import xsna.itg0;
import xsna.klk0;
import xsna.m15;
import xsna.m7m;
import xsna.mhy;
import xsna.mp;
import xsna.o25;
import xsna.oz20;
import xsna.oz50;
import xsna.q6r0;
import xsna.qc9;
import xsna.r55;
import xsna.re4;
import xsna.rsr;
import xsna.sv1;
import xsna.t65;
import xsna.vgj0;
import xsna.x52;

/* compiled from: AuthActivity.kt */
/* loaded from: classes.dex */
public class AuthActivity extends DefaultAuthActivity {
    public static final /* synthetic */ int W = 0;
    public final bpn0 V = new bpn0(new m15(this, 0));

    /* compiled from: AuthActivity.kt */
    public static final class OauthActivity extends AuthActivity {
    }

    /* compiled from: AuthActivity.kt */
    public static final class a {
        public static Intent a(Context context) {
            return new Intent(context, (Class<?>) AuthActivity.class);
        }
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final DefaultAuthActivity.a O1(Intent intent, DefaultAuthActivity.IntentSource intentSource) {
        boolean z;
        if (intentSource != DefaultAuthActivity.IntentSource.ON_CREATE) {
            return new DefaultAuthActivity.a.b(true);
        }
        if (intent != null) {
            final d75 d75Var = (d75) this.V.getValue();
            d75Var.getClass();
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) intent.getParcelableExtra("accountAuthenticatorResponse");
            d75Var.c = accountAuthenticatorResponse;
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onRequestContinued();
                if (o25.a().b()) {
                    i9r0.a aVar = i9r0.a;
                    UserId c = o25.a().c();
                    synchronized (aVar) {
                        z = ((mp) i9r0.c.getValue()).e(c) != null;
                    }
                    if (z) {
                        h7u0.a aVar2 = new h7u0.a(d75Var.a);
                        aVar2.g0(R.string.error);
                        aVar2.U(R.string.already_logged_in);
                        aVar2.c0(R.string.ok, new DialogInterface.OnClickListener() { // from class: xsna.b75
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                d75.this.a.finish();
                            }
                        });
                        aVar2.h(new DialogInterface.OnCancelListener() { // from class: xsna.c75
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                d75.this.a.finish();
                            }
                        });
                        aVar2.m();
                    }
                }
            }
            return DefaultAuthActivity.a.C0398a.a;
        }
        return new DefaultAuthActivity.a.b(false);
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final com.vk.auth.main.a Q1(a.C0403a c0403a) {
        h hVar = new h(this, getSupportFragmentManager());
        c0403a.b = hVar;
        DefaultAuthActivity defaultAuthActivity = c0403a.a;
        SignUpDataHolder signUpDataHolder = c0403a.c;
        return new com.vk.auth.main.a(signUpDataHolder, hVar, new e(defaultAuthActivity, signUpDataHolder, hVar, c0403a.d));
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final int U1() {
        return dhr0.C().c;
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final void V1(Bundle bundle) {
        if (bundle != null && bundle.getInt(CallAnalyticsApiRequest.KEY_APP_VERSION, 0) != BuildInfo.e) {
            RecreateActivity.a.b(200L, this);
            return;
        }
        super.V1(bundle);
        try {
            vgj0.a(0, this);
        } catch (ShortcutBadgeException unused) {
        }
        dhr0.r0(this);
        ((FullscreenPromoComponent) m7m.a(this).a(fpf0.a(FullscreenPromoComponent.class))).n().getClass();
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final void X1(long j, SignUpData signUpData) {
        rsr rsrVar = oz50.k;
        oz50.b.d();
        Intent addFlags = new Intent(this, (Class<?>) MainActivity.class).addFlags(32768).addFlags(67108864).addFlags(268435456);
        com.vk.auth.main.a aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        if (ao8.j(aVar.a)) {
            addFlags.putExtra("key_business_signup_link", ieq0.a(er.a(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).appendPath("groups_create").appendQueryParameter("source", "registration").appendQueryParameter("type", "business")).build().toString());
            startActivity(addFlags);
        } else {
            com.vk.auth.main.a aVar2 = this.g;
            if (sv1.r((aVar2 != null ? aVar2 : null).a.K)) {
                startActivity(addFlags);
            }
            ((FullscreenPromoComponent) m7m.a(this).a(fpf0.a(FullscreenPromoComponent.class))).n().c(FullscreenPromoEvent.SignUp.c, new PromoArguments.SignUp(signUpData.zb() != null));
        }
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final void Y1() {
        super.Y1();
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("error_string_res_id") || intent.hasExtra("error_details_string_res_id")) {
                int intExtra = intent.getIntExtra("error_string_res_id", 0);
                int intExtra2 = intent.getIntExtra("error_details_string_res_id", 0);
                oz20 oz20Var = new oz20(this);
                if (intExtra != 0) {
                    oz20Var.U0(intExtra);
                }
                if (intExtra2 != 0) {
                    oz20Var.T0(intExtra2);
                }
                oz20Var.S0();
                intent.removeExtra("error_string_res_id");
                intent.removeExtra("error_details_string_res_id");
            }
        }
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(ezi.a(this, configuration));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(ezi.b(context));
        klk0.a(this);
    }

    @Override // com.vk.auth.DefaultAuthActivity, android.app.Activity
    public final void finish() {
        d75 d75Var = (d75) this.V.getValue();
        AccountAuthenticatorResponse accountAuthenticatorResponse = d75Var.c;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = d75Var.b;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
        }
        d75Var.c = null;
        super.finish();
    }

    @Override // com.vk.auth.DefaultAuthActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        com.vk.auth.main.a aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        h hVar = (h) aVar.b;
        boolean z = this.R;
        DefaultAuthActivity defaultAuthActivity = hVar.a;
        switch (i) {
            case 23663:
            case 23664:
            case 23665:
                if (i2 == -1) {
                    AuthResult authResult = intent != null ? (AuthResult) intent.getParcelableExtra("authResult") : null;
                    if (authResult != null) {
                        AuthResult a2 = AuthResult.a(authResult, null, null, null, new AuthTarget(null, false, false, true, false, 23, null), 0L, null, null, 8380415);
                        r55 r55Var = r55.a;
                        hg1.a(itg0.m(hg1.m(r55.h().d(a2).a0(io.reactivex.rxjava3.android.schedulers.a.b()).G(new re4(authResult, 7)), hVar.a, 0L, false, 62)), defaultAuthActivity);
                    }
                } else {
                    if (i == 23665) {
                        Bundle extras = intent != null ? intent.getExtras() : null;
                        if (extras != null && extras.getBoolean("openLoginPass", false)) {
                            r55 r55Var2 = r55.a;
                            if (r55.g().e().isEmpty()) {
                                i0q0.i(10L, new x52(hVar, 18));
                            }
                        }
                    }
                    if (i == 23665) {
                        r55 r55Var3 = r55.a;
                        if (r55.g().e().isEmpty()) {
                            i0q0.i(10L, new qc9(hVar, 13));
                        }
                    }
                }
                FragmentManager fragmentManager = hVar.b;
                if (z) {
                    if (fragmentManager.K() <= 1) {
                        defaultAuthActivity.getOnBackPressedDispatcher().d();
                        break;
                    } else {
                        fragmentManager.W();
                        break;
                    }
                }
                break;
            default:
                super.onActivityResult(i, i2, intent);
                break;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(ezi.a(this, configuration));
    }

    @Override // com.vk.auth.DefaultAuthActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ((d75) this.V.getValue()).c = null;
        super.onDestroy();
    }

    @Override // com.vk.auth.DefaultAuthActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(CallAnalyticsApiRequest.KEY_APP_VERSION, BuildInfo.e);
    }

    @Override // androidx.core.app.ComponentActivity
    public final void r1(AuthResult authResult) {
        if (!authResult.p()) {
            ((OnePassPromoComponent) m7m.a(this).mo408a(fpf0.a(OnePassPromoComponent.class))).D2();
        }
        d75 d75Var = (d75) this.V.getValue();
        d75Var.getClass();
        Bundle bundle = new Bundle(2);
        bundle.putString("authAccount", q6r0.f().r());
        bundle.putString("accountType", "com.vkontakte.account");
        d75Var.b = bundle;
        bpn0 bpn0Var = t65.a;
        mhy.b(this);
        finish();
    }
}
