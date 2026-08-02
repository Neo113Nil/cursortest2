package com.vk.attachpicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.zcl;

/* compiled from: ImageFormatRestrictions.kt */
/* loaded from: classes15.dex */
public final class ImageFormatRestrictions implements Parcelable {
    public static final Parcelable.Creator<ImageFormatRestrictions> CREATOR = new a();
    public final List<String> b;
    public final List<String> c;

    /* compiled from: ImageFormatRestrictions.kt */
    public static final class a implements Parcelable.Creator<ImageFormatRestrictions> {
        @Override // android.os.Parcelable.Creator
        public final ImageFormatRestrictions createFromParcel(Parcel parcel) {
            return new ImageFormatRestrictions(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageFormatRestrictions[] newArray(int i) {
            return new ImageFormatRestrictions[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageFormatRestrictions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFormatRestrictions)) {
            return false;
        }
        ImageFormatRestrictions imageFormatRestrictions = (ImageFormatRestrictions) obj;
        return epx.f(this.b, imageFormatRestrictions.b) && epx.f(this.c, imageFormatRestrictions.c);
    }

    public final int hashCode() {
        List<String> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.c;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageFormatRestrictions(allowed=");
        sb.append(this.b);
        sb.append(", forbidden=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
    }

    public ImageFormatRestrictions(List<String> list, List<String> list2) {
        this.b = list;
        this.c = list2;
    }

    public /* synthetic */ ImageFormatRestrictions(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
