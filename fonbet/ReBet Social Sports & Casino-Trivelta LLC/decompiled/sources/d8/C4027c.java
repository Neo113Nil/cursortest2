package d8;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4027c extends w.e {

    /* renamed from: c, reason: collision with root package name */
    public static w.c f45058c;

    /* renamed from: d, reason: collision with root package name */
    public static w.f f45059d;

    /* renamed from: b, reason: collision with root package name */
    public static final a f45057b = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f45060e = new ReentrantLock();

    /* renamed from: d8.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w.f b() {
            C4027c.f45060e.lock();
            w.f fVar = C4027c.f45059d;
            C4027c.f45059d = null;
            C4027c.f45060e.unlock();
            return fVar;
        }

        public final void c(Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            d();
            C4027c.f45060e.lock();
            w.f fVar = C4027c.f45059d;
            if (fVar != null) {
                fVar.f(url, null, null);
            }
            C4027c.f45060e.unlock();
        }

        public final void d() {
            w.c cVar;
            C4027c.f45060e.lock();
            if (C4027c.f45059d == null && (cVar = C4027c.f45058c) != null) {
                C4027c.f45059d = cVar.d(null);
            }
            C4027c.f45060e.unlock();
        }

        public a() {
        }
    }

    @Override // w.e
    public void a(ComponentName name, w.c newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.f(0L);
        f45058c = newClient;
        f45057b.d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
