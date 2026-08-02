package ru.ozon.app.android.cart.configurator;

import android.content.SharedPreferences;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitSwipeConfigurator$sharedPreferences$2 extends AbstractC7737t implements Function0<SharedPreferences> {
    final /* synthetic */ CartSplitSwipeConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitSwipeConfigurator$sharedPreferences$2(CartSplitSwipeConfigurator cartSplitSwipeConfigurator) {
        super(0);
        this.this$0 = cartSplitSwipeConfigurator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = this.this$0.getReferences();
        StorageComponentApi storageComponentApi = (StorageComponentApi) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(StorageComponentApi.class));
        if (storageComponentApi != null) {
            return storageComponentApi.getSharedPreferences();
        }
        return null;
    }
}
