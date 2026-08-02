package com.vk.dto.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.util.Density;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import xsna.asp;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;
import xsna.on00;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DialogBackground.kt */
/* loaded from: classes.dex */
public final class DialogBackground implements Parcelable {
    public static final Parcelable.Creator<DialogBackground> CREATOR = new a();
    public static final DialogBackground e = new DialogBackground("default_empty_bg", "", (String) null, 4, (zcl) null);
    public final String b;
    public final String c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogBackground.kt */
    /* loaded from: classes18.dex */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final a Companion;
        public static final Size HDIP;
        public static final Size XHDIP;
        public static final Size XXHDIP;
        public static final Size XXXHDIP;
        private static final Map<String, Size> values;
        private final Density density;

        /* compiled from: DialogBackground.kt */
        public static final class a {
        }

        static {
            Size size = new Size("HDIP", 0, Density.HDPI);
            HDIP = size;
            Size size2 = new Size("XHDIP", 1, Density.XHDPI);
            XHDIP = size2;
            Size size3 = new Size("XXHDIP", 2, Density.XXHDPI);
            XXHDIP = size3;
            Size size4 = new Size("XXXHDIP", 3, Density.XXXHDPI);
            XXXHDIP = size4;
            Size[] sizeArr = {size, size2, size3, size4};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
            Companion = new a();
            Size[] values2 = values();
            int e = on00.e(values2.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
            for (Size size5 : values2) {
                linkedHashMap.put(size5.density.i().toLowerCase(Locale.ROOT), size5);
            }
            values = linkedHashMap;
        }

        public Size(String str, int i, Density density) {
            this.density = density;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: DialogBackground.kt */
    public static final class a implements Parcelable.Creator<DialogBackground> {
        @Override // android.os.Parcelable.Creator
        public final DialogBackground createFromParcel(Parcel parcel) {
            return new DialogBackground(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DialogBackground[] newArray(int i) {
            return new DialogBackground[i];
        }
    }

    public DialogBackground(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean d() {
        return (drm0.N(this.c) || drm0.N(this.d)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogBackground)) {
            return false;
        }
        DialogBackground dialogBackground = (DialogBackground) obj;
        return epx.f(this.b, dialogBackground.b) && epx.f(this.c, dialogBackground.c) && epx.f(this.d, dialogBackground.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogBackground(name=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", urlDark=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public /* synthetic */ DialogBackground(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? str2 : str3);
    }

    public /* synthetic */ DialogBackground(String str, Uri uri, Uri uri2, int i, zcl zclVar) {
        this(str, uri, (i & 4) != 0 ? uri : uri2);
    }

    public DialogBackground(String str, Uri uri, Uri uri2) {
        this(str, uri.toString(), uri2.toString());
    }
}
