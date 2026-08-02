package ru.ozon.android.messenger.blocks.buttons.presentation.flex;

import Ve.Lq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.buttons.a;
import ru.ozon.android.messenger.blocks.buttons.presentation.b;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.messenger.databinding.MItemChatFlexButtonBinding;

/* loaded from: classes10.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MItemChatFlexButtonBinding f84450a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f84451b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d.a f84452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull MItemChatFlexButtonBinding binding, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, @NotNull d.a networkConfig) {
        super(binding);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f84450a = binding;
        this.f84451b = controller;
        this.f84452c = networkConfig;
    }

    public static void f(a aVar, a.b bVar) {
        aVar.f84451b.q(bVar.b());
    }

    @Override // ru.ozon.android.messenger.blocks.buttons.presentation.b
    public final void e(@NotNull ru.ozon.android.messenger.blocks.buttons.a button, boolean z11) {
        Intrinsics.checkNotNullParameter(button, "button");
        a.b bVar = (a.b) button;
        ChatButtonFlexLayout chatButtonFlexLayout = this.f84450a.chatButtonTL;
        chatButtonFlexLayout.d(z11);
        chatButtonFlexLayout.i(bVar.d());
        chatButtonFlexLayout.h(bVar.c(), this.f84452c);
        chatButtonFlexLayout.setOnClickListener(new Lq(4, this, bVar));
    }
}
