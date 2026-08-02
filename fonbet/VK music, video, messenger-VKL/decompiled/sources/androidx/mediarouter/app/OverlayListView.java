package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.u11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public final class OverlayListView extends ListView {
    public final ArrayList b;

    public static class a {
        public final BitmapDrawable a;
        public final Rect c;
        public Interpolator d;
        public long e;
        public final Rect f;
        public int g;
        public long i;
        public boolean j;
        public boolean k;
        public androidx.mediarouter.app.a l;
        public float b = 1.0f;
        public float h = 1.0f;

        public a(@Nullable BitmapDrawable bitmapDrawable, @Nullable Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            Rect rect2 = new Rect(rect);
            this.c = rect2;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha((int) (this.b * 255.0f));
                bitmapDrawable.setBounds(rect2);
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                BitmapDrawable bitmapDrawable = aVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = aVar.a;
                Rect rect = aVar.c;
                if (aVar.k) {
                    z = false;
                } else {
                    float min = Math.min(1.0f, (drawingTime - aVar.i) / aVar.e);
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, min);
                    if (aVar.j) {
                        f = max;
                    }
                    Interpolator interpolator = aVar.d;
                    float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);
                    int i = (int) (aVar.g * interpolation);
                    Rect rect2 = aVar.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float b = u11.b(aVar.h, 1.0f, interpolation, 1.0f);
                    aVar.b = b;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (b * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (aVar.j && f >= 1.0f) {
                        aVar.k = true;
                        androidx.mediarouter.app.a aVar2 = aVar.l;
                        if (aVar2 != null) {
                            b bVar = aVar2.b;
                            bVar.L.remove(aVar2.a);
                            bVar.H.notifyDataSetChanged();
                        }
                    }
                    z = !aVar.k;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
