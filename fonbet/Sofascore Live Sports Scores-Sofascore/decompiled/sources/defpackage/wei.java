package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wei {
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final HashMap s;
    public final int a;
    public final String b;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        c = "FlowControl Request".getBytes(charset);
        d = "Idle Heartbeat".getBytes(charset);
        e = "No Responders Available For Request".getBytes(charset);
        f = "EOB".getBytes(charset);
        "423".getBytes(charset);
        g = "Bad Request".getBytes(charset);
        h = "No Messages".getBytes(charset);
        i = "Consumer Deleted".getBytes(charset);
        j = "Consumer is push based".getBytes(charset);
        k = "Message Size Exceeds MaxBytes".getBytes(charset);
        l = "Exceeded MaxWaiting".getBytes(charset);
        m = "Exceeded MaxRequestBatch".getBytes(charset);
        n = "Exceeded MaxRequestExpires".getBytes(charset);
        o = "Exceeded MaxRequestMaxBytes".getBytes(charset);
        p = "Batch Completed".getBytes(charset);
        q = "Server Shutdown".getBytes(charset);
        r = "Leadership Change".getBytes(charset);
        new wei(204, "EOB");
        new wei(404, "Timeout or No Messages");
        HashMap hashMap = new HashMap();
        s = hashMap;
        hashMap.put(Integer.valueOf(PglCryptUtils.COMPRESS_FAILED), "No Responders Available For Request");
    }

    public wei(int i2, String str) {
        this.a = i2;
        if (str == null && (str = (String) s.get(Integer.valueOf(i2))) == null) {
            str = ljg.j(i2, "Server Status Message: ");
        }
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Status{code=");
        sb.append(this.a);
        sb.append(", message='");
        return mz1.o(sb, this.b, "'}");
    }
}
