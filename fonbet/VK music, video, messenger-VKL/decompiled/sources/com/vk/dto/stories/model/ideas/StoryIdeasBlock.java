package com.vk.dto.stories.model.ideas;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.urd0;

/* compiled from: StoryIdeasBlock.kt */
/* loaded from: classes18.dex */
public final class StoryIdeasBlock implements Parcelable {
    public static final Parcelable.Creator<StoryIdeasBlock> CREATOR = new a();
    public final List<StoryIdea> b;
    public final String c;
    public final Integer d;
    public final String e;

    /* compiled from: StoryIdeasBlock.kt */
    public static final class a implements Parcelable.Creator<StoryIdeasBlock> {
        @Override // android.os.Parcelable.Creator
        public final StoryIdeasBlock createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoryIdea.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoryIdeasBlock(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryIdeasBlock[] newArray(int i) {
            return new StoryIdeasBlock[i];
        }
    }

    public StoryIdeasBlock(List<StoryIdea> list, String str, Integer num, String str2) {
        this.b = list;
        this.c = str;
        this.d = num;
        this.e = str2;
    }

    public static StoryIdeasBlock a(StoryIdeasBlock storyIdeasBlock, ArrayList arrayList) {
        String str = storyIdeasBlock.c;
        Integer num = storyIdeasBlock.d;
        String str2 = storyIdeasBlock.e;
        storyIdeasBlock.getClass();
        return new StoryIdeasBlock(arrayList, str, num, str2);
    }

    public final List<StoryIdea> d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryIdeasBlock)) {
            return false;
        }
        StoryIdeasBlock storyIdeasBlock = (StoryIdeasBlock) obj;
        return epx.f(this.b, storyIdeasBlock.b) && epx.f(this.c, storyIdeasBlock.c) && epx.f(this.d, storyIdeasBlock.d) && epx.f(this.e, storyIdeasBlock.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        Integer num = this.d;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryIdeasBlock(items=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((StoryIdea) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.e);
    }
}
