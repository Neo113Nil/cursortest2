package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.view;

import Az.ViewOnClickListenerC2453a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.vectordrawable.graphics.drawable.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.databinding.ViewAllowPushBinding;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/view/EnableNotificationsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "subtitle", "setSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "", "performClick", "setButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lkotlin/jvm/functions/Function1;Z)V", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;", "closeButton", "closeActionHandler", "setCloseButton", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;Lkotlin/jvm/functions/Function1;)V", "bgColor", "I", "Landroidx/vectordrawable/graphics/drawable/e;", "bxFillDrawable$delegate", "LSc/j;", "getBxFillDrawable", "()Landroidx/vectordrawable/graphics/drawable/e;", "bxFillDrawable", "bxFillMaxDrawable$delegate", "getBxFillMaxDrawable", "bxFillMaxDrawable", "Lru/ozon/app/android/marketing/databinding/ViewAllowPushBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/ViewAllowPushBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EnableNotificationsView extends ConstraintLayout {
    private final int bgColor;

    @NotNull
    private final ViewAllowPushBinding binding;

    /* renamed from: bxFillDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bxFillDrawable;

    /* renamed from: bxFillMaxDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bxFillMaxDrawable;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnableNotificationsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final e getBxFillDrawable() {
        return (e) this.bxFillDrawable.getValue();
    }

    private final e getBxFillMaxDrawable() {
        return (e) this.bxFillMaxDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCloseButton$lambda$6$lambda$5(EnableNotificationsVO.CloseButton closeButton, Function1 function1, View view) {
        if (closeButton != null) {
            function1.invoke(closeButton.getAction());
        }
    }

    public final void setButton(@NotNull ButtonV3Atom.SmallButton button, @NotNull Function1<? super AtomAction, Unit> actionHandler, boolean performClick) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ViewAllowPushBinding viewAllowPushBinding = this.binding;
        SmallButtonView actionButton = viewAllowPushBinding.actionButton;
        Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
        WrappedButtonHolderKt.bindOrGone(actionButton, button, actionHandler);
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (appTypeResolver.isSelect(context)) {
            SmallButtonView actionButton2 = viewAllowPushBinding.actionButton;
            Intrinsics.checkNotNullExpressionValue(actionButton2, "actionButton");
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ViewExtKt.setBackgroundTint(actionButton2, ThemeExtKt.themeColor(context2, R$attr.bgPrimary));
            SmallButtonView smallButtonView = viewAllowPushBinding.actionButton;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            smallButtonView.setTextColor(ThemeExtKt.themeColor(context3, R$attr.textPrimary));
        }
        if (performClick) {
            viewAllowPushBinding.actionButton.performClick();
        }
    }

    public final void setCloseButton(EnableNotificationsVO.CloseButton closeButton, @NotNull Function1<? super AtomAction, Unit> closeActionHandler) {
        Intrinsics.checkNotNullParameter(closeActionHandler, "closeActionHandler");
        ImageView imageView = this.binding.closeIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.loadImageOrGone(imageView, closeButton != null ? closeButton.getIcon() : null);
        imageView.setOnClickListener(new ViewOnClickListenerC2453a(0, closeButton, closeActionHandler));
    }

    public final void setSubtitle(TextDTO subtitle) {
        ViewAllowPushBinding viewAllowPushBinding = this.binding;
        TextAtomV2View subtitleTav = viewAllowPushBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone$default(subtitleTav, subtitle, null, 2, null);
        e bxFillDrawable = subtitle == null ? getBxFillDrawable() : getBxFillMaxDrawable();
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (appTypeResolver.isSelect(context) && bxFillDrawable != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            bxFillDrawable.setTint(ThemeExtKt.themeColor(context2, R$attr.bgOverlap));
        }
        viewAllowPushBinding.decorRightIV.setBackground(bxFillDrawable);
    }

    public final void setTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextAtomV2View titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bindOrGone$default(titleTav, title, null, 2, null);
    }

    public /* synthetic */ EnableNotificationsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableNotificationsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgActionPrimary);
        this.bgColor = themeColor;
        this.bxFillDrawable = LazyUtilsKt.unsafeLazy(new EnableNotificationsView$bxFillDrawable$2(this, context));
        this.bxFillMaxDrawable = LazyUtilsKt.unsafeLazy(new EnableNotificationsView$bxFillMaxDrawable$2(this, context));
        ViewAllowPushBinding inflate = ViewAllowPushBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setBackgroundColor(themeColor);
        setMinHeight(ResourceExtKt.toPx(90));
    }
}
