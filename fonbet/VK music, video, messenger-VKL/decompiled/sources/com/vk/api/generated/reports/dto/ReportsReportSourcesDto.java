package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ReportsReportSourcesDto.kt */
/* loaded from: classes15.dex */
public final class ReportsReportSourcesDto implements Parcelable {
    public static final Parcelable.Creator<ReportsReportSourcesDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("label")
    private final String label;

    @pmi0("source")
    private final SourceDto source;

    @pmi0("source_id")
    private final int sourceId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReportsReportSourcesDto.kt */
    public static final class SourceDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;

        @pmi0("article")
        public static final SourceDto ARTICLE;

        @pmi0("clip")
        public static final SourceDto CLIP;

        @pmi0("cover")
        public static final SourceDto COVER;
        public static final Parcelable.Creator<SourceDto> CREATOR;

        @pmi0("insults")
        public static final SourceDto INSULTS;

        @pmi0("main_profile_photo")
        public static final SourceDto MAIN_PROFILE_PHOTO;

        @pmi0("photo")
        public static final SourceDto PHOTO;

        @pmi0("story")
        public static final SourceDto STORY;

        @pmi0("user")
        public static final SourceDto USER;

        @pmi0("video")
        public static final SourceDto VIDEO;

        @pmi0("wall")
        public static final SourceDto WALL;
        private final String value;

        /* compiled from: ReportsReportSourcesDto.kt */
        public static final class a implements Parcelable.Creator<SourceDto> {
            @Override // android.os.Parcelable.Creator
            public final SourceDto createFromParcel(Parcel parcel) {
                return SourceDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SourceDto[] newArray(int i) {
                return new SourceDto[i];
            }
        }

        static {
            SourceDto sourceDto = new SourceDto("PHOTO", 0, "photo");
            PHOTO = sourceDto;
            SourceDto sourceDto2 = new SourceDto("WALL", 1, "wall");
            WALL = sourceDto2;
            SourceDto sourceDto3 = new SourceDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
            VIDEO = sourceDto3;
            SourceDto sourceDto4 = new SourceDto("CLIP", 3, "clip");
            CLIP = sourceDto4;
            SourceDto sourceDto5 = new SourceDto("ARTICLE", 4, "article");
            ARTICLE = sourceDto5;
            SourceDto sourceDto6 = new SourceDto("STORY", 5, "story");
            STORY = sourceDto6;
            SourceDto sourceDto7 = new SourceDto("USER", 6, "user");
            USER = sourceDto7;
            SourceDto sourceDto8 = new SourceDto("INSULTS", 7, "insults");
            INSULTS = sourceDto8;
            SourceDto sourceDto9 = new SourceDto("COVER", 8, "cover");
            COVER = sourceDto9;
            SourceDto sourceDto10 = new SourceDto("MAIN_PROFILE_PHOTO", 9, "main_profile_photo");
            MAIN_PROFILE_PHOTO = sourceDto10;
            SourceDto[] sourceDtoArr = {sourceDto, sourceDto2, sourceDto3, sourceDto4, sourceDto5, sourceDto6, sourceDto7, sourceDto8, sourceDto9, sourceDto10};
            $VALUES = sourceDtoArr;
            $ENTRIES = new asp(sourceDtoArr);
            CREATOR = new a();
        }

        private SourceDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
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

    /* compiled from: ReportsReportSourcesDto.kt */
    public static final class a implements Parcelable.Creator<ReportsReportSourcesDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsReportSourcesDto createFromParcel(Parcel parcel) {
            return new ReportsReportSourcesDto(parcel.readString(), SourceDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsReportSourcesDto[] newArray(int i) {
            return new ReportsReportSourcesDto[i];
        }
    }

    public ReportsReportSourcesDto(String str, SourceDto sourceDto, String str2, int i) {
        this.label = str;
        this.source = sourceDto;
        this.description = str2;
        this.sourceId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsReportSourcesDto)) {
            return false;
        }
        ReportsReportSourcesDto reportsReportSourcesDto = (ReportsReportSourcesDto) obj;
        return epx.f(this.label, reportsReportSourcesDto.label) && this.source == reportsReportSourcesDto.source && epx.f(this.description, reportsReportSourcesDto.description) && this.sourceId == reportsReportSourcesDto.sourceId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.sourceId) + urd0.a((this.source.hashCode() + (this.label.hashCode() * 31)) * 31, 31, this.description);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsReportSourcesDto(label=");
        sb.append(this.label);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", sourceId=");
        return vu5.b(sb, this.sourceId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        this.source.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        parcel.writeInt(this.sourceId);
    }
}
