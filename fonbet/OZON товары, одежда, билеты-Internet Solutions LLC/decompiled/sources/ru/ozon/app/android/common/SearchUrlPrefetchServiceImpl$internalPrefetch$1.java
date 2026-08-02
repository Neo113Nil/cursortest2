package ru.ozon.app.android.common;

import L00.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.FinalRequestInfo;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL00/j;", "kotlin.jvm.PlatformType", "response", "", "invoke", "(LL00/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SearchUrlPrefetchServiceImpl$internalPrefetch$1 extends AbstractC7737t implements Function1<j, Unit> {
    final /* synthetic */ CacheGroup $cacheGroup;
    final /* synthetic */ String $deeplink;
    final /* synthetic */ SearchUrlPrefetchServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchUrlPrefetchServiceImpl$internalPrefetch$1(SearchUrlPrefetchServiceImpl searchUrlPrefetchServiceImpl, String str, CacheGroup cacheGroup) {
        super(1);
        this.this$0 = searchUrlPrefetchServiceImpl;
        this.$deeplink = str;
        this.$cacheGroup = cacheGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j jVar) {
        ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder;
        UrlPrefetchedEventHolder urlPrefetchedEventHolder;
        composerRunningPrefetchedRequestUrlsHolder = this.this$0.composerRunningPrefetchedRequestUrlsHolder;
        composerRunningPrefetchedRequestUrlsHolder.putIfExist(this.$deeplink, new FinalRequestInfo(jVar.h().j(), null, Boolean.FALSE, this.$cacheGroup, 2, null));
        urlPrefetchedEventHolder = this.this$0.urlPrefetchedEventHolder;
        urlPrefetchedEventHolder.onUrlPrefetched(this.$deeplink);
    }
}
