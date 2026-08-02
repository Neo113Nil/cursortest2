package ze;

import s7.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final t f25957a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f25958b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f25959c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f25960d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f25961e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f25962f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ j[] f25963g;

    static {
        j jVar = new j("NOT_DETECTED", 0);
        f25958b = jVar;
        j jVar2 = new j("UP", 1);
        f25959c = jVar2;
        j jVar3 = new j("DOWN", 2);
        f25960d = jVar3;
        j jVar4 = new j("LEFT", 3);
        f25961e = jVar4;
        j jVar5 = new j("RIGHT", 4);
        f25962f = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        f25963g = jVarArr;
        com.google.android.play.core.appupdate.b.l(jVarArr);
        f25957a = new t(24);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f25963g.clone();
    }
}
