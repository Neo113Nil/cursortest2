package ru.ozon.app.android.account.favorites.seller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "it", "", "", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SellerFavoriteServiceImpl$fillSellerFavoritesCache$2 extends AbstractC7737t implements Function1<Map<Long, ? extends Boolean>, Unit> {
    final /* synthetic */ SellerFavoriteServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerFavoriteServiceImpl$fillSellerFavoritesCache$2(SellerFavoriteServiceImpl sellerFavoriteServiceImpl) {
        super(1);
        this.this$0 = sellerFavoriteServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<Long, ? extends Boolean> map) {
        invoke2((Map<Long, Boolean>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<Long, Boolean> map) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.this$0.sessionFavorites;
        concurrentHashMap.putAll(map);
    }
}
