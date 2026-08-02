package ru.ozon.android.messenger.api;

import Sc.r;
import Sc.s;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.c;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f83914a = new b();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f83915b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static String f83916c;

    public static void a(@NotNull ru.ozon.android.messenger.framework.core.initialization.newinit.b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        c cVar = (c) f83915b.put(feature.d(), feature);
        f83916c = feature.d();
        if (cVar == null || cVar == feature) {
            return;
        }
        try {
            r.Companion companion = r.INSTANCE;
            cVar.close();
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    @NotNull
    public static c b(String str) {
        c cVar = (c) f83915b.get(str == null ? f83916c : str);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(Nk.a.b("Не удалось найти инстанс Feature по namespace = ", str));
    }

    @NotNull
    public static c c(@NotNull String namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        c cVar = (c) f83915b.get(namespace);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(Nk.a.b("Не удалось найти инстанс Feature по namespace = ", namespace));
    }
}
