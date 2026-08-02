package v;

import C.r;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I;
import java.util.Objects;

/* loaded from: classes8.dex */
final class N0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.M f101035a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final androidx.lifecycle.V<C.r> f101036b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f101037a;

        static {
            int[] iArr = new int[I.a.values().length];
            f101037a = iArr;
            try {
                iArr[I.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101037a[I.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101037a[I.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101037a[I.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101037a[I.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101037a[I.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101037a[I.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101037a[I.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    N0(@NonNull androidx.camera.core.impl.M m11) {
        this.f101035a = m11;
        androidx.lifecycle.V<C.r> v11 = new androidx.lifecycle.V<>();
        this.f101036b = v11;
        v11.postValue(C.r.a(r.b.CLOSED));
    }

    @NonNull
    public final androidx.lifecycle.V a() {
        return this.f101036b;
    }

    public final void b(@NonNull I.a aVar, r.a aVar2) {
        C.r a11;
        switch (a.f101037a[aVar.ordinal()]) {
            case 1:
                if (!this.f101035a.c()) {
                    a11 = C.r.a(r.b.PENDING_OPEN);
                    break;
                } else {
                    a11 = C.r.a(r.b.OPENING);
                    break;
                }
            case 2:
                a11 = C.r.b(r.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                a11 = C.r.b(r.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                a11 = C.r.b(r.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                a11 = C.r.b(r.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C.S.a("CameraStateMachine", "New public camera state " + a11 + " from " + aVar + " and " + aVar2);
        androidx.lifecycle.V<C.r> v11 = this.f101036b;
        if (Objects.equals(v11.getValue(), a11)) {
            return;
        }
        C.S.a("CameraStateMachine", "Publishing new public camera state " + a11);
        v11.postValue(a11);
    }
}
