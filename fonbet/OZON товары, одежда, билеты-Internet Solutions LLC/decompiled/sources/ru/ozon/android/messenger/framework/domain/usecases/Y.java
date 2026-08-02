package ru.ozon.android.messenger.framework.domain.usecases;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89038a;

    public Y(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f89038a = chatRepository;
    }

    public final Object a(@NotNull ru.ozon.android.messenger.framework.data.requests.g gVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
        return this.f89038a.A(gVar, dVar);
    }
}
