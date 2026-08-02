package Y2;

import androidx.lifecycle.LiveData;
import u.InterfaceC6482a;

/* loaded from: classes.dex */
public abstract class o {

    public class a implements androidx.lifecycle.C {

        /* renamed from: a, reason: collision with root package name */
        public Object f13957a = null;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Z2.b f13958b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f13959c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6482a f13960d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.z f13961e;

        /* renamed from: Y2.o$a$a, reason: collision with other inner class name */
        public class RunnableC0287a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f13962a;

            public RunnableC0287a(Object obj) {
                this.f13962a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f13959c) {
                    try {
                        Object apply = a.this.f13960d.apply(this.f13962a);
                        a aVar = a.this;
                        Object obj = aVar.f13957a;
                        if (obj == null && apply != null) {
                            aVar.f13957a = apply;
                            aVar.f13961e.postValue(apply);
                        } else if (obj != null && !obj.equals(apply)) {
                            a aVar2 = a.this;
                            aVar2.f13957a = apply;
                            aVar2.f13961e.postValue(apply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public a(Z2.b bVar, Object obj, InterfaceC6482a interfaceC6482a, androidx.lifecycle.z zVar) {
            this.f13958b = bVar;
            this.f13959c = obj;
            this.f13960d = interfaceC6482a;
            this.f13961e = zVar;
        }

        @Override // androidx.lifecycle.C
        public void onChanged(Object obj) {
            this.f13958b.d(new RunnableC0287a(obj));
        }
    }

    public static LiveData a(LiveData liveData, InterfaceC6482a interfaceC6482a, Z2.b bVar) {
        Object obj = new Object();
        androidx.lifecycle.z zVar = new androidx.lifecycle.z();
        zVar.c(liveData, new a(bVar, obj, interfaceC6482a, zVar));
        return zVar;
    }
}
