package com.vk.dzenarticle.impl.ui.entity.items;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.so;
import xsna.urd0;

/* compiled from: ArticleWebviewItem.kt */
/* loaded from: classes18.dex */
public final class ArticleWebviewItem extends ArticleItem {
    public static final Parcelable.Creator<ArticleWebviewItem> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final Float e;

    /* compiled from: ArticleWebviewItem.kt */
    public static final class a implements Parcelable.Creator<ArticleWebviewItem> {
        @Override // android.os.Parcelable.Creator
        public final ArticleWebviewItem createFromParcel(Parcel parcel) {
            return new ArticleWebviewItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleWebviewItem[] newArray(int i) {
            return new ArticleWebviewItem[i];
        }
    }

    public ArticleWebviewItem(int i, String str, String str2, Float f) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleWebviewItem)) {
            return false;
        }
        ArticleWebviewItem articleWebviewItem = (ArticleWebviewItem) obj;
        return this.b == articleWebviewItem.b && epx.f(this.c, articleWebviewItem.c) && epx.f(this.d, articleWebviewItem.d) && epx.f(this.e, articleWebviewItem.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int a2 = urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Float f = this.e;
        return a2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleWebviewItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", ratio=");
        return so.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Float f = this.e;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }
}
