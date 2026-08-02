package com.vk.superapp.ui.widgets.subscribe_tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: SubscribeTileIcon.kt */
/* loaded from: classes6.dex */
public abstract class SubIcon implements Parcelable {

    /* compiled from: SubscribeTileIcon.kt */
    public static final class Icon extends SubIcon {
        public static final Parcelable.Creator<Icon> CREATOR = new a();
        public final WebImage b;

        /* compiled from: SubscribeTileIcon.kt */
        public static final class a implements Parcelable.Creator<Icon> {
            @Override // android.os.Parcelable.Creator
            public final Icon createFromParcel(Parcel parcel) {
                return new Icon((WebImage) parcel.readParcelable(Icon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Icon[] newArray(int i) {
                return new Icon[i];
            }
        }

        public Icon(WebImage webImage) {
            super(null);
            this.b = webImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Icon) && epx.f(this.b, ((Icon) obj).b);
        }

        public final int hashCode() {
            WebImage webImage = this.b;
            if (webImage == null) {
                return 0;
            }
            return webImage.b.hashCode();
        }

        public final String toString() {
            return "Icon(images=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: SubscribeTileIcon.kt */
    public static final class Number extends SubIcon {
        public static final Parcelable.Creator<Number> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: SubscribeTileIcon.kt */
        public static final class a implements Parcelable.Creator<Number> {
            @Override // android.os.Parcelable.Creator
            public final Number createFromParcel(Parcel parcel) {
                return new Number(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Number[] newArray(int i) {
                return new Number[i];
            }
        }

        public Number(String str, String str2) {
            super(null);
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Number)) {
                return false;
            }
            Number number = (Number) obj;
            return epx.f(this.b, number.b) && epx.f(this.c, number.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Number(content=");
            sb.append(this.b);
            sb.append(", backgroundColor=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: SubscribeTileIcon.kt */
    public static final class Verified extends SubIcon {
        public static final Verified b = new Verified(null);
        public static final Parcelable.Creator<Verified> CREATOR = new a();

        /* compiled from: SubscribeTileIcon.kt */
        public static final class a implements Parcelable.Creator<Verified> {
            @Override // android.os.Parcelable.Creator
            public final Verified createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Verified.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Verified[] newArray(int i) {
                return new Verified[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SubscribeTileIcon.kt */
    public static final class VideoLive extends SubIcon {
        public static final VideoLive b = new VideoLive(null);
        public static final Parcelable.Creator<VideoLive> CREATOR = new a();

        /* compiled from: SubscribeTileIcon.kt */
        public static final class a implements Parcelable.Creator<VideoLive> {
            @Override // android.os.Parcelable.Creator
            public final VideoLive createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VideoLive.b;
            }

            @Override // android.os.Parcelable.Creator
            public final VideoLive[] newArray(int i) {
                return new VideoLive[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ SubIcon(zcl zclVar) {
        this();
    }

    public SubIcon() {
    }
}
