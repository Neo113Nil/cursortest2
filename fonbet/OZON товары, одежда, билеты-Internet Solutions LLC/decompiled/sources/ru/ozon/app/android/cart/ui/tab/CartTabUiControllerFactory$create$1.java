package ru.ozon.app.android.cart.ui.tab;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerNavigator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/ComposerNavigator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartTabUiControllerFactory$create$1 extends AbstractC7737t implements Function0<ComposerNavigator> {
    final /* synthetic */ CartTabUiControllerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTabUiControllerFactory$create$1(CartTabUiControllerFactory cartTabUiControllerFactory) {
        super(0);
        this.this$0 = cartTabUiControllerFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComposerNavigator invoke() {
        ComposerNavigator composerNavigator;
        composerNavigator = this.this$0.getComposerNavigator();
        return composerNavigator;
    }
}
