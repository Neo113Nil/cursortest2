package x;

import android.hardware.camera2.params.OutputConfiguration;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes8.dex */
class j extends i {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        final OutputConfiguration f104651a;

        /* renamed from: b, reason: collision with root package name */
        long f104652b = 1;

        a(@NonNull OutputConfiguration outputConfiguration) {
            this.f104651a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f104651a, aVar.f104651a) && this.f104652b == aVar.f104652b;
        }

        public final int hashCode() {
            int hashCode = this.f104651a.hashCode() ^ 31;
            return Long.hashCode(this.f104652b) ^ ((hashCode << 5) - hashCode);
        }
    }

    @Override // x.i, x.l, x.g.a
    public String c() {
        return null;
    }

    @Override // x.i, x.l, x.g.a
    public void f(long j11) {
        ((a) this.f104653a).f104652b = j11;
    }

    @Override // x.i, x.l, x.g.a
    public void g(String str) {
        ((OutputConfiguration) i()).setPhysicalCameraId(str);
    }

    @Override // x.i, x.h, x.l, x.g.a
    @NonNull
    public Object i() {
        Object obj = this.f104653a;
        x2.i.b(obj instanceof a);
        return ((a) obj).f104651a;
    }
}
