package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AccountGetPrivacySettingsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetPrivacySettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetPrivacySettingsResponseDto> CREATOR = new a();

    @pmi0("profile_questions")
    private final AccountPrivacyProfileQuestionsDto profileQuestions;

    @pmi0("recommended_closed_profile_settings")
    private final List<String> recommendedClosedProfileSettings;

    @pmi0("sections")
    private final List<AccountPrivacySectionDto> sections;

    @pmi0("settings")
    private final List<AccountPrivacySettingsDto> settings;

    @pmi0("story_privacy_is_deprecated_options_disabled")
    private final boolean storyPrivacyIsDeprecatedOptionsDisabled;

    @pmi0("supported_categories")
    private final List<AccountPrivacyCategoryDto> supportedCategories;

    /* compiled from: AccountGetPrivacySettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetPrivacySettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetPrivacySettingsResponseDto createFromParcel(Parcel parcel) {
            boolean z;
            int i;
            AccountPrivacyProfileQuestionsDto accountPrivacyProfileQuestionsDto;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 == readInt) {
                    break;
                }
                i3 = bo.b(AccountGetPrivacySettingsResponseDto.class, parcel, arrayList2, i3, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i4 = 0;
            while (i4 != readInt2) {
                i4 = en.a(AccountPrivacySectionDto.CREATOR, parcel, arrayList3, i4, 1);
            }
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            if (parcel.readInt() == 0) {
                accountPrivacyProfileQuestionsDto = null;
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i2 != readInt3) {
                    i2 = en.a(AccountPrivacyCategoryDto.CREATOR, parcel, arrayList4, i2, i);
                }
                accountPrivacyProfileQuestionsDto = null;
                arrayList = arrayList4;
            }
            return new AccountGetPrivacySettingsResponseDto(arrayList2, arrayList3, z, arrayList, parcel.createStringArrayList(), parcel.readInt() == 0 ? accountPrivacyProfileQuestionsDto : AccountPrivacyProfileQuestionsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetPrivacySettingsResponseDto[] newArray(int i) {
            return new AccountGetPrivacySettingsResponseDto[i];
        }
    }

    public AccountGetPrivacySettingsResponseDto(List<AccountPrivacySettingsDto> list, List<AccountPrivacySectionDto> list2, boolean z, List<AccountPrivacyCategoryDto> list3, List<String> list4, AccountPrivacyProfileQuestionsDto accountPrivacyProfileQuestionsDto) {
        this.settings = list;
        this.sections = list2;
        this.storyPrivacyIsDeprecatedOptionsDisabled = z;
        this.supportedCategories = list3;
        this.recommendedClosedProfileSettings = list4;
        this.profileQuestions = accountPrivacyProfileQuestionsDto;
    }

    public final List<AccountPrivacySettingsDto> d() {
        return this.settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.storyPrivacyIsDeprecatedOptionsDisabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetPrivacySettingsResponseDto)) {
            return false;
        }
        AccountGetPrivacySettingsResponseDto accountGetPrivacySettingsResponseDto = (AccountGetPrivacySettingsResponseDto) obj;
        return epx.f(this.settings, accountGetPrivacySettingsResponseDto.settings) && epx.f(this.sections, accountGetPrivacySettingsResponseDto.sections) && this.storyPrivacyIsDeprecatedOptionsDisabled == accountGetPrivacySettingsResponseDto.storyPrivacyIsDeprecatedOptionsDisabled && epx.f(this.supportedCategories, accountGetPrivacySettingsResponseDto.supportedCategories) && epx.f(this.recommendedClosedProfileSettings, accountGetPrivacySettingsResponseDto.recommendedClosedProfileSettings) && epx.f(this.profileQuestions, accountGetPrivacySettingsResponseDto.profileQuestions);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(this.settings.hashCode() * 31, 31, this.sections), 31, this.storyPrivacyIsDeprecatedOptionsDisabled);
        List<AccountPrivacyCategoryDto> list = this.supportedCategories;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.recommendedClosedProfileSettings;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AccountPrivacyProfileQuestionsDto accountPrivacyProfileQuestionsDto = this.profileQuestions;
        return hashCode2 + (accountPrivacyProfileQuestionsDto != null ? accountPrivacyProfileQuestionsDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountGetPrivacySettingsResponseDto(settings=" + this.settings + ", sections=" + this.sections + ", storyPrivacyIsDeprecatedOptionsDisabled=" + this.storyPrivacyIsDeprecatedOptionsDisabled + ", supportedCategories=" + this.supportedCategories + ", recommendedClosedProfileSettings=" + this.recommendedClosedProfileSettings + ", profileQuestions=" + this.profileQuestions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.settings);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.sections);
        while (a3.hasNext()) {
            ((AccountPrivacySectionDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.storyPrivacyIsDeprecatedOptionsDisabled ? 1 : 0);
        List<AccountPrivacyCategoryDto> list = this.supportedCategories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AccountPrivacyCategoryDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.recommendedClosedProfileSettings);
        AccountPrivacyProfileQuestionsDto accountPrivacyProfileQuestionsDto = this.profileQuestions;
        if (accountPrivacyProfileQuestionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountPrivacyProfileQuestionsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AccountGetPrivacySettingsResponseDto(List list, List list2, boolean z, List list3, List list4, AccountPrivacyProfileQuestionsDto accountPrivacyProfileQuestionsDto, int i, zcl zclVar) {
        this(list, list2, z, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : accountPrivacyProfileQuestionsDto);
    }
}
