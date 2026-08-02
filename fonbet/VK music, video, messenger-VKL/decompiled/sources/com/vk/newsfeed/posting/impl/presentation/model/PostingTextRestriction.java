package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PostingTextRestriction.kt */
/* loaded from: classes4.dex */
public abstract class PostingTextRestriction implements Parcelable {

    /* compiled from: PostingTextRestriction.kt */
    public static final class Invisible extends PostingTextRestriction {
        public static final Invisible b = new Invisible(null);
        public static final Parcelable.Creator<Invisible> CREATOR = new a();

        /* compiled from: PostingTextRestriction.kt */
        public static final class a implements Parcelable.Creator<Invisible> {
            @Override // android.os.Parcelable.Creator
            public final Invisible createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Invisible.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Invisible[] newArray(int i) {
                return new Invisible[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Invisible);
        }

        public final int hashCode() {
            return -1926448572;
        }

        public final String toString() {
            return "Invisible";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PostingTextRestriction.kt */
    public static abstract class Visible extends PostingTextRestriction {
        public final int b;
        public final int c;

        /* compiled from: PostingTextRestriction.kt */
        public static final class NotRestricted extends Visible {
            public static final Parcelable.Creator<NotRestricted> CREATOR = new a();
            public final int d;
            public final int e;

            /* compiled from: PostingTextRestriction.kt */
            public static final class a implements Parcelable.Creator<NotRestricted> {
                @Override // android.os.Parcelable.Creator
                public final NotRestricted createFromParcel(Parcel parcel) {
                    return new NotRestricted(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final NotRestricted[] newArray(int i) {
                    return new NotRestricted[i];
                }
            }

            public NotRestricted(int i, int i2) {
                super(i, i2);
                this.d = i;
                this.e = i2;
            }

            @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction.Visible
            public final int d() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction.Visible
            public final int e() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NotRestricted)) {
                    return false;
                }
                NotRestricted notRestricted = (NotRestricted) obj;
                return this.d == notRestricted.d && this.e == notRestricted.e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NotRestricted(inputTextLength=");
                sb.append(this.d);
                sb.append(", maxLength=");
                return vu5.b(sb, this.e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.d);
                parcel.writeInt(this.e);
            }
        }

        /* compiled from: PostingTextRestriction.kt */
        public static final class Restricted extends Visible {
            public static final Parcelable.Creator<Restricted> CREATOR = new a();
            public final int d;
            public final int e;

            /* compiled from: PostingTextRestriction.kt */
            public static final class a implements Parcelable.Creator<Restricted> {
                @Override // android.os.Parcelable.Creator
                public final Restricted createFromParcel(Parcel parcel) {
                    return new Restricted(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Restricted[] newArray(int i) {
                    return new Restricted[i];
                }
            }

            public Restricted(int i, int i2) {
                super(i, i2);
                this.d = i;
                this.e = i2;
            }

            @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction.Visible
            public final int d() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction.Visible
            public final int e() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Restricted)) {
                    return false;
                }
                Restricted restricted = (Restricted) obj;
                return this.d == restricted.d && this.e == restricted.e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Restricted(inputTextLength=");
                sb.append(this.d);
                sb.append(", maxLength=");
                return vu5.b(sb, this.e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.d);
                parcel.writeInt(this.e);
            }
        }

        public Visible(int i, int i2) {
            super(null);
            this.b = i;
            this.c = i2;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.c;
        }
    }

    public /* synthetic */ PostingTextRestriction(zcl zclVar) {
        this();
    }

    public PostingTextRestriction() {
    }
}
