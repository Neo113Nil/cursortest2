package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.adapter;

import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/adapter/TravelModalPriceDetailInformationV4Decoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "", "dividerHeight", "I", "smallOffset", "bigOffset", "Landroid/graphics/Paint;", "dividerPaint", "Landroid/graphics/Paint;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelModalPriceDetailInformationV4Decoration extends RecyclerView.n {
    private final int bigOffset;

    @NotNull
    private final Context context;
    private final int dividerHeight;

    @NotNull
    private final Paint dividerPaint;
    private final int smallOffset;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TravelModalPriceDetailInformationV4VO.PriceSpacer.Size.values().length];
            try {
                iArr[TravelModalPriceDetailInformationV4VO.PriceSpacer.Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TravelModalPriceDetailInformationV4VO.PriceSpacer.Size.BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TravelModalPriceDetailInformationV4VO.PriceSpacer.Size.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TravelModalPriceDetailInformationV4Decoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dividerHeight = ResourceExtKt.toPx(1, context);
        this.smallOffset = ResourceExtKt.toPx(8, context);
        this.bigOffset = ResourceExtKt.toPx(16, context);
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.dividerPaint = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int i11;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.g adapter = parent.getAdapter();
        TravelModalPriceDetailInformationV4Adapter travelModalPriceDetailInformationV4Adapter = adapter instanceof TravelModalPriceDetailInformationV4Adapter ? (TravelModalPriceDetailInformationV4Adapter) adapter : null;
        if (travelModalPriceDetailInformationV4Adapter == null) {
            return;
        }
        List<TravelModalPriceDetailInformationV4VO.PriceItem> currentList = travelModalPriceDetailInformationV4Adapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        if (childAdapterPosition == C7714v.P(currentList)) {
            return;
        }
        List<TravelModalPriceDetailInformationV4VO.PriceItem> currentList2 = travelModalPriceDetailInformationV4Adapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
        TravelModalPriceDetailInformationV4VO.PriceItem priceItem = (TravelModalPriceDetailInformationV4VO.PriceItem) C7714v.Q(childAdapterPosition, currentList2);
        if (priceItem == null) {
            return;
        }
        if (priceItem instanceof TravelModalPriceDetailInformationV4VO.PriceDetailsVO) {
            outRect.bottom = this.bigOffset;
            return;
        }
        if (priceItem instanceof TravelModalPriceDetailInformationV4VO.PriceItemVO) {
            outRect.bottom = this.smallOffset;
            return;
        }
        if (priceItem instanceof TravelModalPriceDetailInformationV4VO.PriceSpacer) {
            TravelModalPriceDetailInformationV4VO.PriceSpacer priceSpacer = (TravelModalPriceDetailInformationV4VO.PriceSpacer) priceItem;
            int i12 = WhenMappings.$EnumSwitchMapping$0[priceSpacer.getSize().ordinal()];
            if (i12 == 1) {
                i11 = this.smallOffset;
            } else if (i12 == 2) {
                i11 = this.bigOffset;
            } else {
                if (i12 != 3) {
                    throw new o();
                }
                i11 = 0;
            }
            outRect.top = i11;
            if (priceSpacer.getHasDivider()) {
                outRect.bottom = this.bigOffset;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        RecyclerView.g adapter = parent.getAdapter();
        TravelModalPriceDetailInformationV4Adapter travelModalPriceDetailInformationV4Adapter = adapter instanceof TravelModalPriceDetailInformationV4Adapter ? (TravelModalPriceDetailInformationV4Adapter) adapter : null;
        if (travelModalPriceDetailInformationV4Adapter == null) {
            return;
        }
        int childCount = parent.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = parent.getChildAt(i11);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            List<TravelModalPriceDetailInformationV4VO.PriceItem> currentList = travelModalPriceDetailInformationV4Adapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            TravelModalPriceDetailInformationV4VO.PriceItem priceItem = (TravelModalPriceDetailInformationV4VO.PriceItem) C7714v.Q(childAdapterPosition, currentList);
            if (priceItem != null && (priceItem instanceof TravelModalPriceDetailInformationV4VO.PriceSpacer) && ((TravelModalPriceDetailInformationV4VO.PriceSpacer) priceItem).getHasDivider()) {
                float paddingLeft = parent.getPaddingLeft();
                float width = parent.getWidth() - parent.getPaddingRight();
                float bottom = childAt.getBottom();
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, width, bottom + this.dividerHeight, this.dividerPaint);
            } else {
                canvas2 = canvas;
            }
            i11++;
            canvas = canvas2;
        }
    }
}
