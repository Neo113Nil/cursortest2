package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface t4d {
    public static final List a = Arrays.asList("nats", "tls", "opentls", "ws", "wss");
    public static final List b = Arrays.asList("tls", "opentls", "wss");
    public static final List c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final int g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final List r;

    static {
        List asList = Arrays.asList("ws", "wss");
        c = asList;
        d = new byte[0];
        Charset charset = StandardCharsets.ISO_8859_1;
        byte[] bytes = "NATS/1.0".getBytes(charset);
        e = bytes;
        f = "NATS/1.0\r\n".getBytes(charset);
        ":".getBytes(charset);
        "\r\n".getBytes(charset);
        g = bytes.length;
        h = "PING".getBytes();
        i = "PONG".getBytes();
        byte[] bytes2 = "PUB ".getBytes(charset);
        j = bytes2;
        byte[] bytes3 = "HPUB ".getBytes(charset);
        k = bytes3;
        byte[] bytes4 = "CONNECT ".getBytes();
        l = bytes4;
        byte[] bytes5 = "SUB ".getBytes();
        m = bytes5;
        byte[] bytes6 = "UNSUB ".getBytes();
        n = bytes6;
        o = bytes2.length;
        p = bytes3.length;
        q = bytes4.length;
        int length = bytes5.length;
        int length2 = bytes6.length;
        r = asList;
    }
}
