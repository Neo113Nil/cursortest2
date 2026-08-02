package ru.ozon.android.messenger.framework.domain.repository;

import Ae.M0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public interface d {
    Object a(@NotNull ru.ozon.android.messenger.framework.domain.model.c cVar, @NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar2);

    @NotNull
    M0<ru.ozon.android.messenger.framework.domain.model.b> b();

    Object c(@NotNull q[] qVarArr, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    void d(@NotNull ArrayList arrayList);

    Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    void f(@NotNull String str);

    Object g(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object h(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object i(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    List<q> j(@NotNull Function1<? super q, Boolean> function1);

    Object k(@NotNull List list, K k11, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object l(@NotNull q qVar, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object m(@NotNull d.w wVar, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    boolean n(@NotNull q qVar);

    Object o(@NotNull q qVar, @NotNull String[] strArr, @NotNull j jVar);

    boolean p(@NotNull String str);

    Object q(@NotNull d.w wVar, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object r(@NotNull String str, CustomBlockDTO customBlockDTO, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
