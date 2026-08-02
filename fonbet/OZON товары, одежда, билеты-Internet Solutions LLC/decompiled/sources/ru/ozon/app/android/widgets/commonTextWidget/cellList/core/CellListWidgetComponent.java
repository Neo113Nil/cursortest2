package ru.ozon.app.android.widgets.commonTextWidget.cellList.core;

import DU.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fR\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/cellList/core/CellListWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;", "getApplySortingViewModel", "()Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;", "applySortingViewModel", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CellListWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/cellList/core/CellListWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/core/CellListWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CellListWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new CellListWidgetComponent(c7475g) { // from class: ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListWidgetComponent$Companion$create$1$1

                /* renamed from: applySortingViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j applySortingViewModel = k.b(CellListWidgetComponent$Companion$create$1$1$applySortingViewModel$2.INSTANCE);

                /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j customActionHandlersStoreFactory;

                {
                    this.customActionHandlersStoreFactory = k.b(new CellListWidgetComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(c7475g));
                }

                @Override // ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListWidgetComponent
                public ApplySortingViewModel getApplySortingViewModel() {
                    return (ApplySortingViewModel) this.applySortingViewModel.getValue();
                }

                @Override // ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return (d) this.customActionHandlersStoreFactory.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<CellListWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CellListWidgetComponent.class), new a(storage, 3));
        }
    }

    @NotNull
    ApplySortingViewModel getApplySortingViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();
}
