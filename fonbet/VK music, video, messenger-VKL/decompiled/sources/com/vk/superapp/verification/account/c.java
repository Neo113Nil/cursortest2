package com.vk.superapp.verification.account;

import android.content.Context;
import com.vk.api.generated.accountVerification.dto.AccountVerificationVerificationUserInfoDto;
import com.vk.api.generated.esia.dto.EsiaEsiaUserInfoDto;
import com.vk.superapp.verification.account.b;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Locale;
import xsna.rl3;

/* compiled from: VkVerificationAccountDataMapper.kt */
/* loaded from: classes6.dex */
public final class c {
    public final Context a;

    /* compiled from: VkVerificationAccountDataMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EsiaEsiaUserInfoDto.SexDto.values().length];
            try {
                iArr[EsiaEsiaUserInfoDto.SexDto.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EsiaEsiaUserInfoDto.SexDto.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EsiaEsiaUserInfoDto.SexDto.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountVerificationVerificationUserInfoDto.SexDto.values().length];
            try {
                iArr2[AccountVerificationVerificationUserInfoDto.SexDto.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountVerificationVerificationUserInfoDto.SexDto.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountVerificationVerificationUserInfoDto.SexDto.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public c(Context context) {
        this.a = context;
    }

    public static b.f c(int i, String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new b.f(str, i, str2, str3);
    }

    public final String a(AccountVerificationVerificationUserInfoDto.SexDto sexDto) {
        int i = sexDto == null ? -1 : a.$EnumSwitchMapping$1[sexDto.ordinal()];
        Context context = this.a;
        String string = i != 1 ? i != 2 ? i != 3 ? null : "" : context.getString(R.string.vk_verification_account_gender_male) : context.getString(R.string.vk_verification_account_gender_female);
        if (string != null) {
            return string.toLowerCase(Locale.ROOT);
        }
        return null;
    }

    public final String b(EsiaEsiaUserInfoDto.SexDto sexDto) {
        int i = sexDto == null ? -1 : a.$EnumSwitchMapping$0[sexDto.ordinal()];
        Context context = this.a;
        String string = i != 1 ? i != 2 ? i != 3 ? null : "" : context.getString(R.string.vk_verification_account_gender_male) : context.getString(R.string.vk_verification_account_gender_female);
        if (string != null) {
            return string.toLowerCase(Locale.ROOT);
        }
        return null;
    }

    public final List<b.f> d(EsiaEsiaUserInfoDto esiaEsiaUserInfoDto, EsiaEsiaUserInfoDto esiaEsiaUserInfoDto2) {
        return rl3.I(new b.f[]{c(R.string.vk_auth_sign_up_first_name, esiaEsiaUserInfoDto2 != null ? esiaEsiaUserInfoDto2.e() : null, esiaEsiaUserInfoDto.e(), "first_name"), c(R.string.vk_auth_sign_up_last_name, esiaEsiaUserInfoDto2 != null ? esiaEsiaUserInfoDto2.f() : null, esiaEsiaUserInfoDto.f(), "last_name"), c(R.string.vk_verification_account_middle_name, esiaEsiaUserInfoDto2 != null ? esiaEsiaUserInfoDto2.g() : null, esiaEsiaUserInfoDto.g(), "middle_name"), c(R.string.vk_verification_account_birthday, esiaEsiaUserInfoDto2 != null ? esiaEsiaUserInfoDto2.d() : null, esiaEsiaUserInfoDto.d(), "dob"), c(R.string.vk_verification_account_phone_number, esiaEsiaUserInfoDto2 != null ? esiaEsiaUserInfoDto2.i() : null, esiaEsiaUserInfoDto.i(), "phone"), c(R.string.vk_verification_account_sex, b(esiaEsiaUserInfoDto2 != null ? esiaEsiaUserInfoDto2.j() : null), b(esiaEsiaUserInfoDto.j()), "sex")});
    }
}
