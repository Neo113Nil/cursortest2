package com.vk.clips.viewer.edit.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.models.SdkActionLink;
import xsna.air;
import xsna.epx;
import xsna.vby;

/* compiled from: ClipEditAttachedVideo.kt */
/* loaded from: classes17.dex */
public interface ClipEditAttachedVideo extends Parcelable {

    /* compiled from: ClipEditAttachedVideo.kt */
    @vby
    public static final class Full implements ClipEditAttachedVideo {
        public static final Parcelable.Creator<Full> CREATOR = new a();
        public final SdkActionLink b;

        /* compiled from: ClipEditAttachedVideo.kt */
        public static final class a implements Parcelable.Creator<Full> {
            @Override // android.os.Parcelable.Creator
            public final Full createFromParcel(Parcel parcel) {
                return new Full((SdkActionLink) parcel.readParcelable(Full.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Full[] newArray(int i) {
                return new Full[i];
            }
        }

        public /* synthetic */ Full(SdkActionLink sdkActionLink) {
            this.b = sdkActionLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Full) {
                return epx.f(this.b, ((Full) obj).b);
            }
            return false;
        }

        @Override // com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo
        public final String getId() {
            return this.b.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Full(actionButton=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: ClipEditAttachedVideo.kt */
    @vby
    public static final class RawId implements ClipEditAttachedVideo {
        public static final Parcelable.Creator<RawId> CREATOR = new a();
        public final String b;

        /* compiled from: ClipEditAttachedVideo.kt */
        public static final class a implements Parcelable.Creator<RawId> {
            @Override // android.os.Parcelable.Creator
            public final RawId createFromParcel(Parcel parcel) {
                return new RawId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RawId[] newArray(int i) {
                return new RawId[i];
            }
        }

        public /* synthetic */ RawId(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof RawId) {
                return epx.f(this.b, ((RawId) obj).b);
            }
            return false;
        }

        @Override // com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo
        public final String getId() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return air.b(')', "RawId(id=", this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    String getId();
}
