package ru.ozon.app.android.composer.network.cronet;

import Qj0.D;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.network.prefetch.PrefetchEventInterceptor;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQj0/D;", "invoke", "()LQj0/D;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ComposerCronetEventListenerFactory$ozonListenerFactory$2 extends AbstractC7737t implements Function0<D> {
    final /* synthetic */ ComposerCronetEventListenerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerCronetEventListenerFactory$ozonListenerFactory$2(ComposerCronetEventListenerFactory composerCronetEventListenerFactory) {
        super(0);
        this.this$0 = composerCronetEventListenerFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final D invoke() {
        Context context;
        PrefetchEventInterceptor prefetchEventInterceptor;
        context = this.this$0.context;
        prefetchEventInterceptor = this.this$0.interceptor;
        return new D(context, prefetchEventInterceptor);
    }
}
