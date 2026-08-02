package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogCatalogVideoDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCatalogVideoDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCatalogVideoDto> CREATOR = new a();

    @pmi0("snippet_marks")
    private final List<CatalogVideoSnippetMarkDto> snippetMarks;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: CatalogCatalogVideoDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCatalogVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogVideoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(CatalogVideoSnippetMarkDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogCatalogVideoDto(arrayList, (VideoVideoFullDto) parcel.readParcelable(CatalogCatalogVideoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogVideoDto[] newArray(int i) {
            return new CatalogCatalogVideoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogCatalogVideoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCatalogVideoDto)) {
            return false;
        }
        CatalogCatalogVideoDto catalogCatalogVideoDto = (CatalogCatalogVideoDto) obj;
        return epx.f(this.snippetMarks, catalogCatalogVideoDto.snippetMarks) && epx.f(this.video, catalogCatalogVideoDto.video);
    }

    public final int hashCode() {
        List<CatalogVideoSnippetMarkDto> list = this.snippetMarks;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        return hashCode + (videoVideoFullDto != null ? videoVideoFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogCatalogVideoDto(snippetMarks=" + this.snippetMarks + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CatalogVideoSnippetMarkDto> list = this.snippetMarks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogVideoSnippetMarkDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.video, i);
    }

    public CatalogCatalogVideoDto(List<CatalogVideoSnippetMarkDto> list, VideoVideoFullDto videoVideoFullDto) {
        this.snippetMarks = list;
        this.video = videoVideoFullDto;
    }

    public /* synthetic */ CatalogCatalogVideoDto(List list, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : videoVideoFullDto);
    }
}
