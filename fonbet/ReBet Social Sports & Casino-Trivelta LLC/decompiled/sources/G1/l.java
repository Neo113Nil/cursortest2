package G1;

import F1.y;
import G1.d;
import G1.m;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class l extends GLSurfaceView {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f3825m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f3826a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f3827b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f3828c;

    /* renamed from: d, reason: collision with root package name */
    public final d f3829d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f3830e;

    /* renamed from: f, reason: collision with root package name */
    public final m f3831f;

    /* renamed from: g, reason: collision with root package name */
    public final i f3832g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceTexture f3833h;

    /* renamed from: i, reason: collision with root package name */
    public Surface f3834i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3835j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3836k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3837l;

    public final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* renamed from: a, reason: collision with root package name */
        public final i f3838a;

        /* renamed from: b, reason: collision with root package name */
        public float f3839b;

        /* renamed from: c, reason: collision with root package name */
        public float f3840c;
        private final float[] deviceOrientationMatrix;
        private final float[] touchPitchMatrix;
        private final float[] touchYawMatrix;
        private final float[] projectionMatrix = new float[16];
        private final float[] viewProjectionMatrix = new float[16];
        private final float[] viewMatrix = new float[16];
        private final float[] tempMatrix = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.deviceOrientationMatrix = fArr;
            float[] fArr2 = new float[16];
            this.touchPitchMatrix = fArr2;
            float[] fArr3 = new float[16];
            this.touchYawMatrix = fArr3;
            this.f3838a = iVar;
            AbstractC4151s.T(fArr);
            AbstractC4151s.T(fArr2);
            AbstractC4151s.T(fArr3);
            this.f3840c = 3.1415927f;
        }

        @Override // G1.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.deviceOrientationMatrix;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f3840c = -f10;
            d();
        }

        @Override // G1.m.a
        public synchronized void b(PointF pointF) {
            this.f3839b = pointF.y;
            d();
            Matrix.setRotateM(this.touchYawMatrix, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        public final void d() {
            Matrix.setRotateM(this.touchPitchMatrix, 0, -this.f3839b, (float) Math.cos(this.f3840c), (float) Math.sin(this.f3840c), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.tempMatrix, 0, this.deviceOrientationMatrix, 0, this.touchYawMatrix, 0);
                Matrix.multiplyMM(this.viewMatrix, 0, this.touchPitchMatrix, 0, this.tempMatrix, 0);
            }
            Matrix.multiplyMM(this.viewProjectionMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
            this.f3838a.c(this.viewProjectionMatrix, false);
        }

        @Override // G1.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.projectionMatrix, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.f3838a.f());
        }
    }

    public interface b {
        void C(Surface surface);

        void E(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar) {
        Surface surface = lVar.f3834i;
        if (surface != null) {
            Iterator it = lVar.f3826a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).C(surface);
            }
        }
        f(lVar.f3833h, surface);
        lVar.f3833h = null;
        lVar.f3834i = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.f3833h;
        Surface surface = lVar.f3834i;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.f3833h = surfaceTexture;
        lVar.f3834i = surface2;
        Iterator it = lVar.f3826a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).E(surface2);
        }
        f(surfaceTexture2, surface);
    }

    public static void f(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public void d(b bVar) {
        this.f3826a.add(bVar);
    }

    public final void e(final SurfaceTexture surfaceTexture) {
        this.f3830e.post(new Runnable() { // from class: G1.k
            @Override // java.lang.Runnable
            public final void run() {
                l.b(l.this, surfaceTexture);
            }
        });
    }

    public void g(b bVar) {
        this.f3826a.remove(bVar);
    }

    public G1.a getCameraMotionListener() {
        return this.f3832g;
    }

    public y getVideoFrameMetadataListener() {
        return this.f3832g;
    }

    public Surface getVideoSurface() {
        return this.f3834i;
    }

    public final void h() {
        boolean z10 = this.f3835j && this.f3836k;
        Sensor sensor = this.f3828c;
        if (sensor == null || z10 == this.f3837l) {
            return;
        }
        if (z10) {
            this.f3827b.registerListener(this.f3829d, sensor, 0);
        } else {
            this.f3827b.unregisterListener(this.f3829d);
        }
        this.f3837l = z10;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3830e.post(new Runnable() { // from class: G1.j
            @Override // java.lang.Runnable
            public final void run() {
                l.a(l.this);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f3836k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f3836k = true;
        h();
    }

    public void setDefaultStereoMode(int i10) {
        this.f3832g.g(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f3835j = z10;
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3826a = new CopyOnWriteArrayList();
        this.f3830e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) AbstractC4134a.e(context.getSystemService("sensor"));
        this.f3827b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f3828c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f3832g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f3831f = mVar;
        this.f3829d = new d(((WindowManager) AbstractC4134a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f3835j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
