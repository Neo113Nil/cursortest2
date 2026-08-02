package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pw8 extends xa5 {
    public static final /* synthetic */ int g = 0;
    public final Drawable e;
    public final Rect f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw8(Drawable drawable, Rect rect, float f, ArrayList arrayList) {
        super(f, arrayList);
        rect.getClass();
        this.e = drawable;
        this.f = rect;
    }

    @Override // defpackage.xa5
    public final void a(Canvas canvas, va5 va5Var, float f) {
        canvas.getClass();
        wa5 wa5Var = va5Var.a;
        float f2 = va5Var.c;
        int ordinal = wa5Var.ordinal();
        int F = ordinal != 0 ? ordinal != 1 ? 255 : rz8.F(f / f2) : rz8.E(f / f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(F);
            drawable.setBounds(this.f);
            drawable.draw(canvas);
        }
    }
}
