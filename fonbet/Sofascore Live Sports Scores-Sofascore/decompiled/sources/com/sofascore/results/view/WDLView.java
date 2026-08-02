package com.sofascore.results.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.hkg;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/view/WDLView;", "Landroid/view/View;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WDLView extends View {
    public final Paint a;
    public final TextPaint b;
    public String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WDLView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.a = paint;
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(hkg.Y(R.font.sofascore_sans_bold, context));
        textPaint.setColor(context.getColor(R.color.surface_1));
        textPaint.setTextSize(ao2.u(14, context));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.b = textPaint;
        this.c = "";
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width, this.a);
        String str = this.c;
        int length = str.length();
        TextPaint textPaint = this.b;
        canvas.drawText(str, 0, length, width, width - ((textPaint.ascent() + textPaint.descent()) / 2.0f), (Paint) textPaint);
    }
}
