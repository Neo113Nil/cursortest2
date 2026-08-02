package ru.ozon.android.messenger.framework.domain.repository;

import Ae.C2406m0;
import Ae.M0;
import id.f;
import java.io.Serializable;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.r;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.data.requests.g;
import ru.ozon.android.messenger.framework.data.requests.h;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.responses.k;
import ru.ozon.android.messenger.framework.presentation.models.responses.m;
import ru.ozon.android.messenger.framework.presentation.models.responses.n;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.android.networkinfo.models.NetworkInfo;

/* loaded from: classes10.dex */
public interface b {
    Object A(@NotNull g gVar, @NotNull kotlin.coroutines.d<? super i<? extends Object>> dVar);

    Object B(@NotNull h hVar, @NotNull kotlin.coroutines.d<? super i<? extends Object>> dVar);

    @NotNull
    M0<r> C();

    Object D(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    M0<NetworkInfo> E();

    Object F(String str, @NotNull kotlin.coroutines.d dVar, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, @NotNull q qVar);

    Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Serializable b(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    f c();

    Object d(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object e(@NotNull ru.ozon.android.messenger.framework.data.requests.i iVar, @NotNull kotlin.coroutines.d<? super i<? extends m>> dVar);

    void f(@NotNull r rVar);

    Object g(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.d<? super i<ru.ozon.android.messenger.framework.presentation.models.responses.h>> dVar);

    C2406m0 getEvents();

    @NotNull
    NetworkInfo h();

    void i(@NotNull String str);

    Object j(@NotNull GetChatsRequest getChatsRequest, @NotNull kotlin.coroutines.d<? super i<ru.ozon.android.messenger.framework.presentation.models.responses.g>> dVar);

    Object k(@NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, @NotNull String str, String str2, @NotNull kotlin.coroutines.d<? super i<n>> dVar);

    @NotNull
    M0<AbstractC9330a> l();

    Object m(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    boolean n();

    Object o(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object p(@NotNull ru.ozon.android.messenger.framework.data.requests.f fVar, @NotNull kotlin.coroutines.d<? super i<k>> dVar);

    Object q(@NotNull ru.ozon.android.messenger.framework.data.requests.ai.a aVar, @NotNull kotlin.coroutines.d<? super i<? extends Object>> dVar);

    boolean r(String str);

    Object s(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.d<? super i<ru.ozon.android.messenger.framework.presentation.models.responses.h>> dVar);

    Object t(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object u(@NotNull ru.ozon.android.messenger.framework.data.requests.a aVar, @NotNull kotlin.coroutines.d<? super i<ru.ozon.android.messenger.framework.presentation.models.responses.a>> dVar);

    Object v(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object w(@NotNull ru.ozon.android.messenger.framework.data.requests.k kVar, @NotNull kotlin.coroutines.d<? super i<? extends Object>> dVar);

    Object x(@NotNull ru.ozon.android.messenger.framework.data.requests.c cVar, @NotNull kotlin.coroutines.d<? super i<ru.ozon.android.messenger.framework.presentation.models.responses.i>> dVar);

    Object y(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    q z(@NotNull f.b bVar, Object obj);
}
