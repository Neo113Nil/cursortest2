package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view;

import F3.G;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3LuggageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp2", "dp8", "dp10", "dp16", "dpf16", "", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "backgroundColor", "airlineLogoIconViewIV", "Lru/ozon/uni/android/atom/icon/IconView;", "subAirlineLogoIconViewIV", "routeTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "cellsVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "addViews", "makeCellTransparent", "setupConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3LuggageView extends ConstraintLayout {
    public static final int $stable;

    @NotNull
    private final IconView airlineLogoIconViewIV;

    @NotNull
    private final AtomsAdapter atomsAdapter;
    private final int backgroundColor;

    @NotNull
    private final VerticalAtomsLayout cellsVAL;
    private final int dp10;
    private final int dp16;
    private final int dp2;
    private final int dp8;
    private final float dpf16;

    @NotNull
    private final TextAtomV2View routeTAV;

    @NotNull
    private final IconView subAirlineLogoIconViewIV;

    static {
        int i11 = VerticalAtomsLayout.$stable | TextAtomV2View.$stable;
        int i12 = IconView.$stable;
        $stable = i11 | i12 | i12 | AtomsAdapter.$stable;
    }

    public /* synthetic */ AviaDetailedInfoV3LuggageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.airlineLogoIconViewIV);
        addView(this.subAirlineLogoIconViewIV);
        addView(this.routeTAV);
        addView(this.cellsVAL);
    }

    private final void makeCellTransparent() {
        VerticalAtomsLayout verticalAtomsLayout = this.cellsVAL;
        int childCount = verticalAtomsLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            verticalAtomsLayout.getChildAt(i11).setBackgroundColor(0);
        }
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new AviaDetailedInfoV3LuggageView$setupConstraints$1(this));
    }

    public final void bind(@NotNull AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bind$default(this.airlineLogoIconViewIV, item.getAirlineLogo(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.subAirlineLogoIconViewIV, item.getSubAirlineLogo(), null, 2, null);
        TextHolderKt.bind$default(this.routeTAV, item.getRoute(), null, 2, null);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getCells());
        makeCellTransparent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3LuggageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = UiExtKt.toPx(2, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp10 = UiExtKt.toPx(10, context);
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        this.backgroundColor = themeColor;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.aviaDetailedInfoV3LuggageAirlineIconViewIV);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.airlineLogoIconViewIV = iconView;
        IconView iconView2 = new IconView(context, null, 0, 6, null);
        iconView2.setId(R$id.aviaDetailedInfoV3LuggageSubAirlineIconViewIV);
        iconView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.subAirlineLogoIconViewIV = iconView2;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        textAtomV2View = textAtomV2View == null ? new TextAtomV2View(context, null, 0, 6, null) : textAtomV2View;
        G.g(textAtomV2View, R$id.aviaDetailedInfoV3LuggageRouteTAV, 0, -2);
        this.routeTAV = textAtomV2View;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.aviaDetailedInfoV3LuggageCellsVAL);
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        this.cellsVAL = verticalAtomsLayout;
        setPadding(0, px, 0, px);
        setBackground(new RoundedBackgroundProducer().produce(themeColor, pxF));
        addViews();
        setupConstraints();
    }
}
