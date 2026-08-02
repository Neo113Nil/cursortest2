package ru.ozon.app.android.uikit.view.atoms.colorVariants;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000bH\u0014¢\u0006\u0004\b%\u0010\u000eJ-\u0010)\u001a\u00020\f2\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00100\u00102\b\u0010(\u001a\u0004\u0018\u00010&¢\u0006\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015R$\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010/R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001b\u00108\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b\u001e\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/colorVariants/ColorVariantsView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "", "drawText", "(Landroid/graphics/Canvas;)V", "index", "", "currentCircleColors", "drawColorCircle", "(Landroid/graphics/Canvas;ILjava/util/List;)V", "getViewWidth", "()I", "", "isActive", "getSize", "(Z)I", "", "getStartPoint", "(IZ)F", "Landroid/graphics/Bitmap;", "getTransparentBitmap", "(Z)Landroid/graphics/Bitmap;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "canvas", "onDraw", "", "colors", "text", "bind", "(Ljava/util/List;Ljava/lang/String;)V", "transparentBitMapBgColor$delegate", "LSc/j;", "getTransparentBitMapBgColor", "transparentBitMapBgColor", "Ljava/util/List;", "Ljava/lang/String;", "Landroid/graphics/Paint;", "strokePaint", "Landroid/graphics/Paint;", "textPaint", "fillPaint", "transparentBitmap$delegate", "()Landroid/graphics/Bitmap;", "transparentBitmap", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ColorVariantsView extends View implements AtomView {

    @NotNull
    private List<? extends List<Integer>> colors;

    @NotNull
    private final Paint fillPaint;

    @NotNull
    private final Paint strokePaint;
    private String text;

    @NotNull
    private final Paint textPaint;

    /* renamed from: transparentBitMapBgColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transparentBitMapBgColor;

    /* renamed from: transparentBitmap$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transparentBitmap;
    private static final int ACTIVE_CIRCLE_DIAMETER = ResourceExtKt.toPx(13);
    private static final int CHILDREN_MARGIN = ResourceExtKt.toPx(4);
    private static final int CIRCLE_DIAMETER = ResourceExtKt.toPx(9);
    private static final float BORDER_SIZE = ResourceExtKt.toPxF(1);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorVariantsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawColorCircle(Canvas canvas, int i11, List<Integer> list) {
        boolean z11 = i11 == 0;
        if (list != null) {
            this.fillPaint.setColor(((Number) C7714v.K(list)).intValue());
        }
        float size = getSize(z11);
        float f7 = size / 2.0f;
        float f11 = ACTIVE_CIRCLE_DIAMETER / 2.0f;
        float startPoint = getStartPoint(i11, z11) + f7;
        if (list == null) {
            this.fillPaint.setColor(getTransparentBitMapBgColor());
            canvas.drawCircle(startPoint, f11, f7, this.fillPaint);
            canvas.drawBitmap(getTransparentBitmap(z11), Math.max(startPoint - f7, 0.0f), z11 ? 0.0f : f11 - f7, this.fillPaint);
        } else if (list.size() >= 2) {
            this.fillPaint.setColor(((Number) C7714v.K(list)).intValue());
            canvas.drawCircle(startPoint, f11, f7, this.fillPaint);
            this.fillPaint.setColor(list.get(1).intValue());
            float max = Math.max(startPoint - f7, 0.0f);
            canvas.drawArc(max, z11 ? 0.0f : f11 - f7, max + size, (size + f11) - f7, 270.0f, 180.0f, true, this.fillPaint);
        } else if (list.size() == 1) {
            this.fillPaint.setColor(((Number) C7714v.K(list)).intValue());
            canvas.drawCircle(startPoint, f11, f7, this.fillPaint);
        }
        canvas.drawCircle(startPoint, f11, f7 - (BORDER_SIZE / 2), this.strokePaint);
    }

    private final void drawText(Canvas canvas) {
        String str = this.text;
        if (str != null) {
            float startPoint = getStartPoint(this.colors.size(), false);
            Rect rect = new Rect();
            this.textPaint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, startPoint, (((ACTIVE_CIRCLE_DIAMETER - r2) / 2.0f) + rect.height()) - BORDER_SIZE, this.textPaint);
        }
    }

    private final int getSize(boolean isActive) {
        return isActive ? ACTIVE_CIRCLE_DIAMETER : CIRCLE_DIAMETER;
    }

    private final float getStartPoint(int index, boolean isActive) {
        return ((CHILDREN_MARGIN + getSize(isActive)) * index) + (!isActive ? ACTIVE_CIRCLE_DIAMETER - CIRCLE_DIAMETER : 0);
    }

    private final int getTransparentBitMapBgColor() {
        return ((Number) this.transparentBitMapBgColor.getValue()).intValue();
    }

    private final Bitmap getTransparentBitmap() {
        return (Bitmap) this.transparentBitmap.getValue();
    }

    private final int getViewWidth() {
        int i11;
        String str = this.text;
        if (str != null) {
            Rect rect = new Rect();
            this.textPaint.getTextBounds(str, 0, str.length(), rect);
            i11 = rect.width();
        } else {
            i11 = -CHILDREN_MARGIN;
        }
        return i11 + ((int) getStartPoint(this.colors.size(), false));
    }

    public final void bind(@NotNull List<? extends List<String>> colors, String text) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        List<? extends List<String>> list = colors;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            List list2 = (List) it.next();
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList2 = new ArrayList(C7714v.z(list3, 10));
                for (String str : list3) {
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Integer parseColor = styleParser.parseColor(context, str);
                    arrayList2.add(Integer.valueOf(parseColor != null ? parseColor.intValue() : -1));
                }
            }
            arrayList.add(arrayList2);
        }
        this.colors = arrayList;
        this.text = text != null ? h.q0(3, text) : null;
        requestLayout();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i11 = 0;
        for (Object obj : this.colors) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            drawColorCircle(canvas, i11, (List) obj);
            i11 = i12;
        }
        drawText(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getLayoutParams().width == -2) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getViewWidth(), LinearLayoutManager.INVALID_OFFSET);
        }
        if (getLayoutParams().height == -2) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(ACTIVE_CIRCLE_DIAMETER, LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public /* synthetic */ ColorVariantsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Bitmap getTransparentBitmap(boolean isActive) {
        int size = getSize(isActive);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(getTransparentBitmap(), size, size, false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorVariantsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.transparentBitMapBgColor = k.b(new ColorVariantsView$transparentBitMapBgColor$2(context));
        this.colors = K.f71697a;
        Paint a11 = Pk0.h.a(true);
        a11.setColor(a.getColor(context, R$color.oz_separator));
        a11.setStrokeWidth(BORDER_SIZE);
        a11.setStyle(Paint.Style.STROKE);
        this.strokePaint = a11;
        Paint a12 = Pk0.h.a(true);
        a12.setTextSize(ResourceExtKt.toSpF(12));
        a12.setColor(a.getColor(context, R$color.oz_gray_60));
        a12.setTypeface(g.e(R$font.onest_regular, context));
        a12.setLetterSpacing(0.05f);
        this.textPaint = a12;
        this.fillPaint = Pk0.h.a(true);
        this.transparentBitmap = k.b(new ColorVariantsView$transparentBitmap$2(context));
        if (attributeSet == null) {
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
    }
}
