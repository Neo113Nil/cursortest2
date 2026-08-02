package ru.ozon.android.messenger.blocks.useristyping;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* loaded from: classes10.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86562a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86563b;

    public b(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, String str) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f86562a = blockId;
        this.f86563b = str;
    }

    public final String a() {
        return this.f86563b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f86562a, bVar.f86562a) && Intrinsics.d(this.f86563b, bVar.f86563b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86562a;
    }

    public final int hashCode() {
        int hashCode = this.f86562a.hashCode() * 31;
        String str = this.f86563b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "UserIsTypingVO(blockId=" + this.f86562a + ", animationId=" + this.f86563b + ")";
    }
}
