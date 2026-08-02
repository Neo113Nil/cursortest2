package ru.ozon.android.messenger.framework.core.initialization.di;

import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.di.C;
import ru.ozon.android.messenger.framework.di.F;
import ru.ozon.android.messenger.framework.di.InterfaceC9376a;
import ru.ozon.android.messenger.framework.di.l;
import ru.ozon.android.messenger.framework.di.x;
import ru.ozon.android.messenger.framework.presentation.ai.C9413c;
import ru.ozon.android.messenger.framework.presentation.chatlist.C9488a;
import ru.ozon.android.messenger.framework.presentation.messenger.j;
import ru.ozon.android.messenger.framework.presentation.search.C9516a;

/* loaded from: classes6.dex */
public interface c extends x, ru.ozon.android.messenger.framework.composer.network.di.b, ru.ozon.android.messenger.framework.composer.di.dependencies.a, F, C {

    /* loaded from: classes10.dex */
    public interface a {
    }

    void B(@NotNull ru.ozon.android.messenger.blocks.showTextButton.c cVar);

    void D(@NotNull j jVar);

    void G(@NotNull ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.a aVar);

    void H(@NotNull ru.ozon.android.messenger.framework.presentation.common.screen.j jVar);

    void I(@NotNull ru.ozon.android.messenger.framework.presentation.messenger.c cVar);

    void J(@NotNull ru.ozon.android.messenger.blocks.curtain.a aVar);

    void b(@NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.d dVar);

    void c(@NotNull C9516a c9516a);

    void d(@NotNull ru.ozon.android.messenger.framework.presentation.chatlist.popup.c cVar);

    void f(@NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.report.a aVar);

    void g(@NotNull ru.ozon.android.messenger.blocks.messagetext.b bVar);

    void i(@NotNull ru.ozon.android.messenger.blocks.messageimage.presentation.a aVar);

    @NotNull
    l.a j();

    void l(@NotNull ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.a aVar);

    @NotNull
    InterfaceC9376a.InterfaceC1633a m();

    void q(@NotNull ru.ozon.android.messenger.blocks.input.di.c cVar);

    void r(@NotNull ru.ozon.android.messenger.blocks.disclaimer.modal.c cVar);

    void t(@NotNull ru.ozon.android.messenger.framework.presentation.common.screen.compose.a aVar);

    void u(@NotNull C9488a c9488a);

    @NotNull
    ru.ozon.android.messenger.framework.core.initialization.d x();

    void y(@NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a aVar);

    void z(@NotNull C9413c c9413c);
}
