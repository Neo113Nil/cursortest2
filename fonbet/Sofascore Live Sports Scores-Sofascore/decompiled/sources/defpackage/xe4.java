package defpackage;

import android.net.Uri;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xe4 {
    public static final /* synthetic */ int j = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        i6c.a("media3.datasource");
    }

    public xe4(Uri uri, long j2, int i, byte[] bArr, Map map, long j3, long j4, String str, int i2) {
        z1a.s(j2 + j3 >= 0);
        z1a.s(j3 >= 0);
        z1a.s(j4 > 0 || j4 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j2;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j3;
        this.g = j4;
        this.h = str;
        this.i = i2;
    }

    public final ve4 a() {
        ve4 ve4Var = new ve4();
        ve4Var.a = this.a;
        ve4Var.b = this.b;
        ve4Var.c = this.c;
        ve4Var.d = this.d;
        ve4Var.e = this.e;
        ve4Var.f = this.f;
        ve4Var.g = this.g;
        ve4Var.h = this.h;
        ve4Var.i = this.i;
        return ve4Var;
    }

    public final xe4 b(long j2) {
        long j3 = this.g;
        return c(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    public final xe4 c(long j2, long j3) {
        if (j2 == 0 && this.g == j3) {
            return this;
        }
        return new xe4(this.a, this.b, this.c, this.d, this.e, this.f + j2, j3, this.h, this.i);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.c;
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
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return fc6.h(this.i, U3.j.e, sb);
    }

    public xe4(Uri uri) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }
}
