package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator;

import B90.b0;
import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020 H\u0014¢\u0006\u0004\b$\u0010%R.\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010&\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0010R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00100R$\u00102\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b2\u00100\"\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u000b¨\u00067"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/PdpGalleryPagerIndicator;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getItemsCountInternal", "()I", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper;", "viewPager", "", "onViewPagerSet", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "horizontalOffset", "drawSelectedItem", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V", "drawUnselectedItem", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper;", "getViewPager", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper;", "setViewPager", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$OnPageChangeListener;", "pagerListener", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$OnPageChangeListener;", "Landroid/graphics/Paint;", "selectedColor", "I", "unselectedColor", "selectedIndex", "setSelectedIndex", "(I)V", "getItemsCount", "itemsCount", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpGalleryPagerIndicator extends View {

    @NotNull
    private final ViewPagerWrapper.OnPageChangeListener pagerListener;

    @NotNull
    private final Paint paint;
    private final int selectedColor;
    private int selectedIndex;
    private final int unselectedColor;
    private ViewPagerWrapper viewPager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdpGalleryPagerIndicator(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawSelectedItem(Canvas canvas, Paint paint, float horizontalOffset) {
        int i11;
        int i12;
        int i13;
        int i14;
        paint.setColor(this.selectedColor);
        i11 = PdpGalleryPagerIndicatorKt.ITEM_WIDTH_SELECTED_PX;
        float f7 = horizontalOffset + i11;
        i12 = PdpGalleryPagerIndicatorKt.ITEM_HEIGHT_PX;
        float f11 = i12 + 1.0f;
        i13 = PdpGalleryPagerIndicatorKt.SELECTED_ITEM_CORNER_RADIUS;
        float f12 = i13;
        i14 = PdpGalleryPagerIndicatorKt.SELECTED_ITEM_CORNER_RADIUS;
        canvas.drawRoundRect(horizontalOffset, 1.0f, f7, f11, f12, i14, paint);
    }

    private final void drawUnselectedItem(Canvas canvas, Paint paint, float horizontalOffset) {
        int i11;
        int i12;
        int i13;
        paint.setColor(this.unselectedColor);
        i11 = PdpGalleryPagerIndicatorKt.ITEM_WIDTH_UNSELECTED_PX;
        float f7 = horizontalOffset + (i11 / 2);
        i12 = PdpGalleryPagerIndicatorKt.ITEM_HEIGHT_PX;
        i13 = PdpGalleryPagerIndicatorKt.ITEM_HEIGHT_PX;
        canvas.drawCircle(f7, (i12 / 2.0f) + 1.0f, i13 / 2.0f, paint);
    }

    private final int getItemsCount() {
        return getItemsCountInternal();
    }

    private final int getItemsCountInternal() {
        if (isInEditMode()) {
            return 5;
        }
        ViewPagerWrapper viewPagerWrapper = this.viewPager;
        if (viewPagerWrapper != null) {
            return viewPagerWrapper.getItemCount();
        }
        return 0;
    }

    private final void onViewPagerSet(ViewPagerWrapper viewPager) {
        viewPager.unregisterOnPageChangeListener();
        viewPager.registerOnPageChangeListener(this.pagerListener);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pagerListener$lambda$1(PdpGalleryPagerIndicator pdpGalleryPagerIndicator, int i11) {
        pdpGalleryPagerIndicator.setContentDescription("pagerIndicator_" + (i11 + 1));
        pdpGalleryPagerIndicator.setSelectedIndex(i11);
    }

    private final void setSelectedIndex(int i11) {
        this.selectedIndex = i11;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int itemsCount = getItemsCount();
        float f7 = 1.0f;
        for (int i13 = 0; i13 < itemsCount; i13++) {
            if (i13 == this.selectedIndex) {
                drawSelectedItem(canvas, this.paint, f7);
                i11 = PdpGalleryPagerIndicatorKt.ITEM_WIDTH_SELECTED_PX;
                i12 = PdpGalleryPagerIndicatorKt.ITEMS_SPACING;
            } else {
                drawUnselectedItem(canvas, this.paint, f7);
                i11 = PdpGalleryPagerIndicatorKt.ITEM_WIDTH_UNSELECTED_PX;
                i12 = PdpGalleryPagerIndicatorKt.ITEMS_SPACING;
            }
            f7 += i12 + i11;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int itemsCount = getItemsCount();
        i11 = PdpGalleryPagerIndicatorKt.ITEM_WIDTH_UNSELECTED_PX;
        i12 = PdpGalleryPagerIndicatorKt.ITEMS_SPACING;
        int i16 = ((itemsCount - 1) * i12) + (i11 * itemsCount);
        i13 = PdpGalleryPagerIndicatorKt.ITEM_WIDTH_SELECTED_PX;
        int i17 = i13 + i16;
        i14 = PdpGalleryPagerIndicatorKt.ITEM_WIDTH_UNSELECTED_PX;
        i15 = PdpGalleryPagerIndicatorKt.ITEM_HEIGHT_PX;
        setMeasuredDimension((int) ((i17 - i14) + 2.0f), (int) (i15 + 2.0f));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setSelectedIndex(savedState.getSelectedIndex());
    }

    @Override // android.view.View
    @NotNull
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.selectedIndex);
    }

    public final void setViewPager(ViewPagerWrapper viewPagerWrapper) {
        ViewPagerWrapper viewPagerWrapper2 = this.viewPager;
        if (viewPagerWrapper2 != null) {
            viewPagerWrapper2.unregisterOnPageChangeListener();
        }
        this.viewPager = viewPagerWrapper;
        if (viewPagerWrapper != null) {
            onViewPagerSet(viewPagerWrapper);
        }
    }

    public /* synthetic */ PdpGalleryPagerIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpGalleryPagerIndicator(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pagerListener = new b0(this, 6);
        this.paint = h.a(true);
        this.selectedColor = ThemeExtKt.themeColor(context, R$attr.textPrimary);
        this.unselectedColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutralOnLight);
    }
}
