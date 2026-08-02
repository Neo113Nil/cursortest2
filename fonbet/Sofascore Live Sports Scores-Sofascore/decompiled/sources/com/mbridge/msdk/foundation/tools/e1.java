package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e1 {
    private static boolean a = false;

    public static boolean a(View view, int i) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            q0.b("ViewUtils", "View Judge : View's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            q0.b("ViewUtils", "View Judge : View's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() == null) {
            q0.b("ViewUtils", "View Judge : view has no parent");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            q0.b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        float f = i == 1 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.5f;
        boolean z = ((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) > ((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * f;
        boolean z2 = globalVisibleRect && z;
        q0.b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z);
        StringBuilder sb = new StringBuilder("View Judge : totalViewVisible is ");
        sb.append(z2);
        q0.b("ViewUtils", sb.toString());
        if (!z2) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int a2 = a(view2, viewGroup);
            for (int i2 = a2 + 1; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    boolean a3 = a(view, childAt, f);
                    q0.b("ViewUtils", "View Judge : " + a2 + "  intersects " + a3 + " currentParent " + viewGroup + "currentView " + childAt);
                    if (a3) {
                        if (childAt instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) childAt;
                            if (viewGroup2.getChildCount() > 0) {
                                q0.b("ViewUtils", "View Judge : Covered by ViewGroup.");
                                boolean a4 = a(view, viewGroup2, f);
                                a = false;
                                if (a4) {
                                    return true;
                                }
                            }
                        }
                        if (a(childAt)) {
                            q0.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
            view2 = viewGroup;
        }
        q0.b("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    private static boolean a(View view, View view2, float f) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (rect3.setIntersect(rect, rect2)) {
            int height = rect3.height() * rect3.width();
            int height2 = rect.height() * rect.width();
            int measuredHeight = view.getMeasuredHeight() * view.getMeasuredWidth();
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return height2 < measuredHeight || height >= measuredHeight;
            }
            float f2 = measuredHeight * f;
            float f3 = height;
            if (f3 >= f2) {
                return true;
            }
            int i = height2 - height;
            if (height + i >= measuredHeight) {
                return f3 > f2;
            }
            if (i <= f2) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(View view, ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            q0.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && a(view, childAt, f)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    q0.b("ViewUtils", "View Judge : View Covered by WebView.");
                    a = true;
                }
                if (a(childAt)) {
                    q0.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    a = true;
                }
                if (a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, f);
                }
            }
        }
        return a;
    }

    private static int a(View view, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    public static boolean a(View view) {
        if (view == null) {
            return true;
        }
        if (!((view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getAlpha() > 0.5f) {
            return view.getBackground() == null || view.getBackground().getAlpha() > 127;
        }
        return false;
    }
}
