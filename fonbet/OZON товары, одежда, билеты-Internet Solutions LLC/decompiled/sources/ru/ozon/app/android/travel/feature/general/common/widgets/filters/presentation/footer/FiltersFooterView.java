package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer.FiltersFooterVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO$State;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO$State;Lkotlin/jvm/functions/Function1;)V", "", "negativeDp2", "I", "dp1", "dp8", "dp16", "", "dp24f", "F", "", "halfRoundedCornerRadii$delegate", "LSc/j;", "getHalfRoundedCornerRadii", "()[F", "halfRoundedCornerRadii", "backgroundColor", "strokeColor", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawableWithBorder", "Landroid/graphics/drawable/InsetDrawable;", "insetDrawable", "Landroid/graphics/drawable/InsetDrawable;", "insetDrawableWithBorder", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterDecoration;", "buttonsDecorator", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterDecoration;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersFooterView extends FrameLayout {
    private final int backgroundColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final GradientDrawable backgroundDrawableWithBorder;

    @NotNull
    private final AtomsAdapter buttonsAtomsAdapter;

    @NotNull
    private final FiltersFooterDecoration buttonsDecorator;
    private final int dp1;
    private final int dp16;
    private final float dp24f;
    private final int dp8;

    /* renamed from: halfRoundedCornerRadii$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j halfRoundedCornerRadii;

    @NotNull
    private final InsetDrawable insetDrawable;

    @NotNull
    private final InsetDrawable insetDrawableWithBorder;
    private final int negativeDp2;
    private final int strokeColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersFooterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(-2, context);
        this.negativeDp2 = px;
        int px2 = ResourceExtKt.toPx(1, context);
        this.dp1 = px2;
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp24f = ResourceExtKt.toPxF(24, context);
        this.halfRoundedCornerRadii = LazyUtilsKt.unsafeLazy(new FiltersFooterView$halfRoundedCornerRadii$2(this));
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.graphicDisabled);
        this.strokeColor = themeColor2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(themeColor);
        gradientDrawable.setCornerRadii(getHalfRoundedCornerRadii());
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(themeColor);
        gradientDrawable2.setStroke(px2, themeColor2);
        gradientDrawable2.setCornerRadii(getHalfRoundedCornerRadii());
        this.backgroundDrawableWithBorder = gradientDrawable2;
        this.insetDrawable = new InsetDrawable((Drawable) gradientDrawable, px, 0, px, px);
        this.insetDrawableWithBorder = new InsetDrawable((Drawable) gradientDrawable2, px, 0, px, px);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAtomsAdapter = atomsAdapter;
        FiltersFooterDecoration filtersFooterDecoration = new FiltersFooterDecoration(context);
        this.buttonsDecorator = filtersFooterDecoration;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(filtersFooterDecoration);
        addView(verticalAtomsLayout);
    }

    private final float[] getHalfRoundedCornerRadii() {
        return (float[]) this.halfRoundedCornerRadii.getValue();
    }

    public final void bind(@NotNull FiltersFooterVO.State item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.buttonsDecorator.updateOffset(item.getButtonsMargin());
        AtomsAdapter atomsAdapter = this.buttonsAtomsAdapter;
        List<ButtonV3DTO> buttons = item.getButtons();
        if (buttons != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, buttons);
            atomsAdapter.setOnAction(actionHandler);
        }
        setBackground(item.getIsSingleSection() ? this.insetDrawable : this.insetDrawableWithBorder);
        int i11 = this.dp16;
        setPadding(i11, i11, i11, this.dp8);
    }
}
