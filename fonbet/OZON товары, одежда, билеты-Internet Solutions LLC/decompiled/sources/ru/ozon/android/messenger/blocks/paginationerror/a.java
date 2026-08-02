package ru.ozon.android.messenger.blocks.paginationerror;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.paginationerror.PaginationErrorDTO;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.o;

/* loaded from: classes10.dex */
public final class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86021a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PaginationErrorDTO.a f86022b;

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull PaginationErrorDTO.a type) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f86021a = blockId;
        this.f86022b = type;
    }

    @NotNull
    public final PaginationErrorDTO.a a() {
        return this.f86022b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86021a, aVar.f86021a) && this.f86022b == aVar.f86022b;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86021a;
    }

    public final int hashCode() {
        return this.f86022b.hashCode() + (this.f86021a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PaginationErrorVO(blockId=" + this.f86021a + ", type=" + this.f86022b + ")";
    }
}
