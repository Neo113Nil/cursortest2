package com.plaid.internal;

import android.text.TextUtils;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.VoiceURLConnection;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.plaid.internal.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3749t1 {

    /* renamed from: h, reason: collision with root package name */
    public static final C3784x0 f41067h;

    /* renamed from: a, reason: collision with root package name */
    public final String f41068a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f41069b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f41070c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f41071d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41072e;

    /* renamed from: f, reason: collision with root package name */
    public String f41073f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41074g;

    /* renamed from: com.plaid.internal.t1$a */
    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if ("host".equals(str3)) {
                return -1;
            }
            if ("host".equals(str4)) {
                return 1;
            }
            return str3.compareTo(str4);
        }
    }

    /* renamed from: com.plaid.internal.t1$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f41075a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f41076b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f41077c;

        public b(String str, boolean z10) {
            this.f41075a = str;
            this.f41076b = z10;
            this.f41077c = z10 ? AbstractC3767v1.a(str) : str.getBytes(StandardCharsets.UTF_8);
        }
    }

    static {
        W3 w32 = Z3.f39803a;
        f41067h = new C3784x0("http-request");
    }

    public C3749t1(URL url, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        this.f41070c = hashMap;
        this.f41068a = "HTTP/1.1";
        this.f41072e = str.toUpperCase();
        this.f41069b = url;
        this.f41071d = AbstractC3767v1.b(url.toString());
        if (url.getPort() == -1) {
            str2 = url.getHost();
        } else {
            str2 = url.getHost() + ":" + url.getPort();
        }
        hashMap.put("host".toLowerCase(), str2);
        hashMap.put(EventGroupType.CONNECTION_EVENT_GROUP.toLowerCase(), "close");
        hashMap.put("cache-control".toLowerCase(), "no-cache");
        hashMap.put("accept".toLowerCase(), "*/*");
        hashMap.put("accept-encoding".toLowerCase(), (String) C3615e1.f40575c.a("http.accept-encoding", "gzip", String.class));
    }

    public static void a(OutputStream outputStream, b bVar) {
        if (bVar.f41077c.length > 0) {
            f41067h.a(W3.TRACE, bVar.f41076b ? "Socket.gzip(`%s`)" : "Socket.write(`%s`)", bVar.f41075a.trim());
            outputStream.write(bVar.f41077c);
        }
    }

    public final void a(OutputStream outputStream) {
        b bVar = new b("", false);
        if (this.f41072e.equals("GET")) {
            f41067h.a(W3.TRACE, "Sending GET Request", new Object[0]);
        } else if (this.f41072e.equals(VoiceURLConnection.METHOD_TYPE_POST)) {
            f41067h.a(W3.TRACE, "Sending POST Request", new Object[0]);
            String str = this.f41073f;
            if (str != null && str.length() > 0) {
                bVar = new b(this.f41073f, this.f41074g);
                if (this.f41074g) {
                    this.f41070c.put("content-encoding".toLowerCase(), "gzip");
                } else {
                    this.f41070c.remove("content-encoding");
                }
                this.f41070c.put("content-length".toLowerCase(), String.valueOf(bVar.f41077c.length));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41072e);
        sb2.append(" ");
        String path = this.f41069b.getPath();
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry entry : this.f41071d.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb3.append("&");
            }
            sb3.append((String) entry.getKey());
            sb3.append("=");
            try {
                sb3.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        String sb4 = sb3.toString();
        if (sb4.length() > 0) {
            path = this.f41069b.getPath() + "?" + sb4;
        }
        if (path == null || path.length() == 0) {
            path = "/";
        }
        sb2.append(path);
        sb2.append(" ");
        sb2.append(this.f41068a);
        sb2.append("\r\n");
        a(outputStream, new b(sb2.toString(), false));
        TreeSet treeSet = new TreeSet(new a());
        treeSet.addAll(this.f41070c.keySet());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String[] split = str2.toLowerCase().split("-");
            LinkedList linkedList = new LinkedList();
            for (String str3 : split) {
                if (str3.length() > 0) {
                    str3 = str3.substring(0, 1).toUpperCase() + str3.substring(1);
                }
                linkedList.add(str3);
            }
            a(outputStream, new b(TextUtils.join("-", linkedList) + ": " + ((String) this.f41070c.get(str2)) + "\r\n", false));
        }
        a(outputStream, new b("\r\n", false));
        a(outputStream, bVar);
        outputStream.flush();
    }
}
