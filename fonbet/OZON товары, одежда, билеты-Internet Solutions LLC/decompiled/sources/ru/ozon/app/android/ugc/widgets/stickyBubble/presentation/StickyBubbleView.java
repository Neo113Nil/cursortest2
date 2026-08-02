package ru.ozon.app.android.ugc.widgets.stickyBubble.presentation;

import Bl0.g0;
import I.f;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleVO;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\rJ\u0006\u0010\u001c\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "setBubbleBackground", "", "backgroundColor", "", "bindInitialState", "item", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;", "isSelected", "", "shrinkAndHide", "showSelectedBubble", "shrink", "expand", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "setExpandedMargins", "setDefaultMargins", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyBubbleView extends LinearLayout {

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable | IconView.$stable;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleView$Companion;", "", "<init>", "()V", "ZERO_TRANSLATION", "", "FULL_TRANSLATION", "VISIBILITY_DURATION", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyBubbleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet = null;
        int i12 = 0;
        IconView iconView = new IconView(context, attributeSet, i12, i11, defaultConstructorMarker);
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet, i12, i11, defaultConstructorMarker);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setLayoutParams(layoutParams);
        this.titleView = textAtomV2View;
        setOrientation(0);
        setBackground(ContextExtKt.createRoundRectShape$default(context, UiExtKt.toPxF(18), CornersConfig.ALL, 0, 0, null, 28, null));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(3);
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
        addView(iconView);
        addView(textAtomV2View);
        ViewExtKt.gone(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shrinkAndHide$lambda$5(StickyBubbleView stickyBubbleView) {
        stickyBubbleView.shrink();
        stickyBubbleView.post(new g0(stickyBubbleView, 2));
    }

    public final void bindInitialState(@NotNull StickyBubbleVO item, boolean isSelected) {
        Intrinsics.checkNotNullParameter(item, "item");
        StickyBubbleVO.StickyBubbleStateVO selectedState = isSelected ? item.getSelectedState() : item.getDefaultState();
        IconHolderKt.bindOrGone$default(this.iconView, selectedState != null ? selectedState.getIcon() : null, null, 2, null);
        if (item.getIsShrunk()) {
            ViewExtKt.gone(this.titleView);
            setDefaultMargins();
        } else {
            TextHolderKt.bindOrGone$default(this.titleView, selectedState != null ? selectedState.getText() : null, null, 2, null);
            setExpandedMargins();
        }
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(300L).withStartAction(new Runnable() { // from class: VW.a
            @Override // java.lang.Runnable
            public final void run() {
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(StickyBubbleView.this);
            }
        }).start();
    }

    public final void expand(@NotNull TextDTO text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextAtomV2View textAtomV2View = this.titleView;
        TextHolderKt.bindOrGone$default(textAtomV2View, text, null, 2, null);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(3);
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
        textAtomV2View.setTranslationY(0.0f);
        textAtomV2View.setTranslationX(0.0f);
        setExpandedMargins();
    }

    @NotNull
    public final TextAtomV2View getTitleView() {
        return this.titleView;
    }

    public final void setBubbleBackground(String backgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_ACTION_PRIMARY.getToken();
        }
        Integer parseColor = styleParser.parseColor(context, backgroundColor);
        if (parseColor != null) {
            setBackgroundTintList(ColorStateList.valueOf(parseColor.intValue()));
        }
    }

    public final void setDefaultMargins() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        setPadding(0, 0, 0, 0);
        setLayoutParams((LinearLayout.LayoutParams) layoutParams);
        IconView iconView = this.iconView;
        ViewGroup.LayoutParams layoutParams2 = iconView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams3.setMargins(dimens.getDP_6(), dimens.getDP_6(), dimens.getDP_6(), dimens.getDP_6());
        iconView.setLayoutParams(layoutParams3);
    }

    public final void setExpandedMargins() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_6(), dimens.getDP_6(), dimens.getDP_12(), dimens.getDP_6());
        setLayoutParams((LinearLayout.LayoutParams) layoutParams);
        IconView iconView = this.iconView;
        ViewGroup.LayoutParams layoutParams2 = iconView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.setMargins(0, 0, dimens.getDP_6(), 0);
        iconView.setLayoutParams(layoutParams3);
    }

    public final void showSelectedBubble(@NotNull StickyBubbleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconView iconView = this.iconView;
        StickyBubbleVO.StickyBubbleStateVO selectedState = item.getSelectedState();
        IconHolderKt.bindOrGone$default(iconView, selectedState != null ? selectedState.getIcon() : null, null, 2, null);
        if (item.getIsShrunk()) {
            return;
        }
        TextAtomV2View textAtomV2View = this.titleView;
        StickyBubbleVO.StickyBubbleStateVO selectedState2 = item.getSelectedState();
        TextHolderKt.bindOrGone$default(textAtomV2View, selectedState2 != null ? selectedState2.getText() : null, null, 2, null);
    }

    public final void shrink() {
        TextAtomV2View textAtomV2View = this.titleView;
        ViewExtKt.gone(textAtomV2View);
        textAtomV2View.setTranslationY(100.0f);
        textAtomV2View.setTranslationX(100.0f);
        setDefaultMargins();
    }

    public final void shrinkAndHide() {
        animate().alpha(0.0f).setDuration(300L).withEndAction(new f(this, 2)).start();
    }
}
