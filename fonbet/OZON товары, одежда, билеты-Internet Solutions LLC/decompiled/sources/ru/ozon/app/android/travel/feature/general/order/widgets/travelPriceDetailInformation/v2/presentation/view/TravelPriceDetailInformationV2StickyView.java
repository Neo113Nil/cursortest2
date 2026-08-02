package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.sticky.PriceDetailInformationV2StickyVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001aJ\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2StickyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitle", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "title$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "price", "getPrice", "price$delegate", "button", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getButton", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "button$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/sticky/PriceDetailInformationV2StickyVO;", "setClickListener", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setConstraints", "Companion", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2StickyView extends ConstraintLayout {
    public static final int $stable;

    /* renamed from: button$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate button;

    /* renamed from: price$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate price;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate title;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelPriceDetailInformationV2StickyView.class, SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2StickyView.class, "price", "getPrice()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelPriceDetailInformationV2StickyView.class, "button", "getButton()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", 0)};

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/view/TravelPriceDetailInformationV2StickyView$Companion;", "", "<init>", "()V", "BUTTON_WIDTH", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int i11 = SingleAtom.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        int i13 = TextAtomView.$stable;
        $stable = i11 | i12 | i13 | i12 | i13 | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2StickyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.title = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new TravelPriceDetailInformationV2StickyView$special$$inlined$preCreationViewPool$default$1(this), new TravelPriceDetailInformationV2StickyView$special$$inlined$preCreationViewPool$default$2(context));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.price = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new TravelPriceDetailInformationV2StickyView$special$$inlined$preCreationViewPool$default$3(this), new TravelPriceDetailInformationV2StickyView$special$$inlined$preCreationViewPool$default$4(context));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.button = new PreCreationViewPoolDelegate(context4, N.b(SingleAtom.class), new TravelPriceDetailInformationV2StickyView$special$$inlined$preCreationViewPool$default$5(this), new TravelPriceDetailInformationV2StickyView$special$$inlined$preCreationViewPool$default$6(context));
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(getPrice());
        addView(getTitle());
        addView(getButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleAtom getButton() {
        return (SingleAtom) this.button.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getPrice() {
        return (TextAtomView) this.price.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getTitle() {
        return (TextAtomView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new TravelPriceDetailInformationV2StickyView$setConstraints$1(this));
    }

    public final void bind(@NotNull PriceDetailInformationV2StickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bind$default(getTitle(), item.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(getPrice(), item.getSubtitle(), null, 2, null);
        SingleAtom.bind$default(getButton(), item.getButton(), false, 2, null);
    }

    public final void setClickListener(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getButton().setOnAction(actionHandler);
    }
}
