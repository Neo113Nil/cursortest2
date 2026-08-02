package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.j(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (versionedParcel.h(2)) {
            bArr = versionedParcel.f();
        }
        iconCompat.c = bArr;
        Parcelable parcelable = iconCompat.d;
        if (versionedParcel.h(3)) {
            parcelable = versionedParcel.k();
        }
        iconCompat.d = parcelable;
        iconCompat.e = versionedParcel.j(iconCompat.e, 4);
        iconCompat.f = versionedParcel.j(iconCompat.f, 5);
        Parcelable parcelable2 = iconCompat.g;
        if (versionedParcel.h(6)) {
            parcelable2 = versionedParcel.k();
        }
        iconCompat.g = (ColorStateList) parcelable2;
        String str = iconCompat.i;
        if (versionedParcel.h(7)) {
            str = versionedParcel.l();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (versionedParcel.h(8)) {
            str2 = versionedParcel.l();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable3 = iconCompat.d;
                if (parcelable3 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable3;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable4 = iconCompat.d;
                if (parcelable4 != null) {
                    iconCompat.b = parcelable4;
                    return iconCompat;
                }
                byte[] bArr2 = iconCompat.c;
                iconCompat.b = bArr2;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr2.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName(C.UTF16_NAME));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
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
            versionedParcel.s(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.n(2);
            versionedParcel.p(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            versionedParcel.n(3);
            versionedParcel.t(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            versionedParcel.s(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            versionedParcel.s(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            versionedParcel.n(6);
            versionedParcel.t(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            versionedParcel.n(7);
            versionedParcel.u(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            versionedParcel.n(8);
            versionedParcel.u(str2);
        }
    }
}
