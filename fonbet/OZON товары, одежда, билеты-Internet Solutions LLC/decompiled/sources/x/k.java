package x;

import android.hardware.camera2.params.OutputConfiguration;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class k extends j {
    @Override // x.j, x.i, x.l, x.g.a
    public final /* bridge */ /* synthetic */ String c() {
        return null;
    }

    @Override // x.l, x.g.a
    public final void e(long j11) {
        if (j11 == -1) {
            return;
        }
        ((OutputConfiguration) i()).setStreamUseCase(j11);
    }

    @Override // x.j, x.i, x.l, x.g.a
    public final void f(long j11) {
        ((OutputConfiguration) i()).setDynamicRangeProfile(j11);
    }

    @Override // x.l, x.g.a
    public final void h(int i11) {
        ((OutputConfiguration) i()).setMirrorMode(i11);
    }

    @Override // x.l
    public final int hashCode() {
        return this.f104653a.hashCode();
    }

    @Override // x.j, x.i, x.h, x.l, x.g.a
    @NonNull
    public final Object i() {
        Object obj = this.f104653a;
        x2.i.b(obj instanceof OutputConfiguration);
        return obj;
    }
}
