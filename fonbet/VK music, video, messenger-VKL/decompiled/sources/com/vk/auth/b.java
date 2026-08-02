package com.vk.auth;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import com.coremedia.iso.boxes.AuthorBox;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.init.choose.ChooseProfileData;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.oauth.VkOAuthGoal;
import com.vk.auth.oauth.VkOAuthRouterInfo;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.MultiAccountData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.auth.validation.fullscreen.success.PhoneValidationSuccessFragment;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.otp.OTPCheckFragment;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.qr.rustore.api.VkRustoreQrComponent;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vk.whitelabelauth.di.data.WhiteLabelAuthData;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.a2q;
import xsna.a3a0;
import xsna.arf0;
import xsna.b2q;
import xsna.b6k0;
import xsna.blk;
import xsna.bmj0;
import xsna.bn;
import xsna.brm0;
import xsna.dpp;
import xsna.emi;
import xsna.epx;
import xsna.f3z;
import xsna.f4m;
import xsna.f9t;
import xsna.fpf0;
import xsna.frf0;
import xsna.gbl;
import xsna.gmk;
import xsna.hbl;
import xsna.kop;
import xsna.kr6;
import xsna.l3z;
import xsna.lx70;
import xsna.lz2;
import xsna.m63;
import xsna.m7m;
import xsna.mii0;
import xsna.msy;
import xsna.ol90;
import xsna.pop;
import xsna.q55;
import xsna.qbc;
import xsna.qro0;
import xsna.r55;
import xsna.rl3;
import xsna.sys;
import xsna.ta6;
import xsna.tbe0;
import xsna.tk5;
import xsna.ueq0;
import xsna.umu0;
import xsna.v3a0;
import xsna.vak;
import xsna.vl90;
import xsna.wmp;
import xsna.x2v0;
import xsna.z1h0;
import xsna.z2z;
import xsna.z58;
import xsna.z5k0;
import xsna.zkn0;
import xsna.zlx0;

/* compiled from: DefaultAuthRouter.kt */
/* loaded from: classes.dex */
public class b implements com.vk.auth.main.b {
    public static final Set<String> g = rl3.y0(new String[]{"VALIDATE", "BAN", "RESTORE", "PASSKEY_CHECK", "CONSCIOUS_REGISTRATION", "FULLSCREEN_PASSWORD", "WHITE_LABEL", "EXISTING_PROFILE", "KEY_OK_MIMICRY_PROFILE_FORM", "KEY_OK_MIMICRY_ITS_ME", "KEY_OK_MIMICRY_PASSWORD", "KEY_OK_MIMICRY_VKID_ITS_ME", "KEY_OK_MIMICRY_EXISTING_PROFILE", "KEY_OK_MIMICRY_PERMISSIONS", "KEY_OK_MIMICRY_PHONE_INPUT", "SUSPICIOUS_AUTH"});
    public final DefaultAuthActivity a;
    public final FragmentManager b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* compiled from: DefaultAuthRouter.kt */
    public static final class a {
        public final Fragment a;
        public final String b;
        public final Bundle c;
        public boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public a(Fragment fragment, String str, Bundle bundle, boolean z, int i) {
            bundle = (i & 4) != 0 ? null : bundle;
            z = (i & 8) != 0 ? false : z;
            boolean z2 = (i & 16) != 0;
            this.a = fragment;
            this.b = str;
            this.c = bundle;
            this.d = z;
            this.e = z2;
            this.f = false;
            this.g = false;
        }
    }

    public b(DefaultAuthActivity defaultAuthActivity, FragmentManager fragmentManager) {
        this.a = defaultAuthActivity;
        this.b = fragmentManager;
        bn bnVar = new bn(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, bnVar);
        int i = 0;
        this.d = msy.a(lazyThreadSafetyMode, new gbl(this, i));
        this.e = msy.a(lazyThreadSafetyMode, new hbl(this, i));
        this.f = msy.a(lazyThreadSafetyMode, new z58(3));
    }

    public static a C(String str, CheckPresenterInfo checkPresenterInfo, CodeState codeState) {
        return new a(new mii0(), "VALIDATE", mii0.a.a(str, checkPresenterInfo, codeState instanceof CodeState.SmsInbox ? (CodeState.SmsInbox) codeState : null), false, 120);
    }

    public static boolean F(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        if (fragment instanceof ta6) {
            return true;
        }
        Set<String> set = g;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (epx.f(fragmentManager.H((String) it.next()), fragment)) {
                return true;
            }
        }
        return false;
    }

    public a A() {
        return new a(null, "PASSPORT", null, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    public a B() {
        return new a(null, "RESTORE", null, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    @Override // com.vk.auth.main.b
    public final FragmentActivity B0() {
        return this.a;
    }

    @Override // com.vk.auth.main.b
    public final void C0(CreateVkEmailRequiredData createVkEmailRequiredData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.VK_MAIL_CREATE, null, null, null, 30);
        G(new vak(), "CREATE_VK_EMAIL", vak.a.a(createVkEmailRequiredData), true, true, false, false);
    }

    public a D() {
        return new a(null, "SUPPORT", null, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    @Override // com.vk.auth.main.b
    public final void D0(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo) {
        G(new v3a0(), "PHONE_VALIDATION_OFFER", v3a0.a.a(phoneValidationContract$ValidationDialogMetaInfo), false, true, false, false);
    }

    public final Fragment E() {
        return this.b.G(R.id.vk_fragment_container);
    }

    @Override // com.vk.auth.main.b
    public final void E0(String str, String str2, String str3, boolean z, CodeState codeState, boolean z2) {
        if (codeState instanceof CodeState.SmsInbox) {
            H(C(str3, new CheckPresenterInfo.Validation(str, z, null, z2, 4, null), codeState));
        } else {
            G(new OTPCheckFragment(), "VALIDATE", OTPCheckFragment.a.d(new OTPCheckFragment.ValidationArgs(str, str2, str3, z, codeState, z2)), false, true, false, false);
        }
    }

    @Override // com.vk.auth.main.b
    public final void F0(String str, VkAuthState vkAuthState) {
        G(new ueq0(), "VALIDATE", ueq0.a.a(str, vkAuthState), false, true, false, false);
    }

    public void G(Fragment fragment, String str, Bundle bundle, boolean z, boolean z2, boolean z3, boolean z4) {
        androidx.fragment.app.a aVar;
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = this.b;
        if (z) {
            for (int K = fragmentManager.K(); K > 0; K--) {
                fragmentManager.W();
                int i = K - 1;
                if (i == fragmentManager.d.size()) {
                    aVar = fragmentManager.h;
                    if (aVar == null) {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    aVar = fragmentManager.d.get(i);
                }
                z1h0 H = fragmentManager.H(aVar.getName());
                arf0 arf0Var = H instanceof arf0 ? (arf0) H : null;
                SchemeStatSak$EventScreen u5 = arf0Var != null ? arf0Var.u5() : null;
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                qro0.c(new tbe0(u5, 3));
            }
        } else {
            fragmentManager.Z(-1, 1, str);
        }
        Fragment E = E();
        boolean z5 = false;
        boolean z6 = E == null;
        Fragment I = I(E, z3);
        androidx.fragment.app.a b = tk5.b(fragmentManager, fragmentManager);
        if (!(fragment instanceof d) || z4) {
            int i2 = z2 ? R.id.vk_fragment_container : 0;
            if (z6) {
                b.f(i2, fragment, str, 1);
            } else {
                b.g(i2, fragment, str);
            }
        } else {
            b.f(0, fragment, str, 1);
            DefaultAuthActivity defaultAuthActivity = this.a;
            defaultAuthActivity.getWindow().getDecorView().setBackground(null);
            defaultAuthActivity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        if (I != null) {
            b.p(I);
        }
        if (fragmentManager.K() == 0 && I != null && F(fragmentManager, I)) {
            z5 = true;
        }
        if (!z6 && !z && !z5) {
            b.d(str);
        }
        b.k(true);
    }

    @Override // com.vk.auth.main.b
    public final void G0(MultiAccountData multiAccountData) {
        G(new a2q(), "EXCHANGE_LOGIN", a2q.a.a(multiAccountData), true, true, false, false);
    }

    public final boolean H(a aVar) {
        Fragment fragment = aVar.a;
        if (fragment == null) {
            return false;
        }
        G(fragment, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
        return true;
    }

    @Override // com.vk.auth.main.b
    public final void H0(String str, String str2) {
        new a3a0(str, str2).a(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Fragment I(Fragment fragment, boolean z) {
        if (!z) {
            FragmentManager fragmentManager = this.b;
            if (F(fragmentManager, fragment)) {
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                arf0 arf0Var = fragment instanceof arf0 ? (arf0) fragment : null;
                qro0.c(new tbe0(arf0Var != null ? arf0Var.u5() : null, 3));
                fragmentManager.Y();
                Fragment E = E();
                if (E == null) {
                    return null;
                }
                View view = E.getView();
                if (view != null) {
                    f4m.j(view);
                }
                return E;
            }
        }
        return fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.auth.main.b
    public final void I0(PasskeyCheckInfo passkeyCheckInfo) {
        if (passkeyCheckInfo.d() == PasskeyAlternative.RESTORE) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AUTH_PASSKEY_ONLY_FOR_PHONE_NO_START, null, null, null, null, null, null, 254);
        }
        if (ol90.b()) {
            G(new vl90(), "PASSKEY_CHECK", vl90.a.a(passkeyCheckInfo), false, true, false, false);
            return;
        }
        Bundle l = emi.l(passkeyCheckInfo);
        DefaultAuthActivity defaultAuthActivity = this.a;
        if (defaultAuthActivity instanceof gmk) {
            VkOAuthRouterInfo vkOAuthRouterInfo = new VkOAuthRouterInfo(VkOAuthService.PASSKEY, null, l, VkOAuthGoal.AUTH);
            gmk gmkVar = (gmk) defaultAuthActivity;
            DefaultAuthActivity defaultAuthActivity2 = DefaultAuthActivity.U;
            r55 r55Var = r55.a;
            umu0 umu0Var = r55.g;
            com.vk.auth.oauth.a aVar = (umu0Var != null ? umu0Var : null).j;
            new Intent(defaultAuthActivity, (Class<?>) AuthActivity.OauthActivity.class).putExtra("oauthData", vkOAuthRouterInfo);
            gmkVar.a();
            return;
        }
        r55 r55Var2 = r55.a;
        umu0 umu0Var2 = r55.g;
        if (umu0Var2 == null) {
            umu0Var2 = null;
        }
        com.vk.auth.oauth.a aVar2 = umu0Var2.j;
        VkOAuthService vkOAuthService = VkOAuthService.PASSKEY;
        Context applicationContext = defaultAuthActivity.getApplicationContext();
        if (aVar2.a.contains(vkOAuthService)) {
            return;
        }
        VkOAuthRouterInfo vkOAuthRouterInfo2 = new VkOAuthRouterInfo(vkOAuthService, null, l, VkOAuthGoal.AUTH);
        DefaultAuthActivity defaultAuthActivity3 = DefaultAuthActivity.U;
        Intent intent = new Intent(applicationContext, (Class<?>) AuthActivity.OauthActivity.class);
        intent.putExtra("oauthData", vkOAuthRouterInfo2);
        applicationContext.startActivity(intent.addFlags(268435456));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.main.b
    public final void J0(VerificationScreenData verificationScreenData, VerificationMethodState verificationMethodState) {
        G(((b6k0) this.c.getValue()).b(), "VALIDATE", f9t.H(z5k0.a.a(verificationScreenData, verificationMethodState)), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void K0(String str, boolean z) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        kr6 kr6Var = new kr6(20);
        bVar.getClass();
        com.vk.registration.funnels.b.a(kr6Var);
        G(new dpp(), "ENTER_PHONE", dpp.a.a(new EnterPhonePresenterInfo.Validate(str, z)), true, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void L0(String str) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        lz2 lz2Var = new lz2(29);
        bVar.getClass();
        com.vk.registration.funnels.b.a(lz2Var);
        pop popVar = new pop();
        Bundle a2 = pop.a.a(str);
        FragmentManager fragmentManager = this.b;
        Fragment H = fragmentManager.H("LOGIN_PASS");
        pop popVar2 = H instanceof pop ? (pop) H : null;
        Fragment E = E();
        if (E instanceof pop) {
            ((pop) E).yn(str);
        } else if (popVar2 == null) {
            G(popVar, "LOGIN_PASS", a2, false, true, false, false);
        } else {
            fragmentManager.Z(-1, 0, "LOGIN_PASS");
            popVar2.yn(str);
        }
    }

    @Override // com.vk.auth.main.b
    public final void M0() {
        H(y());
    }

    @Override // com.vk.auth.main.b
    public final void N0(int i) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.VKID_USER_CONFIRMATION, null, null, null, 30);
        G(new x2v0(), "CONFIRM_LOGIN", x2v0.a.a(i), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void O0(String str, VkAuthState vkAuthState) {
        G(new dpp(), "ENTER_PHONE", dpp.a.a(new EnterPhonePresenterInfo.Auth(str, vkAuthState)), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void P0(LibverifyScreenData.Auth auth) {
        G(new z2z(), "VALIDATE", z2z.a.a(this.a, auth), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void Q0() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(null, SchemeStatSak$EventScreen.AUTH_MOBILE_QR_CODE_APP, null, false, null, null, 61);
        ((VkRustoreQrComponent) m7m.a(this.a).mo408a(fpf0.a(VkRustoreQrComponent.class))).y1();
        throw null;
    }

    @Override // com.vk.auth.main.b
    public final void R0(boolean z) {
        G(new wmp(), "ENTER_EMAIL", wmp.a.a(z), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void T0(FullscreenPasswordData fullscreenPasswordData, boolean z) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.AUTH_PASSWORD, null, null, null, 30);
        G(new sys(), "FULLSCREEN_PASSWORD", sys.a.a(fullscreenPasswordData), false, true, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.auth.main.b
    public final void U0(String str, boolean z, boolean z2) {
        RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = null;
        if (str != null) {
            Iterator<E> it = SchemeStatSak$EventScreen.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (brm0.w(((SchemeStatSak$EventScreen) next).name(), str, true)) {
                    schemeStatSak$EventScreen = next;
                    break;
                }
            }
            schemeStatSak$EventScreen = schemeStatSak$EventScreen;
        }
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.START_WITH_PHONE, null, schemeStatSak$EventScreen, null, 26);
        H(x(z, z2));
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.main.b
    public final void V0(List<Object> list) {
        ?? r10 = this.d;
        G(((lx70) r10.getValue()).b(), "OK_HEADS", ((lx70) r10.getValue()).a(), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void W0(String str, VkAuthState vkAuthState, String str2, CodeState codeState, String str3, boolean z) {
        if (codeState instanceof CodeState.SmsInbox) {
            H(C(str2, new CheckPresenterInfo.Auth(vkAuthState), codeState));
        } else {
            G(new OTPCheckFragment(), "VALIDATE", OTPCheckFragment.a.a(new OTPCheckFragment.AuthArgs(str, vkAuthState, str2, codeState, str3, z)), false, true, false, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.main.b
    public final void Y0(WhiteLabelAuthData whiteLabelAuthData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.SILENT_AUTH_LOADING, null, null, null, 30);
        ?? r0 = this.f;
        zlx0 zlx0Var = (zlx0) r0.getValue();
        ?? r2 = this.e;
        com.vk.whitelabelauth.di.b bVar2 = (com.vk.whitelabelauth.di.b) r2.getValue();
        zlx0Var.getClass();
        Fragment b = zlx0.b(bVar2);
        zlx0 zlx0Var2 = (zlx0) r0.getValue();
        com.vk.whitelabelauth.di.b bVar3 = (com.vk.whitelabelauth.di.b) r2.getValue();
        zlx0Var2.getClass();
        G(b, "WHITE_LABEL", zlx0.a(bVar3, whiteLabelAuthData), false, true, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.main.b
    public final void b1(FullscreenPasswordData fullscreenPasswordData) {
        RegistrationStatParamsFactory.a = RegistrationStatFlowType.TG_FLOW;
        b.a aVar = b.a.a;
        aVar.getClass();
        b.a.a();
        VkEmailForwardingConfig vkEmailForwardingConfig = null;
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                vkEmailForwardingConfig = m63.d(bundle);
            }
        } catch (Throwable unused) {
        }
        b.a.e(aVar, vkEmailForwardingConfig);
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.AUTH_PASSWORD, null, null, null, 30);
        G(((b6k0) this.c.getValue()).a(), "FULLSCREEN_PASSWORD", blk.T(fullscreenPasswordData), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void c1(ChooseProfileData chooseProfileData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.PROCEED_AS_WITH_SUBPROFILE, null, null, null, 30);
        G(new qbc(), "CHOOSE_PROFILE", qbc.a.a(chooseProfileData), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void d1(VkAuthState vkAuthState, SendOtpInfo sendOtpInfo, ValidateInfo validateInfo) {
        G(new zkn0(), "SUSPICIOUS_AUTH", zkn0.a.a(vkAuthState, sendOtpInfo, validateInfo), false, true, false, true);
    }

    @Override // com.vk.auth.main.b
    public final void e1(SignUpAgreementInfo signUpAgreementInfo) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        boolean d = signUpAgreementInfo.d();
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.REG_ADD_TYPE, d ? AuthorBox.TYPE : "reg"));
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.REGISTRATION_SERVICE_USER_ADD, arrayList, null, null, 28);
        G(new bmj0(), "SIGN_UP_AGREEMENT_KEY", bmj0.a.a(signUpAgreementInfo), false, true, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.main.b
    public final void f1(LibverifyScreenData.MethodSelectorAuth methodSelectorAuth) {
        G(((b6k0) this.c.getValue()).c(), "VALIDATE", new f3z(0).a(l3z.a.a(methodSelectorAuth)), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void h1(PhoneValidationPendingEvent phoneValidationPendingEvent) {
        G(new PhoneValidationSuccessFragment(), "PHONE_VALIDATION_SUCCESS", PhoneValidationSuccessFragment.a.a(phoneValidationPendingEvent), false, true, false, false);
    }

    public a w() {
        return new a(null, "BAN", null, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    public a x(boolean z, boolean z2) {
        kop kopVar = new kop();
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("WITH_CLOSE_BUTTON", z2);
        return new a(kopVar, "LOGIN", bundle, z, 112);
    }

    public a y() {
        return new a(new b2q(), "EXCHANGE_LOGIN", null, true, 116);
    }

    public a z() {
        return new a(null, "PAGE", null, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    @Override // com.vk.auth.main.b
    public void c() {
    }
}
