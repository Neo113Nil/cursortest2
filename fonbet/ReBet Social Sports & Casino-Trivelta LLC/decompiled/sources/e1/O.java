package e1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e1.InterfaceC4152t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class O implements InterfaceC4152t {

    /* renamed from: b, reason: collision with root package name */
    public static final List f45491b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f45492a;

    public static final class b implements InterfaceC4152t.a {

        /* renamed from: a, reason: collision with root package name */
        public Message f45493a;

        /* renamed from: b, reason: collision with root package name */
        public O f45494b;

        public b() {
        }

        @Override // e1.InterfaceC4152t.a
        public void a() {
            ((Message) AbstractC4134a.e(this.f45493a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f45493a = null;
            this.f45494b = null;
            O.q(this);
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC4134a.e(this.f45493a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, O o10) {
            this.f45493a = message;
            this.f45494b = o10;
            return this;
        }
    }

    public O(Handler handler) {
        this.f45492a = handler;
    }

    public static b p() {
        b bVar;
        List list = f45491b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static void q(b bVar) {
        List list = f45491b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e1.InterfaceC4152t
    public boolean a(int i10, int i11) {
        return this.f45492a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // e1.InterfaceC4152t
    public InterfaceC4152t.a b(int i10) {
        return p().d(this.f45492a.obtainMessage(i10), this);
    }

    @Override // e1.InterfaceC4152t
    public boolean c(int i10) {
        AbstractC4134a.a(i10 != 0);
        return this.f45492a.hasMessages(i10);
    }

    @Override // e1.InterfaceC4152t
    public boolean d(InterfaceC4152t.a aVar) {
        return ((b) aVar).c(this.f45492a);
    }

    @Override // e1.InterfaceC4152t
    public InterfaceC4152t.a e(int i10, int i11, int i12, Object obj) {
        return p().d(this.f45492a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // e1.InterfaceC4152t
    public InterfaceC4152t.a f(int i10, Object obj) {
        return p().d(this.f45492a.obtainMessage(i10, obj), this);
    }

    @Override // e1.InterfaceC4152t
    public void g(Object obj) {
        this.f45492a.removeCallbacksAndMessages(obj);
    }

    @Override // e1.InterfaceC4152t
    public Looper h() {
        return this.f45492a.getLooper();
    }

    @Override // e1.InterfaceC4152t
    public InterfaceC4152t.a i(int i10, int i11, int i12) {
        return p().d(this.f45492a.obtainMessage(i10, i11, i12), this);
    }

    @Override // e1.InterfaceC4152t
    public boolean j(Runnable runnable) {
        return this.f45492a.post(runnable);
    }

    @Override // e1.InterfaceC4152t
    public boolean k(Runnable runnable, long j10) {
        return this.f45492a.postDelayed(runnable, j10);
    }

    @Override // e1.InterfaceC4152t
    public boolean l(int i10) {
        return this.f45492a.sendEmptyMessage(i10);
    }

    @Override // e1.InterfaceC4152t
    public boolean m(int i10, long j10) {
        return this.f45492a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // e1.InterfaceC4152t
    public void n(int i10) {
        AbstractC4134a.a(i10 != 0);
        this.f45492a.removeMessages(i10);
    }
}
