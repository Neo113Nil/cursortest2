package rg0;

import Dj.EnumC2873a;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import sg0.InterfaceC9693a;
import xe.J;

/* loaded from: classes3.dex */
public final class e extends kotlin.coroutines.a implements J {
    public e(J.a aVar) {
        super(aVar);
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        InterfaceC9693a.f98765a.f(EnumC2873a.ERROR, "OzonSentryHelperLPLibraryLinkHandler: Ошибка при отправке ивента NonFatal-ивента", th2);
    }
}
