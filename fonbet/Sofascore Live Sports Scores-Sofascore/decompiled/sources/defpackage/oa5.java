package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.LayerDrawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oa5 extends LayerDrawable {
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.save();
        canvas.rotate(180.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }
}
