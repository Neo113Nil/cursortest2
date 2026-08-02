package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import defpackage.q0;
import xsna.bh10;

/* compiled from: ClipsPreviewData.kt */
/* loaded from: classes17.dex */
public final class ClipsPreviewData implements Parcelable {
    public static final Parcelable.Creator<ClipsPreviewData> CREATOR = new a();
    public final MobileOfficialAppsClipsStat$ChangePreview.PreviewType b;
    public final long c;
    public final boolean d;

    /* compiled from: ClipsPreviewData.kt */
    public static final class a implements Parcelable.Creator<ClipsPreviewData> {
        @Override // android.os.Parcelable.Creator
        public final ClipsPreviewData createFromParcel(Parcel parcel) {
            return new ClipsPreviewData(MobileOfficialAppsClipsStat$ChangePreview.PreviewType.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsPreviewData[] newArray(int i) {
            return new ClipsPreviewData[i];
        }
    }

    public ClipsPreviewData(MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType, long j, boolean z) {
        this.b = previewType;
        this.c = j;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsPreviewData)) {
            return false;
        }
        ClipsPreviewData clipsPreviewData = (ClipsPreviewData) obj;
        return this.b == clipsPreviewData.b && this.c == clipsPreviewData.c && this.d == clipsPreviewData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPreviewData(previewType=");
        sb.append(this.b);
        sb.append(", previewTimestampMs=");
        sb.append(this.c);
        sb.append(", isPreviewFromGallery=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
