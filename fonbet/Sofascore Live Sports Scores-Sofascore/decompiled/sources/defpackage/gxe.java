package defpackage;

import com.sofascore.results.transfers.PlayerTransfersActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gxe implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gxe(long j, boolean z, xtc xtcVar, int i) {
        this.b = j;
        this.c = z;
        this.e = xtcVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                ((Integer) obj2).getClass();
                int i3 = PlayerTransfersActivity.R;
                ((PlayerTransfersActivity) obj3).M(this.b, this.c, of3Var, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                long j = this.b;
                boolean z = this.c;
                hxk.a(j, z, (xtc) obj3, (of3) obj, K);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gxe(PlayerTransfersActivity playerTransfersActivity, long j, boolean z, int i) {
        this.e = playerTransfersActivity;
        this.b = j;
        this.c = z;
        this.d = i;
    }
}
