package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di;

import Cn.C2782a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.data.InputCurtainMapper;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/di/InputCurtainComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/data/InputCurtainMapper;", "getMapper", "()Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/data/InputCurtainMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "getViewModel", "()Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "viewModel", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InputCurtainComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/di/InputCurtainComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/di/InputCurtainComponent;", "create", "(Lk20/g;)Lk20/e;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputCurtainComponent create$lambda$0(C7475g c7475g) {
            final CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            return new InputCurtainComponent() { // from class: ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di.InputCurtainComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(InputCurtainComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di.InputCurtainComponent
                public d getActionHandlersStoreFactory() {
                    return CustomActionHandlersComponentApi.this.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di.InputCurtainComponent
                public InputCurtainMapper getMapper() {
                    return (InputCurtainMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di.InputCurtainComponent
                public l getTokenizedAnalytics() {
                    return retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di.InputCurtainComponent
                public InputCurtainViewModel getViewModel() {
                    return new InputCurtainViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<InputCurtainComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(InputCurtainComponent.class), new C2782a(storage, 8));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    InputCurtainMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    InputCurtainViewModel getViewModel();
}
