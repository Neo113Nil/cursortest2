package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jhg extends y0 {
    public Timer d;
    public blg e;
    public long f;
    public ArrayList g;
    public long h;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ("viewcount".equals(r4) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(clg clgVar, double d, long j) {
        ihg ihgVar = clgVar.b;
        if (d < ihgVar.d || j < 0) {
            clgVar.c = 0L;
            return false;
        }
        long j2 = clgVar.c + j;
        clgVar.c = j2;
        if (j2 < ihgVar.c) {
            return false;
        }
        fjg c = fjg.c();
        String str = ihgVar.a;
        c.f(1);
        String str2 = ihgVar.a;
        HashMap hashMap = new HashMap();
        if (this.h >= 0) {
            lig ligVar = lig.VIEWABLE;
            if (!"Viewable".equals(str2)) {
                List list = jig.a;
            }
            hashMap.put("num1={0}&", String.valueOf(Math.max(this.h, 0L) / 1000.0d));
        }
        q(ihgVar, hashMap, new HashMap());
        return true;
    }
}
