package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs.AviaDetailedInfoV3TabsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view.AviaDetailedInfoV3TabsView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0019J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3TabsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp2", "dpf12", "", "currentBackground", "Landroid/graphics/drawable/ShapeDrawable;", "bindTabs", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO$TabModel;", "tabBackgroundColor", "", "activeTabBackgroundColor", "onItemClick", "Lkotlin/Function1;", "updateSelectedTabs", "selectedTabInd", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3TabsView extends LinearLayout {

    @NotNull
    private final ShapeDrawable currentBackground;
    private final int dp2;
    private final float dpf12;

    public /* synthetic */ AviaDetailedInfoV3TabsView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTabs$lambda$2$lambda$1(Function1 function1, int i11, View view) {
        function1.invoke(Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindTabs(@NotNull List<AviaDetailedInfoV3TabsVO.TabModel> tabs, String tabBackgroundColor, String activeTabBackgroundColor, @NotNull final Function1<? super Integer, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        removeAllViews();
        Paint paint = this.currentBackground.getPaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(styleParser.parseColor(context, tabBackgroundColor, UniColors.BG_SECONDARY.getResId()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor = styleParser.parseColor(context2, activeTabBackgroundColor, UniColors.LAYER_FLOOR_1.getResId());
        final int i11 = 0;
        for (Object obj : tabs) {
            int i12 = i11 + 1;
            AttributeSet attributeSet = null;
            Object[] objArr = 0;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            AviaDetailedInfoV3TabItemElementView aviaDetailedInfoV3TabItemElementView = new AviaDetailedInfoV3TabItemElementView(context3, attributeSet, 2, objArr == true ? 1 : 0);
            aviaDetailedInfoV3TabItemElementView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            aviaDetailedInfoV3TabItemElementView.bindTab((AviaDetailedInfoV3TabsVO.TabModel) obj, parseColor);
            aviaDetailedInfoV3TabItemElementView.setOnClickListener(new View.OnClickListener() { // from class: yM.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AviaDetailedInfoV3TabsView.bindTabs$lambda$2$lambda$1(Function1.this, i11, view);
                }
            });
            addView(aviaDetailedInfoV3TabItemElementView);
            i11 = i12;
        }
    }

    public final void updateSelectedTabs(int selectedTabInd) {
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            AviaDetailedInfoV3TabItemElementView aviaDetailedInfoV3TabItemElementView = childAt instanceof AviaDetailedInfoV3TabItemElementView ? (AviaDetailedInfoV3TabItemElementView) childAt : null;
            if (aviaDetailedInfoV3TabItemElementView != null) {
                aviaDetailedInfoV3TabItemElementView.updateTabState(i11 == selectedTabInd);
            }
            i11++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3TabsView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(2, context);
        this.dp2 = px;
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpf12 = pxF;
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), pxF);
        this.currentBackground = produce;
        setGravity(16);
        setOrientation(0);
        setBackground(produce);
        setPadding(px, px, px, px);
    }
}
