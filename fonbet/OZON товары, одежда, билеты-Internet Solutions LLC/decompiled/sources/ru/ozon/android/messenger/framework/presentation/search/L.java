package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class L implements ru.ozon.android.messenger.framework.presentation.common.view.recycler.u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f91598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f91599b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f91600c;

    public L(@NotNull Function0<Boolean> getHasItemsAfter, @NotNull Function0<Boolean> getIsLoading, @NotNull Function0<Unit> onLoadMore) {
        Intrinsics.checkNotNullParameter(getHasItemsAfter, "getHasItemsAfter");
        Intrinsics.checkNotNullParameter(getIsLoading, "getIsLoading");
        Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
        this.f91598a = getHasItemsAfter;
        this.f91599b = getIsLoading;
        this.f91600c = onLoadMore;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean A() {
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void G() {
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void H() {
        this.f91600c.invoke();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean S() {
        return this.f91598a.invoke().booleanValue();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean Y() {
        return this.f91599b.invoke().booleanValue();
    }
}
