package ru.ozon.android.messenger.framework.data.requests;

import C.o0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.SendMessageRequest;

/* loaded from: classes10.dex */
public final class j extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f88672c;

    /* renamed from: d, reason: collision with root package name */
    private final String f88673d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<SendMessageRequest.Blocks> f88674e;

    /* renamed from: f, reason: collision with root package name */
    private final String f88675f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f88676g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f88677h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull String chatId, String str, String str2, @NotNull String updateMessageId, @NotNull List blocks) {
        super(d.UPDATE_MESSAGE, chatId, 4);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(updateMessageId, "updateMessageId");
        this.f88672c = chatId;
        this.f88673d = str;
        this.f88674e = blocks;
        this.f88675f = str2;
        this.f88676g = updateMessageId;
        this.f88677h = U.j(new Pair("chatId", chatId), new Pair("localId", str), new Pair("blocks", blocks), new Pair("token", str2), new Pair("updateMessageId", updateMessageId));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88677h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f88672c, jVar.f88672c) && Intrinsics.d(this.f88673d, jVar.f88673d) && Intrinsics.d(this.f88674e, jVar.f88674e) && Intrinsics.d(this.f88675f, jVar.f88675f) && Intrinsics.d(this.f88676g, jVar.f88676g);
    }

    public final int hashCode() {
        int hashCode = this.f88672c.hashCode() * 31;
        String str = this.f88673d;
        int b11 = G.g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f88674e);
        String str2 = this.f88675f;
        return this.f88676g.hashCode() + ((b11 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateMessageRequest(chatId=");
        sb2.append(this.f88672c);
        sb2.append(", localId=");
        sb2.append(this.f88673d);
        sb2.append(", blocks=");
        sb2.append(this.f88674e);
        sb2.append(", retryToken=");
        sb2.append(this.f88675f);
        sb2.append(", updateMessageId=");
        return o0.c(sb2, this.f88676g, ")");
    }
}
