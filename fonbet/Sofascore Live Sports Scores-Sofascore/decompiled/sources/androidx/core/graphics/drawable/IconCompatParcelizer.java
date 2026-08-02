package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.kok;
import defpackage.lok;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(kok kokVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = kokVar.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (kokVar.e(2)) {
            Parcel parcel = ((lok) kokVar).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = kokVar.g(iconCompat.d, 3);
        iconCompat.e = kokVar.f(iconCompat.e, 4);
        iconCompat.f = kokVar.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) kokVar.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (kokVar.e(7)) {
            str = ((lok) kokVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (kokVar.e(8)) {
            str2 = ((lok) kokVar).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                a70.p("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName(C.UTF16_NAME));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, kok kokVar) {
        kokVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName(C.UTF16_NAME));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            kokVar.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            kokVar.i(2);
            Parcel parcel = ((lok) kokVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            kokVar.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            kokVar.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            kokVar.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            kokVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            kokVar.i(7);
            ((lok) kokVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            kokVar.i(8);
            ((lok) kokVar).e.writeString(str2);
        }
    }
}
