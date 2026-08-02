package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.uqi;

/* compiled from: SnippetStyle.kt */
/* loaded from: classes17.dex */
public final class SnippetStyle implements Parcelable {
    public static final Parcelable.Creator<SnippetStyle> CREATOR = new a();
    public final Integer b;
    public final Integer c;

    /* compiled from: SnippetStyle.kt */
    public static final class a implements Parcelable.Creator<SnippetStyle> {
        @Override // android.os.Parcelable.Creator
        public final SnippetStyle createFromParcel(Parcel parcel) {
            return new SnippetStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SnippetStyle[] newArray(int i) {
            return new SnippetStyle[i];
        }
    }

    public SnippetStyle(Integer num, Integer num2) {
        this.b = num;
        this.c = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetStyle)) {
            return false;
        }
        SnippetStyle snippetStyle = (SnippetStyle) obj;
        return epx.f(this.b, snippetStyle.b) && epx.f(this.c, snippetStyle.c);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetStyle(backgroundColor=");
        sb.append(this.b);
        sb.append(", textColor=");
        return uqi.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }
}
