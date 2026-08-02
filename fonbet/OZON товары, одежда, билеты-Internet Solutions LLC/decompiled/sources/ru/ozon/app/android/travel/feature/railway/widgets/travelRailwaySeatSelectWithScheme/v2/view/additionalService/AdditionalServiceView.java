package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.additionalService;

import Am.C2438a;
import Cy.b;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AdditionalServiceVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u001cJ\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/additionalService/AdditionalServiceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp24", "additionalServiceCheckboxButtonView", "Landroid/view/View;", "additionalServiceTitleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getAdditionalServiceTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "additionalServiceTitleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "additionalServiceDescriptionTav", "getAdditionalServiceDescriptionTav", "additionalServiceDescriptionTav$delegate", "additionalServicePriceTav", "getAdditionalServicePriceTav", "additionalServicePriceTav$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AdditionalServiceVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setupConstraints", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalServiceView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AdditionalServiceView.class, "additionalServiceTitleTav", "getAdditionalServiceTitleTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(AdditionalServiceView.class, "additionalServiceDescriptionTav", "getAdditionalServiceDescriptionTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(AdditionalServiceView.class, "additionalServicePriceTav", "getAdditionalServicePriceTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final View additionalServiceCheckboxButtonView;

    /* renamed from: additionalServiceDescriptionTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate additionalServiceDescriptionTav;

    /* renamed from: additionalServicePriceTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate additionalServicePriceTav;

    /* renamed from: additionalServiceTitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate additionalServiceTitleTav;
    private final int dp24;
    private final int dp8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServiceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = UiExtKt.toPx(8, context);
        int px = UiExtKt.toPx(24, context);
        this.dp24 = px;
        View view = new View(context);
        view.setId(R$id.travelRailwaySeatSelectSchemeAdditionalServiceCheckboxButtonView);
        view.setLayoutParams(new ConstraintLayout.b(px, px));
        view.setBackgroundResource(R$drawable.selector_checkbox);
        this.additionalServiceCheckboxButtonView = view;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.additionalServiceTitleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new AdditionalServiceView$special$$inlined$preCreationViewPool$default$1(this), new AdditionalServiceView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.additionalServiceDescriptionTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new AdditionalServiceView$special$$inlined$preCreationViewPool$default$3(this), new AdditionalServiceView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.additionalServicePriceTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new AdditionalServiceView$special$$inlined$preCreationViewPool$default$5(this), new AdditionalServiceView$special$$inlined$preCreationViewPool$default$6());
        addViews();
        setBackgroundResource(ru.ozon.app.android.travel.feature.railway.R$drawable.bg_secondary_ripple);
        setupConstraints();
    }

    private final void addViews() {
        addView(this.additionalServiceCheckboxButtonView);
        addView(getAdditionalServiceTitleTav());
        addView(getAdditionalServiceDescriptionTav());
        addView(getAdditionalServicePriceTav());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$6(Function1 function1, AdditionalServiceVO additionalServiceVO, View view) {
        function1.invoke(additionalServiceVO.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getAdditionalServiceDescriptionTav() {
        return (TextAtomView) this.additionalServiceDescriptionTav.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getAdditionalServicePriceTav() {
        return (TextAtomView) this.additionalServicePriceTav.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getAdditionalServiceTitleTav() {
        return (TextAtomView) this.additionalServiceTitleTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new AdditionalServiceView$setupConstraints$1(this));
    }

    public final void bind(@NotNull AdditionalServiceVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomHolderKt.bind$default(getAdditionalServiceTitleTav(), item.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(getAdditionalServiceDescriptionTav(), item.getDescription(), null, 2, null);
        TextAtomHolderKt.bind$default(getAdditionalServicePriceTav(), item.getPrice(), null, 2, null);
        this.additionalServiceCheckboxButtonView.setSelected(item.getIsSelected());
        if (item.getAction() == null) {
            this.additionalServiceCheckboxButtonView.setEnabled(false);
            setOnClickListener(null);
            setClickable(false);
        } else {
            setClickable(true);
            this.additionalServiceCheckboxButtonView.setEnabled(true);
            setOnClickListener(new b(5, actionHandler, item));
        }
    }
}
