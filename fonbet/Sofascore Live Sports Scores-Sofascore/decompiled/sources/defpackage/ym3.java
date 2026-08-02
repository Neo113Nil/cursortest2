package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ym3 {
    public final Uri a;
    public final boolean b;

    public ym3(boolean z, Uri uri) {
        uri.getClass();
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ym3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ym3 ym3Var = (ym3) obj;
        return Intrinsics.c(this.a, ym3Var.a) && this.b == ym3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
