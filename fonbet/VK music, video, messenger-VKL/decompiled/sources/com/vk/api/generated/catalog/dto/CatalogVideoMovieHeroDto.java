package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogVideoMovieHeroDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoMovieHeroDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoMovieHeroDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<CatalogVideoMoviePageButtonDto> buttons;

    @pmi0("id")
    private final int id;

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final String imageUrl;

    @pmi0(MetaBox.TYPE)
    private final CatalogVideoMovieMetaDto meta;

    @pmi0("target_album")
    private final VideoVideoAlbumFullDto targetAlbum;

    @pmi0("target_trailer")
    private final VideoVideoFullDto targetTrailer;

    @pmi0("target_video")
    private final VideoVideoFullDto targetVideo;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: CatalogVideoMovieHeroDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoMovieHeroDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMovieHeroDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(CatalogVideoMovieHeroDto.class.getClassLoader());
            VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) parcel.readParcelable(CatalogVideoMovieHeroDto.class.getClassLoader());
            VideoVideoAlbumFullDto videoVideoAlbumFullDto = (VideoVideoAlbumFullDto) parcel.readParcelable(CatalogVideoMovieHeroDto.class.getClassLoader());
            String readString2 = parcel.readString();
            CatalogVideoMovieMetaDto createFromParcel = parcel.readInt() == 0 ? null : CatalogVideoMovieMetaDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(CatalogVideoMoviePageButtonDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new CatalogVideoMovieHeroDto(readInt, readString, videoVideoFullDto, videoVideoFullDto2, videoVideoAlbumFullDto, readString2, createFromParcel, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMovieHeroDto[] newArray(int i) {
            return new CatalogVideoMovieHeroDto[i];
        }
    }

    public CatalogVideoMovieHeroDto(int i, String str, VideoVideoFullDto videoVideoFullDto, VideoVideoFullDto videoVideoFullDto2, VideoVideoAlbumFullDto videoVideoAlbumFullDto, String str2, CatalogVideoMovieMetaDto catalogVideoMovieMetaDto, String str3, List<CatalogVideoMoviePageButtonDto> list) {
        this.id = i;
        this.title = str;
        this.targetVideo = videoVideoFullDto;
        this.targetTrailer = videoVideoFullDto2;
        this.targetAlbum = videoVideoAlbumFullDto;
        this.text = str2;
        this.meta = catalogVideoMovieMetaDto;
        this.imageUrl = str3;
        this.buttons = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideoMovieHeroDto)) {
            return false;
        }
        CatalogVideoMovieHeroDto catalogVideoMovieHeroDto = (CatalogVideoMovieHeroDto) obj;
        return this.id == catalogVideoMovieHeroDto.id && epx.f(this.title, catalogVideoMovieHeroDto.title) && epx.f(this.targetVideo, catalogVideoMovieHeroDto.targetVideo) && epx.f(this.targetTrailer, catalogVideoMovieHeroDto.targetTrailer) && epx.f(this.targetAlbum, catalogVideoMovieHeroDto.targetAlbum) && epx.f(this.text, catalogVideoMovieHeroDto.text) && epx.f(this.meta, catalogVideoMovieHeroDto.meta) && epx.f(this.imageUrl, catalogVideoMovieHeroDto.imageUrl) && epx.f(this.buttons, catalogVideoMovieHeroDto.buttons);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        VideoVideoFullDto videoVideoFullDto = this.targetVideo;
        int hashCode = (a2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto2 = this.targetTrailer;
        int hashCode2 = (hashCode + (videoVideoFullDto2 == null ? 0 : videoVideoFullDto2.hashCode())) * 31;
        VideoVideoAlbumFullDto videoVideoAlbumFullDto = this.targetAlbum;
        int hashCode3 = (hashCode2 + (videoVideoAlbumFullDto == null ? 0 : videoVideoAlbumFullDto.hashCode())) * 31;
        String str = this.text;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CatalogVideoMovieMetaDto catalogVideoMovieMetaDto = this.meta;
        int hashCode5 = (hashCode4 + (catalogVideoMovieMetaDto == null ? 0 : catalogVideoMovieMetaDto.hashCode())) * 31;
        String str2 = this.imageUrl;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CatalogVideoMoviePageButtonDto> list = this.buttons;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideoMovieHeroDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", targetVideo=");
        sb.append(this.targetVideo);
        sb.append(", targetTrailer=");
        sb.append(this.targetTrailer);
        sb.append(", targetAlbum=");
        sb.append(this.targetAlbum);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", meta=");
        sb.append(this.meta);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.buttons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.targetVideo, i);
        parcel.writeParcelable(this.targetTrailer, i);
        parcel.writeParcelable(this.targetAlbum, i);
        parcel.writeString(this.text);
        CatalogVideoMovieMetaDto catalogVideoMovieMetaDto = this.meta;
        if (catalogVideoMovieMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogVideoMovieMetaDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.imageUrl);
        List<CatalogVideoMoviePageButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((CatalogVideoMoviePageButtonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogVideoMovieHeroDto(int i, String str, VideoVideoFullDto videoVideoFullDto, VideoVideoFullDto videoVideoFullDto2, VideoVideoAlbumFullDto videoVideoAlbumFullDto, String str2, CatalogVideoMovieMetaDto catalogVideoMovieMetaDto, String str3, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : videoVideoFullDto, (i2 & 8) != 0 ? null : videoVideoFullDto2, (i2 & 16) != 0 ? null : videoVideoAlbumFullDto, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : catalogVideoMovieMetaDto, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : list);
    }
}
