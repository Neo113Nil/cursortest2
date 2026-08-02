package Z0;

import Z0.a;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import z.s;

/* loaded from: classes.dex */
public class b extends Z0.a {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14424c = false;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2193s f14425a;

    /* renamed from: b, reason: collision with root package name */
    public final c f14426b;

    public static class a extends B implements c.InterfaceC0386c {

        /* renamed from: b, reason: collision with root package name */
        public final int f14427b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f14428c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.loader.content.c f14429d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC2193s f14430e;

        /* renamed from: f, reason: collision with root package name */
        public C0303b f14431f;

        /* renamed from: g, reason: collision with root package name */
        public androidx.loader.content.c f14432g;

        public a(int i10, Bundle bundle, androidx.loader.content.c cVar, androidx.loader.content.c cVar2) {
            this.f14427b = i10;
            this.f14428c = bundle;
            this.f14429d = cVar;
            this.f14432g = cVar2;
            cVar.registerListener(i10, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0386c
        public void a(androidx.loader.content.c cVar, Object obj) {
            if (b.f14424c) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(obj);
                return;
            }
            if (b.f14424c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(obj);
        }

        public androidx.loader.content.c c(boolean z10) {
            if (b.f14424c) {
                toString();
            }
            this.f14429d.cancelLoad();
            this.f14429d.abandon();
            C0303b c0303b = this.f14431f;
            if (c0303b != null) {
                removeObserver(c0303b);
                if (z10) {
                    c0303b.c();
                }
            }
            this.f14429d.unregisterListener(this);
            if ((c0303b == null || c0303b.b()) && !z10) {
                return this.f14429d;
            }
            this.f14429d.reset();
            return this.f14432g;
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f14427b);
            printWriter.print(" mArgs=");
            printWriter.println(this.f14428c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f14429d);
            this.f14429d.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f14431f != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f14431f);
                this.f14431f.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(e().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        public androidx.loader.content.c e() {
            return this.f14429d;
        }

        public void f() {
            InterfaceC2193s interfaceC2193s = this.f14430e;
            C0303b c0303b = this.f14431f;
            if (interfaceC2193s == null || c0303b == null) {
                return;
            }
            super.removeObserver(c0303b);
            observe(interfaceC2193s, c0303b);
        }

        public androidx.loader.content.c g(InterfaceC2193s interfaceC2193s, a.InterfaceC0302a interfaceC0302a) {
            C0303b c0303b = new C0303b(this.f14429d, interfaceC0302a);
            observe(interfaceC2193s, c0303b);
            C c10 = this.f14431f;
            if (c10 != null) {
                removeObserver(c10);
            }
            this.f14430e = interfaceC2193s;
            this.f14431f = c0303b;
            return this.f14429d;
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (b.f14424c) {
                toString();
            }
            this.f14429d.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (b.f14424c) {
                toString();
            }
            this.f14429d.stopLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(C c10) {
            super.removeObserver(c10);
            this.f14430e = null;
            this.f14431f = null;
        }

        @Override // androidx.lifecycle.B, androidx.lifecycle.LiveData
        public void setValue(Object obj) {
            super.setValue(obj);
            androidx.loader.content.c cVar = this.f14432g;
            if (cVar != null) {
                cVar.reset();
                this.f14432g = null;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f14427b);
            sb2.append(" : ");
            Class<?> cls = this.f14429d.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: Z0.b$b, reason: collision with other inner class name */
    public static class C0303b implements C {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.loader.content.c f14433a;

        /* renamed from: b, reason: collision with root package name */
        public final a.InterfaceC0302a f14434b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14435c = false;

        public C0303b(androidx.loader.content.c cVar, a.InterfaceC0302a interfaceC0302a) {
            this.f14433a = cVar;
            this.f14434b = interfaceC0302a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f14435c);
        }

        public boolean b() {
            return this.f14435c;
        }

        public void c() {
            if (this.f14435c) {
                if (b.f14424c) {
                    Objects.toString(this.f14433a);
                }
                this.f14434b.onLoaderReset(this.f14433a);
            }
        }

        @Override // androidx.lifecycle.C
        public void onChanged(Object obj) {
            if (b.f14424c) {
                Objects.toString(this.f14433a);
                this.f14433a.dataToString(obj);
            }
            this.f14435c = true;
            this.f14434b.onLoadFinished(this.f14433a, obj);
        }

        public String toString() {
            return this.f14434b.toString();
        }
    }

    public static class c extends Q {

        /* renamed from: u, reason: collision with root package name */
        public static final U.c f14436u = new a();

        /* renamed from: s, reason: collision with root package name */
        public s f14437s = new s();

        /* renamed from: t, reason: collision with root package name */
        public boolean f14438t = false;

        public static class a implements U.c {
            @Override // androidx.lifecycle.U.c
            public Q create(Class cls) {
                return new c();
            }
        }

        public static c e(V v10) {
            return (c) new U(v10, f14436u).a(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f14437s.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f14437s.k(); i10++) {
                    a aVar = (a) this.f14437s.l(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f14437s.h(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.d(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void d() {
            this.f14438t = false;
        }

        public a f(int i10) {
            return (a) this.f14437s.e(i10);
        }

        public boolean g() {
            return this.f14438t;
        }

        public void h() {
            int k10 = this.f14437s.k();
            for (int i10 = 0; i10 < k10; i10++) {
                ((a) this.f14437s.l(i10)).f();
            }
        }

        public void i(int i10, a aVar) {
            this.f14437s.i(i10, aVar);
        }

        public void j() {
            this.f14438t = true;
        }

        @Override // androidx.lifecycle.Q
        public void onCleared() {
            super.onCleared();
            int k10 = this.f14437s.k();
            for (int i10 = 0; i10 < k10; i10++) {
                ((a) this.f14437s.l(i10)).c(true);
            }
            this.f14437s.b();
        }
    }

    public b(InterfaceC2193s interfaceC2193s, V v10) {
        this.f14425a = interfaceC2193s;
        this.f14426b = c.e(v10);
    }

    @Override // Z0.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f14426b.a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // Z0.a
    public androidx.loader.content.c c(int i10, Bundle bundle, a.InterfaceC0302a interfaceC0302a) {
        if (this.f14426b.g()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a f10 = this.f14426b.f(i10);
        if (f14424c) {
            toString();
            Objects.toString(bundle);
        }
        if (f10 == null) {
            return e(i10, bundle, interfaceC0302a, null);
        }
        if (f14424c) {
            f10.toString();
        }
        return f10.g(this.f14425a, interfaceC0302a);
    }

    @Override // Z0.a
    public void d() {
        this.f14426b.h();
    }

    public final androidx.loader.content.c e(int i10, Bundle bundle, a.InterfaceC0302a interfaceC0302a, androidx.loader.content.c cVar) {
        try {
            this.f14426b.j();
            androidx.loader.content.c onCreateLoader = interfaceC0302a.onCreateLoader(i10, bundle);
            if (onCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
            }
            a aVar = new a(i10, bundle, onCreateLoader, cVar);
            if (f14424c) {
                aVar.toString();
            }
            this.f14426b.i(i10, aVar);
            this.f14426b.d();
            return aVar.g(this.f14425a, interfaceC0302a);
        } catch (Throwable th2) {
            this.f14426b.d();
            throw th2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f14425a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
