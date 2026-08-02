package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.view;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.presentation.TravelOrderNavContentVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/view/TravelOrderNavContentDateTimeItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp10", "aspectView", "Lru/ozon/uni/android/atom/aspect/AspectView;", "contentLayout", "Landroid/widget/LinearLayout;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderNavContentDateTimeItemView extends FrameLayout {

    @NotNull
    private final AspectView aspectView;

    @NotNull
    private final LinearLayout contentLayout;
    private final int dp10;
    private final int dp4;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAtomV2View titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelOrderNavContentDateTimeItemView(@NotNull Context context) {
        super(context);
        Context context2;
        AspectView aspectView;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(10, context);
        this.dp10 = px2;
        q qVar = q.f64554a;
        AspectView aspectView2 = (AspectView) qVar.i(N.b(AspectView.class), context);
        if (aspectView2 == null) {
            context2 = context;
            aspectView = new AspectView(context2, null, 0, 6, null);
        } else {
            context2 = context;
            aspectView = aspectView2;
        }
        aspectView.setId(3700);
        aspectView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.aspectView = aspectView;
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setId(3701);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(px2, px, px2, px);
        this.contentLayout = linearLayout;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        textAtomV2View.setId(3702);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        textAtomV2View.setTextIsSelectable(false);
        layoutParams2.gravity = 17;
        textAtomV2View.setLayoutParams(layoutParams2);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        textAtomV2View2.setId(3703);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        textAtomV2View2.setTextIsSelectable(false);
        layoutParams3.gravity = 17;
        textAtomV2View2.setLayoutParams(layoutParams3);
        this.subtitleTav = textAtomV2View2;
        addView(aspectView);
        aspectView.addView(linearLayout);
        linearLayout.addView(textAtomV2View);
        linearLayout.addView(textAtomV2View2);
    }

    public final void bind(@NotNull TravelOrderNavContentVO.DateTimeItemVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectHolderKt.bind(this.aspectView, item.getAspect(), onAction);
        TextHolderKt.bind$default(this.titleTav, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleTav, item.getSubtitle(), null, 2, null);
    }
}
