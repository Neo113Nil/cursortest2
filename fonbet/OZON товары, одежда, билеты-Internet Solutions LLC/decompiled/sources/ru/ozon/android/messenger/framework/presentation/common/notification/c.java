package ru.ozon.android.messenger.framework.presentation.common.notification;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.emptystate.g;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f90782a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.a f90783b;

    public c(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.blocks.emptystate.a emptyScreenFactory) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(emptyScreenFactory, "emptyScreenFactory");
        this.f90782a = repository;
        this.f90783b = emptyScreenFactory;
    }

    public final void a(String str, @NotNull Function0<Unit> showNotification, @NotNull Function1<? super List<q>, Unit> showEmptyScreen) {
        Intrinsics.checkNotNullParameter(showNotification, "showNotification");
        Intrinsics.checkNotNullParameter(showEmptyScreen, "showEmptyScreen");
        if (this.f90782a.r(str)) {
            showNotification.invoke();
        } else {
            showEmptyScreen.invoke(this.f90783b.m(new g.a(str)));
        }
    }
}
