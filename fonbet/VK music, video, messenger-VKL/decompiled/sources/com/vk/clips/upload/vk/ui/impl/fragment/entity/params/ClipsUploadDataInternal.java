package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.epx;
import xsna.ur;

/* compiled from: ClipsUploadDataInternal.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadDataInternal implements Parcelable {
    public static final Parcelable.Creator<ClipsUploadDataInternal> CREATOR = new a();
    public final ClipsEncoderParameters b;
    public final ClipsUploadUnmodifiableData c;
    public final ClipsUploadStaticData d;
    public final ClipsUploadAuthorRelatedData e;
    public final Set<Object> f;

    /* compiled from: ClipsUploadDataInternal.kt */
    public static final class a implements Parcelable.Creator<ClipsUploadDataInternal> {
        @Override // android.os.Parcelable.Creator
        public final ClipsUploadDataInternal createFromParcel(Parcel parcel) {
            ClipsEncoderParameters clipsEncoderParameters = (ClipsEncoderParameters) parcel.readParcelable(ClipsUploadDataInternal.class.getClassLoader());
            ClipsUploadUnmodifiableData createFromParcel = ClipsUploadUnmodifiableData.CREATOR.createFromParcel(parcel);
            ClipsUploadStaticData createFromParcel2 = ClipsUploadStaticData.CREATOR.createFromParcel(parcel);
            ClipsUploadAuthorRelatedData createFromParcel3 = ClipsUploadAuthorRelatedData.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readParcelable(ClipsUploadDataInternal.class.getClassLoader()));
            }
            return new ClipsUploadDataInternal(clipsEncoderParameters, createFromParcel, createFromParcel2, createFromParcel3, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsUploadDataInternal[] newArray(int i) {
            return new ClipsUploadDataInternal[i];
        }
    }

    public ClipsUploadDataInternal(ClipsEncoderParameters clipsEncoderParameters, ClipsUploadUnmodifiableData clipsUploadUnmodifiableData, ClipsUploadStaticData clipsUploadStaticData, ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData, Set<Object> set) {
        this.b = clipsEncoderParameters;
        this.c = clipsUploadUnmodifiableData;
        this.d = clipsUploadStaticData;
        this.e = clipsUploadAuthorRelatedData;
        this.f = set;
    }

    public static ClipsUploadDataInternal a(ClipsUploadDataInternal clipsUploadDataInternal, ClipsEncoderParameters clipsEncoderParameters, ClipsUploadUnmodifiableData clipsUploadUnmodifiableData, ClipsUploadStaticData clipsUploadStaticData, ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData, int i) {
        if ((i & 1) != 0) {
            clipsEncoderParameters = clipsUploadDataInternal.b;
        }
        ClipsEncoderParameters clipsEncoderParameters2 = clipsEncoderParameters;
        if ((i & 2) != 0) {
            clipsUploadUnmodifiableData = clipsUploadDataInternal.c;
        }
        ClipsUploadUnmodifiableData clipsUploadUnmodifiableData2 = clipsUploadUnmodifiableData;
        if ((i & 4) != 0) {
            clipsUploadStaticData = clipsUploadDataInternal.d;
        }
        ClipsUploadStaticData clipsUploadStaticData2 = clipsUploadStaticData;
        if ((i & 8) != 0) {
            clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
        }
        Set<Object> set = clipsUploadDataInternal.f;
        clipsUploadDataInternal.getClass();
        return new ClipsUploadDataInternal(clipsEncoderParameters2, clipsUploadUnmodifiableData2, clipsUploadStaticData2, clipsUploadAuthorRelatedData, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsUploadDataInternal)) {
            return false;
        }
        ClipsUploadDataInternal clipsUploadDataInternal = (ClipsUploadDataInternal) obj;
        return epx.f(this.b, clipsUploadDataInternal.b) && epx.f(this.c, clipsUploadDataInternal.c) && epx.f(this.d, clipsUploadDataInternal.d) && epx.f(this.e, clipsUploadDataInternal.e) && epx.f(this.f, clipsUploadDataInternal.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadDataInternal(encoderParams=");
        sb.append(this.b);
        sb.append(", unmodifiableData=");
        sb.append(this.c);
        sb.append(", staticData=");
        sb.append(this.d);
        sb.append(", authorRelatedData=");
        sb.append(this.e);
        sb.append(", enabledFeatures=");
        return ur.c(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        Set<Object> set = this.f;
        parcel.writeInt(set.size());
        Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
