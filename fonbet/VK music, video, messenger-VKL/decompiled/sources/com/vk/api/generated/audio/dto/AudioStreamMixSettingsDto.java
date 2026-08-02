package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioStreamMixSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AudioStreamMixSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AudioStreamMixSettingsDto> CREATOR = new a();

    @pmi0("mix_categories")
    private final List<AudioStreamMixSettingsCategoryDto> mixCategories;

    @pmi0("multi_select")
    private final Boolean multiSelect;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioStreamMixSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AudioStreamMixSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixSettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AudioStreamMixSettingsCategoryDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioStreamMixSettingsDto(readString, readString2, arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixSettingsDto[] newArray(int i) {
            return new AudioStreamMixSettingsDto[i];
        }
    }

    public AudioStreamMixSettingsDto(String str, String str2, List<AudioStreamMixSettingsCategoryDto> list, Boolean bool) {
        this.title = str;
        this.subtitle = str2;
        this.mixCategories = list;
        this.multiSelect = bool;
    }

    public final List<AudioStreamMixSettingsCategoryDto> d() {
        return this.mixCategories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.multiSelect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMixSettingsDto)) {
            return false;
        }
        AudioStreamMixSettingsDto audioStreamMixSettingsDto = (AudioStreamMixSettingsDto) obj;
        return epx.f(this.title, audioStreamMixSettingsDto.title) && epx.f(this.subtitle, audioStreamMixSettingsDto.subtitle) && epx.f(this.mixCategories, audioStreamMixSettingsDto.mixCategories) && epx.f(this.multiSelect, audioStreamMixSettingsDto.multiSelect);
    }

    public final String f() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.mixCategories);
        Boolean bool = this.multiSelect;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixSettingsDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", mixCategories=");
        sb.append(this.mixCategories);
        sb.append(", multiSelect=");
        return tn.a(sb, this.multiSelect, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Iterator a2 = ao.a(parcel, this.mixCategories);
        while (a2.hasNext()) {
            ((AudioStreamMixSettingsCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.multiSelect;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AudioStreamMixSettingsDto(String str, String str2, List list, Boolean bool, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : bool);
    }
}
