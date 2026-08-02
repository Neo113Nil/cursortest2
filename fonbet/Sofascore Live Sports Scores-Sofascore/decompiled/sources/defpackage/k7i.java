package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sofascore.results.main.matches.StageSeriesWeekFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k7i implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageSeriesWeekFragment b;
    public final /* synthetic */ StageSeriesWeekFragment c;

    public /* synthetic */ k7i(StageSeriesWeekFragment stageSeriesWeekFragment, StageSeriesWeekFragment stageSeriesWeekFragment2, int i) {
        this.a = i;
        this.b = stageSeriesWeekFragment;
        this.c = stageSeriesWeekFragment2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        r1.scrollToPositionWithOffset(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        RecyclerView recyclerView;
        oi oiVar;
        int i = this.a;
        StageSeriesWeekFragment stageSeriesWeekFragment = this.b;
        StageSeriesWeekFragment stageSeriesWeekFragment2 = this.c;
        LinearLayoutManager linearLayoutManager = null;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                        break;
                    } else {
                        krk krkVar = stageSeriesWeekFragment2.l;
                        krkVar.getClass();
                        ((rp8) krkVar).c.stopScroll();
                        krk krkVar2 = stageSeriesWeekFragment2.l;
                        krkVar2.getClass();
                        n layoutManager = ((rp8) krkVar2).c.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                            break;
                        }
                    }
                } else {
                    if (Intrinsics.c(stageSeriesWeekFragment.toString(), ((i42) j52Var).a)) {
                        krk krkVar3 = stageSeriesWeekFragment2.l;
                        krkVar3.getClass();
                        ((rp8) krkVar3).c.stopScroll();
                        krk krkVar4 = stageSeriesWeekFragment2.l;
                        krkVar4.getClass();
                        n layoutManager2 = ((rp8) krkVar4).c.getLayoutManager();
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
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshDetailsBellButton");
                        break;
                    } else {
                        krk krkVar5 = stageSeriesWeekFragment2.l;
                        krkVar5.getClass();
                        recyclerView = ((rp8) krkVar5).c;
                        oiVar = new oi(stageSeriesWeekFragment2, 17);
                    }
                } else {
                    if (Intrinsics.c(stageSeriesWeekFragment.toString(), ((i42) j52Var2).a)) {
                        krk krkVar6 = stageSeriesWeekFragment2.l;
                        krkVar6.getClass();
                        recyclerView = ((rp8) krkVar6).c;
                        oiVar = new oi(stageSeriesWeekFragment2, 17);
                    }
                    break;
                }
                stageSeriesWeekFragment2.t(recyclerView, oiVar);
        }
        return null;
    }
}
