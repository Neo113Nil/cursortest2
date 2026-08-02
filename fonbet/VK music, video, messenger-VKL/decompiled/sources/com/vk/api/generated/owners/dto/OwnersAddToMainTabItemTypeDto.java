package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnersAddToMainTabItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class OwnersAddToMainTabItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OwnersAddToMainTabItemTypeDto[] $VALUES;

    @pmi0("clip")
    public static final OwnersAddToMainTabItemTypeDto CLIP;
    public static final Parcelable.Creator<OwnersAddToMainTabItemTypeDto> CREATOR;

    @pmi0("post")
    public static final OwnersAddToMainTabItemTypeDto POST;

    @pmi0("video")
    public static final OwnersAddToMainTabItemTypeDto VIDEO;
    private final String value;

    /* compiled from: OwnersAddToMainTabItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<OwnersAddToMainTabItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersAddToMainTabItemTypeDto createFromParcel(Parcel parcel) {
            return OwnersAddToMainTabItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersAddToMainTabItemTypeDto[] newArray(int i) {
            return new OwnersAddToMainTabItemTypeDto[i];
        }
    }

    static {
        OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto = new OwnersAddToMainTabItemTypeDto("CLIP", 0, "clip");
        CLIP = ownersAddToMainTabItemTypeDto;
        OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto2 = new OwnersAddToMainTabItemTypeDto("POST", 1, "post");
        POST = ownersAddToMainTabItemTypeDto2;
        OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto3 = new OwnersAddToMainTabItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = ownersAddToMainTabItemTypeDto3;
        OwnersAddToMainTabItemTypeDto[] ownersAddToMainTabItemTypeDtoArr = {ownersAddToMainTabItemTypeDto, ownersAddToMainTabItemTypeDto2, ownersAddToMainTabItemTypeDto3};
        $VALUES = ownersAddToMainTabItemTypeDtoArr;
        $ENTRIES = new asp(ownersAddToMainTabItemTypeDtoArr);
        CREATOR = new a();
    }

    private OwnersAddToMainTabItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OwnersAddToMainTabItemTypeDto valueOf(String str) {
        return (OwnersAddToMainTabItemTypeDto) Enum.valueOf(OwnersAddToMainTabItemTypeDto.class, str);
    }

    public static OwnersAddToMainTabItemTypeDto[] values() {
        return (OwnersAddToMainTabItemTypeDto[]) $VALUES.clone();
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
