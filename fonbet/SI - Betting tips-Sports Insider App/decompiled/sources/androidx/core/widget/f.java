package androidx.core.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends androidx.core.view.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1473a;

    public /* synthetic */ f(int i5) {
        this.f1473a = i5;
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1473a) {
            case 0:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        int scrollRange;
        switch (this.f1473a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, cVar);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                cVar.j(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    cVar.q(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        cVar.b(q0.b.f21902i);
                        cVar.b(q0.b.f21906n);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        cVar.b(q0.b.f21901h);
                        cVar.b(q0.b.f21907o);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, cVar);
                if (!DrawerLayout.i(view)) {
                    cVar.f21914a.setParent(null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // androidx.core.view.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
        switch (this.f1473a) {
            case 0:
                if (super.performAccessibilityAction(view, i5, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i5 != 4096) {
                        if (i5 != 8192 && i5 != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.p(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.p(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.performAccessibilityAction(view, i5, bundle);
        }
    }
}
