package com.vk.video.ui.upload.impl.publish.presentation.author.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: AuthorArguments.kt */
/* loaded from: classes7.dex */
public interface AuthorResult extends Parcelable {

    /* compiled from: AuthorArguments.kt */
    public static final class CreatingNewChannel implements AuthorResult {
        public static final CreatingNewChannel b = new CreatingNewChannel();
        public static final Parcelable.Creator<CreatingNewChannel> CREATOR = new a();

        /* compiled from: AuthorArguments.kt */
        public static final class a implements Parcelable.Creator<CreatingNewChannel> {
            @Override // android.os.Parcelable.Creator
            public final CreatingNewChannel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CreatingNewChannel.b;
            }

            @Override // android.os.Parcelable.Creator
            public final CreatingNewChannel[] newArray(int i) {
                return new CreatingNewChannel[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreatingNewChannel);
        }

        public final int hashCode() {
            return 1497079022;
        }

        public final String toString() {
            return "CreatingNewChannel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AuthorArguments.kt */
    public static final class Picked implements AuthorResult {
        public static final Parcelable.Creator<Picked> CREATOR = new a();
        public final UserId b;

        /* compiled from: AuthorArguments.kt */
        public static final class a implements Parcelable.Creator<Picked> {
            @Override // android.os.Parcelable.Creator
            public final Picked createFromParcel(Parcel parcel) {
                return new Picked((UserId) parcel.readParcelable(Picked.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Picked[] newArray(int i) {
                return new Picked[i];
            }
        }

        public Picked(UserId userId) {
            this.b = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Picked) && epx.f(this.b, ((Picked) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Picked(userId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }
}
