package pi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import oi.C8740d;
import oi.InterfaceC8742f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f81099a = new g();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8740d f81100b = new C8740d("NONE");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C8740d f81101c = new C8740d("PADDING_100");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C8740d f81102d = new C8740d("PADDING_200");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C8740d f81103e = new C8740d("PADDING_250");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C8740d f81104f = new C8740d("PADDING_300");

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C8740d f81105g = new C8740d("PADDING_350");

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final C8740d f81106h = new C8740d("PADDING_400");

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C8740d f81107i = new C8740d("PADDING_450");

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C8740d f81108j = new C8740d("PADDING_500");

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C8740d f81109k = new C8740d("PADDING_550");

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C8740d f81110l = new C8740d("PADDING_600");

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C8740d f81111m = new C8740d("PADDING_700");

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C8740d f81112n = new C8740d("PADDING_800");

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final C8740d f81113o = new C8740d("PADDING_900");

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final C8740d f81114p = new C8740d("PADDING_950");

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final C8740d f81115q = new C8740d("PADDING_1000");

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C8740d f81116r = new C8740d("PADDING_1050");

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final C8740d f81117s = new C8740d("PADDING_1100");

    @NotNull
    public static C8740d a() {
        return f81100b;
    }

    @NotNull
    public static C8740d b() {
        return f81101c;
    }

    @NotNull
    public static C8740d c() {
        return f81115q;
    }

    @NotNull
    public static C8740d d() {
        return f81116r;
    }

    @NotNull
    public static C8740d e() {
        return f81117s;
    }

    @NotNull
    public static C8740d g() {
        return f81103e;
    }

    @NotNull
    public static C8740d h() {
        return f81104f;
    }

    @NotNull
    public static C8740d i() {
        return f81105g;
    }

    @NotNull
    public static C8740d j() {
        return f81106h;
    }

    @NotNull
    public static C8740d k() {
        return f81107i;
    }

    @NotNull
    public static C8740d l() {
        return f81108j;
    }

    @NotNull
    public static C8740d m() {
        return f81109k;
    }

    @NotNull
    public static C8740d n() {
        return f81110l;
    }

    @NotNull
    public static C8740d o() {
        return f81111m;
    }

    @NotNull
    public static C8740d p() {
        return f81112n;
    }

    @NotNull
    public static C8740d q() {
        return f81113o;
    }

    @NotNull
    public static C8740d r() {
        return f81114p;
    }

    @NotNull
    public final C8740d f() {
        return f81102d;
    }

    @Override // pi.l
    public final InterfaceC8742f getById(String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = h.f81118a;
        return (C8740d) map.get(tokenId);
    }
}
