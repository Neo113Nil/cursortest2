package ru.ozon.app.android.ugc.widgets.singlequestion.presentation;

import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.databinding.WidgetSingleQuestionBinding;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.app.android.ugc.widgets.singlequestion.core.SingleQuestionViewMapper;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010\u0012J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J'\u0010)\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0017H\u0014¢\u0006\u0004\b)\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0014\u00102\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0010078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;", "Lru/ozon/app/android/ugc/databinding/WidgetSingleQuestionBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "reviewActionSheetHandler", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetSingleQuestionBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;)V", "item", "", "prepareActionHandler", "(Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;)V", "bindAvatar", "bindName", "bindDate", "bindQuestion", "", "bindAnswerButton", "(Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;)Ljava/lang/Object;", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "likeButton", "bindLikeButton", "(Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;)V", "", "isSelected", "", "getLikeColor", "(Z)I", "bindMenu", "trackView", "onAttach", "()V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;Ll20/d;)V", "payload", "(Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/ugc/databinding/WidgetSingleQuestionBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "dp4", "I", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "disposableActionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleQuestionViewHolder extends k<SingleQuestionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final WidgetSingleQuestionBinding binding;
    private DisposableActionHandler disposableActionHandler;
    private final int dp4;

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReviewActionSheetHandler<SingleQuestionVO> reviewActionSheetHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SingleQuestionViewHolder(@NotNull WidgetSingleQuestionBinding binding, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull ReviewActionSheetHandler<SingleQuestionVO> reviewActionSheetHandler) {
        super(r6);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(reviewActionSheetHandler, "reviewActionSheetHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.inhibitor = inhibitor;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.reviewActionSheetHandler = reviewActionSheetHandler;
        this.dp4 = ResourceExtKt.toPx(4);
        this.actionHandler = new SingleQuestionViewHolder$actionHandler$1(this);
        binding.nameTv.setTextIsSelectable(false);
        Iterator it = C7714v.b0(binding.avatarIv, binding.avatarTv, binding.nameTv, binding.officialAgentIv).iterator();
        while (it.hasNext()) {
            ViewExtKt.setOnClickListenerThrottle$default((View) it.next(), 0L, new SingleQuestionViewHolder$1$1$1(this), 1, null);
        }
        LinearLayout likeLl = binding.likeLl;
        Intrinsics.checkNotNullExpressionValue(likeLl, "likeLl");
        ViewExtKt.setOnClickListenerThrottle$default(likeLl, 0L, new SingleQuestionViewHolder$1$2(this), 1, null);
    }

    private final Object bindAnswerButton(SingleQuestionVO item) {
        WidgetSingleQuestionBinding widgetSingleQuestionBinding = this.binding;
        AtomDTO answerButton = item.getAnswerButton();
        if (answerButton == null) {
            SingleAtom answerBa = widgetSingleQuestionBinding.answerBa;
            Intrinsics.checkNotNullExpressionValue(answerBa, "answerBa");
            ViewExtKt.gone(answerBa);
            return Unit.f71690a;
        }
        SingleAtom singleAtom = widgetSingleQuestionBinding.answerBa;
        SingleAtom.bind$default(singleAtom, answerButton, false, 2, null);
        singleAtom.setOnAction(this.actionHandler);
        ViewExtKt.show(singleAtom);
        return singleAtom;
    }

    private final void bindAvatar(SingleQuestionVO item) {
        WidgetSingleQuestionBinding widgetSingleQuestionBinding = this.binding;
        if (item.getAvatarUrl() != null) {
            ImageView avatarIv = widgetSingleQuestionBinding.avatarIv;
            Intrinsics.checkNotNullExpressionValue(avatarIv, "avatarIv");
            ImageViewExtKt.loadCircleImage$default(avatarIv, item.getAvatarUrl(), null, 2, null);
            TextView avatarTv = widgetSingleQuestionBinding.avatarTv;
            Intrinsics.checkNotNullExpressionValue(avatarTv, "avatarTv");
            ViewExtKt.gone(avatarTv);
            return;
        }
        ImageView imageView = widgetSingleQuestionBinding.avatarIv;
        imageView.setImageDrawable(null);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewExtKt.setBackgroundTint(imageView, ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        TextView textView = widgetSingleQuestionBinding.avatarTv;
        Character F11 = h.F(item.getName().getText());
        String ch2 = F11 != null ? F11.toString() : null;
        if (ch2 == null) {
            ch2 = "";
        }
        String upperCase = ch2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        textView.setText(upperCase);
        TextView avatarTv2 = widgetSingleQuestionBinding.avatarTv;
        Intrinsics.checkNotNullExpressionValue(avatarTv2, "avatarTv");
        ViewExtKt.show(avatarTv2);
    }

    private final void bindDate(SingleQuestionVO item) {
        this.binding.dateTv.setText(item.getDate());
    }

    private final void bindLikeButton(SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton) {
        WidgetSingleQuestionBinding widgetSingleQuestionBinding = this.binding;
        if (likeButton == null) {
            LinearLayout likeLl = widgetSingleQuestionBinding.likeLl;
            Intrinsics.checkNotNullExpressionValue(likeLl, "likeLl");
            ViewExtKt.gone(likeLl);
            return;
        }
        ImageView likeIv = widgetSingleQuestionBinding.likeIv;
        Intrinsics.checkNotNullExpressionValue(likeIv, "likeIv");
        ImageViewExtKt.load$default(likeIv, likeButton.getIcon(), null, null, null, null, false, null, 126, null);
        widgetSingleQuestionBinding.likeTv.setText(String.valueOf(likeButton.getCount()));
        int likeColor = getLikeColor(likeButton.isSelected());
        ImageView likeIv2 = widgetSingleQuestionBinding.likeIv;
        Intrinsics.checkNotNullExpressionValue(likeIv2, "likeIv");
        ThemeExtKt.tint(likeIv2, Integer.valueOf(likeColor));
        widgetSingleQuestionBinding.likeTv.setTextColor(likeColor);
    }

    private final void bindMenu(SingleQuestionVO item) {
        WidgetSingleQuestionBinding widgetSingleQuestionBinding = this.binding;
        SmallIconButtonView menuSibv = widgetSingleQuestionBinding.menuSibv;
        Intrinsics.checkNotNullExpressionValue(menuSibv, "menuSibv");
        WrappedIconButtonHolderKt.bind(menuSibv, item.getMenu().getButton(), this.actionHandler);
        SmallIconButtonView menuSibv2 = widgetSingleQuestionBinding.menuSibv;
        Intrinsics.checkNotNullExpressionValue(menuSibv2, "menuSibv");
        int i11 = this.dp4;
        ViewExtKt.updatePadding(menuSibv2, i11, i11, i11, i11);
    }

    private final void bindName(SingleQuestionVO item) {
        WidgetSingleQuestionBinding widgetSingleQuestionBinding = this.binding;
        TextAtomV2View nameTv = widgetSingleQuestionBinding.nameTv;
        Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
        TextHolderKt.bind$default(nameTv, item.getName(), null, 2, null);
        IconView officialAgentIv = widgetSingleQuestionBinding.officialAgentIv;
        Intrinsics.checkNotNullExpressionValue(officialAgentIv, "officialAgentIv");
        SingleQuestionDTO.AuthorQuestion.Author.Partner partner = item.getPartner();
        IconHolderKt.bindOrGone$default(officialAgentIv, partner != null ? partner.getVerificationIcon() : null, null, 2, null);
    }

    private final void bindQuestion(SingleQuestionVO item) {
        TextAtomV2View questionTav = this.binding.questionTav;
        Intrinsics.checkNotNullExpressionValue(questionTav, "questionTav");
        TextHolderKt.bind$default(questionTav, item.getQuestion().getText(), null, 2, null);
    }

    private final int getLikeColor(boolean isSelected) {
        return StyleParser.INSTANCE.parseColor(getContext(), isSelected ? UniColors.TEXT_ACTION.getToken() : null, UniColors.TEXT_PRIMARY.getResId());
    }

    private final void prepareActionHandler(SingleQuestionVO item) {
        this.reviewActionSheetHandler.bind(item);
        DisposableActionHandler disposableActionHandler = this.disposableActionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        this.disposableActionHandler = new ActionHandler.Builder(this.refs, this).enableClickThrottling(this.inhibitor).onPreProcess(new SingleQuestionViewHolder$prepareActionHandler$1(this.reviewActionSheetHandler)).buildDisposableHandler(item.getId(), getLifecycle(), this.actionSheetEventHandler);
    }

    private final void trackView(SingleQuestionVO item) {
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        SingleQuestionVO boundedData = getBoundedData();
        if (boundedData != null) {
            prepareActionHandler(boundedData);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleQuestionVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindAvatar(item);
        bindName(item);
        bindDate(item);
        bindQuestion(item);
        bindAnswerButton(item);
        bindLikeButton(item.getLikeButton());
        bindMenu(item);
        trackView(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleQuestionVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload == SingleQuestionViewMapper.QuestionPayload.VOTE) {
            bindLikeButton(item.getLikeButton());
        } else {
            super.bind((SingleQuestionViewHolder) item, info, payload);
        }
    }
}
