package o00;

import Hj0.C3144a;
import Hj0.N;
import Hj0.P;
import Hj0.Q;
import O7.o;
import android.app.Application;
import j00.C7234a;
import j00.C7235b;
import j00.C7236c;
import k00.C7451d;
import kotlin.jvm.internal.Intrinsics;
import l00.C7782a;
import n00.C8406a;
import n00.C8407b;
import o00.InterfaceC8626c;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ti0.C9878a;
import xb0.InterfaceC10696a;

/* renamed from: o00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8625b {

    /* renamed from: o00.b$a */
    private static final class a implements InterfaceC8626c {

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<n00.c> f77455a = Jb.d.b(n00.d.a());

        /* renamed from: b, reason: collision with root package name */
        private Jb.f f77456b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<Application> f77457c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<C8406a> f77458d;

        /* renamed from: e, reason: collision with root package name */
        private Jb.f f77459e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<AbToolBaseApi> f77460f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<InterfaceC10696a> f77461g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<C7451d> f77462h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<C7235b> f77463i;

        /* renamed from: j, reason: collision with root package name */
        private Pc.a<n00.f> f77464j;

        /* renamed from: k, reason: collision with root package name */
        private Pc.a<Nd0.b> f77465k;

        /* renamed from: l, reason: collision with root package name */
        private Pc.a<C7234a> f77466l;

        /* renamed from: m, reason: collision with root package name */
        private C3144a f77467m;

        /* renamed from: n, reason: collision with root package name */
        private C9878a f77468n;

        a(o oVar, Ld0.d dVar, Ld0.c cVar) {
            Jb.f a11 = Jb.f.a(dVar);
            this.f77456b = a11;
            Pc.a<Application> b11 = Jb.d.b(new e(oVar, a11));
            this.f77457c = b11;
            this.f77458d = Jb.d.b(new C8407b(b11));
            Jb.f a12 = Jb.f.a(cVar);
            this.f77459e = a12;
            this.f77460f = Jb.d.b(new N(oVar, a12));
            Pc.a<InterfaceC10696a> b12 = Jb.d.b(new P(oVar, this.f77459e));
            this.f77461g = b12;
            Pc.a<C7451d> b13 = Jb.d.b(new Q(this.f77460f, b12, 1));
            this.f77462h = b13;
            Pc.a<C7235b> b14 = Jb.d.b(new C7236c(this.f77455a, this.f77458d, b13));
            this.f77463i = b14;
            this.f77464j = Jb.d.b(new n00.g(this.f77455a, this.f77458d, b14, new g()));
            Pc.a<Nd0.b> b15 = Jb.d.b(new d(oVar, this.f77456b));
            this.f77465k = b15;
            Pc.a<C7234a> b16 = Jb.d.b(new f(oVar, this.f77464j, b15, this.f77457c));
            this.f77466l = b16;
            this.f77467m = new C3144a(b16, 2);
            this.f77468n = new C9878a(b16);
        }

        @Override // o00.InterfaceC8626c
        public final C7234a a() {
            return this.f77466l.get();
        }

        @Override // o00.InterfaceC8626c
        public final C3144a b() {
            return this.f77467m;
        }

        @Override // o00.InterfaceC8626c
        public final C9878a c() {
            return this.f77468n;
        }

        @Override // o00.InterfaceC8626c
        public final C7782a d() {
            C7234a sdk = this.f77466l.get();
            Intrinsics.checkNotNullParameter(sdk, "sdk");
            return new C7782a(sdk);
        }
    }

    /* renamed from: o00.b$b, reason: collision with other inner class name */
    private static final class C1303b implements InterfaceC8626c.a {
        @Override // o00.InterfaceC8626c.a
        public final InterfaceC8626c a(Ld0.d dVar, Ld0.c cVar) {
            dVar.getClass();
            return new a(new o(), dVar, cVar);
        }
    }

    public static InterfaceC8626c.a a() {
        return new C1303b();
    }
}
