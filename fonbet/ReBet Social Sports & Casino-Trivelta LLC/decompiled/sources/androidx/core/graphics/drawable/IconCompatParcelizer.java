package androidx.core.graphics.drawable;

import M2.a;
import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f19088a = aVar.p(iconCompat.f19088a, 1);
        iconCompat.mData = aVar.j(iconCompat.mData, 2);
        iconCompat.f19090c = aVar.r(iconCompat.f19090c, 3);
        iconCompat.f19091d = aVar.p(iconCompat.f19091d, 4);
        iconCompat.f19092e = aVar.p(iconCompat.f19092e, 5);
        iconCompat.f19093f = (ColorStateList) aVar.r(iconCompat.f19093f, 6);
        iconCompat.f19095h = aVar.t(iconCompat.f19095h, 7);
        iconCompat.f19096i = aVar.t(iconCompat.f19096i, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i10 = iconCompat.f19088a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.mData;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f19090c;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f19091d;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f19092e;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f19093f;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f19095h;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f19096i;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
