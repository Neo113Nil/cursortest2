package yf;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68388a;

    public i(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68388a = messagesRepository;
    }

    public final C5582a a(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return this.f68388a.I(chatId);
    }
}
