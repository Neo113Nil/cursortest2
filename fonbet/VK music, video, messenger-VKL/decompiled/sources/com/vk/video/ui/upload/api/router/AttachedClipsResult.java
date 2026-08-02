package com.vk.video.ui.upload.api.router;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;

/* compiled from: AttachedClipsArguments.kt */
/* loaded from: classes7.dex */
public final class AttachedClipsResult implements Parcelable {
    public static final Parcelable.Creator<AttachedClipsResult> CREATOR = new a();
    public final List<VideoFile> b;

    /* compiled from: AttachedClipsArguments.kt */
    public static final class a implements Parcelable.Creator<AttachedClipsResult> {
        @Override // android.os.Parcelable.Creator
        public final AttachedClipsResult createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AttachedClipsResult.class, parcel, arrayList, i, 1);
            }
            return new AttachedClipsResult(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AttachedClipsResult[] newArray(int i) {
            return new AttachedClipsResult[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachedClipsResult(List<? extends VideoFile> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AttachedClipsResult) && epx.f(this.b, ((AttachedClipsResult) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AttachedClipsResult(attachedClips="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
