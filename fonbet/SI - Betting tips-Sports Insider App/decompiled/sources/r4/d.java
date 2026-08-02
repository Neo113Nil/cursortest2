package r4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22293a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f22294b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f22295c;

    static {
        d dVar = new d("EXACT", 0);
        f22293a = dVar;
        d dVar2 = new d("INEXACT", 1);
        f22294b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f22295c = dVarArr;
        com.google.android.play.core.appupdate.b.l(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f22295c.clone();
    }
}
