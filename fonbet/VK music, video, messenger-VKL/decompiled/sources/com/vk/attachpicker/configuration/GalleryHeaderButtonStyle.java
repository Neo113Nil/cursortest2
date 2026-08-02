package com.vk.attachpicker.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GalleryHeaderButtonStyle.kt */
/* loaded from: classes15.dex */
public final class GalleryHeaderButtonStyle implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GalleryHeaderButtonStyle[] $VALUES;
    public static final Parcelable.Creator<GalleryHeaderButtonStyle> CREATOR;
    public static final GalleryHeaderButtonStyle FULL_ROW;
    public static final GalleryHeaderButtonStyle SINGLE_SPAN;

    /* compiled from: GalleryHeaderButtonStyle.kt */
    public static final class a implements Parcelable.Creator<GalleryHeaderButtonStyle> {
        @Override // android.os.Parcelable.Creator
        public final GalleryHeaderButtonStyle createFromParcel(Parcel parcel) {
            return GalleryHeaderButtonStyle.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryHeaderButtonStyle[] newArray(int i) {
            return new GalleryHeaderButtonStyle[i];
        }
    }

    static {
        GalleryHeaderButtonStyle galleryHeaderButtonStyle = new GalleryHeaderButtonStyle("SINGLE_SPAN", 0);
        SINGLE_SPAN = galleryHeaderButtonStyle;
        GalleryHeaderButtonStyle galleryHeaderButtonStyle2 = new GalleryHeaderButtonStyle("FULL_ROW", 1);
        FULL_ROW = galleryHeaderButtonStyle2;
        GalleryHeaderButtonStyle[] galleryHeaderButtonStyleArr = {galleryHeaderButtonStyle, galleryHeaderButtonStyle2};
        $VALUES = galleryHeaderButtonStyleArr;
        $ENTRIES = new asp(galleryHeaderButtonStyleArr);
        CREATOR = new a();
    }

    public GalleryHeaderButtonStyle() {
        throw null;
    }

    public static GalleryHeaderButtonStyle valueOf(String str) {
        return (GalleryHeaderButtonStyle) Enum.valueOf(GalleryHeaderButtonStyle.class, str);
    }

    public static GalleryHeaderButtonStyle[] values() {
        return (GalleryHeaderButtonStyle[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
