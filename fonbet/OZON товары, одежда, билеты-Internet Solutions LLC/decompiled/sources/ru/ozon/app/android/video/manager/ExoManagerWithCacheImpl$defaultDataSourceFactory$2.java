package ru.ozon.app.android.video.manager;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import p3.j;
import p3.p;
import ru.ozon.app.android.video.player.CacheObserver;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/j$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "()Lp3/j$a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ExoManagerWithCacheImpl$defaultDataSourceFactory$2 extends AbstractC7737t implements Function0<j.a> {
    final /* synthetic */ ExoManagerWithCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExoManagerWithCacheImpl$defaultDataSourceFactory$2(ExoManagerWithCacheImpl exoManagerWithCacheImpl) {
        super(0);
        this.this$0 = exoManagerWithCacheImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final j.a invoke() {
        Context context;
        p httpDataSourceFactory;
        CacheObserver cacheObserver;
        context = this.this$0.context;
        httpDataSourceFactory = this.this$0.getHttpDataSourceFactory();
        j.a aVar = new j.a(context, httpDataSourceFactory);
        cacheObserver = this.this$0.cacheObserver;
        aVar.a(cacheObserver);
        return aVar;
    }
}
