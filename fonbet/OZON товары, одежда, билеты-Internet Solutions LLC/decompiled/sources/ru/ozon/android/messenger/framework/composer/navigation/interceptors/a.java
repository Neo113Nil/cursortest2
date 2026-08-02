package ru.ozon.android.messenger.framework.composer.navigation.interceptors;

import L00.g;
import L00.i;
import QZ.g;
import i10.h;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f86728a;

    public a(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f86728a = params;
    }

    @Override // QZ.g
    @NotNull
    public final L00.g interceptRequest(@NotNull h state, @NotNull L00.g request, @NotNull i extras) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        request.getClass();
        g.a aVar = new g.a(request);
        aVar.i();
        aVar.h(this.f86728a);
        L00.g a11 = aVar.a();
        g.a.a(state, a11, extras);
        return a11;
    }

    @Override // QZ.g
    @NotNull
    public final h interceptState(@NotNull h hVar, @NotNull A00.a aVar) {
        g.a.b(hVar, aVar);
        return hVar;
    }

    @Override // QZ.g
    @NotNull
    public final h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
