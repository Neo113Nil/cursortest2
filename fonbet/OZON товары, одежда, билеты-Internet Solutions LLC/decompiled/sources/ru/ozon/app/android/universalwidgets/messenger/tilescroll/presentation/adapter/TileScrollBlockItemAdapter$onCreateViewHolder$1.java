package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.adapter;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeKt;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.TileScrollMappingCompatKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileScrollBlockItemAdapter$onCreateViewHolder$1 extends AbstractC7737t implements Function1<FavoriteProductMolecule, Unit> {
    final /* synthetic */ TileScrollBlockItemAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollBlockItemAdapter$onCreateViewHolder$1(TileScrollBlockItemAdapter tileScrollBlockItemAdapter) {
        super(1);
        this.this$0 = tileScrollBlockItemAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductMolecule favoriteProductMolecule) {
        invoke2(favoriteProductMolecule);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteProductMolecule molecule) {
        LinkedHashMap linkedHashMap;
        d dVar;
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        Map<String, TokenizedTrackingInfo> trackingInfo = FavoriteProductMoleculeKt.getButton(molecule).getTrackingInfo();
        if (trackingInfo != null) {
            linkedHashMap = new LinkedHashMap(U.h(trackingInfo.size()));
            Iterator<T> it = trackingInfo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), TileScrollMappingCompatKt.toMessengerTrackingInfo((TokenizedTrackingInfo) entry.getValue(), FavoriteProductMoleculeKt.getAnalyticActionType(molecule)));
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            dVar = this.this$0.references;
            dVar.c().g(linkedHashMap);
        }
    }
}
