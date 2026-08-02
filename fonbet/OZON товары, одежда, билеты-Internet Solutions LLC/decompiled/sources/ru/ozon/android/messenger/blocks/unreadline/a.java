package ru.ozon.android.messenger.blocks.unreadline;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.o;

/* loaded from: classes10.dex */
public final class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86552a;

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f86552a = blockId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f86552a, ((a) obj).f86552a);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86552a;
    }

    public final int hashCode() {
        return this.f86552a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "UnreadVO(blockId=" + this.f86552a + ")";
    }
}
