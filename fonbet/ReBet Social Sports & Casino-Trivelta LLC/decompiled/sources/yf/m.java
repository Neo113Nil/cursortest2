package yf;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import wf.EnumC6745a;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68392a;

    public m(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68392a = messagesRepository;
    }

    public final C5582a a(EnumC6745a messageAction) {
        Intrinsics.checkNotNullParameter(messageAction, "messageAction");
        return this.f68392a.q(messageAction);
    }
}
