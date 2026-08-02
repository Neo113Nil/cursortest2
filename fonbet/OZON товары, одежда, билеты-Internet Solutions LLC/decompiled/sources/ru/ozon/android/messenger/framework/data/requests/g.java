package ru.ozon.android.messenger.framework.data.requests;

import C.o0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.e;

/* loaded from: classes10.dex */
public final class g extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f88664c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f88665d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final e.a f88666e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f88667f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull String chatId, @NotNull String untilMessageId) {
        super(d.SET_READ_MESSAGES, null, 6);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(untilMessageId, "untilMessageId");
        this.f88664c = chatId;
        this.f88665d = untilMessageId;
        this.f88666e = e.a.NO_RECONNECT_NO_RETRY;
        this.f88667f = U.j(new Pair("chatId", chatId), new Pair("untilMessageId", untilMessageId));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88667f;
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final e.a c() {
        return this.f88666e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f88664c, gVar.f88664c) && Intrinsics.d(this.f88665d, gVar.f88665d);
    }

    public final int hashCode() {
        return this.f88665d.hashCode() + (this.f88664c.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetReadMessagesRequest(chatId=");
        sb2.append(this.f88664c);
        sb2.append(", untilMessageId=");
        return o0.c(sb2, this.f88665d, ")");
    }
}
