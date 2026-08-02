package ru.ozon.android.messenger.framework.di;

import Ae.M0;
import Ae.O0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b;

/* loaded from: classes10.dex */
final class G implements ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final G f88698a = new G();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final M0<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b> f88699b = O0.a(b.a.f89824a);

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c
    public final Object a(@NotNull ru.ozon.android.messenger.framework.domain.model.j jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c
    public final Object b(boolean z11, boolean z12, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a
    public final ru.ozon.android.messenger.framework.presentation.models.q c() {
        return null;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a
    public final boolean d(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c
    @NotNull
    public final M0<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b> e() {
        return f88699b;
    }
}
