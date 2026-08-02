package o1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f21079a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f21080b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f21081c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f21082d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f21083e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f21084f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f21085g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f21086h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f21087i;
    public static final /* synthetic */ b[] j;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        f21079a = bVar;
        b bVar2 = new b("PENALTY_DEATH", 1);
        f21080b = bVar2;
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f21081c = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f21082d = bVar4;
        b bVar5 = new b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f21083e = bVar5;
        b bVar6 = new b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f21084f = bVar6;
        b bVar7 = new b("DETECT_SET_USER_VISIBLE_HINT", 6);
        f21085g = bVar7;
        b bVar8 = new b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f21086h = bVar8;
        b bVar9 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f21087i = bVar9;
        j = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) j.clone();
    }
}
