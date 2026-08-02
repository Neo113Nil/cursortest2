package o5;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;
import sf.D;
import sf.x;
import xe.C10720e0;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC8643a {

    /* renamed from: o5.a$a, reason: collision with other inner class name */
    public static final class C1314a {

        /* renamed from: a, reason: collision with root package name */
        private D f77708a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private x f77709b = AbstractC9688n.f98744a;

        /* renamed from: c, reason: collision with root package name */
        private double f77710c = 0.02d;

        /* renamed from: d, reason: collision with root package name */
        private long f77711d = 10485760;

        /* renamed from: e, reason: collision with root package name */
        private long f77712e = 262144000;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private He.b f77713f;

        public C1314a() {
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.f77713f = He.b.f10879b;
        }

        @NotNull
        public final C8648f a() {
            long j11;
            D d11 = this.f77708a;
            if (d11 == null) {
                throw new IllegalStateException("directory == null");
            }
            double d12 = this.f77710c;
            if (d12 > 0.0d) {
                try {
                    File h11 = d11.h();
                    h11.mkdir();
                    StatFs statFs = new StatFs(h11.getAbsolutePath());
                    j11 = h.g((long) (d12 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f77711d, this.f77712e);
                } catch (Exception unused) {
                    j11 = this.f77711d;
                }
            } else {
                j11 = 0;
            }
            return new C8648f(j11, this.f77713f, this.f77709b, d11);
        }

        @NotNull
        public final void b(@NotNull File file) {
            String str = D.f98654b;
            this.f77708a = D.a.b(file);
        }
    }

    /* renamed from: o5.a$b */
    public interface b {
        void a();

        c b();

        @NotNull
        D getData();

        @NotNull
        D getMetadata();
    }

    /* renamed from: o5.a$c */
    public interface c extends Closeable {
        b K1();

        @NotNull
        D getData();

        @NotNull
        D getMetadata();
    }

    b a(@NotNull String str);

    c b(@NotNull String str);

    @NotNull
    AbstractC9688n c();
}
