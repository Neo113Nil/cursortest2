package com.vk.auth.main;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.b;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.utils.VkPassportPage;
import com.vk.avatarpicker.AvatarPickerActivity;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.webapp.fragments.AccountFragment;
import com.vk.webapp.fragments.BannedFragment;
import com.vk.webapp.fragments.HelpFragment;
import com.vk.webapp.fragments.RestoreFragment;
import com.vungle.ads.internal.protos.Sdk;
import xsna.elu0;
import xsna.fpf0;
import xsna.glu0;
import xsna.koe0;
import xsna.m7m;
import xsna.pin0;

/* compiled from: VkSignUpRouter.kt */
/* loaded from: classes.dex */
public final class h extends com.vk.auth.c {
    @Override // com.vk.auth.b
    public final void G(Fragment fragment, String str, Bundle bundle, boolean z, boolean z2, boolean z3, boolean z4) {
        try {
            super.G(fragment, str, bundle, z, z2, z3, z4);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(new Exception("Crash when opening screen ".concat(str), e));
        }
    }

    @Override // com.vk.auth.c
    public final void M(BanInfo banInfo) {
        int i = BannedFragment.c0;
        BannedFragment.b a = BannedFragment.c.a(banInfo.zb(), banInfo.Bb(), banInfo.Ab());
        a.s(true);
        a.t();
        a.o();
        a.h(this.a, 23665);
    }

    @Override // com.vk.auth.c
    public final void O(String str, VkAuthCredentials vkAuthCredentials, UtilityTokens utilityTokens) {
        int i = AccountFragment.a0;
        AccountFragment.a a = AccountFragment.b.a(null, null, str, vkAuthCredentials, true, true, null, utilityTokens, 67);
        a.s(true);
        a.t();
        a.o();
        a.h(this.a, 23663);
    }

    @Override // com.vk.auth.c
    public final void P(String str, VkAuthCredentials vkAuthCredentials, VkPassportPage vkPassportPage, UtilityTokens utilityTokens) {
        int i = AccountFragment.a0;
        AccountFragment.a a = AccountFragment.b.a(vkPassportPage.i(), null, str, vkAuthCredentials, false, false, null, utilityTokens, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        a.s(true);
        a.t();
        a.o();
        a.h(this.a, 23663);
    }

    @Override // com.vk.auth.c
    public final void Q(RestoreReason restoreReason) {
        int i = RestoreFragment.a0;
        int i2 = VKSuperAppBrowserFragment.Y;
        RestoreFragment.a a = RestoreFragment.b.a(restoreReason.g(VKSuperAppBrowserFragment.a.a()).toString(), restoreReason.d(), restoreReason.e());
        a.s(true);
        a.t();
        a.o();
        a.h(this.a, 23664);
    }

    @Override // com.vk.auth.c
    public final void R(pin0.a aVar) {
        HelpFragment.a a;
        int i = HelpFragment.a0;
        int i2 = VKSuperAppBrowserFragment.Y;
        a = HelpFragment.b.a(null, null, aVar.b(VKSuperAppBrowserFragment.a.a()).toString());
        a.s(true);
        a.t();
        a.o();
        a.k(this.a);
    }

    @Override // com.vk.auth.b, com.vk.auth.main.b
    public final void c() {
        DefaultAuthActivity defaultAuthActivity = this.a;
        koe0 handler = ((QrWebToAppComponent) m7m.a(defaultAuthActivity).a(fpf0.a(QrWebToAppComponent.class))).getHandler();
        if (handler.e()) {
            handler.d(defaultAuthActivity);
        }
    }

    @Override // com.vk.auth.c, com.vk.auth.main.SignUpRouter
    public final void j(Fragment fragment, boolean z) {
        int i = AvatarPickerActivity.g;
        fragment.startActivityForResult(AvatarPickerActivity.a.c(fragment.requireContext(), z), 13);
    }

    @Override // com.vk.auth.b
    public final b.a x(boolean z, boolean z2) {
        elu0 elu0Var = new elu0();
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("WITH_CLOSE_BUTTON", z2);
        return new b.a(elu0Var, "LOGIN", bundle, z, 112);
    }

    @Override // com.vk.auth.b
    public final b.a y() {
        return new b.a(new glu0(), "EXCHANGE_LOGIN", null, true, 116);
    }
}
