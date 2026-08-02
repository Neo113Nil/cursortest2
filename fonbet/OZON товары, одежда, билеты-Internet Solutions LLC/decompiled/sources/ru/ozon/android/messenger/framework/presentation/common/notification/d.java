package ru.ozon.android.messenger.framework.presentation.common.notification;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f90784a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.e f90785b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.j f90786c;

    public interface a {
        @NotNull
        d a(@NotNull ru.ozon.android.messenger.blocks.emptystate.j jVar);
    }

    public d(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.blocks.emptystate.e emptyScreenBlockFactory, @NotNull ru.ozon.android.messenger.blocks.emptystate.j emptyStatePlace) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(emptyScreenBlockFactory, "emptyScreenBlockFactory");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        this.f90784a = repository;
        this.f90785b = emptyScreenBlockFactory;
        this.f90786c = emptyStatePlace;
    }

    public final void a(String str, @NotNull Function0<Unit> showNotification, @NotNull Function1<? super List<q>, Unit> showEmptyScreen) {
        Intrinsics.checkNotNullParameter(showNotification, "showNotification");
        Intrinsics.checkNotNullParameter(showEmptyScreen, "showEmptyScreen");
        ru.ozon.android.messenger.blocks.emptystate.j jVar = ru.ozon.android.messenger.blocks.emptystate.j.CHAT_LIST;
        ru.ozon.android.messenger.framework.domain.repository.b bVar = this.f90784a;
        ru.ozon.android.messenger.blocks.emptystate.j jVar2 = this.f90786c;
        if (jVar2 == jVar ? bVar.n() : bVar.r(str)) {
            showNotification.invoke();
        } else {
            showEmptyScreen.invoke(this.f90785b.e(bVar.E().getValue(), jVar2, null));
        }
    }
}
