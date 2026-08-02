package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import v.S;
import z.C10961s;

/* renamed from: z.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10961s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106840a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.google.common.util.concurrent.m<Void>> f106841b = Collections.synchronizedList(new ArrayList());

    /* renamed from: z.s$a */
    static class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        final com.google.common.util.concurrent.m<Void> f106842a = androidx.concurrent.futures.b.a(new b.c() { // from class: z.r
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                C10961s.a aVar2 = C10961s.a.this;
                aVar2.f106843b = aVar;
                return "RequestCompleteListener[" + aVar2 + "]";
            }
        });

        /* renamed from: b, reason: collision with root package name */
        b.a<Void> f106843b;

        a() {
        }

        private void a() {
            b.a<Void> aVar = this.f106843b;
            if (aVar != null) {
                aVar.c(null);
                this.f106843b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i11) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
            a();
        }
    }

    public C10961s(boolean z11) {
        this.f106840a = z11;
    }

    public static /* synthetic */ void a(C10961s c10961s, a aVar, com.google.common.util.concurrent.m mVar) {
        c10961s.getClass();
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + c10961s);
        c10961s.f106841b.remove(mVar);
    }

    @NonNull
    public final CameraCaptureSession.CaptureCallback b(@NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f106840a) {
            return captureCallback;
        }
        final a aVar = new a();
        final com.google.common.util.concurrent.m<Void> mVar = aVar.f106842a;
        this.f106841b.add(mVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        mVar.a(new Runnable() { // from class: z.p
            @Override // java.lang.Runnable
            public final void run() {
                C10961s.a(C10961s.this, aVar, mVar);
            }
        }, H.c.b());
        return S.a(aVar, captureCallback);
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> c() {
        List<com.google.common.util.concurrent.m<Void>> list = this.f106841b;
        return list.isEmpty() ? I.k.h(null) : I.k.i(I.k.m(I.k.l(new ArrayList(list)), new C10959q(), H.c.b()));
    }

    public final void d() {
        LinkedList linkedList = new LinkedList(this.f106841b);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.m mVar = (com.google.common.util.concurrent.m) linkedList.poll();
            Objects.requireNonNull(mVar);
            mVar.cancel(true);
        }
    }
}
