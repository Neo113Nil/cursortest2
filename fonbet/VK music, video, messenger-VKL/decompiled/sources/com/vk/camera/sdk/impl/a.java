package com.vk.camera.sdk.impl;

import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import android.view.SurfaceHolder;
import com.vk.camera.sdk.impl.CameraException;
import com.vk.camera.sdk.impl.c;
import com.vk.log.L;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.lang.ref.WeakReference;
import java.util.List;
import ru.ok.proto.PublisherConfiguration;
import xsna.epx;
import xsna.h5s;
import xsna.ij9;
import xsna.jhu0;
import xsna.khu0;
import xsna.kk9;
import xsna.lhg;
import xsna.nq2;
import xsna.s3q0;
import xsna.sj9;
import xsna.tj9;
import xsna.xd9;

/* compiled from: Camera1Api.kt */
/* loaded from: classes16.dex */
public final class a implements jhu0 {
    public final ij9.a a;
    public final ij9.b b;
    public b c;
    public final c d;
    public volatile boolean e;
    public WeakReference<jhu0.d> f;
    public final int g;
    public final int i;
    public final int j;
    public final Camera.CameraInfo[] k;
    public final HandlerC0439a l;
    public Camera m;
    public volatile Camera.PreviewCallback o;
    public Camera.Parameters p;
    public volatile int h = -1;
    public final ConditionVariable n = new ConditionVariable();

    /* compiled from: Camera1Api.kt */
    /* renamed from: com.vk.camera.sdk.impl.a$a, reason: collision with other inner class name */
    public final class HandlerC0439a extends Handler {
        public static final /* synthetic */ int c = 0;
        public final xd9 a;

        public HandlerC0439a(Looper looper) {
            super(looper);
            this.a = new xd9();
        }

        public final void a(Object obj) {
            CameraException.PreviewTexutreFailed previewTexutreFailed;
            a aVar = a.this;
            aVar.a.a("Camera1Api", "setPreviewTexture texture=" + obj);
            try {
                aVar.m.setPreviewTexture((SurfaceTexture) obj);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            try {
                a aVar = a.this;
                switch (message.what) {
                    case 1:
                        a.x(aVar);
                        if (message.arg2 != -1) {
                            a.this.n.open();
                            return;
                        }
                        return;
                    case 2:
                        try {
                            aVar.m.reconnect();
                        } catch (Throwable unused) {
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 3:
                        try {
                            aVar.m.unlock();
                        } catch (Throwable th) {
                            L.f("Camera1Api", "failed to unlock camera", new CameraException.Error(th));
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 4:
                        try {
                            aVar.m.lock();
                        } catch (Throwable th2) {
                            L.f("Camera1Api", "failed to lock camera", new CameraException.Error(th2));
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 5:
                        a(message.obj);
                        return;
                    case 6:
                        if (aVar.o == null) {
                            a.y(a.this, 1, this.a);
                        }
                        try {
                            a.this.a.a("Camera1Api", "startPreview");
                            a.this.m.startPreview();
                        } catch (Throwable th3) {
                            a.this.b.a(new CameraException.StartPreviewFailed(th3));
                        }
                        if (epx.f(a.this.o, this.a)) {
                            a.y(a.this, 0, null);
                            return;
                        }
                        return;
                    case 7:
                        try {
                            aVar.a.a("Camera1Api", "stopPreview");
                            a.this.m.stopPreview();
                            a.this.o = null;
                        } catch (Throwable th4) {
                            L.f("Camera1Api", "faild to stop preview", new CameraException.StopPreviewFailed(th4));
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 8:
                        a.y(aVar, 3, (Camera.PreviewCallback) message.obj);
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 9:
                        byte[] bArr = (byte[]) message.obj;
                        Camera camera = aVar.m;
                        if (camera != null) {
                            camera.addCallbackBuffer(bArr);
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 10:
                        try {
                            aVar.m.autoFocus((Camera.AutoFocusCallback) message.obj);
                        } catch (Throwable th5) {
                            L.f("Camera1Api", "faild to set auto focus", new CameraException.Error(th5));
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 11:
                        try {
                            aVar.m.cancelAutoFocus();
                        } catch (Throwable th6) {
                            L.f("Camera1Api", "faild to cancel auto focus", new CameraException.Error(th6));
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 12:
                        aVar.m.setAutoFocusMoveCallback((Camera.AutoFocusMoveCallback) message.obj);
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 13:
                        try {
                            aVar.m.setDisplayOrientation(message.arg1);
                        } catch (Throwable th7) {
                            L.f("Camera1Api", "faild to set display orientation", new CameraException.Error(th7));
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 14:
                        Camera camera2 = aVar.m;
                        if (camera2 != null) {
                            camera2.setZoomChangeListener((Camera.OnZoomChangeListener) message.obj);
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 15:
                        aVar.m.setFaceDetectionListener((Camera.FaceDetectionListener) message.obj);
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 16:
                        aVar.m.startFaceDetection();
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 17:
                        aVar.m.stopFaceDetection();
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 18:
                        Camera camera3 = aVar.m;
                        if (camera3 != null) {
                            camera3.setErrorCallback((Camera.ErrorCallback) message.obj);
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 19:
                        aVar.z((Camera.Parameters) message.obj);
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 20:
                        try {
                            aVar.m.getParameters();
                        } catch (Throwable th8) {
                            L.f("Camera1Api", "faild to get parameters", new CameraException.Error(th8));
                        }
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 21:
                        try {
                            aVar.m.setParameters((Camera.Parameters) message.obj);
                            return;
                        } catch (Throwable th9) {
                            L.f("Camera1Api", "faild to get parameters", new CameraException.Error(th9));
                            return;
                        }
                    case 22:
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 23:
                        Camera camera4 = aVar.m;
                        SurfaceHolder surfaceHolder = (SurfaceHolder) message.obj;
                        aVar.a.a("Camera1Api", "setPreviewDisplay display=" + surfaceHolder);
                        try {
                            camera4.setPreviewDisplay(surfaceHolder);
                            return;
                        } catch (Throwable th10) {
                            L.f("Camera1Api", "failed to set preview display", new CameraException.Error(th10));
                            return;
                        }
                    case 24:
                    default:
                        aVar.b.a(new CameraException.Error("Invalid CameraProxy message=" + message));
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 25:
                        aVar.m.enableShutterSound(message.arg1 == 1);
                        if (message.arg2 != -1) {
                        }
                        break;
                    case 26:
                        int i = message.arg1;
                        jhu0.d dVar = (jhu0.d) message.obj;
                        try {
                            try {
                            } catch (CameraException e) {
                                if ("eng".equals(Build.TYPE)) {
                                    throw e;
                                }
                            }
                        } catch (Throwable th11) {
                            try {
                                L.f("Camera1Api", "can't tryOpenAsync: ", th11);
                                dVar.b(null);
                            } catch (Throwable th12) {
                                dVar.b(null);
                                throw th12;
                            }
                        }
                        if (!aVar.e) {
                            aVar.A(i);
                            dVar.b(aVar);
                            if (message.arg2 != -1) {
                            }
                        }
                        aVar = null;
                        dVar.b(aVar);
                        if (message.arg2 != -1) {
                        }
                        break;
                }
            } catch (Exception e2) {
                if (message.what != 1) {
                    a aVar2 = a.this;
                    if (aVar2.m != null) {
                        a.x(aVar2);
                    }
                }
                throw e2;
            }
        }
    }

    /* compiled from: Camera1Api.kt */
    public final class b {
        public b() {
            if (a.this.m == null) {
                throw new NullPointerException("Camera is null");
            }
        }

        public static void a(b bVar, int i) {
            a.this.l.obtainMessage(i, 0, -1, null).sendToTarget();
        }
    }

    /* compiled from: Camera1Api.kt */
    public final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                a aVar = a.this;
                synchronized (aVar) {
                    try {
                        if (!aVar.e) {
                            aVar.release(false);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (i != 2) {
                return;
            }
            a aVar2 = a.this;
            synchronized (aVar2) {
                try {
                    if (!aVar2.e) {
                        aVar2.release(true);
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                } finally {
                }
            }
        }
    }

    public a(ij9.a aVar, ij9.b bVar) {
        this.a = aVar;
        this.b = bVar;
        this.i = -1;
        this.j = -1;
        HandlerThread handlerThread = new HandlerThread("Camera1Api", -2);
        handlerThread.start();
        this.d = new c(handlerThread.getLooper());
        this.l = new HandlerC0439a(h5s.a("Camera Handler Thread").getLooper());
        int numberOfCameras = Camera.getNumberOfCameras();
        numberOfCameras = numberOfCameras <= 0 ? 0 : numberOfCameras;
        this.g = numberOfCameras;
        Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
        for (int i = 0; i < numberOfCameras; i++) {
            cameraInfoArr[i] = new Camera.CameraInfo();
        }
        this.k = cameraInfoArr;
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                Camera.getCameraInfo(i3, this.k[i3]);
            } catch (Throwable th) {
                L.f("Camera1Api", lhg.a(i3, "failed to get info for camera index="), new CameraException.InfoFailed(th));
            }
        }
        int i4 = this.g;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.i == -1 && this.k[i5].facing == 0) {
                this.i = i5;
            } else if (this.j == -1 && this.k[i5].facing == 1) {
                this.j = i5;
            }
        }
        if (this.i == -1 || this.j == -1) {
            this.a.e("Camera1Api", "failed to get cameraId: backId=" + this.i + ", frontId=" + this.j);
        }
    }

    public static final void x(a aVar) {
        try {
            aVar.m.release();
        } catch (Throwable unused) {
            aVar.a.b("Camera1Api", "Fail to release the camera.");
        }
        aVar.m = null;
        aVar.o = null;
    }

    public static final void y(a aVar, int i, Camera.PreviewCallback previewCallback) {
        tj9 parameters;
        Camera camera = aVar.m;
        if (camera != null) {
            aVar.a.a("Camera1Api", "setPreviewCallbackWithBufferImpl");
            if (i > 0 && previewCallback != null && aVar.o == null && (parameters = aVar.getParameters()) != null) {
                Size h = parameters.h();
                if (h == null) {
                    h = new Size(CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES);
                }
                int ceil = (int) Math.ceil(((h.getHeight() * h.getWidth()) * ImageFormat.getBitsPerPixel(17)) / 8.0d);
                if (ceil == 0) {
                    throw new CameraException.Error("faild to get preview buffer size, " + h.getWidth() + 'x' + h.getHeight());
                }
                for (int i2 = 0; i2 < i; i2++) {
                    camera.addCallbackBuffer(new byte[ceil]);
                }
            }
            camera.setPreviewCallbackWithBuffer(previewCallback);
            aVar.o = previewCallback;
        }
    }

    public final synchronized void A(int i) throws CameraException {
        try {
            if (this.e) {
                throw new CameraException.AlreadyOpened("Camera is already opened");
            }
            if (this.c != null && this.h != i) {
                B(false, true);
            }
            if (this.c == null) {
                try {
                    this.a.d("Camera1Api", "open camera " + i);
                    Camera open = Camera.open(i);
                    this.m = open;
                    this.c = open != null ? new b() : null;
                    this.h = i;
                    this.p = this.m.getParameters();
                } catch (RuntimeException e) {
                    L.f("Camera1Api", "failed to open Camera", e);
                    throw new CameraException.OpenFailed(e);
                }
            } else {
                try {
                    this.m.reconnect();
                    Camera.Parameters parameters = this.p;
                    if (parameters != null) {
                        z(parameters);
                    }
                } finally {
                }
            }
            this.e = true;
            this.d.removeMessages(1);
            this.d.removeMessages(2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void B(boolean z, boolean z2) {
        if (this.c != null) {
            this.a.c("Camera1Api", "release camera id=" + this.h);
            if (z) {
                b bVar = this.c;
                bVar.getClass();
                b.a(bVar, 1);
            } else if (z2) {
                x(a.this);
            } else {
                a aVar = a.this;
                aVar.n.close();
                aVar.l.sendEmptyMessage(1);
                aVar.n.block();
            }
            this.c = null;
        }
        this.h = -1;
    }

    @Override // xsna.jhu0
    public final int a() {
        if (this.h == -1) {
            this.a.e("Camera1Api", "retrieve cam id which is \"no cam\": -1");
        }
        return this.h;
    }

    @Override // xsna.jhu0
    public final khu0 b() {
        if (this.h < 0) {
            return null;
        }
        Camera.CameraInfo cameraInfo = this.k[this.h];
        return new c.a(cameraInfo.orientation, cameraInfo.facing, false);
    }

    @Override // xsna.jhu0
    public final boolean c() {
        return false;
    }

    @Override // xsna.jhu0
    public final boolean d() {
        return this.h == this.j;
    }

    @Override // xsna.jhu0
    public final void e(sj9 sj9Var) {
        b bVar;
        Camera.Parameters parameters = ((tj9) sj9Var).a;
        if (parameters == null || (bVar = this.c) == null) {
            return;
        }
        a aVar = a.this;
        ConditionVariable conditionVariable = aVar.n;
        conditionVariable.close();
        aVar.l.obtainMessage(19, parameters).sendToTarget();
        conditionVariable.block();
    }

    @Override // xsna.jhu0
    public final void f() {
        b bVar = this.c;
        if (bVar != null) {
            b.a(bVar, 6);
        }
    }

    @Override // xsna.jhu0
    public final void g() {
        b bVar = this.c;
        if (bVar != null) {
            a aVar = a.this;
            ConditionVariable conditionVariable = aVar.n;
            conditionVariable.close();
            aVar.l.sendEmptyMessage(11);
            conditionVariable.block();
        }
    }

    @Override // xsna.jhu0
    public final tj9 getParameters() {
        Camera.Parameters parameters = this.p;
        tj9 tj9Var = parameters != null ? new tj9(parameters, null, 1000) : null;
        if (tj9Var == null) {
            this.b.a(new CameraException.Error("retrieved null instead of params"));
        }
        return tj9Var;
    }

    @Override // xsna.jhu0
    public final void h(SurfaceTexture surfaceTexture) {
        b bVar = this.c;
        if (bVar != null) {
            a.this.l.obtainMessage(5, 0, -1, surfaceTexture).sendToTarget();
        }
    }

    @Override // xsna.jhu0
    public final void i(final jhu0.a aVar) {
        if (aVar == null) {
            b bVar = this.c;
            if (bVar != null) {
                a aVar2 = a.this;
                ConditionVariable conditionVariable = aVar2.n;
                conditionVariable.close();
                aVar2.l.obtainMessage(10, null).sendToTarget();
                conditionVariable.block();
                return;
            }
            return;
        }
        b bVar2 = this.c;
        if (bVar2 != null) {
            Camera.AutoFocusCallback autoFocusCallback = new Camera.AutoFocusCallback(this) { // from class: xsna.ud9
                @Override // android.hardware.Camera.AutoFocusCallback
                public final void onAutoFocus(boolean z, Camera camera) {
                    jhu0.a.this.a(z);
                }
            };
            a aVar3 = a.this;
            ConditionVariable conditionVariable2 = aVar3.n;
            conditionVariable2.close();
            aVar3.l.obtainMessage(10, autoFocusCallback).sendToTarget();
            conditionVariable2.block();
        }
    }

    @Override // xsna.jhu0
    public final boolean j() {
        return this.g > 1;
    }

    @Override // xsna.jhu0
    public final void k(int i, kk9.d dVar) {
        jhu0.d dVar2;
        if (this.e) {
            WeakReference<jhu0.d> weakReference = this.f;
            if (weakReference != null && (dVar2 = weakReference.get()) != null) {
                dVar2.a();
            }
            release(false);
        }
        this.f = new WeakReference<>(dVar);
        this.l.obtainMessage(26, i, -1, dVar).sendToTarget();
    }

    @Override // xsna.jhu0
    public final void l() {
        kk9.b bVar = kk9.F;
        b bVar2 = this.c;
        if (bVar2 != null) {
            final nq2 nq2Var = new nq2(this);
            Camera.ErrorCallback errorCallback = new Camera.ErrorCallback() { // from class: xsna.vd9
                @Override // android.hardware.Camera.ErrorCallback
                public final void onError(int i, Camera camera) {
                    nq2.this.invoke(Integer.valueOf(i), camera);
                }
            };
            a aVar = a.this;
            ConditionVariable conditionVariable = aVar.n;
            conditionVariable.close();
            aVar.l.obtainMessage(18, errorCallback).sendToTarget();
            conditionVariable.block();
        }
    }

    @Override // xsna.jhu0
    public final boolean m() {
        return this.g > 0;
    }

    @Override // xsna.jhu0
    public final khu0 n(int i) {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            return new c.a(cameraInfo.orientation, cameraInfo.facing, false);
        } catch (Throwable th) {
            L.f("Camera1Api", lhg.a(i, "failed to get info for cameraId="), new CameraException.InfoFailed(th));
            return null;
        }
    }

    @Override // xsna.jhu0
    public final void o(int i) {
        b bVar = this.c;
        if (bVar != null) {
            a aVar = a.this;
            ConditionVariable conditionVariable = aVar.n;
            conditionVariable.close();
            aVar.l.obtainMessage(13, i, 0).sendToTarget();
            conditionVariable.block();
        }
    }

    @Override // xsna.jhu0
    public final boolean p() {
        List<String> supportedFlashModes;
        try {
            Camera.Parameters parameters = this.p;
            if (parameters != null && parameters.getFlashMode() != null && (supportedFlashModes = this.p.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty()) {
                if (supportedFlashModes.size() == 1) {
                    if (!epx.f(supportedFlashModes.get(0), "off")) {
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // xsna.jhu0
    public final void q() {
        b bVar = this.c;
        if (bVar != null) {
            b.a(bVar, 7);
        }
    }

    @Override // xsna.jhu0
    public final Camera r() {
        return this.m;
    }

    @Override // xsna.jhu0
    public final synchronized void release(boolean z) {
        try {
            if (this.c == null) {
                return;
            }
            this.e = false;
            WeakReference<jhu0.d> weakReference = this.f;
            if (weakReference != null) {
                weakReference.clear();
            }
            B(z, false);
            this.p = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.jhu0
    public final Integer s() {
        return Integer.valueOf(this.i);
    }

    @Override // xsna.jhu0
    public final Integer t() {
        return Integer.valueOf(this.j);
    }

    @Override // xsna.jhu0
    public final void u() {
        b bVar = this.c;
        if (bVar != null) {
            a aVar = a.this;
            ConditionVariable conditionVariable = aVar.n;
            conditionVariable.close();
            aVar.l.sendEmptyMessage(7);
            conditionVariable.block();
        }
    }

    @Override // xsna.jhu0
    public final void v(final jhu0.c cVar) {
        HandlerC0439a handlerC0439a;
        Message obtainMessage;
        Message obtainMessage2;
        if (cVar == null) {
            b bVar = this.c;
            if (bVar == null || (handlerC0439a = a.this.l) == null || (obtainMessage = handlerC0439a.obtainMessage(8, 0, -1, null)) == null) {
                return;
            }
            obtainMessage.sendToTarget();
            return;
        }
        b bVar2 = this.c;
        if (bVar2 != null) {
            Camera.PreviewCallback previewCallback = new Camera.PreviewCallback(this) { // from class: xsna.wd9
                @Override // android.hardware.Camera.PreviewCallback
                public final void onPreviewFrame(byte[] bArr, Camera camera) {
                    jhu0.c.this.f(bArr);
                }
            };
            HandlerC0439a handlerC0439a2 = a.this.l;
            if (handlerC0439a2 == null || (obtainMessage2 = handlerC0439a2.obtainMessage(8, 0, -1, previewCallback)) == null) {
                return;
            }
            obtainMessage2.sendToTarget();
        }
    }

    @Override // xsna.jhu0
    public final void w(byte[] bArr) {
        HandlerC0439a handlerC0439a;
        Message obtainMessage;
        b bVar = this.c;
        if (bVar == null || (handlerC0439a = a.this.l) == null || (obtainMessage = handlerC0439a.obtainMessage(9, 0, -1, bArr)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }

    public final void z(Camera.Parameters parameters) {
        if (parameters != null) {
            try {
                this.m.setParameters(parameters);
            } catch (Throwable th) {
                L.f("Camera1Api", "failed to set camera params=" + parameters, new CameraException.Error(th));
            }
        }
    }
}
