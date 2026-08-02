package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC2185j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class P {

    /* renamed from: a, reason: collision with root package name */
    public final C2195u f20293a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f20294b;

    /* renamed from: c, reason: collision with root package name */
    public a f20295c;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final C2195u f20296a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC2185j.a f20297b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20298c;

        public a(C2195u registry, AbstractC2185j.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f20296a = registry;
            this.f20297b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20298c) {
                return;
            }
            this.f20296a.i(this.f20297b);
            this.f20298c = true;
        }
    }

    public P(InterfaceC2193s provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f20293a = new C2195u(provider);
        this.f20294b = new Handler();
    }

    public AbstractC2185j a() {
        return this.f20293a;
    }

    public void b() {
        f(AbstractC2185j.a.ON_START);
    }

    public void c() {
        f(AbstractC2185j.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC2185j.a.ON_STOP);
        f(AbstractC2185j.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC2185j.a.ON_START);
    }

    public final void f(AbstractC2185j.a aVar) {
        a aVar2 = this.f20295c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f20293a, aVar);
        this.f20295c = aVar3;
        Handler handler = this.f20294b;
        Intrinsics.checkNotNull(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
