package n5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import hd.C6915b;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n5.f;
import n5.g;
import org.jetbrains.annotations.NotNull;
import r6.C9181g;
import sf.InterfaceC9683i;
import v5.C10239m;
import w5.C10435g;
import w5.EnumC10434f;
import xe.C10759y0;

/* loaded from: classes8.dex */
public final class u implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f76545a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f76546b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f76547c;

    public static final class a implements g.a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f76548a;

        public a() {
            this(0);
        }

        @Override // n5.g.a
        public final g a(@NotNull p5.m mVar, @NotNull C10239m c10239m) {
            if (Intrinsics.d(mVar.b(), "image/svg+xml") || t.a(mVar.c().d())) {
                return new u(mVar.c(), c10239m, this.f76548a);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f76548a == ((a) obj).f76548a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76548a);
        }

        public a(int i11) {
            this.f76548a = true;
        }
    }

    static final class b extends AbstractC7737t implements Function0<e> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            float g10;
            float e11;
            int c11;
            int c12;
            float max;
            u uVar = u.this;
            InterfaceC9683i d11 = uVar.f76545a.d();
            try {
                C9181g i11 = C9181g.i(d11.a2());
                d11.close();
                RectF f7 = i11.f();
                if (!uVar.e() || f7 == null) {
                    g10 = i11.g();
                    e11 = i11.e();
                } else {
                    g10 = f7.width();
                    e11 = f7.height();
                }
                Pair b11 = u.b(uVar, g10, e11, uVar.f76546b.m());
                float floatValue = ((Number) b11.a()).floatValue();
                float floatValue2 = ((Number) b11.b()).floatValue();
                if (g10 <= 0.0f || e11 <= 0.0f) {
                    c11 = C6915b.c(floatValue);
                    c12 = C6915b.c(floatValue2);
                } else {
                    float f11 = floatValue / g10;
                    float f12 = floatValue2 / e11;
                    int i12 = f.a.f76520a[uVar.f76546b.m().ordinal()];
                    if (i12 == 1) {
                        max = Math.max(f11, f12);
                    } else {
                        if (i12 != 2) {
                            throw new Sc.o();
                        }
                        max = Math.min(f11, f12);
                    }
                    c11 = (int) (max * g10);
                    c12 = (int) (max * e11);
                }
                if (f7 == null && g10 > 0.0f && e11 > 0.0f) {
                    i11.o(g10, e11);
                }
                i11.p();
                i11.n();
                Bitmap.Config e12 = uVar.f76546b.e();
                if (e12 == null || e12 == Bitmap.Config.HARDWARE) {
                    e12 = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(c11, c12, e12);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
                uVar.f76546b.k().e();
                i11.l(new Canvas(createBitmap));
                return new e(new BitmapDrawable(uVar.f76546b.f().getResources(), createBitmap), true);
            } finally {
            }
        }
    }

    public u(@NotNull n nVar, @NotNull C10239m c10239m, boolean z11) {
        this.f76545a = nVar;
        this.f76546b = c10239m;
        this.f76547c = z11;
    }

    public static final Pair b(u uVar, float f7, float f11, EnumC10434f enumC10434f) {
        C10239m c10239m = uVar.f76546b;
        if (!Intrinsics.d(c10239m.n(), C10435g.f103580c)) {
            C10435g n11 = c10239m.n();
            return new Pair(Float.valueOf(A5.j.a(n11.a(), enumC10434f)), Float.valueOf(A5.j.a(n11.b(), enumC10434f)));
        }
        if (f7 <= 0.0f) {
            f7 = 512.0f;
        }
        if (f11 <= 0.0f) {
            f11 = 512.0f;
        }
        return new Pair(Float.valueOf(f7), Float.valueOf(f11));
    }

    @Override // n5.g
    public final Object a(@NotNull kotlin.coroutines.d<? super e> dVar) {
        return C10759y0.a(new b(), (kotlin.coroutines.jvm.internal.c) dVar);
    }

    public final boolean e() {
        return this.f76547c;
    }
}
