package sa0;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa0.b;
import u6.C9975a;
import u6.EnumC9976b;

/* loaded from: classes3.dex */
public final class c {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98499a;

        static {
            int[] iArr = new int[EnumC9976b.values().length];
            try {
                iArr[EnumC9976b.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9976b.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9976b.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9976b.DISPOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f98499a = iArr;
        }
    }

    @NotNull
    public static final b a(@NotNull C9975a c9975a) {
        b.a aVar;
        Intrinsics.checkNotNullParameter(c9975a, "<this>");
        String c11 = c9975a.c();
        Intrinsics.checkNotNullExpressionValue(c11, "getReferenceId(...)");
        String b11 = c9975a.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getMaskedPan(...)");
        String a11 = c9975a.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getExpiryDate(...)");
        EnumC9976b d11 = c9975a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getState(...)");
        Intrinsics.checkNotNullParameter(d11, "<this>");
        int i11 = a.f98499a[d11.ordinal()];
        if (i11 == 1) {
            aVar = b.a.PENDING;
        } else if (i11 == 2) {
            aVar = b.a.ACTIVE;
        } else if (i11 == 3) {
            aVar = b.a.SUSPENDED;
        } else {
            if (i11 != 4) {
                throw new o();
            }
            aVar = b.a.DISPOSED;
        }
        return new b(c11, b11, a11, aVar);
    }
}
