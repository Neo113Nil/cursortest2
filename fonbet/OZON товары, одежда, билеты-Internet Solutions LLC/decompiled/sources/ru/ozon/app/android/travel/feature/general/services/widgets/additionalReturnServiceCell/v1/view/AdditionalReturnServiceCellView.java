package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view;

import AD.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation.AdditionalReturnServiceCellVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceCellView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "dp16", "dpf12", "", "dpf24", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "atomAction", "isCellClickable", "", "returnCellView", "Lru/ozon/uni/android/cell/CellView;", "infoCellView", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "onAction", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private AtomAction atomAction;
    private final int dp16;
    private final int dp2;
    private final int dp8;
    private final float dpf12;
    private final float dpf24;

    @NotNull
    private final CellView infoCellView;
    private boolean isCellClickable;

    @NotNull
    private final CellView returnCellView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReturnServiceCellView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        this.dpf12 = ResourceExtKt.toPxF(12, context);
        this.dpf24 = ResourceExtKt.toPxF(24, context);
        int i11 = 0;
        Set set = null;
        AttributeSet attributeSet = null;
        int i12 = 0;
        int i13 = 30;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CellView cellView = new CellView(context, attributeSet, i12, i11, set, i13, defaultConstructorMarker);
        cellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.returnCellView = cellView;
        CellView cellView2 = new CellView(context, attributeSet, i12, i11, set, i13, defaultConstructorMarker);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px3, px, px3, 0);
        cellView2.setLayoutParams(layoutParams);
        this.infoCellView = cellView2;
        setPadding(0, px2, 0, px3);
        setOrientation(1);
        addView(cellView);
        addView(cellView2);
        setOnClickListener(new b(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(AdditionalReturnServiceCellView additionalReturnServiceCellView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = additionalReturnServiceCellView.atomAction;
        if (atomAction == null || (function1 = additionalReturnServiceCellView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bind(@NotNull AdditionalReturnServiceCellVO.Content item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.actionHandler = onAction;
        this.isCellClickable = item.getIsCellClickable();
        if (!item.getIsCellClickable()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary), item.getIsNotShaded() ? this.dpf24 : this.dpf12));
            this.atomAction = item.getAction();
        }
        CellHolderKt.bind(this.returnCellView, item.getReturnCell(), this.actionHandler);
        CellHolderKt.bind(this.infoCellView, item.getInfoCell(), this.actionHandler);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.isCellClickable) {
            return super.onInterceptTouchEvent(ev);
        }
        return true;
    }
}
