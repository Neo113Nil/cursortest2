package ru.ozon.app.android.storefront.configurators;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ComposerViewPoolProvider;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/configurators/SharedViewPoolSizeSetterConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onComposerInitialized", "", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharedViewPoolSizeSetterConfigurator extends ComposerScreenConfig.PageConfigurator {
    private static final int atomTextViewType = new TextAtom(new OzonSpannableString(), null, null, null, null, null, null, 126, null).getItemType();
    private static final int priceAtomViewType = new Price(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null).getItemType();

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComposerViewPoolProvider composerViewPoolProvider;
        RecyclerView.u viewPool;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (composerViewPoolProvider = references.getComposerViewPoolProvider()) == null || (viewPool = composerViewPoolProvider.getViewPool()) == null) {
            return;
        }
        viewPool.setMaxRecycledViews(atomTextViewType, 20);
        viewPool.setMaxRecycledViews(priceAtomViewType, 10);
    }
}
