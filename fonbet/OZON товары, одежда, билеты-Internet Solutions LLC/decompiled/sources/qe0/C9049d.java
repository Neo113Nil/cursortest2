package qe0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.s;
import android.content.Context;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.C9867b;
import we0.p;
import xe.B0;
import xe.H0;

/* renamed from: qe0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9049d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M0<p> f82043a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f82044b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9047b f82045c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<C9048c> f82046d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<p> f82047e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<p> f82048f;

    /* renamed from: g, reason: collision with root package name */
    private B0 f82049g;

    /* renamed from: qe0.d$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C9048c f82050a;

        /* renamed from: b, reason: collision with root package name */
        private final p f82051b;

        public a(C9048c c9048c, p pVar) {
            this.f82050a = c9048c;
            this.f82051b = pVar;
        }

        public final C9048c a() {
            return this.f82050a;
        }

        public final p b() {
            return this.f82051b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f82050a, aVar.f82050a) && Intrinsics.d(this.f82051b, aVar.f82051b);
        }

        public final int hashCode() {
            C9048c c9048c = this.f82050a;
            int hashCode = (c9048c == null ? 0 : c9048c.hashCode()) * 31;
            p pVar = this.f82051b;
            return hashCode + (pVar != null ? pVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "DataPair(compassData=" + this.f82050a + ", locationInfo=" + this.f82051b + ")";
        }
    }

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.compass.LocationModifierByCompass$start$1", f = "LocationModifierByCompass.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qe0.d$b */
    static final class b extends j implements InterfaceC6511n<C9048c, p, kotlin.coroutines.d<? super a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ C9048c f82052d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ p f82053e;

        @Override // fd.InterfaceC6511n
        public final Object invoke(C9048c c9048c, p pVar, kotlin.coroutines.d<? super a> dVar) {
            b bVar = new b(3, dVar);
            bVar.f82052d = c9048c;
            bVar.f82053e = pVar;
            return bVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            return new a(this.f82052d, this.f82053e);
        }
    }

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.compass.LocationModifierByCompass$start$2", f = "LocationModifierByCompass.kt", l = {47, 49, 52, 54}, m = "invokeSuspend")
    /* renamed from: qe0.d$c */
    static final class c extends j implements Function2<a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82054d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f82055e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = C9049d.this.new c(dVar);
            cVar.f82055e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
        
            if (xe.Y.b(0, r8) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        
            if (r9.emit(null, r8) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82054d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = (a) this.f82055e;
                C9867b c9867b = C9867b.f99466a;
                C9867b.g("New merged coords with compass; " + aVar2, null, 6);
                p b11 = aVar2.b();
                C9049d c9049d = C9049d.this;
                if (b11 == null) {
                    x0 x0Var = c9049d.f82047e;
                    this.f82054d = 3;
                } else if (aVar2.a() != null) {
                    x0 x0Var2 = c9049d.f82047e;
                    p a11 = p.a(aVar2.b(), null, new Float(aVar2.a().a()), null, 61);
                    this.f82054d = 1;
                } else {
                    x0 x0Var3 = c9049d.f82047e;
                    p b12 = aVar2.b();
                    this.f82054d = 2;
                }
                return Unit.f71690a;
            }
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            this.f82054d = 4;
        }
    }

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.compass.LocationModifierByCompass$start$3", f = "LocationModifierByCompass.kt", l = {58, 59}, m = "invokeSuspend")
    /* renamed from: qe0.d$d, reason: collision with other inner class name */
    static final class C1388d extends j implements Function2<p, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82057d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f82058e;

        C1388d(kotlin.coroutines.d<? super C1388d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1388d c1388d = C9049d.this.new C1388d(dVar);
            c1388d.f82058e = obj;
            return c1388d;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p pVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1388d) create(pVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (xe.Y.b(0, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (r1.emit(r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82057d;
            if (i11 == 0) {
                s.b(obj);
                p pVar = (p) this.f82058e;
                x0 x0Var = C9049d.this.f82047e;
                this.f82057d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            this.f82057d = 2;
        }
    }

    public C9049d(M0 locationFlow, Context context, C2862e coroutineScope) {
        C9047b compassListener = new C9047b(context, coroutineScope);
        InterfaceC2395h<C9048c> filteredCompass = new C9046a(compassListener.d()).b();
        Intrinsics.checkNotNullParameter(locationFlow, "locationFlow");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(compassListener, "compassListener");
        Intrinsics.checkNotNullParameter(filteredCompass, "filteredCompass");
        this.f82043a = locationFlow;
        this.f82044b = coroutineScope;
        this.f82045c = compassListener;
        this.f82046d = filteredCompass;
        x0<p> a11 = O0.a(null);
        this.f82047e = a11;
        this.f82048f = C2399j.b(a11);
    }

    @NotNull
    public final M0<p> b() {
        return this.f82048f;
    }

    public final void c() {
        B0 C11;
        C9047b c9047b = this.f82045c;
        c9047b.f();
        B0 b02 = this.f82049g;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C9867b c9867b = C9867b.f99466a;
        C9867b.g("Try using compas, isCompassAvailable " + c9047b.e(), null, 6);
        boolean e11 = c9047b.e();
        M0<p> m02 = this.f82043a;
        C2862e c2862e = this.f82044b;
        if (e11) {
            C11 = C2399j.C(new C2408n0(new C2417s0(this.f82046d, m02, new b(3, null)), new c(null)), c2862e);
        } else {
            C11 = C2399j.C(new C2408n0(m02, new C1388d(null)), c2862e);
        }
        this.f82049g = C11;
    }

    public final void d() {
        this.f82045c.g();
        B0 b02 = this.f82049g;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }
}
