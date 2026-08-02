package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoAccessInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoAccessInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoAccessInfoDto> CREATOR = new a();

    @pmi0("edit_forbidden_reasons")
    private final List<VideoEditForbiddenReasonsDto> editForbiddenReasons;

    /* compiled from: VideoAccessInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoAccessInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAccessInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoEditForbiddenReasonsDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoAccessInfoDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAccessInfoDto[] newArray(int i) {
            return new VideoAccessInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAccessInfoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<VideoEditForbiddenReasonsDto> G1() {
        return this.editForbiddenReasons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAccessInfoDto) && epx.f(this.editForbiddenReasons, ((VideoAccessInfoDto) obj).editForbiddenReasons);
    }

    public final int hashCode() {
        List<VideoEditForbiddenReasonsDto> list = this.editForbiddenReasons;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoAccessInfoDto(editForbiddenReasons="), this.editForbiddenReasons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoEditForbiddenReasonsDto> list = this.editForbiddenReasons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoEditForbiddenReasonsDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoAccessInfoDto(List<VideoEditForbiddenReasonsDto> list) {
        this.editForbiddenReasons = list;
    }

    public /* synthetic */ VideoAccessInfoDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
