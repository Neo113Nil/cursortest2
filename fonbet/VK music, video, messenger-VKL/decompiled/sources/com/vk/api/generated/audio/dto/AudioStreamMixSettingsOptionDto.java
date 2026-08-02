package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioStreamMixSettingsOptionDto.kt */
/* loaded from: classes14.dex */
public final class AudioStreamMixSettingsOptionDto implements Parcelable {
    public static final Parcelable.Creator<AudioStreamMixSettingsOptionDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("icon_badge")
    private final String iconBadge;

    @pmi0("id")
    private final String id;

    @pmi0("selected")
    private final Boolean selected;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioStreamMixSettingsOptionDto.kt */
    public static final class a implements Parcelable.Creator<AudioStreamMixSettingsOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixSettingsOptionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioStreamMixSettingsOptionDto(readString, readString2, readString3, readString4, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixSettingsOptionDto[] newArray(int i) {
            return new AudioStreamMixSettingsOptionDto[i];
        }
    }

    public AudioStreamMixSettingsOptionDto(String str, String str2, String str3, String str4, Boolean bool) {
        this.id = str;
        this.title = str2;
        this.icon = str3;
        this.iconBadge = str4;
        this.selected = bool;
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
        if (!(obj instanceof AudioStreamMixSettingsOptionDto)) {
            return false;
        }
        AudioStreamMixSettingsOptionDto audioStreamMixSettingsOptionDto = (AudioStreamMixSettingsOptionDto) obj;
        return epx.f(this.id, audioStreamMixSettingsOptionDto.id) && epx.f(this.title, audioStreamMixSettingsOptionDto.title) && epx.f(this.icon, audioStreamMixSettingsOptionDto.icon) && epx.f(this.iconBadge, audioStreamMixSettingsOptionDto.iconBadge) && epx.f(this.selected, audioStreamMixSettingsOptionDto.selected);
    }

    public final Boolean f() {
        return this.selected;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.icon), 31, this.iconBadge);
        Boolean bool = this.selected;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixSettingsOptionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconBadge=");
        sb.append(this.iconBadge);
        sb.append(", selected=");
        return tn.a(sb, this.selected, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconBadge);
        Boolean bool = this.selected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AudioStreamMixSettingsOptionDto(String str, String str2, String str3, String str4, Boolean bool, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : bool);
    }
}
