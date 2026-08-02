package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioStreamMixCatalogItemDto.kt */
/* loaded from: classes14.dex */
public final class AudioStreamMixCatalogItemDto implements Parcelable {
    public static final Parcelable.Creator<AudioStreamMixCatalogItemDto> CREATOR = new a();

    @pmi0("background_animation_url")
    private final String backgroundAnimationUrl;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final String id;

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final String imageUrl;

    @pmi0("is_tunable")
    private final Boolean isTunable;

    @pmi0("settings")
    private final AudioStreamMixSettingsDto settings;

    @pmi0("stream_mix")
    private final AudioStreamMixDto streamMix;

    @pmi0("titles")
    private final AudioStreamMixTitlesDto titles;

    /* compiled from: AudioStreamMixCatalogItemDto.kt */
    public static final class a implements Parcelable.Creator<AudioStreamMixCatalogItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixCatalogItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioStreamMixCatalogItemDto(readString, readString2, readString3, valueOf, parcel.readInt() == 0 ? null : AudioStreamMixTitlesDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AudioStreamMixDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AudioStreamMixSettingsDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixCatalogItemDto[] newArray(int i) {
            return new AudioStreamMixCatalogItemDto[i];
        }
    }

    public AudioStreamMixCatalogItemDto(String str, String str2, String str3, Boolean bool, AudioStreamMixTitlesDto audioStreamMixTitlesDto, AudioStreamMixDto audioStreamMixDto, AudioStreamMixSettingsDto audioStreamMixSettingsDto, String str4) {
        this.id = str;
        this.description = str2;
        this.backgroundAnimationUrl = str3;
        this.isTunable = bool;
        this.titles = audioStreamMixTitlesDto;
        this.streamMix = audioStreamMixDto;
        this.settings = audioStreamMixSettingsDto;
        this.imageUrl = str4;
    }

    public final String d() {
        return this.backgroundAnimationUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMixCatalogItemDto)) {
            return false;
        }
        AudioStreamMixCatalogItemDto audioStreamMixCatalogItemDto = (AudioStreamMixCatalogItemDto) obj;
        return epx.f(this.id, audioStreamMixCatalogItemDto.id) && epx.f(this.description, audioStreamMixCatalogItemDto.description) && epx.f(this.backgroundAnimationUrl, audioStreamMixCatalogItemDto.backgroundAnimationUrl) && epx.f(this.isTunable, audioStreamMixCatalogItemDto.isTunable) && epx.f(this.titles, audioStreamMixCatalogItemDto.titles) && epx.f(this.streamMix, audioStreamMixCatalogItemDto.streamMix) && epx.f(this.settings, audioStreamMixCatalogItemDto.settings) && epx.f(this.imageUrl, audioStreamMixCatalogItemDto.imageUrl);
    }

    public final AudioStreamMixSettingsDto f() {
        return this.settings;
    }

    public final AudioStreamMixDto g() {
        return this.streamMix;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.description);
        String str = this.backgroundAnimationUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isTunable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AudioStreamMixTitlesDto audioStreamMixTitlesDto = this.titles;
        int hashCode3 = (hashCode2 + (audioStreamMixTitlesDto == null ? 0 : audioStreamMixTitlesDto.hashCode())) * 31;
        AudioStreamMixDto audioStreamMixDto = this.streamMix;
        int hashCode4 = (hashCode3 + (audioStreamMixDto == null ? 0 : audioStreamMixDto.hashCode())) * 31;
        AudioStreamMixSettingsDto audioStreamMixSettingsDto = this.settings;
        int hashCode5 = (hashCode4 + (audioStreamMixSettingsDto == null ? 0 : audioStreamMixSettingsDto.hashCode())) * 31;
        String str2 = this.imageUrl;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final AudioStreamMixTitlesDto i() {
        return this.titles;
    }

    public final Boolean j() {
        return this.isTunable;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixCatalogItemDto(id=");
        sb.append(this.id);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", backgroundAnimationUrl=");
        sb.append(this.backgroundAnimationUrl);
        sb.append(", isTunable=");
        sb.append(this.isTunable);
        sb.append(", titles=");
        sb.append(this.titles);
        sb.append(", streamMix=");
        sb.append(this.streamMix);
        sb.append(", settings=");
        sb.append(this.settings);
        sb.append(", imageUrl=");
        return ho8.a(sb, this.imageUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.backgroundAnimationUrl);
        Boolean bool = this.isTunable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        AudioStreamMixTitlesDto audioStreamMixTitlesDto = this.titles;
        if (audioStreamMixTitlesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioStreamMixTitlesDto.writeToParcel(parcel, i);
        }
        AudioStreamMixDto audioStreamMixDto = this.streamMix;
        if (audioStreamMixDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioStreamMixDto.writeToParcel(parcel, i);
        }
        AudioStreamMixSettingsDto audioStreamMixSettingsDto = this.settings;
        if (audioStreamMixSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioStreamMixSettingsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.imageUrl);
    }

    public /* synthetic */ AudioStreamMixCatalogItemDto(String str, String str2, String str3, Boolean bool, AudioStreamMixTitlesDto audioStreamMixTitlesDto, AudioStreamMixDto audioStreamMixDto, AudioStreamMixSettingsDto audioStreamMixSettingsDto, String str4, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : audioStreamMixTitlesDto, (i & 32) != 0 ? null : audioStreamMixDto, (i & 64) != 0 ? null : audioStreamMixSettingsDto, (i & 128) != 0 ? null : str4);
    }
}
