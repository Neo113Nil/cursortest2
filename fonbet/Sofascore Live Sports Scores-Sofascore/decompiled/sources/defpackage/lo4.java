package defpackage;

import com.ironsource.C4427z5;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lo4 {
    public final List a;
    public final float[] b;
    public final int c;

    public lo4(List list, float[] fArr) {
        this.a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            u3a.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + ph0.U(fArr));
        }
        this.c = fArr.length;
    }

    public final Object a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final Object b(float f, boolean z) {
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final float c(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.b;
        if (indexOf < fArr.length) {
            return fArr[indexOf];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo4)) {
            return false;
        }
        lo4 lo4Var = (lo4) obj;
        return Intrinsics.c(this.a, lo4Var.a) && Arrays.equals(this.b, lo4Var.b) && this.c == lo4Var.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CollectionsKt.a0(i, this.a));
            sb2.append(C4427z5.U);
            if (i >= 0) {
                float[] fArr = this.b;
                if (i < fArr.length) {
                    f = fArr[i];
                    sb2.append(f);
                    sb.append(sb2.toString());
                    if (i >= i2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
            f = Float.NaN;
            sb2.append(f);
            sb.append(sb2.toString());
            if (i >= i2 - 1) {
            }
            i++;
        }
    }
}
