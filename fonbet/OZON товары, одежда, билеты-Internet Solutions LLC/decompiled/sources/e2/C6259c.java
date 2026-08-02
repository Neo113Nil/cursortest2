package e2;

import e2.AbstractC6263g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6259c {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f61801j = {I1.w.c(C6259c.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0), I1.w.c(C6259c.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), I1.w.c(C6259c.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), I1.w.c(C6259c.class, "scaleX", "getScaleX()F", 0), I1.w.c(C6259c.class, "scaleY", "getScaleY()F", 0), I1.w.c(C6259c.class, "rotationX", "getRotationX()F", 0), I1.w.c(C6259c.class, "rotationY", "getRotationY()F", 0), I1.w.c(C6259c.class, "rotationZ", "getRotationZ()F", 0), I1.w.c(C6259c.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), I1.w.c(C6259c.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), I1.w.c(C6259c.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), I1.w.c(C6259c.class, "pivotX", "getPivotX()F", 0), I1.w.c(C6259c.class, "pivotY", "getPivotY()F", 0), I1.w.c(C6259c.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), I1.w.c(C6259c.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f61802a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final i2.f f61803b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6260d f61804c = new C6260d("parent");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6255C f61805d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6277u f61806e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6255C f61807f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6277u f61808g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final a f61809h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final d f61810i;

    /* renamed from: e2.c$a */
    private final class a extends id.c<InterfaceC6274r> {
        public a(@NotNull C6275s c6275s) {
            super(c6275s);
        }

        @Override // id.c
        public final void afterChange(kotlin.reflect.m mVar, InterfaceC6274r interfaceC6274r, InterfaceC6274r interfaceC6274r2) {
            InterfaceC6274r interfaceC6274r3 = interfaceC6274r2;
            i2.f c11 = C6259c.this.c();
            String name = mVar.getName();
            Intrinsics.g(interfaceC6274r3, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            c11.A(name, ((C6275s) interfaceC6274r3).a());
        }
    }

    /* renamed from: e2.c$b */
    private final class b extends id.c<Z1.h> {
        public b(float f7) {
            super(Z1.h.a(f7));
        }

        @Override // id.c
        public final void afterChange(kotlin.reflect.m mVar, Z1.h hVar, Z1.h hVar2) {
            hVar.getClass();
            float d11 = hVar2.d();
            if (Float.isNaN(d11)) {
                return;
            }
            i2.f c11 = C6259c.this.c();
            String name = mVar.getName();
            c11.getClass();
            c11.A(name, new i2.e(d11));
        }
    }

    /* renamed from: e2.c$c, reason: collision with other inner class name */
    private final class C0967c extends id.c<Float> {

        /* renamed from: a, reason: collision with root package name */
        private final String f61813a;

        public C0967c(float f7, String str) {
            super(Float.valueOf(f7));
            this.f61813a = str;
        }

        @Override // id.c
        public final void afterChange(kotlin.reflect.m mVar, Float f7, Float f11) {
            f7.floatValue();
            float floatValue = f11.floatValue();
            if (Float.isNaN(floatValue)) {
                return;
            }
            i2.f c11 = C6259c.this.c();
            String str = this.f61813a;
            if (str == null) {
                str = mVar.getName();
            }
            c11.getClass();
            c11.A(str, new i2.e(floatValue));
        }
    }

    /* renamed from: e2.c$d */
    public static final class d extends id.c<C6256D> {
        d(C6256D c6256d) {
            super(c6256d);
        }

        @Override // id.c
        public final void afterChange(kotlin.reflect.m mVar, C6256D c6256d, C6256D c6256d2) {
            C6259c.this.c().B(mVar.getName(), c6256d2.c());
        }
    }

    public C6259c(@NotNull Object obj, @NotNull i2.f fVar) {
        C6256D c6256d;
        this.f61802a = obj;
        this.f61803b = fVar;
        this.f61805d = new C6272p(fVar, -2);
        new C6272p(fVar, 0);
        this.f61806e = new C6262f(fVar, 0);
        this.f61807f = new C6272p(fVar, -1);
        new C6272p(fVar, 1);
        this.f61808g = new C6262f(fVar, 1);
        this.f61809h = new a(new C6275s("wrap"));
        new a(new C6275s("wrap"));
        c6256d = C6256D.f61794b;
        this.f61810i = new d(c6256d);
        new C0967c(1.0f, null);
        new C0967c(1.0f, null);
        new C0967c(0.0f, null);
        new C0967c(0.0f, null);
        new C0967c(0.0f, null);
        float f7 = 0;
        new b(f7);
        new b(f7);
        new b(f7);
        new C0967c(0.5f, null);
        new C0967c(0.5f, null);
        new C0967c(Float.NaN, "hWeight");
        new C0967c(Float.NaN, "vWeight");
    }

    public static void a(C6259c c6259c, C6260d c6260d) {
        AbstractC6263g.b d11 = c6260d.d();
        AbstractC6263g.b c11 = c6260d.c();
        float f7 = 0;
        ((AbstractC6258b) c6259c.f61805d).b(d11, f7, f7);
        ((AbstractC6258b) c6259c.f61807f).b(c11, f7, f7);
        i2.f fVar = c6259c.f61803b;
        fVar.getClass();
        fVar.A("hRtlBias", new i2.e(0.5f));
    }

    public static void b(C6259c c6259c, C6260d c6260d) {
        AbstractC6263g.a e11 = c6260d.e();
        AbstractC6263g.a b11 = c6260d.b();
        float f7 = 0;
        ((AbstractC6257a) c6259c.f61806e).b(e11, f7, f7);
        ((AbstractC6257a) c6259c.f61808g).b(b11, f7, f7);
        i2.f fVar = c6259c.f61803b;
        fVar.getClass();
        fVar.A("vBias", new i2.e(0.5f));
    }

    @NotNull
    public final i2.f c() {
        return this.f61803b;
    }

    @NotNull
    public final InterfaceC6255C d() {
        return this.f61807f;
    }

    @NotNull
    public final C6260d e() {
        return this.f61804c;
    }

    @NotNull
    public final InterfaceC6255C f() {
        return this.f61805d;
    }

    @NotNull
    public final InterfaceC6277u g() {
        return this.f61806e;
    }

    public final void h(float f7) {
        if (Float.isNaN(f7)) {
            return;
        }
        i2.f fVar = this.f61803b;
        fVar.getClass();
        fVar.A("hBias", new i2.e(f7));
    }

    public final void i(@NotNull C6256D c6256d) {
        this.f61810i.setValue(this, f61801j[2], c6256d);
    }

    public final void j(@NotNull C6275s c6275s) {
        this.f61809h.setValue(this, f61801j[0], c6275s);
    }
}
