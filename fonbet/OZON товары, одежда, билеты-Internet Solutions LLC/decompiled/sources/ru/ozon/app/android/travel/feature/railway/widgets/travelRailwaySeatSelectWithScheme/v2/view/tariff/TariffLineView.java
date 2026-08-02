package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tariff;

import Am.C2438a;
import Bk0.a;
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
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TariffVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150\u0019J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tariff/TariffLineView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp24", "tariffLineRadioButtonView", "Landroid/view/View;", "tariffLineTitleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTariffLineTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "tariffLineTitleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "tariffLinePriceTav", "getTariffLinePriceTav", "tariffLinePriceTav$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TariffVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setupConstraints", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffLineView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TariffLineView.class, "tariffLineTitleTav", "getTariffLineTitleTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TariffLineView.class, "tariffLinePriceTav", "getTariffLinePriceTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0)};
    public static final int $stable = 8;
    private final int dp24;
    private final int dp8;

    /* renamed from: tariffLinePriceTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate tariffLinePriceTav;

    @NotNull
    private final View tariffLineRadioButtonView;

    /* renamed from: tariffLineTitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate tariffLineTitleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffLineView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = UiExtKt.toPx(8, context);
        int px = UiExtKt.toPx(24, context);
        this.dp24 = px;
        View view = new View(context);
        view.setId(R$id.tariffLineRadioButtonView);
        view.setLayoutParams(new ConstraintLayout.b(px, px));
        view.setBackgroundResource(R$drawable.selector_radio);
        this.tariffLineRadioButtonView = view;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.tariffLineTitleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new TariffLineView$special$$inlined$preCreationViewPool$default$1(this), new TariffLineView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.tariffLinePriceTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new TariffLineView$special$$inlined$preCreationViewPool$default$3(this), new TariffLineView$special$$inlined$preCreationViewPool$default$4());
        addViews();
        setupConstraints();
        setBackgroundResource(ru.ozon.app.android.travel.feature.railway.R$drawable.bg_secondary_ripple);
    }

    private final void addViews() {
        addView(this.tariffLineRadioButtonView);
        addView(getTariffLineTitleTav());
        addView(getTariffLinePriceTav());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(Function1 function1, TariffVO tariffVO, View view) {
        function1.invoke(tariffVO.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getTariffLinePriceTav() {
        return (TextAtomView) this.tariffLinePriceTav.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getTariffLineTitleTav() {
        return (TextAtomView) this.tariffLineTitleTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new TariffLineView$setupConstraints$1(this));
    }

    public final void bind(@NotNull TariffVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomHolderKt.bind$default(getTariffLineTitleTav(), item.getTitle(), null, 2, null);
        TextAtomHolderKt.bind$default(getTariffLinePriceTav(), item.getPrice(), null, 2, null);
        this.tariffLineRadioButtonView.setSelected(item.getIsSelected());
        setOnClickListener(new a(5, actionHandler, item));
    }
}
