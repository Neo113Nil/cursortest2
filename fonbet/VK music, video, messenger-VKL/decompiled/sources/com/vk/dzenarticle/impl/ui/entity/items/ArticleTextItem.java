package com.vk.dzenarticle.impl.ui.entity.items;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.nr;
import xsna.qoy;
import xsna.urd0;

/* compiled from: ArticleTextItem.kt */
/* loaded from: classes18.dex */
public final class ArticleTextItem extends ArticleItem {
    public static final Parcelable.Creator<ArticleTextItem> CREATOR = new a();
    public final int b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;

    /* compiled from: ArticleTextItem.kt */
    public static final class a implements Parcelable.Creator<ArticleTextItem> {
        @Override // android.os.Parcelable.Creator
        public final ArticleTextItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z6 = false;
            boolean z7 = true;
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z7 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
                z4 = z;
            } else {
                z3 = z;
                z4 = z2;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = z3;
                z3 = z4;
            } else {
                z5 = z3;
            }
            if (parcel.readInt() == 0) {
                z4 = z5;
            }
            return new ArticleTextItem(readInt, readString, valueOf, z8, z6, z7, z, readString2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleTextItem[] newArray(int i) {
            return new ArticleTextItem[i];
        }
    }

    public ArticleTextItem(int i, String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6) {
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str2;
        this.j = z5;
        this.k = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleTextItem)) {
            return false;
        }
        ArticleTextItem articleTextItem = (ArticleTextItem) obj;
        return this.b == articleTextItem.b && epx.f(this.c, articleTextItem.c) && epx.f(this.d, articleTextItem.d) && this.e == articleTextItem.e && this.f == articleTextItem.f && this.g == articleTextItem.g && this.h == articleTextItem.h && epx.f(this.i, articleTextItem.i) && this.j == articleTextItem.j && this.k == articleTextItem.k;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        Integer num = this.d;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return Boolean.hashCode(this.k) + qoy.b((b + (str != null ? str.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleTextItem(id=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", header=");
        sb.append(this.d);
        sb.append(", italic=");
        sb.append(this.e);
        sb.append(", bold=");
        sb.append(this.f);
        sb.append(", strike=");
        sb.append(this.g);
        sb.append(", underline=");
        sb.append(this.h);
        sb.append(", link=");
        sb.append(this.i);
        sb.append(", quote=");
        sb.append(this.j);
        sb.append(", bullet=");
        return q0.a(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
    }
}
