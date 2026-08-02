package ru.ozon.app.android.favorites.deeplink;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import qZ.C9010b;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LqZ/b;", "invoke", "()LqZ/b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FavoritesEditProductFavList$getDestination$2 extends AbstractC7737t implements Function0<C9010b> {
    final /* synthetic */ FavoritesEditProductFavList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesEditProductFavList$getDestination$2(FavoritesEditProductFavList favoritesEditProductFavList) {
        super(0);
        this.this$0 = favoritesEditProductFavList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9010b invoke() {
        C9010b buildFlowConfig;
        buildFlowConfig = this.this$0.buildFlowConfig();
        return buildFlowConfig;
    }
}
