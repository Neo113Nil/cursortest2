package ru.ozon.fintech.ui.snackbar;

import Am.b;
import C.D;
import E30.g;
import H30.z;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView;
import ru.ozon.fintech.ui.databinding.FinSnackbarViewBinding;
import ru.ozon.fintech.ui.progress.circle.CircleProgressWithNumberView;
import ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/snackbar/FinSnackbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/FinSnackbarViewBinding;", "state", "Lru/ozon/fintech/ui/snackbar/FinSnackbarState;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinSnackbarView extends ConstraintLayout {

    @NotNull
    private final FinSnackbarViewBinding binding;
    private FinSnackbarState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinSnackbarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FinSnackbarView finSnackbarView, View view) {
        FinSnackbarState finSnackbarState = finSnackbarView.state;
        Function2<String, Boolean, Unit> onClick = finSnackbarState != null ? finSnackbarState.getOnClick() : null;
        FinSnackbarState finSnackbarState2 = finSnackbarView.state;
        String actionId = finSnackbarState2 != null ? finSnackbarState2.getActionId() : null;
        FinSnackbarState finSnackbarState3 = finSnackbarView.state;
        g.b(new a(), onClick, actionId, finSnackbarState3 != null ? Boolean.valueOf(finSnackbarState3.getCloseOnClick()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(Function2 onClick, String actionId, boolean z11) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    public final void bindState(@NotNull FinSnackbarState state) {
        int color;
        int color2;
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        Drawable mutate;
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        FinSnackbarViewBinding finSnackbarViewBinding = this.binding;
        TextAtomView finTitle = finSnackbarViewBinding.finTitle;
        Intrinsics.checkNotNullExpressionValue(finTitle, "finTitle");
        TextAtomHolderKt.bind$default(finTitle, state.getTitle(), null, 2, null);
        if (state.getSubTitle() != null) {
            TextAtomView finSubtitle = finSnackbarViewBinding.finSubtitle;
            Intrinsics.checkNotNullExpressionValue(finSubtitle, "finSubtitle");
            TextAtomHolderKt.bind$default(finSubtitle, state.getSubTitle(), null, 2, null);
        }
        TextAtomView finSubtitle2 = finSnackbarViewBinding.finSubtitle;
        Intrinsics.checkNotNullExpressionValue(finSubtitle2, "finSubtitle");
        finSubtitle2.setVisibility(state.getSubTitle() != null ? 0 : 8);
        if (state.getHorizontalProgress() != null) {
            finSnackbarViewBinding.finHorizontal.bindState(state.getHorizontalProgress());
        }
        HorizontalProgressView finHorizontal = finSnackbarViewBinding.finHorizontal;
        Intrinsics.checkNotNullExpressionValue(finHorizontal, "finHorizontal");
        finHorizontal.setVisibility(state.getHorizontalProgress() != null ? 0 : 8);
        ImageView finChevronImageView = finSnackbarViewBinding.finChevronImageView;
        Intrinsics.checkNotNullExpressionValue(finChevronImageView, "finChevronImageView");
        finChevronImageView.setVisibility(state.isNeedChevron() ? 0 : 8);
        boolean z11 = state.getButton() != null;
        FrameLayout finRightItemsFrame = finSnackbarViewBinding.finRightItemsFrame;
        Intrinsics.checkNotNullExpressionValue(finRightItemsFrame, "finRightItemsFrame");
        finRightItemsFrame.setVisibility(state.isNeedChevron() || z11 ? 0 : 8);
        ButtonAtomWrapperView finButton = finSnackbarViewBinding.finButton;
        Intrinsics.checkNotNullExpressionValue(finButton, "finButton");
        finButton.setVisibility(z11 ? 0 : 8);
        ButtonAtomWrapperState button = state.getButton();
        if (button != null) {
            finSnackbarViewBinding.finButton.bindState(button);
        }
        if (state.getChevronColor() != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            color = styleParser.parseColor(context, state.getChevronColor(), R.color.oz_semantic_text_quaternary);
        } else {
            color = androidx.core.content.a.getColor(getContext(), R.color.oz_semantic_text_quaternary);
        }
        ImageView imageView = finSnackbarViewBinding.finChevronImageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(color, mode);
        Drawable a11 = C7232a.a(getContext(), R.drawable.background_rounded_semantic_bg_secondary_12);
        if (state.getIconBackgroundColor() == null) {
            finSnackbarViewBinding.finIconFrame.setBackground(a11);
        } else if (a11 != null && (constantState = a11.getConstantState()) != null && (newDrawable = constantState.newDrawable()) != null && (mutate = newDrawable.mutate()) != null) {
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            H30.g.a(mutate, styleParser2.parseColor(context2, state.getIconBackgroundColor(), R.color.oz_semantic_ctrl_neutral_pale));
            finSnackbarViewBinding.finIconFrame.setBackground(mutate);
        }
        if (state.getSrc() != null) {
            finSnackbarViewBinding.finImageView.setColorFilter((ColorFilter) null);
            finSnackbarViewBinding.finImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageView finImageView = finSnackbarViewBinding.finImageView;
            Intrinsics.checkNotNullExpressionValue(finImageView, "finImageView");
            ImageViewExtKt.loadOriginal$default(finImageView, state.getSrc(), null, null, null, false, null, 62, null);
        } else if (state.getIcon() != null) {
            finSnackbarViewBinding.finImageView.setScaleType(ImageView.ScaleType.CENTER);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer iconResByToken = TokensExtKt.getIconResByToken(context3, state.getIcon());
            if (iconResByToken != null) {
                int intValue = iconResByToken.intValue();
                if (state.getIconColor() != null) {
                    StyleParser styleParser3 = StyleParser.INSTANCE;
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    color2 = styleParser3.parseColor(context4, state.getIconColor(), R.color.oz_semantic_text_action);
                } else {
                    color2 = androidx.core.content.a.getColor(getContext(), R.color.oz_semantic_text_action);
                }
                finSnackbarViewBinding.finImageView.setColorFilter(color2, mode);
                finSnackbarViewBinding.finImageView.setImageResource(intValue);
            }
        } else if (state.getCircleProgress() != null) {
            finSnackbarViewBinding.finCirceProgress.bindState(state.getCircleProgress());
        }
        FrameLayout finIconFrame = finSnackbarViewBinding.finIconFrame;
        Intrinsics.checkNotNullExpressionValue(finIconFrame, "finIconFrame");
        finIconFrame.setVisibility(state.getSrc() != null || state.getIcon() != null || state.getCircleProgress() != null ? 0 : 8);
        ImageView finImageView2 = finSnackbarViewBinding.finImageView;
        Intrinsics.checkNotNullExpressionValue(finImageView2, "finImageView");
        finImageView2.setVisibility(state.getSrc() != null || state.getIcon() != null ? 0 : 8);
        CircleProgressWithNumberView finCirceProgress = finSnackbarViewBinding.finCirceProgress;
        Intrinsics.checkNotNullExpressionValue(finCirceProgress, "finCirceProgress");
        finCirceProgress.setVisibility(state.getCircleProgress() != null ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinSnackbarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinSnackbarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinSnackbarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FinSnackbarViewBinding inflate = FinSnackbarViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        inflate.getConstraintLayout().setClickable(true);
        inflate.getConstraintLayout().setFocusable(true);
        inflate.finImageView.setClipToOutline(true);
        inflate.getConstraintLayout().setOnClickListener(new b(this, 16));
        inflate.finImageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.snackbar.FinSnackbarView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.d(12));
            }
        });
    }
}
