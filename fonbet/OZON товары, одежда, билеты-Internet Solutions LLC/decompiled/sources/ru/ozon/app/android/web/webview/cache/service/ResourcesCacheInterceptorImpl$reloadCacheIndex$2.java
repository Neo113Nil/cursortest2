package ru.ozon.app.android.web.webview.cache.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ResourcesCacheInterceptorImpl$reloadCacheIndex$2 extends AbstractC7737t implements Function1<List<? extends String>, Unit> {
    final /* synthetic */ ResourcesCacheInterceptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResourcesCacheInterceptorImpl$reloadCacheIndex$2(ResourcesCacheInterceptorImpl resourcesCacheInterceptorImpl) {
        super(1);
        this.this$0 = resourcesCacheInterceptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
        invoke2((List<String>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<String> list) {
        this.this$0.cacheIndex = list;
    }
}
