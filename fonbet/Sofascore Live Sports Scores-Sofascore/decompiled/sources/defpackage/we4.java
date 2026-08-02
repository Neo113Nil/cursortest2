package defpackage;

import android.net.Uri;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class we4 {
    public static final /* synthetic */ int h = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final int g;

    static {
        jh6.a("goog.exo.datasource");
    }

    public we4(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        qx9.r(j >= 0);
        qx9.r(j >= 0);
        qx9.r(j2 > 0 || j2 == -1);
        this.a = uri;
        this.b = i;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.b;
        if (i == 1) {
            str = C4094gc.a;
        } else if (i == 2) {
            str = C4094gc.b;
        } else {
            if (i != 3) {
                zzl.s();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", null, ");
        return fc6.h(this.g, U3.j.e, sb);
    }
}
