package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pec {
    public final Bitmap a;
    public final Map b;

    public pec(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pec)) {
            return false;
        }
        pec pecVar = (pec) obj;
        return this.a.equals(pecVar.a) && Intrinsics.c(this.b, pecVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(bitmap=");
        sb.append(this.a);
        sb.append(", extras=");
        return dmi.s(sb, this.b, ')');
    }
}
