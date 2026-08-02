package defpackage;

import android.os.Build;
import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jt4 implements m3f {
    public final /* synthetic */ iu4 a;
    public final /* synthetic */ wt4 b;

    public /* synthetic */ jt4(iu4 iu4Var, wt4 wt4Var) {
        this.a = iu4Var;
        this.b = wt4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r7.b != false) goto L42;
     */
    @Override // defpackage.m3f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        gxh gxhVar;
        b bVar = (b) obj;
        iu4 iu4Var = this.a;
        iu4Var.getClass();
        if (this.b.C && ((bool = iu4Var.j) == null || !bool.booleanValue())) {
            int i = bVar.G;
            if (i != -1 && i > 2) {
                String str = bVar.o;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                gxh gxhVar2 = iu4Var.h;
                                if (gxhVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (gxhVar = iu4Var.h) == null || !gxhVar.b || !gxhVar.c() || !iu4Var.h.d() || !iu4Var.h.a(iu4Var.i, bVar)) {
                                return false;
                            }
                            break;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                }
                return false;
            }
        }
        return true;
    }
}
