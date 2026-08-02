package androidx.recyclerview.widget;

import com.unity3d.services.UnityAdsConstants;
import defpackage.eh;
import defpackage.o25;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k implements o25 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ k(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.o25
    public float B() {
        float f;
        RecyclerView recyclerView = this.a;
        if (recyclerView.mLayout.canScrollVertically()) {
            f = recyclerView.mScaledVerticalScrollFactor;
        } else {
            if (!recyclerView.mLayout.canScrollHorizontally()) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            f = recyclerView.mScaledHorizontalScrollFactor;
        }
        return -f;
    }

    @Override // defpackage.o25
    public void C() {
        this.a.stopScroll();
    }

    public void a(eh ehVar) {
        int i = ehVar.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, ehVar.b, ehVar.d);
            return;
        }
        if (i == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, ehVar.b, ehVar.d);
        } else if (i == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, ehVar.b, ehVar.d, ehVar.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, ehVar.b, ehVar.d, 1);
        }
    }

    @Override // defpackage.o25
    public boolean v(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.a;
        if (recyclerView.mLayout.canScrollVertically()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.mLayout.canScrollHorizontally()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return recyclerView.flingNoThresholdCheck(i, i2);
    }
}
