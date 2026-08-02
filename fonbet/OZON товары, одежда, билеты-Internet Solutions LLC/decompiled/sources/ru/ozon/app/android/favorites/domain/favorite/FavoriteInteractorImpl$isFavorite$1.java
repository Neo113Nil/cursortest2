package ru.ozon.app.android.favorites.domain.favorite;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteInteractorImpl$isFavorite$1 extends AbstractC7737t implements Function1<List<? extends Long>, Boolean> {
    final /* synthetic */ long $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteInteractorImpl$isFavorite$1(long j11) {
        super(1);
        this.$productId = j11;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(List<Long> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.contains(Long.valueOf(this.$productId)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(List<? extends Long> list) {
        return invoke2((List<Long>) list);
    }
}
