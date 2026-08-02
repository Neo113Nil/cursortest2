package com.vk.oauth.tinkoff;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.auth.oauth.VkBaseOAuthActivity;
import com.vk.auth.oauth.parcelable.AccessTokenResult;
import com.vk.auth.oauth.parcelable.AuthCodeResult;
import com.vk.oauth.tinkoff.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.e370;
import xsna.epx;
import xsna.gc4;
import xsna.htk0;
import xsna.iml0;
import xsna.isv0;
import xsna.izs;
import xsna.o8u0;
import xsna.rex0;
import xsna.rrn0;
import xsna.s3q0;
import xsna.syo0;

/* compiled from: VkTinkoffBaseActivity.kt */
/* loaded from: classes4.dex */
public abstract class VkTinkoffBaseActivity extends VkBaseOAuthActivity {
    public static final /* synthetic */ int o = 0;
    public final bpn0 l = new bpn0(new iml0(this, 26));
    public final bpn0 m = new bpn0(new o8u0(this, 3));
    public final bpn0 n = new bpn0(new rrn0(this, 28));

    /* compiled from: VkTinkoffBaseActivity.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<com.vk.oauth.tinkoff.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.oauth.tinkoff.a aVar) {
            VkTinkoffBaseActivity.U1((VkTinkoffBaseActivity) this.receiver, aVar);
            return s3q0.a;
        }
    }

    /* compiled from: VkTinkoffBaseActivity.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<com.vk.oauth.tinkoff.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.oauth.tinkoff.a aVar) {
            VkTinkoffBaseActivity.U1((VkTinkoffBaseActivity) this.receiver, aVar);
            return s3q0.a;
        }
    }

    public static final void U1(VkTinkoffBaseActivity vkTinkoffBaseActivity, com.vk.oauth.tinkoff.a aVar) {
        vkTinkoffBaseActivity.getClass();
        if (aVar instanceof a.f) {
            gc4 gc4Var = vkTinkoffBaseActivity.V1().c;
            a.f fVar = (a.f) aVar;
            vkTinkoffBaseActivity.R1(new Intent().putExtra("vk_tinkoff_oauth_activity.auth_code", new AuthCodeResult(fVar.a, fVar.b, (String) gc4Var.a, (String) gc4Var.b)));
            return;
        }
        if (aVar instanceof a.e) {
            vkTinkoffBaseActivity.R1(new Intent().putExtra("vk_tinkoff_oauth_activity.access_token", new AccessTokenResult(((a.e) aVar).a, (String) vkTinkoffBaseActivity.V1().c.a)));
            return;
        }
        if (aVar instanceof a.g) {
            rex0 rex0Var = e370.j;
            if (rex0Var == null) {
                rex0Var = null;
            }
            rex0Var.b(vkTinkoffBaseActivity, ((a.g) aVar).a);
            return;
        }
        if (aVar instanceof a.b) {
            vkTinkoffBaseActivity.Q1(((a.b) aVar).a);
        } else if (epx.f(aVar, a.C1443a.a)) {
            vkTinkoffBaseActivity.setResult(0);
            vkTinkoffBaseActivity.finish();
        }
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final void T1() {
        com.vk.oauth.tinkoff.b bVar = (com.vk.oauth.tinkoff.b) this.m.getValue();
        syo0 syo0Var = bVar.b;
        syo0 syo0Var2 = bVar.c;
        htk0<com.vk.oauth.tinkoff.a> htk0Var = bVar.a;
        if (htk0Var.get() instanceof a.d) {
            return;
        }
        htk0Var.update(a.d.a);
        if (syo0Var2.start()) {
            bVar.d = syo0Var2;
        } else {
            syo0Var.start();
            bVar.d = syo0Var;
        }
    }

    public isv0 V1() {
        return (isv0) this.l.getValue();
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((htk0) this.n.getValue()).b(new a(1, this, VkTinkoffBaseActivity.class, "onAuthStatusChanged", "onAuthStatusChanged(Lcom/vk/oauth/tinkoff/AuthStatus;)V", 0));
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ((htk0) this.n.getValue()).a(new b(1, this, VkTinkoffBaseActivity.class, "onAuthStatusChanged", "onAuthStatusChanged(Lcom/vk/oauth/tinkoff/AuthStatus;)V", 0));
        super.onDestroy();
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data == null) {
            setResult(0);
            finish();
            return;
        }
        com.vk.oauth.tinkoff.b bVar = (com.vk.oauth.tinkoff.b) this.m.getValue();
        String uri = data.toString();
        com.vk.oauth.tinkoff.a aVar = bVar.a.get();
        if ((aVar instanceof a.d) || (aVar instanceof a.g)) {
            syo0 syo0Var = bVar.d;
            if (syo0Var == null) {
                syo0Var = null;
            }
            syo0Var.a(uri);
        }
    }
}
