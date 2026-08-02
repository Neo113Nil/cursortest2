package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view;

import Am.C2438a;
import DQ.b;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\"\u0010\u001e\u001a\u00020\u00182\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016j\u0004\u0018\u0001`\u0019J\n\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016j\u0004\u0018\u0001`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsBenefitView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "iconI", "Lru/ozon/uni/android/atom/icon/IconView;", "getIconI", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconI$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "rightIconI", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "action", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$SimpleCellVO;", "setActionHandler", "getOrCreateRightIcon", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsBenefitView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AviaCheckTariffsBenefitView.class, "iconI", "getIconI()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(AviaCheckTariffsBenefitView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private AtomAction action;
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp4;
    private final int dp8;

    /* renamed from: iconI$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconI;
    private IconView rightIconI;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsBenefitView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        this.dp8 = ResourceExtKt.toPx(8, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconI = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new AviaCheckTariffsBenefitView$special$$inlined$preCreationViewPool$default$1(this), new AviaCheckTariffsBenefitView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new AviaCheckTariffsBenefitView$special$$inlined$preCreationViewPool$default$3(this), new AviaCheckTariffsBenefitView$special$$inlined$preCreationViewPool$default$4());
        setOrientation(0);
        setGravity(16);
        setPadding(0, px, 0, px);
        addView(getIconI());
        addView(getTitleTAV());
    }

    private final IconView getIconI() {
        return (IconView) this.iconI.getValue(this, $$delegatedProperties[0]);
    }

    private final IconView getOrCreateRightIcon() {
        if (this.rightIconI == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            IconView iconView = new IconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(this.dp8);
            layoutParams.gravity = 48;
            iconView.setLayoutParams(layoutParams);
            addView(iconView);
            iconView.setOnClickListener(new b(this, 10));
            this.rightIconI = iconView;
        }
        return this.rightIconI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateRightIcon$lambda$6$lambda$5(AviaCheckTariffsBenefitView aviaCheckTariffsBenefitView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = aviaCheckTariffsBenefitView.action;
        if (atomAction == null || (function1 = aviaCheckTariffsBenefitView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull AviaCheckTariffsVO.TariffItem.SimpleCellVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bindOrGone$default(getIconI(), item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(getTitleTAV(), item.getText(), null, 2, null);
        getTitleTAV().setMovementMethod(null);
        this.action = item.getAction();
        if (item.getRightIcon() == null) {
            IconView iconView = this.rightIconI;
            if (iconView != null) {
                ViewExtKt.gone(iconView);
                return;
            }
            return;
        }
        IconView orCreateRightIcon = getOrCreateRightIcon();
        if (orCreateRightIcon != null) {
            IconHolderKt.bindOrGone$default(orCreateRightIcon, item.getRightIcon(), null, 2, null);
        }
        IconView iconView2 = this.rightIconI;
        if (iconView2 != null) {
            iconView2.setClickable(this.action != null);
        }
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> actionHandler) {
        this.actionHandler = actionHandler;
    }
}
