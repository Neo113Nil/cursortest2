package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnersPinToMainTabItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class OwnersPinToMainTabItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OwnersPinToMainTabItemTypeDto[] $VALUES;

    @pmi0("clip")
    public static final OwnersPinToMainTabItemTypeDto CLIP;
    public static final Parcelable.Creator<OwnersPinToMainTabItemTypeDto> CREATOR;

    @pmi0("post")
    public static final OwnersPinToMainTabItemTypeDto POST;

    @pmi0("video")
    public static final OwnersPinToMainTabItemTypeDto VIDEO;
    private final String value;

    /* compiled from: OwnersPinToMainTabItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<OwnersPinToMainTabItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersPinToMainTabItemTypeDto createFromParcel(Parcel parcel) {
            return OwnersPinToMainTabItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersPinToMainTabItemTypeDto[] newArray(int i) {
            return new OwnersPinToMainTabItemTypeDto[i];
        }
    }

    static {
        OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto = new OwnersPinToMainTabItemTypeDto("CLIP", 0, "clip");
        CLIP = ownersPinToMainTabItemTypeDto;
        OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto2 = new OwnersPinToMainTabItemTypeDto("POST", 1, "post");
        POST = ownersPinToMainTabItemTypeDto2;
        OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto3 = new OwnersPinToMainTabItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = ownersPinToMainTabItemTypeDto3;
        OwnersPinToMainTabItemTypeDto[] ownersPinToMainTabItemTypeDtoArr = {ownersPinToMainTabItemTypeDto, ownersPinToMainTabItemTypeDto2, ownersPinToMainTabItemTypeDto3};
        $VALUES = ownersPinToMainTabItemTypeDtoArr;
        $ENTRIES = new asp(ownersPinToMainTabItemTypeDtoArr);
        CREATOR = new a();
    }

    private OwnersPinToMainTabItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OwnersPinToMainTabItemTypeDto valueOf(String str) {
        return (OwnersPinToMainTabItemTypeDto) Enum.valueOf(OwnersPinToMainTabItemTypeDto.class, str);
    }

    public static OwnersPinToMainTabItemTypeDto[] values() {
        return (OwnersPinToMainTabItemTypeDto[]) $VALUES.clone();
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
