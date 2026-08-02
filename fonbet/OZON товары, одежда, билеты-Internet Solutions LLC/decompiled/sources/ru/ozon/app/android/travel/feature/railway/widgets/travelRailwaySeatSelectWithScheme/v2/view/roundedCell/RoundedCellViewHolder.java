package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.roundedCell;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconHolderKt;
import ru.ozon.app.android.travel.feature.railway.R$drawable;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.adapter.TravelRailwaySeatSelectFooterListItemViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.RoundedCellHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/roundedCell/RoundedCellViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/adapter/TravelRailwaySeatSelectFooterListItemViewHolder;", "view", "Landroid/widget/FrameLayout;", "<init>", "(Landroid/widget/FrameLayout;)V", "cornersRadius", "", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoundedCellViewHolder extends TravelRailwaySeatSelectFooterListItemViewHolder {
    private final float cornersRadius;

    @NotNull
    private final FrameLayout view;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/roundedCell/RoundedCellViewHolder$Companion;", "", "<init>", "()V", "createView", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FrameLayout createView(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FrameLayout frameLayout = new FrameLayout(context);
            int px = ResourceExtKt.toPx(8, context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
            frameLayout.setPadding(px, 0, px, 0);
            CellWithSubtitle24IconView cellWithSubtitle24IconView = new CellWithSubtitle24IconView(context, null, 0, 6, null);
            cellWithSubtitle24IconView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout.addView(cellWithSubtitle24IconView);
            return frameLayout;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCellViewHolder(@NotNull FrameLayout view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cornersRadius = ResourceExtKt.toPxF(16, context);
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.adapter.TravelRailwaySeatSelectFooterListItemViewHolder
    public void bind(@NotNull TravelRailwaySeatSelectFooterVO.FooterItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (item instanceof RoundedCellHolder) {
            View first = ViewGroupExtKt.first(this.view);
            CellWithSubtitle24IconView cellWithSubtitle24IconView = first instanceof CellWithSubtitle24IconView ? (CellWithSubtitle24IconView) first : null;
            if (cellWithSubtitle24IconView != null) {
                CellWithSubtitle24IconHolderKt.bind(cellWithSubtitle24IconView, ((RoundedCellHolder) item).getCell(), actionHandler);
                cellWithSubtitle24IconView.setClipToOutline(true);
                cellWithSubtitle24IconView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.roundedCell.RoundedCellViewHolder$bind$1$1$1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        float f7;
                        if (view == null || outline == null) {
                            return;
                        }
                        int width = view.getWidth();
                        int height = view.getHeight();
                        f7 = RoundedCellViewHolder.this.cornersRadius;
                        outline.setRoundRect(0, 0, width, height, f7);
                    }
                });
                cellWithSubtitle24IconView.setBackgroundResource(R$drawable.bg_secondary_ripple);
            }
        }
    }
}
