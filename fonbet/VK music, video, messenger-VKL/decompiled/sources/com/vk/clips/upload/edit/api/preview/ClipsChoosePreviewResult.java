package com.vk.clips.upload.edit.api.preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.upload.edit.api.ClipCoverPreviewType;
import java.io.File;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClipsChoosePreviewResult.kt */
/* loaded from: classes17.dex */
public final class ClipsChoosePreviewResult implements Parcelable {
    public static final Parcelable.Creator<ClipsChoosePreviewResult> CREATOR = new a();
    public final File b;
    public final boolean c;
    public final long d;
    public final ClipCoverPreviewType e;

    /* compiled from: ClipsChoosePreviewResult.kt */
    public static final class a implements Parcelable.Creator<ClipsChoosePreviewResult> {
        @Override // android.os.Parcelable.Creator
        public final ClipsChoosePreviewResult createFromParcel(Parcel parcel) {
            return new ClipsChoosePreviewResult((File) parcel.readSerializable(), parcel.readInt() != 0, parcel.readLong(), ClipCoverPreviewType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsChoosePreviewResult[] newArray(int i) {
            return new ClipsChoosePreviewResult[i];
        }
    }

    public ClipsChoosePreviewResult() {
        this(null, false, 0L, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsChoosePreviewResult)) {
            return false;
        }
        ClipsChoosePreviewResult clipsChoosePreviewResult = (ClipsChoosePreviewResult) obj;
        return epx.f(this.b, clipsChoosePreviewResult.b) && this.c == clipsChoosePreviewResult.c && this.d == clipsChoosePreviewResult.d && this.e == clipsChoosePreviewResult.e;
    }

    public final int hashCode() {
        File file = this.b;
        return this.e.hashCode() + bh10.a(qoy.b((file == null ? 0 : file.hashCode()) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ClipsChoosePreviewResult(file=" + this.b + ", fromGallery=" + this.c + ", timestampMs=" + this.d + ", previewType=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        this.e.writeToParcel(parcel, i);
    }

    public ClipsChoosePreviewResult(File file, boolean z, long j, ClipCoverPreviewType clipCoverPreviewType) {
        this.b = file;
        this.c = z;
        this.d = j;
        this.e = clipCoverPreviewType;
    }

    public /* synthetic */ ClipsChoosePreviewResult(File file, boolean z, long j, ClipCoverPreviewType clipCoverPreviewType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? ClipCoverPreviewType.FIRST_FRAME : clipCoverPreviewType);
    }
}
