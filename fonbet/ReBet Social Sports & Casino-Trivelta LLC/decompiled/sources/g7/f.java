package g7;

import d7.InterfaceC4012a;
import d7.InterfaceC4015d;
import e7.InterfaceC4184b;
import g7.InterfaceC4364a;
import i7.i;
import i7.j;
import i7.k;
import i7.l;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public final class f implements InterfaceC4364a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4015d f47124a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.c f47125b;

    /* renamed from: c, reason: collision with root package name */
    public final k f47126c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47127d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47128e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47129f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47130g;

    /* renamed from: h, reason: collision with root package name */
    public j f47131h;

    /* renamed from: i, reason: collision with root package name */
    public final int f47132i;

    /* renamed from: j, reason: collision with root package name */
    public int f47133j;

    /* renamed from: k, reason: collision with root package name */
    public final a f47134k;

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final int f47135a;

        public a() {
            this.f47135a = f.this.f47132i;
        }

        @Override // i7.i
        public int a() {
            return f.this.f47133j;
        }

        @Override // i7.i
        public void b(int i10) {
            if (i10 != f.this.f47133j) {
                f fVar = f.this;
                fVar.f47133j = RangesKt.coerceIn(i10, 1, fVar.f47132i);
                j m10 = f.this.m();
                if (m10 != null) {
                    m10.d(f.this.f47133j);
                }
            }
        }

        @Override // i7.i
        public int c() {
            return this.f47135a;
        }
    }

    public f(String str, InterfaceC4015d animationInformation, e7.c bitmapFrameRenderer, k frameLoaderFactory, boolean z10) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(frameLoaderFactory, "frameLoaderFactory");
        this.f47124a = animationInformation;
        this.f47125b = bitmapFrameRenderer;
        this.f47126c = frameLoaderFactory;
        this.f47127d = z10;
        this.f47128e = str == null ? String.valueOf(hashCode()) : str;
        this.f47129f = animationInformation.n();
        this.f47130g = animationInformation.h();
        int l10 = l(animationInformation);
        this.f47132i = l10;
        this.f47133j = l10;
        this.f47134k = new a();
    }

    public static final Unit n() {
        return Unit.INSTANCE;
    }

    @Override // g7.InterfaceC4364a
    public void a(int i10, int i11, Function0 function0) {
        if (i10 <= 0 || i11 <= 0 || this.f47129f <= 0 || this.f47130g <= 0) {
            return;
        }
        g k10 = k(i10, i11);
        j m10 = m();
        if (m10 != null) {
            int b10 = k10.b();
            int b11 = k10.b();
            if (function0 == null) {
                function0 = new Function0() { // from class: g7.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit n10;
                        n10 = f.n();
                        return n10;
                    }
                };
            }
            m10.a(b10, b11, function0);
        }
    }

    @Override // g7.InterfaceC4364a
    public void b() {
        j m10 = m();
        if (m10 != null) {
            m10.b();
        }
        e();
    }

    @Override // g7.InterfaceC4364a
    public void c(b bVar, InterfaceC4184b interfaceC4184b, InterfaceC4012a interfaceC4012a, int i10, Function0 function0) {
        InterfaceC4364a.C0684a.e(this, bVar, interfaceC4184b, interfaceC4012a, i10, function0);
    }

    @Override // g7.InterfaceC4364a
    public H6.a d(int i10, int i11, int i12) {
        g k10 = k(i11, i12);
        j m10 = m();
        l c10 = m10 != null ? m10.c(i10, k10.b(), k10.a()) : null;
        if (c10 != null) {
            i7.e.f48139a.h(this.f47134k, c10);
        }
        if (c10 != null) {
            return c10.a();
        }
        return null;
    }

    @Override // g7.InterfaceC4364a
    public void e() {
        j m10 = m();
        if (m10 != null) {
            k.f48167d.b(this.f47128e, m10);
        }
        this.f47131h = null;
    }

    public final g k(int i10, int i11) {
        if (!this.f47127d) {
            return new g(this.f47129f, this.f47130g);
        }
        int i12 = this.f47129f;
        int i13 = this.f47130g;
        if (i10 < i12 || i11 < i13) {
            double d10 = i12 / i13;
            if (i11 > i10) {
                i13 = RangesKt.coerceAtMost(i11, i13);
                i12 = (int) (i13 * d10);
            } else {
                i12 = RangesKt.coerceAtMost(i10, i12);
                i13 = (int) (i12 / d10);
            }
        }
        return new g(i12, i13);
    }

    public final int l(InterfaceC4015d interfaceC4015d) {
        return (int) RangesKt.coerceAtLeast(TimeUnit.SECONDS.toMillis(1L) / (interfaceC4015d.c() / interfaceC4015d.a()), 1L);
    }

    public final j m() {
        if (this.f47131h == null) {
            this.f47131h = this.f47126c.b(this.f47128e, this.f47125b, this.f47124a);
        }
        return this.f47131h;
    }
}
