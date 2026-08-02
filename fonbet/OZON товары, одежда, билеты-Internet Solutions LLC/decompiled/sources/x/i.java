package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes8.dex */
class i extends h {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        final OutputConfiguration f104648a;

        /* renamed from: b, reason: collision with root package name */
        String f104649b;

        /* renamed from: c, reason: collision with root package name */
        long f104650c = 1;

        a(@NonNull OutputConfiguration outputConfiguration) {
            this.f104648a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f104648a, aVar.f104648a) && this.f104650c == aVar.f104650c && Objects.equals(this.f104649b, aVar.f104649b);
        }

        public final int hashCode() {
            int hashCode = this.f104648a.hashCode() ^ 31;
            int i11 = (hashCode << 5) - hashCode;
            String str = this.f104649b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f104650c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    @Override // x.l, x.g.a
    public void b(@NonNull Surface surface) {
        ((OutputConfiguration) i()).addSurface(surface);
    }

    @Override // x.l, x.g.a
    public String c() {
        return ((a) this.f104653a).f104649b;
    }

    @Override // x.l, x.g.a
    public void d() {
        ((OutputConfiguration) i()).enableSurfaceSharing();
    }

    @Override // x.l, x.g.a
    public void f(long j11) {
        ((a) this.f104653a).f104650c = j11;
    }

    @Override // x.l, x.g.a
    public void g(String str) {
        ((a) this.f104653a).f104649b = str;
    }

    @Override // x.h, x.l, x.g.a
    @NonNull
    public Object i() {
        Object obj = this.f104653a;
        x2.i.b(obj instanceof a);
        return ((a) obj).f104648a;
    }

    @Override // x.l
    final boolean j() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
