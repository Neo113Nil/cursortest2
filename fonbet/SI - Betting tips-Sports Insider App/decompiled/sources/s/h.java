package s;

import com.sports.insider.data.repository.room.live.LiveTable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public float[] f22557a;

    /* renamed from: b, reason: collision with root package name */
    public int f22558b;

    public static String b(h hVar, int i5) {
        String prefix = (i5 & 2) != 0 ? "" : "[";
        String postfix = (i5 & 4) == 0 ? "]" : "";
        hVar.getClass();
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) prefix);
        float[] fArr = hVar.f22557a;
        int i10 = hVar.f22558b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) postfix);
                break;
            }
            float f6 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(f6);
            i11++;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final float a(int i5) {
        if (i5 >= 0 && i5 < this.f22558b) {
            return this.f22557a[i5];
        }
        Intrinsics.checkNotNullParameter("Index must be between 0 and size", LiveTable.messageColumn);
        throw new IndexOutOfBoundsException("Index must be between 0 and size");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            int i5 = hVar.f22558b;
            int i10 = this.f22558b;
            if (i5 == i10) {
                float[] fArr = this.f22557a;
                float[] fArr2 = hVar.f22557a;
                IntRange d10 = zf.j.d(0, i10);
                int i11 = d10.f19234a;
                int i12 = d10.f19235b;
                if (i11 > i12) {
                    return true;
                }
                while (fArr[i11] == fArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f22557a;
        int i5 = this.f22558b;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 += Float.floatToIntBits(fArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        return b(this, 25);
    }
}
