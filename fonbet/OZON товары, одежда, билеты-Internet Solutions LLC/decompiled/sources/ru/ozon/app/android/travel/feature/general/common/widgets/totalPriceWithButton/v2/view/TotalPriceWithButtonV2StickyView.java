package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.view;

import B90.C2618u;
import Bi.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky.TotalPriceWithButtonV2StickyVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.TextDTOExtensionsKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018j\u0002`\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018j\u0002`\u001aJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0014J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2StickyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp4", "dp8", "dp32", "dpF20", "", "timerView", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2TimerView;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "agreementView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/sticky/TotalPriceWithButtonV2StickyVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "updateTimerText", "newText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "hideTimer", "createTimerView", "createButtonView", "createAgreementView", "addChildren", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2StickyView extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View agreementView;

    @NotNull
    private final ButtonV3View buttonView;
    private final int dp1;
    private final int dp32;
    private final int dp4;
    private final int dp8;
    private final float dpF20;

    @NotNull
    private final TotalPriceWithButtonV2TimerView timerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceWithButtonV2StickyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dpF20 = pxF;
        this.timerView = createTimerView();
        this.buttonView = createButtonView();
        this.agreementView = createAgreementView();
        addChildren();
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), context.getColor(UniColors.GRAPHIC_STROKE_STICKY.getResId()), px, pxF, pxF, 0.0f, 0.0f));
        setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
    }

    private final void addChildren() {
        addView(this.timerView);
        addView(this.buttonView);
        addView(this.agreementView);
    }

    private final TextAtomV2View createAgreementView() {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 82, 0, -2);
        d11.f41656t = 0;
        d11.f41638j = 73;
        d11.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = this.dp4;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    private final ButtonV3View createButtonView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, 73, 0, -2);
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41638j = 27;
        ((ViewGroup.MarginLayoutParams) e11).topMargin = this.dp8;
        buttonV3View.setLayoutParams(e11);
        return buttonV3View;
    }

    private final TotalPriceWithButtonV2TimerView createTimerView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TotalPriceWithButtonV2TimerView totalPriceWithButtonV2TimerView = new TotalPriceWithButtonV2TimerView(context);
        totalPriceWithButtonV2TimerView.setId(27);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, this.dp32);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41640k = 73;
        int i11 = this.dp8;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        totalPriceWithButtonV2TimerView.setLayoutParams(bVar);
        return totalPriceWithButtonV2TimerView;
    }

    public final void bind(@NotNull TotalPriceWithButtonV2StickyVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AtomAction, Unit> processedActionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(processedActionHandler, "processedActionHandler");
        this.timerView.bindOrGone(item.getTimer());
        ButtonV3HolderKt.bind(this.buttonView, item.getNextStickyButton(), processedActionHandler);
        TextAtomV2View textAtomV2View = this.agreementView;
        TextDTO agreement = item.getAgreement();
        TextHolderKt.bindOrGone(textAtomV2View, agreement != null ? TextDTOExtensionsKt.withNavigationLinksHandling(agreement, this.agreementView, actionHandler) : null, actionHandler);
    }

    public final void hideTimer() {
        ViewExtKt.gone(this.timerView);
    }

    public final void updateTimerText(@NotNull TextDTO newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        this.timerView.updateTimerText(newText);
    }
}
