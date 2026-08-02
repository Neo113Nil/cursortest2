package com.vk.auth.main;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.avatarpicker.AuthAvatarPickerActivity;
import com.vk.auth.b;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.ui.password.askpassword.VkAskPasswordData;
import com.vk.auth.ui.password.askpassword.VkAskPasswordEmailLoginData;
import com.vk.auth.ui.password.askpassword.VkAskPasswordSATLoginData;
import com.vk.auth.ui.password.askpassword.VkExtendPartialTokenData;
import com.vk.auth.ui.password.askpassword.VkExtendSilentTokenData;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.util.ArrayList;
import xsna.bbu0;
import xsna.blu0;
import xsna.bpc0;
import xsna.bpn0;
import xsna.kcu0;
import xsna.m2q0;
import xsna.rf20;
import xsna.ubu0;

/* compiled from: VkClientDefaultAuthRouter.kt */
/* loaded from: classes15.dex */
public final class g extends com.vk.auth.c implements blu0 {
    public final boolean i;

    public g(VkClientAuthActivity vkClientAuthActivity, FragmentManager fragmentManager, boolean z) {
        super(vkClientAuthActivity, fragmentManager);
        this.i = z;
    }

    @Override // com.vk.auth.b
    public final b.a A() {
        new ubu0();
        bpn0 bpn0Var = f.a;
        throw null;
    }

    @Override // com.vk.auth.b
    public final b.a B() {
        bpn0 bpn0Var = f.a;
        throw null;
    }

    @Override // com.vk.auth.b
    public final b.a D() {
        bpn0 bpn0Var = f.a;
        throw null;
    }

    @Override // com.vk.auth.c
    public final b.a J(String str, Country country, String str2, VkAuthMetaInfo vkAuthMetaInfo) {
        b.a J = super.J(str, country, str2, vkAuthMetaInfo);
        J.d = true;
        return J;
    }

    @Override // com.vk.auth.c
    public final void N(String str, Country country, String str2, VkAuthMetaInfo vkAuthMetaInfo) {
        if (this.i) {
            if ((vkAuthMetaInfo != null ? vkAuthMetaInfo.c : null) == null) {
                this.a.finish();
                return;
            }
        }
        super.N(str, country, str2, vkAuthMetaInfo);
    }

    @Override // com.vk.auth.c, com.vk.auth.main.SignUpRouter
    public final void b(String str) {
        new m2q0(str, new kcu0(SchemeStatSak$EventScreen.HAVE_ACCOUNT_SUPPORT, true, null)).a(this.a);
    }

    @Override // xsna.blu0
    public final void g() {
        Dialog dialog;
        for (Fragment fragment : this.b.c.f()) {
            androidx.fragment.app.d dVar = fragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) fragment : null;
            if (dVar != null && (dialog = dVar.s) != null) {
                dialog.dismiss();
            }
        }
    }

    @Override // com.vk.auth.c, com.vk.auth.main.SignUpRouter
    public final void j(Fragment fragment, boolean z) {
        int i = AuthAvatarPickerActivity.i;
        Intent intent = new Intent(fragment.requireContext(), (Class<?>) AuthAvatarPickerActivity.class);
        intent.putExtra("enable_delete_button", z);
        fragment.startActivityForResult(intent, 13);
    }

    @Override // xsna.blu0
    public final void n(VkAskPasswordData vkAskPasswordData) {
        if (vkAskPasswordData instanceof VkExtendPartialTokenData) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.PARTIAL_EXPAND_ENTER_PASSWORD, null, null, null, 28);
        } else if (vkAskPasswordData instanceof VkExtendSilentTokenData) {
            com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
            bpc0 bpc0Var = new bpc0(1);
            bVar2.getClass();
            com.vk.registration.funnels.b.a(bpc0Var);
        } else if (vkAskPasswordData instanceof VkAskPasswordEmailLoginData) {
            com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
            bVar3.getClass();
            com.vk.registration.funnels.b.a(new rf20(L, 21));
        } else if (vkAskPasswordData instanceof VkAskPasswordSATLoginData) {
            com.vk.registration.funnels.b bVar4 = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L2 = L();
            bVar4.getClass();
            com.vk.registration.funnels.b.z(bVar4, SchemeStatSak$EventScreen.LK_PASSWORD, L2, null, null, 28);
        }
        bbu0 bbu0Var = new bbu0();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("extra_extend_token_password_data", vkAskPasswordData);
        G(bbu0Var, "ASK_PASSWORD", bundle, false, false, false, false);
    }

    @Override // com.vk.auth.b
    public final b.a w() {
        new ubu0();
        new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME);
        bpn0 bpn0Var = f.a;
        throw null;
    }

    @Override // com.vk.auth.b
    public final b.a z() {
        new ubu0();
        bpn0 bpn0Var = f.a;
        throw null;
    }
}
