package ru.ozon.app.android.returns.common.presentation.views;

import Cm.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*J\u000e\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020(H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010!\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010#\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0011\u0010%\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u00063"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp4", "dp8", "dp12", "dp16", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "captionTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getCaptionTAV", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "descriptionTextAtomView", "getDescriptionTextAtomView", "actionButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getActionButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "messageContainer", "getMessageContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "messageHeaderTAV", "getMessageHeaderTAV", "messageTextTAV", "getMessageTextTAV", "messageCaptionTAV", "getMessageCaptionTAV", "button", "getButton", "setMessagePaddings", "", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "rightPadding", "bottomPadding", "changeDescriptionGroupVisibility", "isVisible", "", "setupConstraints", "setupMessageConstrains", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnStatusView extends ConstraintLayout {

    @NotNull
    private final ButtonV3View actionButton;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final ButtonV3View button;

    @NotNull
    private final TextAtomView captionTAV;

    @NotNull
    private final TextAtomView descriptionTextAtomView;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final TextAtomView messageCaptionTAV;

    @NotNull
    private final ConstraintLayout messageContainer;

    @NotNull
    private final TextAtomView messageHeaderTAV;

    @NotNull
    private final TextAtomView messageTextTAV;

    public /* synthetic */ ReturnStatusView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.badgeView);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.badgeView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.badgeView);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.captionTAV);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.captionTAV, this.badgeView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.captionTAV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.descriptionTextAtomView);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.descriptionTextAtomView);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.descriptionTextAtomView, this.captionTAV);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.actionButton);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.actionButton);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.actionButton, this.descriptionTextAtomView);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.messageContainer, this.actionButton);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.messageContainer);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.messageContainer);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, this.messageContainer);
        dVar.f(this);
    }

    private final void setupMessageConstrains() {
        ConstraintLayout constraintLayout = this.messageContainer;
        d b11 = e.b(constraintLayout);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(b11, this.messageHeaderTAV);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(b11, this.messageHeaderTAV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(b11, this.messageHeaderTAV);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(b11, this.messageHeaderTAV, this.messageTextTAV);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(b11, this.messageTextTAV);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, this.messageTextTAV, this.messageHeaderTAV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(b11, this.messageTextTAV);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(b11, this.messageTextTAV, this.messageCaptionTAV);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(b11, this.messageCaptionTAV);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, this.messageCaptionTAV, this.messageTextTAV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(b11, this.messageCaptionTAV);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(b11, this.messageCaptionTAV, this.button);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(b11, this.button);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, this.button, this.messageCaptionTAV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(b11, this.button);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(b11, this.button);
        b11.g0(this.messageHeaderTAV.getId(), 2);
        b11.f(constraintLayout);
    }

    public final void changeDescriptionGroupVisibility(boolean isVisible) {
        this.descriptionTextAtomView.setVisibility(isVisible ? 0 : 8);
    }

    @NotNull
    public final ButtonV3View getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final BadgeView getBadgeView() {
        return this.badgeView;
    }

    @NotNull
    public final ButtonV3View getButton() {
        return this.button;
    }

    @NotNull
    public final TextAtomView getCaptionTAV() {
        return this.captionTAV;
    }

    @NotNull
    public final TextAtomView getDescriptionTextAtomView() {
        return this.descriptionTextAtomView;
    }

    @NotNull
    public final TextAtomView getMessageCaptionTAV() {
        return this.messageCaptionTAV;
    }

    @NotNull
    public final ConstraintLayout getMessageContainer() {
        return this.messageContainer;
    }

    @NotNull
    public final TextAtomView getMessageHeaderTAV() {
        return this.messageHeaderTAV;
    }

    @NotNull
    public final TextAtomView getMessageTextTAV() {
        return this.messageTextTAV;
    }

    public final void setMessagePaddings(@NotNull Paddings leftPadding, @NotNull Paddings topPadding, @NotNull Paddings rightPadding, @NotNull Paddings bottomPadding) {
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.messageContainer.setPadding(UiExtKt.toPx(leftPadding.getPx()), UiExtKt.toPx(topPadding.getPx()), UiExtKt.toPx(rightPadding.getPx()), UiExtKt.toPx(bottomPadding.getPx()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnStatusView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = UiExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = UiExtKt.toPx(12, context);
        this.dp12 = px3;
        int px4 = UiExtKt.toPx(16, context);
        this.dp16 = px4;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.badgeView, -2, -2);
        a11.setMargins(px4, ((ViewGroup.MarginLayoutParams) a11).topMargin, px4, ((ViewGroup.MarginLayoutParams) a11).bottomMargin);
        a11.f41616W = true;
        a11.f41598E = 0.0f;
        badgeView.setLayoutParams(a11);
        this.badgeView = badgeView;
        AttributeSet attributeSet2 = null;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.setMargins(px4, px2, px4, 0);
        textAtomView.setLayoutParams(bVar);
        ViewExtKt.gone(textAtomView);
        this.captionTAV = textAtomView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        textAtomView2.setStyleOrDefault(Integer.valueOf(UniTextStyles.COMPACT_500_MEDIUM.getResId()));
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.setMargins(px4, px2, px4, 0);
        bVar2.f41660x = px3;
        textAtomView2.setLayoutParams(bVar2);
        ViewExtKt.gone(textAtomView2);
        this.descriptionTextAtomView = textAtomView2;
        int i12 = 0;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, 0, i12, 14, null);
        buttonV3View.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-1, -2);
        bVar3.setMargins(px4, px4, px4, 0);
        buttonV3View.setLayoutParams(bVar3);
        this.actionButton = buttonV3View;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        bVar4.f41660x = px3;
        bVar4.setMargins(px4, px4, px4, px4);
        constraintLayout.setLayoutParams(bVar4);
        constraintLayout.setBackgroundColor(androidx.core.content.a.getColor(context, R$color.bg_secondary));
        ViewExtKt.gone(constraintLayout);
        this.messageContainer = constraintLayout;
        TextAtomView textAtomView3 = new TextAtomView(context, null, 0, 6, null);
        textAtomView3.setId(View.generateViewId());
        textAtomView3.setLayoutParams(new ConstraintLayout.b(-1, -2));
        constraintLayout.addView(textAtomView3);
        this.messageHeaderTAV = textAtomView3;
        TextAtomView textAtomView4 = new TextAtomView(context, null, 0, 6, null);
        textAtomView4.setId(View.generateViewId());
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-1, -2);
        bVar5.setMargins(((ViewGroup.MarginLayoutParams) bVar5).leftMargin, px2, ((ViewGroup.MarginLayoutParams) bVar5).rightMargin, ((ViewGroup.MarginLayoutParams) bVar5).bottomMargin);
        bVar5.f41660x = 0;
        textAtomView4.setLayoutParams(bVar5);
        constraintLayout.addView(textAtomView4);
        this.messageTextTAV = textAtomView4;
        TextAtomView textAtomView5 = new TextAtomView(context, null, 0, 6, null);
        textAtomView5.setId(View.generateViewId());
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(-1, -2);
        bVar6.setMargins(((ViewGroup.MarginLayoutParams) bVar6).leftMargin, px, ((ViewGroup.MarginLayoutParams) bVar6).rightMargin, ((ViewGroup.MarginLayoutParams) bVar6).bottomMargin);
        bVar6.f41660x = 0;
        textAtomView5.setLayoutParams(bVar6);
        constraintLayout.addView(textAtomView5);
        this.messageCaptionTAV = textAtomView5;
        ButtonV3View buttonV3View2 = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View2.setId(View.generateViewId());
        buttonV3View2.setLayoutParams(new ConstraintLayout.b(-1, -2));
        constraintLayout.addView(buttonV3View2);
        this.button = buttonV3View2;
        addView(badgeView);
        addView(textAtomView);
        addView(textAtomView2);
        addView(buttonV3View);
        addView(constraintLayout);
        setupConstraints();
        setupMessageConstrains();
    }
}
