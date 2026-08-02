package rg;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import v6.ServiceConnectionC10259c;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;
import xe.M;

/* renamed from: rg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9268a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f83489a;

    /* renamed from: rg.a$a, reason: collision with other inner class name */
    private static final class C1425a implements ServiceConnectionC10259c.InterfaceC2223c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C10737n f83490a;

        public C1425a(@NotNull C10737n continuation) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f83490a = continuation;
        }

        @Override // v6.ServiceConnectionC10259c.InterfaceC2223c
        public final void a(@NotNull ServiceConnectionC10259c serviceConnection) {
            Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
            C10737n c10737n = this.f83490a;
            Intrinsics.checkNotNullParameter(c10737n, "<this>");
            if (c10737n.isActive()) {
                r.Companion companion = r.INSTANCE;
                c10737n.resumeWith(serviceConnection);
            }
        }

        public final void b() {
            C10737n c10737n = this.f83490a;
            Intrinsics.checkNotNullParameter(c10737n, "<this>");
            if (c10737n.isActive()) {
                r.Companion companion = r.INSTANCE;
                c10737n.resumeWith(null);
            }
        }
    }

    @e(c = "ru.nspk.mirpay.sdk.helper.SdkServiceBinder$bind$2", f = "SdkServiceBinder.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: rg.a$b */
    static final class b extends j implements Function2<M, d<? super ServiceConnectionC10259c>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83491d;

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return C9268a.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super ServiceConnectionC10259c> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83491d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            C9268a c9268a = C9268a.this;
            String string = c9268a.f83489a.getString(R.string.remote_service_package_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = c9268a.f83489a.getString(R.string.remote_service_class_name);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.f83491d = 1;
            C10737n c10737n = new C10737n(1, Wc.b.b(this));
            c10737n.o();
            C1425a c1425a = new C1425a(c10737n);
            ServiceConnectionC10259c serviceConnectionC10259c = new ServiceConnectionC10259c(c9268a.f83489a, c1425a);
            Intent intent = new Intent();
            intent.setClassName(string, string2);
            if (!c9268a.f83489a.bindService(intent, serviceConnectionC10259c, 1)) {
                c1425a.b();
            }
            Object n11 = c10737n.n();
            if (n11 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            return n11 == aVar ? aVar : n11;
        }
    }

    public C9268a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83489a = context;
    }

    public final Object b(@NotNull d<? super ServiceConnectionC10259c> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(De.s.f6650a, new b(null), dVar);
    }

    public final void c(@NotNull ServiceConnectionC10259c serviceConnection) {
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        try {
            this.f83489a.unbindService(serviceConnection);
        } catch (Exception unused) {
            V9.a.d();
        }
    }
}
