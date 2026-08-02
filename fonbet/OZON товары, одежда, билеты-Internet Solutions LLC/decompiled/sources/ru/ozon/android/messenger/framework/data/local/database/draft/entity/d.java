package ru.ozon.android.messenger.framework.data.local.database.draft.entity;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87511a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f87512b;

    public d(@NotNull String chatId, @NotNull String text) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f87511a = chatId;
        this.f87512b = text;
    }

    @NotNull
    public final String a() {
        return this.f87511a;
    }

    @NotNull
    public final String b() {
        return this.f87512b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f87511a, dVar.f87511a) && Intrinsics.d(this.f87512b, dVar.f87512b);
    }

    public final int hashCode() {
        return this.f87512b.hashCode() + (this.f87511a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DraftTextEntity(chatId=");
        sb2.append(this.f87511a);
        sb2.append(", text=");
        return o0.c(sb2, this.f87512b, ")");
    }
}
