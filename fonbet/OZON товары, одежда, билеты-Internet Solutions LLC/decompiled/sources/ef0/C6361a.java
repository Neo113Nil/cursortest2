package ef0;

import gf0.AbstractC6729a;
import jf0.AbstractC7421a;
import kf0.C7674a;
import kf0.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ef0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6361a {
    public static final void a(@NotNull c cVar, @NotNull AbstractC7421a graph, @NotNull AbstractC6729a startDestination, @NotNull Function1<? super c, Unit> builder) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        cVar.a(new C7674a(graph, startDestination, builder));
    }
}
