package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s1;
import androidx.recyclerview.widget.z1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPager2 viewPager2) {
        super(1, false);
        this.f2906a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(z1 z1Var, int[] iArr) {
        ViewPager2 viewPager2 = this.f2906a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(z1Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final void onInitializeAccessibilityNodeInfo(s1 s1Var, z1 z1Var, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(s1Var, z1Var, cVar);
        this.f2906a.f2883t.getClass();
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onInitializeAccessibilityNodeInfoForItem(s1 s1Var, z1 z1Var, View view, q0.c cVar) {
        ViewPager2 viewPager2 = (ViewPager2) this.f2906a.f2883t.f6185d;
        cVar.k(c4.k.a(viewPager2.getOrientation() == 1 ? viewPager2.f2872g.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.f2872g.getPosition(view) : 0, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean performAccessibilityAction(s1 s1Var, z1 z1Var, int i5, Bundle bundle) {
        this.f2906a.f2883t.getClass();
        return super.performAccessibilityAction(s1Var, z1Var, i5, bundle);
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z7) {
        return false;
    }
}
