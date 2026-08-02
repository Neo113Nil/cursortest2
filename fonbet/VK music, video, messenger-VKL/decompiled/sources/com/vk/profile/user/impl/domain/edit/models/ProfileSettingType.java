package com.vk.profile.user.impl.domain.edit.models;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileSettingType.kt */
/* loaded from: classes5.dex */
public final class ProfileSettingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProfileSettingType[] $VALUES;
    public static final ProfileSettingType Career;
    public static final ProfileSettingType Contacts;
    public static final ProfileSettingType Education;
    public static final ProfileSettingType Interests;
    public static final ProfileSettingType Military;
    public static final ProfileSettingType Personal;
    public static final ProfileSettingType PersonalAccount;
    public static final ProfileSettingType Profile;
    public static final ProfileSettingType Security;
    private final int res;

    static {
        ProfileSettingType profileSettingType = new ProfileSettingType("PersonalAccount", 0, R.string.user_profile_edit_personal_account);
        PersonalAccount = profileSettingType;
        ProfileSettingType profileSettingType2 = new ProfileSettingType("Security", 1, R.string.user_profile_edit_security);
        Security = profileSettingType2;
        ProfileSettingType profileSettingType3 = new ProfileSettingType("Profile", 2, R.string.user_profile_edit_profile);
        Profile = profileSettingType3;
        ProfileSettingType profileSettingType4 = new ProfileSettingType("Contacts", 3, R.string.user_profile_edit_contacts);
        Contacts = profileSettingType4;
        ProfileSettingType profileSettingType5 = new ProfileSettingType("Interests", 4, R.string.user_profile_edit_interests);
        Interests = profileSettingType5;
        ProfileSettingType profileSettingType6 = new ProfileSettingType("Education", 5, R.string.user_profile_edit_education);
        Education = profileSettingType6;
        ProfileSettingType profileSettingType7 = new ProfileSettingType("Career", 6, R.string.user_profile_edit_career);
        Career = profileSettingType7;
        ProfileSettingType profileSettingType8 = new ProfileSettingType("Military", 7, R.string.user_profile_edit_military);
        Military = profileSettingType8;
        ProfileSettingType profileSettingType9 = new ProfileSettingType("Personal", 8, R.string.user_profile_edit_personal);
        Personal = profileSettingType9;
        ProfileSettingType[] profileSettingTypeArr = {profileSettingType, profileSettingType2, profileSettingType3, profileSettingType4, profileSettingType5, profileSettingType6, profileSettingType7, profileSettingType8, profileSettingType9};
        $VALUES = profileSettingTypeArr;
        $ENTRIES = new asp(profileSettingTypeArr);
    }

    public ProfileSettingType(String str, int i, int i2) {
        this.res = i2;
    }

    public static ProfileSettingType valueOf(String str) {
        return (ProfileSettingType) Enum.valueOf(ProfileSettingType.class, str);
    }

    public static ProfileSettingType[] values() {
        return (ProfileSettingType[]) $VALUES.clone();
    }

    public final int h() {
        return this.res;
    }
}
