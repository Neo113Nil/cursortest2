package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ah4 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateMatchesFragment b;
    public final /* synthetic */ DateMatchesFragment c;

    public /* synthetic */ ah4(DateMatchesFragment dateMatchesFragment, DateMatchesFragment dateMatchesFragment2, int i) {
        this.a = i;
        this.b = dateMatchesFragment;
        this.c = dateMatchesFragment2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        r1.scrollToPositionWithOffset(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        if (r1 != null) goto L34;
     */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        DateMatchesFragment dateMatchesFragment = this.b;
        DateMatchesFragment dateMatchesFragment2 = this.c;
        LinearLayoutManager linearLayoutManager = null;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                        break;
                    } else {
                        krk krkVar = dateMatchesFragment2.l;
                        krkVar.getClass();
                        ((do8) krkVar).c.stopScroll();
                        krk krkVar2 = dateMatchesFragment2.l;
                        krkVar2.getClass();
                        n layoutManager = ((do8) krkVar2).c.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                            break;
                        }
                    }
                } else {
                    if (Intrinsics.c(dateMatchesFragment.toString(), ((i42) j52Var).a)) {
                        krk krkVar3 = dateMatchesFragment2.l;
                        krkVar3.getClass();
                        ((do8) krkVar3).c.stopScroll();
                        krk krkVar4 = dateMatchesFragment2.l;
                        krkVar4.getClass();
                        n layoutManager2 = ((do8) krkVar4).c.getLayoutManager();
                        if (layoutManager2 instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager2;
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.PinnedLeagueChanged");
                        break;
                    }
                } else {
                    if (Intrinsics.c(dateMatchesFragment.toString(), ((i42) j52Var2).a)) {
                    }
                    break;
                }
                dateMatchesFragment2.u();
            default:
                j52 j52Var3 = (j52) obj;
                if (!(j52Var3 instanceof i42)) {
                    if (j52Var3 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.PinnedLeagueReorder");
                        break;
                    }
                } else {
                    if (Intrinsics.c(dateMatchesFragment.toString(), ((i42) j52Var3).a)) {
                    }
                    break;
                }
                dateMatchesFragment2.u();
        }
        return null;
    }
}
