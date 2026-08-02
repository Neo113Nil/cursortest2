package com.vk.auth.ui.password.askpassword;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.VkExtendTokenData;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.VkClientAuthActivity;
import com.vk.auth.main.f;
import com.vk.auth.restore.RestoreNavValue;
import com.vkontakte.android.R;
import java.util.List;
import xsna.alu0;
import xsna.blu0;
import xsna.bpn0;
import xsna.cbu0;
import xsna.dhr0;
import xsna.e370;
import xsna.gfx0;
import xsna.j5g;
import xsna.m63;
import xsna.p4g;
import xsna.par0;
import xsna.q55;
import xsna.qb3;
import xsna.r55;
import xsna.s25;
import xsna.s3q0;

/* compiled from: VkAskPasswordActivity.kt */
/* loaded from: classes15.dex */
public final class VkAskPasswordActivity extends VkClientAuthActivity implements cbu0 {
    public VkAskPasswordData Z;

    public static void d2(VkAskPasswordActivity vkAskPasswordActivity) {
        super.finish();
        if (!vkAskPasswordActivity.k) {
            bpn0 bpn0Var = f.a;
            List<s25> y0 = j5g.y0(q55.b);
            q55.b bVar = new q55.b(par0.a);
            p4g.a aVar = p4g.a;
            for (s25 s25Var : y0) {
                try {
                    if (s25Var instanceof alu0) {
                        ((alu0) s25Var).getClass();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th) {
                    bVar.invoke(th);
                }
            }
        }
        vkAskPasswordActivity.overridePendingTransition(0, 0);
    }

    @Override // xsna.cbu0
    public final void H() {
        r55 r55Var = r55.a;
        r55.b();
        Intent intent = new Intent(this, (Class<?>) AuthActivity.class);
        intent.putExtra("extendTokenData", VkExtendTokenData.SignUp.b);
        startActivity(intent);
    }

    @Override // com.vk.auth.main.VkClientAuthActivity, com.vk.auth.DefaultAuthActivity
    public final void R1(Intent intent) {
        super.R1(intent);
        this.Z = intent != null ? (VkAskPasswordData) intent.getParcelableExtra("extra_extend_token_password_data") : null;
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final int U1() {
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        return !dhr0.M() ? R.style.VkSuperappkit_Light_Transparent : R.style.VkSuperappkit_Dark_Transparent;
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final void V1(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.V1(bundle);
    }

    @Override // com.vk.auth.main.VkClientAuthActivity, com.vk.auth.DefaultAuthActivity
    public final void Y1() {
        Bundle bundle;
        com.vk.auth.main.a aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        blu0 blu0Var = (blu0) aVar.b;
        VkAskPasswordData vkAskPasswordData = this.Z;
        if (vkAskPasswordData == null) {
            vkAskPasswordData = null;
        }
        blu0Var.n(vkAskPasswordData);
        VkAskPasswordData vkAskPasswordData2 = this.Z;
        if (vkAskPasswordData2 == null) {
            vkAskPasswordData2 = null;
        }
        VkAskPasswordEmailLoginData vkAskPasswordEmailLoginData = vkAskPasswordData2 instanceof VkAskPasswordEmailLoginData ? (VkAskPasswordEmailLoginData) vkAskPasswordData2 : null;
        if (vkAskPasswordEmailLoginData == null || (bundle = vkAskPasswordEmailLoginData.f) == null) {
            return;
        }
        com.vk.auth.main.a aVar2 = this.g;
        SignUpDataHolder signUpDataHolder = (aVar2 != null ? aVar2 : null).a;
        if (signUpDataHolder.K == null) {
            signUpDataHolder.K = new Bundle();
        }
        m63.l(signUpDataHolder.K, bundle);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.cbu0
    public final void d1() {
        VkAskPasswordData vkAskPasswordData = this.Z;
        if (vkAskPasswordData == null) {
            vkAskPasswordData = null;
        }
        if (vkAskPasswordData instanceof VkAskPasswordEmailLoginData) {
            RestoreNavValue restoreNavValue = RestoreNavValue.AUTH_SCREEN;
        } else if (vkAskPasswordData instanceof VkExtendPartialTokenData) {
            RestoreNavValue restoreNavValue2 = RestoreNavValue.AUTH_SCREEN;
        } else if (vkAskPasswordData instanceof VkExtendSilentTokenData) {
            RestoreNavValue restoreNavValue3 = RestoreNavValue.AUTH_SCREEN;
        }
        new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME);
        bpn0 bpn0Var = f.a;
        throw null;
    }

    @Override // com.vk.auth.DefaultAuthActivity, android.app.Activity
    public final void finish() {
        new Handler().postDelayed(new qb3(this, 19), 150L);
    }

    @Override // xsna.cbu0
    public final void g() {
        com.vk.auth.main.a aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        ((blu0) aVar.b).g();
    }

    @Override // xsna.cbu0
    public final void m1() {
        r55 r55Var = r55.a;
        r55.b();
        Intent intent = new Intent(this, (Class<?>) AuthActivity.class);
        intent.putExtra("extendTokenData", VkExtendTokenData.EnterByLoginPassword.b);
        startActivity(intent);
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final void b2() {
    }
}
