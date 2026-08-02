package c3;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends androidx.core.view.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f3528a;

    public e(h hVar) {
        this.f3528a = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.b() > 1) goto L8;
     */
    @Override // androidx.core.view.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        a aVar;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        h hVar = this.f3528a;
        a aVar2 = hVar.f3536e;
        boolean z5 = aVar2 != null;
        accessibilityEvent.setScrollable(z5);
        if (accessibilityEvent.getEventType() != 4096 || (aVar = hVar.f3536e) == null) {
            return;
        }
        accessibilityEvent.setItemCount(aVar.b());
        accessibilityEvent.setFromIndex(hVar.f3537f);
        accessibilityEvent.setToIndex(hVar.f3537f);
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.j("androidx.viewpager.widget.ViewPager");
        h hVar = this.f3528a;
        a aVar = hVar.f3536e;
        cVar.q(aVar != null && aVar.b() > 1);
        if (hVar.canScrollHorizontally(1)) {
            cVar.a(4096);
        }
        if (hVar.canScrollHorizontally(-1)) {
            cVar.a(Segment.SIZE);
        }
    }

    @Override // androidx.core.view.b
    public final boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
        if (super.performAccessibilityAction(view, i5, bundle)) {
            return true;
        }
        h hVar = this.f3528a;
        if (i5 == 4096) {
            if (!hVar.canScrollHorizontally(1)) {
                return false;
            }
            hVar.setCurrentItem(hVar.f3537f + 1);
            return true;
        }
        if (i5 != 8192 || !hVar.canScrollHorizontally(-1)) {
            return false;
        }
        hVar.setCurrentItem(hVar.f3537f - 1);
        return true;
    }
}
