package defpackage;

import android.content.Context;
import com.ironsource.Ae;
import com.ironsource.C4328te;
import com.ironsource.InterfaceC4292re;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ll implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ C4328te c;
    public final /* synthetic */ InterfaceC4292re d;

    public /* synthetic */ ll(Context context, C4328te c4328te, InterfaceC4292re interfaceC4292re, int i) {
        this.a = i;
        this.b = context;
        this.c = c4328te;
        this.d = interfaceC4292re;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Ae.b(this.b, this.c, this.d);
                break;
            default:
                Ae.d(this.b, this.c, this.d);
                break;
        }
    }
}
