package ru.ozon.app.android.account.favorites.seller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\b\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "", "", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/List;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SellerFavoriteServiceImpl$fillSellerFavoritesCache$1 extends AbstractC7737t implements Function1<List<? extends Long>, Map<Long, ? extends Boolean>> {
    public static final SellerFavoriteServiceImpl$fillSellerFavoritesCache$1 INSTANCE = new SellerFavoriteServiceImpl$fillSellerFavoritesCache$1();

    SellerFavoriteServiceImpl$fillSellerFavoritesCache$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Map<Long, ? extends Boolean> invoke(List<? extends Long> list) {
        return invoke2((List<Long>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Map<Long, Boolean> invoke2(List<Long> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<Long> list = it;
        int h11 = U.h(C7714v.z(list, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : list) {
            ((Number) obj).longValue();
            linkedHashMap.put(obj, Boolean.TRUE);
        }
        return linkedHashMap;
    }
}
