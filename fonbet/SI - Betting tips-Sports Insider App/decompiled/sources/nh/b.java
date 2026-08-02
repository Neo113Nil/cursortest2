package nh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f20915b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f20916c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f20917d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f20918e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f20919f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f20920g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f20921h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f20922i;

    /* renamed from: a, reason: collision with root package name */
    public final int f20923a;

    static {
        b bVar = new b("NO_ERROR", 0, 0);
        f20916c = bVar;
        b bVar2 = new b("PROTOCOL_ERROR", 1, 1);
        f20917d = bVar2;
        b bVar3 = new b("INTERNAL_ERROR", 2, 2);
        f20918e = bVar3;
        b bVar4 = new b("FLOW_CONTROL_ERROR", 3, 3);
        f20919f = bVar4;
        b bVar5 = new b("SETTINGS_TIMEOUT", 4, 4);
        b bVar6 = new b("STREAM_CLOSED", 5, 5);
        b bVar7 = new b("FRAME_SIZE_ERROR", 6, 6);
        b bVar8 = new b("REFUSED_STREAM", 7, 7);
        f20920g = bVar8;
        b bVar9 = new b("CANCEL", 8, 8);
        f20921h = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, new b("COMPRESSION_ERROR", 9, 9), new b("CONNECT_ERROR", 10, 10), new b("ENHANCE_YOUR_CALM", 11, 11), new b("INADEQUATE_SECURITY", 12, 12), new b("HTTP_1_1_REQUIRED", 13, 13)};
        f20922i = bVarArr;
        com.google.android.play.core.appupdate.b.l(bVarArr);
        f20915b = new b0();
    }

    public b(String str, int i5, int i10) {
        this.f20923a = i10;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20922i.clone();
    }
}
