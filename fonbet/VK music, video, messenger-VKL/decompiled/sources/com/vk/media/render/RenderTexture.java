package com.vk.media.render;

import android.graphics.SurfaceTexture;
import com.vk.log.L;
import com.vk.media.render.RenderBase;
import com.vk.media.render.RenderTexture;
import java.lang.ref.WeakReference;
import xsna.asp;
import xsna.g100;
import xsna.zrp;

/* compiled from: RenderTexture.kt */
/* loaded from: classes3.dex */
public final class RenderTexture {
    public final g100 a;
    public final Object b = new Object();
    public b c;
    public boolean d;
    public int e;
    public RenderBase.d f;

    /* compiled from: RenderTexture.kt */
    public interface Renderer extends a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RenderTexture.kt */
        public static final class Error {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Error[] $VALUES;
            public static final Error ERROR_EGL;
            public static final Error ERROR_FINALIZE_TEXTURE;

            static {
                Error error = new Error("ERROR_FINALIZE_TEXTURE", 0);
                ERROR_FINALIZE_TEXTURE = error;
                Error error2 = new Error("ERROR_EGL", 1);
                ERROR_EGL = error2;
                Error[] errorArr = {error, error2};
                $VALUES = errorArr;
                $ENTRIES = new asp(errorArr);
            }

            public Error() {
                throw null;
            }

            public static Error valueOf(String str) {
                return (Error) Enum.valueOf(Error.class, str);
            }

            public static Error[] values() {
                return (Error[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: RenderTexture.kt */
    public interface a {
        void g(Renderer.Error error, Throwable th);
    }

    /* compiled from: RenderTexture.kt */
    public final class b extends SurfaceTexture {
        public final WeakReference<Renderer> a;

        public b(int i, WeakReference<Renderer> weakReference) {
            super(i);
            this.a = weakReference;
        }

        @Override // android.graphics.SurfaceTexture
        public final void finalize() {
            super.finalize();
            RenderTexture renderTexture = RenderTexture.this;
            if (renderTexture.c != null) {
                g100 g100Var = renderTexture.a;
                String str = "finalize() call on " + renderTexture.c;
                L.r(L.LogType.w, "MEDIA_LOGGER", "RenderTexture_" + g100Var.a + ", " + Thread.currentThread().getName() + ", " + str);
                Renderer renderer = this.a.get();
                if (renderer != null) {
                    renderer.g(Renderer.Error.ERROR_FINALIZE_TEXTURE, null);
                }
            }
        }
    }

    public RenderTexture(g100 g100Var) {
        this.a = g100Var;
    }

    public final void a(int i) {
        this.a.a("RenderTexture", "create " + i);
        this.e = i;
        b bVar = new b(i, new WeakReference(this.f));
        this.c = bVar;
        bVar.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: xsna.ryf0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                RenderTexture renderTexture = RenderTexture.this;
                synchronized (renderTexture.b) {
                    try {
                        RenderTexture.b bVar2 = renderTexture.c;
                        if (bVar2 != null) {
                            renderTexture.d = true;
                            RenderBase.d dVar = renderTexture.f;
                            if (dVar != null) {
                                long timestamp = bVar2 != null ? bVar2.getTimestamp() : 0L;
                                syf0 syf0Var = (syf0) dVar.b;
                                if (syf0Var != null) {
                                    syf0Var.sendMessage(syf0Var.obtainMessage(4, (int) (timestamp >> 32), (int) timestamp));
                                }
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }
}
