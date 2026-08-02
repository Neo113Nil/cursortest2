package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioAudioContentCardDto.kt */
/* loaded from: classes14.dex */
public final class AudioAudioContentCardDto implements Parcelable {
    public static final Parcelable.Creator<AudioAudioContentCardDto> CREATOR = new a();

    @pmi0("editor_annotation")
    private final String editorAnnotation;

    @pmi0("editor_background_image")
    private final List<BaseImageDto> editorBackgroundImage;

    @pmi0("editor_gradient_image")
    private final List<BaseImageDto> editorGradientImage;

    @pmi0("editor_tag")
    private final String editorTag;

    @pmi0("entity_id")
    private final String entityId;

    @pmi0("entity_owner_id")
    private final String entityOwnerId;

    @pmi0("entity_type")
    private final EntityTypeDto entityType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioAudioContentCardDto.kt */
    public static final class EntityTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntityTypeDto[] $VALUES;

        @pmi0("audiobooks")
        public static final EntityTypeDto AUDIOBOOKS;
        public static final Parcelable.Creator<EntityTypeDto> CREATOR;

        @pmi0("podcasts")
        public static final EntityTypeDto PODCASTS;
        private final String value;

        /* compiled from: AudioAudioContentCardDto.kt */
        public static final class a implements Parcelable.Creator<EntityTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final EntityTypeDto createFromParcel(Parcel parcel) {
                return EntityTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EntityTypeDto[] newArray(int i) {
                return new EntityTypeDto[i];
            }
        }

        static {
            EntityTypeDto entityTypeDto = new EntityTypeDto("PODCASTS", 0, "podcasts");
            PODCASTS = entityTypeDto;
            EntityTypeDto entityTypeDto2 = new EntityTypeDto("AUDIOBOOKS", 1, "audiobooks");
            AUDIOBOOKS = entityTypeDto2;
            EntityTypeDto[] entityTypeDtoArr = {entityTypeDto, entityTypeDto2};
            $VALUES = entityTypeDtoArr;
            $ENTRIES = new asp(entityTypeDtoArr);
            CREATOR = new a();
        }

        private EntityTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static EntityTypeDto valueOf(String str) {
            return (EntityTypeDto) Enum.valueOf(EntityTypeDto.class, str);
        }

        public static EntityTypeDto[] values() {
            return (EntityTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AudioAudioContentCardDto.kt */
    public static final class a implements Parcelable.Creator<AudioAudioContentCardDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAudioContentCardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            EntityTypeDto createFromParcel = EntityTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(AudioAudioContentCardDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(AudioAudioContentCardDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new AudioAudioContentCardDto(createFromParcel, readString, readString2, readString3, readString4, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAudioContentCardDto[] newArray(int i) {
            return new AudioAudioContentCardDto[i];
        }
    }

    public AudioAudioContentCardDto(EntityTypeDto entityTypeDto, String str, String str2, String str3, String str4, List<BaseImageDto> list, List<BaseImageDto> list2) {
        this.entityType = entityTypeDto;
        this.entityId = str;
        this.entityOwnerId = str2;
        this.editorAnnotation = str3;
        this.editorTag = str4;
        this.editorBackgroundImage = list;
        this.editorGradientImage = list2;
    }

    public final String d() {
        return this.editorAnnotation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.editorBackgroundImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAudioContentCardDto)) {
            return false;
        }
        AudioAudioContentCardDto audioAudioContentCardDto = (AudioAudioContentCardDto) obj;
        return this.entityType == audioAudioContentCardDto.entityType && epx.f(this.entityId, audioAudioContentCardDto.entityId) && epx.f(this.entityOwnerId, audioAudioContentCardDto.entityOwnerId) && epx.f(this.editorAnnotation, audioAudioContentCardDto.editorAnnotation) && epx.f(this.editorTag, audioAudioContentCardDto.editorTag) && epx.f(this.editorBackgroundImage, audioAudioContentCardDto.editorBackgroundImage) && epx.f(this.editorGradientImage, audioAudioContentCardDto.editorGradientImage);
    }

    public final String f() {
        return this.editorTag;
    }

    public final String g() {
        return this.entityId;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.entityType.hashCode() * 31, 31, this.entityId);
        String str = this.entityOwnerId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.editorAnnotation;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.editorTag;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BaseImageDto> list = this.editorBackgroundImage;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.editorGradientImage;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String i() {
        return this.entityOwnerId;
    }

    public final EntityTypeDto j() {
        return this.entityType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAudioContentCardDto(entityType=");
        sb.append(this.entityType);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", entityOwnerId=");
        sb.append(this.entityOwnerId);
        sb.append(", editorAnnotation=");
        sb.append(this.editorAnnotation);
        sb.append(", editorTag=");
        sb.append(this.editorTag);
        sb.append(", editorBackgroundImage=");
        sb.append(this.editorBackgroundImage);
        sb.append(", editorGradientImage=");
        return ms9.a(')', sb, this.editorGradientImage);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.entityType.writeToParcel(parcel, i);
        parcel.writeString(this.entityId);
        parcel.writeString(this.entityOwnerId);
        parcel.writeString(this.editorAnnotation);
        parcel.writeString(this.editorTag);
        List<BaseImageDto> list = this.editorBackgroundImage;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.editorGradientImage;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ AudioAudioContentCardDto(EntityTypeDto entityTypeDto, String str, String str2, String str3, String str4, List list, List list2, int i, zcl zclVar) {
        this(entityTypeDto, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2);
    }
}
