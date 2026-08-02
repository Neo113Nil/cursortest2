package androidx.core.graphics.drawable;

import a3.b;
import a3.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i5 = iconCompat.f1269a;
        if (bVar.e(1)) {
            i5 = ((c) bVar).f71e.readInt();
        }
        iconCompat.f1269a = i5;
        byte[] bArr = iconCompat.f1271c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f71e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1271c = bArr;
        iconCompat.f1272d = bVar.f(iconCompat.f1272d, 3);
        int i10 = iconCompat.f1273e;
        if (bVar.e(4)) {
            i10 = ((c) bVar).f71e.readInt();
        }
        iconCompat.f1273e = i10;
        int i11 = iconCompat.f1274f;
        if (bVar.e(5)) {
            i11 = ((c) bVar).f71e.readInt();
        }
        iconCompat.f1274f = i11;
        iconCompat.f1275g = (ColorStateList) bVar.f(iconCompat.f1275g, 6);
        String str = iconCompat.f1277i;
        if (bVar.e(7)) {
            str = ((c) bVar).f71e.readString();
        }
        iconCompat.f1277i = str;
        String str2 = iconCompat.j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f71e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f1276h = PorterDuff.Mode.valueOf(iconCompat.f1277i);
        switch (iconCompat.f1269a) {
            case -1:
                Parcelable parcelable = iconCompat.f1272d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1270b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1272d;
                if (parcelable2 != null) {
                    iconCompat.f1270b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1271c;
                iconCompat.f1270b = bArr3;
                iconCompat.f1269a = 3;
                iconCompat.f1273e = 0;
                iconCompat.f1274f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1271c, Charset.forName("UTF-16"));
                iconCompat.f1270b = str3;
                if (iconCompat.f1269a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1270b = iconCompat.f1271c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f1277i = iconCompat.f1276h.name();
        switch (iconCompat.f1269a) {
            case -1:
                iconCompat.f1272d = (Parcelable) iconCompat.f1270b;
                break;
            case 1:
            case 5:
                iconCompat.f1272d = (Parcelable) iconCompat.f1270b;
                break;
            case 2:
                iconCompat.f1271c = ((String) iconCompat.f1270b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1271c = (byte[]) iconCompat.f1270b;
                break;
            case 4:
            case 6:
                iconCompat.f1271c = iconCompat.f1270b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i5 = iconCompat.f1269a;
        if (-1 != i5) {
            bVar.h(1);
            ((c) bVar).f71e.writeInt(i5);
        }
        byte[] bArr = iconCompat.f1271c;
        if (bArr != null) {
            bVar.h(2);
            Parcel parcel = ((c) bVar).f71e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1272d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f71e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f1273e;
        if (i10 != 0) {
            bVar.h(4);
            ((c) bVar).f71e.writeInt(i10);
        }
        int i11 = iconCompat.f1274f;
        if (i11 != 0) {
            bVar.h(5);
            ((c) bVar).f71e.writeInt(i11);
        }
        ColorStateList colorStateList = iconCompat.f1275g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f71e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1277i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f71e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f71e.writeString(str2);
        }
    }
}
