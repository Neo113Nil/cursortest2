package ru.ozon.app.android.composer.network.prefetch;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ozon/app/android/composer/network/prefetch/Deeplink;", "Lru/ozon/app/android/composer/network/prefetch/FinalRequestInfo;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerPrefetchedUrlsHolderImpl$remove$1 extends AbstractC7737t implements Function1<Map.Entry<? extends String, ? extends FinalRequestInfo>, Boolean> {
    final /* synthetic */ CacheGroup $cacheGroup;
    final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerPrefetchedUrlsHolderImpl$remove$1(String str, CacheGroup cacheGroup) {
        super(1);
        this.$url = str;
        this.$cacheGroup = cacheGroup;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Map.Entry<String, FinalRequestInfo> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it.getValue().getUrl(), this.$url) && Intrinsics.d(it.getValue().getCacheGroup(), this.$cacheGroup));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends FinalRequestInfo> entry) {
        return invoke2((Map.Entry<String, FinalRequestInfo>) entry);
    }
}
