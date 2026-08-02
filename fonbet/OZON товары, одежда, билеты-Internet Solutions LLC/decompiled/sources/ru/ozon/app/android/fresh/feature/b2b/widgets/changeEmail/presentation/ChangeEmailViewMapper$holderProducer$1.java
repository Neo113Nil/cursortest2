package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChangeEmailViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ChangeEmailViewHolder> {
    final /* synthetic */ ChangeEmailViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewMapper$holderProducer$1(ChangeEmailViewMapper changeEmailViewMapper) {
        super(2);
        this.this$0 = changeEmailViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ChangeEmailViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final ChangeEmailViewMapper changeEmailViewMapper = this.this$0;
        return new ChangeEmailViewHolder((ChangeEmailView) view, composerReferences, tokenizedAnalytics, (ChangeEmailViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ChangeEmailViewModel changeEmailViewModel = ChangeEmailViewMapper.this.component().getChangeEmailViewModel();
                Intrinsics.g(changeEmailViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return changeEmailViewModel;
            }
        }).a(ChangeEmailViewModel.class));
    }
}
