package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J0\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u00020\u00162\b\b\u0001\u0010$\u001a\u00020\u0007H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/views/AdultContentView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "adultIconView", "Landroidx/appcompat/widget/AppCompatImageView;", "adultTitleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "adultTextDTO", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dp4", "dp6", "dp100", "dp335", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "setClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setAdultView", "imageWidth", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdultContentView extends ViewGroup {

    @NotNull
    private final AppCompatImageView adultIconView;

    @NotNull
    private TextDTO adultTextDTO;

    @NotNull
    private final TextAtomV2View adultTitleView;
    private final int dp100;
    private final int dp335;
    private final int dp4;
    private final int dp6;

    public /* synthetic */ AdultContentView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void setAdultView(int imageWidth) {
        if (imageWidth >= this.dp335) {
            this.adultIconView.setImageResource(R$drawable.ic_m_non_visibility_filled);
            this.adultTextDTO = TextDTO.copy$default(this.adultTextDTO, null, null, null, null, null, null, null, UniTextStyles.COMPACT_500_MEDIUM.getToken(), null, null, null, null, null, false, null, null, null, null, null, 524159, null);
        } else {
            this.adultIconView.setImageResource(R$drawable.ic_s_non_visibility_filled);
            this.adultTextDTO = TextDTO.copy$default(this.adultTextDTO, null, null, null, null, null, null, null, UniTextStyles.COMPACT_400_SMALL.getToken(), null, null, null, null, null, false, null, null, null, null, null, 524159, null);
        }
        if (imageWidth > this.dp100) {
            TextHolderKt.bind$default(this.adultTitleView, this.adultTextDTO, null, 2, null);
        } else {
            ViewExtKt.gone(this.adultTitleView);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        if (this.adultTitleView.getVisibility() != 0) {
            LayoutExtKt.layoutLeftTop(this.adultIconView, 0, 0);
        } else {
            LayoutExtKt.layoutLeftTop(this.adultIconView, (this.adultTitleView.getMeasuredWidth() - this.adultIconView.getMeasuredWidth()) / 2, 0);
            LayoutExtKt.layoutLeftTop(this.adultTitleView, 0, this.adultIconView.getMeasuredHeight() + this.dp4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        setAdultView(size);
        MeasureExtKt.measureUnspecified(this.adultIconView);
        if (this.adultTitleView.getVisibility() != 0) {
            setMeasuredDimension(this.adultIconView.getMeasuredWidth(), this.adultIconView.getMeasuredHeight());
            return;
        }
        MeasureExtKt.measure(this.adultTitleView, size - (this.dp6 * 2), LinearLayoutManager.INVALID_OFFSET, 0, 0);
        setMeasuredDimension(this.adultTitleView.getMeasuredWidth(), this.adultIconView.getMeasuredHeight() + this.adultTitleView.getMeasuredHeight() + this.dp4);
    }

    public final void setClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.adultTitleView.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdultContentView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.uwAdultIcon);
        UniColors uniColors = UniColors.TEXT_PRIMARY_ON_LIGHT;
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(context.getColor(uniColors.getResId())));
        addView(appCompatImageView);
        this.adultIconView = appCompatImageView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.uwAdultTitle);
        textAtomV2View.setFocusable(false);
        addView(textAtomV2View);
        this.adultTitleView = textAtomV2View;
        String string = context.getString(R$string.common_message_adult);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.adultTextDTO = new TextDTO(OzonSpannableStringKt.toOzonSpannableString(string), TextDTO.TextAlignment.CENTER, null, null, null, null, TextPreset.PRESET_CUSTOM, null, uniColors.getToken(), 2, null, null, null, false, null, null, null, null, null, 523452, null);
        this.dp4 = UiExtKt.toPx(4);
        this.dp6 = UiExtKt.toPx(6);
        this.dp100 = UiExtKt.toPx(100);
        this.dp335 = UiExtKt.toPx(335);
    }
}
