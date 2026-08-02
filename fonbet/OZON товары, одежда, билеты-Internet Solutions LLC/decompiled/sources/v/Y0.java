package v;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final Executor f101168a;

    /* renamed from: b, reason: collision with root package name */
    final Object f101169b = new Object();

    /* renamed from: c, reason: collision with root package name */
    final LinkedHashSet f101170c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    final LinkedHashSet f101171d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    final LinkedHashSet f101172e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private final CameraDevice.StateCallback f101173f = new a();

    final class a extends CameraDevice.StateCallback {
        a() {
        }

        private void a() {
            ArrayList c11;
            synchronized (Y0.this.f101169b) {
                c11 = Y0.this.c();
                Y0.this.f101172e.clear();
                Y0.this.f101170c.clear();
                Y0.this.f101171d.clear();
            }
            Iterator it = c11.iterator();
            while (it.hasNext()) {
                ((E1) it.next()).g();
            }
        }

        private void b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (Y0.this.f101169b) {
                linkedHashSet.addAll(Y0.this.f101172e);
                linkedHashSet.addAll(Y0.this.f101170c);
            }
            Y0.this.f101168a.execute(new B90.k0(linkedHashSet, 6));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, final int i11) {
            b();
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (Y0.this.f101169b) {
                linkedHashSet.addAll(Y0.this.f101172e);
                linkedHashSet.addAll(Y0.this.f101170c);
            }
            Y0.this.f101168a.execute(new Runnable() { // from class: v.X0
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((E1) it.next()).c(i11);
                    }
                }
            });
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
        }
    }

    Y0(@NonNull Executor executor) {
        this.f101168a = executor;
    }

    @NonNull
    final CameraDevice.StateCallback a() {
        return this.f101173f;
    }

    @NonNull
    final ArrayList b() {
        ArrayList arrayList;
        synchronized (this.f101169b) {
            arrayList = new ArrayList(this.f101170c);
        }
        return arrayList;
    }

    @NonNull
    final ArrayList c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f101169b) {
            arrayList = new ArrayList();
            arrayList.addAll(b());
            synchronized (this.f101169b) {
                arrayList2 = new ArrayList(this.f101172e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    final void d(@NonNull E1 e12) {
        E1 e13;
        Iterator it = c().iterator();
        while (it.hasNext() && (e13 = (E1) it.next()) != e12) {
            e13.g();
        }
        synchronized (this.f101169b) {
            this.f101172e.remove(e12);
        }
    }
}
