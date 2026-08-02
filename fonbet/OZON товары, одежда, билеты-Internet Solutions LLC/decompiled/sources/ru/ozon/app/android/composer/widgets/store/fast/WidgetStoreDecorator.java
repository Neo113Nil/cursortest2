package ru.ozon.app.android.composer.widgets.store.fast;

import j20.InterfaceC7243a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.C8426f;
import n20.i;
import n20.k;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001c\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u001b\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ%\u0010\u001e\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/widgets/store/fast/WidgetStoreDecorator;", "Ln20/k;", "Lm20/a;", "Ll20/c;", "Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore;", "widgetStore", "Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore2;", "widgetStore2", "<init>", "(Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore;Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore2;)V", "Ln20/i;", "widget", "", "insert", "(Ln20/i;)V", "", "key", "", "containsWidget", "(Ljava/lang/String;)Z", "", "version", "", "Lj20/a;", "", "getConfigs", "(Ljava/lang/String;J)Ljava/util/Collection;", "Ln20/f;", "getViewMappers", "", "getViewMapper", "(I)Lm20/a;", "Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore;", "Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore2;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetStoreDecorator implements k<InterfaceC8046a<?, ? extends c>> {

    @NotNull
    private final FastWidgetStore widgetStore;

    @NotNull
    private final FastWidgetStore2 widgetStore2;

    public WidgetStoreDecorator(@NotNull FastWidgetStore widgetStore, @NotNull FastWidgetStore2 widgetStore2) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(widgetStore2, "widgetStore2");
        this.widgetStore = widgetStore;
        this.widgetStore2 = widgetStore2;
    }

    @Override // n20.k
    public boolean containsWidget(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.widgetStore2.containsWidget(key) || this.widgetStore.containsWidget(key);
    }

    @Override // n20.k
    @NotNull
    public Collection<InterfaceC7243a<? extends Object>> getConfigs(@NotNull String key, long version) {
        Intrinsics.checkNotNullParameter(key, "key");
        return C7714v.p0(this.widgetStore.getConfigs(key, version), this.widgetStore2.getConfigs(key, version));
    }

    @Override // n20.k
    public InterfaceC8046a<?, ? extends c> getViewMapper(int key) {
        InterfaceC8046a<?, ? extends c> viewMapper = this.widgetStore2.getViewMapper(key);
        return viewMapper == null ? this.widgetStore.getViewMapper(key) : viewMapper;
    }

    @Override // n20.k
    public Collection<C8426f<InterfaceC8046a<?, ? extends c>>> getViewMappers(@NotNull String key, long version) {
        Intrinsics.checkNotNullParameter(key, "key");
        Collection<C8426f<InterfaceC8046a<?, ? extends c>>> viewMappers = this.widgetStore2.getViewMappers(key, version);
        if (viewMappers != null) {
            if (viewMappers.isEmpty()) {
                viewMappers = null;
            }
            if (viewMappers != null) {
                return viewMappers;
            }
        }
        return this.widgetStore.getViewMappers(key, version);
    }

    @Override // n20.k
    public void insert(@NotNull i widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        if (widget instanceof Widget2) {
            this.widgetStore2.insert(widget);
        } else {
            this.widgetStore.insert(widget);
        }
    }
}
