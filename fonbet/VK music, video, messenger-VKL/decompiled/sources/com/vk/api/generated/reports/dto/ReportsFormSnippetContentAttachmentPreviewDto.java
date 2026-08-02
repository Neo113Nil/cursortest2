package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ReportsFormSnippetContentAttachmentPreviewDto.kt */
/* loaded from: classes15.dex */
public final class ReportsFormSnippetContentAttachmentPreviewDto implements Parcelable {
    public static final Parcelable.Creator<ReportsFormSnippetContentAttachmentPreviewDto> CREATOR = new a();

    @pmi0("can_play")
    private final boolean canPlay;

    @pmi0("multi_sizes")
    private final List<List<PhotosPhotoSizesDto>> multiSizes;

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReportsFormSnippetContentAttachmentPreviewDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("album")
        public static final TypeDto ALBUM;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("article")
        public static final TypeDto ARTICLE;

        @pmi0("audio")
        public static final TypeDto AUDIO;

        @pmi0("board_poll")
        public static final TypeDto BOARD_POLL;

        @pmi0("clip")
        public static final TypeDto CLIP;

        @pmi0("comment")
        public static final TypeDto COMMENT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("live_comment")
        public static final TypeDto LIVE_COMMENT;

        @pmi0("market")
        public static final TypeDto MARKET;

        @pmi0("market_comment")
        public static final TypeDto MARKET_COMMENT;

        @pmi0("narrative")
        public static final TypeDto NARRATIVE;

        @pmi0("nft")
        public static final TypeDto NFT;

        @pmi0("photo")
        public static final TypeDto PHOTO;

        @pmi0("photo_comment")
        public static final TypeDto PHOTO_COMMENT;

        @pmi0("poll")
        public static final TypeDto POLL;

        @pmi0("post")
        public static final TypeDto POST;

        @pmi0("situational_post")
        public static final TypeDto SITUATIONAL_POST;

        @pmi0("sticker")
        public static final TypeDto STICKER;

        @pmi0("story")
        public static final TypeDto STORY;

        @pmi0("textlive")
        public static final TypeDto TEXTLIVE;

        @pmi0("textpost")
        public static final TypeDto TEXTPOST;

        @pmi0("topic_comment")
        public static final TypeDto TOPIC_COMMENT;

        @pmi0("ugc_sticker")
        public static final TypeDto UGC_STICKER;

        @pmi0("ugc_sticker_pack")
        public static final TypeDto UGC_STICKER_PACK;

        @pmi0("video")
        public static final TypeDto VIDEO;

        @pmi0("video_comment")
        public static final TypeDto VIDEO_COMMENT;

        @pmi0("wall")
        public static final TypeDto WALL;

        @pmi0("wall_comment")
        public static final TypeDto WALL_COMMENT;
        private final String value;

        /* compiled from: ReportsFormSnippetContentAttachmentPreviewDto.kt */
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
            TypeDto typeDto = new TypeDto("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto;
            TypeDto typeDto2 = new TypeDto("ARTICLE", 1, "article");
            ARTICLE = typeDto2;
            TypeDto typeDto3 = new TypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, "audio");
            AUDIO = typeDto3;
            TypeDto typeDto4 = new TypeDto("BOARD_POLL", 3, "board_poll");
            BOARD_POLL = typeDto4;
            TypeDto typeDto5 = new TypeDto("CLIP", 4, "clip");
            CLIP = typeDto5;
            TypeDto typeDto6 = new TypeDto("COMMENT", 5, "comment");
            COMMENT = typeDto6;
            TypeDto typeDto7 = new TypeDto("LIVE_COMMENT", 6, "live_comment");
            LIVE_COMMENT = typeDto7;
            TypeDto typeDto8 = new TypeDto("MARKET", 7, "market");
            MARKET = typeDto8;
            TypeDto typeDto9 = new TypeDto("MARKET_COMMENT", 8, "market_comment");
            MARKET_COMMENT = typeDto9;
            TypeDto typeDto10 = new TypeDto("NARRATIVE", 9, "narrative");
            NARRATIVE = typeDto10;
            TypeDto typeDto11 = new TypeDto("NFT", 10, "nft");
            NFT = typeDto11;
            TypeDto typeDto12 = new TypeDto("PHOTO", 11, "photo");
            PHOTO = typeDto12;
            TypeDto typeDto13 = new TypeDto("PHOTO_COMMENT", 12, "photo_comment");
            PHOTO_COMMENT = typeDto13;
            TypeDto typeDto14 = new TypeDto("POLL", 13, "poll");
            POLL = typeDto14;
            TypeDto typeDto15 = new TypeDto("POST", 14, "post");
            POST = typeDto15;
            TypeDto typeDto16 = new TypeDto("SITUATIONAL_POST", 15, "situational_post");
            SITUATIONAL_POST = typeDto16;
            TypeDto typeDto17 = new TypeDto("STORY", 16, "story");
            STORY = typeDto17;
            TypeDto typeDto18 = new TypeDto("TEXTLIVE", 17, "textlive");
            TEXTLIVE = typeDto18;
            TypeDto typeDto19 = new TypeDto("TEXTPOST", 18, "textpost");
            TEXTPOST = typeDto19;
            TypeDto typeDto20 = new TypeDto("TOPIC_COMMENT", 19, "topic_comment");
            TOPIC_COMMENT = typeDto20;
            TypeDto typeDto21 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 20, "video");
            VIDEO = typeDto21;
            TypeDto typeDto22 = new TypeDto("VIDEO_COMMENT", 21, "video_comment");
            VIDEO_COMMENT = typeDto22;
            TypeDto typeDto23 = new TypeDto("WALL", 22, "wall");
            WALL = typeDto23;
            TypeDto typeDto24 = new TypeDto("WALL_COMMENT", 23, "wall_comment");
            WALL_COMMENT = typeDto24;
            TypeDto typeDto25 = new TypeDto("LINK", 24, "link");
            LINK = typeDto25;
            TypeDto typeDto26 = new TypeDto("ALBUM", 25, "album");
            ALBUM = typeDto26;
            TypeDto typeDto27 = new TypeDto("STICKER", 26, "sticker");
            STICKER = typeDto27;
            TypeDto typeDto28 = new TypeDto("UGC_STICKER", 27, "ugc_sticker");
            UGC_STICKER = typeDto28;
            TypeDto typeDto29 = new TypeDto("UGC_STICKER_PACK", 28, "ugc_sticker_pack");
            UGC_STICKER_PACK = typeDto29;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21, typeDto22, typeDto23, typeDto24, typeDto25, typeDto26, typeDto27, typeDto28, typeDto29};
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

    /* compiled from: ReportsFormSnippetContentAttachmentPreviewDto.kt */
    public static final class a implements Parcelable.Creator<ReportsFormSnippetContentAttachmentPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsFormSnippetContentAttachmentPreviewDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ReportsFormSnippetContentAttachmentPreviewDto.class, parcel, arrayList2, i, 1);
            }
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(ReportsFormSnippetContentAttachmentPreviewDto.class, parcel, arrayList4, i3, 1);
                    }
                    arrayList3.add(arrayList4);
                }
                arrayList = arrayList3;
            }
            return new ReportsFormSnippetContentAttachmentPreviewDto(createFromParcel, arrayList2, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsFormSnippetContentAttachmentPreviewDto[] newArray(int i) {
            return new ReportsFormSnippetContentAttachmentPreviewDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReportsFormSnippetContentAttachmentPreviewDto(TypeDto typeDto, List<PhotosPhotoSizesDto> list, boolean z, List<? extends List<PhotosPhotoSizesDto>> list2) {
        this.type = typeDto;
        this.sizes = list;
        this.canPlay = z;
        this.multiSizes = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsFormSnippetContentAttachmentPreviewDto)) {
            return false;
        }
        ReportsFormSnippetContentAttachmentPreviewDto reportsFormSnippetContentAttachmentPreviewDto = (ReportsFormSnippetContentAttachmentPreviewDto) obj;
        return this.type == reportsFormSnippetContentAttachmentPreviewDto.type && epx.f(this.sizes, reportsFormSnippetContentAttachmentPreviewDto.sizes) && this.canPlay == reportsFormSnippetContentAttachmentPreviewDto.canPlay && epx.f(this.multiSizes, reportsFormSnippetContentAttachmentPreviewDto.multiSizes);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(this.type.hashCode() * 31, 31, this.sizes), 31, this.canPlay);
        List<List<PhotosPhotoSizesDto>> list = this.multiSizes;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsFormSnippetContentAttachmentPreviewDto(type=");
        sb.append(this.type);
        sb.append(", sizes=");
        sb.append(this.sizes);
        sb.append(", canPlay=");
        sb.append(this.canPlay);
        sb.append(", multiSizes=");
        return ms9.a(')', sb, this.multiSizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.sizes);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.canPlay ? 1 : 0);
        List<List<PhotosPhotoSizesDto>> list = this.multiSizes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            Iterator a3 = ao.a(parcel, (List) f.next());
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
        }
    }

    public /* synthetic */ ReportsFormSnippetContentAttachmentPreviewDto(TypeDto typeDto, List list, boolean z, List list2, int i, zcl zclVar) {
        this(typeDto, list, z, (i & 8) != 0 ? null : list2);
    }
}
