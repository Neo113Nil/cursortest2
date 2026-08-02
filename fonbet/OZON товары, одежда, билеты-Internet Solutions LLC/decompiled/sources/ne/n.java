package ne;

import je.L0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77078a;

        static {
            int[] iArr = new int[L0.values().length];
            try {
                iArr[L0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77078a = iArr;
        }
    }

    @NotNull
    public static final q a(@NotNull L0 l02) {
        Intrinsics.checkNotNullParameter(l02, "<this>");
        int i11 = a.f77078a[l02.ordinal()];
        if (i11 == 1) {
            return q.INV;
        }
        if (i11 == 2) {
            return q.IN;
        }
        if (i11 == 3) {
            return q.OUT;
        }
        throw new Sc.o();
    }
}
