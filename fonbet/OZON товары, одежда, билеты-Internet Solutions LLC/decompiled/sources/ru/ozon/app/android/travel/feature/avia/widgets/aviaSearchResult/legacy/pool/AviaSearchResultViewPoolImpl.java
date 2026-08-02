package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool;

import B0.A0;
import Nk.a;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u000b\"\b\b\u0000\u0010\u0013*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0011R$\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dRD\u0010!\u001a2\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001f0\u001ej\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001f` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPoolImpl;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "Lkotlin/reflect/d;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewProvider;", "viewProviders", "<init>", "(Ljava/util/Map;)V", "Landroid/content/Context;", "context", "", "setContext", "(Landroid/content/Context;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "setLifecycleOwner", "(Landroidx/lifecycle/J;)V", "Landroid/view/View;", "T", "type", "acquire", "(Lkotlin/reflect/d;)Landroid/view/View;", "view", "release", "(Lkotlin/reflect/d;Landroid/view/View;)V", "owner", "onCreate", "onDestroy", "Ljava/util/Map;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "pool", "Ljava/util/HashMap;", "Landroidx/lifecycle/J;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultViewPoolImpl implements AviaSearchResultViewPool, DefaultLifecycleObserver {
    private Context context;
    private J lifecycleOwner;

    @NotNull
    private final HashMap<d<?>, List<View>> pool;

    @NotNull
    private final Map<d<?>, AviaSearchResultViewProvider> viewProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public AviaSearchResultViewPoolImpl(@NotNull Map<d<?>, ? extends AviaSearchResultViewProvider> viewProviders) {
        Intrinsics.checkNotNullParameter(viewProviders, "viewProviders");
        this.viewProviders = viewProviders;
        this.pool = new HashMap<>();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool
    @NotNull
    public <T extends View> T acquire(@NotNull d<T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        List<View> list = this.pool.get(type);
        if (list == null) {
            throw new IllegalArgumentException(a.b("Unknown view type: ", type.u()));
        }
        if (!list.isEmpty()) {
            View remove = list.remove(C7714v.P(list));
            Intrinsics.g(remove, "null cannot be cast to non-null type T of ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPoolImpl.acquire");
            return (T) remove;
        }
        AviaSearchResultViewProvider aviaSearchResultViewProvider = this.viewProviders.get(type);
        if (aviaSearchResultViewProvider == null) {
            throw new UnsupportedOperationException(A0.b("Cannot create a view of type ", type.u(), ". No provider is found in viewProviders"));
        }
        Context context = this.context;
        if (context == null) {
            Intrinsics.n("context");
            throw null;
        }
        T t2 = (T) aviaSearchResultViewProvider.create(context);
        Intrinsics.g(t2, "null cannot be cast to non-null type T of ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPoolImpl.acquire");
        return t2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        for (Map.Entry<d<?>, AviaSearchResultViewProvider> entry : this.viewProviders.entrySet()) {
            d<?> key = entry.getKey();
            AviaSearchResultViewProvider value = entry.getValue();
            ArrayList arrayList = new ArrayList(value.getInitialAmount());
            int initialAmount = value.getInitialAmount();
            for (int i11 = 0; i11 < initialAmount; i11++) {
                Context context = this.context;
                if (context == null) {
                    Intrinsics.n("context");
                    throw null;
                }
                arrayList.add(value.create(context));
            }
            this.pool.put(key, arrayList);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.pool.clear();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool
    public <T extends View> void release(@NotNull d<T> type, @NotNull T view) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(view, "view");
        List<View> list = this.pool.get(type);
        if (list != null) {
            list.add(view);
        }
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool
    public void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool
    public void setLifecycleOwner(@NotNull J lifecycleOwner) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.lifecycleOwner = lifecycleOwner;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
    }
}
