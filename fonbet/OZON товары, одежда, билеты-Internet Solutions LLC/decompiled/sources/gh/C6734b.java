package gh;

import Pj.g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.dsBadge.BadgeDTO;

/* renamed from: gh.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6734b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C6733a f64481a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C6733a f64482b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C6733a f64483c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C6733a f64484d;

    static {
        BadgeDTO.BadgeSize badgeSize = BadgeDTO.BadgeSize.SIZE_500;
        f64481a = new C6733a(badgeSize, g.h());
        f64482b = new C6733a(badgeSize, g.m());
        BadgeDTO.BadgeSize badgeSize2 = BadgeDTO.BadgeSize.SIZE_400;
        f64483c = new C6733a(badgeSize2, g.f());
        f64484d = new C6733a(badgeSize2, g.k());
    }

    @NotNull
    public static C6733a a() {
        return f64483c;
    }

    @NotNull
    public static C6733a b() {
        return f64484d;
    }

    @NotNull
    public static C6733a c() {
        return f64481a;
    }

    @NotNull
    public static C6733a d() {
        return f64482b;
    }
}
