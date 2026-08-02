package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sofascore.results.main.matches.redesign.chronologicalmatches.ChronologicalMatchesFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yt2 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChronologicalMatchesFragment b;
    public final /* synthetic */ ChronologicalMatchesFragment c;

    public /* synthetic */ yt2(ChronologicalMatchesFragment chronologicalMatchesFragment, ChronologicalMatchesFragment chronologicalMatchesFragment2, int i) {
        this.a = i;
        this.b = chronologicalMatchesFragment;
        this.c = chronologicalMatchesFragment2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        r1.scrollToPositionWithOffset(r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        if (r1 != null) goto L27;
     */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        int intValue;
        int i = this.a;
        ChronologicalMatchesFragment chronologicalMatchesFragment = this.b;
        ChronologicalMatchesFragment chronologicalMatchesFragment2 = this.c;
        LinearLayoutManager linearLayoutManager = null;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                        break;
                    } else {
                        krk krkVar = chronologicalMatchesFragment2.l;
                        krkVar.getClass();
                        ((zn8) krkVar).b.stopScroll();
                        boolean z = chronologicalMatchesFragment2.D().c;
                        krk krkVar2 = chronologicalMatchesFragment2.l;
                        krkVar2.getClass();
                        RecyclerView recyclerView = ((zn8) krkVar2).b;
                        Integer num = ((du2) chronologicalMatchesFragment2.E().r.a.getValue()).b;
                        intValue = num != null ? num.intValue() + (z ? 1 : 0) : 0;
                        n layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                            break;
                        }
                    }
                } else {
                    if (Intrinsics.c(chronologicalMatchesFragment.toString(), ((i42) j52Var).a)) {
                        krk krkVar3 = chronologicalMatchesFragment2.l;
                        krkVar3.getClass();
                        ((zn8) krkVar3).b.stopScroll();
                        boolean z2 = chronologicalMatchesFragment2.D().c;
                        krk krkVar4 = chronologicalMatchesFragment2.l;
                        krkVar4.getClass();
                        RecyclerView recyclerView2 = ((zn8) krkVar4).b;
                        Integer num2 = ((du2) chronologicalMatchesFragment2.E().r.a.getValue()).b;
                        intValue = num2 != null ? num2.intValue() + (z2 ? 1 : 0) : 0;
                        n layoutManager2 = recyclerView2.getLayoutManager();
                        if (layoutManager2 instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager2;
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                        break;
                    }
                } else {
                    if (Intrinsics.c(chronologicalMatchesFragment.toString(), ((i42) j52Var2).a)) {
                    }
                    break;
                }
                chronologicalMatchesFragment2.C().U();
        }
        return null;
    }
}
