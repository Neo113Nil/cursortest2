package ru.ozon.app.android.account.orders.emptyscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.emptyscreenfactory.DefaultEmptyScreenFactory;
import ru.ozon.app.android.emptyscreen.AntibotDefaultPageIssue;
import ru.ozon.app.android.emptyscreen.OfflineWidget;
import ru.ozon.app.android.emptyscreen.OfflineWidgetsProvider;
import ru.ozon.app.android.utils.AppType;
import z00.c;
import z00.d;
import z00.e;
import z00.f;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenWithBarcodeFactory;", "Lru/ozon/app/android/composer/emptyscreenfactory/DefaultEmptyScreenFactory;", "Lru/ozon/app/android/account/orders/emptyscreen/BarcodeStatusWidgetFactory;", "barcodeStatusWidgetFactory", "Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenStatusWidgetFactory;", "emptyScreenStatusWidgetFactory", "Lru/ozon/app/android/account/orders/emptyscreen/OzonBankOfflineInfoWidgetFactory;", "ozonBankOfflineInfoWidgetFactory", "Lru/ozon/app/android/account/orders/emptyscreen/BarcodeWidgetFactory;", "barcodeWidgetFactory", "Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenIslandSeparatorFactory;", "islandSeparatorFactory", "Lru/ozon/app/android/account/orders/emptyscreen/InternalTeethFactory;", "internalTeethFactory", "Lru/ozon/app/android/account/orders/emptyscreen/ExtendBackgroundFactory;", "extendBackgroundFactory", "Lru/ozon/app/android/emptyscreen/OfflineWidgetsProvider;", "offlineWidgetsProvider", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/account/orders/emptyscreen/BarcodeStatusWidgetFactory;Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenStatusWidgetFactory;Lru/ozon/app/android/account/orders/emptyscreen/OzonBankOfflineInfoWidgetFactory;Lru/ozon/app/android/account/orders/emptyscreen/BarcodeWidgetFactory;Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenIslandSeparatorFactory;Lru/ozon/app/android/account/orders/emptyscreen/InternalTeethFactory;Lru/ozon/app/android/account/orders/emptyscreen/ExtendBackgroundFactory;Lru/ozon/app/android/emptyscreen/OfflineWidgetsProvider;Lru/ozon/app/android/utils/AppType;)V", "Lz00/c;", "createBarcodeOfflinePage", "()Lz00/c;", "createNoScreenOfflinePage", "Lz00/f$c;", "issue", "createServerIssueOfflinePage", "(Lz00/f$c;)Lz00/c;", "Lru/ozon/app/android/emptyscreen/AntibotDefaultPageIssue;", "createAntibotDefaultPage", "(Lru/ozon/app/android/emptyscreen/AntibotDefaultPageIssue;)Lz00/c;", "Lz00/e;", "", "appendTravelWidgets", "(Lz00/e;)V", "Lz00/f;", "createErrorState", "(Lz00/f;)Lz00/c;", "Lru/ozon/app/android/account/orders/emptyscreen/BarcodeStatusWidgetFactory;", "Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenStatusWidgetFactory;", "Lru/ozon/app/android/account/orders/emptyscreen/OzonBankOfflineInfoWidgetFactory;", "Lru/ozon/app/android/account/orders/emptyscreen/BarcodeWidgetFactory;", "Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenIslandSeparatorFactory;", "Lru/ozon/app/android/account/orders/emptyscreen/InternalTeethFactory;", "Lru/ozon/app/android/account/orders/emptyscreen/ExtendBackgroundFactory;", "Lru/ozon/app/android/emptyscreen/OfflineWidgetsProvider;", "Lru/ozon/app/android/utils/AppType;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmptyScreenWithBarcodeFactory implements DefaultEmptyScreenFactory {

    @NotNull
    private final AppType appType;

    @NotNull
    private final BarcodeStatusWidgetFactory barcodeStatusWidgetFactory;

    @NotNull
    private final BarcodeWidgetFactory barcodeWidgetFactory;

    @NotNull
    private final EmptyScreenStatusWidgetFactory emptyScreenStatusWidgetFactory;

    @NotNull
    private final ExtendBackgroundFactory extendBackgroundFactory;

    @NotNull
    private final InternalTeethFactory internalTeethFactory;

    @NotNull
    private final EmptyScreenIslandSeparatorFactory islandSeparatorFactory;

    @NotNull
    private final OfflineWidgetsProvider offlineWidgetsProvider;

    @NotNull
    private final OzonBankOfflineInfoWidgetFactory ozonBankOfflineInfoWidgetFactory;

    public EmptyScreenWithBarcodeFactory(@NotNull BarcodeStatusWidgetFactory barcodeStatusWidgetFactory, @NotNull EmptyScreenStatusWidgetFactory emptyScreenStatusWidgetFactory, @NotNull OzonBankOfflineInfoWidgetFactory ozonBankOfflineInfoWidgetFactory, @NotNull BarcodeWidgetFactory barcodeWidgetFactory, @NotNull EmptyScreenIslandSeparatorFactory islandSeparatorFactory, @NotNull InternalTeethFactory internalTeethFactory, @NotNull ExtendBackgroundFactory extendBackgroundFactory, @NotNull OfflineWidgetsProvider offlineWidgetsProvider, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(barcodeStatusWidgetFactory, "barcodeStatusWidgetFactory");
        Intrinsics.checkNotNullParameter(emptyScreenStatusWidgetFactory, "emptyScreenStatusWidgetFactory");
        Intrinsics.checkNotNullParameter(ozonBankOfflineInfoWidgetFactory, "ozonBankOfflineInfoWidgetFactory");
        Intrinsics.checkNotNullParameter(barcodeWidgetFactory, "barcodeWidgetFactory");
        Intrinsics.checkNotNullParameter(islandSeparatorFactory, "islandSeparatorFactory");
        Intrinsics.checkNotNullParameter(internalTeethFactory, "internalTeethFactory");
        Intrinsics.checkNotNullParameter(extendBackgroundFactory, "extendBackgroundFactory");
        Intrinsics.checkNotNullParameter(offlineWidgetsProvider, "offlineWidgetsProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.barcodeStatusWidgetFactory = barcodeStatusWidgetFactory;
        this.emptyScreenStatusWidgetFactory = emptyScreenStatusWidgetFactory;
        this.ozonBankOfflineInfoWidgetFactory = ozonBankOfflineInfoWidgetFactory;
        this.barcodeWidgetFactory = barcodeWidgetFactory;
        this.islandSeparatorFactory = islandSeparatorFactory;
        this.internalTeethFactory = internalTeethFactory;
        this.extendBackgroundFactory = extendBackgroundFactory;
        this.offlineWidgetsProvider = offlineWidgetsProvider;
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendTravelWidgets(e eVar) {
        AppType appType = this.appType;
        if (appType == AppType.f94580BX || appType == AppType.TRAVEL) {
            for (OfflineWidget offlineWidget : this.offlineWidgetsProvider.provideWidgets()) {
                eVar.a(offlineWidget.getVersion(), offlineWidget.getVertical(), offlineWidget.getName(), offlineWidget.getState());
            }
        }
    }

    private final c createAntibotDefaultPage(AntibotDefaultPageIssue issue) {
        return d.b(new EmptyScreenWithBarcodeFactory$createAntibotDefaultPage$1(this, issue));
    }

    private final c createBarcodeOfflinePage() {
        return d.b(new EmptyScreenWithBarcodeFactory$createBarcodeOfflinePage$1(this));
    }

    private final c createNoScreenOfflinePage() {
        return d.b(new EmptyScreenWithBarcodeFactory$createNoScreenOfflinePage$1(this));
    }

    private final c createServerIssueOfflinePage(f.c issue) {
        return d.b(new EmptyScreenWithBarcodeFactory$createServerIssueOfflinePage$1(this, issue));
    }

    @Override // E00.a
    @NotNull
    public c createErrorState(@NotNull f issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        return issue instanceof f.a ? createBarcodeOfflinePage() : issue instanceof f.b ? createNoScreenOfflinePage() : issue instanceof f.c ? createServerIssueOfflinePage((f.c) issue) : issue instanceof AntibotDefaultPageIssue ? createAntibotDefaultPage((AntibotDefaultPageIssue) issue) : d.a();
    }
}
