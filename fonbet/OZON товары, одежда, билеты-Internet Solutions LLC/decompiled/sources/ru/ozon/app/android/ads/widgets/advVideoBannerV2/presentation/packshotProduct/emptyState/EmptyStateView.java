package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.emptyState;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.R$font;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014J0\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/emptyState/EmptyStateView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "disclosureIconViewSizePx", "disclosureIconView16PxSize", "Landroid/util/Size;", "titleTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "disclosureIconView", "Landroidx/appcompat/widget/AppCompatImageView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "layoutDisclosureIconView", "Landroid/graphics/Rect;", "measureDisclosureIconView", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyStateView extends ViewGroup {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppCompatImageView disclosureIconView;

    @NotNull
    private final Size disclosureIconView16PxSize;
    private final int disclosureIconViewSizePx;

    @NotNull
    private final TextAtomView titleTextAtomView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/emptyState/EmptyStateView$Companion;", "", "<init>", "()V", "DISCLOSURE_ICON_SIZE", "", "DEFAULT_TITLE_TEXT_SIZE", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EmptyStateView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void layoutDisclosureIconView(Rect titleTextAtomView) {
        int px = titleTextAtomView.right - ResourceExtKt.toPx(8);
        int i11 = titleTextAtomView.bottom;
        this.disclosureIconView.layout(px, i11 - this.disclosureIconViewSizePx, this.disclosureIconView.getMeasuredWidth() + px, i11);
    }

    private final void measureDisclosureIconView() {
        MeasureExtKt.measureExactly(this.disclosureIconView, this.disclosureIconView16PxSize.getWidth(), this.disclosureIconView16PxSize.getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        int measuredWidth = ((getMeasuredWidth() - this.titleTextAtomView.getMeasuredWidth()) - this.disclosureIconView.getMeasuredWidth()) / 2;
        int px = ResourceExtKt.toPx(4) + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.titleTextAtomView.getMeasuredHeight() / 2);
        int measuredWidth2 = (getMeasuredWidth() - measuredWidth) - ResourceExtKt.toPx(4);
        int measuredHeight2 = this.titleTextAtomView.getMeasuredHeight() + measuredHeight;
        this.titleTextAtomView.layout(px, measuredHeight, measuredWidth2, measuredHeight2);
        layoutDisclosureIconView(new Rect(px, measuredHeight, measuredWidth2, measuredHeight2));
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.titleTextAtomView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec) - this.disclosureIconViewSizePx, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        measureDisclosureIconView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.disclosureIconViewSizePx = px;
        this.disclosureIconView16PxSize = new Size(px, px);
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setText(StringProvider.getString(R$string.empty_state_text));
        textAtomView.setTextSize(16.0f);
        textAtomView.setTypeface(g.e(R$font.onest_regular, context));
        textAtomView.setStyleOrDefault(Integer.valueOf(R$style.OzonTextAppearance_Headline_400small));
        textAtomView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textLightKey));
        addView(textAtomView);
        this.titleTextAtomView = textAtomView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R$drawable.ic_s_disclosure_compact);
        appCompatImageView.setForegroundGravity(17);
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicTertiaryOnDark)));
        addView(appCompatImageView);
        this.disclosureIconView = appCompatImageView;
    }
}
