package ru.ozon.android.messenger.framework.data.local.database;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;

/* loaded from: classes10.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.database.undelivered.a f87466a;

    public a(@NotNull MessengerDB database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f87466a = database.b();
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.c
    public final Object a(@NotNull String str, @NotNull d<? super Unit> dVar) {
        Object a11 = this.f87466a.a(str, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.c
    public final Object b(@NotNull String str, @NotNull d<? super UndeliveredMessageEntity> dVar) {
        return this.f87466a.b(str, dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.c
    public final Object c(@NotNull String str, @NotNull d<? super Unit> dVar) {
        Object f7 = this.f87466a.f(str, dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.c
    public final Object d(@NotNull String str, @NotNull d<? super List<UndeliveredMessageEntity>> dVar) {
        return this.f87466a.c(str, dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.c
    public final Object e(@NotNull d<? super Map<String, UndeliveredMessageEntity>> dVar) {
        return this.f87466a.d(dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.c
    public final Object f(UndeliveredMessageEntity undeliveredMessageEntity, @NotNull d<? super Unit> dVar) {
        Object e11;
        return (undeliveredMessageEntity != null && (e11 = this.f87466a.e(undeliveredMessageEntity, dVar)) == Wc.a.COROUTINE_SUSPENDED) ? e11 : Unit.f71690a;
    }
}
