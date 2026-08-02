package defpackage;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.c;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class jyl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractAdapter b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ jyl(AbstractAdapter abstractAdapter, String str, List list, int i) {
        this.a = i;
        this.b = abstractAdapter;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.d;
        String str = this.c;
        AbstractAdapter abstractAdapter = this.b;
        switch (i) {
            case 0:
                c.a(abstractAdapter, str, list);
                break;
            default:
                c.b(abstractAdapter, str, list);
                break;
        }
    }
}
