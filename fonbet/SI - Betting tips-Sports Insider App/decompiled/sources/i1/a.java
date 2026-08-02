package i1;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.z0;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends androidx.core.view.b {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f10854a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f10855b;

    public a(DrawerLayout drawerLayout) {
        this.f10855b = drawerLayout;
    }

    @Override // androidx.core.view.b
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.f10855b;
        View e7 = drawerLayout.e();
        if (e7 == null) {
            return true;
        }
        int g10 = drawerLayout.g(e7);
        drawerLayout.getClass();
        WeakHashMap weakHashMap = z0.f1413a;
        Gravity.getAbsoluteGravity(g10, drawerLayout.getLayoutDirection());
        return true;
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        if (DrawerLayout.H) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f21914a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = cVar.f21914a;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            super.onInitializeAccessibilityNodeInfo(view, new q0.c(obtain));
            cVar.f21915b = -1;
            accessibilityNodeInfo2.setSource(view);
            WeakHashMap weakHashMap = z0.f1413a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfo2.setParent((View) parentForAccessibility);
            }
            Rect rect = this.f10854a;
            obtain.getBoundsInScreen(rect);
            accessibilityNodeInfo2.setBoundsInScreen(rect);
            accessibilityNodeInfo2.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfo2.setPackageName(obtain.getPackageName());
            cVar.j(obtain.getClassName());
            cVar.l(obtain.getContentDescription());
            accessibilityNodeInfo2.setEnabled(obtain.isEnabled());
            accessibilityNodeInfo2.setFocused(obtain.isFocused());
            accessibilityNodeInfo2.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfo2.setSelected(obtain.isSelected());
            cVar.a(obtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (DrawerLayout.i(childAt)) {
                    accessibilityNodeInfo2.addChild(childAt);
                }
            }
        }
        cVar.j("androidx.drawerlayout.widget.DrawerLayout");
        AccessibilityNodeInfo accessibilityNodeInfo3 = cVar.f21914a;
        accessibilityNodeInfo3.setFocusable(false);
        accessibilityNodeInfo3.setFocused(false);
        accessibilityNodeInfo3.removeAction((AccessibilityNodeInfo.AccessibilityAction) q0.b.f21898e.f21909a);
        accessibilityNodeInfo3.removeAction((AccessibilityNodeInfo.AccessibilityAction) q0.b.f21899f.f21909a);
    }

    @Override // androidx.core.view.b
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.H || DrawerLayout.i(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
