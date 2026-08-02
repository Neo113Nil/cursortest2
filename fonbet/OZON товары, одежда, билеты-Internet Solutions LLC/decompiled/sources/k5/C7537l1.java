package k5;

import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: k5.l1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7537l1 implements InterfaceC7517g1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue<Object> f70775a = new LinkedBlockingQueue<>(UserVerificationMethods.USER_VERIFY_NONE);

    /* renamed from: k5.l1$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f70776a;

        /* renamed from: b, reason: collision with root package name */
        private final Mm0.f f70777b;

        /* renamed from: c, reason: collision with root package name */
        private final String f70778c;

        /* renamed from: d, reason: collision with root package name */
        private final int f70779d;

        a(long j11, Mm0.f fVar, String str, int i11) {
            this.f70776a = j11;
            this.f70777b = fVar;
            this.f70778c = str;
            this.f70779d = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f70776a == aVar.f70776a && this.f70779d == aVar.f70779d && this.f70777b == aVar.f70777b && this.f70778c.equals(aVar.f70778c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f70776a), this.f70777b, this.f70778c, Integer.valueOf(this.f70779d));
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Event{time=");
            sb2.append(this.f70776a);
            sb2.append(", priority=");
            sb2.append(this.f70777b);
            sb2.append(", message='");
            sb2.append(this.f70778c);
            sb2.append("', code=");
            return Ek.a.d(sb2, this.f70779d, '}');
        }
    }

    public final void a() {
        this.f70775a.clear();
    }

    public final void b(@NonNull Mm0.f fVar, @NonNull String str, int i11) {
        a aVar = new a(System.currentTimeMillis(), fVar, str, i11);
        LinkedBlockingQueue<Object> linkedBlockingQueue = this.f70775a;
        if (linkedBlockingQueue.size() >= 496) {
            linkedBlockingQueue.remove();
        }
        linkedBlockingQueue.add(aVar);
    }

    @NonNull
    public final String toString() {
        return "Events: " + this.f70775a;
    }
}
