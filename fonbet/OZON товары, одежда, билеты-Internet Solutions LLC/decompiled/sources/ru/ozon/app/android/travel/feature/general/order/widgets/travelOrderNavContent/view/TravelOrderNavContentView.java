package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.view;

import AW.a;
import Bi.b;
import Kk.C3531a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.presentation.TravelOrderNavContentVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/view/TravelOrderNavContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp16", "dp20", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "chevronIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "subtitleTav", "clickableArea", "Landroidx/constraintlayout/helper/widget/Layer;", "travelOrderNavContentDateTimeInfoView", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/view/TravelOrderNavContentDateTimeInfoView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderNavContentView extends ConstraintLayout {

    @NotNull
    private final IconView chevronIconView;

    @NotNull
    private final Layer clickableArea;
    private final int dp16;
    private final int dp20;
    private final int dp4;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private final TravelOrderNavContentDateTimeInfoView travelOrderNavContentDateTimeInfoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelOrderNavContentView(@NotNull Context context) {
        super(context);
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(20, context);
        this.dp20 = px3;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 3411, -2, -2);
        d11.f41656t = 0;
        d11.f41636i = 0;
        d11.f41657u = 3412;
        d11.f41598E = 0.0f;
        d11.f41616W = true;
        d11.f41603J = 2;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTav = textAtomV2View;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            i11 = 3412;
            iconView = new IconView(context, null, 0, 6, null);
        } else {
            i11 = 3412;
        }
        ConstraintLayout.b a11 = C3531a.a(iconView, i11, -2, -2);
        a11.f41655s = 3411;
        a11.f41658v = 0;
        a11.f41636i = 3411;
        a11.f41642l = 3411;
        a11.setMarginStart(px);
        iconView.setLayoutParams(a11);
        this.chevronIconView = iconView;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, 3413, 0, -2);
        d12.f41638j = 3411;
        d12.f41656t = 0;
        d12.f41658v = 0;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleTav = textAtomV2View2;
        Layer layer = new Layer(context);
        layer.setId(3414);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        layer.setReferencedIds(new int[]{3411, i11, 3413});
        layer.setLayoutParams(bVar);
        this.clickableArea = layer;
        TravelOrderNavContentDateTimeInfoView travelOrderNavContentDateTimeInfoView = new TravelOrderNavContentDateTimeInfoView(context);
        travelOrderNavContentDateTimeInfoView.setId(3415);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41638j = 3413;
        bVar2.setMargins(0, px2, 0, 0);
        travelOrderNavContentDateTimeInfoView.setLayoutParams(bVar2);
        this.travelOrderNavContentDateTimeInfoView = travelOrderNavContentDateTimeInfoView;
        setPadding(px2, px3, px2, px2);
        addView(layer);
        addView(textAtomV2View);
        addView(iconView);
        addView(textAtomV2View2);
        addView(travelOrderNavContentDateTimeInfoView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$11(TravelOrderNavContentVO travelOrderNavContentVO, Function1 function1, View view) {
        AtomAction action = travelOrderNavContentVO.getAction();
        if (action == null || function1 == null) {
            return;
        }
        function1.invoke(action);
    }

    public final void bind(@NotNull TravelOrderNavContentVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.clickableArea.setOnClickListener(new a(item, onAction));
        TextHolderKt.bind$default(this.titleTav, item.getTitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.chevronIconView, item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleTav, item.getSubtitle(), null, 2, null);
        this.travelOrderNavContentDateTimeInfoView.bindOrGone(item.getDateTimeInfo());
    }
}
