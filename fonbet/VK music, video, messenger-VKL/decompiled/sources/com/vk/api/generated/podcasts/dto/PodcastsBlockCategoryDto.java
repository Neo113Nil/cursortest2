package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PodcastsBlockCategoryDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsBlockCategoryDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsBlockCategoryDto> CREATOR = new a();

    @pmi0("cover")
    private final PodcastsItemCoverDto cover;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("name_ru")
    private final String nameRu;

    /* compiled from: PodcastsBlockCategoryDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsBlockCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockCategoryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            PodcastsItemCoverDto createFromParcel = PodcastsItemCoverDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(PodcastsBlockCategoryDto.class, parcel, arrayList, i, 1);
                }
            }
            return new PodcastsBlockCategoryDto(readInt, readString, readString2, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockCategoryDto[] newArray(int i) {
            return new PodcastsBlockCategoryDto[i];
        }
    }

    public PodcastsBlockCategoryDto(int i, String str, String str2, PodcastsItemCoverDto podcastsItemCoverDto, List<BaseImageDto> list) {
        this.id = i;
        this.name = str;
        this.nameRu = str2;
        this.cover = podcastsItemCoverDto;
        this.icon = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsBlockCategoryDto)) {
            return false;
        }
        PodcastsBlockCategoryDto podcastsBlockCategoryDto = (PodcastsBlockCategoryDto) obj;
        return this.id == podcastsBlockCategoryDto.id && epx.f(this.name, podcastsBlockCategoryDto.name) && epx.f(this.nameRu, podcastsBlockCategoryDto.nameRu) && epx.f(this.cover, podcastsBlockCategoryDto.cover) && epx.f(this.icon, podcastsBlockCategoryDto.icon);
    }

    public final int hashCode() {
        int hashCode = (this.cover.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.nameRu)) * 31;
        List<BaseImageDto> list = this.icon;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastsBlockCategoryDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", nameRu=");
        sb.append(this.nameRu);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", icon=");
        return ms9.a(')', sb, this.icon);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.nameRu);
        this.cover.writeToParcel(parcel, i);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ PodcastsBlockCategoryDto(int i, String str, String str2, PodcastsItemCoverDto podcastsItemCoverDto, List list, int i2, zcl zclVar) {
        this(i, str, str2, podcastsItemCoverDto, (i2 & 16) != 0 ? null : list);
    }
}
