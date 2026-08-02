package com.vk.camera.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import com.vk.camera.sdk.impl.CameraException;
import com.vk.camera.sdk.impl.b;
import com.vk.camera.sdk.impl.c;
import com.vk.log.L;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.proto.PublisherConfiguration;
import xsna.epx;
import xsna.fb20;
import xsna.ij9;
import xsna.jhu0;
import xsna.jja0;
import xsna.khu0;
import xsna.kk9;
import xsna.lhg;
import xsna.ol9;
import xsna.s3q0;
import xsna.sj9;
import xsna.tgw;
import xsna.tj9;

/* compiled from: Camera2Api.kt */
/* loaded from: classes16.dex */
public final class b implements jhu0 {
    public final ij9.a a;
    public final ij9.b b;
    public final ConditionVariable c = new ConditionVariable();
    public final ConditionVariable d = new ConditionVariable();
    public final Object e = new Object();
    public final HandlerThread f;
    public final Handler g;
    public final CameraManager h;
    public volatile a i;
    public volatile tj9 j;
    public WeakReference<jhu0.d> k;
    public RunnableC0442b l;
    public volatile boolean m;
    public volatile int n;
    public final Integer o;
    public final Integer p;
    public final SparseArray<c.b> q;

    /* compiled from: Camera2Api.kt */
    public final class a {
        public final CameraCharacteristics c;
        public final SparseArray<String> d;
        public final Handler e;
        public ImageReader f;
        public jhu0.c h;
        public jhu0.a i;
        public jja0 j;
        public boolean k;
        public Pair<Integer, Integer> l;
        public CameraDevice m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public CaptureRequest.Builder r;
        public Integer s;
        public Integer t;
        public double u;
        public final boolean v;
        public Runnable w;
        public byte[] x;
        public byte[] y;
        public byte[] z;
        public final AtomicBoolean a = new AtomicBoolean();
        public final HashMap<SurfaceTexture, Surface> b = new HashMap<>();
        public Size g = new Size(0, 0);

        /* compiled from: Camera2Api.kt */
        /* renamed from: com.vk.camera.sdk.impl.b$a$a, reason: collision with other inner class name */
        public final class C0440a extends CameraCaptureSession.CaptureCallback {
            public final boolean a;

            public C0440a(boolean z) {
                this.a = z;
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                a aVar = a.this;
                Handler handler = aVar.e;
                if (aVar.b(cameraCaptureSession.getDevice())) {
                    return;
                }
                if (aVar.o) {
                    try {
                        cameraCaptureSession.abortCaptures();
                        aVar.g();
                        return;
                    } catch (Exception e) {
                        L.f("Camera2Api", "failed to start capture", e);
                        return;
                    }
                }
                if (aVar.p) {
                    try {
                        cameraCaptureSession.stopRepeating();
                        if (aVar.q) {
                            cameraCaptureSession.capture(aVar.c(cameraCaptureSession.getDevice()), aVar.new C0440a(true), handler);
                        } else {
                            cameraCaptureSession.setRepeatingRequest(aVar.c(cameraCaptureSession.getDevice()), this, handler);
                        }
                        aVar.p = false;
                    } catch (Exception e2) {
                        L.f("Camera2Api", "failed to stop/start capture session", e2);
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                CameraDevice device = cameraCaptureSession.getDevice();
                a aVar = a.this;
                if (aVar.b(device)) {
                    return;
                }
                b.this.a.b("Camera2Api", "Capture failed, reason=" + captureFailure.getReason());
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                if (this.a) {
                    return;
                }
                a aVar = a.this;
                if (aVar.j != null) {
                    aVar.k = true;
                }
            }
        }

        /* compiled from: Camera2Api.kt */
        /* renamed from: com.vk.camera.sdk.impl.b$a$b, reason: collision with other inner class name */
        public static final class C0441b extends CameraDevice.StateCallback {
            public boolean a = true;
            public final /* synthetic */ b c;
            public final /* synthetic */ jhu0.d d;

            public C0441b(b bVar, jhu0.d dVar) {
                this.c = bVar;
                this.d = dVar;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onClosed(CameraDevice cameraDevice) {
                a aVar = a.this;
                b bVar = b.this;
                Runnable runnable = aVar.w;
                if (runnable != null) {
                    runnable.run();
                }
                bVar.d.open();
                bVar.a.d("Camera2Api", "Camera2 closed");
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onDisconnected(CameraDevice cameraDevice) {
                if (this.a) {
                    a.this.b(cameraDevice);
                    this.a = false;
                }
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onError(CameraDevice cameraDevice, int i) {
                if (!this.a) {
                    this.c.a.b("Camera2Api", "Error has occurred after camera's opening: " + i);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                a aVar = a.this;
                sb.append(aVar);
                sb.append(".handleError, CameraDevice@");
                sb.append(cameraDevice.hashCode());
                sb.append(", e=");
                sb.append(i);
                CameraException.Error error = new CameraException.Error(sb.toString());
                b.this.b.a(error);
                if (!aVar.b(cameraDevice)) {
                    L.f("Camera2Api", "Camera error: " + i, error);
                }
                this.d.b(null);
                this.a = false;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public final void onOpened(CameraDevice cameraDevice) {
                if (this.a) {
                    a aVar = a.this;
                    if (!aVar.b(cameraDevice)) {
                        aVar.m = cameraDevice;
                        aVar.g();
                    }
                    b bVar = this.c;
                    bVar.a.d("Camera2Api", "Camera2 opened");
                    this.d.b(bVar);
                    this.a = false;
                }
            }
        }

        /* compiled from: Camera2Api.kt */
        public static final class c extends CameraCaptureSession.StateCallback {
            public c() {
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                CameraDevice device = cameraCaptureSession.getDevice();
                a aVar = a.this;
                if (aVar.b(device)) {
                    return;
                }
                b.this.a.b("Camera2Api", "failed to configure camera session");
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                CameraDevice device = cameraCaptureSession.getDevice();
                a aVar = a.this;
                if (aVar.b(device) || aVar.b.size() == 0) {
                    return;
                }
                try {
                    aVar.r = null;
                    cameraCaptureSession.setRepeatingRequest(aVar.c(cameraCaptureSession.getDevice()), aVar.new C0440a(false), aVar.e);
                    aVar.p = false;
                } catch (Exception e) {
                    L.f("Camera2Api", "failed to create capture session request", e);
                }
            }
        }

        public a(int i, Looper looper) throws CameraException {
            int[] iArr;
            new Size(0, 0);
            this.l = new Pair<>(30, 30);
            c.b bVar = b.this.q.get(i);
            if (bVar == null) {
                throw new CameraException.Error(lhg.a(i, "Failed to find the camera2 with id="));
            }
            CameraCharacteristics cameraCharacteristics = bVar.d;
            this.c = cameraCharacteristics;
            Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            this.v = booleanValue;
            if (!booleanValue) {
                b.this.a.e("Camera2Api", "Flash is not supported");
            }
            this.d = new SparseArray<>();
            try {
                iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_EFFECTS);
            } catch (Throwable th) {
                L.f("Camera2Api", "Failed to populate available color effects for camera: " + this.c, new CameraException.Error(th));
            }
            if (iArr != null) {
                for (int i2 : iArr) {
                    switch (i2) {
                        case 0:
                            this.d.put(i2, "off");
                            this.s = Integer.valueOf(i2);
                            continue;
                        case 1:
                            this.d.put(i2, "mono");
                            continue;
                        case 2:
                            this.d.put(i2, "negative");
                            continue;
                        case 3:
                            this.d.put(i2, "solarize");
                            continue;
                        case 4:
                            this.d.put(i2, "sepia");
                            continue;
                        case 5:
                            this.d.put(i2, "posterize");
                            continue;
                        case 6:
                            this.d.put(i2, "whiteboard");
                            continue;
                        case 7:
                            this.d.put(i2, "blackboard");
                            continue;
                        case 8:
                            this.d.put(i2, "aqua");
                            continue;
                        default:
                            this.d.put(i2, "effect_" + i2);
                            continue;
                    }
                    L.f("Camera2Api", "Failed to populate available color effects for camera: " + this.c, new CameraException.Error(th));
                }
            }
            this.e = new Handler(looper);
            this.x = new byte[0];
            this.y = new byte[0];
            this.z = new byte[0];
        }

        public final byte[] a(Image image) {
            int i;
            int width = image.getWidth();
            int height = image.getHeight();
            int i2 = width * height;
            int a = fb20.a(i2, 4, 2, i2);
            if (a != this.x.length) {
                this.x = new byte[a];
            }
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
            ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
            int rowStride = image.getPlanes()[0].getRowStride();
            image.getPlanes()[0].getPixelStride();
            if (rowStride == width) {
                buffer.get(this.x, 0, i2);
                i = i2;
            } else {
                long j = rowStride;
                long j2 = -j;
                i = 0;
                while (i < i2) {
                    j2 += j;
                    buffer.position((int) j2);
                    buffer.get(this.x, i, width);
                    i += width;
                }
            }
            int rowStride2 = image.getPlanes()[2].getRowStride();
            int pixelStride = image.getPlanes()[2].getPixelStride();
            image.getPlanes()[1].getRowStride();
            image.getPlanes()[1].getPixelStride();
            if (pixelStride == 2 && rowStride2 == width && buffer2.get(0) == buffer3.get(1)) {
                byte b = buffer3.get(1);
                byte b2 = (byte) (~b);
                try {
                    buffer3.put(1, b2);
                    if (buffer2.get(0) == b2) {
                        buffer3.put(1, b);
                        buffer3.position(0);
                        buffer2.position(0);
                        buffer3.get(this.x, i2, 1);
                        buffer2.get(this.x, i2 + 1, buffer2.remaining());
                        return this.x;
                    }
                } catch (ReadOnlyBufferException e) {
                    L.f("Camera2Api", "failed to convert yuv420_888 to nv21", e);
                }
                buffer3.put(1, b);
            }
            if (buffer2.limit() != this.z.length) {
                this.z = new byte[buffer2.limit()];
            }
            if (buffer3.limit() != this.y.length) {
                this.y = new byte[buffer3.limit()];
            }
            buffer3.get(this.y, 0, buffer3.limit());
            buffer2.get(this.z, 0, buffer2.limit());
            int i3 = height / 2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = width / 2;
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = (i4 * rowStride2) + (i6 * pixelStride);
                    byte[] bArr = this.x;
                    int i8 = i + 1;
                    bArr[i] = this.y[i7];
                    i += 2;
                    bArr[i8] = this.z[i7];
                }
            }
            return this.x;
        }

        public final boolean b(CameraDevice cameraDevice) {
            if (!this.a.get()) {
                return false;
            }
            if (cameraDevice == null) {
                return true;
            }
            try {
                cameraDevice.close();
                return true;
            } catch (Throwable th) {
                CameraException.CloseFailed closeFailed = new CameraException.CloseFailed(th);
                L.f("Camera2Api", "failed to close camera", closeFailed);
                b.this.b.a(closeFailed);
                return true;
            }
        }

        public final CaptureRequest c(CameraDevice cameraDevice) throws CameraAccessException {
            Surface surface;
            CaptureRequest.Builder builder;
            Surface surface2;
            CaptureRequest.Builder builder2;
            CaptureRequest.Builder builder3;
            if (this.r == null) {
                this.r = cameraDevice.createCaptureRequest(1);
                for (Surface surface3 : this.b.values()) {
                    CaptureRequest.Builder builder4 = this.r;
                    if (builder4 != null) {
                        builder4.addTarget(surface3);
                    }
                }
                CaptureRequest.Builder builder5 = this.r;
                if (builder5 != null) {
                    builder5.set(CaptureRequest.CONTROL_AF_MODE, 4);
                }
                boolean z = b.this.m;
                b.this.m = z;
                CaptureRequest.Builder builder6 = this.r;
                if (builder6 != null) {
                    builder6.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(z ? 1 : 0));
                }
                Integer num = this.s;
                if (num != null && (builder3 = this.r) != null) {
                    builder3.set(CaptureRequest.CONTROL_EFFECT_MODE, num);
                }
                CaptureRequest.Builder builder7 = this.r;
                if (builder7 != null) {
                    builder7.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(this.l.i(), this.l.j()));
                }
                CaptureRequest.Builder builder8 = this.r;
                if (builder8 != null) {
                    CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                    int i = this.t;
                    if (i == null) {
                        i = 0;
                    }
                    builder8.set(key, i);
                }
            }
            if (this.n) {
                ImageReader imageReader = this.f;
                if (imageReader != null && (surface2 = imageReader.getSurface()) != null && (builder2 = this.r) != null) {
                    builder2.addTarget(surface2);
                }
            } else {
                ImageReader imageReader2 = this.f;
                if (imageReader2 != null && (surface = imageReader2.getSurface()) != null && (builder = this.r) != null) {
                    builder.removeTarget(surface);
                }
            }
            return this.r.build();
        }

        public final ArrayList d() {
            SparseArray<String> sparseArray = this.d;
            if (sparseArray.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(sparseArray.size());
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(sparseArray.valueAt(i));
            }
            return arrayList;
        }

        public final boolean e() {
            Integer num = (Integer) this.c.get(CameraCharacteristics.LENS_FACING);
            return num != null && num.intValue() == 0;
        }

        @SuppressLint({"MissingPermission"})
        public final void f(int i, jhu0.d dVar) {
            b.this.n = i;
            b.this.h.openCamera(String.valueOf(i), new C0441b(b.this, dVar), this.e);
        }

        public final void g() {
            HashMap<SurfaceTexture, Surface> hashMap = this.b;
            try {
                ArrayList arrayList = new ArrayList(hashMap.size());
                if (!hashMap.isEmpty()) {
                    arrayList.addAll(hashMap.values());
                }
                ImageReader imageReader = this.f;
                if (imageReader != null) {
                    arrayList.add(imageReader.getSurface());
                }
                this.m.createCaptureSession(arrayList, new c(), this.e);
                this.o = false;
            } catch (Throwable th) {
                b.this.b.a(new CameraException.CaptureFailed(th));
            }
        }

        public final void h(jhu0.c cVar, jja0 jja0Var) {
            boolean z = (cVar == null && jja0Var == null) ? false : true;
            if (z != ((this.h == null && this.j == null) ? false : true)) {
                this.n = z;
                this.p = true;
            }
            if (jja0Var != null) {
                this.q = true;
                this.p = true;
            }
            this.h = cVar;
            this.j = jja0Var;
        }
    }

    /* compiled from: Camera2Api.kt */
    /* renamed from: com.vk.camera.sdk.impl.b$b, reason: collision with other inner class name */
    public final class RunnableC0442b implements Runnable {
        public final AtomicBoolean b = new AtomicBoolean();
        public boolean c;
        public int d;
        public jhu0.d e;

        public RunnableC0442b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.compareAndSet(false, true)) {
                b bVar = b.this;
                if (epx.f(bVar.l, this)) {
                    bVar.g.removeMessages(4);
                    bVar.l = null;
                    if (this.c) {
                        bVar.y(this.d, this.e);
                    }
                }
            }
        }
    }

    public b(Context context, ij9.a aVar, ij9.b bVar) throws CameraException {
        this.a = aVar;
        this.b = bVar;
        CameraManager cameraManager = (CameraManager) context.getSystemService(SignalingProtocol.KEY_CAMERA);
        this.h = cameraManager;
        this.n = -1;
        this.q = new SparseArray<>();
        try {
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                int length = cameraIdList.length;
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= length) {
                        break;
                    }
                    String str = cameraIdList[i];
                    CameraCharacteristics cameraCharacteristics = this.h.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() != 1) {
                        z = false;
                    }
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    if (num2 != null && num2.intValue() != 2) {
                        if (num != null) {
                            this.q.put(Integer.parseInt(str), new c.b(cameraCharacteristics));
                        }
                        if (z && this.o == null) {
                            this.o = Integer.valueOf(Integer.parseInt(str));
                        } else if (!z && this.p == null) {
                            this.p = Integer.valueOf(Integer.parseInt(str));
                        }
                    }
                    i++;
                }
                if (this.o == null || this.p == null) {
                    throw new CameraException.IdFailed("failed to get cameraId: backId=" + this.o + ", frontId=" + this.p);
                }
                HandlerThread handlerThread = new HandlerThread("Camera2Api", -2);
                handlerThread.start();
                this.g = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: xsna.fe9
                    /* JADX WARN: Removed duplicated region for block: B:182:0x0395  */
                    /* JADX WARN: Removed duplicated region for block: B:185:0x03a5  */
                    /* JADX WARN: Removed duplicated region for block: B:189:0x039e  */
                    /* JADX WARN: Type inference failed for: r11v1 */
                    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r11v37 */
                    @Override // android.os.Handler.Callback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final boolean handleMessage(Message message) {
                        final b.a aVar2;
                        int i2;
                        int width;
                        int height;
                        Rect rect;
                        CaptureRequest.Builder builder;
                        Rect rect2;
                        CaptureRequest.Builder builder2;
                        CaptureRequest.Builder builder3;
                        Surface remove;
                        com.vk.camera.sdk.impl.b bVar2 = com.vk.camera.sdk.impl.b.this;
                        bVar2.a.d("Camera2Api", "camera message: " + message.what);
                        int i3 = message.what;
                        if (i3 == 1) {
                            int i4 = message.arg1;
                            jhu0.d dVar = (jhu0.d) message.obj;
                            b.RunnableC0442b runnableC0442b = bVar2.l;
                            if (runnableC0442b != null) {
                                runnableC0442b.d = i4;
                                runnableC0442b.e = dVar;
                                runnableC0442b.c = true;
                            } else {
                                synchronized (bVar2.e) {
                                    if (bVar2.i != null) {
                                        bVar2.i.e();
                                        bVar2.x();
                                        b.RunnableC0442b runnableC0442b2 = bVar2.l;
                                        if (runnableC0442b2 != null) {
                                            runnableC0442b2.d = i4;
                                            runnableC0442b2.e = dVar;
                                            runnableC0442b2.c = true;
                                        }
                                    }
                                    if (bVar2.i == null) {
                                        bVar2.z(i4, dVar);
                                    }
                                    s3q0 s3q0Var = s3q0.a;
                                }
                            }
                        } else {
                            if (i3 == 2) {
                                String str2 = (String) message.obj;
                                if (bVar2.i != null) {
                                    b.a aVar3 = bVar2.i;
                                    SparseArray<String> sparseArray = aVar3.d;
                                    int indexOfValue = sparseArray.indexOfValue(str2);
                                    if (indexOfValue >= 0) {
                                        aVar3.s = Integer.valueOf(sparseArray.keyAt(indexOfValue));
                                        CaptureRequest.Builder builder4 = aVar3.r;
                                        if (!Objects.equals(builder4 != null ? (Integer) builder4.get(CaptureRequest.CONTROL_EFFECT_MODE) : null, aVar3.s)) {
                                            CaptureRequest.Builder builder5 = aVar3.r;
                                            if (builder5 != null) {
                                                builder5.set(CaptureRequest.CONTROL_EFFECT_MODE, aVar3.s);
                                            }
                                            aVar3.p = true;
                                        }
                                    }
                                    b.a aVar4 = bVar2.i;
                                    Integer num3 = aVar4.s;
                                    if (num3 != null) {
                                        aVar4.d.get(num3.intValue());
                                    }
                                }
                            } else {
                                int i5 = 0;
                                if (i3 == 3) {
                                    b.RunnableC0442b runnableC0442b3 = bVar2.l;
                                    if (runnableC0442b3 != null) {
                                        runnableC0442b3.c = false;
                                    }
                                    synchronized (bVar2.e) {
                                        bVar2.x();
                                        s3q0 s3q0Var2 = s3q0.a;
                                    }
                                } else if (i3 == 4) {
                                    if (bVar2.i != null) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    b.RunnableC0442b runnableC0442b4 = bVar2.l;
                                    if (runnableC0442b4 == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    bVar2.l = null;
                                    if (runnableC0442b4.c) {
                                        bVar2.y(runnableC0442b4.d, runnableC0442b4.e);
                                    }
                                } else if (i3 == 5) {
                                    List list = (List) message.obj;
                                    boolean z2 = message.arg1 != 0;
                                    if (bVar2.i != null) {
                                        if (z2) {
                                            b.a aVar5 = bVar2.i;
                                            HashMap<SurfaceTexture, Surface> hashMap = aVar5.b;
                                            int size = list.size();
                                            while (i5 < size) {
                                                SurfaceTexture surfaceTexture = (SurfaceTexture) list.get(i5);
                                                if (surfaceTexture != null && !hashMap.containsKey(surfaceTexture)) {
                                                    surfaceTexture.setDefaultBufferSize(aVar5.g.getWidth(), aVar5.g.getHeight());
                                                    hashMap.put(surfaceTexture, new Surface(surfaceTexture));
                                                    aVar5.o = true;
                                                    aVar5.g();
                                                }
                                                i5++;
                                            }
                                        } else {
                                            b.a aVar6 = bVar2.i;
                                            aVar6.getClass();
                                            int size2 = list.size();
                                            while (i5 < size2) {
                                                SurfaceTexture surfaceTexture2 = (SurfaceTexture) list.get(i5);
                                                if (surfaceTexture2 != null && (remove = aVar6.b.remove(surfaceTexture2)) != null) {
                                                    remove.release();
                                                    aVar6.o = true;
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                } else if (i3 == 6) {
                                    tj9 tj9Var = (tj9) ((sj9) message.obj);
                                    ol9 ol9Var = tj9Var.b;
                                    if (ol9Var != null && (aVar2 = bVar2.i) != null) {
                                        ?? r11 = ol9Var.h == 1 ? 1 : 0;
                                        com.vk.camera.sdk.impl.b.this.m = r11;
                                        CaptureRequest.Builder builder6 = aVar2.r;
                                        if (builder6 != null) {
                                            builder6.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf((int) r11));
                                        }
                                        int[] iArr = ol9Var.d;
                                        if (iArr == null || iArr[0] == 0 || iArr[1] == 0) {
                                            i2 = 4;
                                        } else {
                                            if ((aVar2.l.i().intValue() == iArr[0] && aVar2.l.j().intValue() == iArr[1]) || (builder3 = aVar2.r) == null) {
                                                i2 = 4;
                                            } else {
                                                i2 = 4;
                                                builder3.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
                                                aVar2.p = true;
                                            }
                                            aVar2.l = new Pair<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                                        }
                                        Size i6 = tj9Var.i();
                                        if (i6 != null && !i6.equals(new Size(0, 0)) && epx.f(aVar2.g, new Size(0, 0))) {
                                            aVar2.g = i6;
                                            ImageReader imageReader = aVar2.f;
                                            if (imageReader != null) {
                                                imageReader.close();
                                            }
                                            ImageReader newInstance = ImageReader.newInstance(CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES, 35, 2);
                                            aVar2.f = newInstance;
                                            if (newInstance != null) {
                                                newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: xsna.ge9
                                                    @Override // android.media.ImageReader.OnImageAvailableListener
                                                    public final void onImageAvailable(ImageReader imageReader2) {
                                                        b.a aVar7 = b.a.this;
                                                        com.vk.camera.sdk.impl.b bVar3 = com.vk.camera.sdk.impl.b.this;
                                                        Image acquireLatestImage = imageReader2.acquireLatestImage();
                                                        if (acquireLatestImage != null) {
                                                            try {
                                                                if (aVar7.h == null) {
                                                                    if (aVar7.j != null) {
                                                                    }
                                                                }
                                                                byte[] a2 = aVar7.a(acquireLatestImage);
                                                                jhu0.c cVar = aVar7.h;
                                                                if (cVar != null) {
                                                                    cVar.f(a2);
                                                                }
                                                                if (aVar7.j != null && aVar7.k) {
                                                                    aVar7.k = false;
                                                                    aVar7.h(aVar7.h, null);
                                                                }
                                                            } catch (Throwable th) {
                                                                try {
                                                                    bVar3.b.a(new CameraException.JpegFailed("Conversion exception, format: " + acquireLatestImage.getFormat(), th));
                                                                } finally {
                                                                    acquireLatestImage.close();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }, aVar2.e);
                                            }
                                            aVar2.o = true;
                                        }
                                        List<sj9.a> list2 = ol9Var.e;
                                        if (list2 != null && !list2.isEmpty() && (rect2 = (Rect) aVar2.c.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) != null) {
                                            sj9.a aVar7 = list2.get(0);
                                            double centerY = 1.0d - ((1000 - aVar7.a.centerY()) / 2000.0d);
                                            int centerX = (int) ((1.0d - ((1000 - aVar7.a.centerX()) / 2000.0d)) * rect2.width());
                                            int i7 = centerX < 0 ? 0 : centerX;
                                            int height2 = (int) (rect2.height() * centerY);
                                            MeteringRectangle meteringRectangle = new MeteringRectangle(i7, height2 < 0 ? 0 : height2, 300, 300, 1000);
                                            ol9Var.e = null;
                                            Integer num4 = (Integer) aVar2.c.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                                            if (num4 != null && num4.intValue() >= 1 && (builder2 = aVar2.r) != null) {
                                                builder2.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
                                            }
                                            Integer num5 = (Integer) aVar2.c.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                                            if (num5 != null && num5.intValue() >= 1) {
                                                CaptureRequest.Builder builder7 = aVar2.r;
                                                if (builder7 != null) {
                                                    builder7.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
                                                }
                                                CaptureRequest.Builder builder8 = aVar2.r;
                                                if (builder8 != null) {
                                                    builder8.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i2));
                                                }
                                            }
                                            aVar2.p = true;
                                            jhu0.a aVar8 = aVar2.i;
                                            if (aVar8 != null) {
                                                aVar8.a(true);
                                            }
                                        }
                                        int i8 = ol9Var.f;
                                        CameraCharacteristics cameraCharacteristics2 = aVar2.c;
                                        double d = i8 / 10;
                                        if (Math.abs(d - aVar2.u) >= 1.0E-4d) {
                                            aVar2.u = d;
                                            if (aVar2.r != null) {
                                                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
                                                double floatValue = d / ((Float) cameraCharacteristics2.get(key)).floatValue();
                                                Rect rect3 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                                                if (rect3 != null) {
                                                    double d2 = 1;
                                                    double floatValue2 = 0.5d / ((floatValue * (((Float) cameraCharacteristics2.get(key)) != null ? r0.floatValue() : 1.0f)) + ((d2 - floatValue) * d2));
                                                    if (floatValue2 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE && rect3.centerX() >= (width = (int) (rect3.width() * floatValue2)) && rect3.centerY() >= (height = (int) (rect3.height() * floatValue2))) {
                                                        rect = new Rect(rect3.centerX() - width, rect3.centerY() - height, rect3.centerX() + width, rect3.centerY() + height);
                                                        builder = aVar2.r;
                                                        if (!Objects.equals(builder == null ? (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION) : null, rect)) {
                                                            CaptureRequest.Builder builder9 = aVar2.r;
                                                            if (builder9 != null) {
                                                                builder9.set(CaptureRequest.SCALER_CROP_REGION, rect);
                                                            }
                                                            aVar2.p = true;
                                                        }
                                                    }
                                                }
                                                rect = null;
                                                builder = aVar2.r;
                                                if (!Objects.equals(builder == null ? (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION) : null, rect)) {
                                                }
                                            }
                                        }
                                        aVar2.t = !epx.f(ol9Var.g, "off") ? 2 : 0;
                                        CaptureRequest.Builder builder10 = aVar2.r;
                                        if (!Objects.equals(builder10 != null ? (Integer) builder10.get(CaptureRequest.FLASH_MODE) : null, aVar2.t)) {
                                            CaptureRequest.Builder builder11 = aVar2.r;
                                            if (builder11 != null) {
                                                builder11.set(CaptureRequest.FLASH_MODE, aVar2.t);
                                            }
                                            aVar2.p = true;
                                        }
                                    }
                                } else if (i3 == 7) {
                                    int i9 = message.arg1;
                                    jhu0.d dVar2 = (jhu0.d) message.obj;
                                    bVar2.a.a("Camera2Api", "open async, ex camera: " + bVar2.i);
                                    if (bVar2.i != null) {
                                        bVar2.x();
                                        bVar2.g.obtainMessage(7, i9, i9, dVar2).sendToTarget();
                                    } else {
                                        bVar2.z(i9, dVar2);
                                    }
                                } else if (i3 == 8) {
                                    jhu0.c cVar = (jhu0.c) message.obj;
                                    b.a aVar9 = bVar2.i;
                                    if (aVar9 != null) {
                                        aVar9.h(cVar, aVar9.j);
                                    }
                                } else if (i3 == 9) {
                                    jja0 jja0Var = (jja0) message.obj;
                                    b.a aVar10 = bVar2.i;
                                    if (aVar10 != null) {
                                        aVar10.h(aVar10.h, jja0Var);
                                    }
                                } else {
                                    if (i3 != 10) {
                                        throw new CameraException.Error("invalid message id specifed=" + message.what);
                                    }
                                    jhu0.a aVar11 = (jhu0.a) message.obj;
                                    b.a aVar12 = bVar2.i;
                                    if (aVar12 != null) {
                                        aVar12.i = aVar11;
                                        if (aVar11 != null) {
                                            aVar11.a(true);
                                        }
                                    }
                                }
                            }
                        }
                        bVar2.c.open();
                        return true;
                    }
                });
                this.f = handlerThread;
                try {
                    this.a.c("Camera2Api", "Camera 2 initialized");
                } catch (CameraException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    throw new CameraException.Error(th);
                }
            } finally {
                if (0 == 0) {
                    HandlerThread handlerThread2 = this.f;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                    }
                    this.f = null;
                }
            }
        } catch (CameraException e2) {
            throw e2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // xsna.jhu0
    public final int a() {
        if (this.n == -1) {
            this.a.e("Camera2Api", "retrieved cam id which is \"no cam\": -1");
        }
        return this.n;
    }

    @Override // xsna.jhu0
    public final khu0 b() {
        if (this.i != null) {
            return n(this.n);
        }
        return null;
    }

    @Override // xsna.jhu0
    public final boolean c() {
        return true;
    }

    @Override // xsna.jhu0
    public final boolean d() {
        a aVar = this.i;
        if (aVar != null) {
            return aVar.e();
        }
        return false;
    }

    @Override // xsna.jhu0
    public final void e(sj9 sj9Var) {
        ConditionVariable conditionVariable = this.c;
        conditionVariable.close();
        this.g.obtainMessage(6, sj9Var).sendToTarget();
        conditionVariable.block();
    }

    @Override // xsna.jhu0
    public final void g() {
        this.g.obtainMessage(10, null).sendToTarget();
    }

    @Override // xsna.jhu0
    public final tj9 getParameters() {
        return this.j;
    }

    @Override // xsna.jhu0
    public final void h(SurfaceTexture surfaceTexture) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(surfaceTexture);
        this.g.obtainMessage(5, 1, 0, arrayList).sendToTarget();
    }

    @Override // xsna.jhu0
    public final void i(jhu0.a aVar) {
        this.g.obtainMessage(10, aVar).sendToTarget();
    }

    @Override // xsna.jhu0
    public final boolean j() {
        return this.q.size() > 1;
    }

    @Override // xsna.jhu0
    public final void k(int i, kk9.d dVar) {
        WeakReference<jhu0.d> weakReference;
        jhu0.d dVar2;
        this.a.d("Camera2Api", "open camera");
        if (this.i != null && (weakReference = this.k) != null && (dVar2 = weakReference.get()) != null) {
            dVar2.a();
        }
        c.b bVar = this.q.get(i);
        if (bVar != null) {
            this.j = new tj9(null, new ol9(bVar.d), 1);
        } else {
            this.b.a(new CameraException.IdWrong(tgw.b(i, "Wrong cameraId=", " requested")));
        }
        this.k = new WeakReference<>(dVar);
        this.g.removeCallbacksAndMessages(null);
        this.g.obtainMessage(7, i, i, dVar).sendToTarget();
    }

    @Override // xsna.jhu0
    public final void l() {
        kk9.b bVar = kk9.F;
    }

    @Override // xsna.jhu0
    public final boolean m() {
        return this.q.size() > 0;
    }

    @Override // xsna.jhu0
    public final khu0 n(int i) {
        return this.q.get(i);
    }

    @Override // xsna.jhu0
    public final boolean p() {
        a aVar = this.i;
        if (aVar != null) {
            return aVar.v;
        }
        return false;
    }

    @Override // xsna.jhu0
    public final Camera r() {
        this.a.b("Camera2Api", "Request for camera1 from camera2 api");
        return null;
    }

    @Override // xsna.jhu0
    public final void release(boolean z) {
        Handler handler = this.g;
        if (z) {
            handler.removeCallbacksAndMessages(null);
            handler.obtainMessage(3).sendToTarget();
            WeakReference<jhu0.d> weakReference = this.k;
            if (weakReference != null) {
                weakReference.clear();
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ConditionVariable conditionVariable = this.c;
        conditionVariable.close();
        ConditionVariable conditionVariable2 = this.d;
        conditionVariable2.close();
        handler.removeCallbacksAndMessages(null);
        handler.obtainMessage(3).sendToTarget();
        WeakReference<jhu0.d> weakReference2 = this.k;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        conditionVariable.block();
        conditionVariable2.block();
        this.a.a("Camera2Api", "camera release took " + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // xsna.jhu0
    public final Integer s() {
        return this.o;
    }

    @Override // xsna.jhu0
    public final Integer t() {
        return this.p;
    }

    @Override // xsna.jhu0
    public final void v(jhu0.c cVar) {
        this.g.obtainMessage(8, cVar).sendToTarget();
    }

    public final void x() {
        if (this.i == null) {
            this.d.open();
            return;
        }
        this.l = new RunnableC0442b();
        a aVar = this.i;
        this.i = null;
        if (aVar != null) {
            RunnableC0442b runnableC0442b = this.l;
            HashMap<SurfaceTexture, Surface> hashMap = aVar.b;
            aVar.w = runnableC0442b;
            boolean compareAndSet = aVar.a.compareAndSet(false, true);
            CameraDevice cameraDevice = aVar.m;
            if (cameraDevice != null) {
                b bVar = b.this;
                try {
                    cameraDevice.close();
                } catch (Throwable th) {
                    CameraException.CloseFailed closeFailed = new CameraException.CloseFailed(th);
                    L.f("Camera2Api", "failed to close camera", closeFailed);
                    bVar.b.a(closeFailed);
                }
                aVar.m = null;
            }
            if (compareAndSet) {
                Iterator<Surface> it = hashMap.values().iterator();
                while (it.hasNext()) {
                    it.next().release();
                }
                hashMap.clear();
                ImageReader imageReader = aVar.f;
                if (imageReader != null) {
                    imageReader.close();
                }
                aVar.g = new Size(0, 0);
            }
        }
    }

    public final void y(int i, jhu0.d dVar) {
        RunnableC0442b runnableC0442b = this.l;
        if (runnableC0442b != null) {
            runnableC0442b.d = i;
            runnableC0442b.e = dVar;
            runnableC0442b.c = true;
            return;
        }
        synchronized (this.e) {
            try {
                if (this.i == null && dVar != null) {
                    z(i, dVar);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, jhu0.d dVar) {
        try {
            if (this.i != null) {
                this.a.e("Camera2Api", "Camera is not released before opening");
            }
            a aVar = new a(i, Looper.myLooper());
            aVar.f(i, dVar);
            this.i = aVar;
            this.i.e();
            this.i.getClass();
            this.i.d();
            a aVar2 = this.i;
            Integer num = aVar2.s;
            if (num != null) {
                aVar2.d.get(num.intValue());
            }
        } catch (CameraException e) {
            this.b.a(e);
            dVar.b(null);
        } catch (Throwable th) {
            this.b.a(new CameraException.Error(th));
            dVar.b(null);
        }
    }

    @Override // xsna.jhu0
    public final void f() {
    }

    @Override // xsna.jhu0
    public final void q() {
    }

    @Override // xsna.jhu0
    public final void u() {
    }

    @Override // xsna.jhu0
    public final void o(int i) {
    }

    @Override // xsna.jhu0
    public final void w(byte[] bArr) {
    }
}
