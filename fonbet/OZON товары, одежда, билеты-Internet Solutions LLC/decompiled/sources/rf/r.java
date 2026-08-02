package rf;

import C.o0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rf.C9263b;
import sf.C9681g;
import sf.C9684j;
import sf.InterfaceC9682h;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f83462a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f83463b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f83464c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f83465d;

    public r(@NotNull C9681g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f83462a = C7714v.m0(sink);
        this.f83463b = new ArrayList();
        this.f83464c = new ArrayList();
    }

    private final InterfaceC9682h d() {
        return (InterfaceC9682h) o0.b(1, this.f83462a);
    }

    private final void n(long j11) {
        InterfaceC9682h d11 = d();
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.j((((70 - Long.numberOfLeadingZeros(j11)) / 7) - 1) * 7, 0), 7);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if (f71844c >= 0) {
            if (f71842a > f71843b) {
                return;
            }
        } else if (f71842a < f71843b) {
            return;
        }
        while (true) {
            d11.h0((f71842a == 0 ? 0 : UserVerificationMethods.USER_VERIFY_PATTERN) | ((int) ((j11 >> f71842a) & 127)));
            if (f71842a == f71843b) {
                return;
            } else {
                f71842a += f71844c;
            }
        }
    }

    public final Object a() {
        return C7714v.Z(this.f83463b);
    }

    public final void b(boolean z11) {
        this.f83465d = z11;
    }

    public final void c(Object obj) {
        this.f83463b.set(r0.size() - 1, obj);
    }

    public final void e(@NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = this.f83463b;
        arrayList.add(null);
        try {
            ((C9263b.n.C1421b) block).invoke();
        } finally {
            Ej.b.b(1, arrayList);
        }
    }

    public final void f(@NotNull String name, int i11, long j11, @NotNull Function1<? super InterfaceC9682h, Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        C9681g c9681g = new C9681g();
        ArrayList arrayList = this.f83462a;
        arrayList.add(c9681g);
        this.f83465d = false;
        ArrayList arrayList2 = this.f83464c;
        arrayList2.add(name);
        try {
            block.invoke(c9681g);
            int i12 = this.f83465d ? 32 : 0;
            this.f83465d = true;
            arrayList.remove(arrayList.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            InterfaceC9682h d11 = d();
            if (j11 < 31) {
                d11.h0(i11 | i12 | ((int) j11));
            } else {
                d11.h0(i11 | i12 | 31);
                n(j11);
            }
            long size = c9681g.size();
            if (size < UserVerificationMethods.USER_VERIFY_PATTERN) {
                d11.h0((int) size);
            } else {
                int numberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(size)) / 8;
                d11.h0(numberOfLeadingZeros | UserVerificationMethods.USER_VERIFY_PATTERN);
                kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.j((numberOfLeadingZeros - 1) * 8, 0), 8);
                int f71842a = m11.getF71842a();
                int f71843b = m11.getF71843b();
                int f71844c = m11.getF71844c();
                if (f71844c < 0 ? f71842a >= f71843b : f71842a <= f71843b) {
                    while (true) {
                        d11.h0((int) (size >> f71842a));
                        if (f71842a == f71843b) {
                            break;
                        } else {
                            f71842a += f71844c;
                        }
                    }
                }
            }
            d11.y0(c9681g);
        } catch (Throwable th2) {
            arrayList.remove(arrayList.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            throw th2;
        }
    }

    public final void g(@NotNull BigInteger value) {
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC9682h d11 = d();
        byte[] byteArray = value.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "value.toByteArray()");
        d11.U(byteArray);
    }

    public final void h(@NotNull k bitString) {
        Intrinsics.checkNotNullParameter(bitString, "bitString");
        InterfaceC9682h d11 = d();
        d11.h0(bitString.b());
        d11.Q1(bitString.a());
    }

    public final void i(boolean z11) {
        d().h0(z11 ? -1 : 0);
    }

    public final void j(long j11) {
        InterfaceC9682h d11 = d();
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.j(((((65 - (j11 < 0 ? Long.numberOfLeadingZeros(~j11) : Long.numberOfLeadingZeros(j11))) + 7) / 8) - 1) * 8, 0), 8);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if (f71844c >= 0) {
            if (f71842a > f71843b) {
                return;
            }
        } else if (f71842a < f71843b) {
            return;
        }
        while (true) {
            d11.h0((int) (j11 >> f71842a));
            if (f71842a == f71843b) {
                return;
            } else {
                f71842a += f71844c;
            }
        }
    }

    public final void k(@NotNull String s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        C9681g c9681g = new C9681g();
        c9681g.H0(s11);
        long x11 = c9681g.x();
        byte b11 = (byte) 46;
        if (!(c9681g.readByte() == b11)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        n((x11 * 40) + c9681g.x());
        while (!c9681g.m()) {
            if (c9681g.readByte() != b11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            n(c9681g.x());
        }
    }

    public final void l(@NotNull C9684j byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        d().Q1(byteString);
    }

    public final void m(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d().h1(value);
    }

    @NotNull
    public final String toString() {
        return C7714v.V(this.f83464c, " / ", null, null, null, 62);
    }
}
