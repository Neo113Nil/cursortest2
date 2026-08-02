package com.vk.dto.stories.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: StorySessionParams.kt */
/* loaded from: classes18.dex */
public final class StorySessionParams implements Parcelable {
    public static final Parcelable.Creator<StorySessionParams> CREATOR = new a();
    public final Long b;
    public final String c;
    public final String d;

    /* compiled from: StorySessionParams.kt */
    public static final class a implements Parcelable.Creator<StorySessionParams> {
        @Override // android.os.Parcelable.Creator
        public final StorySessionParams createFromParcel(Parcel parcel) {
            return new StorySessionParams(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StorySessionParams[] newArray(int i) {
            return new StorySessionParams[i];
        }
    }

    public StorySessionParams(Long l, String str, String str2) {
        this.b = l;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorySessionParams)) {
            return false;
        }
        StorySessionParams storySessionParams = (StorySessionParams) obj;
        return epx.f(this.b, storySessionParams.b) && epx.f(this.c, storySessionParams.c) && epx.f(this.d, storySessionParams.d);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorySessionParams(storyPublisherSession=");
        sb.append(this.b);
        sb.append(", cameraAccessStatus=");
        sb.append(this.c);
        sb.append(", galleryAccessStatus=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
