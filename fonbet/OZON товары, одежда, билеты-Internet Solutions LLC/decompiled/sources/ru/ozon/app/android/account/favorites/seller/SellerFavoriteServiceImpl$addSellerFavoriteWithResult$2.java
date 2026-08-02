package ru.ozon.app.android.account.favorites.seller;

import Nc.C3667a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SellerFavoriteServiceImpl$addSellerFavoriteWithResult$2 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ long $sellerId;
    final /* synthetic */ SellerFavoriteServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerFavoriteServiceImpl$addSellerFavoriteWithResult$2(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, long j11) {
        super(1);
        this.this$0 = sellerFavoriteServiceImpl;
        this.$sellerId = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ConcurrentHashMap concurrentHashMap;
        C3667a c3667a;
        concurrentHashMap = this.this$0.sessionFavorites;
        long j11 = this.$sellerId;
        SellerFavoriteServiceImpl sellerFavoriteServiceImpl = this.this$0;
        concurrentHashMap.put(Long.valueOf(j11), Boolean.FALSE);
        c3667a = sellerFavoriteServiceImpl.sessionFavoritesSubject;
        c3667a.onNext(concurrentHashMap);
    }
}
