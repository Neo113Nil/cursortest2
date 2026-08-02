package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnersUnpinFromMainTabItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class OwnersUnpinFromMainTabItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OwnersUnpinFromMainTabItemTypeDto[] $VALUES;

    @pmi0("clip")
    public static final OwnersUnpinFromMainTabItemTypeDto CLIP;
    public static final Parcelable.Creator<OwnersUnpinFromMainTabItemTypeDto> CREATOR;

    @pmi0("post")
    public static final OwnersUnpinFromMainTabItemTypeDto POST;

    @pmi0("video")
    public static final OwnersUnpinFromMainTabItemTypeDto VIDEO;
    private final String value;

    /* compiled from: OwnersUnpinFromMainTabItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<OwnersUnpinFromMainTabItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersUnpinFromMainTabItemTypeDto createFromParcel(Parcel parcel) {
            return OwnersUnpinFromMainTabItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersUnpinFromMainTabItemTypeDto[] newArray(int i) {
            return new OwnersUnpinFromMainTabItemTypeDto[i];
        }
    }

    static {
        OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto = new OwnersUnpinFromMainTabItemTypeDto("CLIP", 0, "clip");
        CLIP = ownersUnpinFromMainTabItemTypeDto;
        OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto2 = new OwnersUnpinFromMainTabItemTypeDto("POST", 1, "post");
        POST = ownersUnpinFromMainTabItemTypeDto2;
        OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto3 = new OwnersUnpinFromMainTabItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = ownersUnpinFromMainTabItemTypeDto3;
        OwnersUnpinFromMainTabItemTypeDto[] ownersUnpinFromMainTabItemTypeDtoArr = {ownersUnpinFromMainTabItemTypeDto, ownersUnpinFromMainTabItemTypeDto2, ownersUnpinFromMainTabItemTypeDto3};
        $VALUES = ownersUnpinFromMainTabItemTypeDtoArr;
        $ENTRIES = new asp(ownersUnpinFromMainTabItemTypeDtoArr);
        CREATOR = new a();
    }

    private OwnersUnpinFromMainTabItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OwnersUnpinFromMainTabItemTypeDto valueOf(String str) {
        return (OwnersUnpinFromMainTabItemTypeDto) Enum.valueOf(OwnersUnpinFromMainTabItemTypeDto.class, str);
    }

    public static OwnersUnpinFromMainTabItemTypeDto[] values() {
        return (OwnersUnpinFromMainTabItemTypeDto[]) $VALUES.clone();
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
