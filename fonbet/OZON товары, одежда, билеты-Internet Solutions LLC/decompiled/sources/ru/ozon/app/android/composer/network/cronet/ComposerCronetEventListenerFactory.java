package ru.ozon.app.android.composer.network.cronet;

import Qj0.D;
import Sc.InterfaceC4008j;
import Sc.k;
import We.InterfaceC4865g;
import We.v;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.prefetch.PrefetchEventInterceptor;
import ru.ozon.app.android.network.cronet.CronetEventListenerFactory;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/composer/network/cronet/ComposerCronetEventListenerFactory;", "Lru/ozon/app/android/network/cronet/CronetEventListenerFactory;", "Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;", "interceptor", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;Landroid/content/Context;)V", "LWe/g;", "call", "LWe/v;", "create", "(LWe/g;)LWe/v;", "Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;", "Landroid/content/Context;", "LQj0/D;", "ozonListenerFactory$delegate", "LSc/j;", "getOzonListenerFactory", "()LQj0/D;", "ozonListenerFactory", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerCronetEventListenerFactory implements CronetEventListenerFactory {

    @NotNull
    private final Context context;
    private final PrefetchEventInterceptor interceptor;

    /* renamed from: ozonListenerFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonListenerFactory;

    public ComposerCronetEventListenerFactory(PrefetchEventInterceptor prefetchEventInterceptor, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.interceptor = prefetchEventInterceptor;
        this.context = context;
        this.ozonListenerFactory = k.b(new ComposerCronetEventListenerFactory$ozonListenerFactory$2(this));
    }

    private final D getOzonListenerFactory() {
        return (D) this.ozonListenerFactory.getValue();
    }

    @Override // We.v.c
    @NotNull
    public v create(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        v create = getOzonListenerFactory().create(call);
        v vVar = v.NONE;
        return Intrinsics.d(create, vVar) ? vVar : new ComposerCronetEventListener(create);
    }
}
