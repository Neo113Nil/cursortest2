package w0;

import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: w0.F, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10379F {

    /* renamed from: a, reason: collision with root package name */
    private final int f103173a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10378E[] f103174b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final L f103175c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<C10387c> f103176d;

    /* renamed from: e, reason: collision with root package name */
    private final int f103177e;

    /* renamed from: f, reason: collision with root package name */
    private final int f103178f;

    /* renamed from: g, reason: collision with root package name */
    private final int f103179g;

    public C10379F(int i11, @NotNull C10378E[] c10378eArr, @NotNull L l11, @NotNull List list, int i12) {
        this.f103173a = i11;
        this.f103174b = c10378eArr;
        this.f103175c = l11;
        this.f103176d = list;
        this.f103177e = i12;
        int i13 = 0;
        for (C10378E c10378e : c10378eArr) {
            i13 = Math.max(i13, c10378e.q());
        }
        this.f103178f = i13;
        int i14 = i13 + this.f103177e;
        this.f103179g = i14 >= 0 ? i14 : 0;
    }

    public final int a() {
        return this.f103173a;
    }

    @NotNull
    public final C10378E[] b() {
        return this.f103174b;
    }

    public final int c() {
        return this.f103178f;
    }

    public final int d() {
        return this.f103179g;
    }

    public final boolean e() {
        return this.f103174b.length == 0;
    }

    @NotNull
    public final C10378E[] f(int i11, int i12, int i13) {
        C10378E[] c10378eArr = this.f103174b;
        int length = c10378eArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            C10378E c10378e = c10378eArr[i14];
            int i17 = i15 + 1;
            int b11 = (int) this.f103176d.get(i15).b();
            int i18 = i11;
            c10378e.t(i18, this.f103175c.a()[i16], i12, i13, this.f103173a, i16);
            Unit unit = Unit.f71690a;
            i16 += b11;
            i14++;
            i11 = i18;
            i15 = i17;
        }
        return c10378eArr;
    }
}
