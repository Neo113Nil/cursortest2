package ru.ozon.uni.android.flashbar.view;

import Sc.InterfaceC3999a;
import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.content.res.g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$font;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.GetButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.progress.OzProgressBar;
import ru.ozon.uni.android.uikitsdk.ext.TVExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.buttons.GetButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.databinding.ViewFlashbarUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\b\u0016J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\b\u001fJ\u0017\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0002\b#J#\u0010$\u001a\u00020\u000f2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f\u0018\u00010&H\u0000¢\u0006\u0002\b(J-\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010+2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000f\u0018\u00010&H\u0000¢\u0006\u0002\b.J/\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\"2\n\b\u0001\u00101\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u0010\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010=R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lru/ozon/uni/android/flashbar/view/FlashbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "parentFlashbarContainer", "Lru/ozon/uni/android/flashbar/view/FlashbarContainerView;", "dp4", "", "dp8", "dp16", "binding", "Lru/ozon/uni/databinding/ViewFlashbarUniBinding;", "onAttachedToWindow", "", "addParent", "flashbarContainerView", "addParent$uni_release", "setTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "setTitle$uni_release", "setTitleColor", "color", "setTitleColor$uni_release", "(Ljava/lang/Integer;)V", "setMessageColor", "setMessageColor$uni_release", "setMessage", "message", "setMessage$uni_release", "setActionText", "text", "", "setActionText$uni_release", "setActionTapListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "setActionTapListener$uni_release", "setAtomActionButton", "dto", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "actionHandler", "Lru/ozon/uni/atoms/af/AtomAction;", "setAtomActionButton$uni_release", "setIcon", "iconUrl", "icon", "imageTintColor", "setIcon$uni_release", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "enableSwipeToDismiss", "enable", "", "callbacks", "Lru/ozon/uni/android/flashbar/view/SwipeToDismissTouchListener$DismissCallbacks;", "enableSwipeToDismiss$uni_release", "setProgressInfo", "progressInfo", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashbarView extends ConstraintLayout {

    @NotNull
    private final ViewFlashbarUniBinding binding;
    private final int dp16;
    private final int dp4;
    private final int dp8;
    private FlashbarContainerView parentFlashbarContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashbarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = UiExtKt.toPx(4);
        this.dp8 = UiExtKt.toPx(8);
        int px = UiExtKt.toPx(16);
        this.dp16 = px;
        this.binding = ViewFlashbarUniBinding.inflate(LayoutInflater.from(context), this);
        setId(R$id.flash_bar_id);
        if (TVExtKt.isAppOpenOnTV(context)) {
            ViewExtKt.disableFocusable(this);
        } else {
            setClickable(true);
            setFocusable(true);
        }
        setBackground(a.getDrawable(context, R$drawable.bg_flashbar));
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), px);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        setForeground(C7232a.a(context, typedValue.resourceId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setActionTapListener$lambda$5(Function1 function1, FlashbarView flashbarView, View view) {
        FlashbarContainerView flashbarContainerView = flashbarView.parentFlashbarContainer;
        if (flashbarContainerView != null) {
            function1.invoke(flashbarContainerView.getParentFlashbar$uni_release());
        } else {
            Intrinsics.n("parentFlashbarContainer");
            throw null;
        }
    }

    public final void addParent$uni_release(@NotNull FlashbarContainerView flashbarContainerView) {
        Intrinsics.checkNotNullParameter(flashbarContainerView, "flashbarContainerView");
        this.parentFlashbarContainer = flashbarContainerView;
    }

    public final void enableSwipeToDismiss$uni_release(boolean enable, @NotNull SwipeToDismissTouchListener.DismissCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (enable) {
            setOnTouchListener(new SwipeToDismissTouchListener(this, callbacks));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = r0.getDisplayCutout();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        DisplayCutout displayCutout;
        super.onAttachedToWindow();
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = getRootWindowInsets();
            if (rootWindowInsets == null || displayCutout == null) {
                WindowInsets rootWindowInsets2 = getRootWindowInsets();
                if (rootWindowInsets2 != null) {
                    i11 = rootWindowInsets2.getStableInsetTop();
                }
            } else {
                i11 = displayCutout.getSafeInsetTop();
            }
        } else {
            WindowInsets rootWindowInsets3 = getRootWindowInsets();
            if (rootWindowInsets3 != null) {
                i11 = rootWindowInsets3.getStableInsetTop();
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i12 = this.dp4;
        layoutParams.topMargin = i11 + i12;
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i12;
        setLayoutParams(layoutParams);
    }

    public final void setActionTapListener$uni_release(Function1<? super Flashbar, Unit> listener) {
        if (listener == null) {
            return;
        }
        this.binding.fbPositiveActionTextView.setOnClickListener(new Bk0.a(0, listener, this));
    }

    public final void setActionText$uni_release(String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.binding.fbPositiveActionTextView.setText(text);
        this.binding.fbPositiveActionTextView.setVisibility(0);
    }

    public final void setAtomActionButton$uni_release(ButtonV3Atom dto, Function1<? super AtomAction, Unit> actionHandler) {
        FrameLayout fbActionButtonContainer = this.binding.fbActionButtonContainer;
        Intrinsics.checkNotNullExpressionValue(fbActionButtonContainer, "fbActionButtonContainer");
        fbActionButtonContainer.setVisibility(dto != null ? 0 : 8);
        if (dto instanceof ButtonV3Atom.SmallBorderlessButton) {
            SmallBorderlessButtonView fbSmallBorderlessButton = this.binding.fbSmallBorderlessButton;
            Intrinsics.checkNotNullExpressionValue(fbSmallBorderlessButton, "fbSmallBorderlessButton");
            WrappedBorderlessButtonHolderKt.bindOrGone(fbSmallBorderlessButton, (ButtonV3Atom.SmallBorderlessButton) dto, actionHandler);
        } else if (dto instanceof ButtonV3Atom.GetButton) {
            GetButtonView fbGetButton = this.binding.fbGetButton;
            Intrinsics.checkNotNullExpressionValue(fbGetButton, "fbGetButton");
            GetButtonHolderKt.bindOrGone(fbGetButton, (ButtonV3Atom.GetButton) dto, actionHandler);
        }
    }

    public final void setIcon$uni_release(String iconUrl, Integer icon, String imageTintColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.fbIcon.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, imageTintColor, R$color.text_primary_inverted);
        if (iconUrl != null) {
            String str = !h.K(iconUrl) ? iconUrl : null;
            if (str != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable loadIconByString = ContextExtKt.loadIconByString(context2, str);
                if (loadIconByString != null) {
                    ImageView imageView = this.binding.fbIcon;
                    imageView.setImageDrawable(loadIconByString);
                    ThemeExtKt.tint(imageView, Integer.valueOf(parseColor));
                    ViewExtKt.show(imageView);
                    return;
                }
            }
        }
        if (iconUrl != null && !h.K(iconUrl)) {
            ImageView imageView2 = this.binding.fbIcon;
            Intrinsics.f(imageView2);
            ImageViewExtKt.load$default(imageView2, iconUrl, null, null, null, null, false, null, 126, null);
            imageView2.clearColorFilter();
            ViewExtKt.show(imageView2);
            return;
        }
        if (icon == null) {
            ImageView fbIcon = this.binding.fbIcon;
            Intrinsics.checkNotNullExpressionValue(fbIcon, "fbIcon");
            ViewExtKt.gone(fbIcon);
            return;
        }
        this.binding.fbIcon.setImageDrawable(C7232a.a(getContext(), icon.intValue()));
        ImageView fbIcon2 = this.binding.fbIcon;
        Intrinsics.checkNotNullExpressionValue(fbIcon2, "fbIcon");
        ThemeExtKt.tint(fbIcon2, Integer.valueOf(parseColor));
        ImageView fbIcon3 = this.binding.fbIcon;
        Intrinsics.checkNotNullExpressionValue(fbIcon3, "fbIcon");
        ViewExtKt.show(fbIcon3);
    }

    public final void setMessage$uni_release(OzonSpannableString message) {
        TextView textView = this.binding.fbMessage;
        if (TextUtils.isEmpty(message)) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else {
            textView.setText(message);
            textView.setVisibility(0);
        }
    }

    public final void setMessageColor$uni_release(Integer color) {
        if (color != null) {
            this.binding.fbMessage.setTextColor(color.intValue());
        }
    }

    public final void setProgressInfo(Restriction.Progress progressInfo) {
        if (progressInfo == null) {
            OzProgressBar progressBar = this.binding.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            ViewExtKt.gone(progressBar);
            return;
        }
        OzProgressBar ozProgressBar = this.binding.progressBar;
        Typeface e11 = g.e(R$font.onest_regular, ozProgressBar.getContext());
        if (e11 != null) {
            ozProgressBar.setTypeface(e11);
        }
        ozProgressBar.setCornerRadius(this.dp8);
        ozProgressBar.setBarColor(a.getColor(ozProgressBar.getContext(), ru.ozon.uni.R$color.oz_gray_70));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = ozProgressBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ozProgressBar.setFillColor(styleParser.parseColor(context, progressInfo.getProgressBarColor(), ru.ozon.uni.R$color.oz_green_ui));
        ozProgressBar.setProgress(progressInfo.getPercent());
        ozProgressBar.setText(progressInfo.getText());
        ViewExtKt.show(ozProgressBar);
    }

    public final void setTitle$uni_release(OzonSpannableString title) {
        TextView textView = this.binding.fbTitle;
        if (TextUtils.isEmpty(title)) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else {
            textView.setText(title);
            textView.setVisibility(0);
        }
    }

    public final void setTitleColor$uni_release(Integer color) {
        if (color != null) {
            this.binding.fbTitle.setTextColor(color.intValue());
        }
    }
}
