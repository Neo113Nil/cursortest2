package zi;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import C.Y;
import Sc.C4005g;
import android.net.Uri;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd.C7665d;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import yi.e;
import zi.k;

/* loaded from: classes10.dex */
public final class m extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private yi.i f109219a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Oi.b f109220b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<l> f109221c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<l> f109222d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C0 f109223e;

    /* renamed from: f, reason: collision with root package name */
    private Y.c f109224f;

    /* renamed from: g, reason: collision with root package name */
    private float f109225g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$1", f = "CameraScreenViewModel.kt", l = {77}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109226d;

        /* renamed from: zi.m$a$a, reason: collision with other inner class name */
        static final class C2355a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f109228a;

            C2355a(m mVar) {
                this.f109228a = mVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                Object h02 = m.h0(this.f109228a, (yi.e) obj, dVar);
                return h02 == Wc.a.COROUTINE_SUSPENDED ? h02 : Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109226d;
            if (i11 == 0) {
                Sc.s.b(obj);
                m mVar = m.this;
                B0<yi.e> events = mVar.f109219a.getEvents();
                C2355a c2355a = new C2355a(mVar);
                this.f109226d = 1;
                if (events.collect(c2355a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$2", f = "CameraScreenViewModel.kt", l = {84}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109229d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f109231a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ I f109232b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$2$1", f = "CameraScreenViewModel.kt", l = {107}, m = "emit")
            /* renamed from: zi.m$b$a$a, reason: collision with other inner class name */
            static final class C2356a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                Object f109233d;

                /* renamed from: e, reason: collision with root package name */
                yi.f f109234e;

                /* renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f109235f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ a<T> f109236g;

                /* renamed from: h, reason: collision with root package name */
                int f109237h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2356a(a<? super T> aVar, kotlin.coroutines.d<? super C2356a> dVar) {
                    super(dVar);
                    this.f109236g = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f109235f = obj;
                    this.f109237h |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f109236g.emit(null, this);
                }
            }

            a(m mVar, I i11) {
                this.f109231a = mVar;
                this.f109232b = i11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // Ae.InterfaceC2397i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(yi.f fVar, kotlin.coroutines.d<? super Unit> dVar) {
                C2356a c2356a;
                int i11;
                int i12;
                x0 x0Var;
                Object value;
                l lVar;
                yi.f fVar2;
                a<T> aVar;
                yi.f fVar3;
                if (dVar instanceof C2356a) {
                    c2356a = (C2356a) dVar;
                    int i13 = c2356a.f109237h;
                    if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c2356a.f109237h = i13 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c2356a.f109235f;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c2356a.f109237h;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            int i14 = 0;
                            boolean z11 = fVar.d() && fVar.c();
                            m mVar = this.f109231a;
                            if (z11) {
                                i14 = ((l) mVar.f109221c.getValue()).h();
                            } else if (fVar.c()) {
                                i12 = 1;
                                x0Var = mVar.f109221c;
                                do {
                                    value = x0Var.getValue();
                                    lVar = (l) value;
                                } while (!x0Var.b(value, l.a(lVar, false, null, t.a(lVar.c(), null, false, false, z11, 7), 0.0f, fVar.g(), null, i12, false, 0, false, fVar.f(), fVar.e(), fVar.h(), fVar.b(), null, 17323)));
                                if (fVar.i() || this.f109232b.f71783a) {
                                    fVar2 = fVar;
                                } else {
                                    c2356a.f109233d = this;
                                    fVar2 = fVar;
                                    c2356a.f109234e = fVar2;
                                    c2356a.f109237h = 1;
                                    if (mVar.v0(c2356a) == aVar2) {
                                        return aVar2;
                                    }
                                }
                                aVar = this;
                                fVar3 = fVar2;
                            } else if (!fVar.d()) {
                                i14 = ((l) mVar.f109221c.getValue()).h();
                            }
                            i12 = i14;
                            x0Var = mVar.f109221c;
                            do {
                                value = x0Var.getValue();
                                lVar = (l) value;
                            } while (!x0Var.b(value, l.a(lVar, false, null, t.a(lVar.c(), null, false, false, z11, 7), 0.0f, fVar.g(), null, i12, false, 0, false, fVar.f(), fVar.e(), fVar.h(), fVar.b(), null, 17323)));
                            if (fVar.i()) {
                            }
                            fVar2 = fVar;
                            aVar = this;
                            fVar3 = fVar2;
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fVar3 = c2356a.f109234e;
                            aVar = (a) c2356a.f109233d;
                            Sc.s.b(obj);
                        }
                        aVar.f109232b.f71783a = fVar3.i();
                        return Unit.f71690a;
                    }
                }
                c2356a = new C2356a(this, dVar);
                Object obj2 = c2356a.f109235f;
                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2356a.f109237h;
                if (i11 != 0) {
                }
                aVar.f109232b.f71783a = fVar3.i();
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109229d;
            if (i11 == 0) {
                Sc.s.b(obj);
                I i12 = new I();
                m mVar = m.this;
                M0<yi.f> i13 = mVar.f109219a.i();
                a aVar2 = new a(mVar, i12);
                this.f109229d = 1;
                if (i13.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$3", f = "CameraScreenViewModel.kt", l = {114}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109238d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f109240a;

            a(m mVar) {
                this.f109240a = mVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                Object i02 = m.i0(this.f109240a, (k) obj, dVar);
                return i02 == Wc.a.COROUTINE_SUSPENDED ? i02 : Unit.f71690a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109238d;
            if (i11 == 0) {
                Sc.s.b(obj);
                m mVar = m.this;
                C0 c02 = mVar.f109223e;
                a aVar2 = new a(mVar);
                this.f109238d = 1;
                if (c02.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109241a;

        static {
            int[] iArr = new int[yi.g.values().length];
            try {
                iArr[yi.g.TELEPHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yi.g.ULTRA_WIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yi.g.WIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f109241a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$onUiIntent$1", f = "CameraScreenViewModel.kt", l = {151}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109242d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f109244f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k kVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f109244f = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new e(this.f109244f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109242d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0 c02 = m.this.f109223e;
                this.f109242d = 1;
                if (c02.emit(this.f109244f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$setSurfaceProvider$1", f = "CameraScreenViewModel.kt", l = {146}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109245d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109245d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f109245d = 1;
                if (m.this.v0(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel", f = "CameraScreenViewModel.kt", l = {209, 210}, m = "takePhoto")
    static final class g extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        m f109247d;

        /* renamed from: e, reason: collision with root package name */
        Uri f109248e;

        /* renamed from: f, reason: collision with root package name */
        x0 f109249f;

        /* renamed from: g, reason: collision with root package name */
        Object f109250g;

        /* renamed from: h, reason: collision with root package name */
        l f109251h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f109252i;

        /* renamed from: k, reason: collision with root package name */
        int f109254k;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f109252i = obj;
            this.f109254k |= LinearLayoutManager.INVALID_OFFSET;
            return m.this.t0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$takeVideo$2", f = "CameraScreenViewModel.kt", l = {248}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109255d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new h(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109255d;
            m mVar = m.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f109255d = 1;
                if (mVar.v0(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            mVar.f109219a.d();
            return Unit.f71690a;
        }
    }

    public m(@NotNull yi.i cameraStateProvider, @NotNull Oi.b ozMediaFileManager) {
        Intrinsics.checkNotNullParameter(cameraStateProvider, "cameraStateProvider");
        Intrinsics.checkNotNullParameter(ozMediaFileManager, "ozMediaFileManager");
        this.f109219a = cameraStateProvider;
        this.f109220b = ozMediaFileManager;
        x0<l> a11 = O0.a(new l(0));
        this.f109221c = a11;
        this.f109222d = C2399j.b(a11);
        this.f109223e = E0.b(0, 10, null, 5);
        this.f109225g = 1.0f;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new b(null), 3);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(null), 3);
    }

    public static final void d0(m mVar, Hi.a aVar) {
        l value;
        l lVar;
        u a11;
        t a12;
        int a13;
        Hi.b bVar = aVar instanceof Hi.b ? (Hi.b) aVar : null;
        if (bVar != null) {
            x0<l> x0Var = mVar.f109221c;
            do {
                value = x0Var.getValue();
                lVar = value;
                a11 = u.a(lVar.j(), false, bVar.d(), false, 5);
                a12 = t.a(lVar.c(), bVar.b(), false, false, false, 14);
                a13 = bVar.a();
            } while (!x0Var.b(value, l.a(lVar, false, a11, a12, bVar.c(), 0.0f, null, a13, bVar.d() && bVar.a() == 0, (bVar.d() && bVar.a() == 1) ? 1 : 2, false, false, false, 0.0f, null, null, 32305)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d2, code lost:
    
        if (r10.b(r9, zi.l.a(r13, false, r15, r16, 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, (Hi.k) r2, 16377)) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a8 -> B:10:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h0(m mVar, yi.e eVar, kotlin.coroutines.d dVar) {
        o oVar;
        int i11;
        l value;
        l value2;
        l lVar;
        e.a aVar;
        l value3;
        e.c cVar;
        l value4;
        l value5;
        l lVar2;
        x0 x0Var;
        Object value6;
        Object obj;
        l lVar3;
        u uVar;
        t tVar;
        m mVar2 = mVar;
        yi.e eVar2 = eVar;
        mVar2.getClass();
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i12 = oVar.f109270m;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oVar.f109270m = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = oVar.f109268k;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = oVar.f109270m;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = eVar2 instanceof e.f;
                    x0<l> x0Var2 = mVar2.f109221c;
                    yi.i iVar = mVar2.f109219a;
                    if (!z11) {
                        if (eVar2 instanceof e.C2307e) {
                            do {
                                value5 = x0Var2.getValue();
                                lVar2 = value5;
                            } while (!x0Var2.b(value5, l.a(lVar2, false, u.a(lVar2.j(), false, false, false, 6), t.a(lVar2.c(), null, false, false, false, 13), 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 32761)));
                        } else if (eVar2 instanceof e.b) {
                            do {
                                value4 = x0Var2.getValue();
                            } while (!x0Var2.b(value4, l.a(value4, false, null, null, 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, ((e.b) eVar2).a(), null, 24575)));
                        } else if (eVar2 instanceof e.c) {
                            do {
                                value3 = x0Var2.getValue();
                                cVar = (e.c) eVar2;
                            } while (!x0Var2.b(value3, l.a(value3, false, null, null, 0.0f, 0.0f, null, 0, false, 0, false, cVar.b(), cVar.a(), 0.0f, null, null, 29695)));
                        } else if (eVar2 instanceof e.a) {
                            do {
                                value2 = x0Var2.getValue();
                                lVar = value2;
                                aVar = (e.a) eVar2;
                            } while (!x0Var2.b(value2, l.a(lVar, false, null, t.a(lVar.c(), null, false, false, aVar.b() && aVar.a(), 7), 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 32763)));
                        } else {
                            if (!(eVar2 instanceof e.d)) {
                                throw new Sc.o();
                            }
                            do {
                                value = x0Var2.getValue();
                            } while (!x0Var2.b(value, l.a(value, false, null, null, 0.0f, ((e.d) eVar2).a(), null, 0, false, 0, false, false, false, 0.0f, null, null, 32751)));
                            iVar.k(x0Var2.getValue().n());
                        }
                        return Unit.f71690a;
                    }
                    iVar.g(false);
                    x0Var = x0Var2;
                    value6 = x0Var.getValue();
                    l lVar4 = (l) value6;
                    u a11 = u.a(lVar4.j(), false, false, false, 6);
                    t a12 = t.a(lVar4.c(), null, false, false, false, 13);
                    Uri a13 = ((e.f) eVar2).a();
                    oVar.f109261d = mVar2;
                    oVar.f109262e = eVar2;
                    oVar.f109263f = x0Var;
                    oVar.f109264g = value6;
                    oVar.f109265h = a12;
                    oVar.f109266i = a11;
                    oVar.f109267j = lVar4;
                    oVar.f109270m = 1;
                    if (a13 == null) {
                        mVar2.getClass();
                        obj = null;
                    } else {
                        obj = mVar2.f109220b.e(a13, oVar);
                        if (obj != Wc.a.COROUTINE_SUSPENDED) {
                            obj = (Hi.k) obj;
                        }
                    }
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    lVar3 = lVar4;
                    uVar = a11;
                    tVar = a12;
                    obj2 = obj;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l lVar5 = oVar.f109267j;
                    u uVar2 = oVar.f109266i;
                    t tVar2 = oVar.f109265h;
                    value6 = oVar.f109264g;
                    x0Var = oVar.f109263f;
                    yi.e eVar3 = oVar.f109262e;
                    m mVar3 = oVar.f109261d;
                    Sc.s.b(obj2);
                    lVar3 = lVar5;
                    uVar = uVar2;
                    tVar = tVar2;
                    eVar2 = eVar3;
                    mVar2 = mVar3;
                }
            }
        }
        oVar = new o(mVar2, dVar);
        Object obj22 = oVar.f109268k;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oVar.f109270m;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b A[LOOP:1: B:51:0x0115->B:64:0x018b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178 A[EDGE_INSN: B:65:0x0178->B:66:0x0178 BREAK  A[LOOP:1: B:51:0x0115->B:64:0x018b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i0(m mVar, k kVar, kotlin.coroutines.d dVar) {
        l value;
        boolean z11;
        Pair pair;
        Pair pair2;
        Object next;
        float f7;
        l value2;
        l value3;
        l lVar;
        l value4;
        l lVar2;
        int i11;
        Object obj;
        l value5;
        l lVar3;
        int i12;
        Object obj2;
        l value6;
        l lVar4;
        mVar.getClass();
        boolean z12 = kVar instanceof k.m;
        float f11 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        x0<l> x0Var = mVar.f109221c;
        yi.i iVar = mVar.f109219a;
        if (z12) {
            if (x0Var.getValue().c().d() || !x0Var.getValue().c().e()) {
                obj2 = Unit.f71690a;
            } else {
                mVar.f109225g = 1.0f;
                yi.q b11 = x0Var.getValue().c().b();
                yi.q qVar = yi.q.PHOTO;
                if (b11 == qVar) {
                    qVar = yi.q.VIDEO;
                }
                yi.q qVar2 = qVar;
                do {
                    value6 = x0Var.getValue();
                    lVar4 = value6;
                } while (!x0Var.b(value6, l.a(lVar4, false, u.a(lVar4.j(), false, false, (qVar2 == yi.q.VIDEO && lVar4.h() == 0) ? false : true, 3), t.a(lVar4.c(), qVar2, false, false, false, 14), 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 32761)));
                if (qVar2 == yi.q.PHOTO) {
                    iVar.g(false);
                }
                obj2 = mVar.v0(dVar);
                if (obj2 != Wc.a.COROUTINE_SUSPENDED) {
                    obj2 = Unit.f71690a;
                }
            }
            return obj2 == Wc.a.COROUTINE_SUSPENDED ? obj2 : Unit.f71690a;
        }
        if (kVar instanceof k.j) {
            if (x0Var.getValue().c().d()) {
                obj = Unit.f71690a;
            } else {
                iVar.g(false);
                mVar.f109225g = 1.0f;
                if (x0Var.getValue().h() == 1) {
                    if (x0Var.getValue().c().c()) {
                        i11 = 0;
                        while (true) {
                            value5 = x0Var.getValue();
                            lVar3 = value5;
                            i12 = i11;
                            if (!x0Var.b(value5, l.a(lVar3, false, u.a(lVar3.j(), false, false, lVar3.c().b() == yi.q.VIDEO || i11 != 0, 3), null, 1.0f, 0.0f, yi.g.WIDE, i12, i11 != 0 ? lVar3.j().c() : false, (i11 == 1 || !lVar3.j().c()) ? 2 : 1, false, false, false, 0.0f, null, null, 32277))) {
                                break;
                            }
                            i11 = i12;
                        }
                        obj = mVar.v0(dVar);
                        if (obj != Wc.a.COROUTINE_SUSPENDED) {
                            obj = Unit.f71690a;
                        }
                    } else {
                        obj = Unit.f71690a;
                    }
                } else if (x0Var.getValue().c().c()) {
                    i11 = 1;
                    while (true) {
                        value5 = x0Var.getValue();
                        lVar3 = value5;
                        i12 = i11;
                        if (!x0Var.b(value5, l.a(lVar3, false, u.a(lVar3.j(), false, false, lVar3.c().b() == yi.q.VIDEO || i11 != 0, 3), null, 1.0f, 0.0f, yi.g.WIDE, i12, i11 != 0 ? lVar3.j().c() : false, (i11 == 1 || !lVar3.j().c()) ? 2 : 1, false, false, false, 0.0f, null, null, 32277))) {
                        }
                        i11 = i12;
                    }
                    obj = mVar.v0(dVar);
                    if (obj != Wc.a.COROUTINE_SUSPENDED) {
                    }
                } else {
                    obj = Unit.f71690a;
                }
            }
            return obj == Wc.a.COROUTINE_SUSPENDED ? obj : Unit.f71690a;
        }
        if (kVar instanceof k.n) {
            if (!x0Var.getValue().c().d()) {
                boolean c11 = x0Var.getValue().j().c();
                boolean z13 = !c11;
                if (x0Var.getValue().h() == 1) {
                    do {
                        value4 = x0Var.getValue();
                        lVar2 = value4;
                    } while (!x0Var.b(value4, l.a(lVar2, false, u.a(lVar2.j(), false, z13, false, 5), null, 0.0f, 0.0f, null, 0, false, !c11 ? 1 : 2, false, false, false, 0.0f, null, null, 32509)));
                    iVar.b(c11 ? 2 : 1);
                } else {
                    while (true) {
                        l value7 = x0Var.getValue();
                        l lVar5 = value7;
                        boolean z14 = z13;
                        if (x0Var.b(value7, l.a(lVar5, false, u.a(lVar5.j(), false, z13, false, 5), null, 0.0f, 0.0f, null, 0, z14, 0, false, false, false, 0.0f, null, null, 32637))) {
                            break;
                        }
                        z13 = z14;
                    }
                }
                C10727i.c(androidx.lifecycle.x0.a(mVar), null, null, new s(mVar, null), 3);
            }
        } else {
            if (kVar instanceof k.g) {
                ((k.g) kVar).getClass();
                Object s02 = mVar.s0(0.0f, null, dVar);
                return s02 == Wc.a.COROUTINE_SUSPENDED ? s02 : Unit.f71690a;
            }
            if (kVar instanceof k.C2354k) {
                Object t02 = mVar.t0(dVar);
                return t02 == Wc.a.COROUTINE_SUSPENDED ? t02 : Unit.f71690a;
            }
            if (kVar instanceof k.l) {
                C10727i.c(androidx.lifecycle.x0.a(mVar), null, null, new r(mVar, null), 3);
            } else if (kVar instanceof k.h) {
                mVar.u0();
            } else if (kVar instanceof k.i) {
                iVar.g(false);
                iVar.a();
            } else if (kVar instanceof k.a) {
                iVar.g(false);
                iVar.h();
                do {
                    value3 = x0Var.getValue();
                    lVar = value3;
                } while (!x0Var.b(value3, l.a(lVar, false, u.a(lVar.j(), false, false, false, 6), t.a(lVar.c(), null, false, false, false, 13), 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 32761)));
            } else if (kVar instanceof k.e) {
                if (iVar.f()) {
                    mVar.u0();
                } else {
                    do {
                        value2 = x0Var.getValue();
                    } while (!x0Var.b(value2, l.a(value2, true, null, null, 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 32766)));
                }
            } else if (kVar instanceof k.d) {
                float d11 = kotlin.ranges.h.d(((k.d) kVar).a(), 0.5f, 2.0f);
                mVar.f109225g = x0Var.getValue().n();
                r10 = x0Var.getValue().h() == 0 ? 1 : 0;
                boolean d12 = x0Var.getValue().j().d();
                if (r10 == 0 && (x0Var.getValue().f() || d12)) {
                    f11 = x0Var.getValue().m();
                }
                float n11 = x0Var.getValue().n();
                float i13 = x0Var.getValue().i();
                int i14 = d.f109241a[x0Var.getValue().k().ordinal()];
                if (i14 == 1) {
                    f7 = 3.0f * i13;
                } else if (i14 == 2) {
                    f7 = x0Var.getValue().m() * i13;
                } else {
                    if (i14 != 3) {
                        throw new Sc.o();
                    }
                    f7 = i13;
                }
                float f12 = n11 * d11;
                if (f7 >= i13) {
                    i13 = f7;
                }
                float d13 = kotlin.ranges.h.d(f12, f11, i13);
                float m11 = x0Var.getValue().m() * 1.5f;
                if (m11 > 0.9f) {
                    m11 = 0.9f;
                }
                C10727i.c(androidx.lifecycle.x0.a(mVar), null, null, new p(mVar, d13, d12 ? yi.g.WIDE : (r10 == 0 && d13 <= m11 && x0Var.getValue().f()) ? yi.g.ULTRA_WIDE : (d13 <= 1.5f || !x0Var.getValue().e()) ? yi.g.WIDE : yi.g.TELEPHOTO, null), 3);
            } else if (kVar instanceof k.c) {
                float n12 = x0Var.getValue().n();
                boolean z15 = x0Var.getValue().h() == 0;
                boolean d14 = x0Var.getValue().j().d();
                l value8 = x0Var.getValue();
                float m12 = value8.f() ? value8.m() : 1.0f;
                List b02 = C7714v.b0(Float.valueOf(m12), valueOf, Float.valueOf(3.0f));
                if (!(b02 instanceof Collection) || !b02.isEmpty()) {
                    Iterator it = b02.iterator();
                    while (it.hasNext()) {
                        if (Math.abs(((Number) it.next()).floatValue() - n12) < 0.01f) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                List b03 = C7714v.b0(valueOf, Float.valueOf(3.0f));
                if (z11) {
                    int i15 = -1;
                    if (d14) {
                        Iterator it2 = b03.iterator();
                        int i16 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (Math.abs(((Number) it2.next()).floatValue() - n12) < 0.01f) {
                                i15 = i16;
                                break;
                            }
                            i16++;
                        }
                        r10 = i15 >= 0 ? (i15 + 1) % b03.size() : 0;
                        mVar.f109225g = ((Number) b03.get(r10)).floatValue();
                        pair2 = new Pair(b03.get(r10), yi.g.WIDE);
                    } else if (Math.abs(n12 - mVar.f109225g) < 0.01f) {
                        boolean z16 = x0Var.getValue().f() && !z15;
                        boolean e11 = x0Var.getValue().e();
                        ArrayList arrayList = new ArrayList();
                        if (z16) {
                            arrayList.add(new Pair(Float.valueOf(m12), yi.g.ULTRA_WIDE));
                        }
                        yi.g gVar = yi.g.WIDE;
                        arrayList.add(new Pair(valueOf, gVar));
                        Float valueOf2 = Float.valueOf(3.0f);
                        if (e11) {
                            gVar = yi.g.TELEPHOTO;
                        }
                        arrayList.add(new Pair(valueOf2, gVar));
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (Math.abs(((Number) ((Pair) it3.next()).a()).floatValue() - n12) < 0.01f) {
                                i15 = r10;
                                break;
                            }
                            r10++;
                        }
                        if (i15 < 0) {
                            C7665d it4 = C7714v.O(arrayList).iterator();
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (it4.hasNext()) {
                                    float abs = Math.abs(((Number) ((Pair) arrayList.get(((Number) next).intValue())).e()).floatValue() - n12);
                                    do {
                                        Object next2 = it4.next();
                                        float abs2 = Math.abs(((Number) ((Pair) arrayList.get(((Number) next2).intValue())).e()).floatValue() - n12);
                                        if (Float.compare(abs, abs2) > 0) {
                                            next = next2;
                                            abs = abs2;
                                        }
                                    } while (it4.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Integer num = (Integer) next;
                            i15 = num != null ? num.intValue() : 1;
                        }
                        Pair pair3 = (Pair) arrayList.get((i15 + 1) % arrayList.size());
                        float floatValue = ((Number) pair3.a()).floatValue();
                        yi.g gVar2 = (yi.g) pair3.b();
                        mVar.f109225g = floatValue;
                        pair2 = new Pair(Float.valueOf(floatValue), gVar2);
                    } else {
                        mVar.f109225g = 1.0f;
                        pair = new Pair(valueOf, yi.g.WIDE);
                    }
                    pair = pair2;
                } else {
                    mVar.f109225g = 1.0f;
                    pair = new Pair(valueOf, yi.g.WIDE);
                }
                C10727i.c(androidx.lifecycle.x0.a(mVar), null, null, new n(mVar, ((Number) pair.a()).floatValue(), (yi.g) pair.b(), null), 3);
            } else if (kVar instanceof k.f) {
                iVar.k(x0Var.getValue().n());
            } else {
                if (!(kVar instanceof k.b)) {
                    throw new Sc.o();
                }
                do {
                    value = x0Var.getValue();
                } while (!x0Var.b(value, l.a(value, false, null, null, 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 16383)));
            }
        }
        return Unit.f71690a;
    }

    public static final Object m0(m mVar, Uri uri, kotlin.coroutines.d dVar) {
        kotlin.coroutines.jvm.internal.c cVar = (kotlin.coroutines.jvm.internal.c) dVar;
        if (uri != null) {
            Object e11 = mVar.f109220b.e(uri, cVar);
            return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : (Hi.k) e11;
        }
        mVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r23 < r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r23 >= 1.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s0(float f7, yi.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
        yi.g gVar2;
        yi.g gVar3;
        float f11;
        float f12;
        l value;
        x0<l> x0Var = this.f109221c;
        boolean z11 = x0Var.getValue().h() == 0;
        boolean d11 = x0Var.getValue().j().d();
        if (z11) {
            gVar3 = yi.g.WIDE;
        } else {
            if (!d11) {
                gVar2 = gVar;
                if (!z11 || (!x0Var.getValue().f() && !d11)) {
                    f11 = 1.0f;
                } else if (x0Var.getValue().f() && gVar == yi.g.ULTRA_WIDE) {
                    f11 = x0Var.getValue().m();
                } else {
                    f12 = f7;
                }
                yi.g k11 = x0Var.getValue().k();
                do {
                    value = x0Var.getValue();
                } while (!x0Var.b(value, l.a(value, false, null, null, f12, 0.0f, gVar2, 0, false, 0, false, false, false, 0.0f, null, null, 32727)));
                this.f109219a.k(f12);
                if (gVar2 == k11 || d11) {
                    return Unit.f71690a;
                }
                Object v02 = v0(dVar);
                return v02 == Wc.a.COROUTINE_SUSPENDED ? v02 : Unit.f71690a;
            }
            gVar3 = yi.g.WIDE;
        }
        gVar2 = gVar3;
        if (!z11) {
        }
        f11 = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (r1 == r3) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008e -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t0(kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        int i11;
        m mVar;
        Uri uri;
        m mVar2;
        x0<l> x0Var;
        l value;
        l lVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i12 = gVar.f109254k;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f109254k = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f109252i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f109254k;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    gVar.f109247d = this;
                    gVar.f109254k = 1;
                    obj = this.f109219a.c(gVar);
                    if (obj != aVar) {
                        mVar = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    mVar = gVar.f109247d;
                    Sc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = gVar.f109251h;
                    value = gVar.f109250g;
                    x0Var = gVar.f109249f;
                    uri = gVar.f109248e;
                    mVar2 = gVar.f109247d;
                    Sc.s.b(obj);
                    Uri uri2 = uri;
                    m mVar3 = mVar2;
                    Hi.k kVar = (Hi.k) obj;
                    x0<l> x0Var2 = x0Var;
                    if (x0Var2.b(value, l.a(lVar, false, null, null, 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, kVar, 16383))) {
                        return Unit.f71690a;
                    }
                    x0Var = x0Var2;
                    uri = uri2;
                    mVar2 = mVar3;
                    value = x0Var.getValue();
                    lVar = (l) value;
                    gVar.f109247d = mVar2;
                    gVar.f109248e = uri;
                    gVar.f109249f = x0Var;
                    gVar.f109250g = value;
                    gVar.f109251h = lVar;
                    gVar.f109254k = 2;
                    if (uri == null) {
                        mVar2.getClass();
                        obj = null;
                    } else {
                        obj = mVar2.f109220b.e(uri, gVar);
                        if (obj != Wc.a.COROUTINE_SUSPENDED) {
                            obj = (Hi.k) obj;
                        }
                    }
                }
                uri = (Uri) obj;
                mVar2 = mVar;
                x0Var = mVar.f109221c;
                value = x0Var.getValue();
                lVar = (l) value;
                gVar.f109247d = mVar2;
                gVar.f109248e = uri;
                gVar.f109249f = x0Var;
                gVar.f109250g = value;
                gVar.f109251h = lVar;
                gVar.f109254k = 2;
                if (uri == null) {
                }
            }
        }
        gVar = new g(dVar);
        Object obj2 = gVar.f109252i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f109254k;
        if (i11 != 0) {
        }
        uri = (Uri) obj2;
        mVar2 = mVar;
        x0Var = mVar.f109221c;
        value = x0Var.getValue();
        lVar = (l) value;
        gVar.f109247d = mVar2;
        gVar.f109248e = uri;
        gVar.f109249f = x0Var;
        gVar.f109250g = value;
        gVar.f109251h = lVar;
        gVar.f109254k = 2;
        if (uri == null) {
        }
    }

    private final void u0() {
        l value;
        l lVar;
        m mVar;
        x0<l> x0Var = this.f109221c;
        do {
            value = x0Var.getValue();
            lVar = value;
        } while (!x0Var.b(value, l.a(lVar, false, u.a(lVar.j(), true, false, false, 6), t.a(lVar.c(), null, true, false, false, 13), 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, null, 32760)));
        if (x0Var.getValue().h() == 1 && x0Var.getValue().j().c()) {
            mVar = this;
            mVar.f109219a.g(true);
        } else {
            mVar = this;
        }
        C10727i.c(androidx.lifecycle.x0.a(mVar), null, null, mVar.new h(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v0(kotlin.coroutines.d<? super Unit> dVar) {
        Object e11;
        if (this.f109224f != null) {
            yi.i iVar = this.f109219a;
            if (iVar.i().getValue().i()) {
                Y.c cVar = this.f109224f;
                if (cVar == null) {
                    e11 = Unit.f71690a;
                } else {
                    l value = this.f109221c.getValue();
                    yi.g k11 = value.h() == 0 ? yi.g.WIDE : (value.j().c() && value.h() == 1) ? yi.g.WIDE : value.k();
                    e11 = iVar.e(new yi.h(value.h(), k11, value.c().b(), value.d(), k11 != value.k() ? 1.0f : value.n(), cVar), dVar);
                    if (e11 != Wc.a.COROUTINE_SUSPENDED) {
                        e11 = Unit.f71690a;
                    }
                }
                return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }

    @NotNull
    public final M0<l> getUiState() {
        return this.f109222d;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        this.f109219a.release();
    }

    @NotNull
    public final Hi.b p0() {
        x0<l> x0Var = this.f109221c;
        return new Hi.b(x0Var.getValue().c().b(), x0Var.getValue().j().c(), x0Var.getValue().h(), x0Var.getValue().n());
    }

    public final void q0(@NotNull k intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new e(intent, null), 3);
    }

    public final void r0(@NotNull Y.c provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f109224f = provider;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new f(null), 3);
    }
}
