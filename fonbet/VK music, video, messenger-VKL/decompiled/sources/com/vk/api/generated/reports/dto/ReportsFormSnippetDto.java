package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ReportsFormSnippetDto.kt */
/* loaded from: classes15.dex */
public final class ReportsFormSnippetDto implements Parcelable {
    public static final Parcelable.Creator<ReportsFormSnippetDto> CREATOR = new a();

    @pmi0("attachment_preview")
    private final ReportsFormSnippetContentAttachmentPreviewDto attachmentPreview;

    @pmi0("author_id")
    private final UserId authorId;

    @pmi0("date")
    private final Integer date;

    @pmi0("label")
    private final String label;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final ReportsFormSnippetPhotoDto photo;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReportsFormSnippetDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("community")
        public static final TypeDto COMMUNITY;

        @pmi0("community_channel")
        public static final TypeDto COMMUNITY_CHANNEL;

        @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
        public static final TypeDto CONTENT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("game")
        public static final TypeDto GAME;

        @pmi0("user")
        public static final TypeDto USER;
        private final String value;

        /* compiled from: ReportsFormSnippetDto.kt */
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
            TypeDto typeDto = new TypeDto("USER", 0, "user");
            USER = typeDto;
            TypeDto typeDto2 = new TypeDto("COMMUNITY", 1, "community");
            COMMUNITY = typeDto2;
            TypeDto typeDto3 = new TypeDto("COMMUNITY_CHANNEL", 2, "community_channel");
            COMMUNITY_CHANNEL = typeDto3;
            TypeDto typeDto4 = new TypeDto("APP", 3, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto4;
            TypeDto typeDto5 = new TypeDto("GAME", 4, "game");
            GAME = typeDto5;
            TypeDto typeDto6 = new TypeDto("CONTENT", 5, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
            CONTENT = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

    /* compiled from: ReportsFormSnippetDto.kt */
    public static final class a implements Parcelable.Creator<ReportsFormSnippetDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsFormSnippetDto createFromParcel(Parcel parcel) {
            return new ReportsFormSnippetDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), ReportsFormSnippetPhotoDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(ReportsFormSnippetDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ReportsFormSnippetContentAttachmentPreviewDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsFormSnippetDto[] newArray(int i) {
            return new ReportsFormSnippetDto[i];
        }
    }

    public ReportsFormSnippetDto(TypeDto typeDto, String str, String str2, ReportsFormSnippetPhotoDto reportsFormSnippetPhotoDto, UserId userId, Integer num, ReportsFormSnippetContentAttachmentPreviewDto reportsFormSnippetContentAttachmentPreviewDto, String str3) {
        this.type = typeDto;
        this.name = str;
        this.text = str2;
        this.photo = reportsFormSnippetPhotoDto;
        this.authorId = userId;
        this.date = num;
        this.attachmentPreview = reportsFormSnippetContentAttachmentPreviewDto;
        this.label = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsFormSnippetDto)) {
            return false;
        }
        ReportsFormSnippetDto reportsFormSnippetDto = (ReportsFormSnippetDto) obj;
        return this.type == reportsFormSnippetDto.type && epx.f(this.name, reportsFormSnippetDto.name) && epx.f(this.text, reportsFormSnippetDto.text) && epx.f(this.photo, reportsFormSnippetDto.photo) && epx.f(this.authorId, reportsFormSnippetDto.authorId) && epx.f(this.date, reportsFormSnippetDto.date) && epx.f(this.attachmentPreview, reportsFormSnippetDto.attachmentPreview) && epx.f(this.label, reportsFormSnippetDto.label);
    }

    public final int hashCode() {
        int hashCode = (this.photo.hashCode() + urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.name), 31, this.text)) * 31;
        UserId userId = this.authorId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.date;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ReportsFormSnippetContentAttachmentPreviewDto reportsFormSnippetContentAttachmentPreviewDto = this.attachmentPreview;
        int hashCode4 = (hashCode3 + (reportsFormSnippetContentAttachmentPreviewDto == null ? 0 : reportsFormSnippetContentAttachmentPreviewDto.hashCode())) * 31;
        String str = this.label;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsFormSnippetDto(type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", attachmentPreview=");
        sb.append(this.attachmentPreview);
        sb.append(", label=");
        return ho8.a(sb, this.label, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.name);
        parcel.writeString(this.text);
        this.photo.writeToParcel(parcel, i);
        parcel.writeParcelable(this.authorId, i);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        ReportsFormSnippetContentAttachmentPreviewDto reportsFormSnippetContentAttachmentPreviewDto = this.attachmentPreview;
        if (reportsFormSnippetContentAttachmentPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reportsFormSnippetContentAttachmentPreviewDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.label);
    }

    public /* synthetic */ ReportsFormSnippetDto(TypeDto typeDto, String str, String str2, ReportsFormSnippetPhotoDto reportsFormSnippetPhotoDto, UserId userId, Integer num, ReportsFormSnippetContentAttachmentPreviewDto reportsFormSnippetContentAttachmentPreviewDto, String str3, int i, zcl zclVar) {
        this(typeDto, str, str2, reportsFormSnippetPhotoDto, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : reportsFormSnippetContentAttachmentPreviewDto, (i & 128) != 0 ? null : str3);
    }
}
