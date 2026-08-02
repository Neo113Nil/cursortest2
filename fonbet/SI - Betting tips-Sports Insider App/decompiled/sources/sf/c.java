package sf;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f23600c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23601a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23602b;

    static {
        b[] bVarArr = b.f23599a;
        new c(-1, true, false);
        new c(76, false, true);
        new c(64, false, true);
    }

    public c(int i5, boolean z5, boolean z7) {
        b[] bVarArr = b.f23599a;
        this.f23601a = z5;
        this.f23602b = z7;
        if (z5 && z7) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
