package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cxi {
    public final Bitmap a;
    public final Bitmap b;
    public final Bitmap c;
    public final Bitmap d;
    public final Integer e;

    public /* synthetic */ cxi(Bitmap bitmap, Bitmap bitmap2, Integer num, int i) {
        this((i & 1) != 0 ? null : bitmap, null, (i & 4) != 0 ? null : bitmap2, null, (i & 16) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxi)) {
            return false;
        }
        cxi cxiVar = (cxi) obj;
        return Intrinsics.c(this.a, cxiVar.a) && Intrinsics.c(this.b, cxiVar.b) && Intrinsics.c(this.c, cxiVar.c) && Intrinsics.c(this.d, cxiVar.d) && Intrinsics.c(this.e, cxiVar.e);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.b;
        int hashCode2 = (hashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.c;
        int hashCode3 = (hashCode2 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31;
        Bitmap bitmap4 = this.d;
        int hashCode4 = (hashCode3 + (bitmap4 == null ? 0 : bitmap4.hashCode())) * 31;
        Integer num = this.e;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamImageInfo(homeTeam1=");
        sb.append(this.a);
        sb.append(", homeTeam2=");
        sb.append(this.b);
        sb.append(", awayTeam1=");
        sb.append(this.c);
        sb.append(", awayTeam2=");
        sb.append(this.d);
        sb.append(", placeholder=");
        return vxd.n(sb, this.e, ")");
    }

    public cxi(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Integer num) {
        this.a = bitmap;
        this.b = bitmap2;
        this.c = bitmap3;
        this.d = bitmap4;
        this.e = num;
    }
}
