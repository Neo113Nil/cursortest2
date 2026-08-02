package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoLiveLayoutSettingsDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveLayoutSettingsDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveLayoutSettingsDto> CREATOR = new a();

    @pmi0("is_vitrina_tv")
    private final Boolean isVitrinaTv;

    @pmi0("show_chat")
    private final Boolean showChat;

    @pmi0("show_program")
    private final Boolean showProgram;

    /* compiled from: VideoLiveLayoutSettingsDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveLayoutSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveLayoutSettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoLiveLayoutSettingsDto(valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveLayoutSettingsDto[] newArray(int i) {
            return new VideoLiveLayoutSettingsDto[i];
        }
    }

    public VideoLiveLayoutSettingsDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.showChat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveLayoutSettingsDto)) {
            return false;
        }
        VideoLiveLayoutSettingsDto videoLiveLayoutSettingsDto = (VideoLiveLayoutSettingsDto) obj;
        return epx.f(this.showProgram, videoLiveLayoutSettingsDto.showProgram) && epx.f(this.showChat, videoLiveLayoutSettingsDto.showChat) && epx.f(this.isVitrinaTv, videoLiveLayoutSettingsDto.isVitrinaTv);
    }

    public final int hashCode() {
        Boolean bool = this.showProgram;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showChat;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isVitrinaTv;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoLiveLayoutSettingsDto(showProgram=");
        sb.append(this.showProgram);
        sb.append(", showChat=");
        sb.append(this.showChat);
        sb.append(", isVitrinaTv=");
        return tn.a(sb, this.isVitrinaTv, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.showProgram;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showChat;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isVitrinaTv;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public VideoLiveLayoutSettingsDto(Boolean bool, Boolean bool2, Boolean bool3) {
        this.showProgram = bool;
        this.showChat = bool2;
        this.isVitrinaTv = bool3;
    }

    public /* synthetic */ VideoLiveLayoutSettingsDto(Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
