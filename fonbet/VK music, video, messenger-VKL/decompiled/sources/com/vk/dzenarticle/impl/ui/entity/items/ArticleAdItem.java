package com.vk.dzenarticle.impl.ui.entity.items;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: ArticleAdItem.kt */
/* loaded from: classes18.dex */
public final class ArticleAdItem extends ArticleItem {
    public static final Parcelable.Creator<ArticleAdItem> CREATOR = new a();
    public final int b;
    public final String c;

    /* compiled from: ArticleAdItem.kt */
    public static final class a implements Parcelable.Creator<ArticleAdItem> {
        @Override // android.os.Parcelable.Creator
        public final ArticleAdItem createFromParcel(Parcel parcel) {
            return new ArticleAdItem(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleAdItem[] newArray(int i) {
            return new ArticleAdItem[i];
        }
    }

    public ArticleAdItem(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleAdItem)) {
            return false;
        }
        ArticleAdItem articleAdItem = (ArticleAdItem) obj;
        return this.b == articleAdItem.b && epx.f(this.c, articleAdItem.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleAdItem(id=");
        sb.append(this.b);
        sb.append(", type=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
