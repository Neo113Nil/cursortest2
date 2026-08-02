package mg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f20735a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f20736b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f20737c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f20738d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f20739e;

    static {
        i iVar = new i("SUCCESSFUL", 0);
        f20735a = iVar;
        i iVar2 = new i("REREGISTER", 1);
        f20736b = iVar2;
        i iVar3 = new i("CANCELLED", 2);
        f20737c = iVar3;
        i iVar4 = new i("ALREADY_SELECTED", 3);
        f20738d = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f20739e = iVarArr;
        com.google.android.play.core.appupdate.b.l(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f20739e.clone();
    }
}
