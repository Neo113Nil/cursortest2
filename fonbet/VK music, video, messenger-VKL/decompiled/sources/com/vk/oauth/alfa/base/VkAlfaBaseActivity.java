package com.vk.oauth.alfa.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.auth.oauth.VkBaseOAuthActivity;
import com.vk.auth.oauth.parcelable.AuthCodeResult;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e370;
import xsna.epx;
import xsna.izs;
import xsna.k65;
import xsna.p600;
import xsna.par0;
import xsna.rex0;
import xsna.s3q0;
import xsna.w0m;
import xsna.y7u0;

/* compiled from: VkAlfaBaseActivity.kt */
/* loaded from: classes4.dex */
public abstract class VkAlfaBaseActivity extends VkBaseOAuthActivity {
    public static String m;
    public p600 l;

    /* compiled from: VkAlfaBaseActivity.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<k65, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(k65 k65Var) {
            ((VkAlfaBaseActivity) this.receiver).U1(k65Var);
            return s3q0.a;
        }
    }

    /* compiled from: VkAlfaBaseActivity.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<k65, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(k65 k65Var) {
            ((VkAlfaBaseActivity) this.receiver).U1(k65Var);
            return s3q0.a;
        }
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final void T1() {
        String stringExtra = getIntent().getStringExtra("vk_alfa_oauth_activity.activity_verification_code");
        String str = m;
        m = null;
        if (str == null || !epx.f(stringExtra, str)) {
            Q1("Invalid verification code.");
            return;
        }
        p600 p600Var = this.l;
        if (p600Var == null) {
            p600Var = null;
        }
        if (epx.f(p600Var.c.getValue(p600Var, p600.e[0]), k65.f.a)) {
            p600 p600Var2 = this.l;
            (p600Var2 != null ? p600Var2 : null).update(k65.g.a);
        }
    }

    public final void U1(k65 k65Var) {
        if (k65Var instanceof k65.b) {
            k65.b bVar = (k65.b) k65Var;
            R1(new Intent().putExtra("vk_alfa_oauth_activity.auth_code_result", new AuthCodeResult(bVar.a, bVar.b, bVar.c, bVar.d)));
            return;
        }
        if (!(k65Var instanceof k65.a)) {
            if (k65Var instanceof k65.h) {
                rex0 rex0Var = e370.j;
                if (rex0Var == null) {
                    rex0Var = null;
                }
                rex0Var.b(this, ((k65.h) k65Var).a);
                return;
            }
            return;
        }
        par0 par0Var = par0.a;
        k65.a aVar = (k65.a) k65Var;
        String str = aVar.a;
        Throwable th = aVar.b;
        par0Var.getClass();
        par0.c(str, th);
        Q1(str);
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w0m w0mVar = this.f;
        if (w0mVar == null) {
            w0mVar = null;
        }
        p600<k65> p600Var = ((y7u0) w0mVar).b;
        this.l = p600Var;
        (p600Var != null ? p600Var : null).b(new a(1, this, VkAlfaBaseActivity.class, "onAuthStatusUpdated", "onAuthStatusUpdated$base_release(Lcom/vk/oauth/alfa/base/internal/AuthStatus;)V", 0));
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        p600 p600Var = this.l;
        if (p600Var == null) {
            p600Var = null;
        }
        p600Var.a(new b(1, this, VkAlfaBaseActivity.class, "onAuthStatusUpdated", "onAuthStatusUpdated$base_release(Lcom/vk/oauth/alfa/base/internal/AuthStatus;)V", 0));
        super.onDestroy();
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        k65 aVar = data == null ? new k65.a("Redirect uri is null.", 2) : new k65.c(data);
        p600 p600Var = this.l;
        if (p600Var == null) {
            p600Var = null;
        }
        p600Var.update(aVar);
    }
}
