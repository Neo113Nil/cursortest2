package ru.ozon.android.messenger.blocks.ai.divider;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84095a;

    /* renamed from: b, reason: collision with root package name */
    private final TextDTO f84096b;

    public b(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f84095a = blockId;
        this.f84096b = textDTO;
    }

    public final TextDTO a() {
        return this.f84096b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f84095a, bVar.f84095a) && Intrinsics.d(this.f84096b, bVar.f84096b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84095a;
    }

    public final int hashCode() {
        int hashCode = this.f84095a.hashCode() * 31;
        TextDTO textDTO = this.f84096b;
        return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public final String toString() {
        return "AiDividerVO(blockId=" + this.f84095a + ", text=" + this.f84096b + ")";
    }
}
