package ru.ozon.android.messenger.framework.presentation.mapper;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.domain.g;
import ru.ozon.android.messenger.framework.domain.model.b;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b;
import ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0;
import ru.ozon.android.messenger.framework.presentation.models.l;
import ru.ozon.android.messenger.utils.n;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f91311a;

    public a(@NotNull c inputModeStore) {
        Intrinsics.checkNotNullParameter(inputModeStore, "inputModeStore");
        this.f91311a = inputModeStore;
    }

    @NotNull
    public static l b(@NotNull b chatState) {
        Intrinsics.checkNotNullParameter(chatState, "chatState");
        return new l(new g(chatState.b().c(), chatState.b().b()), new C0(chatState.a().b(), chatState.a().c()));
    }

    @NotNull
    public final g.a a(@NotNull z0 uiModel, @NotNull String chatId, boolean z11) {
        Intrinsics.checkNotNullParameter(uiModel, "uiModel");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        String b11 = Nk.a.b("LOCAL_", n.a());
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b value = this.f91311a.e().getValue();
        b.c cVar = value instanceof b.c ? (b.c) value : null;
        if (uiModel instanceof z0.e) {
            z0.e eVar = (z0.e) uiModel;
            return new g.a.d(chatId, b11, eVar.b(), z11, eVar.d(), eVar.c(), cVar != null ? cVar.c() : null, cVar != null ? cVar.b() : null);
        }
        if (uiModel instanceof z0.d) {
            z0.d dVar = (z0.d) uiModel;
            ImageDTO c11 = dVar.c();
            if (c11 != null) {
                return new g.a.c(chatId, b11, dVar.b(), z11, c11);
            }
            throw new IllegalStateException("ImageDTO is null for ImageMessage");
        }
        if (uiModel instanceof z0.c) {
            z0.c cVar2 = (z0.c) uiModel;
            FileDTO c12 = cVar2.c();
            if (c12 != null) {
                return new g.a.b(chatId, b11, cVar2.b(), z11, c12);
            }
            throw new IllegalStateException("FileDTO is null for FileMessage");
        }
        if (uiModel instanceof z0.a) {
            z0.a aVar = (z0.a) uiModel;
            return new g.a.C1635a(chatId, n.a(), aVar.b(), z11, aVar.c(), null);
        }
        if (!(uiModel instanceof z0.b)) {
            throw new o();
        }
        z0.b bVar = (z0.b) uiModel;
        return new g.a.C1635a(chatId, n.a(), bVar.b(), z11, bVar.d(), bVar.c());
    }
}
