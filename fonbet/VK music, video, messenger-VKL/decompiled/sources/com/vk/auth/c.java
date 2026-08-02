package com.vk.auth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.vkidok.dto.VkidokStartRegistrationResponseDto;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.b;
import com.vk.auth.enteremail.binding.BindEnteredEmailArgs;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.ConsciousRegistrationScreenData;
import com.vk.auth.screendata.EnterProfileScreenData;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.ui.checkaccess.CheckAccessBottomSheetFragment;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.auth.utils.VkPassportPage;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.stats.VerificationStatStartedFromReg;
import com.vk.auth.verification.checkaccess.VkCheckAccessRequiredData;
import com.vk.auth.verification.otp.OTPCheckFragment;
import com.vk.odnoklassniki.registration.data.CreatePasswordFragmentData;
import com.vk.odnoklassniki.registration.data.OkExistingProfileFragmentData;
import com.vk.odnoklassniki.registration.data.OkItsMeFragmentData;
import com.vk.odnoklassniki.registration.data.VKIDItsMeFragmentData;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.core.api.models.BanInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.a0a;
import xsna.a37;
import xsna.arf0;
import xsna.by20;
import xsna.c5g;
import xsna.c950;
import xsna.dpp;
import xsna.e370;
import xsna.e550;
import xsna.ecp;
import xsna.ed6;
import xsna.ezf;
import xsna.jeq0;
import xsna.k5h;
import xsna.k6k0;
import xsna.kcu0;
import xsna.kpp;
import xsna.kr50;
import xsna.m2q0;
import xsna.msy;
import xsna.n6k0;
import xsna.opp;
import xsna.p1c;
import xsna.pin0;
import xsna.r;
import xsna.rex0;
import xsna.rka0;
import xsna.tju;
import xsna.tqf0;
import xsna.u4q;
import xsna.v4q;
import xsna.vex;
import xsna.vf1;
import xsna.yaa;
import xsna.yav0;
import xsna.ymu0;
import xsna.yu60;
import xsna.z1h0;
import xsna.z2z;
import xsna.zop;

/* compiled from: DefaultSignUpRouter.kt */
/* loaded from: classes.dex */
public class c extends b implements SignUpRouter {
    public final Object h;

    /* compiled from: DefaultSignUpRouter.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkAuthValidatePhoneResult.ValidationType.values().length];
            try {
                iArr[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_SMS_INBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(DefaultAuthActivity defaultAuthActivity, FragmentManager fragmentManager) {
        super(defaultAuthActivity, fragmentManager);
        this.h = msy.a(LazyThreadSafetyMode.NONE, new yaa(this, 1));
    }

    public b.a J(String str, Country country, String str2, VkAuthMetaInfo vkAuthMetaInfo) {
        return new b.a(new dpp(), "ENTER_PHONE", dpp.a.a(new EnterPhonePresenterInfo.SignUp(str, country, str2)), false, 120);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.odnoklassniki.registration.b K() {
        return (com.vk.odnoklassniki.registration.b) this.h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public final ArrayList<SchemeStatSak$RegistrationFieldItem> L() {
        ?? T1;
        z1h0 E = E();
        com.vk.registration.funnels.c cVar = E instanceof com.vk.registration.funnels.c ? (com.vk.registration.funnels.c) E : null;
        if (cVar == null || (T1 = cVar.aa()) == 0) {
            DefaultAuthActivity defaultAuthActivity = this.a;
            ArrayList<RegistrationTrackingElement> arrayList = defaultAuthActivity.D;
            if (arrayList != null) {
                T1 = new ArrayList(c5g.u(arrayList, 10));
                for (RegistrationTrackingElement registrationTrackingElement : arrayList) {
                    T1.add(new Pair(registrationTrackingElement.zb(), new k5h(registrationTrackingElement, 8)));
                }
            } else {
                T1 = defaultAuthActivity.T1();
            }
        }
        return com.vk.registration.funnels.a.c(T1);
    }

    public void M(BanInfo banInfo) {
        if (H(w())) {
            return;
        }
        Uri parse = Uri.parse("mailto:support@vk.com?subject=" + Uri.encode(""));
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("*/*");
        intent.setData(parse);
        intent.putExtra("android.intent.extra.EMAIL", "support@vk.com");
        try {
            this.a.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public void N(String str, Country country, String str2, VkAuthMetaInfo vkAuthMetaInfo) {
        H(J(str, country, str2, vkAuthMetaInfo));
    }

    public void O(String str, VkAuthCredentials vkAuthCredentials, UtilityTokens utilityTokens) {
        if (H(A())) {
            return;
        }
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, jeq0.g(yav0.c(6, "static.".concat(a0a.d), null)));
    }

    public void P(String str, VkAuthCredentials vkAuthCredentials, VkPassportPage vkPassportPage, UtilityTokens utilityTokens) {
        if (H(z())) {
            return;
        }
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, jeq0.g(yav0.c(4, "static.".concat(a0a.d), vkPassportPage.i())));
    }

    public void Q(RestoreReason restoreReason) {
        if (H(B())) {
            return;
        }
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, restoreReason.g("static.".concat(a0a.d)));
    }

    public void R(pin0.a aVar) {
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.a(new r(25));
        if (H(D())) {
            return;
        }
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, aVar.b("static.".concat(a0a.d)));
    }

    @Override // com.vk.auth.main.b
    public final void S0(RestoreReason restoreReason) {
        if (restoreReason instanceof RestoreReason.PasskeyIsUnavailable) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.EXTENDED_RESTORE, L, null, null, 28);
        } else {
            if (restoreReason instanceof RestoreReason.NoAvailableVerificationMethodsError) {
                com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
                b.a.a.getClass();
                ArrayList b = b.a.b();
                bVar2.getClass();
                com.vk.registration.funnels.b.a(new vf1(15, r1, b));
            } else if (restoreReason instanceof RestoreReason.PrimaryFactorChoice) {
                com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
                b.a.a.getClass();
                ArrayList c = b.a.c();
                c.add(((RestoreReason.PrimaryFactorChoice) restoreReason).i().h());
                z1h0 E = E();
                arf0 arf0Var = E instanceof arf0 ? (arf0) E : null;
                r1 = arf0Var != null ? arf0Var.u5() : null;
                bVar3.getClass();
                com.vk.registration.funnels.b.a(new vf1(15, r1, c));
            } else {
                com.vk.registration.funnels.b bVar4 = com.vk.registration.funnels.b.a;
                ArrayList<SchemeStatSak$RegistrationFieldItem> L2 = L();
                bVar4.getClass();
                com.vk.registration.funnels.b.a(new vf1(15, r1, L2));
            }
        }
        Q(restoreReason);
    }

    @Override // com.vk.auth.main.b
    public final void X0(pin0.a aVar) {
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.a(new r(25));
        if (!aVar.c()) {
            R(aVar);
            return;
        }
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, pin0.b.a());
    }

    @Override // com.vk.auth.main.b
    public final void Z0(String str, VkAuthCredentials vkAuthCredentials, UtilityTokens utilityTokens) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
        bVar.getClass();
        com.vk.registration.funnels.b.a(new vex(L, 25));
        I(E(), false);
        O(str, vkAuthCredentials, utilityTokens);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void a(OkExistingProfileFragmentData okExistingProfileFragmentData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        tqf0 tqf0Var = new tqf0(0);
        bVar.getClass();
        com.vk.registration.funnels.b.a(tqf0Var);
        G(K().b(), "KEY_OK_MIMICRY_EXISTING_PROFILE", K().i(), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void a1(String str, VkAuthCredentials vkAuthCredentials, VkPassportPage vkPassportPage, UtilityTokens utilityTokens) {
        P(str, vkAuthCredentials, vkPassportPage, utilityTokens);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public void b(String str) {
        new m2q0(str, new kcu0(SchemeStatSak$EventScreen.HAVE_ACCOUNT_SUPPORT, true)).a(this.a);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void d(ConsciousRegistrationScreenData consciousRegistrationScreenData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.REGISTRATION_NEW_ACCOUNT, null, null, null, 30);
        G(new ymu0(), "CONSCIOUS_REGISTRATION", ymu0.a.a(consciousRegistrationScreenData), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void e(VkCheckAccessRequiredData vkCheckAccessRequiredData) {
        Bundle a2 = p1c.a(vkCheckAccessRequiredData);
        H(vkCheckAccessRequiredData.c ? new b.a(new n6k0(), "VALIDATE", a2, false, 120) : new b.a(new k6k0(), "VALIDATE", a2, false, 56));
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void f(OkItsMeFragmentData okItsMeFragmentData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD_OK, null, null, null, 30);
        G(K().l(), "KEY_OK_MIMICRY_ITS_ME", K().a(), false, true, false, false);
    }

    @Override // com.vk.auth.main.b
    public final void g1(BanInfo banInfo) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
        bVar.getClass();
        com.vk.registration.funnels.b.a(new by20(L, 25));
        I(E(), false);
        M(banInfo);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void h(VerificationScreenData.Email email) {
        G(new ecp(), "VALIDATE", ecp.a.a(email, email.d), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void i(LibverifyScreenData libverifyScreenData) {
        G(new z2z(), "VALIDATE", z2z.a.a(this.a, libverifyScreenData), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public void j(Fragment fragment, boolean z) {
        Toast.makeText(this.a, "Not supported", 1).show();
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void k(VerificationScreenData verificationScreenData, VerificationStatStartedFromReg verificationStatStartedFromReg, boolean z) {
        CodeState c;
        CodeState c2;
        boolean z2 = verificationScreenData.g;
        VkAuthValidatePhoneResult vkAuthValidatePhoneResult = verificationScreenData.f;
        VkAuthValidatePhoneResult.ValidationType Bb = vkAuthValidatePhoneResult != null ? vkAuthValidatePhoneResult.Bb() : null;
        if ((Bb == null ? -1 : a.$EnumSwitchMapping$0[Bb.ordinal()]) != 1) {
            c = ezf.c(verificationScreenData.f, new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
            G(new OTPCheckFragment(), "VALIDATE", z2 ? OTPCheckFragment.a.b(verificationScreenData, verificationScreenData.d, c, z) : OTPCheckFragment.a.c(verificationScreenData, verificationScreenData.d, c, verificationStatStartedFromReg, z), false, true, false, false);
        } else {
            CheckPresenterInfo passwordLessAuth = z2 ? new CheckPresenterInfo.PasswordLessAuth(verificationScreenData, z) : new CheckPresenterInfo.SignUp(verificationScreenData, verificationStatStartedFromReg, z);
            c2 = ezf.c(verificationScreenData.f, new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
            H(b.C(verificationScreenData.d, passwordLessAuth, c2));
        }
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void l(VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo) {
        LibverifyScreenData libverifyScreenData = vkValidatePhoneRouterInfo.e;
        if (libverifyScreenData != null) {
            i(libverifyScreenData);
        } else {
            SignUpRouter.a.b(this, vkValidatePhoneRouterInfo.c, vkValidatePhoneRouterInfo.h, 2);
        }
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void m(EnterProfileScreenData enterProfileScreenData) {
        if (enterProfileScreenData.zb()) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
            bVar.getClass();
            com.vk.registration.funnels.b.a(new tju(L, 24));
        } else {
            com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L2 = L();
            bVar2.getClass();
            com.vk.registration.funnels.b.a(new yu60(L2, 16));
        }
        kpp kppVar = opp.T;
        G(new opp(), "ENTER_PROFILE", opp.a.a(enterProfileScreenData), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void o(List<String> list, VkidokStartRegistrationResponseDto vkidokStartRegistrationResponseDto) {
        if (list.isEmpty()) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.REGISTRATION_PHONE, null, null, null, 30);
            G(K().h(), "KEY_OK_MIMICRY_PHONE_INPUT", K().g(), false, true, false, false);
            return;
        }
        com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
        bVar2.getClass();
        com.vk.registration.funnels.b.z(bVar2, SchemeStatSak$EventScreen.REGISTRATION_PERMISSION, null, null, null, 30);
        G(K().e(), "KEY_OK_MIMICRY_PERMISSIONS", K().f(), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void p(boolean z) {
        if (z) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
            bVar.getClass();
            com.vk.registration.funnels.b.a(new c950(L, 25));
        } else {
            com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L2 = L();
            bVar2.getClass();
            com.vk.registration.funnels.b.a(new kr50(L2, 22));
        }
        G(new zop(), "ENTER_PASSWORD", zop.a.a(z), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void q(CreatePasswordFragmentData createPasswordFragmentData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
        bVar.getClass();
        com.vk.registration.funnels.b.a(new kr50(L, 22));
        G(K().c(), "KEY_OK_MIMICRY_PASSWORD", K().k(), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void r(String str, Country country, String str2, VkAuthMetaInfo vkAuthMetaInfo) {
        if ((vkAuthMetaInfo != null ? vkAuthMetaInfo.c : null) != null) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.OAUTH_REGISTRATION_PHONE, null, null, null, 30);
        } else {
            com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
            bVar2.getClass();
            com.vk.registration.funnels.b.z(bVar2, SchemeStatSak$EventScreen.REGISTRATION_PHONE, null, null, null, 30);
        }
        N(str, country, str2, vkAuthMetaInfo);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void s(BindEnteredEmailArgs bindEnteredEmailArgs) {
        G(new a37(), "VALIDATE", a37.a.a(bindEnteredEmailArgs), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void t(VkExistingProfileScreenData vkExistingProfileScreenData) {
        if (vkExistingProfileScreenData.zb()) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
            bVar.getClass();
            com.vk.registration.funnels.b.a(new e550(L, 20));
        } else {
            com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
            ArrayList<SchemeStatSak$RegistrationFieldItem> L2 = L();
            bVar2.getClass();
            com.vk.registration.funnels.b.a(new rka0(L2, 12));
        }
        Bundle a2 = ed6.a.a(vkExistingProfileScreenData);
        H(vkExistingProfileScreenData.zb() ? new b.a(new u4q(), "EXISTING_PROFILE", a2, false, 120) : new b.a(new v4q(), "EXISTING_PROFILE", a2, false, 120));
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void u(PasswordCheckInitStructure passwordCheckInitStructure) {
        G(new CheckAccessBottomSheetFragment(), "VALIDATE", CheckAccessBottomSheetFragment.a.a(passwordCheckInitStructure), false, true, false, false);
    }

    @Override // com.vk.auth.main.SignUpRouter
    public final void v(VKIDItsMeFragmentData vKIDItsMeFragmentData) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        ArrayList<SchemeStatSak$RegistrationFieldItem> L = L();
        bVar.getClass();
        com.vk.registration.funnels.b.a(new rka0(L, 12));
        G(K().j(), "KEY_OK_MIMICRY_VKID_ITS_ME", K().d(), false, true, false, false);
    }
}
