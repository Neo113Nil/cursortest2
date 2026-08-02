package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qsb {
    public final Bitmap a;
    public final RectF b;
    public final boolean c;

    public qsb(Bitmap bitmap, RectF rectF, boolean z) {
        this.a = bitmap;
        this.b = rectF;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsb)) {
            return false;
        }
        qsb qsbVar = (qsb) obj;
        return Intrinsics.c(this.a, qsbVar.a) && this.b.equals(qsbVar.b) && this.c == qsbVar.c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = bitmap == null ? 0 : bitmap.hashCode();
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapWithCoordinates(bitmap=");
        sb.append(this.a);
        sb.append(", rect=");
        sb.append(this.b);
        sb.append(", isLargeEnough=");
        return wt3.p(sb, this.c, ")");
    }
}
