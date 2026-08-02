package m3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j3.C7263e;
import java.util.ArrayList;
import m3.InterfaceC8073o;

/* renamed from: m3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8054G implements InterfaceC8073o {

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f74277b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f74278a;

    /* renamed from: m3.G$a */
    private static final class a implements InterfaceC8073o.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f74279a;

        private a() {
        }

        @Override // m3.InterfaceC8073o.a
        public final void a() {
            Message message = this.f74279a;
            message.getClass();
            message.sendToTarget();
            this.f74279a = null;
            C8054G.m(this);
        }

        public final boolean b(Handler handler) {
            Message message = this.f74279a;
            message.getClass();
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            this.f74279a = null;
            C8054G.m(this);
            return sendMessageAtFrontOfQueue;
        }

        public final void c(Message message) {
            this.f74279a = message;
        }

        /* synthetic */ a(int i11) {
            this();
        }
    }

    public C8054G(Handler handler) {
        this.f74278a = handler;
    }

    static void m(a aVar) {
        ArrayList arrayList = f74277b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar);
            }
        }
    }

    private static a n() {
        a aVar;
        ArrayList arrayList = f74277b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a(0) : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // m3.InterfaceC8073o
    public final boolean a() {
        return this.f74278a.hasMessages(1);
    }

    @Override // m3.InterfaceC8073o
    public final InterfaceC8073o.a b(int i11) {
        a n11 = n();
        n11.c(this.f74278a.obtainMessage(i11));
        return n11;
    }

    @Override // m3.InterfaceC8073o
    public final void c() {
        this.f74278a.removeCallbacksAndMessages(null);
    }

    @Override // m3.InterfaceC8073o
    public final InterfaceC8073o.a d(int i11, Object obj) {
        a n11 = n();
        n11.c(this.f74278a.obtainMessage(i11, obj));
        return n11;
    }

    @Override // m3.InterfaceC8073o
    public final InterfaceC8073o.a e(int i11, int i12, int i13) {
        a n11 = n();
        n11.c(this.f74278a.obtainMessage(i11, i12, i13));
        return n11;
    }

    @Override // m3.InterfaceC8073o
    public final InterfaceC8073o.a f(C7263e c7263e) {
        a n11 = n();
        n11.c(this.f74278a.obtainMessage(31, 0, 0, c7263e));
        return n11;
    }

    @Override // m3.InterfaceC8073o
    public final boolean g(InterfaceC8073o.a aVar) {
        return ((a) aVar).b(this.f74278a);
    }

    @Override // m3.InterfaceC8073o
    public final Looper h() {
        return this.f74278a.getLooper();
    }

    @Override // m3.InterfaceC8073o
    public final boolean i(Runnable runnable) {
        return this.f74278a.post(runnable);
    }

    @Override // m3.InterfaceC8073o
    public final boolean j(long j11) {
        return this.f74278a.sendEmptyMessageAtTime(2, j11);
    }

    @Override // m3.InterfaceC8073o
    public final boolean k(int i11) {
        return this.f74278a.sendEmptyMessage(i11);
    }

    @Override // m3.InterfaceC8073o
    public final void l(int i11) {
        G10.a.c(i11 != 0);
        this.f74278a.removeMessages(i11);
    }
}
