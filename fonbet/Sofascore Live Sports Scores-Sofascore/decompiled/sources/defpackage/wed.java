package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wed {
    public final Bundle a;
    public IconCompat b;
    public final sxf[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final PendingIntent l;
    public final boolean m;

    public wed(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, sxf[] sxfVarArr, boolean z, int i, boolean z2, boolean z3, int i2, int i3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i4 = iconCompat.a;
            if ((i4 == -1 ? n9e.B(iconCompat.b) : i4) == 2) {
                this.j = iconCompat.b();
            }
        }
        this.k = efd.c(charSequence);
        this.l = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = sxfVarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
        this.g = z3;
        this.h = i2;
        this.i = i3;
        this.m = z4;
    }

    public wed(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, sxf[] sxfVarArr, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, boolean z4) {
        this(i == 0 ? null : IconCompat.a(i, ""), charSequence, pendingIntent, bundle, sxfVarArr, z, i2, z2, z3, i3, i4, z4);
    }
}
