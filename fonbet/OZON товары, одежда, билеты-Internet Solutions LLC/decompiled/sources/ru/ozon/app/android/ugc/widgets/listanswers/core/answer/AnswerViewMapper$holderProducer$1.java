package ru.ozon.app.android.ugc.widgets.listanswers.core.answer;

import GZ.g;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.databinding.WidgetAnswerBinding;
import ru.ozon.app.android.ugc.view.sheet.ShareReviewActionSheetHandler;
import ru.ozon.app.android.ugc.view.sheet.api.CallApiActionSheetHandler;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.app.android.ugc.view.sheet.composite.CompositeReviewActionSheetHandler;
import ru.ozon.app.android.ugc.view.sheet.dialog.DialogActionSheetHandler;
import ru.ozon.app.android.ugc.view.sheet.open.OpenReviewActionSheetHandler;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AnswerViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AnswerViewHolder> {
    final /* synthetic */ AnswerViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnswerViewMapper$holderProducer$1(AnswerViewMapper answerViewMapper) {
        super(2);
        this.this$0 = answerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AnswerViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final AnswerViewMapper answerViewMapper = this.this$0;
        CallApiViewModelImpl callApiViewModelImpl = (CallApiViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.listanswers.core.answer.AnswerViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CallApiViewModelImpl viewModel = AnswerViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(CallApiViewModelImpl.class);
        ShareReviewActionSheetHandler shareReviewActionSheetHandler = new ShareReviewActionSheetHandler(refs);
        OpenReviewActionSheetHandler openReviewActionSheetHandler = new OpenReviewActionSheetHandler(this.this$0.component().getOzonRouter());
        DialogActionSheetHandler dialogActionSheetHandler = new DialogActionSheetHandler(this.this$0.component().getOzonRouter());
        g ozonRouter = this.this$0.component().getOzonRouter();
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean isSelect = appTypeResolver.isSelect(context);
        AtomActionSheetHandler.SheetAction[] elements = {AtomActionSheetHandler.SheetAction.VOTE_QUESTION, AtomActionSheetHandler.SheetAction.VOTE_ANSWER_LIKE, AtomActionSheetHandler.SheetAction.VOTE_ANSWER_DISLIKE, AtomActionSheetHandler.SheetAction.MAKE_QUESTION_ANONYMOUS, AtomActionSheetHandler.SheetAction.MAKE_ANSWER_ANONYMOUS, AtomActionSheetHandler.SheetAction.MAKE_ANSWER_BEST, AtomActionSheetHandler.SheetAction.DELETE_QUESTION, AtomActionSheetHandler.SheetAction.DELETE_ANSWER};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ReviewActionSheetHandler[] elements2 = {shareReviewActionSheetHandler, openReviewActionSheetHandler, dialogActionSheetHandler, new CallApiActionSheetHandler(refs, callApiViewModelImpl, ozonRouter, isSelect, C7705l.j0(elements))};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        CompositeReviewActionSheetHandler compositeReviewActionSheetHandler = new CompositeReviewActionSheetHandler(C7705l.j0(elements2));
        WidgetAnswerBinding bind = WidgetAnswerBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new AnswerViewHolder(bind, refs, this.this$0.component().getHandlersInhibitor(), this.this$0.component().getActionSheetEventHandler(), compositeReviewActionSheetHandler);
    }
}
