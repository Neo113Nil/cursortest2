package defpackage;

import com.sofascore.results.main.fantasy.MainFantasyFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fpb implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainFantasyFragment b;
    public final /* synthetic */ MainFantasyFragment c;

    public /* synthetic */ fpb(MainFantasyFragment mainFantasyFragment, MainFantasyFragment mainFantasyFragment2, int i) {
        this.a = i;
        this.b = mainFantasyFragment;
        this.c = mainFantasyFragment2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (((defpackage.spb) r3).a == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        r2.D().k();
        r2.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (((defpackage.spb) r3).a == false) goto L23;
     */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        MainFantasyFragment mainFantasyFragment = this.b;
        MainFantasyFragment mainFantasyFragment2 = this.c;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (!(j52Var instanceof i42)) {
                    if (j52Var == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.SyncSuccess");
                        break;
                    } else {
                        tpb tpbVar = (tpb) mainFantasyFragment2.D().j.a.getValue();
                        if (tpbVar instanceof spb) {
                            break;
                        }
                    }
                } else {
                    if (Intrinsics.c(mainFantasyFragment.toString(), ((i42) j52Var).a)) {
                        tpb tpbVar2 = (tpb) mainFantasyFragment2.D().j.a.getValue();
                        if (tpbVar2 instanceof spb) {
                            break;
                        }
                    }
                    break;
                }
            default:
                j52 j52Var2 = (j52) obj;
                if (!(j52Var2 instanceof i42)) {
                    if (j52Var2 == null) {
                        yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LogoutSuccess");
                        break;
                    }
                } else {
                    if (Intrinsics.c(mainFantasyFragment.toString(), ((i42) j52Var2).a)) {
                    }
                    break;
                }
                mainFantasyFragment2.D().k();
        }
        return null;
    }
}
