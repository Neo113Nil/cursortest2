package ru.ozon.android.messenger.blocks.loading;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.o;

/* loaded from: classes10.dex */
public final class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85681a;

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f85681a = blockId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f85681a, ((a) obj).f85681a);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85681a;
    }

    public final int hashCode() {
        return this.f85681a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "LoadingVO(blockId=" + this.f85681a + ")";
    }
}
