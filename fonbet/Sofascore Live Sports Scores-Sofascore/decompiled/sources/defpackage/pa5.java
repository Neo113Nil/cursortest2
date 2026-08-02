package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pa5 extends LayerDrawable {
    public final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa5(float f, Drawable[] drawableArr) {
        super(drawableArr);
        this.a = f;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        int save = canvas.save();
        canvas.scale(-1.0f, this.a, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
        try {
            super.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
