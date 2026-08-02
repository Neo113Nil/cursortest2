package ru.ozon.android.messenger.framework.domain.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f88800a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f88801b;

    public b(@NotNull i supplementaryContainer, @NotNull a blocksContainer) {
        Intrinsics.checkNotNullParameter(supplementaryContainer, "supplementaryContainer");
        Intrinsics.checkNotNullParameter(blocksContainer, "blocksContainer");
        this.f88800a = supplementaryContainer;
        this.f88801b = blocksContainer;
    }

    @NotNull
    public final a a() {
        return this.f88801b;
    }

    @NotNull
    public final i b() {
        return this.f88800a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f88800a, bVar.f88800a) && Intrinsics.d(this.f88801b, bVar.f88801b);
    }

    public final int hashCode() {
        return this.f88801b.hashCode() + (this.f88800a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ChatDomainState(supplementaryContainer=" + this.f88800a + ", blocksContainer=" + this.f88801b + ")";
    }
}
