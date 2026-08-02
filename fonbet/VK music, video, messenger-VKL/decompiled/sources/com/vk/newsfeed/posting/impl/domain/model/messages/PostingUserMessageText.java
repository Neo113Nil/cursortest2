package com.vk.newsfeed.posting.impl.domain.model.messages;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.vu5;

/* compiled from: PostingUserMessageText.kt */
/* loaded from: classes4.dex */
public interface PostingUserMessageText extends Parcelable {

    /* compiled from: PostingUserMessageText.kt */
    public static final class ResText implements PostingUserMessageText {
        public static final Parcelable.Creator<ResText> CREATOR = new a();
        public final int b;

        /* compiled from: PostingUserMessageText.kt */
        public static final class a implements Parcelable.Creator<ResText> {
            @Override // android.os.Parcelable.Creator
            public final ResText createFromParcel(Parcel parcel) {
                return new ResText(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ResText[] newArray(int i) {
                return new ResText[i];
            }
        }

        public ResText(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResText) && this.b == ((ResText) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ResText(resId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: PostingUserMessageText.kt */
    public static final class StringText implements PostingUserMessageText {
        public static final Parcelable.Creator<StringText> CREATOR = new a();
        public final String b;

        /* compiled from: PostingUserMessageText.kt */
        public static final class a implements Parcelable.Creator<StringText> {
            @Override // android.os.Parcelable.Creator
            public final StringText createFromParcel(Parcel parcel) {
                return new StringText(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StringText[] newArray(int i) {
                return new StringText[i];
            }
        }

        public StringText(String str) {
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
            return (obj instanceof StringText) && epx.f(this.b, ((StringText) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("StringText(text="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
