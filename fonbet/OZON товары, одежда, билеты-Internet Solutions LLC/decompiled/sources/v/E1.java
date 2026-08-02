package v;

import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w.C10349b;

/* loaded from: classes8.dex */
public interface E1 {

    public interface a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f100916a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f100917b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f100918c;

        /* renamed from: d, reason: collision with root package name */
        private final Y0 f100919d;

        /* renamed from: e, reason: collision with root package name */
        private final androidx.camera.core.impl.I0 f100920e;

        /* renamed from: f, reason: collision with root package name */
        private final androidx.camera.core.impl.I0 f100921f;

        b(@NonNull Handler handler, @NonNull androidx.camera.core.impl.I0 i02, @NonNull androidx.camera.core.impl.I0 i03, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Y0 y02) {
            this.f100916a = executor;
            this.f100917b = scheduledExecutorService;
            this.f100918c = handler;
            this.f100919d = y02;
            this.f100920e = i02;
            this.f100921f = i03;
        }

        @NonNull
        final a a() {
            ScheduledExecutorService scheduledExecutorService = this.f100917b;
            Y0 y02 = this.f100919d;
            Executor executor = this.f100916a;
            return new O1(this.f100918c, this.f100920e, this.f100921f, executor, scheduledExecutorService, y02);
        }
    }

    public static abstract class c {
        void h(@NonNull E1 e12) {
        }

        void i(@NonNull E1 e12) {
        }

        public void j(@NonNull E1 e12) {
        }

        public void k(@NonNull E1 e12) {
        }

        void l(@NonNull E1 e12) {
        }

        void m(@NonNull E1 e12) {
        }

        void n(@NonNull E1 e12) {
        }

        void o(@NonNull E1 e12, @NonNull Surface surface) {
        }
    }

    void a() throws CameraAccessException;

    @NonNull
    c b();

    void c(int i11);

    void close();

    void d() throws CameraAccessException;

    @NonNull
    C10349b e();

    @NonNull
    com.google.common.util.concurrent.m<Void> f();

    void g();
}
