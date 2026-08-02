package ru.ozon.android.messenger.framework.data.local.database.draft.entity;

import P4.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87509a;

    /* renamed from: b, reason: collision with root package name */
    private final long f87510b;

    public c(@NotNull String chatId, long j11) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f87509a = chatId;
        this.f87510b = j11;
    }

    @NotNull
    public final String a() {
        return this.f87509a;
    }

    public final long b() {
        return this.f87510b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f87509a, cVar.f87509a) && this.f87510b == cVar.f87510b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f87510b) + (this.f87509a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DraftMessageChatEntity(chatId=");
        sb2.append(this.f87509a);
        sb2.append(", updatedAt=");
        return f.a(this.f87510b, ")", sb2);
    }
}
