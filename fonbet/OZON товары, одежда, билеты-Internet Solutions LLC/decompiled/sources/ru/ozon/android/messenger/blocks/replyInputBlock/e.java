package ru.ozon.android.messenger.blocks.replyInputBlock;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

/* loaded from: classes10.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86349a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReplyInputBlockDTO f86350b;

    static {
        int i11 = IconButtonV3DTO.$stable;
        ProductMediaDTO.Companion companion = ProductMediaDTO.INSTANCE;
        int i12 = IconDTO.$stable;
    }

    public e(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull ReplyInputBlockDTO dto) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.f86349a = blockId;
        this.f86350b = dto;
    }

    @NotNull
    public final ReplyInputBlockDTO a() {
        return this.f86350b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f86349a, eVar.f86349a) && Intrinsics.d(this.f86350b, eVar.f86350b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86349a;
    }

    public final int hashCode() {
        return this.f86350b.hashCode() + (this.f86349a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ReplyInputBlockVO(blockId=" + this.f86349a + ", dto=" + this.f86350b + ")";
    }
}
