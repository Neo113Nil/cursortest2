package ru.ozon.android.messenger.framework.data.requests;

import B0.C2454a;
import C.o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f88647c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f88648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String chatId) {
        super(d.CHAT_ENTER, null, 6);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f88647c = chatId;
        this.f88648d = C2454a.b("chatId", chatId);
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88648d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f88647c, ((a) obj).f88647c);
    }

    public final int hashCode() {
        return this.f88647c.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("ChatEnterRequest(chatId="), this.f88647c, ")");
    }
}
