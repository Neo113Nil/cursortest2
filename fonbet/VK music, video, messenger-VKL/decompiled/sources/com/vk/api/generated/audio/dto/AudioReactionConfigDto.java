package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioReactionConfigDto.kt */
/* loaded from: classes14.dex */
public final class AudioReactionConfigDto implements Parcelable {
    public static final Parcelable.Creator<AudioReactionConfigDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final String icon;

    @pmi0("icon_badge")
    private final String iconBadge;

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioReactionConfigDto.kt */
    public static final class a implements Parcelable.Creator<AudioReactionConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioReactionConfigDto createFromParcel(Parcel parcel) {
            return new AudioReactionConfigDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioReactionConfigDto[] newArray(int i) {
            return new AudioReactionConfigDto[i];
        }
    }

    public AudioReactionConfigDto(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.icon = str4;
        this.iconBadge = str5;
    }

    public final String d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.iconBadge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioReactionConfigDto)) {
            return false;
        }
        AudioReactionConfigDto audioReactionConfigDto = (AudioReactionConfigDto) obj;
        return epx.f(this.id, audioReactionConfigDto.id) && epx.f(this.title, audioReactionConfigDto.title) && epx.f(this.description, audioReactionConfigDto.description) && epx.f(this.icon, audioReactionConfigDto.icon) && epx.f(this.iconBadge, audioReactionConfigDto.iconBadge);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.icon);
        String str = this.iconBadge;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioReactionConfigDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconBadge=");
        return ho8.a(sb, this.iconBadge, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconBadge);
    }

    public /* synthetic */ AudioReactionConfigDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
    }
}
