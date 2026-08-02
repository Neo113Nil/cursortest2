package G1;

import F1.y;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.P;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements y, a {

    /* renamed from: g, reason: collision with root package name */
    public int f3818g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceTexture f3819h;
    private byte[] lastProjectionData;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3812a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3813b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f3814c = new g();

    /* renamed from: d, reason: collision with root package name */
    public final c f3815d = new c();

    /* renamed from: e, reason: collision with root package name */
    public final P f3816e = new P();

    /* renamed from: f, reason: collision with root package name */
    public final P f3817f = new P();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public volatile int f3820i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f3821j = -1;

    @Override // G1.a
    public void a(long j10, float[] fArr) {
        this.f3815d.e(j10, fArr);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            AbstractC4151s.d();
        } catch (AbstractC4151s.a e10) {
            AbstractC4156x.e("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f3812a.compareAndSet(true, false)) {
            ((SurfaceTexture) AbstractC4134a.e(this.f3819h)).updateTexImage();
            try {
                AbstractC4151s.d();
            } catch (AbstractC4151s.a e11) {
                AbstractC4156x.e("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f3813b.compareAndSet(true, false)) {
                AbstractC4151s.T(this.rotationMatrix);
            }
            long timestamp = this.f3819h.getTimestamp();
            Long l10 = (Long) this.f3816e.g(timestamp);
            if (l10 != null) {
                this.f3815d.c(this.rotationMatrix, l10.longValue());
            }
            e eVar = (e) this.f3817f.j(timestamp);
            if (eVar != null) {
                this.f3814c.d(eVar);
            }
        }
        Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.f3814c.a(this.f3818g, this.tempMatrix, z10);
    }

    @Override // G1.a
    public void d() {
        this.f3816e.c();
        this.f3815d.d();
        this.f3813b.set(true);
    }

    @Override // F1.y
    public void e(long j10, long j11, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        this.f3816e.a(j11, Long.valueOf(j10));
        h(aVar.projectionData, aVar.f20515C, j11);
    }

    public SurfaceTexture f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC4151s.d();
            this.f3814c.b();
            AbstractC4151s.d();
            this.f3818g = AbstractC4151s.m();
        } catch (AbstractC4151s.a e10) {
            AbstractC4156x.e("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f3818g);
        this.f3819h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: G1.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f3812a.set(true);
            }
        });
        return this.f3819h;
    }

    public void g(int i10) {
        this.f3820i = i10;
    }

    public final void h(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.lastProjectionData;
        int i11 = this.f3821j;
        this.lastProjectionData = bArr;
        if (i10 == -1) {
            i10 = this.f3820i;
        }
        this.f3821j = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        e a10 = bArr3 != null ? f.a(bArr3, this.f3821j) : null;
        if (a10 == null || !g.c(a10)) {
            a10 = e.b(this.f3821j);
        }
        this.f3817f.a(j10, a10);
    }
}
