package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TransferItem;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/view/TransferView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "timeTav", "transitionTav", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TransferItem;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransferView extends ConstraintLayout {

    @NotNull
    private final AppCompatImageView iconView;

    @NotNull
    private final TextAtomView timeTav;

    @NotNull
    private final TextAtomView titleTav;

    @NotNull
    private final TextAtomView transitionTav;

    public /* synthetic */ TransferView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull TransferItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatImageView appCompatImageView = this.iconView;
        ImageViewExtKt.load$default(appCompatImageView, item.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, item.getIcon().getTintColor()));
        TextAtomHolderKt.bind$default(this.titleTav, item.getTitle(), null, 2, null);
        TextAtomHolderKt.bind$default(this.timeTav, item.getTime(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(this.transitionTav, item.getStationTransition(), null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.travelTrainRouteTransferIconView);
        int px = ResourceExtKt.toPx(24, context);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(px, px));
        this.iconView = appCompatImageView;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        C2438a.e(textAtomView, R$id.travelTrainRouteTransferTitleTav, -2, -2);
        this.titleTav = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        C2438a.e(textAtomView2, R$id.travelTrainRouteTransferTimeTav, -2, -2);
        this.timeTav = textAtomView2;
        TextAtomView textAtomView3 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        C2438a.e(textAtomView3, R$id.travelTrainRouteTransferTransitionTav, -2, -2);
        this.transitionTav = textAtomView3;
        addView(appCompatImageView);
        addView(textAtomView);
        addView(textAtomView2);
        addView(textAtomView3);
        d dVar = new d();
        dVar.p(this);
        int px2 = ResourceExtKt.toPx(4, context);
        dVar.d0(appCompatImageView.getId(), 2);
        dVar.c0(0.0f, appCompatImageView.getId());
        ConstraintSetExtKt.topToTop$default(dVar, appCompatImageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, appCompatImageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart$default(dVar, appCompatImageView.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop(dVar, textAtomView.getId(), 0, ResourceExtKt.toPx(3, context));
        ConstraintSetExtKt.startToEnd(dVar, textAtomView.getId(), appCompatImageView.getId(), ResourceExtKt.toPx(8, context));
        ConstraintSetExtKt.endToStart$default(dVar, textAtomView.getId(), textAtomView2.getId(), 0, 4, null);
        dVar.C(textAtomView.getId(), true);
        dVar.c0(0.0f, textAtomView.getId());
        ConstraintSetExtKt.startToEnd(dVar, textAtomView2.getId(), textAtomView.getId(), px2);
        ConstraintSetExtKt.endToEnd$default(dVar, textAtomView2.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.baselineToBaseline$default(dVar, textAtomView2.getId(), textAtomView.getId(), 0, 4, null);
        dVar.C(textAtomView2.getId(), true);
        dVar.c0(0.0f, textAtomView2.getId());
        ConstraintSetExtKt.topToBottom(dVar, textAtomView3.getId(), textAtomView.getId(), px2);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomView3.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, textAtomView3.getId(), 0, 0, 4, null);
        dVar.C(textAtomView3.getId(), true);
        dVar.c0(0.0f, textAtomView3.getId());
        dVar.f(this);
    }
}
