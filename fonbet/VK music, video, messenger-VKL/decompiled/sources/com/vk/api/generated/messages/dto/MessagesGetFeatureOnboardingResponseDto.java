package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesGetFeatureOnboardingResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetFeatureOnboardingResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetFeatureOnboardingResponseDto> CREATOR = new a();

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final MessagesFeatureOnboardingDto item;

    @pmi0("not_changed")
    private final Boolean notChanged;

    @pmi0("version_hash")
    private final String versionHash;

    /* compiled from: MessagesGetFeatureOnboardingResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetFeatureOnboardingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetFeatureOnboardingResponseDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            MessagesFeatureOnboardingDto createFromParcel = parcel.readInt() == 0 ? null : MessagesFeatureOnboardingDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesGetFeatureOnboardingResponseDto(createFromParcel, readString, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetFeatureOnboardingResponseDto[] newArray(int i) {
            return new MessagesGetFeatureOnboardingResponseDto[i];
        }
    }

    public MessagesGetFeatureOnboardingResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetFeatureOnboardingResponseDto)) {
            return false;
        }
        MessagesGetFeatureOnboardingResponseDto messagesGetFeatureOnboardingResponseDto = (MessagesGetFeatureOnboardingResponseDto) obj;
        return epx.f(this.item, messagesGetFeatureOnboardingResponseDto.item) && epx.f(this.versionHash, messagesGetFeatureOnboardingResponseDto.versionHash) && epx.f(this.notChanged, messagesGetFeatureOnboardingResponseDto.notChanged);
    }

    public final int hashCode() {
        MessagesFeatureOnboardingDto messagesFeatureOnboardingDto = this.item;
        int hashCode = (messagesFeatureOnboardingDto == null ? 0 : messagesFeatureOnboardingDto.hashCode()) * 31;
        String str = this.versionHash;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.notChanged;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetFeatureOnboardingResponseDto(item=");
        sb.append(this.item);
        sb.append(", versionHash=");
        sb.append(this.versionHash);
        sb.append(", notChanged=");
        return tn.a(sb, this.notChanged, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesFeatureOnboardingDto messagesFeatureOnboardingDto = this.item;
        if (messagesFeatureOnboardingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesFeatureOnboardingDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.versionHash);
        Boolean bool = this.notChanged;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MessagesGetFeatureOnboardingResponseDto(MessagesFeatureOnboardingDto messagesFeatureOnboardingDto, String str, Boolean bool) {
        this.item = messagesFeatureOnboardingDto;
        this.versionHash = str;
        this.notChanged = bool;
    }

    public /* synthetic */ MessagesGetFeatureOnboardingResponseDto(MessagesFeatureOnboardingDto messagesFeatureOnboardingDto, String str, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesFeatureOnboardingDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool);
    }
}
