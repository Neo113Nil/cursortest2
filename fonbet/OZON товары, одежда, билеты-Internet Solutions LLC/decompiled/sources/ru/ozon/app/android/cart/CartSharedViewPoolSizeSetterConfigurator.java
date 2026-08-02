package ru.ozon.app.android.cart;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementType;
import ru.ozon.app.android.composer.ComposerViewPoolProvider;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/CartSharedViewPoolSizeSetterConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onComposerInitialized", "", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSharedViewPoolSizeSetterConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int textAtomViewType = DynamicElementType.TEXT_ATOM.getId();
    private static final int priceAtomViewType = DynamicElementType.PRICE_ATOM.getId();
    private static final int priceWithTitleAtomViewType = DynamicElementType.PRICE_WITH_TITLE_ATOM.getId();
    private static final int verticalSpacerViewType = DynamicElementType.VERTICAL_SPACER.getId();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/CartSharedViewPoolSizeSetterConfigurator$Companion;", "", "<init>", "()V", "", "TEXT_ATOM_POOL_SIZE", "I", "PRICE_ATOM_POOL_SIZE", "PRICE_WITH_TITLE_ATOM_POOL_SIZE", "VERTICAL_SPACER_VIEW_TYPE", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComposerViewPoolProvider composerViewPoolProvider;
        RecyclerView.u viewPool;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (composerViewPoolProvider = references.getComposerViewPoolProvider()) == null || (viewPool = composerViewPoolProvider.getViewPool()) == null) {
            return;
        }
        viewPool.setMaxRecycledViews(textAtomViewType, 10);
        viewPool.setMaxRecycledViews(priceAtomViewType, 7);
        viewPool.setMaxRecycledViews(priceWithTitleAtomViewType, 7);
        viewPool.setMaxRecycledViews(verticalSpacerViewType, 15);
    }
}
