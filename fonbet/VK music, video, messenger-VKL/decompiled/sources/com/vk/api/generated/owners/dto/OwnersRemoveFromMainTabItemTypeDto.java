package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnersRemoveFromMainTabItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class OwnersRemoveFromMainTabItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OwnersRemoveFromMainTabItemTypeDto[] $VALUES;

    @pmi0("clip")
    public static final OwnersRemoveFromMainTabItemTypeDto CLIP;
    public static final Parcelable.Creator<OwnersRemoveFromMainTabItemTypeDto> CREATOR;

    @pmi0("post")
    public static final OwnersRemoveFromMainTabItemTypeDto POST;

    @pmi0("video")
    public static final OwnersRemoveFromMainTabItemTypeDto VIDEO;
    private final String value;

    /* compiled from: OwnersRemoveFromMainTabItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<OwnersRemoveFromMainTabItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersRemoveFromMainTabItemTypeDto createFromParcel(Parcel parcel) {
            return OwnersRemoveFromMainTabItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersRemoveFromMainTabItemTypeDto[] newArray(int i) {
            return new OwnersRemoveFromMainTabItemTypeDto[i];
        }
    }

    static {
        OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto = new OwnersRemoveFromMainTabItemTypeDto("CLIP", 0, "clip");
        CLIP = ownersRemoveFromMainTabItemTypeDto;
        OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto2 = new OwnersRemoveFromMainTabItemTypeDto("POST", 1, "post");
        POST = ownersRemoveFromMainTabItemTypeDto2;
        OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto3 = new OwnersRemoveFromMainTabItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = ownersRemoveFromMainTabItemTypeDto3;
        OwnersRemoveFromMainTabItemTypeDto[] ownersRemoveFromMainTabItemTypeDtoArr = {ownersRemoveFromMainTabItemTypeDto, ownersRemoveFromMainTabItemTypeDto2, ownersRemoveFromMainTabItemTypeDto3};
        $VALUES = ownersRemoveFromMainTabItemTypeDtoArr;
        $ENTRIES = new asp(ownersRemoveFromMainTabItemTypeDtoArr);
        CREATOR = new a();
    }

    private OwnersRemoveFromMainTabItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OwnersRemoveFromMainTabItemTypeDto valueOf(String str) {
        return (OwnersRemoveFromMainTabItemTypeDto) Enum.valueOf(OwnersRemoveFromMainTabItemTypeDto.class, str);
    }

    public static OwnersRemoveFromMainTabItemTypeDto[] values() {
        return (OwnersRemoveFromMainTabItemTypeDto[]) $VALUES.clone();
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
