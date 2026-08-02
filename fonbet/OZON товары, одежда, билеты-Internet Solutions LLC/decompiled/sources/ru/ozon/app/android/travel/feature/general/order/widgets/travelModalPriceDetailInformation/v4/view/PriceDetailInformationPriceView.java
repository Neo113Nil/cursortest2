package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view;

import Am.C2438a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/view/PriceDetailInformationPriceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/view/PriceItemViewBinder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItemVO;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badge$delegate", "price", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPrice", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "price$delegate", "bind", "", "item", "initLayout", "addViews", "setupConstraints", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceDetailInformationPriceView extends ConstraintLayout implements PriceItemViewBinder<TravelModalPriceDetailInformationV4VO.PriceItemVO> {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PriceDetailInformationPriceView.class, "text", "getText()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(PriceDetailInformationPriceView.class, "badge", "getBadge()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(PriceDetailInformationPriceView.class, "price", "getPrice()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0)};
    public static final int $stable;

    /* renamed from: badge$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badge;
    private final int dp8;

    /* renamed from: price$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate price;

    /* renamed from: text$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate text;

    static {
        int i11 = PriceAtomView.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i12 | BadgeView.$stable | i12 | TextAtomV2View.$stable | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceDetailInformationPriceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.text = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new PriceDetailInformationPriceView$special$$inlined$preCreationViewPool$default$1(this), new PriceDetailInformationPriceView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.badge = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new PriceDetailInformationPriceView$special$$inlined$preCreationViewPool$default$3(this), new PriceDetailInformationPriceView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.price = new PreCreationViewPoolDelegate(context4, N.b(PriceAtomView.class), new PriceDetailInformationPriceView$special$$inlined$preCreationViewPool$default$5(this), new PriceDetailInformationPriceView$special$$inlined$preCreationViewPool$default$6());
        initLayout();
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(getText());
        addView(getBadge());
        addView(getPrice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBadge() {
        return (BadgeView) this.badge.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getPrice() {
        return (PriceAtomView) this.price.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getText() {
        return (TextAtomV2View) this.text.getValue(this, $$delegatedProperties[0]);
    }

    private final void initLayout() {
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new PriceDetailInformationPriceView$setupConstraints$1(this));
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view.PriceItemViewBinder
    public void bind(@NotNull TravelModalPriceDetailInformationV4VO.PriceItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getText(), item.getProduct(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getBadge(), item.getBadge(), (Function1) null, 2, (Object) null);
        PriceAtomHolderKt.bindOrGone$default(getPrice(), item.getPrice(), null, 2, null);
    }
}
