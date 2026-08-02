package ru.ozon.android.messenger.blocks.replymessageblock;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86361a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReplyMessageBlockDTO f86362b;

    static {
        ProductMediaDTO.Companion companion = ProductMediaDTO.INSTANCE;
    }

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull ReplyMessageBlockDTO dto) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.f86361a = blockId;
        this.f86362b = dto;
    }

    @NotNull
    public final ReplyMessageBlockDTO a() {
        return this.f86362b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86361a, aVar.f86361a) && Intrinsics.d(this.f86362b, aVar.f86362b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86361a;
    }

    public final int hashCode() {
        return this.f86362b.hashCode() + (this.f86361a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ReplyMessageBlockVO(blockId=" + this.f86361a + ", dto=" + this.f86362b + ")";
    }
}
