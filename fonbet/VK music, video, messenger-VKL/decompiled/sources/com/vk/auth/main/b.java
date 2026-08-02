package com.vk.auth.main;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.init.choose.ChooseProfileData;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.MultiAccountData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.utils.VkPassportPage;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vk.whitelabelauth.di.data.WhiteLabelAuthData;
import java.util.List;
import xsna.pin0;

/* compiled from: AuthRouter.kt */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: AuthRouter.kt */
    public static final class a {
        public static /* synthetic */ void a(b bVar, boolean z, boolean z2, String str, int i) {
            if ((i & 2) != 0) {
                z2 = !z;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            bVar.U0(str, z, z2);
        }
    }

    FragmentActivity B0();

    void C0(CreateVkEmailRequiredData createVkEmailRequiredData);

    void D0(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo);

    void E0(String str, String str2, String str3, boolean z, CodeState codeState, boolean z2);

    void F0(String str, VkAuthState vkAuthState);

    void G0(MultiAccountData multiAccountData);

    void H0(String str, String str2);

    void I0(PasskeyCheckInfo passkeyCheckInfo);

    void J0(VerificationScreenData verificationScreenData, VerificationMethodState verificationMethodState);

    void K0(String str, boolean z);

    void L0(String str);

    void M0();

    void N0(int i);

    void O0(String str, VkAuthState vkAuthState);

    void P0(LibverifyScreenData.Auth auth);

    void Q0();

    void R0(boolean z);

    void S0(RestoreReason restoreReason);

    void T0(FullscreenPasswordData fullscreenPasswordData, boolean z);

    void U0(String str, boolean z, boolean z2);

    void V0(List<Object> list);

    void W0(String str, VkAuthState vkAuthState, String str2, CodeState codeState, String str3, boolean z);

    void X0(pin0.a aVar);

    void Y0(WhiteLabelAuthData whiteLabelAuthData);

    void Z0(String str, VkAuthCredentials vkAuthCredentials, UtilityTokens utilityTokens);

    void a1(String str, VkAuthCredentials vkAuthCredentials, VkPassportPage vkPassportPage, UtilityTokens utilityTokens);

    void b1(FullscreenPasswordData fullscreenPasswordData);

    void c();

    void c1(ChooseProfileData chooseProfileData);

    void d1(VkAuthState vkAuthState, SendOtpInfo sendOtpInfo, ValidateInfo validateInfo);

    void e1(SignUpAgreementInfo signUpAgreementInfo);

    void f1(LibverifyScreenData.MethodSelectorAuth methodSelectorAuth);

    void g1(BanInfo banInfo);

    void h1(PhoneValidationPendingEvent phoneValidationPendingEvent);
}
