package defpackage;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.common.util.d;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ztk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ ztk(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                str.getClass();
                HashSet hashSet = auk.e;
                cga.K(str2, str, new float[0]);
                break;
            case 1:
                c.a(str2, str);
                break;
            default:
                d.b(str2, str);
                break;
        }
    }
}
