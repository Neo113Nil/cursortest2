package ud;

import Xd.C4884a;
import Xd.C4885b;
import Xd.x;
import kotlin.Pair;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* renamed from: ud.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10029g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Sd.f f100646a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Sd.f f100647b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Sd.f f100648c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Sd.f f100649d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Sd.f f100650e;

    static {
        Sd.f f7 = Sd.f.f("message");
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        f100646a = f7;
        Sd.f f11 = Sd.f.f("replaceWith");
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        f100647b = f11;
        Sd.f f12 = Sd.f.f("level");
        Intrinsics.checkNotNullExpressionValue(f12, "identifier(...)");
        f100648c = f12;
        Sd.f f13 = Sd.f.f("expression");
        Intrinsics.checkNotNullExpressionValue(f13, "identifier(...)");
        f100649d = f13;
        Sd.f f14 = Sd.f.f("imports");
        Intrinsics.checkNotNullExpressionValue(f14, "identifier(...)");
        f100650e = f14;
    }

    @NotNull
    public static final C10034l a(@NotNull qd.m mVar, @NotNull String message, @NotNull String replaceWith, @NotNull String level) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        C10034l value = new C10034l(mVar, s.a.f81915o, U.j(new Pair(f100649d, new x(replaceWith)), new Pair(f100650e, new C4885b(K.f71697a, new C10028f(mVar)))));
        Sd.c cVar = s.a.f81913m;
        Pair pair = new Pair(f100646a, new x(message));
        Intrinsics.checkNotNullParameter(value, "value");
        Pair pair2 = new Pair(f100647b, new C4884a(value));
        Sd.c topLevelFqName = s.a.f81914n;
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        Sd.b bVar = new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
        Sd.f f7 = Sd.f.f(level);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return new C10034l(mVar, cVar, U.j(pair, pair2, new Pair(f100648c, new Xd.k(bVar, f7))));
    }
}
