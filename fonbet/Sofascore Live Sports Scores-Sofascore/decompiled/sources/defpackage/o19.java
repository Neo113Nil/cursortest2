package defpackage;

import com.facebook.appevents.e;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class o19 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    public /* synthetic */ o19(String str, e eVar, int i) {
        this.a = i;
        this.b = str;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e eVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                if (!cw3.a.contains(q19.class)) {
                    try {
                        q19.a.c(str, eVar);
                        break;
                    } catch (Throwable th) {
                        cw3.a(q19.class, th);
                        return;
                    }
                }
                break;
            default:
                Set set = cw3.a;
                if (!set.contains(aqd.class)) {
                    try {
                        List c = a.c(eVar);
                        wxf wxfVar = wxf.b;
                        if (!set.contains(wxf.class)) {
                            try {
                                c.getClass();
                                wxf.b.A(2, str, c);
                            } catch (Throwable th2) {
                                cw3.a(wxf.class, th2);
                            }
                        }
                        break;
                    } catch (Throwable th3) {
                        cw3.a(aqd.class, th3);
                        return;
                    }
                }
                break;
        }
    }
}
