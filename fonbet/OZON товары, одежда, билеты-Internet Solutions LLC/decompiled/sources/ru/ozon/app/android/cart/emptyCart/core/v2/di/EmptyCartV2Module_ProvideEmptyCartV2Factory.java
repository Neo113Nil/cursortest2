package ru.ozon.app.android.cart.emptyCart.core.v2.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cart.emptyCart.core.v2.data.EmptyCartV2Config;
import ru.ozon.app.android.cart.emptyCart.core.v2.presentation.EmptyCartV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class EmptyCartV2Module_ProvideEmptyCartV2Factory implements e<Set<Widget2>> {
    public static Set<Widget2> provideEmptyCartV2(EmptyCartV2Module emptyCartV2Module, EmptyCartV2Config emptyCartV2Config, EmptyCartV2ViewMapper emptyCartV2ViewMapper) {
        Set<Widget2> provideEmptyCartV2 = emptyCartV2Module.provideEmptyCartV2(emptyCartV2Config, emptyCartV2ViewMapper);
        j.d(provideEmptyCartV2);
        return provideEmptyCartV2;
    }
}
