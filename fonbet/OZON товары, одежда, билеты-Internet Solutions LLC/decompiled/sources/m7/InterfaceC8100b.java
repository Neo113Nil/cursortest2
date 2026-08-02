package m7;

import android.animation.TypeEvaluator;
import android.util.Property;
import androidx.annotation.NonNull;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC8100b {

    /* renamed from: m7.b$a */
    public static class a implements TypeEvaluator<d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f74609b = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d f74610a = new d(0);

        @Override // android.animation.TypeEvaluator
        @NonNull
        public final d evaluate(float f7, @NonNull d dVar, @NonNull d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float f11 = dVar3.f74613a;
            float f12 = 1.0f - f7;
            float f13 = (dVar4.f74613a * f7) + (f11 * f12);
            float f14 = dVar3.f74614b;
            float f15 = (dVar4.f74614b * f7) + (f14 * f12);
            float f16 = dVar3.f74615c;
            float f17 = (f7 * dVar4.f74615c) + (f12 * f16);
            d dVar5 = this.f74610a;
            dVar5.f74613a = f13;
            dVar5.f74614b = f15;
            dVar5.f74615c = f17;
            return dVar5;
        }
    }

    /* renamed from: m7.b$b, reason: collision with other inner class name */
    public static class C1261b extends Property<InterfaceC8100b, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1261b f74611a = new C1261b(d.class, "circularReveal");

        @Override // android.util.Property
        public final d get(@NonNull InterfaceC8100b interfaceC8100b) {
            return interfaceC8100b.c();
        }

        @Override // android.util.Property
        public final void set(@NonNull InterfaceC8100b interfaceC8100b, d dVar) {
            interfaceC8100b.a();
        }
    }

    /* renamed from: m7.b$c */
    public static class c extends Property<InterfaceC8100b, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f74612a = new c(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        @NonNull
        public final Integer get(@NonNull InterfaceC8100b interfaceC8100b) {
            return Integer.valueOf(interfaceC8100b.e());
        }

        @Override // android.util.Property
        public final void set(@NonNull InterfaceC8100b interfaceC8100b, @NonNull Integer num) {
            num.getClass();
            interfaceC8100b.f();
        }
    }

    /* renamed from: m7.b$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public float f74613a;

        /* renamed from: b, reason: collision with root package name */
        public float f74614b;

        /* renamed from: c, reason: collision with root package name */
        public float f74615c;

        /* synthetic */ d(int i11) {
            this();
        }

        private d() {
        }
    }

    void a();

    void b();

    d c();

    void d();

    int e();

    void f();

    void g();
}
