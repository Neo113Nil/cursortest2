package androidx.camera.view;

import android.annotation.SuppressLint;
import android.util.Rational;
import androidx.annotation.Nullable;
import androidx.camera.view.CameraView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.d4z;
import xsna.e5z;
import xsna.f5z;
import xsna.g8s0;
import xsna.lgd0;
import xsna.n3d0;
import xsna.o0t;
import xsna.r0t;
import xsna.ugw;
import xsna.x3o0;
import xsna.xo9;

/* compiled from: CameraXModule.java */
/* loaded from: classes11.dex */
public final class a {
    public final CameraView a;
    public CameraView.CaptureMode b;
    public long c;
    public long d;
    public int e;

    @Nullable
    public d4z f;

    @Nullable
    public Integer g;

    /* compiled from: CameraXModule.java */
    /* renamed from: androidx.camera.view.a$a, reason: collision with other inner class name */
    public class C0005a implements e5z {
        public C0005a() {
        }

        @o(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(f5z f5zVar) {
            if (f5zVar == null) {
                a.this.f = null;
            }
        }
    }

    /* compiled from: CameraXModule.java */
    public class b implements o0t<lgd0> {
        public b() {
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            throw new RuntimeException("CameraX failed to initialize.", th);
        }

        @Override // xsna.o0t
        @SuppressLint({"MissingPermission"})
        public final void onSuccess(@Nullable lgd0 lgd0Var) {
            lgd0Var.getClass();
        }
    }

    /* compiled from: CameraXModule.java */
    public final class c implements o0t<Void> {
        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            throw new RuntimeException(th);
        }

        @Override // xsna.o0t
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
        }
    }

    static {
        new Rational(16, 9);
        new Rational(4, 3);
        new Rational(9, 16);
        new Rational(3, 4);
    }

    public a(CameraView cameraView) {
        new AtomicBoolean(false);
        this.b = CameraView.CaptureMode.IMAGE;
        this.c = -1L;
        this.d = -1L;
        this.e = 2;
        new C0005a();
        this.g = 1;
        this.a = cameraView;
        r0t.a(lgd0.b(cameraView.getContext()), new b(), xo9.t());
        n3d0.b bVar = new n3d0.b();
        androidx.camera.core.impl.a aVar = x3o0.o;
        bVar.a.C(aVar, "Preview");
        new ugw.c().a.C(aVar, "ImageCapture");
        new g8s0.b().a.C(aVar, "VideoCapture");
    }

    public final void a() {
    }
}
