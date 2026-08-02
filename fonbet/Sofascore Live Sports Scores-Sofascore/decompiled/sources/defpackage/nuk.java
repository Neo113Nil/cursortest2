package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nuk extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 a;

    public nuk(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(qrf qrfVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(qrfVar, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityNodeInfo(o oVar, qrf qrfVar, da daVar) {
        super.onInitializeAccessibilityNodeInfo(oVar, qrfVar, daVar);
        this.a.t.getClass();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityNodeInfoForItem(o oVar, qrf qrfVar, View view, da daVar) {
        ViewPager2 viewPager2 = (ViewPager2) this.a.t.e;
        daVar.m(dad.w(viewPager2.getOrientation() == 1 ? viewPager2.g.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.g.getPosition(view) : 0, 1, false));
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean performAccessibilityAction(o oVar, qrf qrfVar, int i, Bundle bundle) {
        this.a.t.getClass();
        return super.performAccessibilityAction(oVar, qrfVar, i, bundle);
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
