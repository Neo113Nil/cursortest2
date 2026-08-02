package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends GradientDrawable {
    protected Path pcc;
    private final Paint sf;

    public sf() {
        this.pcc = new Path();
        Paint paint = new Paint(1);
        this.sf = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.pcc;
        if (path == null || path.isEmpty()) {
            pcc(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), this.sf, 31);
        pcc(canvas);
        this.sf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.pcc, this.sf);
        this.sf.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    public void pcc(int i, int i2, int i3, int i4) {
        this.pcc.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }

    public void pcc(Canvas canvas) {
        super.draw(canvas);
    }

    public sf(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.pcc = new Path();
        Paint paint = new Paint(1);
        this.sf = paint;
        paint.setColor(-1);
    }
}
