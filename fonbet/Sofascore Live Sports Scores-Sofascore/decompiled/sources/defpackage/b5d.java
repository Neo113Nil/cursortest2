package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface b5d {
    public static final byte[] a;
    public static final byte[] b;
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

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        a = "Nats-Consumer-Stalled".getBytes(charset);
        b = "Nats-Msg-Size".getBytes(charset);
        c = "Nats-Marker-Reason".getBytes(charset);
        d = "Nats-Stream".getBytes(charset);
        e = "Nats-Sequence".getBytes(charset);
        f = "Nats-Time-Stamp".getBytes(charset);
        g = "Nats-Subject".getBytes(charset);
        h = "Nats-Last-Sequence".getBytes(charset);
        i = "Nats-Num-Pending".getBytes(charset);
        j = "Nats-Pending-Messages".getBytes(charset);
        k = "Nats-Pending-Bytes".getBytes(charset);
        l = "KV-Operation".getBytes(charset);
    }
}
