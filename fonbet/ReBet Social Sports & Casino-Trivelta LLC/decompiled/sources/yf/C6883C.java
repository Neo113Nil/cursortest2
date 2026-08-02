package yf;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import xf.InterfaceC6823a;

/* renamed from: yf.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6883C {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68375a;

    public C6883C(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68375a = messagesRepository;
    }

    public final C5582a a(String chatId, String messageId, Integer num) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return this.f68375a.G(chatId, messageId, num);
    }
}
