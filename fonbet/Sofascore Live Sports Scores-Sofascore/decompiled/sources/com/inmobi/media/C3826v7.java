package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3826v7 {
    public long a;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r5).getColor() == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r4).getColor() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f9, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        if (r4.getForeground() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        if (r4.getBackground() == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(View view, View view2, int i) {
        boolean z;
        boolean z2;
        view.getClass();
        view2.getClass();
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z3 = viewGroup == null || a(viewGroup, view2, i);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int indexOfChild = viewGroup.indexOfChild(view) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = viewGroup.getChildAt(indexOfChild);
                childAt.getClass();
                if (childAt.getVisibility() == 0) {
                    if (view2 instanceof GestureDetectorOnGestureListenerC3889xi) {
                        if (childAt instanceof C3831vc) {
                            continue;
                        } else if (!(childAt instanceof Fi)) {
                            Map<View, FriendlyObstructionPurpose> friendlyViews = ((GestureDetectorOnGestureListenerC3889xi) view2).getFriendlyViews();
                            if (friendlyViews != null ? friendlyViews.containsKey(childAt) : false) {
                                continue;
                            } else {
                                Rect rect = new Rect();
                                view2.getGlobalVisibleRect(rect);
                                Rect rect2 = new Rect();
                                childAt.getGlobalVisibleRect(rect2);
                                Rect rect3 = new Rect();
                                boolean intersect = rect3.setIntersect(rect, rect2);
                                int i2 = ((rect.bottom - rect.top) * (rect.right - rect.left)) - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                float configuredArea = (i / 100.0f) * r5.getConfiguredArea();
                                if (intersect && i2 < configuredArea && childAt.getAlpha() > 0.3f) {
                                    if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                        if (childAt.getBackground() instanceof ColorDrawable) {
                                            Drawable background = childAt.getBackground();
                                            background.getClass();
                                        }
                                        if (childAt.getForeground() instanceof ColorDrawable) {
                                            Drawable foreground = childAt.getForeground();
                                            foreground.getClass();
                                        }
                                        if (z && z2) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return z3;
    }

    public final boolean b(View view, View view2, int i) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = view2 instanceof GestureDetectorOnGestureListenerC3889xi ? (GestureDetectorOnGestureListenerC3889xi) view2 : null;
                if (gestureDetectorOnGestureListenerC3889xi == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC3889xi.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC3889xi.getHeight() <= 0 || gestureDetectorOnGestureListenerC3889xi.getWidth() <= 0)) {
                    return false;
                }
                if (!gestureDetectorOnGestureListenerC3889xi.getGlobalVisibleRect(new Rect())) {
                    return false;
                }
                this.a = r7.height() * r7.width();
                if (gestureDetectorOnGestureListenerC3889xi.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC3889xi.setConfiguredArea(gestureDetectorOnGestureListenerC3889xi.getHeight() * gestureDetectorOnGestureListenerC3889xi.getWidth());
                }
                if (gestureDetectorOnGestureListenerC3889xi.getArea() > 0) {
                    if (100 * this.a >= gestureDetectorOnGestureListenerC3889xi.getConfiguredArea() * i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
