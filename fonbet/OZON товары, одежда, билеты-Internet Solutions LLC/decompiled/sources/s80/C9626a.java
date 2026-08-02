package s80;

import Jb.i;
import Jb.j;
import android.app.Application;
import androidx.lifecycle.z0;
import g30.InterfaceC6618a;
import m40.InterfaceC8077a;
import o40.InterfaceC8640a;
import ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment;
import t80.h;

/* renamed from: s80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9626a implements InterfaceC9627b {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f98352a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<Application> f98353b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<InterfaceC8640a> f98354c;

    /* renamed from: d, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.composer.navigation.router.b f98355d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<z0.b> f98356e;

    /* renamed from: s80.a$a, reason: collision with other inner class name */
    private static final class C2166a implements Pc.a<InterfaceC8640a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC8077a f98357a;

        C2166a(InterfaceC8077a interfaceC8077a) {
            this.f98357a = interfaceC8077a;
        }

        @Override // Pc.a
        public final InterfaceC8640a get() {
            InterfaceC8640a T11 = this.f98357a.T();
            j.c(T11);
            return T11;
        }
    }

    /* renamed from: s80.a$b */
    private static final class b implements Pc.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f98358a;

        b(P30.b bVar) {
            this.f98358a = bVar;
        }

        @Override // Pc.a
        public final Application get() {
            Application m12 = this.f98358a.m1();
            j.c(m12);
            return m12;
        }
    }

    C9626a(Y20.a aVar, P30.b bVar, InterfaceC8077a interfaceC8077a) {
        this.f98352a = aVar;
        b bVar2 = new b(bVar);
        this.f98353b = bVar2;
        C2166a c2166a = new C2166a(interfaceC8077a);
        this.f98354c = c2166a;
        this.f98355d = new ru.ozon.android.messenger.framework.composer.navigation.router.b(bVar2, c2166a, 1);
        i.a b11 = i.b(1);
        b11.b(h.class, this.f98355d);
        this.f98356e = Jb.d.b(new f(b11.a()));
    }

    @Override // s80.InterfaceC9627b
    public final void b0(UpdateWallFragment updateWallFragment) {
        updateWallFragment.factory = this.f98356e.get();
        InterfaceC6618a B11 = this.f98352a.B();
        j.c(B11);
        updateWallFragment.analyticsInteractor = B11;
    }
}
