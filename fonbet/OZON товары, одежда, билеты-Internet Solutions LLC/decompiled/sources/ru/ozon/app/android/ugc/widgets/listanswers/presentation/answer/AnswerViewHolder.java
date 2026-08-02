package ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer;

import B90.r0;
import Sc.o;
import WZ.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
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
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.databinding.WidgetAnswerBinding;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.app.android.ugc.widgets.listanswers.core.answer.AnswerViewMapper;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.tags.TagHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J'\u0010$\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b$\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0010028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00106\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0010028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "Lru/ozon/app/android/ugc/databinding/WidgetAnswerBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "reviewActionSheetHandler", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetAnswerBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;)V", "item", "", "prepareActionHandler", "(Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;)V", "bindAvatar", "bindName", "bindDate", "bindBadge", "bindAnswer", "bindButtonsTitle", "bindVoteButtons", "bindMakeBest", "bindMenu", "bindMoreAnswers", "bindBackgroundColor", "processHighlightedStateIfExists", "trackView", "onAttach", "()V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;Ll20/d;Ljava/lang/Object;)V", "onDetach", "Lru/ozon/app/android/ugc/databinding/WidgetAnswerBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "disposableActionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "makeBestActionHandler", "", "dp4", "I", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "highlightedAnimationRunnable", "Ljava/lang/Runnable;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnswerViewHolder extends k<AnswerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final WidgetAnswerBinding binding;
    private DisposableActionHandler disposableActionHandler;
    private final int dp4;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Runnable highlightedAnimationRunnable;

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private Function1<? super AtomAction, Unit> makeBestActionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReviewActionSheetHandler<AnswerVO> reviewActionSheetHandler;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnswerViewMapper.Payload.values().length];
            try {
                iArr[AnswerViewMapper.Payload.VOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnswerViewMapper.Payload.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnswerViewMapper.Payload.HIGHLIGHTED_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnswerViewHolder(@NotNull WidgetAnswerBinding binding, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull ReviewActionSheetHandler<AnswerVO> reviewActionSheetHandler) {
        super(r0);
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
        this.actionHandler = new AnswerViewHolder$actionHandler$1(this);
        this.makeBestActionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new AnswerViewHolder$makeBestActionHandler$1(this)).buildHandler();
        this.dp4 = ResourceExtKt.toPx(4);
        this.handler = new Handler();
        this.highlightedAnimationRunnable = new r0(this, 2);
        binding.nameTv.setTextIsSelectable(false);
        Iterator it = C7714v.b0(binding.avatarIv, binding.avatarTv, binding.nameTv, binding.officialAgentIv).iterator();
        while (it.hasNext()) {
            ViewExtKt.setOnClickListenerThrottle$default((View) it.next(), 0L, new AnswerViewHolder$1$1$1(this), 1, null);
        }
    }

    private final void bindAnswer(AnswerVO item) {
        WidgetAnswerBinding widgetAnswerBinding = this.binding;
        TextAtomV2View answerTav = widgetAnswerBinding.answerTav;
        Intrinsics.checkNotNullExpressionValue(answerTav, "answerTav");
        TextDTO answerText = item.getAnswerText();
        TextAtomV2View answerTav2 = widgetAnswerBinding.answerTav;
        Intrinsics.checkNotNullExpressionValue(answerTav2, "answerTav");
        TextHolderKt.bindOrGone(answerTav, ComposerExtKt.withNavigationLinksHandling(answerText, answerTav2, this.actionHandler), this.actionHandler);
    }

    private final void bindAvatar(AnswerVO item) {
        WidgetAnswerBinding widgetAnswerBinding = this.binding;
        if (item.getAvatarUrl() != null) {
            ImageView avatarIv = widgetAnswerBinding.avatarIv;
            Intrinsics.checkNotNullExpressionValue(avatarIv, "avatarIv");
            ImageViewExtKt.loadCircleImage$default(avatarIv, item.getAvatarUrl(), null, 2, null);
            AppCompatTextView avatarTv = widgetAnswerBinding.avatarTv;
            Intrinsics.checkNotNullExpressionValue(avatarTv, "avatarTv");
            ViewExtKt.gone(avatarTv);
            return;
        }
        ImageView imageView = widgetAnswerBinding.avatarIv;
        imageView.setImageDrawable(null);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewExtKt.setBackgroundTint(imageView, ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        AppCompatTextView appCompatTextView = widgetAnswerBinding.avatarTv;
        Character F11 = h.F(item.getName().getText());
        String ch2 = F11 != null ? F11.toString() : null;
        if (ch2 == null) {
            ch2 = "";
        }
        String upperCase = ch2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        appCompatTextView.setText(upperCase);
        AppCompatTextView avatarTv2 = widgetAnswerBinding.avatarTv;
        Intrinsics.checkNotNullExpressionValue(avatarTv2, "avatarTv");
        ViewExtKt.show(avatarTv2);
    }

    private final void bindBackgroundColor(AnswerVO item) {
        this.binding.getConstraintLayout().setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
    }

    private final void bindBadge(AnswerVO item) {
        BadgeView badgeBv = this.binding.badgeBv;
        Intrinsics.checkNotNullExpressionValue(badgeBv, "badgeBv");
        BadgeHolderKt.bindOrGone$default(badgeBv, item.getBadge(), (Function1) null, 2, (Object) null);
    }

    private final void bindButtonsTitle(AnswerVO item) {
        TextAtomV2View buttonsTitleTav = this.binding.buttonsTitleTav;
        Intrinsics.checkNotNullExpressionValue(buttonsTitleTav, "buttonsTitleTav");
        TextHolderKt.bindOrGone$default(buttonsTitleTav, item.getButtonsTitle(), null, 2, null);
    }

    private final void bindDate(AnswerVO item) {
        this.binding.dateTv.setText(item.getDate());
    }

    private final void bindMakeBest(AnswerVO item) {
        SmallIconButtonView makeBestSibv = this.binding.makeBestSibv;
        Intrinsics.checkNotNullExpressionValue(makeBestSibv, "makeBestSibv");
        ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton = item.getMakeBestButton();
        WrappedIconButtonHolderKt.bindOrGone(makeBestSibv, makeBestButton != null ? makeBestButton.getButton() : null, this.makeBestActionHandler);
    }

    private final void bindMenu(AnswerVO item) {
        WidgetAnswerBinding widgetAnswerBinding = this.binding;
        SmallIconButtonView menuSibv = widgetAnswerBinding.menuSibv;
        Intrinsics.checkNotNullExpressionValue(menuSibv, "menuSibv");
        WrappedIconButtonHolderKt.bind(menuSibv, item.getMenu().getButton(), this.actionHandler);
        SmallIconButtonView menuSibv2 = widgetAnswerBinding.menuSibv;
        Intrinsics.checkNotNullExpressionValue(menuSibv2, "menuSibv");
        int i11 = this.dp4;
        ViewExtKt.updatePadding(menuSibv2, i11, i11, i11, i11);
    }

    private final void bindMoreAnswers(AnswerVO item) {
        WidgetAnswerBinding widgetAnswerBinding = this.binding;
        SingleAtom moreAnswersSa = widgetAnswerBinding.moreAnswersSa;
        Intrinsics.checkNotNullExpressionValue(moreAnswersSa, "moreAnswersSa");
        ContainerExtKt.bindOrGone$default(moreAnswersSa, item.getMoreAnswers(), false, 2, null);
        widgetAnswerBinding.moreAnswersSa.setOnAction(this.actionHandler);
    }

    private final void bindName(AnswerVO item) {
        WidgetAnswerBinding widgetAnswerBinding = this.binding;
        TextAtomV2View nameTv = widgetAnswerBinding.nameTv;
        Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
        TextHolderKt.bind$default(nameTv, item.getName(), null, 2, null);
        IconView officialAgentIv = widgetAnswerBinding.officialAgentIv;
        Intrinsics.checkNotNullExpressionValue(officialAgentIv, "officialAgentIv");
        SingleQuestionDTO.AuthorQuestion.Author.Partner partner = item.getPartner();
        IconHolderKt.bindOrGone$default(officialAgentIv, partner != null ? partner.getVerificationIcon() : null, null, 2, null);
    }

    private final void bindVoteButtons(AnswerVO item) {
        WidgetAnswerBinding widgetAnswerBinding = this.binding;
        TagAtomView likeTav = widgetAnswerBinding.likeTav;
        Intrinsics.checkNotNullExpressionValue(likeTav, "likeTav");
        TagHolderKt.bind(likeTav, item.getLike(), this.actionHandler);
        TagAtomView dislikeTav = widgetAnswerBinding.dislikeTav;
        Intrinsics.checkNotNullExpressionValue(dislikeTav, "dislikeTav");
        TagHolderKt.bind(dislikeTav, item.getDislike(), this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void highlightedAnimationRunnable$lambda$1(final AnswerViewHolder answerViewHolder) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = answerViewHolder.getContext();
        AnswerVO boundData = answerViewHolder.getBoundData();
        ObjectAnimator duration = ObjectAnimator.ofArgb(answerViewHolder.binding.getConstraintLayout(), "backgroundColor", styleParser.parseColor(context, boundData != null ? boundData.getBackgroundColor() : null, UniColors.LAYER_FLOOR_1.getResId()), ThemeExtKt.themeColor(answerViewHolder.getContext(), R$attr.layerFloor1)).setDuration(1000L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerViewHolder$highlightedAnimationRunnable$1$1$1
            private final void updateState() {
                ComposerReferences composerReferences;
                AnswerVO boundData2 = AnswerViewHolder.this.getBoundData();
                if (boundData2 != null) {
                    long id2 = boundData2.getId();
                    composerReferences = AnswerViewHolder.this.refs;
                    composerReferences.getController().update(new AnswerHighlightedStateUpdateKey(id2));
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                updateState();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                updateState();
            }
        });
        duration.start();
    }

    private final void prepareActionHandler(AnswerVO item) {
        this.reviewActionSheetHandler.bind(item);
        DisposableActionHandler disposableActionHandler = this.disposableActionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        this.disposableActionHandler = new ActionHandler.Builder(this.refs, this).enableClickThrottling(this.inhibitor).onPreProcess(new AnswerViewHolder$prepareActionHandler$1(this.reviewActionSheetHandler)).buildDisposableHandler(item.getId(), getLifecycle(), this.actionSheetEventHandler);
    }

    private final void processHighlightedStateIfExists(AnswerVO item) {
        if (item.getIsHighlighted()) {
            this.handler.postDelayed(this.highlightedAnimationRunnable, 3000L);
        }
    }

    private final void trackView(AnswerVO item) {
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        AnswerVO boundData = getBoundData();
        if (boundData != null) {
            prepareActionHandler(boundData);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.handler.removeCallbacks(this.highlightedAnimationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AnswerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindAvatar(item);
        bindName(item);
        bindDate(item);
        bindBadge(item);
        bindAnswer(item);
        bindButtonsTitle(item);
        bindVoteButtons(item);
        bindMakeBest(item);
        bindMenu(item);
        bindMoreAnswers(item);
        bindBackgroundColor(item);
        processHighlightedStateIfExists(item);
        trackView(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AnswerVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Iterator it = ((List) payload).iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((AnswerViewMapper.Payload) it.next()).ordinal()];
            if (i11 == 1) {
                bindVoteButtons(item);
            } else if (i11 == 2) {
                bindAnswer(item);
            } else if (i11 == 3) {
                bindBackgroundColor(item);
            } else {
                throw new o();
            }
        }
    }
}
