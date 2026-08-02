package pi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import oi.C8741e;
import oi.InterfaceC8742f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f81119a = new i();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8741e f81120b = new C8741e("NONE");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C8741e f81121c = new C8741e("RADIUS_200");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C8741e f81122d = new C8741e("RADIUS_250");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C8741e f81123e = new C8741e("RADIUS_300");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C8741e f81124f = new C8741e("RADIUS_350");

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C8741e f81125g = new C8741e("RADIUS_400");

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final C8741e f81126h = new C8741e("RADIUS_450");

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C8741e f81127i = new C8741e("RADIUS_500");

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C8741e f81128j = new C8741e("RADIUS_525");

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C8741e f81129k = new C8741e("RADIUS_550");

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C8741e f81130l = new C8741e("RADIUS_600");

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C8741e f81131m = new C8741e("RADIUS_650");

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C8741e f81132n = new C8741e("RADIUS_700");

    @NotNull
    public static C8741e a() {
        return f81120b;
    }

    @NotNull
    public static C8741e b() {
        return f81121c;
    }

    @NotNull
    public static C8741e c() {
        return f81122d;
    }

    @NotNull
    public static C8741e d() {
        return f81123e;
    }

    @NotNull
    public static C8741e e() {
        return f81124f;
    }

    @NotNull
    public static C8741e f() {
        return f81125g;
    }

    @NotNull
    public static C8741e g() {
        return f81126h;
    }

    @NotNull
    public static C8741e h() {
        return f81127i;
    }

    @NotNull
    public static C8741e i() {
        return f81128j;
    }

    @NotNull
    public static C8741e j() {
        return f81129k;
    }

    @NotNull
    public static C8741e k() {
        return f81130l;
    }

    @NotNull
    public static C8741e l() {
        return f81131m;
    }

    @NotNull
    public static C8741e m() {
        return f81132n;
    }

    @Override // pi.l
    public final InterfaceC8742f getById(String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = j.f81133a;
        return (C8741e) map.get(tokenId);
    }
}
