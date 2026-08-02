package ag;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z[] f180a;

    static {
        z[] zVarArr = {new z("PUBLIC", 0), new z("PROTECTED", 1), new z("INTERNAL", 2), new z("PRIVATE", 3)};
        f180a = zVarArr;
        com.google.android.play.core.appupdate.b.l(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f180a.clone();
    }
}
