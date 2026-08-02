package p90;

import D90.k;
import Jb.d;
import Jb.j;
import Pa0.e;
import Pa0.g;
import Pa0.n;
import android.content.Context;
import android.content.SharedPreferences;
import d90.m;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import p90.InterfaceC8875b;
import r90.InterfaceC9218a;
import ru.ozon.android.messenger.framework.domain.usecases.Z;
import s90.C9632a;
import s90.C9633b;
import s90.C9634c;
import s90.C9635d;
import s90.f;
import s90.h;
import s90.i;

/* renamed from: p90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8874a {

    /* renamed from: p90.a$a, reason: collision with other inner class name */
    private static final class C1348a implements InterfaceC8875b.a {
        @Override // p90.InterfaceC8875b.a
        public final InterfaceC8875b a(O90.a aVar, P30.b bVar, Y20.a aVar2) {
            bVar.getClass();
            aVar2.getClass();
            aVar.getClass();
            return new b(aVar, bVar, aVar2);
        }
    }

    /* renamed from: p90.a$b */
    private static final class b implements InterfaceC8875b {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f80324a;

        /* renamed from: b, reason: collision with root package name */
        private final Y20.a f80325b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<Context> f80326c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<i> f80327d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<C9634c> f80328e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<f> f80329f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<C9632a> f80330g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<C9633b> f80331h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<C9635d> f80332i;

        /* renamed from: j, reason: collision with root package name */
        private Pc.a<h> f80333j;

        /* renamed from: k, reason: collision with root package name */
        private Pc.a<SharedPreferences> f80334k;

        /* renamed from: l, reason: collision with root package name */
        private Pc.a<InterfaceC9218a> f80335l;

        /* renamed from: p90.a$b$a, reason: collision with other inner class name */
        private static final class C1349a implements Pc.a<SharedPreferences> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f80336a;

            C1349a(P30.b bVar) {
                this.f80336a = bVar;
            }

            @Override // Pc.a
            public final SharedPreferences get() {
                SharedPreferences sharedPreferences = this.f80336a.getSharedPreferences();
                j.c(sharedPreferences);
                return sharedPreferences;
            }
        }

        /* renamed from: p90.a$b$b, reason: collision with other inner class name */
        private static final class C1350b implements Pc.a<Context> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f80337a;

            C1350b(P30.b bVar) {
                this.f80337a = bVar;
            }

            @Override // Pc.a
            public final Context get() {
                Context h11 = this.f80337a.h();
                j.c(h11);
                return h11;
            }
        }

        b(O90.a aVar, P30.b bVar, Y20.a aVar2) {
            this.f80324a = aVar;
            this.f80325b = aVar2;
            C1350b c1350b = new C1350b(bVar);
            this.f80326c = c1350b;
            this.f80327d = d.b(new k(c1350b, 2));
            this.f80328e = d.b(new e(this.f80326c, 1));
            this.f80329f = d.b(new ru.ozon.android.messenger.framework.domain.usecases.ai.d(this.f80326c, 1));
            this.f80330g = d.b(new Pa0.b(this.f80326c, 2));
            this.f80331h = d.b(new Z(this.f80326c, 1));
            this.f80332i = d.b(new g(this.f80326c, 2));
            this.f80333j = d.b(new n(this.f80326c, 1));
            C1349a c1349a = new C1349a(bVar);
            this.f80334k = c1349a;
            this.f80335l = d.b(new m(this.f80326c, c1349a, 1));
        }

        @Override // n90.InterfaceC8456a
        public final C9634c E() {
            return this.f80328e.get();
        }

        @Override // n90.InterfaceC8456a
        public final h K() {
            return this.f80333j.get();
        }

        @Override // n90.InterfaceC8456a
        public final C9635d S() {
            return this.f80332i.get();
        }

        @Override // n90.InterfaceC8456a
        public final r90.f f0() {
            i writeExternalStoragePermission = this.f80327d.get();
            C9634c cameraPermission = this.f80328e.get();
            f readContactsPermission = this.f80329f.get();
            ru.ozon.fintech.settings.domain.a fintechSettings = this.f80324a.w0();
            j.c(fintechSettings);
            C9632a accessCoarseLocationPermission = this.f80330g.get();
            C9633b accessFineLocationPermission = this.f80331h.get();
            C9635d notificationsPermission = this.f80332i.get();
            h recordAudioPermission = this.f80333j.get();
            InterfaceC9218a fintechPermissionManager = this.f80335l.get();
            InterfaceC6618a fintechAnalyticInteractor = this.f80325b.B();
            j.c(fintechAnalyticInteractor);
            Intrinsics.checkNotNullParameter(writeExternalStoragePermission, "writeExternalStoragePermission");
            Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
            Intrinsics.checkNotNullParameter(readContactsPermission, "readContactsPermission");
            Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
            Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
            Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
            Intrinsics.checkNotNullParameter(notificationsPermission, "notificationsPermission");
            Intrinsics.checkNotNullParameter(recordAudioPermission, "recordAudioPermission");
            Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
            Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
            return new r90.f(writeExternalStoragePermission, cameraPermission, readContactsPermission, recordAudioPermission, accessCoarseLocationPermission, accessFineLocationPermission, notificationsPermission, fintechSettings, fintechPermissionManager, fintechAnalyticInteractor);
        }

        @Override // n90.InterfaceC8456a
        public final f i0() {
            return this.f80329f.get();
        }

        @Override // n90.InterfaceC8456a
        public final InterfaceC9218a k() {
            return this.f80335l.get();
        }

        @Override // n90.InterfaceC8456a
        public final C9632a l() {
            return this.f80330g.get();
        }

        @Override // n90.InterfaceC8456a
        public final C9633b y() {
            return this.f80331h.get();
        }
    }

    public static InterfaceC8875b.a a() {
        return new C1348a();
    }
}
