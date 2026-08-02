package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VideoInfoTrackDto.kt */
/* loaded from: classes15.dex */
public final class VideoInfoTrackDto implements Parcelable {
    public static final Parcelable.Creator<VideoInfoTrackDto> CREATOR = new a();

    @pmi0("language")
    private final String language;

    @pmi0("qualities")
    private final List<VideoInfoQualitiesDto> qualities;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoInfoTrackDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("audio")
        public static final TypeDto AUDIO;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: VideoInfoTrackDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
            VIDEO = typeDto;
            TypeDto typeDto2 = new TypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
            AUDIO = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: VideoInfoTrackDto.kt */
    public static final class a implements Parcelable.Creator<VideoInfoTrackDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInfoTrackDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoInfoQualitiesDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoInfoTrackDto(createFromParcel, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInfoTrackDto[] newArray(int i) {
            return new VideoInfoTrackDto[i];
        }
    }

    public VideoInfoTrackDto(TypeDto typeDto, String str, String str2, List<VideoInfoQualitiesDto> list) {
        this.type = typeDto;
        this.language = str;
        this.title = str2;
        this.qualities = list;
    }

    public final List<VideoInfoQualitiesDto> d() {
        return this.qualities;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoTrackDto)) {
            return false;
        }
        VideoInfoTrackDto videoInfoTrackDto = (VideoInfoTrackDto) obj;
        return this.type == videoInfoTrackDto.type && epx.f(this.language, videoInfoTrackDto.language) && epx.f(this.title, videoInfoTrackDto.title) && epx.f(this.qualities, videoInfoTrackDto.qualities);
    }

    public final int hashCode() {
        return this.qualities.hashCode() + urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.language), 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfoTrackDto(type=");
        sb.append(this.type);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", qualities=");
        return ms9.a(')', sb, this.qualities);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.language);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.qualities);
        while (a2.hasNext()) {
            ((VideoInfoQualitiesDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
