package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
        layoutParams.f4202a = 1;
        layoutParams.f4203b = 0.0f;
        layoutParams.f4204c = 1.0f;
        layoutParams.f4205d = -1;
        layoutParams.f4206e = -1.0f;
        layoutParams.f4207f = -1;
        layoutParams.f4208g = -1;
        layoutParams.f4209h = 16777215;
        layoutParams.f4210i = 16777215;
        layoutParams.f4202a = parcel.readInt();
        layoutParams.f4203b = parcel.readFloat();
        layoutParams.f4204c = parcel.readFloat();
        layoutParams.f4205d = parcel.readInt();
        layoutParams.f4206e = parcel.readFloat();
        layoutParams.f4207f = parcel.readInt();
        layoutParams.f4208g = parcel.readInt();
        layoutParams.f4209h = parcel.readInt();
        layoutParams.f4210i = parcel.readInt();
        layoutParams.j = parcel.readByte() != 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
        return layoutParams;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new FlexboxLayout.LayoutParams[i5];
    }
}
