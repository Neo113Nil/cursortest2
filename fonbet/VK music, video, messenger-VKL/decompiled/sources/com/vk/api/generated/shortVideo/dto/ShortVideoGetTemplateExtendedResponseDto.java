package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetTemplateExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetTemplateExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetTemplateExtendedResponseDto> CREATOR = new a();

    @pmi0("audio_template")
    private final ShortVideoAudioTemplateSchemaDto audioTemplate;

    @pmi0("audios")
    private final List<ShortVideoAudioDto> audios;

    /* compiled from: ShortVideoGetTemplateExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetTemplateExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTemplateExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ShortVideoAudioTemplateSchemaDto createFromParcel = ShortVideoAudioTemplateSchemaDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoGetTemplateExtendedResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoGetTemplateExtendedResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTemplateExtendedResponseDto[] newArray(int i) {
            return new ShortVideoGetTemplateExtendedResponseDto[i];
        }
    }

    public ShortVideoGetTemplateExtendedResponseDto(ShortVideoAudioTemplateSchemaDto shortVideoAudioTemplateSchemaDto, List<ShortVideoAudioDto> list) {
        this.audioTemplate = shortVideoAudioTemplateSchemaDto;
        this.audios = list;
    }

    public final ShortVideoAudioTemplateSchemaDto d() {
        return this.audioTemplate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ShortVideoAudioDto> e() {
        return this.audios;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetTemplateExtendedResponseDto)) {
            return false;
        }
        ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto = (ShortVideoGetTemplateExtendedResponseDto) obj;
        return epx.f(this.audioTemplate, shortVideoGetTemplateExtendedResponseDto.audioTemplate) && epx.f(this.audios, shortVideoGetTemplateExtendedResponseDto.audios);
    }

    public final int hashCode() {
        int hashCode = this.audioTemplate.hashCode() * 31;
        List<ShortVideoAudioDto> list = this.audios;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetTemplateExtendedResponseDto(audioTemplate=");
        sb.append(this.audioTemplate);
        sb.append(", audios=");
        return ms9.a(')', sb, this.audios);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.audioTemplate.writeToParcel(parcel, i);
        List<ShortVideoAudioDto> list = this.audios;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ ShortVideoGetTemplateExtendedResponseDto(ShortVideoAudioTemplateSchemaDto shortVideoAudioTemplateSchemaDto, List list, int i, zcl zclVar) {
        this(shortVideoAudioTemplateSchemaDto, (i & 2) != 0 ? null : list);
    }
}
