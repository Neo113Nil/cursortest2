package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioSearchSuggestionDto.kt */
/* loaded from: classes14.dex */
public final class AudioSearchSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<AudioSearchSuggestionDto> CREATOR = new a();

    @pmi0("context")
    private final String context;

    @pmi0("id")
    private final String id;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final String type;

    /* compiled from: AudioSearchSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<AudioSearchSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSearchSuggestionDto createFromParcel(Parcel parcel) {
            return new AudioSearchSuggestionDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSearchSuggestionDto[] newArray(int i) {
            return new AudioSearchSuggestionDto[i];
        }
    }

    public AudioSearchSuggestionDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String d() {
        return this.context;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioSearchSuggestionDto)) {
            return false;
        }
        AudioSearchSuggestionDto audioSearchSuggestionDto = (AudioSearchSuggestionDto) obj;
        return epx.f(this.id, audioSearchSuggestionDto.id) && epx.f(this.title, audioSearchSuggestionDto.title) && epx.f(this.subtitle, audioSearchSuggestionDto.subtitle) && epx.f(this.context, audioSearchSuggestionDto.context) && epx.f(this.type, audioSearchSuggestionDto.type) && epx.f(this.trackCode, audioSearchSuggestionDto.trackCode);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.context;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trackCode;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSearchSuggestionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.context);
        parcel.writeString(this.type);
        parcel.writeString(this.trackCode);
    }

    public AudioSearchSuggestionDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.context = str4;
        this.type = str5;
        this.trackCode = str6;
    }

    public /* synthetic */ AudioSearchSuggestionDto(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
