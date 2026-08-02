package com.vk.api.generated.privacy.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivacyCategoryDto.kt */
/* loaded from: classes15.dex */
public final class PrivacyCategoryDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PrivacyCategoryDto[] $VALUES;

    @pmi0("all")
    public static final PrivacyCategoryDto ALL;

    @pmi0("any")
    public static final PrivacyCategoryDto ANY;

    @pmi0("best_friends")
    public static final PrivacyCategoryDto BEST_FRIENDS;

    @pmi0("by_link")
    public static final PrivacyCategoryDto BY_LINK;
    public static final Parcelable.Creator<PrivacyCategoryDto> CREATOR;

    @pmi0("donut")
    public static final PrivacyCategoryDto DONUT;

    @pmi0("editors")
    public static final PrivacyCategoryDto EDITORS;

    @pmi0("friends")
    public static final PrivacyCategoryDto FRIENDS;

    @pmi0("friends_and_contacts")
    public static final PrivacyCategoryDto FRIENDS_AND_CONTACTS;

    @pmi0("friends_of_friends")
    public static final PrivacyCategoryDto FRIENDS_OF_FRIENDS;

    @pmi0("friends_of_friends_only")
    public static final PrivacyCategoryDto FRIENDS_OF_FRIENDS_ONLY;

    @pmi0("hidden_friends_only")
    public static final PrivacyCategoryDto HIDDEN_FRIENDS_ONLY;

    @pmi0("list28")
    public static final PrivacyCategoryDto LIST28;

    @pmi0("members")
    public static final PrivacyCategoryDto MEMBERS;

    @pmi0("nobody")
    public static final PrivacyCategoryDto NOBODY;

    @pmi0("none")
    public static final PrivacyCategoryDto NONE;

    @pmi0("not_published")
    public static final PrivacyCategoryDto NOT_PUBLISHED;

    @pmi0("only_me")
    public static final PrivacyCategoryDto ONLY_ME;

    @pmi0("see_all_friends")
    public static final PrivacyCategoryDto SEE_ALL_FRIENDS;

    @pmi0("some")
    public static final PrivacyCategoryDto SOME;
    private final String value;

    /* compiled from: PrivacyCategoryDto.kt */
    public static final class a implements Parcelable.Creator<PrivacyCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final PrivacyCategoryDto createFromParcel(Parcel parcel) {
            return PrivacyCategoryDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacyCategoryDto[] newArray(int i) {
            return new PrivacyCategoryDto[i];
        }
    }

    static {
        PrivacyCategoryDto privacyCategoryDto = new PrivacyCategoryDto("ANY", 0, "any");
        ANY = privacyCategoryDto;
        PrivacyCategoryDto privacyCategoryDto2 = new PrivacyCategoryDto("ALL", 1, "all");
        ALL = privacyCategoryDto2;
        PrivacyCategoryDto privacyCategoryDto3 = new PrivacyCategoryDto(Privacy.FRIENDS, 2, "friends");
        FRIENDS = privacyCategoryDto3;
        PrivacyCategoryDto privacyCategoryDto4 = new PrivacyCategoryDto("FRIENDS_AND_CONTACTS", 3, "friends_and_contacts");
        FRIENDS_AND_CONTACTS = privacyCategoryDto4;
        PrivacyCategoryDto privacyCategoryDto5 = new PrivacyCategoryDto("FRIENDS_OF_FRIENDS_ONLY", 4, "friends_of_friends_only");
        FRIENDS_OF_FRIENDS_ONLY = privacyCategoryDto5;
        PrivacyCategoryDto privacyCategoryDto6 = new PrivacyCategoryDto("FRIENDS_OF_FRIENDS", 5, "friends_of_friends");
        FRIENDS_OF_FRIENDS = privacyCategoryDto6;
        PrivacyCategoryDto privacyCategoryDto7 = new PrivacyCategoryDto("HIDDEN_FRIENDS_ONLY", 6, "hidden_friends_only");
        HIDDEN_FRIENDS_ONLY = privacyCategoryDto7;
        PrivacyCategoryDto privacyCategoryDto8 = new PrivacyCategoryDto("SEE_ALL_FRIENDS", 7, "see_all_friends");
        SEE_ALL_FRIENDS = privacyCategoryDto8;
        PrivacyCategoryDto privacyCategoryDto9 = new PrivacyCategoryDto("ONLY_ME", 8, "only_me");
        ONLY_ME = privacyCategoryDto9;
        PrivacyCategoryDto privacyCategoryDto10 = new PrivacyCategoryDto("SOME", 9, "some");
        SOME = privacyCategoryDto10;
        PrivacyCategoryDto privacyCategoryDto11 = new PrivacyCategoryDto("NOBODY", 10, "nobody");
        NOBODY = privacyCategoryDto11;
        PrivacyCategoryDto privacyCategoryDto12 = new PrivacyCategoryDto("NONE", 11, "none");
        NONE = privacyCategoryDto12;
        PrivacyCategoryDto privacyCategoryDto13 = new PrivacyCategoryDto("NOT_PUBLISHED", 12, "not_published");
        NOT_PUBLISHED = privacyCategoryDto13;
        PrivacyCategoryDto privacyCategoryDto14 = new PrivacyCategoryDto("MEMBERS", 13, "members");
        MEMBERS = privacyCategoryDto14;
        PrivacyCategoryDto privacyCategoryDto15 = new PrivacyCategoryDto("EDITORS", 14, "editors");
        EDITORS = privacyCategoryDto15;
        PrivacyCategoryDto privacyCategoryDto16 = new PrivacyCategoryDto("BY_LINK", 15, "by_link");
        BY_LINK = privacyCategoryDto16;
        PrivacyCategoryDto privacyCategoryDto17 = new PrivacyCategoryDto("DONUT", 16, "donut");
        DONUT = privacyCategoryDto17;
        PrivacyCategoryDto privacyCategoryDto18 = new PrivacyCategoryDto("LIST28", 17, "list28");
        LIST28 = privacyCategoryDto18;
        PrivacyCategoryDto privacyCategoryDto19 = new PrivacyCategoryDto("BEST_FRIENDS", 18, "best_friends");
        BEST_FRIENDS = privacyCategoryDto19;
        PrivacyCategoryDto[] privacyCategoryDtoArr = {privacyCategoryDto, privacyCategoryDto2, privacyCategoryDto3, privacyCategoryDto4, privacyCategoryDto5, privacyCategoryDto6, privacyCategoryDto7, privacyCategoryDto8, privacyCategoryDto9, privacyCategoryDto10, privacyCategoryDto11, privacyCategoryDto12, privacyCategoryDto13, privacyCategoryDto14, privacyCategoryDto15, privacyCategoryDto16, privacyCategoryDto17, privacyCategoryDto18, privacyCategoryDto19};
        $VALUES = privacyCategoryDtoArr;
        $ENTRIES = new asp(privacyCategoryDtoArr);
        CREATOR = new a();
    }

    private PrivacyCategoryDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PrivacyCategoryDto valueOf(String str) {
        return (PrivacyCategoryDto) Enum.valueOf(PrivacyCategoryDto.class, str);
    }

    public static PrivacyCategoryDto[] values() {
        return (PrivacyCategoryDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
