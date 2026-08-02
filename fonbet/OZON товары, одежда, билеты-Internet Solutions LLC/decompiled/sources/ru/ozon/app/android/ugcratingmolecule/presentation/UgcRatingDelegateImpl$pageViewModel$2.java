package ru.ozon.app.android.ugcratingmolecule.presentation;

import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegatePageViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UgcRatingDelegateImpl$pageViewModel$2 extends AbstractC7737t implements Function0<UgcRatingDelegatePageViewModel> {
    final /* synthetic */ UgcRatingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcRatingDelegateImpl$pageViewModel$2(UgcRatingDelegateImpl ugcRatingDelegateImpl) {
        super(0);
        this.this$0 = ugcRatingDelegateImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UgcRatingDelegatePageViewModel invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final UgcRatingDelegateImpl ugcRatingDelegateImpl = this.this$0;
        return (UgcRatingDelegatePageViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegateImpl$pageViewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                UgcRatingService ugcRatingService;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ugcRatingService = UgcRatingDelegateImpl.this.ugcRatingService;
                return new UgcRatingDelegatePageViewModel(ugcRatingService);
            }
        }).a(UgcRatingDelegatePageViewModel.class);
    }
}
