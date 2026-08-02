package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshTileViewHolderV2$attachDelegate$3 extends AbstractC7737t implements Function0<FreshTileModel> {
    final /* synthetic */ FreshTileViewHolderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileViewHolderV2$attachDelegate$3(FreshTileViewHolderV2 freshTileViewHolderV2) {
        super(0);
        this.this$0 = freshTileViewHolderV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FreshTileModel invoke() {
        return this.this$0.getBoundData();
    }
}
