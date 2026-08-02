package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bch extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public bch(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.i == null) {
            return;
        }
        if (shapeableImageView.h == null) {
            shapeableImageView.h = new qzb(shapeableImageView.i);
        }
        RectF rectF = shapeableImageView.b;
        Rect rect = this.a;
        rectF.round(rect);
        shapeableImageView.h.setBounds(rect);
        shapeableImageView.h.getOutline(outline);
    }
}
