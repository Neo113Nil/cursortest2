package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import t.C6375b;

/* loaded from: classes.dex */
public class z extends B {

    /* renamed from: b, reason: collision with root package name */
    public C6375b f20429b = new C6375b();

    public static class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public final LiveData f20430a;

        /* renamed from: b, reason: collision with root package name */
        public final C f20431b;

        /* renamed from: c, reason: collision with root package name */
        public int f20432c = -1;

        public a(LiveData liveData, C c10) {
            this.f20430a = liveData;
            this.f20431b = c10;
        }

        public void a() {
            this.f20430a.observeForever(this);
        }

        public void b() {
            this.f20430a.removeObserver(this);
        }

        @Override // androidx.lifecycle.C
        public void onChanged(Object obj) {
            if (this.f20432c != this.f20430a.getVersion()) {
                this.f20432c = this.f20430a.getVersion();
                this.f20431b.onChanged(obj);
            }
        }
    }

    public void c(LiveData liveData, C c10) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(liveData, c10);
        a aVar2 = (a) this.f20429b.g(liveData, aVar);
        if (aVar2 != null && aVar2.f20431b != c10) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && hasActiveObservers()) {
            aVar.a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator it = this.f20429b.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator it = this.f20429b.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).b();
        }
    }
}
