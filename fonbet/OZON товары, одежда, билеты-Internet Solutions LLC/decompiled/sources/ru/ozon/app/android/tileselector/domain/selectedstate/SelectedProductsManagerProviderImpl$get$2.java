package ru.ozon.app.android.tileselector.domain.selectedstate;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SelectedProductsManagerProviderImpl$get$2 extends AbstractC7737t implements Function0<SelectedProductsManager> {
    final /* synthetic */ SelectedProductsManager $default;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectedProductsManagerProviderImpl$get$2(SelectedProductsManager selectedProductsManager) {
        super(0);
        this.$default = selectedProductsManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SelectedProductsManager invoke() {
        return this.$default;
    }
}
