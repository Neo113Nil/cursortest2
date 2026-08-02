package ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f83936a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CellDTO f83937b;

    static {
        int i11 = CellDTO.$stable;
    }

    public a(@NotNull c blockId, @NotNull CellDTO cell) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.f83936a = blockId;
        this.f83937b = cell;
    }

    @NotNull
    public final CellDTO a() {
        return this.f83937b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f83936a, aVar.f83936a) && Intrinsics.d(this.f83937b, aVar.f83937b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final c getBlockId() {
        return this.f83936a;
    }

    public final int hashCode() {
        return this.f83937b.hashCode() + (this.f83936a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AICellWrapperVO(blockId=" + this.f83936a + ", cell=" + this.f83937b + ")";
    }
}
