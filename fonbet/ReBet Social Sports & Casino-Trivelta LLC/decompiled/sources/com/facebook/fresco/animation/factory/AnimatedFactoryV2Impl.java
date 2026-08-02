package com.facebook.fresco.animation.factory;

import A7.n;
import B6.g;
import B6.i;
import C7.InterfaceC1052p;
import D6.d;
import D6.o;
import H7.e;
import H7.k;
import H7.p;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import l7.C5412d;
import v7.C6650e;
import v7.InterfaceC6646a;
import w7.C6720e;
import w7.InterfaceC6716a;
import w7.InterfaceC6719d;
import x7.C6802a;
import z7.AbstractC6940d;

@d
/* loaded from: classes2.dex */
public class AnimatedFactoryV2Impl implements InterfaceC6716a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC6940d f30541a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1052p f30542b;

    /* renamed from: c, reason: collision with root package name */
    public final n f30543c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30544d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC6719d f30545e;

    /* renamed from: f, reason: collision with root package name */
    public com.facebook.imagepipeline.animated.impl.b f30546f;

    /* renamed from: g, reason: collision with root package name */
    public C6802a f30547g;

    /* renamed from: h, reason: collision with root package name */
    public G7.a f30548h;

    /* renamed from: i, reason: collision with root package name */
    public g f30549i;

    /* renamed from: j, reason: collision with root package name */
    public int f30550j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f30551k;

    /* renamed from: l, reason: collision with root package name */
    public int f30552l;

    public class a implements F7.c {
        public a() {
        }

        @Override // F7.c
        public e a(k kVar, int i10, p pVar, B7.d dVar) {
            return AnimatedFactoryV2Impl.this.n().b(kVar, dVar, dVar.f827i);
        }
    }

    public class b implements com.facebook.imagepipeline.animated.impl.b {
        public b() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.b
        public InterfaceC6646a a(C6650e c6650e, Rect rect) {
            return new com.facebook.imagepipeline.animated.impl.a(AnimatedFactoryV2Impl.this.m(), c6650e, rect, AnimatedFactoryV2Impl.this.f30544d);
        }
    }

    public class c implements com.facebook.imagepipeline.animated.impl.b {
        public c() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.b
        public InterfaceC6646a a(C6650e c6650e, Rect rect) {
            return new com.facebook.imagepipeline.animated.impl.a(AnimatedFactoryV2Impl.this.m(), c6650e, rect, AnimatedFactoryV2Impl.this.f30544d);
        }
    }

    @d
    public AnimatedFactoryV2Impl(AbstractC6940d abstractC6940d, InterfaceC1052p interfaceC1052p, n nVar, boolean z10, boolean z11, int i10, int i11, g gVar) {
        this.f30541a = abstractC6940d;
        this.f30542b = interfaceC1052p;
        this.f30543c = nVar;
        this.f30550j = i10;
        this.f30551k = z11;
        this.f30544d = z10;
        this.f30549i = gVar;
        this.f30552l = i11;
    }

    public static /* synthetic */ Integer e() {
        return 2;
    }

    public static /* synthetic */ Integer f() {
        return 3;
    }

    @Override // w7.InterfaceC6716a
    public G7.a a(Context context) {
        if (this.f30548h == null) {
            this.f30548h = k();
        }
        return this.f30548h;
    }

    @Override // w7.InterfaceC6716a
    public F7.c b() {
        return new F7.c() { // from class: l7.a
            @Override // F7.c
            public final e a(k kVar, int i10, p pVar, B7.d dVar) {
                e a10;
                a10 = AnimatedFactoryV2Impl.this.n().a(kVar, dVar, dVar.f827i);
                return a10;
            }
        };
    }

    @Override // w7.InterfaceC6716a
    public F7.c c() {
        return new a();
    }

    public final InterfaceC6719d j() {
        return new C6720e(new c(), this.f30541a, this.f30551k);
    }

    public final C5412d k() {
        D6.n nVar = new D6.n() { // from class: l7.b
            @Override // D6.n
            public final Object get() {
                return AnimatedFactoryV2Impl.e();
            }
        };
        ExecutorService executorService = this.f30549i;
        if (executorService == null) {
            executorService = new B6.d(this.f30542b.d());
        }
        D6.n nVar2 = new D6.n() { // from class: l7.c
            @Override // D6.n
            public final Object get() {
                return AnimatedFactoryV2Impl.f();
            }
        };
        D6.n nVar3 = o.f2570b;
        return new C5412d(l(), i.D0(), executorService, RealtimeSinceBootClock.get(), this.f30541a, this.f30543c, nVar, nVar2, nVar3, o.a(Boolean.valueOf(this.f30551k)), o.a(Boolean.valueOf(this.f30544d)), o.a(Integer.valueOf(this.f30550j)), o.a(Integer.valueOf(this.f30552l)));
    }

    public final com.facebook.imagepipeline.animated.impl.b l() {
        if (this.f30546f == null) {
            this.f30546f = new b();
        }
        return this.f30546f;
    }

    public final C6802a m() {
        if (this.f30547g == null) {
            this.f30547g = new C6802a();
        }
        return this.f30547g;
    }

    public final InterfaceC6719d n() {
        if (this.f30545e == null) {
            this.f30545e = j();
        }
        return this.f30545e;
    }
}
