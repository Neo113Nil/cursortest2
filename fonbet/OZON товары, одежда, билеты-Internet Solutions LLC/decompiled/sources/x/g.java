package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.NonNull;
import x.i;
import x.j;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final i f104647a;

    interface a {
        Surface a();

        void b(@NonNull Surface surface);

        String c();

        void d();

        void e(long j11);

        void f(long j11);

        void g(String str);

        void h(int i11);

        Object i();
    }

    public g(int i11, @NonNull Surface surface) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            this.f104647a = new k(new OutputConfiguration(i11, surface));
        } else if (i12 >= 28) {
            this.f104647a = new j(new j.a(new OutputConfiguration(i11, surface)));
        } else {
            this.f104647a = new i(new i.a(new OutputConfiguration(i11, surface)));
        }
    }

    public static g j(OutputConfiguration outputConfiguration) {
        if (outputConfiguration == null) {
            return null;
        }
        int i11 = Build.VERSION.SDK_INT;
        return new g(i11 >= 33 ? new k(outputConfiguration) : i11 >= 28 ? new j(new j.a(outputConfiguration)) : new i(new i.a(outputConfiguration)));
    }

    public final void a(@NonNull Surface surface) {
        this.f104647a.b(surface);
    }

    public final void b() {
        this.f104647a.d();
    }

    public final String c() {
        return this.f104647a.c();
    }

    public final Surface d() {
        return this.f104647a.a();
    }

    public final void e(long j11) {
        this.f104647a.f(j11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f104647a.equals(((g) obj).f104647a);
    }

    public final void f(int i11) {
        this.f104647a.h(i11);
    }

    public final void g(String str) {
        this.f104647a.g(str);
    }

    public final void h(long j11) {
        this.f104647a.e(j11);
    }

    public final int hashCode() {
        return this.f104647a.hashCode();
    }

    public final Object i() {
        return this.f104647a.i();
    }

    public g(@NonNull OutputConfiguration outputConfiguration) {
        this.f104647a = new k(outputConfiguration);
    }

    private g(@NonNull i iVar) {
        this.f104647a = iVar;
    }
}
