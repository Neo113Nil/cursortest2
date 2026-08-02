package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.TravelCarriageTypeSelectV2VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J0\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014J&\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020 0-j\u0002`/J&\u00100\u001a\u00020 2\u0006\u00101\u001a\u0002022\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020 0-j\u0002`/J\b\u00103\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/view/TravelCarriageTypeSelectV2View;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp6", "dp8", "dp12", "aspectAV", "Lru/ozon/uni/android/atom/aspect/AspectView;", "nameTV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getNameTV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "nameTV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "seatsNumberTV", "getSeatsNumberTV", "seatsNumberTV$delegate", "pricePAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPricePAV", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV$delegate", "horizontalPadding", "verticalPadding", "isSeatsNumberOnNewLine", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "left", "top", "right", "bottom", "bind", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO$CarriageTypeVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "bindAspect", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "addViews", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageTypeSelectV2View extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelCarriageTypeSelectV2View.class, "nameTV", "getNameTV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelCarriageTypeSelectV2View.class, "seatsNumberTV", "getSeatsNumberTV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelCarriageTypeSelectV2View.class, "pricePAV", "getPricePAV()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final AspectView aspectAV;
    private final int dp12;
    private final int dp2;
    private final int dp6;
    private final int dp8;
    private final int horizontalPadding;
    private boolean isSeatsNumberOnNewLine;

    /* renamed from: nameTV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate nameTV;

    /* renamed from: pricePAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePAV;

    /* renamed from: seatsNumberTV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatsNumberTV;
    private final int verticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCarriageTypeSelectV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        int px = ResourceExtKt.toPx(6, context);
        this.dp6 = px;
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        AspectView aspectView = new AspectView(context, null, 0, 6, null);
        aspectView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.aspectAV = aspectView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.nameTV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new TravelCarriageTypeSelectV2View$special$$inlined$preCreationViewPool$default$1(this), new TravelCarriageTypeSelectV2View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.seatsNumberTV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new TravelCarriageTypeSelectV2View$special$$inlined$preCreationViewPool$default$3(this), new TravelCarriageTypeSelectV2View$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.pricePAV = new PreCreationViewPoolDelegate(context4, N.b(PriceAtomView.class), new TravelCarriageTypeSelectV2View$special$$inlined$preCreationViewPool$default$5(this), new TravelCarriageTypeSelectV2View$special$$inlined$preCreationViewPool$default$6());
        this.horizontalPadding = px2 * 2;
        this.verticalPadding = px * 2;
        addViews();
    }

    private final void addViews() {
        addView(this.aspectAV);
        addView(getNameTV());
        addView(getSeatsNumberTV());
        addView(getPricePAV());
    }

    private final TextAtomV2View getNameTV() {
        return (TextAtomV2View) this.nameTV.getValue(this, $$delegatedProperties[0]);
    }

    private final PriceAtomView getPricePAV() {
        return (PriceAtomView) this.pricePAV.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getSeatsNumberTV() {
        return (TextAtomV2View) this.seatsNumberTV.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull TravelCarriageTypeSelectV2VO.CarriageTypeVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        AspectHolderKt.bind(this.aspectAV, item.getAspect(), actionHandler);
        TextHolderKt.bind$default(getNameTV(), item.getName(), null, 2, null);
        TextHolderKt.bind$default(getSeatsNumberTV(), item.getSeatsNumber(), null, 2, null);
        PriceAtomHolderKt.bind$default(getPricePAV(), item.getPrice(), null, 2, null);
        this.isSeatsNumberOnNewLine = item.getIsSeatsNumberOnNewLine();
        requestLayout();
    }

    public final void bindAspect(@NotNull AspectDTO aspect, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(aspect, "aspect");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        AspectHolderKt.bind(this.aspectAV, aspect, actionHandler);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int baseline;
        this.aspectAV.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int measuredHeight = getNameTV().getMeasuredHeight() + this.dp6;
        TextAtomV2View nameTV = getNameTV();
        nameTV.layout(this.dp12, this.dp6, nameTV.getMeasuredWidth() + this.dp12, measuredHeight);
        int measuredWidth = this.isSeatsNumberOnNewLine ? this.dp12 : getNameTV().getMeasuredWidth() + this.dp12 + this.dp8;
        if (this.isSeatsNumberOnNewLine) {
            baseline = this.dp2 + measuredHeight;
        } else {
            int baseline2 = getNameTV().getBaseline();
            baseline = baseline2 != -1 ? (baseline2 - getSeatsNumberTV().getBaseline()) + this.dp6 : this.dp6;
        }
        TextAtomV2View seatsNumberTV = getSeatsNumberTV();
        seatsNumberTV.layout(measuredWidth, baseline, seatsNumberTV.getMeasuredWidth() + measuredWidth, seatsNumberTV.getMeasuredHeight() + baseline);
        if (this.isSeatsNumberOnNewLine) {
            measuredHeight = getSeatsNumberTV().getBottom() + this.dp2;
        }
        PriceAtomView pricePAV = getPricePAV();
        pricePAV.layout(this.dp12, measuredHeight, pricePAV.getMeasuredWidth() + this.dp12, pricePAV.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int max;
        int i11;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildWithMargins(getPricePAV(), View.MeasureSpec.makeMeasureSpec(32767, LinearLayoutManager.INVALID_OFFSET), 0, heightMeasureSpec, 0);
        if (this.isSeatsNumberOnNewLine) {
            max = Math.max(getNameTV().getMeasuredWidth(), Math.max(getSeatsNumberTV().getMeasuredWidth(), getPricePAV().getMeasuredWidth()));
            i11 = this.horizontalPadding;
        } else {
            max = Math.max(getSeatsNumberTV().getMeasuredWidth() + getNameTV().getMeasuredWidth() + this.dp8, getPricePAV().getMeasuredWidth());
            i11 = this.horizontalPadding;
        }
        int i12 = max + i11;
        int measuredHeight = getPricePAV().getMeasuredHeight() + getNameTV().getMeasuredHeight() + this.verticalPadding;
        if (this.isSeatsNumberOnNewLine) {
            measuredHeight += (this.dp2 * 2) + getSeatsNumberTV().getMeasuredHeight();
        }
        setMeasuredDimension(i12, measuredHeight);
    }
}
