package ru.ozon.android.messenger.framework.data.local.database.draft.entity;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f87506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f87507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final CustomBlockDTO f87508c;

    public b(int i11, @NotNull String chatId, @NotNull CustomBlockDTO customBlock) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(customBlock, "customBlock");
        this.f87506a = i11;
        this.f87507b = chatId;
        this.f87508c = customBlock;
    }

    @NotNull
    public final String a() {
        return this.f87507b;
    }

    @NotNull
    public final CustomBlockDTO b() {
        return this.f87508c;
    }

    public final int c() {
        return this.f87506a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f87506a == bVar.f87506a && Intrinsics.d(this.f87507b, bVar.f87507b) && Intrinsics.d(this.f87508c, bVar.f87508c);
    }

    public final int hashCode() {
        return this.f87508c.hashCode() + g.a(Integer.hashCode(this.f87506a) * 31, 31, this.f87507b);
    }

    @NotNull
    public final String toString() {
        return "DraftCustomBlockEntity(id=" + this.f87506a + ", chatId=" + this.f87507b + ", customBlock=" + this.f87508c + ")";
    }
}
