package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class xcc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IOException b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xcc(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = iOException;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                bc5 bc5Var = (bc5) obj4;
                ((ddc) obj3).c(bc5Var.a, bc5Var.b, (kfb) obj2, (l6c) obj, this.b, this.c);
                break;
            default:
                Pair pair = (Pair) obj3;
                ((cn4) ((odc) obj4).b.j).d(((Integer) pair.first).intValue(), (scc) pair.second, (lfb) obj2, (m6c) obj, this.b, this.c);
                break;
        }
    }
}
