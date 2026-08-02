package com.vk.dto.profile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfilePrivacy.kt */
/* loaded from: classes18.dex */
public final class ProfilePrivacy$Category {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProfilePrivacy$Category[] $VALUES;
    public static final ProfilePrivacy$Category ALL;
    public static final ProfilePrivacy$Category ONLY_ME;
    public static final ProfilePrivacy$Category SOME;

    static {
        ProfilePrivacy$Category profilePrivacy$Category = new ProfilePrivacy$Category("ONLY_ME", 0);
        ONLY_ME = profilePrivacy$Category;
        ProfilePrivacy$Category profilePrivacy$Category2 = new ProfilePrivacy$Category("SOME", 1);
        SOME = profilePrivacy$Category2;
        ProfilePrivacy$Category profilePrivacy$Category3 = new ProfilePrivacy$Category("ALL", 2);
        ALL = profilePrivacy$Category3;
        ProfilePrivacy$Category[] profilePrivacy$CategoryArr = {profilePrivacy$Category, profilePrivacy$Category2, profilePrivacy$Category3};
        $VALUES = profilePrivacy$CategoryArr;
        $ENTRIES = new asp(profilePrivacy$CategoryArr);
    }

    public ProfilePrivacy$Category() {
        throw null;
    }

    public static ProfilePrivacy$Category valueOf(String str) {
        return (ProfilePrivacy$Category) Enum.valueOf(ProfilePrivacy$Category.class, str);
    }

    public static ProfilePrivacy$Category[] values() {
        return (ProfilePrivacy$Category[]) $VALUES.clone();
    }
}
