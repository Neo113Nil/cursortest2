package ru.ozon.android.messenger.framework.data.local.database.draft;

import Ae.InterfaceC2395h;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB;

/* loaded from: classes10.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f87469a;

    public a(@NotNull MessengerDB database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f87469a = database.a();
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.s
    public final Object a(@NotNull String str, @NotNull String str2, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = this.f87469a.a(str, str2, j11, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.s
    public final Object b(@NotNull String str, @NotNull ArrayList arrayList, long j11, @NotNull kotlin.coroutines.d dVar) {
        Object b11 = this.f87469a.b(str, arrayList, j11, dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.s
    public final Object c(@NotNull String str, @NotNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object c11 = this.f87469a.c(str, bVar, j11, dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.s
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object l11 = this.f87469a.l(str, dVar);
        return l11 == Wc.a.COROUTINE_SUSPENDED ? l11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.s
    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.data.local.database.draft.model.a> e(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return this.f87469a.h(chatId);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.s
    public final Object f(@NotNull kotlin.coroutines.d<? super Map<String, ru.ozon.android.messenger.framework.data.local.database.draft.model.a>> dVar) {
        return this.f87469a.j(dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.s
    public final Object g(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = this.f87469a.d(str, dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
