package com.vk.auth.main;

import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.vkidok.dto.VkidokStartRegistrationResponseDto;
import com.vk.auth.VkValidatePhoneRouterInfo;
import com.vk.auth.enteremail.binding.BindEnteredEmailArgs;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.screendata.ConsciousRegistrationScreenData;
import com.vk.auth.screendata.EnterProfileScreenData;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.auth.verification.base.stats.VerificationStatStartedFromReg;
import com.vk.auth.verification.checkaccess.VkCheckAccessRequiredData;
import com.vk.odnoklassniki.registration.data.CreatePasswordFragmentData;
import com.vk.odnoklassniki.registration.data.OkExistingProfileFragmentData;
import com.vk.odnoklassniki.registration.data.OkItsMeFragmentData;
import com.vk.odnoklassniki.registration.data.VKIDItsMeFragmentData;
import com.vk.superapp.core.api.models.SignUpField;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptySet;
import xsna.asp;
import xsna.rl3;
import xsna.zrp;

/* compiled from: SignUpRouter.kt */
/* loaded from: classes.dex */
public interface SignUpRouter extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SignUpRouter.kt */
    public static final class DataScreen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DataScreen[] $VALUES;
        public static final DataScreen AGREEMENT;
        public static final a Companion;
        public static final DataScreen EMAIL;
        public static final DataScreen NAME;
        public static final DataScreen PASSWORD;
        public static final DataScreen PHONE;
        private final Collection<SignUpField> fields;

        /* compiled from: SignUpRouter.kt */
        public static final class a {
        }

        static {
            EmptySet emptySet = EmptySet.b;
            DataScreen dataScreen = new DataScreen(0, "AGREEMENT", emptySet);
            AGREEMENT = dataScreen;
            DataScreen dataScreen2 = new DataScreen(1, "PHONE", emptySet);
            PHONE = dataScreen2;
            DataScreen dataScreen3 = new DataScreen(2, "NAME", rl3.y0(new SignUpField[]{SignUpField.NAME, SignUpField.FIRST_LAST_NAME, SignUpField.AVATAR, SignUpField.GENDER, SignUpField.BIRTHDAY}));
            NAME = dataScreen3;
            DataScreen dataScreen4 = new DataScreen(3, "PASSWORD", Collections.singleton(SignUpField.PASSWORD));
            PASSWORD = dataScreen4;
            DataScreen dataScreen5 = new DataScreen(4, CommonConstant.RETKEY.EMAIL, Collections.singleton(SignUpField.EMAIL));
            EMAIL = dataScreen5;
            DataScreen[] dataScreenArr = {dataScreen, dataScreen2, dataScreen3, dataScreen4, dataScreen5};
            $VALUES = dataScreenArr;
            $ENTRIES = new asp(dataScreenArr);
            Companion = new a();
        }

        public DataScreen(int i, String str, Collection collection) {
            this.fields = collection;
        }

        public static DataScreen valueOf(String str) {
            return (DataScreen) Enum.valueOf(DataScreen.class, str);
        }

        public static DataScreen[] values() {
            return (DataScreen[]) $VALUES.clone();
        }

        public final Collection<SignUpField> h() {
            return this.fields;
        }
    }

    /* compiled from: SignUpRouter.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public static /* synthetic */ void a(SignUpRouter signUpRouter, String str, Country country, String str2, VkAuthMetaInfo vkAuthMetaInfo, int i) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                country = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                vkAuthMetaInfo = null;
            }
            signUpRouter.r(str, country, str2, vkAuthMetaInfo);
        }

        public static /* synthetic */ void b(SignUpRouter signUpRouter, VerificationScreenData verificationScreenData, boolean z, int i) {
            VerificationStatStartedFromReg verificationStatStartedFromReg = new VerificationStatStartedFromReg(true);
            if ((i & 4) != 0) {
                z = false;
            }
            signUpRouter.k(verificationScreenData, verificationStatStartedFromReg, z);
        }
    }

    void a(OkExistingProfileFragmentData okExistingProfileFragmentData);

    void b(String str);

    void d(ConsciousRegistrationScreenData consciousRegistrationScreenData);

    void e(VkCheckAccessRequiredData vkCheckAccessRequiredData);

    void f(OkItsMeFragmentData okItsMeFragmentData);

    void h(VerificationScreenData.Email email);

    void i(LibverifyScreenData libverifyScreenData);

    void j(Fragment fragment, boolean z);

    void k(VerificationScreenData verificationScreenData, VerificationStatStartedFromReg verificationStatStartedFromReg, boolean z);

    void l(VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo);

    void m(EnterProfileScreenData enterProfileScreenData);

    void o(List<String> list, VkidokStartRegistrationResponseDto vkidokStartRegistrationResponseDto);

    void p(boolean z);

    void q(CreatePasswordFragmentData createPasswordFragmentData);

    void r(String str, Country country, String str2, VkAuthMetaInfo vkAuthMetaInfo);

    void s(BindEnteredEmailArgs bindEnteredEmailArgs);

    void t(VkExistingProfileScreenData vkExistingProfileScreenData);

    void u(PasswordCheckInitStructure passwordCheckInitStructure);

    void v(VKIDItsMeFragmentData vKIDItsMeFragmentData);
}
