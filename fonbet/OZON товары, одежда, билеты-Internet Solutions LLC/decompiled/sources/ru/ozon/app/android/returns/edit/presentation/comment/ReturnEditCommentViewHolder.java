package ru.ozon.app.android.returns.edit.presentation.comment;

import Vg.d;
import androidx.core.content.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.edit.presentation.viewObject.ReturnTextEditBlockVO;
import ru.ozon.app.android.returns.ui.utils.KeyboardScrollToTargetHelper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/comment/ReturnEditCommentViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnTextEditBlockVO;", "Lru/ozon/app/android/returns/edit/presentation/comment/ReturnEditCommentView;", "returnEditCommentView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/returns/edit/presentation/comment/ReturnEditCommentView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnTextEditBlockVO;Ll20/d;)V", "onViewOutOfVisibleBounds", "()V", "Lru/ozon/app/android/returns/edit/presentation/comment/ReturnEditCommentView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/ui/utils/KeyboardScrollToTargetHelper;", "keyboardHelper", "Lru/ozon/app/android/returns/ui/utils/KeyboardScrollToTargetHelper;", "", "", "", "commentsCache", "Ljava/util/Map;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnEditCommentViewHolder extends k<ReturnTextEditBlockVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Map<Long, String> commentsCache;

    @NotNull
    private final KeyboardScrollToTargetHelper keyboardHelper;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReturnEditCommentView returnEditCommentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnEditCommentViewHolder(@NotNull ReturnEditCommentView returnEditCommentView, @NotNull ComposerReferences refs, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull d customActionHandlersStoreFactory) {
        super(returnEditCommentView);
        Intrinsics.checkNotNullParameter(returnEditCommentView, "returnEditCommentView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.returnEditCommentView = returnEditCommentView;
        this.refs = refs;
        KeyboardScrollToTargetHelper keyboardScrollToTargetHelper = new KeyboardScrollToTargetHelper(refs, returnEditCommentView.getTextAreaView());
        this.keyboardHelper = keyboardScrollToTargetHelper;
        this.commentsCache = new LinkedHashMap();
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ReturnEditCommentViewHolder$actionHandler$1(oneTimePostRefreshHandler)).customActionHandlers(new ReturnEditCommentViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        keyboardScrollToTargetHelper.setup();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        for (Map.Entry<Long, String> entry : this.commentsCache.entrySet()) {
            this.refs.getController().update(new ReturnEditCommentUpdateKey(entry.getKey().longValue(), entry.getValue()));
        }
        this.commentsCache.clear();
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnTextEditBlockVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnEditCommentView returnEditCommentView = this.returnEditCommentView;
        TextHolderKt.bind$default(returnEditCommentView.getTitleTAV(), item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(returnEditCommentView.getSubTitleTAV(), item.getSubtitle(), null, 2, null);
        TextAreaView textAreaView = returnEditCommentView.getTextAreaView();
        textAreaView.setInputText(item.getTextArea().getValue());
        textAreaView.setLabel(item.getTextArea().getName());
        Integer maxLength = item.getTextArea().getMaxLength();
        textAreaView.setMaxLength(maxLength != null ? maxLength.intValue() : Integer.MAX_VALUE);
        textAreaView.setStatus(item.getValidationText() != null ? TextAreaView.Status.ERROR : TextAreaView.Status.NEUTRAL);
        textAreaView.setCaption(item.getValidationText());
        textAreaView.setCaptionColor(Integer.valueOf(a.getColor(textAreaView.getContext(), UniColors.TEXT_NEGATIVE.getResId())));
        returnEditCommentView.doOnTextChanged(new ReturnEditCommentViewHolder$bind$1$2(returnEditCommentView, item, this));
    }
}
