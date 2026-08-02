package ru.ozon.app.android.regulardraw.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\"\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "strokeColor", "textColor", "strokeWidth", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setTextConfig", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OutlinedTextView extends AppCompatTextView {
    private int strokeColor;
    private float strokeWidth;
    private int textColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutlinedTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        TextPaint paint = getPaint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(10.0f);
        setTextColor(this.strokeColor);
        paint.setStrokeWidth(this.strokeWidth);
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        setTextColor(this.textColor);
        super.onDraw(canvas);
    }

    public final void setTextConfig(int textColor, int strokeColor, float strokeWidth) {
        this.textColor = textColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
        invalidate();
    }

    public /* synthetic */ OutlinedTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.strokeColor = -16777216;
        this.textColor = -1;
        this.strokeWidth = ResourceExtKt.toPxF(2);
        setEllipsize(TextUtils.TruncateAt.END);
        setIncludeFontPadding(false);
        setPadding(0, 0, 0, 0);
        setGravity(17);
    }
}
