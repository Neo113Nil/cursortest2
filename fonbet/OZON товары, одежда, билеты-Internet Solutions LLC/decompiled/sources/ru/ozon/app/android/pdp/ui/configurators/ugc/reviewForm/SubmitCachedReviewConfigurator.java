package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitCachedReviewConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitCachedReviewViewModel;", "submitCachedReviewViewModelProvider", "<init>", "(LPc/a;)V", "", "onComposerInitialized", "()V", "LPc/a;", "submitCachedReviewViewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitCachedReviewViewModel;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubmitCachedReviewConfigurator extends ComposerScreenConfig.PageConfigurator {
    private static boolean submitAttempted;
    private SubmitCachedReviewViewModel submitCachedReviewViewModel;

    @NotNull
    private final Pc.a<SubmitCachedReviewViewModel> submitCachedReviewViewModelProvider;
    public static final int $stable = 8;

    public SubmitCachedReviewConfigurator(@NotNull Pc.a<SubmitCachedReviewViewModel> submitCachedReviewViewModelProvider) {
        Intrinsics.checkNotNullParameter(submitCachedReviewViewModelProvider, "submitCachedReviewViewModelProvider");
        this.submitCachedReviewViewModelProvider = submitCachedReviewViewModelProvider;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references;
        P<SubmitActionPendingData> onSubmitTrackingObserver;
        if (submitAttempted || (references = getReferences()) == null) {
            return;
        }
        SubmitCachedReviewViewModel submitCachedReviewViewModel = (SubmitCachedReviewViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.SubmitCachedReviewConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Pc.a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SubmitCachedReviewConfigurator.this.submitCachedReviewViewModelProvider;
                SubmitCachedReviewViewModel submitCachedReviewViewModel2 = (SubmitCachedReviewViewModel) aVar.get();
                Intrinsics.g(submitCachedReviewViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return submitCachedReviewViewModel2;
            }
        }).a(SubmitCachedReviewViewModel.class);
        this.submitCachedReviewViewModel = submitCachedReviewViewModel;
        if (submitCachedReviewViewModel != null && (onSubmitTrackingObserver = submitCachedReviewViewModel.getOnSubmitTrackingObserver()) != null) {
            onSubmitTrackingObserver.observe(getOwner(), new SubmitCachedReviewConfigurator$sam$androidx_lifecycle_Observer$0(new SubmitCachedReviewConfigurator$onComposerInitialized$2(references)));
        }
        SubmitCachedReviewViewModel submitCachedReviewViewModel2 = this.submitCachedReviewViewModel;
        if (submitCachedReviewViewModel2 != null) {
            submitCachedReviewViewModel2.processSubmitCachedReview();
        }
        submitAttempted = true;
    }
}
