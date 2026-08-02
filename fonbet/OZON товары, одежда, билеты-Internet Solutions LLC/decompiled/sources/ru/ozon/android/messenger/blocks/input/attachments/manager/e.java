package ru.ozon.android.messenger.blocks.input.attachments.manager;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.pickerlauncher.e;
import xe.J;

/* loaded from: classes10.dex */
public final class e extends kotlin.coroutines.a implements J {
    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        throw new IllegalStateException(new e.c(th2).toString());
    }
}
