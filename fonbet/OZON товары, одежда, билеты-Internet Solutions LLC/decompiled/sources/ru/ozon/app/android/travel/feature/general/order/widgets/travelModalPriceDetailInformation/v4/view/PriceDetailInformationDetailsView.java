package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view;

import Am.C2438a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/view/PriceDetailInformationDetailsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/view/PriceItemViewBinder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceDetailsVO;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "title$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "totalPrice", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getTotalPrice", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "totalPrice$delegate", "bind", "", "item", "initLayout", "addViews", "setupConstraints", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceDetailInformationDetailsView extends ConstraintLayout implements PriceItemViewBinder<TravelModalPriceDetailInformationV4VO.PriceDetailsVO> {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PriceDetailInformationDetailsView.class, SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(PriceDetailInformationDetailsView.class, "totalPrice", "getTotalPrice()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0)};
    public static final int $stable;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate title;

    /* renamed from: totalPrice$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate totalPrice;

    static {
        int i11 = PriceAtomView.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i12 | TextAtomV2View.$stable | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceDetailInformationDetailsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.title = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new PriceDetailInformationDetailsView$special$$inlined$preCreationViewPool$default$1(this), new PriceDetailInformationDetailsView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.totalPrice = new PreCreationViewPoolDelegate(context3, N.b(PriceAtomView.class), new PriceDetailInformationDetailsView$special$$inlined$preCreationViewPool$default$3(this), new PriceDetailInformationDetailsView$special$$inlined$preCreationViewPool$default$4());
        initLayout();
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(getTitle());
        addView(getTotalPrice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitle() {
        return (TextAtomV2View) this.title.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getTotalPrice() {
        return (PriceAtomView) this.totalPrice.getValue(this, $$delegatedProperties[1]);
    }

    private final void initLayout() {
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new PriceDetailInformationDetailsView$setupConstraints$1(this));
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view.PriceItemViewBinder
    public void bind(@NotNull TravelModalPriceDetailInformationV4VO.PriceDetailsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(getTitle(), item.getTitle(), null, 2, null);
        PriceAtomHolderKt.bindOrGone$default(getTotalPrice(), item.getTotalPrice(), null, 2, null);
    }
}
