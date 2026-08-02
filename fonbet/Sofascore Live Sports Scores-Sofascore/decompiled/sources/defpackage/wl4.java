package defpackage;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wl4 {
    public final BitmapDrawable a;
    public final boolean b;

    public wl4(BitmapDrawable bitmapDrawable, boolean z) {
        this.a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl4)) {
            return false;
        }
        wl4 wl4Var = (wl4) obj;
        return this.a.equals(wl4Var.a) && this.b == wl4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
