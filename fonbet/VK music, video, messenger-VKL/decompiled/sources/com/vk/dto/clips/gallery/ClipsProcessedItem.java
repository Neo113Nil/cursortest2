package com.vk.dto.clips.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.media.MediaUtils;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.zcl;

/* compiled from: ClipsProcessedItem.kt */
/* loaded from: classes18.dex */
public final class ClipsProcessedItem implements Parcelable {
    public static final Parcelable.Creator<ClipsProcessedItem> CREATOR = new a();
    public final String b;
    public final long c;
    public final TranscodingState d;
    public final MediaUtils.AudioConfigLight e;
    public final ClipsVideoItemLocation f;
    public final boolean g;

    /* compiled from: ClipsProcessedItem.kt */
    public static final class a implements Parcelable.Creator<ClipsProcessedItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipsProcessedItem createFromParcel(Parcel parcel) {
            return new ClipsProcessedItem(parcel.readString(), parcel.readLong(), TranscodingState.valueOf(parcel.readString()), (MediaUtils.AudioConfigLight) parcel.readParcelable(ClipsProcessedItem.class.getClassLoader()), parcel.readInt() == 0 ? null : ClipsVideoItemLocation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsProcessedItem[] newArray(int i) {
            return new ClipsProcessedItem[i];
        }
    }

    public ClipsProcessedItem(String str, long j, TranscodingState transcodingState, MediaUtils.AudioConfigLight audioConfigLight, ClipsVideoItemLocation clipsVideoItemLocation, boolean z) {
        this.b = str;
        this.c = j;
        this.d = transcodingState;
        this.e = audioConfigLight;
        this.f = clipsVideoItemLocation;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsProcessedItem)) {
            return false;
        }
        ClipsProcessedItem clipsProcessedItem = (ClipsProcessedItem) obj;
        return epx.f(this.b, clipsProcessedItem.b) && this.c == clipsProcessedItem.c && this.d == clipsProcessedItem.d && epx.f(this.e, clipsProcessedItem.e) && epx.f(this.f, clipsProcessedItem.f) && this.g == clipsProcessedItem.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + bh10.a(this.b.hashCode() * 31, 31, this.c)) * 31;
        MediaUtils.AudioConfigLight audioConfigLight = this.e;
        int hashCode2 = (hashCode + (audioConfigLight == null ? 0 : audioConfigLight.hashCode())) * 31;
        ClipsVideoItemLocation clipsVideoItemLocation = this.f;
        return Boolean.hashCode(this.g) + ((hashCode2 + (clipsVideoItemLocation != null ? clipsVideoItemLocation.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsProcessedItem(fileUri=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", transcodingState=");
        sb.append(this.d);
        sb.append(", audioConfig=");
        sb.append(this.e);
        sb.append(", originFileLocation=");
        sb.append(this.f);
        sb.append(", fromPhoto=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d.name());
        parcel.writeParcelable(this.e, i);
        ClipsVideoItemLocation clipsVideoItemLocation = this.f;
        if (clipsVideoItemLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipsVideoItemLocation.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ ClipsProcessedItem(String str, long j, TranscodingState transcodingState, MediaUtils.AudioConfigLight audioConfigLight, ClipsVideoItemLocation clipsVideoItemLocation, boolean z, int i, zcl zclVar) {
        this(str, j, (i & 4) != 0 ? TranscodingState.GALLERY_NOT_TRANSCODED : transcodingState, (i & 8) != 0 ? null : audioConfigLight, (i & 16) != 0 ? null : clipsVideoItemLocation, (i & 32) != 0 ? false : z);
    }
}
