package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xf3 extends m6k {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ xf3(Object obj, int i) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.m6k
    public final void Z(String str) {
        int i = this.k;
        Object obj = this.l;
        switch (i) {
            case 0:
                ((PrintStream) obj).println((Object) str);
                break;
            default:
                ((PrintWriter) obj).println((Object) str);
                break;
        }
    }
}
