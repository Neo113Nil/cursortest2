package com.vk.oauth.esia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.auth.oauth.VkBaseOAuthActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e370;
import xsna.epx;
import xsna.izs;
import xsna.l65;
import xsna.nxp;
import xsna.p600;
import xsna.par0;
import xsna.rex0;
import xsna.s3q0;
import xsna.w0m;
import xsna.yqu0;

/* compiled from: VkEsiaOAuthActivity.kt */
/* loaded from: classes4.dex */
public final class VkEsiaOAuthActivity extends VkBaseOAuthActivity {
    public static String n;
    public p600 l;
    public nxp m;

    /* compiled from: VkEsiaOAuthActivity.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<l65, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(l65 l65Var) {
            VkEsiaOAuthActivity.U1((VkEsiaOAuthActivity) this.receiver, l65Var);
            return s3q0.a;
        }
    }

    /* compiled from: VkEsiaOAuthActivity.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<l65, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(l65 l65Var) {
            VkEsiaOAuthActivity.U1((VkEsiaOAuthActivity) this.receiver, l65Var);
            return s3q0.a;
        }
    }

    public static final void U1(VkEsiaOAuthActivity vkEsiaOAuthActivity, l65 l65Var) {
        vkEsiaOAuthActivity.getClass();
        if (l65Var instanceof l65.b) {
            Intent putExtra = new Intent().putExtra("vk_esia_oauth_activity.auth_code", ((l65.b) l65Var).a);
            nxp nxpVar = vkEsiaOAuthActivity.m;
            if (nxpVar == null) {
                nxpVar = null;
            }
            Intent putExtra2 = putExtra.putExtra("vk_esia_oauth_activity.client_id", nxpVar.b);
            nxp nxpVar2 = vkEsiaOAuthActivity.m;
            vkEsiaOAuthActivity.R1(putExtra2.putExtra("vk_esia_oauth_activity.redirect_uri", (nxpVar2 != null ? nxpVar2 : null).a().toString()));
            return;
        }
        if (!(l65Var instanceof l65.a)) {
            if (l65Var instanceof l65.h) {
                rex0 rex0Var = e370.j;
                (rex0Var != null ? rex0Var : null).b(vkEsiaOAuthActivity, ((l65.h) l65Var).a);
                return;
            }
            return;
        }
        par0 par0Var = par0.a;
        l65.a aVar = (l65.a) l65Var;
        String str = aVar.a;
        Throwable th = aVar.b;
        par0Var.getClass();
        par0.c(str, th);
        vkEsiaOAuthActivity.Q1(aVar.a);
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final w0m O1() {
        return new yqu0(getApplicationContext(), getIntent().getBooleanExtra("vk_esia_oauth_activity.is_verification_flow", false));
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final void T1() {
        String stringExtra = getIntent().getStringExtra("vk_esia_oauth_activity.app_code");
        String str = n;
        n = null;
        if (str != null && !epx.f(stringExtra, str)) {
            Q1("Invalid verification code.");
            return;
        }
        p600 p600Var = this.l;
        if (p600Var == null) {
            p600Var = null;
        }
        if (epx.f(p600Var.c.getValue(p600Var, p600.e[0]), l65.d.a)) {
            p600 p600Var2 = this.l;
            (p600Var2 != null ? p600Var2 : null).update(l65.g.a);
        }
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w0m w0mVar = this.f;
        if (w0mVar == null) {
            w0mVar = null;
        }
        yqu0 yqu0Var = (yqu0) w0mVar;
        p600<l65> p600Var = yqu0Var.b;
        this.l = p600Var;
        this.m = yqu0Var.c;
        (p600Var != null ? p600Var : null).b(new a(1, this, VkEsiaOAuthActivity.class, "onAuthStatusUpdated", "onAuthStatusUpdated(Lcom/vk/oauth/esia/internal/AuthStatus;)V", 0));
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        p600 p600Var = this.l;
        if (p600Var == null) {
            p600Var = null;
        }
        p600Var.a(new b(1, this, VkEsiaOAuthActivity.class, "onAuthStatusUpdated", "onAuthStatusUpdated(Lcom/vk/oauth/esia/internal/AuthStatus;)V", 0));
        super.onDestroy();
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        l65 aVar = data == null ? new l65.a("Redirect uri is null.", 2) : new l65.c(data);
        p600 p600Var = this.l;
        if (p600Var == null) {
            p600Var = null;
        }
        p600Var.update(aVar);
    }
}
