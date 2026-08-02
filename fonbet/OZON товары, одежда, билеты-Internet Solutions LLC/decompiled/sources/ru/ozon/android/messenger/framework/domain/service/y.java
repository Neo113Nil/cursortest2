package ru.ozon.android.messenger.framework.domain.service;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;

/* loaded from: classes10.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0 f88949a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f88950b;

    public y(@NotNull x0 issueMessagesHandler, @NotNull c chatSendMessageDelegate) {
        Intrinsics.checkNotNullParameter(issueMessagesHandler, "issueMessagesHandler");
        Intrinsics.checkNotNullParameter(chatSendMessageDelegate, "chatSendMessageDelegate");
        this.f88949a = issueMessagesHandler;
        this.f88950b = chatSendMessageDelegate;
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.x
    @NotNull
    public final ArrayList a() {
        return this.f88949a.e();
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.x
    public final boolean b() {
        return this.f88949a.h();
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.x
    public final boolean c() {
        return this.f88949a.g();
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.x
    public final ru.ozon.android.messenger.framework.presentation.models.q d() {
        return this.f88949a.d();
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.x
    public final void e() {
        x0 x0Var = this.f88949a;
        v0 j11 = x0Var.j();
        if (!x0Var.h() || j11 == null) {
            return;
        }
        this.f88950b.b(j11);
        x0Var.o(false);
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.x
    public final void f(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f88949a.l(messageId);
    }

    @Override // ru.ozon.android.messenger.framework.domain.service.x
    public final void g() {
        this.f88949a.o(false);
    }
}
