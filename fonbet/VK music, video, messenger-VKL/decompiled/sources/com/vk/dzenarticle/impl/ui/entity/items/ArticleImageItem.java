package com.vk.dzenarticle.impl.ui.entity.items;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ArticleImageItem.kt */
/* loaded from: classes18.dex */
public final class ArticleImageItem extends ArticleItem {
    public static final Parcelable.Creator<ArticleImageItem> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: ArticleImageItem.kt */
    public static final class a implements Parcelable.Creator<ArticleImageItem> {
        @Override // android.os.Parcelable.Creator
        public final ArticleImageItem createFromParcel(Parcel parcel) {
            return new ArticleImageItem(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleImageItem[] newArray(int i) {
            return new ArticleImageItem[i];
        }
    }

    public ArticleImageItem(int i, String str, String str2) {
        this.b = i;
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
        if (!(obj instanceof ArticleImageItem)) {
            return false;
        }
        ArticleImageItem articleImageItem = (ArticleImageItem) obj;
        return this.b == articleImageItem.b && epx.f(this.c, articleImageItem.c) && epx.f(this.d, articleImageItem.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleImageItem(id=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", captionText=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
