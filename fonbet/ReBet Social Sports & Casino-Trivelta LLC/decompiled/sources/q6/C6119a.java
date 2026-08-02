package q6;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6119a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0877a f63409b = new C0877a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f63410a;

    @NotNull
    private float[] data;

    @NotNull
    private int[] shape;

    /* renamed from: q6.a$a, reason: collision with other inner class name */
    public static final class C0877a {
        public /* synthetic */ C0877a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int b(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i10 = iArr[0];
            int lastIndex = ArraysKt.getLastIndex(iArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    i10 *= iArr[i11];
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }

        public C0877a() {
        }
    }

    public C6119a(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        int b10 = f63409b.b(shape);
        this.f63410a = b10;
        this.data = new float[b10];
    }

    public final float[] a() {
        return this.data;
    }

    public final int b(int i10) {
        return this.shape[i10];
    }

    public final int c() {
        return this.shape.length;
    }

    public final void d(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        int b10 = f63409b.b(shape);
        float[] fArr = new float[b10];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.f63410a, b10));
        this.data = fArr;
        this.f63410a = b10;
    }
}
