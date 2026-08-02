package ru.ozon.app.android.composer.network.prefetch;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u00022\u000f\u0010\u0003\u001a\u000b0\u0004j\u0002`\u0005¢\u0006\u0002\b\u00022\u000b\u0010\u0006\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/network/prefetch/FinalRequestInfo;", "Lkotlin/jvm/internal/EnhancedNullability;", "<unused var>", "", "Lru/ozon/app/android/composer/network/prefetch/Deeplink;", "oldRequestInfo", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerRunningPrefetchedRequestUrlsHolderImpl$putIfExist$1 extends AbstractC7737t implements Function2<String, FinalRequestInfo, FinalRequestInfo> {
    final /* synthetic */ FinalRequestInfo $finalRequestInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerRunningPrefetchedRequestUrlsHolderImpl$putIfExist$1(FinalRequestInfo finalRequestInfo) {
        super(2);
        this.$finalRequestInfo = finalRequestInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final FinalRequestInfo invoke(String str, FinalRequestInfo oldRequestInfo) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(oldRequestInfo, "oldRequestInfo");
        return Intrinsics.d(oldRequestInfo.getIsLoading(), Boolean.TRUE) ? this.$finalRequestInfo : oldRequestInfo;
    }
}
