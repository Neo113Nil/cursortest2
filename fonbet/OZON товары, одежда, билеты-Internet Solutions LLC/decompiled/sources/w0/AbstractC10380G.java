package w0;

import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import w0.N;

/* renamed from: w0.G, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC10380G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f103180a;

    /* renamed from: b, reason: collision with root package name */
    private final int f103181b;

    /* renamed from: c, reason: collision with root package name */
    private final int f103182c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final v f103183d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final N f103184e;

    public AbstractC10380G(@NotNull L l11, int i11, int i12, @NotNull v vVar, @NotNull N n11) {
        this.f103180a = l11;
        this.f103181b = i11;
        this.f103182c = i12;
        this.f103183d = vVar;
        this.f103184e = n11;
    }

    public final long a(int i11, int i12) {
        int i13;
        L l11 = this.f103180a;
        if (i12 == 1) {
            i13 = l11.b()[i11];
        } else {
            int i14 = (i12 + i11) - 1;
            i13 = (l11.a()[i14] + l11.b()[i14]) - l11.a()[i11];
        }
        if (i13 < 0) {
            i13 = 0;
        }
        if (i13 >= 0) {
            return Z1.c.i(i13, i13, 0, Integer.MAX_VALUE);
        }
        Z1.l.a("width(" + i13 + ") must be >= 0");
        throw null;
    }

    @NotNull
    public abstract C10379F b(int i11, @NotNull C10378E[] c10378eArr, @NotNull List<C10387c> list, int i12);

    @NotNull
    public final C10379F c(int i11) {
        N.c b11 = this.f103184e.b(i11);
        int size = b11.b().size();
        int i12 = (size == 0 || b11.a() + size == this.f103181b) ? 0 : this.f103182c;
        C10378E[] c10378eArr = new C10378E[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int b12 = (int) b11.b().get(i14).b();
            C10378E c11 = this.f103183d.c(b11.a() + i14, i13, b12, i12, a(i13, b12));
            i13 += b12;
            Unit unit = Unit.f71690a;
            c10378eArr[i14] = c11;
        }
        return b(i11, c10378eArr, b11.b(), i12);
    }

    public final int d(int i11) {
        return this.f103184e.f(i11);
    }
}
