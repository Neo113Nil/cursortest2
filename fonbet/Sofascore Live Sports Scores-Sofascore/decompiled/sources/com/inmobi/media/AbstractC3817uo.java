package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import defpackage.llf;
import defpackage.v6a;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.uo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3817uo {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r3).getColor() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r2).getColor() == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if (r2.getForeground() == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        if (r2.getBackground() == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(View view, Rect rect, int i, List list) {
        boolean z;
        boolean z2;
        view.getClass();
        rect.getClass();
        list.getClass();
        float height = (i / 100.0f) * view.getHeight() * view.getWidth();
        while (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            Iterable j = llf.j(viewGroup.indexOfChild(view) + 1, viewGroup.getChildCount());
            if (!(j instanceof Collection) || !((Collection) j).isEmpty()) {
                v6a it = j.iterator();
                while (it.c) {
                    View childAt = viewGroup.getChildAt(it.nextInt());
                    if (childAt.getVisibility() == 0 && !list.contains(childAt)) {
                        Rect rect2 = new Rect();
                        childAt.getGlobalVisibleRect(rect2);
                        Rect rect3 = new Rect();
                        boolean intersect = rect3.setIntersect(rect, rect2);
                        int i2 = ((rect.bottom - rect.top) * (rect.right - rect.left)) - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                        if (intersect && i2 < height && childAt.getAlpha() > 0.3f) {
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
                            return false;
                        }
                    }
                }
            }
            view = viewGroup;
        }
        return true;
    }

    public static final boolean a(View view, Rect rect, int i, H5 h5) {
        view.getClass();
        rect.getClass();
        h5.getClass();
        if (a(view, h5)) {
            return 100 * (((long) rect.height()) * ((long) rect.width())) >= ((long) (i * (view.getHeight() * view.getWidth())));
        }
        return false;
    }

    public static final boolean a(View view, H5 h5) {
        view.getClass();
        h5.getClass();
        if (view.getVisibility() == 0 && view.getParent() != null && view.isShown() && view.getWidth() >= h5.a && view.getHeight() >= h5.b) {
            if (view.getHeight() * view.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }
}
