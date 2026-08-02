package com.vk.clips.editor.templates.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: ShortVideoTemplateFragment.kt */
/* loaded from: classes16.dex */
public final class ShortVideoTemplateFragment implements Parcelable {
    public static final Parcelable.Creator<ShortVideoTemplateFragment> CREATOR = new a();
    public final int b;
    public final int c;

    /* compiled from: ShortVideoTemplateFragment.kt */
    public static final class a implements Parcelable.Creator<ShortVideoTemplateFragment> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoTemplateFragment createFromParcel(Parcel parcel) {
            return new ShortVideoTemplateFragment(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoTemplateFragment[] newArray(int i) {
            return new ShortVideoTemplateFragment[i];
        }
    }

    public ShortVideoTemplateFragment(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final int d() {
        return this.c - this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoTemplateFragment)) {
            return false;
        }
        ShortVideoTemplateFragment shortVideoTemplateFragment = (ShortVideoTemplateFragment) obj;
        return this.b == shortVideoTemplateFragment.b && this.c == shortVideoTemplateFragment.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoTemplateFragment(start=");
        sb.append(this.b);
        sb.append(", end=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
