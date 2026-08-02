package com.vk.dto.stories.model.ideas;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.gp;
import xsna.ms9;
import xsna.zcl;

/* compiled from: StoryIdeaPayload.kt */
/* loaded from: classes18.dex */
public abstract class StoryIdeaPayload implements Parcelable {

    /* compiled from: StoryIdeaPayload.kt */
    public static final class Birthday extends StoryIdeaPayload {
        public static final Parcelable.Creator<Birthday> CREATOR = new a();
        public final UserId b;

        /* compiled from: StoryIdeaPayload.kt */
        public static final class a implements Parcelable.Creator<Birthday> {
            @Override // android.os.Parcelable.Creator
            public final Birthday createFromParcel(Parcel parcel) {
                return new Birthday((UserId) parcel.readParcelable(Birthday.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Birthday[] newArray(int i) {
                return new Birthday[i];
            }
        }

        public Birthday(UserId userId) {
            super(null);
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
            return (obj instanceof Birthday) && epx.f(this.b, ((Birthday) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Birthday(userId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: StoryIdeaPayload.kt */
    public static final class Gallery extends StoryIdeaPayload {
        public static final Parcelable.Creator<Gallery> CREATOR = new a();
        public final List<String> b;

        /* compiled from: StoryIdeaPayload.kt */
        public static final class a implements Parcelable.Creator<Gallery> {
            @Override // android.os.Parcelable.Creator
            public final Gallery createFromParcel(Parcel parcel) {
                return new Gallery(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Gallery[] newArray(int i) {
                return new Gallery[i];
            }
        }

        public Gallery(List<String> list) {
            super(null);
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Gallery) && epx.f(this.b, ((Gallery) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Gallery(themes="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.b);
        }
    }

    /* compiled from: StoryIdeaPayload.kt */
    public static final class Music extends StoryIdeaPayload {
        public static final Music b = new Music(null);
        public static final Parcelable.Creator<Music> CREATOR = new a();

        /* compiled from: StoryIdeaPayload.kt */
        public static final class a implements Parcelable.Creator<Music> {
            @Override // android.os.Parcelable.Creator
            public final Music createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Music.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Music[] newArray(int i) {
                return new Music[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Music);
        }

        public final int hashCode() {
            return -704432602;
        }

        public final String toString() {
            return "Music";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ StoryIdeaPayload(zcl zclVar) {
        this();
    }

    public StoryIdeaPayload() {
    }
}
