package Re;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10215a;

    public g(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10215a = conversationsRepository;
    }

    public final C5582a a(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return this.f10215a.k(chatId);
    }
}
