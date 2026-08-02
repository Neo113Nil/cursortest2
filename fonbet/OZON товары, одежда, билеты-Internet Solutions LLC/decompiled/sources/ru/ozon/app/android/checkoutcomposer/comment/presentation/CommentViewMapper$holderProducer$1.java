package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.WidgetCommentBinding;
import ru.ozon.app.android.checkoutcomposer.comment.di.CommentWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentWidgetVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommentViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CommentWidgetVH> {
    final /* synthetic */ CommentViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentViewMapper$holderProducer$1(CommentViewMapper commentViewMapper) {
        super(2);
        this.this$0 = commentViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CommentWidgetVH invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetCommentBinding bind = WidgetCommentBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final CommentViewMapper commentViewMapper = this.this$0;
        return new CommentWidgetVH(bind, ref, (CommentViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.comment.presentation.CommentViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                CommentWidgetComponent commentWidgetComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                commentWidgetComponent = CommentViewMapper.this.component;
                return new CommentViewModelImpl(commentWidgetComponent.getCommentRepository());
            }
        }).a(CommentViewModelImpl.class));
    }
}
