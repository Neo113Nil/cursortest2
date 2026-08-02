package ru.ozon.app.android.common.emptyState;

import Eq.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import gk0.q;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\u001bJ\u0014\u0010\"\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$J\b\u0010%\u001a\u00020&H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/emptyState/EmptyStateViewGroup;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp8", "dp16", "dp20", "dp48", "dp86", "imageMinHeight", "imageMinWidth", "emptyImageView", "Landroid/widget/ImageView;", "titleTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "messageTextView", "actionButton", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "setImage", "", "image", "", "setTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "setMessage", "message", "setAction", "action", "onActionButtonClick", "function", "Lkotlin/Function0;", "getWrapLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "empty-state_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyStateViewGroup extends LinearLayout {

    @NotNull
    private final SmallButtonView actionButton;
    private final int dp16;
    private final int dp20;
    private final int dp48;
    private final int dp8;
    private final int dp86;

    @NotNull
    private final ImageView emptyImageView;
    private final int imageMinHeight;
    private final int imageMinWidth;

    @NotNull
    private final AppCompatTextView messageTextView;

    @NotNull
    private final AppCompatTextView titleTextView;

    public /* synthetic */ EmptyStateViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final LinearLayout.LayoutParams getWrapLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public final void onActionButtonClick(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.actionButton.setOnClickListener(new a(function, 0));
    }

    public final void setAction(String action) {
        TextViewExtKt.setTextOrGone(this.actionButton, action);
    }

    public final void setImage(String image) {
        ImageViewExtKt.loadImageOrGone(this.emptyImageView, image);
    }

    public final void setMessage(String message) {
        this.messageTextView.setText(message);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.titleTextView.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(20, context);
        this.dp20 = px3;
        int px4 = ResourceExtKt.toPx(48, context);
        this.dp48 = px4;
        int px5 = ResourceExtKt.toPx(86, context);
        this.dp86 = px5;
        int px6 = ResourceExtKt.toPx(32, context);
        this.imageMinHeight = px6;
        int px7 = ResourceExtKt.toPx(144, context);
        this.imageMinWidth = px7;
        q qVar = q.f64554a;
        ImageView imageView = (ImageView) qVar.i(N.b(ImageView.class), context);
        imageView = imageView == null ? new ImageView(context) : imageView;
        addView(imageView);
        imageView.setId(R$id.emptyStateIv);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = px5;
        layoutParams2.width = px5;
        layoutParams2.gravity = 17;
        layoutParams2.setMargins(px2, px2, px2, 0);
        imageView.setLayoutParams(layoutParams2);
        this.emptyImageView = imageView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context);
        appCompatTextView = appCompatTextView == null ? new AppCompatTextView(context) : appCompatTextView;
        addView(appCompatTextView);
        appCompatTextView.setId(R$id.emptyStateTitleTv);
        LinearLayout.LayoutParams wrapLayoutParams = getWrapLayoutParams();
        wrapLayoutParams.setMargins(px2, px2, px2, 0);
        wrapLayoutParams.gravity = 17;
        appCompatTextView.setLayoutParams(wrapLayoutParams);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L_Bold);
        this.titleTextView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context);
        appCompatTextView2 = appCompatTextView2 == null ? new AppCompatTextView(context) : appCompatTextView2;
        addView(appCompatTextView2);
        appCompatTextView2.setId(R$id.emptyStateMessageTv);
        LinearLayout.LayoutParams wrapLayoutParams2 = getWrapLayoutParams();
        wrapLayoutParams2.setMargins(px4, px, px4, 0);
        wrapLayoutParams2.weight = 1.0f;
        wrapLayoutParams2.gravity = 17;
        appCompatTextView2.setLayoutParams(wrapLayoutParams2);
        appCompatTextView2.setTextAlignment(4);
        appCompatTextView2.setTextAppearance(R$style.TextStyle_Body_M_Black);
        this.messageTextView = appCompatTextView2;
        SmallButtonView smallButtonView = (SmallButtonView) qVar.i(N.b(SmallButtonView.class), context);
        smallButtonView = smallButtonView == null ? new SmallButtonView(context, null, 0, 6, null) : smallButtonView;
        addView(smallButtonView);
        smallButtonView.setId(R$id.emptyStateActionTv);
        LinearLayout.LayoutParams wrapLayoutParams3 = getWrapLayoutParams();
        smallButtonView.setMinHeight(px6);
        smallButtonView.setMinWidth(px7);
        wrapLayoutParams3.setMargins(0, px3, 0, px2);
        smallButtonView.setPadding(px2, px, px2, px);
        wrapLayoutParams3.gravity = 17;
        smallButtonView.setTextAlignment(4);
        smallButtonView.setLayoutParams(wrapLayoutParams3);
        ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt.applyStyle(smallButtonView, context, R$style.SmallButton_Secondary);
        smallButtonView.setBackground(C7232a.a(context, R$drawable.o2_button_secondary_s));
        smallButtonView.setTextAppearance(R$style.TextStyle_Body_M_Bold);
        smallButtonView.setTextColor(context.getColor(R$color.o2_selector_color_text_for_button_secondary));
        this.actionButton = smallButtonView;
    }
}
