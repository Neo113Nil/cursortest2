package defpackage;

import com.google.android.gms.common.util.BiConsumer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ki3 {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final di3 c;
    public final di3 d;

    static {
        Charset.forName(C.UTF8_NAME);
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public ki3(Executor executor, di3 di3Var, di3 di3Var2) {
        this.b = executor;
        this.c = di3Var;
        this.d = di3Var2;
    }

    public static HashSet b(di3 di3Var) {
        HashSet hashSet = new HashSet();
        fi3 c = di3Var.c();
        if (c != null) {
            Iterator<String> keys = c.b.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
        }
        return hashSet;
    }

    public static String c(di3 di3Var, String str) {
        fi3 c = di3Var.c();
        if (c == null) {
            return null;
        }
        try {
            return c.b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(String str, fi3 fi3Var) {
        if (fi3Var == null) {
            return;
        }
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    this.b.execute(new p3(9, (BiConsumer) it.next(), str, fi3Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
