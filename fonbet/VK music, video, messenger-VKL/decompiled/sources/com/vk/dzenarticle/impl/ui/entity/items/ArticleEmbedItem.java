package com.vk.dzenarticle.impl.ui.entity.items;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ArticleEmbedItem.kt */
/* loaded from: classes18.dex */
public final class ArticleEmbedItem extends ArticleItem {
    public static final Parcelable.Creator<ArticleEmbedItem> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: ArticleEmbedItem.kt */
    public static final class a implements Parcelable.Creator<ArticleEmbedItem> {
        @Override // android.os.Parcelable.Creator
        public final ArticleEmbedItem createFromParcel(Parcel parcel) {
            return new ArticleEmbedItem(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleEmbedItem[] newArray(int i) {
            return new ArticleEmbedItem[i];
        }
    }

    public ArticleEmbedItem(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
