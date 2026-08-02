package ru.ozon.app.android.favorites.domain.favoritemanager.eventmap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Map;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FavoriteEventMapImpl$observeEvents$1 extends AbstractC7737t implements Function1<Map<Long, ? extends FavoriteEvent>, Boolean> {
    final /* synthetic */ long $favoriteId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEventMapImpl$observeEvents$1(long j11) {
        super(1);
        this.$favoriteId = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map<Long, ? extends FavoriteEvent> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.containsKey(Long.valueOf(this.$favoriteId)));
    }
}
