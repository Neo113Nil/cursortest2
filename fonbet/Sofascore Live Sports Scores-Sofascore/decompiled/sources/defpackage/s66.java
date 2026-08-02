package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sofascore.results.event.scorecard.EventScorecardFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s66 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ EventScorecardFragment a;

    public s66(EventScorecardFragment eventScorecardFragment) {
        this.a = eventScorecardFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        r8 = r0.l;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (((defpackage.yq8) r8).e.getChildCount() != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        r8 = r0.l;
        r8.getClass();
        ((defpackage.yq8) r8).e.addView((android.view.View) r1.get(r3));
     */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View view;
        EventScorecardFragment eventScorecardFragment = this.a;
        LinkedHashMap linkedHashMap = eventScorecardFragment.z;
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        n layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1) {
            n layoutManager2 = recyclerView.getLayoutManager();
            layoutManager2.getClass();
            view = ((LinearLayoutManager) layoutManager2).findViewByPosition(findFirstVisibleItemPosition);
        } else {
            view = null;
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        Iterator it = linkedHashMap.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                qtg qtgVar = (qtg) it.next();
                int i3 = qtgVar.b;
                int i4 = qtgVar.c;
                if (i3 <= findFirstVisibleItemPosition && i4 >= findFirstVisibleItemPosition) {
                    Context requireContext = eventScorecardFragment.requireContext();
                    requireContext.getClass();
                    if (computeVerticalScrollOffset < ao2.s(4, requireContext)) {
                        continue;
                    } else {
                        if (i4 != findFirstVisibleItemPosition) {
                            break;
                        }
                        int bottom = view != null ? view.getBottom() : 0;
                        Context requireContext2 = eventScorecardFragment.requireContext();
                        requireContext2.getClass();
                        if (bottom > ao2.s(32, requireContext2)) {
                            break;
                        }
                    }
                }
            } else {
                krk krkVar = eventScorecardFragment.l;
                krkVar.getClass();
                if (((yq8) krkVar).e.getChildCount() != 0) {
                    krk krkVar2 = eventScorecardFragment.l;
                    krkVar2.getClass();
                    ((yq8) krkVar2).e.removeAllViews();
                }
            }
        }
        krk krkVar3 = eventScorecardFragment.l;
        krkVar3.getClass();
        FrameLayout frameLayout = ((yq8) krkVar3).e;
        krk krkVar4 = eventScorecardFragment.l;
        krkVar4.getClass();
        frameLayout.setVisibility(((yq8) krkVar4).e.getChildCount() == 0 ? 8 : 0);
        krk krkVar5 = eventScorecardFragment.l;
        krkVar5.getClass();
        LinearLayout linearLayout = ((yq8) krkVar5).b;
        krk krkVar6 = eventScorecardFragment.l;
        krkVar6.getClass();
        linearLayout.setOutlineProvider(((yq8) krkVar6).e.getChildCount() == 0 ? ViewOutlineProvider.BOUNDS : null);
    }
}
