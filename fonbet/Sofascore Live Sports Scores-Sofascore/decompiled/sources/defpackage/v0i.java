package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v0i {
    public final Bitmap a;
    public final String b;

    public v0i(Bitmap bitmap, String str) {
        this.a = bitmap;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0i) {
            return this.b.equals(((v0i) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
