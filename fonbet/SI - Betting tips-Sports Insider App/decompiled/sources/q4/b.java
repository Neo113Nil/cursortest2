package q4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f21930c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f21931d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f21932e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21933a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21934b;

    static {
        b bVar = new b(true, true, "ENABLED", 0);
        f21930c = bVar;
        b bVar2 = new b(true, false, "READ_ONLY", 1);
        b bVar3 = new b(false, true, "WRITE_ONLY", 2);
        b bVar4 = new b(false, false, "DISABLED", 3);
        f21931d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f21932e = bVarArr;
        com.google.android.play.core.appupdate.b.l(bVarArr);
    }

    public b(boolean z5, boolean z7, String str, int i5) {
        this.f21933a = z5;
        this.f21934b = z7;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21932e.clone();
    }
}
