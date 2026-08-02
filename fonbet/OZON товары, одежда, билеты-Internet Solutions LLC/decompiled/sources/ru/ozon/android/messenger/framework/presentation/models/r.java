package ru.ozon.android.messenger.framework.presentation.models;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.z;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<z> f91457a = C7714v.b0(z.f.f91568a, z.e.f91567a, z.d.f91566a);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f91458b = 0;

    @NotNull
    public static final q a(@NotNull q qVar, @NotNull Function1<? super s, s> map) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        p c11 = qVar.c();
        s sVar = c11 instanceof s ? (s) c11 : null;
        return sVar == null ? qVar : q.a(qVar, null, map.invoke(sVar), 1);
    }

    @NotNull
    public static final g b(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return ((u) C7714v.K(qVar.b())).c();
    }

    public static final <T extends g> T c(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (T) v.b((u) C7714v.K(qVar.b()));
    }

    @NotNull
    public static final String d(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c().getId();
    }

    public static final String e(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        s f7 = f(qVar);
        if (f7 != null) {
            return f7.i();
        }
        return null;
    }

    public static final s f(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        p c11 = qVar.c();
        if (c11 instanceof s) {
            return (s) c11;
        }
        return null;
    }

    public static final boolean g(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.c() instanceof s;
    }

    public static final boolean h(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (qVar.c() instanceof s) {
            return f91457a.contains(((s) qVar.c()).k()) && !(b(qVar) instanceof ru.ozon.android.messenger.blocks.useristyping.b);
        }
        return false;
    }
}
