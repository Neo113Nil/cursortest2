package ru.ozon.android.messenger.framework.domain.mappers;

import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.data.d;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.u;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f88796a;

    public a(@NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        this.f88796a = blockStore;
    }

    @NotNull
    public final q a(@NotNull g blockVO, @NotNull f blockType) {
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(blockType, "blockType");
        return new q(C7714v.a0(new u(blockVO, d.g(this.f88796a, blockType), e.a.f87374a)), new p(h.b(blockVO), 6));
    }
}
