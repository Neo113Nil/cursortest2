package u5;

import Sc.k;
import Sc.n;
import We.C;
import We.C4864f;
import We.L;
import We.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.F;
import sf.G;

/* renamed from: u5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9964c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f100298a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f100299b;

    /* renamed from: c, reason: collision with root package name */
    private final long f100300c;

    /* renamed from: d, reason: collision with root package name */
    private final long f100301d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f100302e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final z f100303f;

    public C9964c(@NotNull G g10) {
        n nVar = n.NONE;
        this.f100298a = k.a(nVar, new C9962a(this));
        this.f100299b = k.a(nVar, new C9963b(this));
        this.f100300c = Long.parseLong(g10.s(Long.MAX_VALUE));
        this.f100301d = Long.parseLong(g10.s(Long.MAX_VALUE));
        this.f100302e = Integer.parseInt(g10.s(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(g10.s(Long.MAX_VALUE));
        z.a aVar = new z.a();
        for (int i11 = 0; i11 < parseInt; i11++) {
            String s11 = g10.s(Long.MAX_VALUE);
            int i12 = A5.k.f430d;
            int I11 = kotlin.text.h.I(':', 0, 6, s11);
            if (I11 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(s11).toString());
            }
            String substring = s11.substring(0, I11);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = kotlin.text.h.z0(substring).toString();
            String substring2 = s11.substring(I11 + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            aVar.d(obj, substring2);
        }
        this.f100303f = aVar.e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final C4864f a() {
        return (C4864f) this.f100298a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final C b() {
        return (C) this.f100299b.getValue();
    }

    public final long c() {
        return this.f100301d;
    }

    @NotNull
    public final z d() {
        return this.f100303f;
    }

    public final long e() {
        return this.f100300c;
    }

    public final boolean f() {
        return this.f100302e;
    }

    public final void g(@NotNull F f7) {
        f7.Y(this.f100300c);
        f7.h0(10);
        f7.Y(this.f100301d);
        f7.h0(10);
        f7.Y(this.f100302e ? 1L : 0L);
        f7.h0(10);
        z zVar = this.f100303f;
        f7.Y(zVar.size());
        f7.h0(10);
        int size = zVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            f7.h1(zVar.e(i11));
            f7.h1(": ");
            f7.h1(zVar.k(i11));
            f7.h0(10);
        }
    }

    public C9964c(@NotNull L l11) {
        n nVar = n.NONE;
        this.f100298a = k.a(nVar, new C9962a(this));
        this.f100299b = k.a(nVar, new C9963b(this));
        this.f100300c = l11.O();
        this.f100301d = l11.I();
        this.f100302e = l11.p() != null;
        this.f100303f = l11.r();
    }
}
