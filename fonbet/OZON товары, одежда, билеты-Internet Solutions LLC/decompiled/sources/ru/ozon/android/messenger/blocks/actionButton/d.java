package ru.ozon.android.messenger.blocks.actionButton;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f83922a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IconButtonV3DTO f83923b;

    static {
        int i11 = IconButtonV3DTO.$stable;
    }

    public d(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull IconButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f83922a = blockId;
        this.f83923b = button;
    }

    @NotNull
    public final IconButtonV3DTO a() {
        return this.f83923b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f83922a, dVar.f83922a) && Intrinsics.d(this.f83923b, dVar.f83923b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f83922a;
    }

    public final int hashCode() {
        return this.f83923b.hashCode() + (this.f83922a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ActionButtonVO(blockId=" + this.f83922a + ", button=" + this.f83923b + ")";
    }
}
