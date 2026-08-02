package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/view/TravelTrainRouteWidgetView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp3", "dp8", "dp16", "dp24", "detailsTopSeparatorView", "Landroid/view/View;", "detailsBottomSeparatorView", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "badgesRv", "Landroidx/recyclerview/widget/RecyclerView;", "getBadgesRv", "()Landroidx/recyclerview/widget/RecyclerView;", "dateTav", "getDateTav", "trainListRv", "getTrainListRv", "trainRouteRv", "getTrainRouteRv", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteWidgetView extends LinearLayout {

    @NotNull
    private final RecyclerView badgesRv;

    @NotNull
    private final TextAtomView dateTav;

    @NotNull
    private final View detailsBottomSeparatorView;

    @NotNull
    private final View detailsTopSeparatorView;
    private final int dp16;
    private final int dp24;
    private final int dp3;
    private final int dp8;

    @NotNull
    private final TextAtomView titleTav;

    @NotNull
    private final RecyclerView trainListRv;

    @NotNull
    private final RecyclerView trainRouteRv;

    public /* synthetic */ TravelTrainRouteWidgetView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final RecyclerView getBadgesRv() {
        return this.badgesRv;
    }

    @NotNull
    public final TextAtomView getDateTav() {
        return this.dateTav;
    }

    @NotNull
    public final TextAtomView getTitleTav() {
        return this.titleTav;
    }

    @NotNull
    public final RecyclerView getTrainListRv() {
        return this.trainListRv;
    }

    @NotNull
    public final RecyclerView getTrainRouteRv() {
        return this.trainRouteRv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTrainRouteWidgetView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(3, context);
        this.dp3 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        int px4 = ResourceExtKt.toPx(24, context);
        this.dp24 = px4;
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, px);
        layoutParams.topMargin = px4;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.detailsTopSeparatorView = view;
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, px);
        layoutParams2.topMargin = px3;
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.detailsBottomSeparatorView = view2;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = px3;
        layoutParams3.rightMargin = px3;
        textAtomView.setLayoutParams(layoutParams3);
        this.titleTav = textAtomView;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = px3;
        layoutParams4.topMargin = px3;
        layoutParams4.rightMargin = px3;
        recyclerView.setLayoutParams(layoutParams4);
        recyclerView.setNestedScrollingEnabled(false);
        this.badgesRv = recyclerView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.leftMargin = px3;
        layoutParams5.rightMargin = px3;
        textAtomView2.setLayoutParams(layoutParams5);
        this.dateTav = textAtomView2;
        RecyclerView recyclerView2 = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.leftMargin = px3;
        layoutParams6.topMargin = px2;
        layoutParams6.rightMargin = px3;
        recyclerView2.setLayoutParams(layoutParams6);
        recyclerView2.setNestedScrollingEnabled(false);
        this.trainListRv = recyclerView2;
        RecyclerView recyclerView3 = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.leftMargin = px3;
        layoutParams7.topMargin = px4;
        layoutParams7.rightMargin = px3;
        layoutParams7.bottomMargin = px4;
        recyclerView3.setLayoutParams(layoutParams7);
        recyclerView3.setNestedScrollingEnabled(false);
        this.trainRouteRv = recyclerView3;
        setOrientation(1);
        addView(textAtomView);
        addView(view);
        addView(recyclerView);
        addView(textAtomView2);
        addView(recyclerView2);
        addView(view2);
        addView(recyclerView3);
    }
}
