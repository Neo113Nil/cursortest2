package com.vk.ecomm.market.ui.view.ratingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.iut0;
import xsna.jyk0;
import xsna.ozl;
import xsna.rqo;

/* compiled from: DynamicRatingView.kt */
@ozl
/* loaded from: classes18.dex */
public final class DynamicRatingView extends jyk0 {
    public float r;
    public boolean s;
    public boolean t;
    public a u;
    public final ArrayList<Pair<Integer, Integer>> v;
    public boolean w;

    /* compiled from: DynamicRatingView.kt */
    public interface a {
        void v1(float f, boolean z);
    }

    public DynamicRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.v = new ArrayList<>();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.w = accessibilityManager.isTouchExplorationEnabled();
        d();
        setAccessibilityDelegate(new rqo(this, context));
        accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: xsna.qqo
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                DynamicRatingView.this.w = z;
            }
        });
    }

    @Override // xsna.jyk0
    public final void d() {
        ArrayList<Pair<Integer, Integer>> arrayList = this.v;
        arrayList.clear();
        int boundsWidth = getBoundsWidth() / getRatingCount();
        int ratingCount = getRatingCount();
        int i = 0;
        while (i < ratingCount) {
            i++;
            arrayList.add(new Pair<>(Integer.valueOf(i), Integer.valueOf(boundsWidth * i)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f, boolean z) {
        Pair<Integer, Integer> pair;
        int intValue;
        float f2;
        float f3;
        a aVar;
        getParent().requestDisallowInterceptTouchEvent(z);
        this.s = z;
        getRating();
        if (f <= getBoundsWidth()) {
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                Iterator<Pair<Integer, Integer>> it = this.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        pair = null;
                        break;
                    } else {
                        pair = it.next();
                        if (pair.j().floatValue() - f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            break;
                        }
                    }
                }
                Pair<Integer, Integer> pair2 = pair;
                if (pair2 != null) {
                    intValue = pair2.i().intValue();
                }
            }
            f2 = 0.0f;
            f3 = this.r;
            if (f2 < f3) {
                f2 = f3;
            }
            this.g = f2;
            jyk0.a aVar2 = this.b;
            this.k = aVar2 == null ? aVar2.a(this) : 0;
            invalidate();
            requestLayout();
            aVar = this.u;
            if (aVar != null) {
                aVar.v1(f2, z);
            }
            iut0.t(this, getContext().getString(R.string.dynamic_rating_view_state_content_description, Integer.valueOf((int) getRating())));
        }
        intValue = getRatingCount();
        f2 = intValue;
        f3 = this.r;
        if (f2 < f3) {
        }
        this.g = f2;
        jyk0.a aVar22 = this.b;
        this.k = aVar22 == null ? aVar22.a(this) : 0;
        invalidate();
        requestLayout();
        aVar = this.u;
        if (aVar != null) {
        }
        iut0.t(this, getContext().getString(R.string.dynamic_rating_view_state_content_description, Integer.valueOf((int) getRating())));
    }

    public final float getTouchMinRating() {
        return this.r;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.s = false;
                    }
                } else if (!this.t) {
                    e(motionEvent.getX(), true);
                }
            } else {
                if (this.w && !this.s) {
                    return true;
                }
                if (!this.t) {
                    e(motionEvent.getX(), false);
                }
            }
        } else if (this.w) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (!this.t) {
            e(motionEvent.getX(), true);
        }
        invalidate();
        return true;
    }

    public final void setLocked(boolean z) {
        this.t = z;
    }

    public final void setOnRatingChangedListener(a aVar) {
        this.u = aVar;
    }

    public final void setTouchMinRating(float f) {
        this.r = f;
    }
}
