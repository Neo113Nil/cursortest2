package com.vk.api.generated.tabbar.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabbarItemNameDto.kt */
/* loaded from: classes15.dex */
public final class TabbarItemNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TabbarItemNameDto[] $VALUES;

    @pmi0("clips")
    public static final TabbarItemNameDto CLIPS;
    public static final Parcelable.Creator<TabbarItemNameDto> CREATOR;

    @pmi0("empty")
    public static final TabbarItemNameDto EMPTY;

    @pmi0("friends")
    public static final TabbarItemNameDto FRIENDS;

    @pmi0("games")
    public static final TabbarItemNameDto GAMES;

    @pmi0("groups")
    public static final TabbarItemNameDto GROUPS;

    @pmi0("home")
    public static final TabbarItemNameDto HOME;

    @pmi0("hub")
    public static final TabbarItemNameDto HUB;

    @pmi0("im")
    public static final TabbarItemNameDto IM;

    @pmi0("managed_group")
    public static final TabbarItemNameDto MANAGED_GROUP;

    @pmi0("music")
    public static final TabbarItemNameDto MUSIC;

    @pmi0("overview")
    public static final TabbarItemNameDto OVERVIEW;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final TabbarItemNameDto PROFILE;

    @pmi0("video")
    public static final TabbarItemNameDto VIDEO;
    private final String value;

    /* compiled from: TabbarItemNameDto.kt */
    public static final class a implements Parcelable.Creator<TabbarItemNameDto> {
        @Override // android.os.Parcelable.Creator
        public final TabbarItemNameDto createFromParcel(Parcel parcel) {
            return TabbarItemNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TabbarItemNameDto[] newArray(int i) {
            return new TabbarItemNameDto[i];
        }
    }

    static {
        TabbarItemNameDto tabbarItemNameDto = new TabbarItemNameDto("HOME", 0, "home");
        HOME = tabbarItemNameDto;
        TabbarItemNameDto tabbarItemNameDto2 = new TabbarItemNameDto("IM", 1, "im");
        IM = tabbarItemNameDto2;
        TabbarItemNameDto tabbarItemNameDto3 = new TabbarItemNameDto("HUB", 2, "hub");
        HUB = tabbarItemNameDto3;
        TabbarItemNameDto tabbarItemNameDto4 = new TabbarItemNameDto("OVERVIEW", 3, "overview");
        OVERVIEW = tabbarItemNameDto4;
        TabbarItemNameDto tabbarItemNameDto5 = new TabbarItemNameDto("PROFILE", 4, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = tabbarItemNameDto5;
        TabbarItemNameDto tabbarItemNameDto6 = new TabbarItemNameDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 5, "video");
        VIDEO = tabbarItemNameDto6;
        TabbarItemNameDto tabbarItemNameDto7 = new TabbarItemNameDto("CLIPS", 6, "clips");
        CLIPS = tabbarItemNameDto7;
        TabbarItemNameDto tabbarItemNameDto8 = new TabbarItemNameDto(Privacy.FRIENDS, 7, "friends");
        FRIENDS = tabbarItemNameDto8;
        TabbarItemNameDto tabbarItemNameDto9 = new TabbarItemNameDto("GROUPS", 8, "groups");
        GROUPS = tabbarItemNameDto9;
        TabbarItemNameDto tabbarItemNameDto10 = new TabbarItemNameDto("MUSIC", 9, "music");
        MUSIC = tabbarItemNameDto10;
        TabbarItemNameDto tabbarItemNameDto11 = new TabbarItemNameDto("GAMES", 10, "games");
        GAMES = tabbarItemNameDto11;
        TabbarItemNameDto tabbarItemNameDto12 = new TabbarItemNameDto("EMPTY", 11, "empty");
        EMPTY = tabbarItemNameDto12;
        TabbarItemNameDto tabbarItemNameDto13 = new TabbarItemNameDto("MANAGED_GROUP", 12, "managed_group");
        MANAGED_GROUP = tabbarItemNameDto13;
        TabbarItemNameDto[] tabbarItemNameDtoArr = {tabbarItemNameDto, tabbarItemNameDto2, tabbarItemNameDto3, tabbarItemNameDto4, tabbarItemNameDto5, tabbarItemNameDto6, tabbarItemNameDto7, tabbarItemNameDto8, tabbarItemNameDto9, tabbarItemNameDto10, tabbarItemNameDto11, tabbarItemNameDto12, tabbarItemNameDto13};
        $VALUES = tabbarItemNameDtoArr;
        $ENTRIES = new asp(tabbarItemNameDtoArr);
        CREATOR = new a();
    }

    private TabbarItemNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static TabbarItemNameDto valueOf(String str) {
        return (TabbarItemNameDto) Enum.valueOf(TabbarItemNameDto.class, str);
    }

    public static TabbarItemNameDto[] values() {
        return (TabbarItemNameDto[]) $VALUES.clone();
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
