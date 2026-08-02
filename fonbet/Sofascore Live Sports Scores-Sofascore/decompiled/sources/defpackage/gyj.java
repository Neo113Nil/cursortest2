package defpackage;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gyj {
    public static volatile rc4 e;
    public final wy2 a;
    public final wy2 b;
    public final is4 c;
    public final ji3 d;

    public gyj(wy2 wy2Var, wy2 wy2Var2, is4 is4Var, ji3 ji3Var, ujg ujgVar) {
        this.a = wy2Var;
        this.b = wy2Var2;
        this.c = is4Var;
        this.d = ji3Var;
        ((Executor) ujgVar.b).execute(new t4f(ujgVar, 25));
    }

    public static gyj a() {
        rc4 rc4Var = e;
        if (rc4Var != null) {
            return (gyj) rc4Var.f.get();
        }
        a70.r("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (gyj.class) {
                try {
                    if (e == null) {
                        qc4 qc4Var = new qc4();
                        context.getClass();
                        qc4Var.b = context;
                        e = qc4Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final xxj c(zc2 zc2Var) {
        byte[] bytes;
        Set unmodifiableSet = zc2Var instanceof zc2 ? Collections.unmodifiableSet(zc2.d) : Collections.singleton(new kn5("proto"));
        hcc a = jv0.a();
        zc2Var.getClass();
        a.b = "cct";
        String str = zc2Var.a;
        String str2 = zc2Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = fc6.n("1$", str, "\\", str2).getBytes(Charset.forName(C.UTF8_NAME));
        }
        a.c = bytes;
        return new xxj(unmodifiableSet, a.H(), this);
    }
}
