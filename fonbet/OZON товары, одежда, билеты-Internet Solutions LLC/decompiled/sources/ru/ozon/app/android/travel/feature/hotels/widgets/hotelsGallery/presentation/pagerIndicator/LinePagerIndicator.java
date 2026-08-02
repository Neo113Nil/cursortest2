package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.pagerIndicator;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\b\"\u0010\u001bJ\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u00101\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010(R\u0014\u00102\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010(R$\u00104\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00168\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b4\u0010(\"\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/pagerIndicator/LinePagerIndicator;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "", "horizontalOffset", "", "drawSelectedItem", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V", "drawIndicatorTrack", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V", "calculateOffset", "()F", "", "isFirstPages", "()Z", "", "totalItems", "isLastPages", "(I)Z", "cleanup", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "attachToPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "itemWidth", "I", "itemHeight", "cornerRadius", "F", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2$g;", "pageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$g;", "Landroid/graphics/Paint;", "selectedColor", "unselectedColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, "selectedIndex", "setSelectedIndex", "(I)V", "getItemsCount", "()I", "itemsCount", "getActualItemCount", "actualItemCount", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinePagerIndicator extends View {
    private final float cornerRadius;
    private final int itemHeight;
    private final int itemWidth;
    private ViewPager2.g pageChangeCallback;

    @NotNull
    private final Paint paint;
    private final int selectedColor;
    private int selectedIndex;
    private final int unselectedColor;
    private ViewPager2 viewPager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinePagerIndicator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemWidth = ResourceExtKt.toPx(8, context);
        this.itemHeight = ResourceExtKt.toPx(4, context);
        this.cornerRadius = ResourceExtKt.toPxF(4, context);
        this.paint = h.a(true);
        this.selectedColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.unselectedColor = ThemeExtKt.themeColor(context, R$attr.layerActiveSurfaceInverted);
    }

    private final float calculateOffset() {
        float f7;
        int i11;
        int itemsCount = getItemsCount();
        if (itemsCount <= 5) {
            f7 = this.selectedIndex;
            i11 = this.itemWidth;
        } else {
            f7 = isFirstPages() ? this.selectedIndex : isLastPages(itemsCount) ? 5 - (itemsCount - this.selectedIndex) : 2;
            i11 = this.itemWidth;
        }
        return f7 * i11;
    }

    private final void cleanup() {
        ViewPager2.g gVar;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null && (gVar = this.pageChangeCallback) != null) {
            viewPager2.A(gVar);
        }
        this.viewPager = null;
        this.pageChangeCallback = null;
    }

    private final void drawIndicatorTrack(Canvas canvas, Paint paint) {
        paint.setColor(this.unselectedColor);
        float actualItemCount = getActualItemCount() * this.itemWidth;
        float f7 = this.itemHeight;
        float f11 = this.cornerRadius;
        canvas.drawRoundRect(0.0f, 0.0f, actualItemCount, f7, f11, f11, paint);
    }

    private final void drawSelectedItem(Canvas canvas, Paint paint, float horizontalOffset) {
        paint.setColor(this.selectedColor);
        float f7 = this.itemHeight;
        float f11 = this.cornerRadius;
        canvas.drawRoundRect(horizontalOffset, 0.0f, horizontalOffset + this.itemWidth, f7, f11, f11, paint);
    }

    private final int getActualItemCount() {
        return Math.min(getItemsCount(), 5);
    }

    private final int getItemsCount() {
        RecyclerView.g e11;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 == null || (e11 = viewPager2.e()) == null) {
            return 0;
        }
        return e11.getCardsCount();
    }

    private final boolean isFirstPages() {
        return this.selectedIndex <= 2;
    }

    private final boolean isLastPages(int totalItems) {
        return this.selectedIndex >= totalItems + (-3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedIndex(int i11) {
        this.selectedIndex = i11;
        invalidate();
    }

    public final void attachToPager(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        cleanup();
        this.viewPager = viewPager;
        ViewPager2.g gVar = new ViewPager2.g() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.pagerIndicator.LinePagerIndicator$attachToPager$1
            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                LinePagerIndicator.this.setSelectedIndex(position);
            }
        };
        viewPager.p(gVar);
        this.pageChangeCallback = gVar;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        cleanup();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getItemsCount() == 0) {
            return;
        }
        drawIndicatorTrack(canvas, this.paint);
        drawSelectedItem(canvas, this.paint, calculateOffset());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(this.itemWidth * getActualItemCount(), this.itemHeight);
    }
}
