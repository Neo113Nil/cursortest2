package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.actionHandlers.SetTeensModeActionHandler;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.multi.NavLikezoneCaruselMultiMapper;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.single.NavLikezoneCaruselSingleMapper;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/di/NavLikezoneCaruselComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lk20/g;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/multi/NavLikezoneCaruselMultiMapper;", "navLikezoneCaruselMultiMapper$delegate", "LSc/j;", "getNavLikezoneCaruselMultiMapper", "()Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/multi/NavLikezoneCaruselMultiMapper;", "navLikezoneCaruselMultiMapper", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/single/NavLikezoneCaruselSingleMapper;", "navLikezoneCaruselSingleMapper$delegate", "getNavLikezoneCaruselSingleMapper", "()Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/single/NavLikezoneCaruselSingleMapper;", "navLikezoneCaruselSingleMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/c;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavLikezoneCaruselComponent implements InterfaceC6958a {

    /* renamed from: navLikezoneCaruselMultiMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navLikezoneCaruselMultiMapper;

    /* renamed from: navLikezoneCaruselSingleMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navLikezoneCaruselSingleMapper;

    @NotNull
    private final C7475g storage;

    public NavLikezoneCaruselComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.navLikezoneCaruselMultiMapper = k.b(NavLikezoneCaruselComponent$navLikezoneCaruselMultiMapper$2.INSTANCE);
        this.navLikezoneCaruselSingleMapper = k.b(NavLikezoneCaruselComponent$navLikezoneCaruselSingleMapper$2.INSTANCE);
    }

    @NotNull
    public final c getCustomActionHandlersStore() {
        return ((CustomActionHandlersComponentApi) this.storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory().create(SetTeensModeActionHandler.class);
    }

    @NotNull
    public final NavLikezoneCaruselMultiMapper getNavLikezoneCaruselMultiMapper() {
        return (NavLikezoneCaruselMultiMapper) this.navLikezoneCaruselMultiMapper.getValue();
    }

    @NotNull
    public final NavLikezoneCaruselSingleMapper getNavLikezoneCaruselSingleMapper() {
        return (NavLikezoneCaruselSingleMapper) this.navLikezoneCaruselSingleMapper.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
