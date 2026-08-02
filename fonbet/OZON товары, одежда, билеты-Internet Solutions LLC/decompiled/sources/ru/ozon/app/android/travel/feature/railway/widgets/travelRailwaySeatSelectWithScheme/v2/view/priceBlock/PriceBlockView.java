package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.priceBlock;

import Am.C2438a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.PriceBlockVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/priceBlock/PriceBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "descriptionTav", "getDescriptionTav", "descriptionTav$delegate", "priceTav", "getPriceTav", "priceTav$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/PriceBlockVO;", "addViews", "setupConstraint", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceBlockView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PriceBlockView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PriceBlockView.class, "descriptionTav", "getDescriptionTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(PriceBlockView.class, "priceTav", "getPriceTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0)};
    public static final int $stable;

    /* renamed from: descriptionTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate descriptionTav;
    private final int dp8;

    /* renamed from: priceTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceTav;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    static {
        int i11 = TextAtomView.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i11 | i12 | i11 | i12 | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = UiExtKt.toPx(8, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new PriceBlockView$special$$inlined$preCreationViewPool$default$1(this), new PriceBlockView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.descriptionTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new PriceBlockView$special$$inlined$preCreationViewPool$default$3(this), new PriceBlockView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.priceTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new PriceBlockView$special$$inlined$preCreationViewPool$default$5(this), new PriceBlockView$special$$inlined$preCreationViewPool$default$6());
        addViews();
        setupConstraint();
    }

    private final void addViews() {
        addView(getTitleTav());
        addView(getDescriptionTav());
        addView(getPriceTav());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getDescriptionTav() {
        return (TextAtomView) this.descriptionTav.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getPriceTav() {
        return (TextAtomView) this.priceTav.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getTitleTav() {
        return (TextAtomView) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupConstraint() {
        ConstraintLayoutExtKt.updateConstraints(this, new PriceBlockView$setupConstraint$1(this));
    }

    public final void bind(@NotNull PriceBlockVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bind$default(getTitleTav(), item.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(getDescriptionTav(), item.getDescription(), null, 2, null);
        TextAtomHolderKt.bind$default(getPriceTav(), item.getPrice(), null, 2, null);
    }
}
