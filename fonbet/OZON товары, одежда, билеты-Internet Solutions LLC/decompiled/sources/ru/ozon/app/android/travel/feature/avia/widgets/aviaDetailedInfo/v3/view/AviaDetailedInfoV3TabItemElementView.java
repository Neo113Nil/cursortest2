package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs.AviaDetailedInfoV3TabsVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3TabItemElementView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dpf12", "", "currentBackground", "Landroid/graphics/drawable/ShapeDrawable;", "currentActiveTabBackgroundColor", "", "Ljava/lang/Integer;", "textAtom", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bindTab", "", "tab", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO$TabModel;", "activeTabBackgroundColor", "updateTabState", "isSelected", "", "getBgColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3TabItemElementView extends FrameLayout {
    private Integer currentActiveTabBackgroundColor;

    @NotNull
    private final ShapeDrawable currentBackground;
    private final float dpf12;

    @NotNull
    private final TextAtomV2View textAtom;

    public /* synthetic */ AviaDetailedInfoV3TabItemElementView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    private final int getBgColor(boolean isSelected) {
        Integer num = isSelected ? this.currentActiveTabBackgroundColor : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void bindTab(@NotNull AviaDetailedInfoV3TabsVO.TabModel tab, int activeTabBackgroundColor) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        TextHolderKt.bind$default(this.textAtom, tab.getText(), null, 2, null);
        this.currentActiveTabBackgroundColor = Integer.valueOf(activeTabBackgroundColor);
        updateTabState(tab.getIsSelected());
    }

    public final void updateTabState(boolean isSelected) {
        this.currentBackground.getPaint().setColor(getBgColor(isSelected));
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3TabItemElementView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpf12 = pxF;
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), pxF);
        this.currentBackground = produce;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.textAtom = textAtomV2View;
        setBackground(produce);
        addView(textAtomV2View);
    }
}
