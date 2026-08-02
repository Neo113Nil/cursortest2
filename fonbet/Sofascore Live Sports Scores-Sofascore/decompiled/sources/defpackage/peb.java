package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class peb implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LiveMatchesFragment b;
    public final /* synthetic */ LiveMatchesFragment c;

    public /* synthetic */ peb(LiveMatchesFragment liveMatchesFragment, LiveMatchesFragment liveMatchesFragment2, int i) {
        this.a = i;
        this.b = liveMatchesFragment;
        this.c = liveMatchesFragment2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r1 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r1.scrollToPositionWithOffset(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        if (r1 != 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.recyclerview.widget.LinearLayoutManager] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        iz2 z;
        ip1 ip1Var;
        int i = this.a;
        LiveMatchesFragment liveMatchesFragment = this.b;
        LiveMatchesFragment liveMatchesFragment2 = this.c;
        ?? r1 = 0;
        r1 = 0;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                        break;
                    } else {
                        krk krkVar = liveMatchesFragment2.l;
                        krkVar.getClass();
                        ((ro8) krkVar).d.stopScroll();
                        krk krkVar2 = liveMatchesFragment2.l;
                        krkVar2.getClass();
                        n layoutManager = ((ro8) krkVar2).d.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            r1 = (LinearLayoutManager) layoutManager;
                            break;
                        }
                    }
                } else {
                    if (Intrinsics.c(liveMatchesFragment.toString(), ((i42) j52Var).a)) {
                        krk krkVar3 = liveMatchesFragment2.l;
                        krkVar3.getClass();
                        ((ro8) krkVar3).d.stopScroll();
                        krk krkVar4 = liveMatchesFragment2.l;
                        krkVar4.getClass();
                        n layoutManager2 = ((ro8) krkVar4).d.getLayoutManager();
                        if (layoutManager2 instanceof LinearLayoutManager) {
                            r1 = (LinearLayoutManager) layoutManager2;
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                j52 j52Var2 = (j52) obj;
                int i2 = 25;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                        break;
                    } else {
                        liveMatchesFragment2.C().U();
                        xeb D = liveMatchesFragment2.D();
                        z = un0.z(D);
                        ip1Var = new ip1(D, r1, i2);
                    }
                } else {
                    if (Intrinsics.c(liveMatchesFragment.toString(), ((i42) j52Var2).a)) {
                        liveMatchesFragment2.C().U();
                        xeb D2 = liveMatchesFragment2.D();
                        z = un0.z(D2);
                        ip1Var = new ip1(D2, r1, i2);
                    }
                    break;
                }
                xw3.L(z, null, null, ip1Var, 3);
        }
        return null;
    }
}
