package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k65 extends erf {
    public static final int[] d = {R.attr.listDivider};
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public k65() {
        this.a = 1;
        Paint paint = new Paint();
        this.b = paint;
        this.c = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.erf
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                    break;
                } else {
                    rect.set(0, 0, 0, 0);
                    break;
                }
            default:
                super.getItemOffsets(rect, view, recyclerView, qrfVar);
                break;
        }
    }

    @Override // defpackage.erf
    public void onDraw(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        Drawable drawable;
        int width;
        int i;
        switch (this.a) {
            case 0:
                if (recyclerView.getLayoutManager() != null && (drawable = (Drawable) this.b) != null) {
                    Rect rect = (Rect) this.c;
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        i = recyclerView.getPaddingLeft();
                        width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                        canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                    } else {
                        width = recyclerView.getWidth();
                        i = 0;
                    }
                    int childCount = recyclerView.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = recyclerView.getChildAt(i2);
                        recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                        int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                        drawable.setBounds(i, round - drawable.getIntrinsicHeight(), width, round);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas, recyclerView, qrfVar);
                break;
        }
    }

    @Override // defpackage.erf
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        Canvas canvas2;
        switch (this.a) {
            case 1:
                super.onDrawOver(canvas, recyclerView, qrfVar);
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(recyclerView.getResources().getDimension(com.sofascore.results.R.dimen.m3_carousel_debug_keyline_width));
                Iterator it = ((List) this.c).iterator();
                while (it.hasNext()) {
                    ((uja) it.next()).getClass();
                    ThreadLocal threadLocal = o23.a;
                    float f = 1.0f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.blue(-65281) * f))));
                    if (((CarouselLayoutManager) recyclerView.getLayoutManager()).e()) {
                        canvas2 = canvas;
                        canvas2.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.j(), paint);
                    } else {
                        canvas2 = canvas;
                        canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).b.k(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).b.l(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                    }
                    canvas = canvas2;
                }
                break;
            default:
                super.onDrawOver(canvas, recyclerView, qrfVar);
                break;
        }
    }

    public k65(TTHistoryActivity tTHistoryActivity) {
        this.a = 0;
        this.c = new Rect();
        TypedArray obtainStyledAttributes = tTHistoryActivity.obtainStyledAttributes(d);
        this.b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }
}
