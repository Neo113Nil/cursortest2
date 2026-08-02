package com.vk.dto.stories.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.nr;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;

/* compiled from: StoryTemplatesContainerData.kt */
/* loaded from: classes18.dex */
public final class StoryTemplateData implements Parcelable {
    public static final Parcelable.Creator<StoryTemplateData> CREATOR = new a();
    public final int b;
    public final String c;
    public final Image d;
    public final String e;
    public final boolean f;
    public final Integer g;

    /* compiled from: StoryTemplatesContainerData.kt */
    public static final class a implements Parcelable.Creator<StoryTemplateData> {
        @Override // android.os.Parcelable.Creator
        public final StoryTemplateData createFromParcel(Parcel parcel) {
            return new StoryTemplateData(parcel.readInt(), parcel.readString(), (Image) parcel.readParcelable(StoryTemplateData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoryTemplateData[] newArray(int i) {
            return new StoryTemplateData[i];
        }
    }

    public StoryTemplateData(int i, String str, Image image, String str2, boolean z, Integer num) {
        this.b = i;
        this.c = str;
        this.d = image;
        this.e = str2;
        this.f = z;
        this.g = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryTemplateData)) {
            return false;
        }
        StoryTemplateData storyTemplateData = (StoryTemplateData) obj;
        return this.b == storyTemplateData.b && epx.f(this.c, storyTemplateData.c) && epx.f(this.d, storyTemplateData.d) && epx.f(this.e, storyTemplateData.e) && this.f == storyTemplateData.f && epx.f(this.g, storyTemplateData.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.d;
        int b = qoy.b(urd0.a((hashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.e), 31, this.f);
        Integer num = this.g;
        return b + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryTemplateData(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", preview=");
        sb.append(this.d);
        sb.append(", storyBoxUrl=");
        sb.append(this.e);
        sb.append(", isNew=");
        sb.append(this.f);
        sb.append(", authorsCount=");
        return uqi.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        Integer num = this.g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
