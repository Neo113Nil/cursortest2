package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.BuildConfig;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsCreateCreateTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreateCreateTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsCreateCreateTypeDto[] $VALUES;

    @pmi0("brand")
    public static final GroupsCreateCreateTypeDto BRAND;

    @pmi0("business")
    public static final GroupsCreateCreateTypeDto BUSINESS;

    @pmi0("common")
    public static final GroupsCreateCreateTypeDto COMMON;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    public static final GroupsCreateCreateTypeDto CONTENT;
    public static final Parcelable.Creator<GroupsCreateCreateTypeDto> CREATOR;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final GroupsCreateCreateTypeDto EVENT;

    @pmi0("interests")
    public static final GroupsCreateCreateTypeDto INTERESTS;

    @pmi0(BuildConfig.SDK_BUILD_FLAVOR)
    public static final GroupsCreateCreateTypeDto PUBLIC;

    @pmi0("thematic")
    public static final GroupsCreateCreateTypeDto THEMATIC;
    private final String value;

    /* compiled from: GroupsCreateCreateTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreateCreateTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreateCreateTypeDto createFromParcel(Parcel parcel) {
            return GroupsCreateCreateTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreateCreateTypeDto[] newArray(int i) {
            return new GroupsCreateCreateTypeDto[i];
        }
    }

    static {
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto = new GroupsCreateCreateTypeDto("BRAND", 0, "brand");
        BRAND = groupsCreateCreateTypeDto;
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto2 = new GroupsCreateCreateTypeDto("BUSINESS", 1, "business");
        BUSINESS = groupsCreateCreateTypeDto2;
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto3 = new GroupsCreateCreateTypeDto("COMMON", 2, "common");
        COMMON = groupsCreateCreateTypeDto3;
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto4 = new GroupsCreateCreateTypeDto("CONTENT", 3, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
        CONTENT = groupsCreateCreateTypeDto4;
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto5 = new GroupsCreateCreateTypeDto("EVENT", 4, NotificationCompat.CATEGORY_EVENT);
        EVENT = groupsCreateCreateTypeDto5;
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto6 = new GroupsCreateCreateTypeDto("INTERESTS", 5, "interests");
        INTERESTS = groupsCreateCreateTypeDto6;
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto7 = new GroupsCreateCreateTypeDto(Privacy.PUBLIC, 6, BuildConfig.SDK_BUILD_FLAVOR);
        PUBLIC = groupsCreateCreateTypeDto7;
        GroupsCreateCreateTypeDto groupsCreateCreateTypeDto8 = new GroupsCreateCreateTypeDto("THEMATIC", 7, "thematic");
        THEMATIC = groupsCreateCreateTypeDto8;
        GroupsCreateCreateTypeDto[] groupsCreateCreateTypeDtoArr = {groupsCreateCreateTypeDto, groupsCreateCreateTypeDto2, groupsCreateCreateTypeDto3, groupsCreateCreateTypeDto4, groupsCreateCreateTypeDto5, groupsCreateCreateTypeDto6, groupsCreateCreateTypeDto7, groupsCreateCreateTypeDto8};
        $VALUES = groupsCreateCreateTypeDtoArr;
        $ENTRIES = new asp(groupsCreateCreateTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsCreateCreateTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsCreateCreateTypeDto valueOf(String str) {
        return (GroupsCreateCreateTypeDto) Enum.valueOf(GroupsCreateCreateTypeDto.class, str);
    }

    public static GroupsCreateCreateTypeDto[] values() {
        return (GroupsCreateCreateTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
