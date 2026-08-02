package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import java.util.Iterator;
import java.util.Map;
import t.C6375b;

/* loaded from: classes.dex */
public abstract class LiveData {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C6375b mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC2191p {

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC2193s f20274e;

        public LifecycleBoundObserver(InterfaceC2193s interfaceC2193s, C c10) {
            super(c10);
            this.f20274e = interfaceC2193s;
        }

        public void b() {
            this.f20274e.getLifecycle().d(this);
        }

        public boolean c(InterfaceC2193s interfaceC2193s) {
            return this.f20274e == interfaceC2193s;
        }

        public boolean d() {
            return this.f20274e.getLifecycle().b().b(AbstractC2185j.b.f20393d);
        }

        @Override // androidx.lifecycle.InterfaceC2191p
        public void k(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
            AbstractC2185j.b b10 = this.f20274e.getLifecycle().b();
            if (b10 == AbstractC2185j.b.f20390a) {
                LiveData.this.removeObserver(this.f20278a);
                return;
            }
            AbstractC2185j.b bVar = null;
            while (bVar != b10) {
                a(d());
                bVar = b10;
                b10 = this.f20274e.getLifecycle().b();
            }
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    public class b extends c {
        public b(C c10) {
            super(c10);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final C f20278a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20279b;

        /* renamed from: c, reason: collision with root package name */
        public int f20280c = -1;

        public c(C c10) {
            this.f20278a = c10;
        }

        public void a(boolean z10) {
            if (z10 == this.f20279b) {
                return;
            }
            this.f20279b = z10;
            LiveData.this.changeActiveCounter(z10 ? 1 : -1);
            if (this.f20279b) {
                LiveData.this.dispatchingValue(this);
            }
        }

        public void b() {
        }

        public boolean c(InterfaceC2193s interfaceC2193s) {
            return false;
        }

        public abstract boolean d();
    }

    public LiveData(Object obj) {
        this.mDataLock = new Object();
        this.mObservers = new C6375b();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (s.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(c cVar) {
        if (cVar.f20279b) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f20280c;
            int i11 = this.mVersion;
            if (i10 >= i11) {
                return;
            }
            cVar.f20280c = i11;
            cVar.f20278a.onChanged(this.mData);
        }
    }

    public void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 == i12) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    onActive();
                } else if (z11) {
                    onInactive();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.mChangingActiveState = false;
                throw th2;
            }
        }
    }

    public void dispatchingValue(androidx.lifecycle.LiveData.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                C6375b.d c10 = this.mObservers.c();
                while (c10.hasNext()) {
                    b((c) ((Map.Entry) c10.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(InterfaceC2193s interfaceC2193s, C c10) {
        assertMainThread("observe");
        if (interfaceC2193s.getLifecycle().b() == AbstractC2185j.b.f20390a) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC2193s, c10);
        c cVar = (c) this.mObservers.g(c10, lifecycleBoundObserver);
        if (cVar != null && !cVar.c(interfaceC2193s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        interfaceC2193s.getLifecycle().a(lifecycleBoundObserver);
    }

    public void observeForever(C c10) {
        assertMainThread("observeForever");
        b bVar = new b(c10);
        c cVar = (c) this.mObservers.g(c10, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.a(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(Object obj) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = obj;
        }
        if (z10) {
            s.c.h().d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C c10) {
        assertMainThread("removeObserver");
        c cVar = (c) this.mObservers.h(c10);
        if (cVar == null) {
            return;
        }
        cVar.b();
        cVar.a(false);
    }

    public void removeObservers(InterfaceC2193s interfaceC2193s) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((c) entry.getValue()).c(interfaceC2193s)) {
                removeObserver((C) entry.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C6375b();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
