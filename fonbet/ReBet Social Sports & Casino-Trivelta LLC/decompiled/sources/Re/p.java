package Re;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10228a;

    public p(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10228a = conversationsRepository;
    }

    public final C5582a a(String chatId, long j10) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return this.f10228a.o(chatId, j10);
    }
}
