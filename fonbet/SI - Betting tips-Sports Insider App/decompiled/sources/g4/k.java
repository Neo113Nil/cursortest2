package g4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f9788a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f9789b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f9790c;

    static {
        k kVar = new k("UNCHANGED", 0);
        f9788a = kVar;
        k kVar2 = new k("TRANSLUCENT", 1);
        k kVar3 = new k("OPAQUE", 2);
        f9789b = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        f9790c = kVarArr;
        com.google.android.play.core.appupdate.b.l(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f9790c.clone();
    }
}
