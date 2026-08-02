package defpackage;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.c;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class myl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdapterBaseInterface b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ myl(AdapterBaseInterface adapterBaseInterface, String str, List list, int i) {
        this.a = i;
        this.b = adapterBaseInterface;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.d;
        String str = this.c;
        AdapterBaseInterface adapterBaseInterface = this.b;
        switch (i) {
            case 0:
                c.a(adapterBaseInterface, str, list);
                break;
            default:
                c.b(adapterBaseInterface, str, list);
                break;
        }
    }
}
