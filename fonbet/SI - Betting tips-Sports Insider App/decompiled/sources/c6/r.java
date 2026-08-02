package c6;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class r {

    /* renamed from: d, reason: collision with root package name */
    public static final r f3691d = new r(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3693b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f3694c;

    public r(boolean z5, String str, Exception exc) {
        this.f3692a = z5;
        this.f3693b = str;
        this.f3694c = exc;
    }

    public static r b(String str) {
        return new r(false, str, null);
    }

    public static r c(String str, Exception exc) {
        return new r(false, str, exc);
    }

    public String a() {
        return this.f3693b;
    }
}
