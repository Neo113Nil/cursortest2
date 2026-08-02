package y7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import i7.C7017a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: m, reason: collision with root package name */
    public static final C10858i f106138m = new C10858i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    C10853d f106139a = new j();

    /* renamed from: b, reason: collision with root package name */
    C10853d f106140b = new j();

    /* renamed from: c, reason: collision with root package name */
    C10853d f106141c = new j();

    /* renamed from: d, reason: collision with root package name */
    C10853d f106142d = new j();

    /* renamed from: e, reason: collision with root package name */
    InterfaceC10852c f106143e = new C10850a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    InterfaceC10852c f106144f = new C10850a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    InterfaceC10852c f106145g = new C10850a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    InterfaceC10852c f106146h = new C10850a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    C10855f f106147i = new C10855f();

    /* renamed from: j, reason: collision with root package name */
    C10855f f106148j = new C10855f();

    /* renamed from: k, reason: collision with root package name */
    C10855f f106149k = new C10855f();

    /* renamed from: l, reason: collision with root package name */
    C10855f f106150l = new C10855f();

    @NonNull
    public static a a(int i11, int i12, Context context) {
        return b(context, i11, i12, new C10850a(0));
    }

    @NonNull
    private static a b(Context context, int i11, int i12, @NonNull InterfaceC10852c interfaceC10852c) {
        if (i12 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
            i11 = i12;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, C7017a.f65926J);
        try {
            int i13 = obtainStyledAttributes.getInt(0, 0);
            int i14 = obtainStyledAttributes.getInt(3, i13);
            int i15 = obtainStyledAttributes.getInt(4, i13);
            int i16 = obtainStyledAttributes.getInt(2, i13);
            int i17 = obtainStyledAttributes.getInt(1, i13);
            InterfaceC10852c i18 = i(obtainStyledAttributes, 5, interfaceC10852c);
            InterfaceC10852c i19 = i(obtainStyledAttributes, 8, i18);
            InterfaceC10852c i21 = i(obtainStyledAttributes, 9, i18);
            InterfaceC10852c i22 = i(obtainStyledAttributes, 7, i18);
            InterfaceC10852c i23 = i(obtainStyledAttributes, 6, i18);
            a aVar = new a();
            aVar.o(i14, i19);
            aVar.s(i15, i21);
            aVar.k(i16, i22);
            aVar.g(i17, i23);
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static a c(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        return d(context, attributeSet, i11, i12, new C10850a(0));
    }

    @NonNull
    public static a d(@NonNull Context context, AttributeSet attributeSet, int i11, int i12, @NonNull InterfaceC10852c interfaceC10852c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65918B, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, interfaceC10852c);
    }

    @NonNull
    private static InterfaceC10852c i(TypedArray typedArray, int i11, @NonNull InterfaceC10852c interfaceC10852c) {
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            int i12 = peekValue.type;
            if (i12 == 5) {
                return new C10850a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i12 == 6) {
                return new C10858i(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC10852c;
    }

    @NonNull
    public final C10853d e() {
        return this.f106142d;
    }

    @NonNull
    public final InterfaceC10852c f() {
        return this.f106146h;
    }

    @NonNull
    public final C10853d g() {
        return this.f106141c;
    }

    @NonNull
    public final InterfaceC10852c h() {
        return this.f106145g;
    }

    @NonNull
    public final C10853d j() {
        return this.f106139a;
    }

    @NonNull
    public final InterfaceC10852c k() {
        return this.f106143e;
    }

    @NonNull
    public final C10853d l() {
        return this.f106140b;
    }

    @NonNull
    public final InterfaceC10852c m() {
        return this.f106144f;
    }

    public final boolean n(@NonNull RectF rectF) {
        boolean z11 = this.f106150l.getClass().equals(C10855f.class) && this.f106148j.getClass().equals(C10855f.class) && this.f106147i.getClass().equals(C10855f.class) && this.f106149k.getClass().equals(C10855f.class);
        float a11 = this.f106143e.a(rectF);
        return z11 && ((this.f106144f.a(rectF) > a11 ? 1 : (this.f106144f.a(rectF) == a11 ? 0 : -1)) == 0 && (this.f106146h.a(rectF) > a11 ? 1 : (this.f106146h.a(rectF) == a11 ? 0 : -1)) == 0 && (this.f106145g.a(rectF) > a11 ? 1 : (this.f106145g.a(rectF) == a11 ? 0 : -1)) == 0) && ((this.f106140b instanceof j) && (this.f106139a instanceof j) && (this.f106141c instanceof j) && (this.f106142d instanceof j));
    }

    @NonNull
    public final k o(float f7) {
        a aVar = new a(this);
        aVar.c(f7);
        return aVar.a();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private C10853d f106151a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private C10853d f106152b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        private C10853d f106153c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        private C10853d f106154d;

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        private InterfaceC10852c f106155e;

        /* renamed from: f, reason: collision with root package name */
        @NonNull
        private InterfaceC10852c f106156f;

        /* renamed from: g, reason: collision with root package name */
        @NonNull
        private InterfaceC10852c f106157g;

        /* renamed from: h, reason: collision with root package name */
        @NonNull
        private InterfaceC10852c f106158h;

        /* renamed from: i, reason: collision with root package name */
        @NonNull
        private C10855f f106159i;

        /* renamed from: j, reason: collision with root package name */
        @NonNull
        private C10855f f106160j;

        /* renamed from: k, reason: collision with root package name */
        @NonNull
        private C10855f f106161k;

        /* renamed from: l, reason: collision with root package name */
        @NonNull
        private C10855f f106162l;

        public a() {
            this.f106151a = new j();
            this.f106152b = new j();
            this.f106153c = new j();
            this.f106154d = new j();
            this.f106155e = new C10850a(0.0f);
            this.f106156f = new C10850a(0.0f);
            this.f106157g = new C10850a(0.0f);
            this.f106158h = new C10850a(0.0f);
            this.f106159i = new C10855f();
            this.f106160j = new C10855f();
            this.f106161k = new C10855f();
            this.f106162l = new C10855f();
        }

        private static float b(C10853d c10853d) {
            if (c10853d instanceof j) {
                return -1.0f;
            }
            boolean z11 = c10853d instanceof C10854e;
            return -1.0f;
        }

        @NonNull
        public final k a() {
            k kVar = new k();
            kVar.f106139a = this.f106151a;
            kVar.f106140b = this.f106152b;
            kVar.f106141c = this.f106153c;
            kVar.f106142d = this.f106154d;
            kVar.f106143e = this.f106155e;
            kVar.f106144f = this.f106156f;
            kVar.f106145g = this.f106157g;
            kVar.f106146h = this.f106158h;
            kVar.f106147i = this.f106159i;
            kVar.f106148j = this.f106160j;
            kVar.f106149k = this.f106161k;
            kVar.f106150l = this.f106162l;
            return kVar;
        }

        @NonNull
        public final void c(float f7) {
            p(f7);
            t(f7);
            l(f7);
            h(f7);
        }

        @NonNull
        public final void d(@NonNull InterfaceC10852c interfaceC10852c) {
            this.f106155e = interfaceC10852c;
            this.f106156f = interfaceC10852c;
            this.f106157g = interfaceC10852c;
            this.f106158h = interfaceC10852c;
        }

        @NonNull
        public final void e(float f7) {
            C10853d a11 = C10857h.a(0);
            this.f106151a = a11;
            b(a11);
            this.f106152b = a11;
            b(a11);
            this.f106153c = a11;
            b(a11);
            this.f106154d = a11;
            b(a11);
            c(f7);
        }

        @NonNull
        public final void f(float f7) {
            C10853d a11 = C10857h.a(0);
            this.f106154d = a11;
            b(a11);
            h(f7);
        }

        @NonNull
        public final void g(int i11, @NonNull InterfaceC10852c interfaceC10852c) {
            C10853d a11 = C10857h.a(i11);
            this.f106154d = a11;
            b(a11);
            this.f106158h = interfaceC10852c;
        }

        @NonNull
        public final void h(float f7) {
            this.f106158h = new C10850a(f7);
        }

        @NonNull
        public final void i(@NonNull InterfaceC10852c interfaceC10852c) {
            this.f106158h = interfaceC10852c;
        }

        @NonNull
        public final void j(float f7) {
            C10853d a11 = C10857h.a(0);
            this.f106153c = a11;
            b(a11);
            l(f7);
        }

        @NonNull
        public final void k(int i11, @NonNull InterfaceC10852c interfaceC10852c) {
            C10853d a11 = C10857h.a(i11);
            this.f106153c = a11;
            b(a11);
            this.f106157g = interfaceC10852c;
        }

        @NonNull
        public final void l(float f7) {
            this.f106157g = new C10850a(f7);
        }

        @NonNull
        public final void m(@NonNull InterfaceC10852c interfaceC10852c) {
            this.f106157g = interfaceC10852c;
        }

        @NonNull
        public final void n(float f7) {
            C10853d a11 = C10857h.a(0);
            this.f106151a = a11;
            b(a11);
            p(f7);
        }

        @NonNull
        public final void o(int i11, @NonNull InterfaceC10852c interfaceC10852c) {
            C10853d a11 = C10857h.a(i11);
            this.f106151a = a11;
            b(a11);
            this.f106155e = interfaceC10852c;
        }

        @NonNull
        public final void p(float f7) {
            this.f106155e = new C10850a(f7);
        }

        @NonNull
        public final void q(@NonNull InterfaceC10852c interfaceC10852c) {
            this.f106155e = interfaceC10852c;
        }

        @NonNull
        public final void r(float f7) {
            C10853d a11 = C10857h.a(0);
            this.f106152b = a11;
            b(a11);
            t(f7);
        }

        @NonNull
        public final void s(int i11, @NonNull InterfaceC10852c interfaceC10852c) {
            C10853d a11 = C10857h.a(i11);
            this.f106152b = a11;
            b(a11);
            this.f106156f = interfaceC10852c;
        }

        @NonNull
        public final void t(float f7) {
            this.f106156f = new C10850a(f7);
        }

        @NonNull
        public final void u(@NonNull InterfaceC10852c interfaceC10852c) {
            this.f106156f = interfaceC10852c;
        }

        public a(@NonNull k kVar) {
            this.f106151a = new j();
            this.f106152b = new j();
            this.f106153c = new j();
            this.f106154d = new j();
            this.f106155e = new C10850a(0.0f);
            this.f106156f = new C10850a(0.0f);
            this.f106157g = new C10850a(0.0f);
            this.f106158h = new C10850a(0.0f);
            this.f106159i = new C10855f();
            this.f106160j = new C10855f();
            this.f106161k = new C10855f();
            this.f106162l = new C10855f();
            this.f106151a = kVar.f106139a;
            this.f106152b = kVar.f106140b;
            this.f106153c = kVar.f106141c;
            this.f106154d = kVar.f106142d;
            this.f106155e = kVar.f106143e;
            this.f106156f = kVar.f106144f;
            this.f106157g = kVar.f106145g;
            this.f106158h = kVar.f106146h;
            this.f106159i = kVar.f106147i;
            this.f106160j = kVar.f106148j;
            this.f106161k = kVar.f106149k;
            this.f106162l = kVar.f106150l;
        }
    }
}
