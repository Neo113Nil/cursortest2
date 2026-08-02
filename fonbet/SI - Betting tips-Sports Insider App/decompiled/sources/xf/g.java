package xf;

import java.io.InvalidObjectException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends e implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final f f25467i = new f(null);
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f25468c;

    /* renamed from: d, reason: collision with root package name */
    public int f25469d;

    /* renamed from: e, reason: collision with root package name */
    public int f25470e;

    /* renamed from: f, reason: collision with root package name */
    public int f25471f;

    /* renamed from: g, reason: collision with root package name */
    public int f25472g;

    /* renamed from: h, reason: collision with root package name */
    public int f25473h;

    private final Object readResolve() {
        try {
            a();
            return this;
        } catch (Throwable th2) {
            Throwable initCause = new InvalidObjectException(th2.getMessage()).initCause(th2);
            Intrinsics.checkNotNullExpressionValue(initCause, "initCause(...)");
            throw initCause;
        }
    }

    public final void a() {
        if ((this.f25468c | this.f25469d | this.f25470e | this.f25471f | this.f25472g) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }

    public final int b() {
        int i5 = this.f25468c;
        int i10 = i5 ^ (i5 >>> 2);
        this.f25468c = this.f25469d;
        this.f25469d = this.f25470e;
        this.f25470e = this.f25471f;
        int i11 = this.f25472g;
        this.f25471f = i11;
        int i12 = ((i10 ^ (i10 << 1)) ^ i11) ^ (i11 << 4);
        this.f25472g = i12;
        int i13 = this.f25473h + 362437;
        this.f25473h = i13;
        return i12 + i13;
    }
}
