package com.vk.dto.stories.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.shy;

/* compiled from: StoryTemplatesContainerData.kt */
/* loaded from: classes18.dex */
public final class StoryTemplatesContainerData implements Parcelable {
    public static final Parcelable.Creator<StoryTemplatesContainerData> CREATOR = new a();
    public final int b;
    public final int c;
    public final List<StoryTemplateData> d;

    /* compiled from: StoryTemplatesContainerData.kt */
    public static final class a implements Parcelable.Creator<StoryTemplatesContainerData> {
        @Override // android.os.Parcelable.Creator
        public final StoryTemplatesContainerData createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(StoryTemplateData.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoryTemplatesContainerData(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryTemplatesContainerData[] newArray(int i) {
            return new StoryTemplatesContainerData[i];
        }
    }

    public StoryTemplatesContainerData(int i, int i2, List<StoryTemplateData> list) {
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryTemplatesContainerData)) {
            return false;
        }
        StoryTemplatesContainerData storyTemplatesContainerData = (StoryTemplatesContainerData) obj;
        return this.b == storyTemplatesContainerData.b && this.c == storyTemplatesContainerData.c && epx.f(this.d, storyTemplatesContainerData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryTemplatesContainerData(totalCount=");
        sb.append(this.b);
        sb.append(", newTemplatesCount=");
        sb.append(this.c);
        sb.append(", items=");
        return ms9.a(')', sb, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            ((StoryTemplateData) a2.next()).writeToParcel(parcel, i);
        }
    }
}
