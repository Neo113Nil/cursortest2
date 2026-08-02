package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation.BigPromoCheckoutVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "defaultBgColor", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "timerView", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutTimerView;", "getTimerView", "()Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutTimerView;", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO;", "onTimerLeft", "data", "setTimerRadius", "cornerRadius", "", "addIconView", "addTitleView", "addSubtitleView", "addTimerView", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoCheckoutView extends ConstraintLayout {
    private final int defaultBgColor;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final BigPromoCheckoutTimerView timerView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_2 = ResourceExtKt.toPx(2);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_12 = ResourceExtKt.toPx(12);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutView$Companion;", "", "<init>", "()V", "", "DP_2", "I", "getDP_2", "()I", "DP_8", "getDP_8", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_2() {
            return BigPromoCheckoutView.DP_2;
        }

        public final int getDP_8() {
            return BigPromoCheckoutView.DP_8;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BigPromoCheckoutView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addIconView() {
        addView(this.iconView);
        ConstraintLayoutExtKt.updateConstraints(this, new BigPromoCheckoutView$addIconView$1(this));
    }

    private final void addSubtitleView() {
        addView(this.subtitleView);
        ConstraintLayoutExtKt.updateConstraints(this, new BigPromoCheckoutView$addSubtitleView$1(this));
        TextAtomV2View textAtomV2View = this.subtitleView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(bVar);
    }

    private final void addTimerView() {
        addView(this.timerView);
        ConstraintLayoutExtKt.updateConstraints(this, new BigPromoCheckoutView$addTimerView$1(this));
    }

    private final void addTitleView() {
        addView(this.titleView);
        ConstraintLayoutExtKt.updateConstraints(this, new BigPromoCheckoutView$addTitleView$1(this));
        TextAtomV2View textAtomV2View = this.titleView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(bVar);
    }

    public final void bind(@NotNull BigPromoCheckoutVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        setBackgroundColor(parseColor != null ? parseColor.intValue() : this.defaultBgColor);
        IconHolderKt.bindOrGone$default(this.iconView, item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        this.timerView.bindOrGone(item.getTimerBadge());
    }

    @NotNull
    public final BigPromoCheckoutTimerView getTimerView() {
        return this.timerView;
    }

    public final void onTimerLeft(BigPromoCheckoutVO data) {
        BigPromoCheckoutVO.TimerBadgeVO timerBadge;
        this.timerView.onTimeLeft((data == null || (timerBadge = data.getTimerBadge()) == null) ? null : timerBadge.getOnExpiredText());
    }

    public final void setTimerRadius(float cornerRadius) {
        this.timerView.setCornerRadius(cornerRadius);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoCheckoutView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultBgColor = context.getColor(R$color.layer_floor_1);
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        iconView.setId(R$id.bigPromoCheckoutIcon);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setId(R$id.bigPromoCheckoutTitle);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View2.setId(R$id.bigPromoCheckoutSubtitle);
        this.subtitleView = textAtomV2View2;
        BigPromoCheckoutTimerView bigPromoCheckoutTimerView = new BigPromoCheckoutTimerView(context, null, 0, 0, 14, null);
        bigPromoCheckoutTimerView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        bigPromoCheckoutTimerView.setId(R$id.bigPromoCheckoutTimer);
        this.timerView = bigPromoCheckoutTimerView;
        setId(R$id.bigPromoCheckout);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        int i13 = DP_12;
        setPadding(i13, 0, DP_16, i13);
        addIconView();
        addTitleView();
        addSubtitleView();
        addTimerView();
    }
}
