package com.vk.video.ui.upload.impl.videoviewer.presentation.fragment;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.alb0;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoViewerArguments.kt */
/* loaded from: classes7.dex */
public interface VideoViewerArguments extends Parcelable {

    /* compiled from: VideoViewerArguments.kt */
    public static final class Local implements VideoViewerArguments {
        public static final Parcelable.Creator<Local> CREATOR = new a();
        public final Uri b;

        /* compiled from: VideoViewerArguments.kt */
        public static final class a implements Parcelable.Creator<Local> {
            @Override // android.os.Parcelable.Creator
            public final Local createFromParcel(Parcel parcel) {
                return new Local((Uri) parcel.readParcelable(Local.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Local[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(Uri uri) {
            this.b = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && epx.f(this.b, ((Local) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return alb0.b(new StringBuilder("Local(videoUri="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: VideoViewerArguments.kt */
    public static final class RemoteAttachedClip implements VideoViewerArguments {
        public static final Parcelable.Creator<RemoteAttachedClip> CREATOR = new a();
        public final String b;

        /* compiled from: VideoViewerArguments.kt */
        public static final class a implements Parcelable.Creator<RemoteAttachedClip> {
            @Override // android.os.Parcelable.Creator
            public final RemoteAttachedClip createFromParcel(Parcel parcel) {
                return new RemoteAttachedClip(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RemoteAttachedClip[] newArray(int i) {
                return new RemoteAttachedClip[i];
            }
        }

        public RemoteAttachedClip(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteAttachedClip) && epx.f(this.b, ((RemoteAttachedClip) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RemoteAttachedClip(videoId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
