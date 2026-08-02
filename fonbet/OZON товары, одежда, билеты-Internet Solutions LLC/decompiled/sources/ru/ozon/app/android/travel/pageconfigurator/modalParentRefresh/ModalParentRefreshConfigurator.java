package ru.ozon.app.android.travel.pageconfigurator.modalParentRefresh;

import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/modalParentRefresh/ModalParentRefreshConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "vmProvider", "<init>", "(LPc/a;)V", "", "onComposerInitialized", "()V", "LPc/a;", "Companion", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModalParentRefreshConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final a<ModalParentRefreshSharedViewModel> vmProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/modalParentRefresh/ModalParentRefreshConfigurator$Companion;", "", "<init>", "()V", "PARAM_KEY_FROM", "", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ModalParentRefreshConfigurator(@NotNull a<ModalParentRefreshSharedViewModel> vmProvider) {
        Intrinsics.checkNotNullParameter(vmProvider, "vmProvider");
        this.vmProvider = vmProvider;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (modalParentRefreshSharedViewModel = (ModalParentRefreshSharedViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.travel.pageconfigurator.modalParentRefresh.ModalParentRefreshConfigurator$onComposerInitialized$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ModalParentRefreshConfigurator.this.vmProvider;
                ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel2 = (ModalParentRefreshSharedViewModel) aVar.get();
                Intrinsics.g(modalParentRefreshSharedViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return modalParentRefreshSharedViewModel2;
            }
        }).a(ModalParentRefreshSharedViewModel.class)) == null) {
            return;
        }
        modalParentRefreshSharedViewModel.refreshUrlLiveData().observe(references.getOwnerContainer().f(), new ModalParentRefreshConfigurator$sam$androidx_lifecycle_Observer$0(new ModalParentRefreshConfigurator$onComposerInitialized$1(references)));
    }
}
