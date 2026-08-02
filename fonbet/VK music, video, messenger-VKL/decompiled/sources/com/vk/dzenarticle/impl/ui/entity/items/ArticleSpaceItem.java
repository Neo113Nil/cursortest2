package com.vk.dzenarticle.impl.ui.entity.items;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.zcl;

/* compiled from: ArticleSpaceItem.kt */
/* loaded from: classes18.dex */
public final class ArticleSpaceItem extends ArticleItem {
    public static final Parcelable.Creator<ArticleSpaceItem> CREATOR = new a();
    public final int b;
    public final boolean c;

    /* compiled from: ArticleSpaceItem.kt */
    public static final class a implements Parcelable.Creator<ArticleSpaceItem> {
        @Override // android.os.Parcelable.Creator
        public final ArticleSpaceItem createFromParcel(Parcel parcel) {
            return new ArticleSpaceItem(parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleSpaceItem[] newArray(int i) {
            return new ArticleSpaceItem[i];
        }
    }

    public /* synthetic */ ArticleSpaceItem(int i, boolean z, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleSpaceItem)) {
            return false;
        }
        ArticleSpaceItem articleSpaceItem = (ArticleSpaceItem) obj;
        return this.b == articleSpaceItem.b && this.c == articleSpaceItem.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleSpaceItem(id=");
        sb.append(this.b);
        sb.append(", doubleSpace=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public ArticleSpaceItem(int i, boolean z) {
        this.b = i;
        this.c = z;
    }
}
