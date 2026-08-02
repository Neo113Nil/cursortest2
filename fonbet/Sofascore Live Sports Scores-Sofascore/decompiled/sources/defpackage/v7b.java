package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v7b extends oah {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public v7b(List list, ArrayList arrayList, long j, long j2) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.oah
    public final Shader b(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        if (list2 == null) {
            if (list.size() < 2) {
                a70.p("colors must have length of at least 2 if colorStops is omitted.");
                return null;
            }
        } else if (list.size() != list2.size()) {
            a70.p("colors and colorStops arguments must have equal length.");
            return null;
        }
        float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = hkg.s0(((r13) list.get(i5)).a);
        }
        return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr, list2 != null ? CollectionsKt.P0(list2) : null, lz.P(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7b)) {
            return false;
        }
        v7b v7bVar = (v7b) obj;
        return Intrinsics.c(this.c, v7bVar.c) && Intrinsics.c(this.d, v7bVar.d) && dnd.c(this.e, v7bVar.e) && dnd.c(this.f, v7bVar.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(0) + ljg.c(ljg.c((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) dnd.k(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) dnd.k(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=" + this.d + ", " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
