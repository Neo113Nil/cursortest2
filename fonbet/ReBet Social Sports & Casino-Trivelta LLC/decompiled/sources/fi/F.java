package fi;

import bi.n;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public int f46686a;

    @NotNull
    private Object[] currentObjectPath = new Object[8];

    @NotNull
    private int[] indicies;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46687a = new a();
    }

    public F() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.indicies = iArr;
        this.f46686a = -1;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f46686a + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.currentObjectPath[i11];
            if (obj instanceof bi.f) {
                bi.f fVar = (bi.f) obj;
                if (!Intrinsics.areEqual(fVar.getKind(), n.b.f25231a)) {
                    int i12 = this.indicies[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.e(i12));
                    }
                } else if (this.indicies[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.indicies[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f46687a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        return sb2.toString();
    }

    public final void b() {
        int i10 = this.f46686a;
        int[] iArr = this.indicies;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f46686a = i10 - 1;
        }
        int i11 = this.f46686a;
        if (i11 != -1) {
            this.f46686a = i11 - 1;
        }
    }

    public final void c(bi.f sd2) {
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i10 = this.f46686a + 1;
        this.f46686a = i10;
        if (i10 == this.currentObjectPath.length) {
            e();
        }
        this.currentObjectPath[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.indicies;
        int i10 = this.f46686a;
        if (iArr[i10] == -2) {
            this.currentObjectPath[i10] = a.f46687a;
        }
    }

    public final void e() {
        int i10 = this.f46686a * 2;
        Object[] copyOf = Arrays.copyOf(this.currentObjectPath, i10);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.currentObjectPath = copyOf;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = -1;
        }
        ArraysKt.copyInto$default(this.indicies, iArr, 0, 0, 0, 14, (Object) null);
        this.indicies = iArr;
    }

    public final void f(Object obj) {
        int[] iArr = this.indicies;
        int i10 = this.f46686a;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f46686a = i11;
            if (i11 == this.currentObjectPath.length) {
                e();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i12 = this.f46686a;
        objArr[i12] = obj;
        this.indicies[i12] = -2;
    }

    public final void g(int i10) {
        this.indicies[this.f46686a] = i10;
    }

    public String toString() {
        return a();
    }
}
