package com.vk.attachpicker.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GalleryGridSpanStyle.kt */
/* loaded from: classes15.dex */
public final class GalleryGridSpanStyle implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GalleryGridSpanStyle[] $VALUES;
    public static final Parcelable.Creator<GalleryGridSpanStyle> CREATOR;
    public static final GalleryGridSpanStyle EXACT_COUNT;
    public static final GalleryGridSpanStyle EXACT_WIDTH;

    /* compiled from: GalleryGridSpanStyle.kt */
    public static final class a implements Parcelable.Creator<GalleryGridSpanStyle> {
        @Override // android.os.Parcelable.Creator
        public final GalleryGridSpanStyle createFromParcel(Parcel parcel) {
            return GalleryGridSpanStyle.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryGridSpanStyle[] newArray(int i) {
            return new GalleryGridSpanStyle[i];
        }
    }

    static {
        GalleryGridSpanStyle galleryGridSpanStyle = new GalleryGridSpanStyle("EXACT_WIDTH", 0);
        EXACT_WIDTH = galleryGridSpanStyle;
        GalleryGridSpanStyle galleryGridSpanStyle2 = new GalleryGridSpanStyle("EXACT_COUNT", 1);
        EXACT_COUNT = galleryGridSpanStyle2;
        GalleryGridSpanStyle[] galleryGridSpanStyleArr = {galleryGridSpanStyle, galleryGridSpanStyle2};
        $VALUES = galleryGridSpanStyleArr;
        $ENTRIES = new asp(galleryGridSpanStyleArr);
        CREATOR = new a();
    }

    public GalleryGridSpanStyle() {
        throw null;
    }

    public static GalleryGridSpanStyle valueOf(String str) {
        return (GalleryGridSpanStyle) Enum.valueOf(GalleryGridSpanStyle.class, str);
    }

    public static GalleryGridSpanStyle[] values() {
        return (GalleryGridSpanStyle[]) $VALUES.clone();
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
