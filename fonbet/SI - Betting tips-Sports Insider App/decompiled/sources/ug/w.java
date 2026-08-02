package ug;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f24323c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f24324d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f24325e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f24326f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f24327g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ nf.b f24328h;

    /* renamed from: a, reason: collision with root package name */
    public final char f24329a;

    /* renamed from: b, reason: collision with root package name */
    public final char f24330b;

    static {
        w wVar = new w("OBJ", 0, '{', '}');
        f24323c = wVar;
        w wVar2 = new w("LIST", 1, '[', ']');
        f24324d = wVar2;
        w wVar3 = new w("MAP", 2, '{', '}');
        f24325e = wVar3;
        w wVar4 = new w("POLY_OBJ", 3, '[', ']');
        f24326f = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        f24327g = wVarArr;
        f24328h = com.google.android.play.core.appupdate.b.l(wVarArr);
    }

    public w(String str, int i5, char c2, char c8) {
        this.f24329a = c2;
        this.f24330b = c8;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f24327g.clone();
    }
}
