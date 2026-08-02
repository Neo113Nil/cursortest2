package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.di;

import GV.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data.InfoPopupV4Mapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data.InfoPopupV4StickyMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyViewModel;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0019R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/di/InfoPopupV4Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4Mapper;", "getInfoPopupV4Mapper", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4Mapper;", "infoPopupV4Mapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4StickyMapper;", "getInfoPopupV4StickyMapper", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4StickyMapper;", "infoPopupV4StickyMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyViewModel;", "viewModel", "Companion", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InfoPopupV4Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/di/InfoPopupV4Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/di/InfoPopupV4Component;", "create", "(Lk20/g;)Lk20/e;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InfoPopupV4Component create$lambda$0(C7475g c7475g) {
            return new InfoPopupV4Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<InfoPopupV4Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(InfoPopupV4Component.class), new a(storage, 8));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    InfoPopupV4Mapper getInfoPopupV4Mapper();

    @NotNull
    InfoPopupV4StickyMapper getInfoPopupV4StickyMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    InfoPopupV4StickyViewModel getViewModel();
}
