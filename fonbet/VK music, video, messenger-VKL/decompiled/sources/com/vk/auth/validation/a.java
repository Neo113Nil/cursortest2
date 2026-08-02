package com.vk.auth.validation;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.buc0;
import xsna.ctu0;
import xsna.e370;
import xsna.jgp;
import xsna.p4g;
import xsna.par0;
import xsna.r55;
import xsna.t9o0;

/* compiled from: VkExtraValidationAuthActivityRouter.kt */
/* loaded from: classes15.dex */
public final class a implements ctu0 {
    public final FragmentActivity a;

    public a(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    @Override // xsna.ctu0
    public final void C0(CreateVkEmailRequiredData createVkEmailRequiredData) {
        par0.a.getClass();
        par0.a("[ExtraValidation] email required");
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        Intent f = f();
        f.putExtra("createVkEmailRequiredData", createVkEmailRequiredData);
        g(f);
    }

    @Override // xsna.ctu0
    public final void D0(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo) {
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        Intent f = f();
        f.putExtra("validationPhoneOfferData", phoneValidationContract$ValidationDialogMetaInfo);
        g(f);
    }

    @Override // xsna.ctu0
    public final void a(VkChangePhoneRouterInfo vkChangePhoneRouterInfo) {
        par0.a.getClass();
        par0.a("[ExtraValidation] change phone");
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge;
        superappUiRouterBridge2.X(this.a, vkChangePhoneRouterInfo.b, new t9o0(8), new buc0(21), jgp.b);
    }

    @Override // xsna.ctu0
    public final void b(VkBanRouterInfo vkBanRouterInfo) {
        par0.a.getClass();
        par0.a("[ExtraValidation] banned user");
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        Intent f = f();
        f.putExtra("banData", vkBanRouterInfo);
        g(f);
    }

    @Override // xsna.ctu0
    public final void c(VkPassportRouterInfo vkPassportRouterInfo) {
        par0.a.getClass();
        par0.a("[ExtraValidation] passport");
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        Intent f = f();
        f.putExtra("passportData", vkPassportRouterInfo);
        g(f);
    }

    @Override // xsna.ctu0
    public final void d(VkValidateRouterInfo vkValidateRouterInfo, boolean z) {
        par0 par0Var = par0.a;
        String str = "[ExtraValidation] phone: isAuth=" + vkValidateRouterInfo.d + ", dialog=" + vkValidateRouterInfo.c;
        par0Var.getClass();
        par0.a(str);
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        Intent f = f();
        f.putExtra("validationData", vkValidateRouterInfo);
        if (z) {
            f.addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        }
        g(f);
    }

    @Override // xsna.ctu0
    public final void e(VkAdditionalSignUpData vkAdditionalSignUpData) {
        par0 par0Var = par0.a;
        String concat = "[ExtraValidation] signup: ".concat(p4g.k(vkAdditionalSignUpData.b, StringUtils.COMMA, null));
        par0Var.getClass();
        par0.a(concat);
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        Intent f = f();
        f.putExtra("additionalSignUpData", vkAdditionalSignUpData);
        g(f);
    }

    public final Intent f() {
        r55 r55Var = r55.a;
        r55.b();
        return new Intent(this.a, (Class<?>) AuthActivity.class);
    }

    public final void g(Intent intent) {
        this.a.startActivity(intent);
    }
}
