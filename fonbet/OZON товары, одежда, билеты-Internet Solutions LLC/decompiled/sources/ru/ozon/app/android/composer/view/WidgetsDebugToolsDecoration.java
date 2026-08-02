package ru.ozon.app.android.composer.view;

import Hh.C3140a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00011B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/composer/view/WidgetsDebugToolsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Lru/ozon/app/android/composer/view/WidgetsDebugToolsDecoration$Config;", "config", "Lm10/d;", "Lru/ozon/app/android/composer/view/ComposerAdapter;", "adapter", "LHh/a;", "fpsTracker", "<init>", "(Lru/ozon/app/android/composer/view/WidgetsDebugToolsDecoration$Config;Lm10/d;LHh/a;)V", "Landroid/graphics/Canvas;", "c", "", "text", "Landroid/graphics/Rect;", "bounds", "", "textPadding", "", "drawText", "(Landroid/graphics/Canvas;Ljava/lang/String;Landroid/graphics/Rect;F)I", "Landroid/text/StaticLayout;", "getStaticLayout", "(Ljava/lang/String;Landroid/graphics/Rect;I)Landroid/text/StaticLayout;", "rect", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "shrinkBounds", "(Landroid/graphics/Rect;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Lru/ozon/app/android/composer/view/WidgetsDebugToolsDecoration$Config;", "Lm10/d;", "LHh/a;", "Landroid/graphics/Rect;", "textSizePx", "I", "Landroid/graphics/Paint;", "borderPaint", "Landroid/graphics/Paint;", "bubblePaint", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "Config", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetsDebugToolsDecoration extends RecyclerView.n {

    @NotNull
    private final C8042d adapter;

    @NotNull
    private final Paint borderPaint;

    @NotNull
    private final Rect bounds;

    @NotNull
    private final Paint bubblePaint;

    @NotNull
    private final Config config;

    @NotNull
    private final C3140a fpsTracker;

    @NotNull
    private final TextPaint textPaint;
    private final int textSizePx;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/view/WidgetsDebugToolsDecoration$Config;", "", "isBorderEnabled", "", "textSize", "", "textColor", "bubbleColor", "borderColor", "alpha", "<init>", "(ZIIIII)V", "()Z", "getTextSize", "()I", "getTextColor", "getBubbleColor", "getBorderColor", "getAlpha", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        private final int alpha;
        private final int borderColor;
        private final int bubbleColor;
        private final boolean isBorderEnabled;
        private final int textColor;
        private final int textSize;

        public Config(boolean z11, int i11, int i12, int i13, int i14, int i15) {
            this.isBorderEnabled = z11;
            this.textSize = i11;
            this.textColor = i12;
            this.bubbleColor = i13;
            this.borderColor = i14;
            this.alpha = i15;
        }

        public final int getAlpha() {
            return this.alpha;
        }

        public final int getBorderColor() {
            return this.borderColor;
        }

        public final int getBubbleColor() {
            return this.bubbleColor;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final int getTextSize() {
            return this.textSize;
        }

        /* renamed from: isBorderEnabled, reason: from getter */
        public final boolean getIsBorderEnabled() {
            return this.isBorderEnabled;
        }
    }

    public WidgetsDebugToolsDecoration(@NotNull Config config, @NotNull C8042d adapter, @NotNull C3140a fpsTracker) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(fpsTracker, "fpsTracker");
        this.config = config;
        this.adapter = adapter;
        this.fpsTracker = fpsTracker;
        this.bounds = new Rect();
        int px = ResourceExtKt.toPx(config.getTextSize());
        this.textSizePx = px;
        Paint paint = new Paint(1);
        paint.setColor(config.getBorderColor());
        i11 = WidgetsDebugToolsDecorationKt.dp1;
        paint.setStrokeWidth(i11);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAlpha(config.getAlpha());
        this.borderPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(config.getBubbleColor());
        i12 = WidgetsDebugToolsDecorationKt.dp1;
        paint2.setStrokeWidth(i12);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setAlpha(config.getAlpha());
        this.bubblePaint = paint2;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(config.getTextColor());
        textPaint.setStyle(style);
        textPaint.setTextSize(px);
        textPaint.setAlpha(config.getAlpha());
        this.textPaint = textPaint;
    }

    private final int drawText(Canvas c11, String text, Rect bounds, float textPadding) {
        int i11;
        int i12;
        c11.save();
        StaticLayout staticLayout = getStaticLayout(text, bounds, (int) textPadding);
        c11.translate(bounds.left, bounds.top);
        float lineWidth = staticLayout.getLineWidth(0) + textPadding;
        float height = staticLayout.getHeight();
        i11 = WidgetsDebugToolsDecorationKt.dp4;
        float f7 = i11;
        i12 = WidgetsDebugToolsDecorationKt.dp4;
        c11.drawRoundRect(0.0f, 0.0f, lineWidth, height, f7, i12, this.bubblePaint);
        c11.translate(textPadding, 0.0f);
        staticLayout.draw(c11);
        c11.restore();
        return staticLayout.getHeight();
    }

    private final StaticLayout getStaticLayout(String text, Rect bounds, int textPadding) {
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), this.textPaint, bounds.width() - (textPadding * 2)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void shrinkBounds(Rect rect, int value) {
        rect.top += value;
        rect.bottom -= value;
        rect.left += value;
        rect.right -= value;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        l lVar;
        d c12;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c11, parent, state);
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = parent.getChildAt(i15);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            Integer valueOf = Integer.valueOf(childAdapterPosition);
            if (childAdapterPosition < 0 || childAdapterPosition >= this.adapter.getShimmersCount()) {
                valueOf = null;
            }
            if (valueOf != null && (lVar = (l) C7714v.Q(valueOf.intValue(), this.adapter.g())) != null && (c12 = lVar.c()) != null) {
                layoutManager.getDecoratedBoundsWithMargins(childAt, this.bounds);
                Rect rect = this.bounds;
                i11 = WidgetsDebugToolsDecorationKt.dp1;
                shrinkBounds(rect, i11);
                if (this.bounds.width() >= 0) {
                    if (this.config.getIsBorderEnabled()) {
                        c11.drawRect(this.bounds, this.borderPaint);
                    }
                    i12 = WidgetsDebugToolsDecorationKt.dp1;
                    i13 = WidgetsDebugToolsDecorationKt.dp2;
                    float f7 = i13;
                    Rect rect2 = this.bounds;
                    rect2.top = drawText(c11, c12.a(), this.bounds, f7) + i12 + rect2.top;
                    Object tag = childAt.getTag(R.id.tag_key_holder_name);
                    String str = tag instanceof String ? (String) tag : null;
                    if (str != null) {
                        String k02 = h.k0(str, ".", str);
                        Rect rect3 = this.bounds;
                        rect3.top = drawText(c11, k02, rect3, f7) + i12 + rect3.top;
                        Long j11 = this.fpsTracker.j(str);
                        if (j11 != null) {
                            long longValue = j11.longValue();
                            Rect rect4 = this.bounds;
                            Rect rect5 = this.bounds;
                            i14 = WidgetsDebugToolsDecorationKt.dp2;
                            rect4.top = drawText(c11, longValue + " ms", rect5, i14) + i12 + rect4.top;
                        }
                    }
                }
            }
        }
    }
}
