package ru.ozon.android.messenger.framework.data.requests;

import B0.C2454a;
import C.o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f88678c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f88679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull String chatId) {
        super(d.USER_IS_TYPING, chatId, 4);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f88678c = chatId;
        this.f88679d = C2454a.b("chatId", chatId);
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88679d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f88678c, ((k) obj).f88678c);
    }

    public final int hashCode() {
        return this.f88678c.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("UserIsTypingRequest(chatId="), this.f88678c, ")");
    }
}
