package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RecShelfViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, RecShelfViewHolder> {
    final /* synthetic */ RecShelfViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecShelfViewMapper$holderProducer$1(RecShelfViewMapper recShelfViewMapper) {
        super(2);
        this.this$0 = recShelfViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final RecShelfViewHolder invoke(View view, ComposerReferences refs) {
        i iVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FrameLayout frameLayout = (FrameLayout) view;
        iVar = this.this$0.screenContainer;
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final RecShelfViewMapper recShelfViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                RecShelfViewModel recShelfViewModel = RecShelfViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(recShelfViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return recShelfViewModel;
            }
        }).a(RecShelfViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new RecShelfViewHolder(frameLayout, iVar, (RecShelfViewModel) a12, this.this$0.component().getCustomActionHandlersFactory(), refs);
    }
}
