package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v.E1;

/* loaded from: classes8.dex */
final class P1 extends E1.c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f101055a;

    static class a extends E1.c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final CameraCaptureSession.StateCallback f101056a;

        a(@NonNull List<CameraCaptureSession.StateCallback> list) {
            this.f101056a = list.isEmpty() ? new J0() : list.size() == 1 ? list.get(0) : new I0(list);
        }

        @Override // v.E1.c
        public final void h(@NonNull E1 e12) {
            this.f101056a.onActive(((K1) e12).e().c());
        }

        @Override // v.E1.c
        public final void i(@NonNull E1 e12) {
            this.f101056a.onCaptureQueueEmpty(((K1) e12).e().c());
        }

        @Override // v.E1.c
        public final void j(@NonNull E1 e12) {
            this.f101056a.onClosed(e12.e().c());
        }

        @Override // v.E1.c
        public final void k(@NonNull E1 e12) {
            this.f101056a.onConfigureFailed(e12.e().c());
        }

        @Override // v.E1.c
        public final void l(@NonNull E1 e12) {
            this.f101056a.onConfigured(((K1) e12).e().c());
        }

        @Override // v.E1.c
        public final void m(@NonNull E1 e12) {
            this.f101056a.onReady(((K1) e12).e().c());
        }

        @Override // v.E1.c
        final void n(@NonNull E1 e12) {
        }

        @Override // v.E1.c
        public final void o(@NonNull E1 e12, @NonNull Surface surface) {
            this.f101056a.onSurfacePrepared(((K1) e12).e().c(), surface);
        }
    }

    P1(@NonNull List<E1.c> list) {
        ArrayList arrayList = new ArrayList();
        this.f101055a = arrayList;
        arrayList.addAll(list);
    }

    @Override // v.E1.c
    public final void h(@NonNull E1 e12) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).h(e12);
        }
    }

    @Override // v.E1.c
    public final void i(@NonNull E1 e12) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).i(e12);
        }
    }

    @Override // v.E1.c
    public final void j(@NonNull E1 e12) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).j(e12);
        }
    }

    @Override // v.E1.c
    public final void k(@NonNull E1 e12) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).k(e12);
        }
    }

    @Override // v.E1.c
    public final void l(@NonNull E1 e12) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).l(e12);
        }
    }

    @Override // v.E1.c
    public final void m(@NonNull E1 e12) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).m(e12);
        }
    }

    @Override // v.E1.c
    final void n(@NonNull E1 e12) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).n(e12);
        }
    }

    @Override // v.E1.c
    public final void o(@NonNull E1 e12, @NonNull Surface surface) {
        Iterator it = this.f101055a.iterator();
        while (it.hasNext()) {
            ((E1.c) it.next()).o(e12, surface);
        }
    }
}
