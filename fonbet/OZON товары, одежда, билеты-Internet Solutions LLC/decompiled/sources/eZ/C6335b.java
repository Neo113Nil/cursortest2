package eZ;

import Ae0.c;
import Hj0.C3144a;
import Hj0.C3152i;
import Hj0.C3153j;
import Hj0.C3154k;
import Hj0.C3155l;
import Hj0.S;
import Jb.f;
import Sc.InterfaceC4008j;
import We.E;
import XY.d;
import aZ.C4983a;
import aZ.C4984b;
import aZ.C4985c;
import bZ.C5609c;
import bZ.InterfaceC5607a;
import com.squareup.moshi.Moshi;
import dZ.C6132a;
import eZ.InterfaceC6334a;
import fZ.e;
import gZ.C6697e;
import gZ.C6700h;
import gZ.C6704l;
import gZ.m;
import iZ.C7036c;
import kotlin.jvm.internal.Intrinsics;
import mZ.g;
import pf0.i;
import qj.C9067a;
import retrofit2.Retrofit;
import ru.ozon.cdn.chooser.internal.data.popreachability.PoPReachabilityApi;

/* renamed from: eZ.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6335b {

    /* renamed from: eZ.b$a */
    private static final class a implements InterfaceC6334a {

        /* renamed from: a, reason: collision with root package name */
        private f f62066a;

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<Moshi> f62067b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<E> f62068c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<i> f62069d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<Boolean> f62070e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<Retrofit> f62071f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<InterfaceC5607a> f62072g;

        /* renamed from: h, reason: collision with root package name */
        private C3144a f62073h;

        /* renamed from: i, reason: collision with root package name */
        private C6697e f62074i;

        /* renamed from: j, reason: collision with root package name */
        private C6700h f62075j;

        /* renamed from: k, reason: collision with root package name */
        private Pc.a<C9067a> f62076k;

        /* renamed from: l, reason: collision with root package name */
        private f f62077l;

        /* renamed from: m, reason: collision with root package name */
        private Pc.a<InterfaceC4008j<PoPReachabilityApi>> f62078m;

        /* renamed from: n, reason: collision with root package name */
        private f f62079n;

        a(fZ.b bVar, c cVar, d dVar) {
            this.f62066a = f.a(dVar);
            this.f62067b = Jb.d.b(new C3153j(bVar, 2));
            this.f62068c = Jb.d.b(new C3155l(bVar, this.f62066a, C5609c.a()));
            Pc.a<i> b11 = Jb.d.b(new fZ.d(bVar));
            this.f62069d = b11;
            Pc.a<Boolean> b12 = Jb.d.b(new C3152i(bVar, b11));
            this.f62070e = b12;
            Pc.a<Retrofit> b13 = Jb.d.b(new e(bVar, this.f62066a, this.f62067b, this.f62068c, this.f62069d, b12));
            this.f62071f = b13;
            Pc.a<InterfaceC5607a> b14 = Jb.d.b(new fZ.c(bVar, b13, this.f62070e));
            this.f62072g = b14;
            S s11 = new S(b14, 1);
            f fVar = this.f62066a;
            C3144a c3144a = new C3144a(cVar, fVar);
            this.f62073h = c3144a;
            C6697e c6697e = new C6697e(this.f62067b, c3144a, fVar);
            this.f62074i = c6697e;
            this.f62075j = new C6700h(s11, c6697e);
            Pc.a<C9067a> b15 = Jb.d.b(new C3154k(bVar, c3144a));
            this.f62076k = b15;
            this.f62077l = C4985c.a(new C4984b(this.f62075j, this.f62074i, m.b(new C6704l(this.f62075j, new g(b15, this.f62073h)))));
            this.f62078m = Jb.d.b(new fZ.g(this.f62071f, this.f62070e));
            this.f62079n = f.a(new iZ.e());
        }

        @Override // eZ.InterfaceC6334a
        public final C6132a a() {
            InterfaceC4008j<PoPReachabilityApi> interfaceC4008j = this.f62078m.get();
            c currentTimestampProvider = new c();
            Intrinsics.checkNotNullParameter(currentTimestampProvider, "currentTimestampProvider");
            if (interfaceC4008j == null) {
                return null;
            }
            return new C6132a(interfaceC4008j, currentTimestampProvider);
        }

        @Override // eZ.InterfaceC6334a
        public final C4983a.InterfaceC0703a b() {
            return (C4983a.InterfaceC0703a) this.f62077l.get();
        }

        @Override // eZ.InterfaceC6334a
        public final C7036c.a c() {
            return (C7036c.a) this.f62079n.get();
        }
    }

    /* renamed from: eZ.b$b, reason: collision with other inner class name */
    private static final class C0975b implements InterfaceC6334a.InterfaceC0974a {
        @Override // eZ.InterfaceC6334a.InterfaceC0974a
        public final InterfaceC6334a a(d dVar) {
            return new a(new fZ.b(), new c(), dVar);
        }
    }

    public static InterfaceC6334a.InterfaceC0974a a() {
        return new C0975b();
    }
}
