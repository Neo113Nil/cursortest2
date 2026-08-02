package ru.ozon.app.android.search.catalog.components.meta;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntityKt;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteEntityUpdateKey;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "upd", "Lru/ozon/app/android/search/catalog/components/meta/MetaVO;", "vo", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/search/catalog/components/meta/MetaVO;)Lru/ozon/app/android/search/catalog/components/meta/MetaVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class MetaWidgetViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, MetaVO, MetaVO> {
    public static final MetaWidgetViewMapper$updateConsumer$1 INSTANCE = new MetaWidgetViewMapper$updateConsumer$1();

    MetaWidgetViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final MetaVO invoke(a.J.InterfaceC0007a upd, MetaVO vo) {
        Intrinsics.checkNotNullParameter(upd, "upd");
        Intrinsics.checkNotNullParameter(vo, "vo");
        return !(upd instanceof FavoriteEntityUpdateKey) ? vo : MetaVO.copy$default(vo, 0L, null, null, null, null, false, FavoriteEntityKt.compareAndGetModel(vo.getFavoriteEntityButton(), ((FavoriteEntityUpdateKey) upd).getNewFavoriteEntity()), null, 191, null);
    }
}
