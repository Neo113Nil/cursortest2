package n5;

import org.jetbrains.annotations.NotNull;
import w5.EnumC10434f;

/* loaded from: classes8.dex */
public final class f {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76520a;

        static {
            int[] iArr = new int[EnumC10434f.values().length];
            try {
                iArr[EnumC10434f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10434f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f76520a = iArr;
        }
    }

    public static final double a(int i11, int i12, int i13, int i14, @NotNull EnumC10434f enumC10434f) {
        double d11 = i13 / i11;
        double d12 = i14 / i12;
        int i15 = a.f76520a[enumC10434f.ordinal()];
        if (i15 == 1) {
            return Math.max(d11, d12);
        }
        if (i15 == 2) {
            return Math.min(d11, d12);
        }
        throw new Sc.o();
    }
}
