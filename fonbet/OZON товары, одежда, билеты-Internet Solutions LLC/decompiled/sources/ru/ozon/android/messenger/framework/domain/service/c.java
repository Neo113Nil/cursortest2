package ru.ozon.android.messenger.framework.domain.service;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;

/* loaded from: classes10.dex */
public interface c {
    Object a(@NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, boolean z11, boolean z12, boolean z13, @NotNull kotlin.coroutines.jvm.internal.c cVar2);

    void b(@NotNull v0 v0Var);

    Object c(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object e(@NotNull ru.ozon.android.messenger.framework.domain.model.j jVar, String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);
}
