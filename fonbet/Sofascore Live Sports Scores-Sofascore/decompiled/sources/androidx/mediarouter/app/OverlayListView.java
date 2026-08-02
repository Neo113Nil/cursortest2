package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.iyd;
import defpackage.me4;
import defpackage.obc;
import defpackage.wj9;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iyd iydVar = (iyd) it.next();
                BitmapDrawable bitmapDrawable = iydVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = iydVar.a;
                Rect rect = iydVar.c;
                if (iydVar.k) {
                    z = false;
                } else {
                    float min = Math.min(1.0f, (drawingTime - iydVar.i) / iydVar.e);
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, min);
                    if (iydVar.j) {
                        f = max;
                    }
                    Interpolator interpolator = iydVar.d;
                    float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);
                    int i = (int) (iydVar.g * interpolation);
                    Rect rect2 = iydVar.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float b = me4.b(iydVar.h, 1.0f, interpolation, 1.0f);
                    iydVar.b = b;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (b * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (iydVar.j && f >= 1.0f) {
                        iydVar.k = true;
                        wj9 wj9Var = iydVar.l;
                        if (wj9Var != null) {
                            d dVar = (d) wj9Var.c;
                            dVar.L.remove((obc) wj9Var.b);
                            dVar.H.notifyDataSetChanged();
                        }
                    }
                    z = !iydVar.k;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
