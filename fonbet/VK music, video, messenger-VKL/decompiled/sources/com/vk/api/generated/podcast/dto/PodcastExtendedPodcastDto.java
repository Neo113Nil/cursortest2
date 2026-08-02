package com.vk.api.generated.podcast.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PodcastExtendedPodcastDto.kt */
/* loaded from: classes15.dex */
public final class PodcastExtendedPodcastDto implements Parcelable {
    public static final Parcelable.Creator<PodcastExtendedPodcastDto> CREATOR = new a();

    @pmi0("editor_annotation")
    private final String editorAnnotation;

    @pmi0("editor_background_image")
    private final List<BaseImageDto> editorBackgroundImage;

    @pmi0("editor_gradient_image")
    private final List<BaseImageDto> editorGradientImage;

    @pmi0("editor_tag")
    private final String editorTag;

    @pmi0("podcast")
    private final PodcastPodcastDto podcast;

    /* compiled from: PodcastExtendedPodcastDto.kt */
    public static final class a implements Parcelable.Creator<PodcastExtendedPodcastDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastExtendedPodcastDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(PodcastExtendedPodcastDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(PodcastExtendedPodcastDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new PodcastExtendedPodcastDto(readString, readString2, arrayList, arrayList2, parcel.readInt() != 0 ? PodcastPodcastDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastExtendedPodcastDto[] newArray(int i) {
            return new PodcastExtendedPodcastDto[i];
        }
    }

    public PodcastExtendedPodcastDto() {
        this(null, null, null, null, null, 31, null);
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
        if (!(obj instanceof PodcastExtendedPodcastDto)) {
            return false;
        }
        PodcastExtendedPodcastDto podcastExtendedPodcastDto = (PodcastExtendedPodcastDto) obj;
        return epx.f(this.editorAnnotation, podcastExtendedPodcastDto.editorAnnotation) && epx.f(this.editorTag, podcastExtendedPodcastDto.editorTag) && epx.f(this.editorBackgroundImage, podcastExtendedPodcastDto.editorBackgroundImage) && epx.f(this.editorGradientImage, podcastExtendedPodcastDto.editorGradientImage) && epx.f(this.podcast, podcastExtendedPodcastDto.podcast);
    }

    public final List<BaseImageDto> f() {
        return this.editorGradientImage;
    }

    public final String g() {
        return this.editorTag;
    }

    public final int hashCode() {
        String str = this.editorAnnotation;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.editorTag;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.editorBackgroundImage;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.editorGradientImage;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PodcastPodcastDto podcastPodcastDto = this.podcast;
        return hashCode4 + (podcastPodcastDto != null ? podcastPodcastDto.hashCode() : 0);
    }

    public final PodcastPodcastDto i() {
        return this.podcast;
    }

    public final String toString() {
        return "PodcastExtendedPodcastDto(editorAnnotation=" + this.editorAnnotation + ", editorTag=" + this.editorTag + ", editorBackgroundImage=" + this.editorBackgroundImage + ", editorGradientImage=" + this.editorGradientImage + ", podcast=" + this.podcast + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        PodcastPodcastDto podcastPodcastDto = this.podcast;
        if (podcastPodcastDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            podcastPodcastDto.writeToParcel(parcel, i);
        }
    }

    public PodcastExtendedPodcastDto(String str, String str2, List<BaseImageDto> list, List<BaseImageDto> list2, PodcastPodcastDto podcastPodcastDto) {
        this.editorAnnotation = str;
        this.editorTag = str2;
        this.editorBackgroundImage = list;
        this.editorGradientImage = list2;
        this.podcast = podcastPodcastDto;
    }

    public /* synthetic */ PodcastExtendedPodcastDto(String str, String str2, List list, List list2, PodcastPodcastDto podcastPodcastDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : podcastPodcastDto);
    }
}
