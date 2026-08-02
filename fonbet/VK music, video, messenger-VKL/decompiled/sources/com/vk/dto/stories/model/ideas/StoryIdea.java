package com.vk.dto.stories.model.ideas;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: StoryIdea.kt */
/* loaded from: classes18.dex */
public final class StoryIdea implements Parcelable {
    public static final Parcelable.Creator<StoryIdea> CREATOR = new a();
    public final String b;
    public final StoryIdeaPayload c;
    public final String d;
    public final int e;

    /* compiled from: StoryIdea.kt */
    public static final class a implements Parcelable.Creator<StoryIdea> {
        @Override // android.os.Parcelable.Creator
        public final StoryIdea createFromParcel(Parcel parcel) {
            return new StoryIdea(parcel.readString(), (StoryIdeaPayload) parcel.readParcelable(StoryIdea.class.getClassLoader()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryIdea[] newArray(int i) {
            return new StoryIdea[i];
        }
    }

    public StoryIdea(String str, StoryIdeaPayload storyIdeaPayload, String str2, int i) {
        this.b = str;
        this.c = storyIdeaPayload;
        this.d = str2;
        this.e = i;
    }

    public final StoryIdeaPayload d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryIdea)) {
            return false;
        }
        StoryIdea storyIdea = (StoryIdea) obj;
        return epx.f(this.b, storyIdea.b) && epx.f(this.c, storyIdea.c) && epx.f(this.d, storyIdea.d) && this.e == storyIdea.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryIdea(id=");
        sb.append(this.b);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", storybox=");
        sb.append(this.d);
        sb.append(", expiresAt=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
