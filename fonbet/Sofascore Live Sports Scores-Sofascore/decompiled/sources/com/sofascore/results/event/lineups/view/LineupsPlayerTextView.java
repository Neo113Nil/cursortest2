package com.sofascore.results.event.lineups.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.tda;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/event/lineups/view/LineupsPlayerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Ltda;", "drawable", "", "setTopDrawable", "(Ltda;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LineupsPlayerTextView extends AppCompatTextView {
    public tda h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineupsPlayerTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        this.h = new tda(context);
        this.i = -1;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.getClass();
        boolean z = this.h.getIntrinsicWidth() > getMeasuredWidth();
        if (getMeasuredWidth() > 0 && getMeasuredWidth() != this.i && z) {
            this.i = getMeasuredWidth();
        }
        if (z && this.i > 0) {
            tda tdaVar = this.h;
            float intrinsicWidth = (tdaVar.getIntrinsicWidth() - getMeasuredWidth()) / 2.0f;
            if (intrinsicWidth != tdaVar.q) {
                tdaVar.q = intrinsicWidth;
                tdaVar.r = false;
                tdaVar.invalidateSelf();
            }
        }
        super.draw(canvas);
    }

    public final void setTopDrawable(@NotNull tda drawable) {
        drawable.getClass();
        this.h = drawable;
    }
}
