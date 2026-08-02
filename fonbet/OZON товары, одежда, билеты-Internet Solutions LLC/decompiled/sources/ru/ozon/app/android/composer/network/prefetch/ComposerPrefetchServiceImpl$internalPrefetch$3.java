package ru.ozon.app.android.composer.network.prefetch;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerPrefetchServiceImpl$internalPrefetch$3 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ CacheGroup $cacheGroup;
    final /* synthetic */ String $deeplink;
    final /* synthetic */ String $requestUrl;
    final /* synthetic */ ComposerPrefetchServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerPrefetchServiceImpl$internalPrefetch$3(ComposerPrefetchServiceImpl composerPrefetchServiceImpl, String str, CacheGroup cacheGroup, String str2) {
        super(1);
        this.this$0 = composerPrefetchServiceImpl;
        this.$deeplink = str;
        this.$cacheGroup = cacheGroup;
        this.$requestUrl = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ComposerPrefetchServiceImpl composerPrefetchServiceImpl = this.this$0;
        String str = this.$deeplink;
        CacheGroup cacheGroup = this.$cacheGroup;
        Intrinsics.f(th2);
        composerPrefetchServiceImpl.onError(str, cacheGroup, th2, this.$requestUrl);
    }
}
