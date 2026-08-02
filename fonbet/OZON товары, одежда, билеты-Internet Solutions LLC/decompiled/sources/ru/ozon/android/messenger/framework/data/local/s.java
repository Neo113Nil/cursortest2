package ru.ozon.android.messenger.framework.data.local;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.f;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.a f87625a;

    public s(@NotNull ru.ozon.android.messenger.framework.data.remote.mapper.a blocksItemMapper) {
        Intrinsics.checkNotNullParameter(blocksItemMapper, "blocksItemMapper");
        this.f87625a = blocksItemMapper;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.q a(@NotNull f.b block, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        return this.f87625a.b(block, obj, ru.ozon.android.messenger.utils.n.a());
    }
}
