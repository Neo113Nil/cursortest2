package ru.ozon.android.messenger.framework.data.local;

import Ae.C2417s0;
import Ae.M0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: ru.ozon.android.messenger.framework.data.local.a$a, reason: collision with other inner class name */
    public static final class C1569a {
    }

    Object a(@NotNull ru.ozon.android.messenger.framework.domain.model.c cVar, @NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar2);

    @NotNull
    C2417s0 b();

    Object c(@NotNull ru.ozon.android.messenger.framework.presentation.models.q[] qVarArr, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    void d(@NotNull ArrayList arrayList);

    Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    void f(@NotNull String str);

    Object g(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object h(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object i(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    List<ru.ozon.android.messenger.framework.presentation.models.q> j(@NotNull Function1<? super ru.ozon.android.messenger.framework.presentation.models.q, Boolean> function1);

    @NotNull
    List<ru.ozon.android.messenger.framework.presentation.models.q> k();

    Unit l(@NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar);

    @NotNull
    ArrayList m();

    Object n(@NotNull String[] strArr, @NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    List<ru.ozon.android.messenger.framework.presentation.models.q> o();

    Object p(@NotNull List list, List list2, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    void q();

    void r(@NotNull Function1<? super List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> function1);

    Object s(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    void t();

    @NotNull
    M0<ru.ozon.android.messenger.framework.domain.model.i> u();
}
