package ru.ozon.app.android.ugc.widgets.selectionItemForm.di;

import Fu.C3060a;
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
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModelImpl;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputsDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/di/SelectionItemFormComponent;", "Lhi/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "getSelectionFormViewModel", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "selectionFormViewModel", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "getMediaPickerViewModel", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "mediaPickerViewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate;", "getInputsDelegate", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate;", "inputsDelegate", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SelectionItemFormComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/di/SelectionItemFormComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/di/SelectionItemFormComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SelectionItemFormComponent getInstance$lambda$0(final C7475g c7475g) {
            return new SelectionItemFormComponent(c7475g) { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent$Companion$getInstance$1$1
                private final ActionComponentApi actionComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: inputsDelegate$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j inputsDelegate = k.b(SelectionItemFormComponent$Companion$getInstance$1$1$inputsDelegate$2.INSTANCE);
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent
                public d getCustomActionHandlersFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent
                public SelectionFormInputsDelegate getInputsDelegate() {
                    return (SelectionFormInputsDelegate) this.inputsDelegate.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent
                public MediaPickerViewModelImpl getMediaPickerViewModel() {
                    return new MediaPickerViewModelImpl();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent
                public SelectionFormViewModel getSelectionFormViewModel() {
                    return new SelectionFormViewModel(this.actionComponentApi.getActionRepository());
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SelectionItemFormComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SelectionItemFormComponent.class), new C3060a(storage, 1));
        }
    }

    @NotNull
    d getCustomActionHandlersFactory();

    @NotNull
    SelectionFormInputsDelegate getInputsDelegate();

    @NotNull
    MediaPickerViewModelImpl getMediaPickerViewModel();

    @NotNull
    SelectionFormViewModel getSelectionFormViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
