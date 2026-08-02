package zg;

import Q2.EnumC1497h;
import Q2.L;
import Q2.w;
import android.util.Log;
import androidx.work.b;
import com.zoho.messenger.api.WebSocketKeepAliveWorker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import javax.net.ssl.SSLContext;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import ug.AbstractC6573a;
import vg.C6689a;

/* loaded from: classes4.dex */
public class g extends AbstractC6991a {

    /* renamed from: B, reason: collision with root package name */
    public static SSLContext f69143B;

    /* renamed from: d, reason: collision with root package name */
    public final URI f69145d;

    /* renamed from: e, reason: collision with root package name */
    public zg.c f69146e;

    /* renamed from: i, reason: collision with root package name */
    public final String f69150i;

    /* renamed from: j, reason: collision with root package name */
    public int f69151j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f69152k;

    /* renamed from: p, reason: collision with root package name */
    public final Inflater f69157p;

    /* renamed from: q, reason: collision with root package name */
    public final Deflater f69158q;

    /* renamed from: r, reason: collision with root package name */
    public UUID f69159r;

    /* renamed from: s, reason: collision with root package name */
    public d f69160s;

    /* renamed from: t, reason: collision with root package name */
    public Thread f69161t;

    /* renamed from: u, reason: collision with root package name */
    public Thread f69162u;

    /* renamed from: v, reason: collision with root package name */
    public f f69163v;

    /* renamed from: w, reason: collision with root package name */
    public b f69164w;

    /* renamed from: f, reason: collision with root package name */
    public long f69147f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final CharBuffer f69148g = CharBuffer.allocate(4096);

    /* renamed from: h, reason: collision with root package name */
    public String f69149h = null;

    /* renamed from: l, reason: collision with root package name */
    public int f69153l = 0;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f69154m = null;

    /* renamed from: n, reason: collision with root package name */
    public OutputStream f69155n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f69156o = false;

    /* renamed from: x, reason: collision with root package name */
    public LinkedBlockingQueue f69165x = new LinkedBlockingQueue();

    /* renamed from: y, reason: collision with root package name */
    public LinkedBlockingQueue f69166y = new LinkedBlockingQueue();

    /* renamed from: z, reason: collision with root package name */
    public final SecureRandom f69167z = new SecureRandom();

    /* renamed from: A, reason: collision with root package name */
    public boolean f69144A = false;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f69168a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap f69169b = new HashMap();

        public a(int i10) {
            this.f69168a = i10;
        }

        public void a() {
            this.f69169b = null;
        }

        public Object b(String str) {
            return this.f69169b.get(str);
        }

        public int c() {
            return this.f69168a;
        }

        public void d(String str, Object obj) {
            this.f69169b.put(str, obj);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void a(a aVar) {
            if (aVar == null) {
                return;
            }
            try {
                int c10 = aVar.c();
                if (c10 == 1) {
                    g.this.f69146e.c();
                } else {
                    if (c10 != 2) {
                        return;
                    }
                    g.this.f69146e.onMessage((String) aVar.b("msg"));
                }
            } catch (Exception e10) {
                Log.e("WMS", Log.getStackTraceString(e10));
            }
        }

        public void b() {
            if (g.this.f69166y.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            g.this.f69166y.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((a) it.next());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!g.this.f69144A) {
                try {
                    a aVar = (a) g.this.f69166y.take();
                    a(aVar);
                    aVar.a();
                } catch (Exception e10) {
                    Log.e("WMS", Log.getStackTraceString(e10));
                }
            }
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f69172a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f69173b = 0;

        /* renamed from: c, reason: collision with root package name */
        public boolean f69174c = true;

        /* renamed from: d, reason: collision with root package name */
        public boolean f69175d = false;
        private byte[] data;

        public c() {
        }

        public void a() {
            this.data = null;
        }

        public String b() {
            try {
                return new String(this.data, "UTF-8");
            } catch (Exception e10) {
                throw new C6689a("Unable to get text : " + e10.getMessage());
            }
        }

        public boolean c() {
            return this.f69173b == 8;
        }

        public boolean d() {
            return this.f69173b == 1;
        }

        public int e() {
            try {
                byte P10 = g.this.P();
                boolean z10 = (P10 & ByteCompanionObject.MIN_VALUE) != 0;
                this.f69174c = z10;
                this.f69175d = z10 && !((P10 & 8) != 0) && ((P10 & 64) != 0);
                int i10 = P10 & 15;
                this.f69173b = i10;
                if (i10 == 8) {
                    return 0;
                }
                byte P11 = g.this.P();
                if (P11 > 0 && P11 < 126) {
                    this.f69172a = P11;
                } else if (P11 == 126) {
                    this.f69172a = (int) f(2);
                } else if (P11 == Byte.MAX_VALUE) {
                    this.f69172a = (int) f(8);
                }
                if (this.f69172a < 1) {
                    return 0;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.f69172a);
                for (int i11 = 0; i11 < this.f69172a; i11++) {
                    byteArrayOutputStream.write(g.this.P());
                }
                if (byteArrayOutputStream.size() != this.f69172a) {
                    throw new C6689a("Corrupted Stream");
                }
                if (this.f69175d && g.this.f69156o) {
                    this.data = g.this.N(byteArrayOutputStream.toByteArray());
                } else {
                    this.data = byteArrayOutputStream.toByteArray();
                }
                return this.data.length;
            } catch (C6689a e10) {
                throw e10;
            } catch (Exception e11) {
                throw new C6689a("Exception : " + e11.getMessage());
            }
        }

        public final long f(int i10) {
            long j10 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    j10 = (j10 << 8) | (g.this.P() & UByte.MAX_VALUE);
                } catch (C6689a unused) {
                    throw new C6689a("-1");
                }
            }
            return j10;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g.this.J();
                g.this.K();
                g.this.f69153l = 1;
                g.this.f69163v = g.this.new f();
                g.this.f69163v.start();
                g.this.f69166y.put(g.this.new a(1));
                while (true) {
                    if (g.this.f69144A) {
                        break;
                    }
                    c cVar = g.this.new c();
                    int e10 = cVar.e();
                    if (cVar.c()) {
                        g.this.f69153l = -1;
                        break;
                    }
                    if (e10 < 0) {
                        g.this.f69153l = -3;
                        break;
                    }
                    g.this.f69147f = System.currentTimeMillis();
                    if (e10 != 0) {
                        if (cVar.d()) {
                            a aVar = g.this.new a(2);
                            aVar.d("msg", cVar.b());
                            g.this.f69166y.put(aVar);
                        }
                        cVar.a();
                    }
                }
            } catch (Exception e11) {
                Log.e("WMS", Log.getStackTraceString(e11));
                g.this.f69153l = -2;
            }
            g.this.M();
        }
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public byte f69178a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f69179b;

        /* renamed from: c, reason: collision with root package name */
        public String f69180c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f69181d;
        private byte[] data;

        public e(g gVar, int i10, String str) {
            this(i10, str, true);
        }

        public synchronized byte[] a() {
            try {
                if (!this.f69181d) {
                    this.data = c();
                }
                this.f69181d = true;
            } catch (Throwable th2) {
                throw th2;
            }
            return this.data;
        }

        public boolean b() {
            return this.f69178a == 8;
        }

        public byte[] c() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.data.length + 10);
                if (g.this.f69156o) {
                    byteArrayOutputStream.write((byte) (this.f69178a | 192));
                    this.data = g.this.I(this.data);
                } else {
                    byteArrayOutputStream.write((byte) (this.f69178a | ByteCompanionObject.MIN_VALUE));
                }
                int length = this.data.length;
                int i10 = 0;
                if (length < 126) {
                    if (this.f69179b) {
                        length |= 128;
                    }
                    byteArrayOutputStream.write((byte) length);
                } else {
                    int i11 = 255;
                    if (length <= 65535) {
                        byteArrayOutputStream.write((byte) (this.f69179b ? 254 : 126));
                        byteArrayOutputStream.write(new byte[]{(byte) (length >>> 8), (byte) (length & 255)});
                    } else if (length > 65535) {
                        if (!this.f69179b) {
                            i11 = 127;
                        }
                        byteArrayOutputStream.write((byte) i11);
                        byteArrayOutputStream.write(new byte[]{(byte) (length >>> 56), (byte) (length >>> 48), (byte) (length >>> 40), (byte) (length >>> 32), (byte) (length >>> 24), (byte) (length >>> 16), (byte) (length >>> 8), (byte) length});
                    }
                }
                if (this.f69179b) {
                    byte[] L10 = g.this.L(4);
                    byteArrayOutputStream.write(L10);
                    while (true) {
                        byte[] bArr = this.data;
                        if (i10 >= bArr.length) {
                            break;
                        }
                        bArr[i10] = (byte) (bArr[i10] ^ L10[i10 % 4]);
                        i10++;
                    }
                }
                byteArrayOutputStream.write(this.data);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.data = byteArray;
                return byteArray;
            } catch (Exception e10) {
                throw new C6689a("Unable to prepare write frame : " + e10.getMessage());
            }
        }

        public e(int i10, String str, boolean z10) {
            this.f69181d = false;
            try {
                this.f69178a = (byte) i10;
                this.f69179b = z10;
                this.f69180c = str;
                this.data = str.getBytes("UTF-8");
            } catch (Exception e10) {
                throw new C6689a("Unable to prepare write frame : " + e10.getMessage());
            }
        }
    }

    public class f extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public long f69183a = 0;

        public f() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!g.this.f69144A) {
                try {
                    e eVar = (e) g.this.f69165x.poll(15L, TimeUnit.SECONDS);
                    if (eVar != null || g.this.f()) {
                        if (eVar != null) {
                            g.this.Q(eVar.a());
                            if (eVar.b()) {
                                g.this.f69153l = -1;
                                try {
                                    Thread.sleep(500L);
                                    break;
                                } catch (Exception e10) {
                                    Log.e("WMS", Log.getStackTraceString(e10));
                                }
                            }
                        }
                    } else if (System.currentTimeMillis() - this.f69183a > 15000) {
                        this.f69183a = System.currentTimeMillis();
                        g.this.Q(new e(g.this, 1, "-").a());
                    }
                } catch (InterruptedException e11) {
                    Log.e("WMS", Log.getStackTraceString(e11));
                } catch (Exception e12) {
                    Log.e("WMS", Log.getStackTraceString(e12));
                    g.this.f69153l = -2;
                }
                if (System.currentTimeMillis() - g.this.f69147f > 45000) {
                    throw new C6689a("Network Timedout");
                }
            }
            g.this.M();
        }
    }

    static {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            f69143B = sSLContext;
            sSLContext.init(null, null, null);
        } catch (KeyManagementException | NoSuchAlgorithmException e10) {
            Log.e("WMS", Log.getStackTraceString(e10));
        }
    }

    public g(String str) {
        try {
            URI uri = new URI(str);
            this.f69145d = uri;
            if (!uri.getScheme().equals("ws") && !uri.getScheme().equals("wss")) {
                throw new C6689a("Invalid url");
            }
            boolean equals = uri.getScheme().equals("wss");
            this.f69152k = equals;
            int port = uri.getPort();
            this.f69151j = port;
            if (port == -1) {
                if (equals) {
                    this.f69151j = 443;
                } else {
                    this.f69151j = 80;
                }
            }
            this.f69150i = uri.getHost();
            this.f69157p = new Inflater(true);
            this.f69158q = new Deflater(9, true);
        } catch (URISyntaxException unused) {
            throw new C6689a("Invalid Url");
        } catch (Exception e10) {
            throw new C6689a("Exception : " + e10.getMessage());
        }
    }

    private void H(String str, String str2) {
        this.f69148g.put(str);
        this.f69148g.put(": ");
        this.f69148g.put(str2);
        this.f69148g.put("\r\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        try {
            this.f69146e.b();
            Socket createSocket = this.f69152k ? f69143B.getSocketFactory().createSocket(this.f69150i, this.f69151j) : new Socket(this.f69150i, this.f69151j);
            this.f69154m = createSocket.getInputStream();
            this.f69155n = createSocket.getOutputStream();
        } catch (SecurityException e10) {
            throw new C6689a("Security Exception : " + e10);
        } catch (UnknownHostException e11) {
            throw new C6689a("Invalid Host : " + e11);
        } catch (IOException e12) {
            throw new C6689a("IO Exception : " + e12);
        } catch (Exception e13) {
            throw new C6689a("Exception : " + e13.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        try {
            this.f69148g.clear();
            String path = this.f69145d.getPath();
            if (path == null) {
                path = "/";
            } else if (this.f69145d.getQuery() != null) {
                path = path + "?" + this.f69145d.getRawQuery();
            }
            this.f69148g.put("GET " + path + " HTTP/1.1\r\n");
            H("Host", this.f69150i);
            H("Upgrade", "websocket");
            H("Connection", "Upgrade");
            H("Sec-WebSocket-Version", "13");
            if (this.f69156o) {
                H("Sec-WebSocket-Extensions", "permessage-deflate");
            }
            H("Sec-WebSocket-Key", AbstractC6573a.b(L(16)));
            HashMap a10 = this.f69146e.a();
            for (String str : a10.keySet()) {
                String str2 = (String) a10.get(str);
                if (str2 != null && !str2.trim().isEmpty()) {
                    H(str, str2);
                }
            }
            String str3 = this.f69149h;
            if (str3 != null) {
                H("Cookie", str3);
            }
            this.f69148g.put("\r\n");
            this.f69148g.flip();
            Q(this.f69148g.toString().getBytes("UTF-8"));
            byte[] bArr = new byte[1024];
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            do {
                bArr[i10] = P();
                int i11 = i10 + 1;
                if (bArr[i10] == 10 && bArr[i10 - 1] == 13) {
                    String str4 = new String(bArr, "UTF-8");
                    if (str4.trim().equals("")) {
                        if (arrayList.size() == 0) {
                            throw new C6689a("Insuffcient response header");
                        }
                        try {
                            int parseInt = Integer.parseInt(((String) arrayList.remove(0)).substring(9, 12));
                            if (parseInt != 101) {
                                throw new C6689a("Invalid status code : " + parseInt);
                            }
                            try {
                                HashMap hashMap = new HashMap();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    String[] split = ((String) it.next()).split(": ", 2);
                                    hashMap.put(split[0], split[1]);
                                }
                                if (!((String) hashMap.get("Upgrade")).toLowerCase().equalsIgnoreCase("websocket") || !((String) hashMap.get("Connection")).equalsIgnoreCase("Upgrade")) {
                                    throw new C6689a("Headers on upgrade not found");
                                }
                                if (hashMap.containsKey("Sec-Websocket-Extensions") && ((String) hashMap.get("Sec-Websocket-Extensions")).toLowerCase().equals("permessage-deflate")) {
                                    this.f69156o = true;
                                    return;
                                }
                                return;
                            } catch (C6689a e10) {
                                throw e10;
                            } catch (Exception e11) {
                                throw new C6689a("Unable to verify response header : " + e11.getMessage());
                            }
                        } catch (C6689a e12) {
                            throw e12;
                        } catch (Exception unused) {
                            throw new C6689a("Invalid Status message in response");
                        }
                    }
                    arrayList.add(str4.trim());
                    bArr = new byte[1024];
                    i10 = 0;
                } else {
                    i10 = i11;
                }
                if (i10 >= 1020) {
                    throw new C6689a("Header too long : " + new String(bArr, "UTF-8"));
                }
            } while (arrayList.size() <= 10);
            throw new C6689a("Too many headers : " + arrayList);
        } catch (IOException e13) {
            throw new C6689a("IOException : " + e13.getMessage());
        } catch (C6689a e14) {
            throw e14;
        } catch (Exception e15) {
            throw new C6689a("Exception doHandshake : " + e15.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] L(int i10) {
        byte[] bArr = new byte[i10];
        this.f69167z.nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte P() {
        try {
            byte[] bArr = new byte[1];
            if (this.f69154m.read(bArr) != -1) {
                return bArr[0];
            }
            throw new C6689a("Stream Closed");
        } catch (IOException unused) {
            throw new C6689a("IOException on read");
        } catch (C6689a e10) {
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(byte[] bArr) {
        try {
            this.f69155n.write(bArr);
            this.f69155n.flush();
        } catch (IOException unused) {
            throw new C6689a("IOException on write");
        }
    }

    public static /* synthetic */ Unit n(g gVar, L l10) {
        gVar.getClass();
        w wVar = (w) ((w.a) new w.a(WebSocketKeepAliveWorker.class).i(new b.a().f("connectionIdentifier", gVar.f69124c).a())).a();
        String str = gVar.f69124c;
        if (str != null && !str.isEmpty()) {
            gVar.f69159r = wVar.a();
            l10.d(gVar.f69124c, EnumC1497h.REPLACE, wVar);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit o(g gVar) {
        gVar.getClass();
        gVar.f69161t = new Thread(gVar.f69160s);
        gVar.f69162u = new Thread(gVar.f69164w);
        gVar.f69161t.start();
        gVar.f69162u.start();
        return Unit.INSTANCE;
    }

    public final byte[] I(byte[] bArr) {
        this.f69158q.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int deflate = this.f69158q.deflate(bArr2, 0, 1024, 2);
            if (deflate <= 0) {
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocate = ByteBuffer.allocate(byteArray.length - 4);
                allocate.put(byteArray, 0, byteArray.length - 4);
                return allocate.array();
            }
            byteArrayOutputStream.write(bArr2, 0, deflate);
        }
    }

    public final synchronized void M() {
        if (this.f69144A) {
            return;
        }
        this.f69144A = true;
        try {
            if (this.f69159r != null) {
                L.g().a(this.f69159r);
            }
        } catch (Exception e10) {
            Log.e("WMS", Log.getStackTraceString(e10));
        }
        try {
            Thread thread = this.f69161t;
            if (thread != null) {
                thread.interrupt();
            }
        } catch (Exception e11) {
            Log.e("WMS", Log.getStackTraceString(e11));
        }
        try {
            Thread thread2 = this.f69162u;
            if (thread2 != null) {
                thread2.interrupt();
            }
        } catch (Exception e12) {
            Log.e("WMS", Log.getStackTraceString(e12));
        }
        try {
            this.f69164w.b();
        } catch (Exception e13) {
            Log.e("WMS", Log.getStackTraceString(e13));
        }
        try {
            this.f69163v.interrupt();
        } catch (Exception e14) {
            Log.e("WMS", Log.getStackTraceString(e14));
        }
        try {
            this.f69155n.close();
        } catch (Exception e15) {
            Log.e("WMS", Log.getStackTraceString(e15));
        }
        try {
            this.f69154m.close();
        } catch (Exception e16) {
            Log.e("WMS", Log.getStackTraceString(e16));
        }
        try {
            try {
                this.f69153l = -1;
                this.f69146e.d(-1);
                this.f69165x = null;
                this.f69166y = null;
                this.f69146e = null;
                this.f69159r = null;
            } catch (Exception e17) {
                Log.e("WMS", Log.getStackTraceString(e17));
                this.f69165x = null;
                this.f69166y = null;
                this.f69146e = null;
                this.f69159r = null;
            }
            this.f69161t = null;
            this.f69163v = null;
        } catch (Throwable th2) {
            this.f69165x = null;
            this.f69166y = null;
            this.f69146e = null;
            this.f69159r = null;
            this.f69161t = null;
            this.f69163v = null;
            throw th2;
        }
    }

    public final byte[] N(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 4);
        allocate.put(bArr);
        allocate.put(new byte[]{0, 0, -1, -1});
        byte[] array = allocate.array();
        this.f69157p.setInput(array);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(array.length);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int inflate = this.f69157p.inflate(bArr2, 0, 1024);
            if (inflate <= 0) {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, inflate);
        }
    }

    public boolean O() {
        return this.f69153l == 1;
    }

    @Override // zg.AbstractC6991a
    public void a(String str, String str2) {
        if (this.f69149h == null) {
            this.f69149h = str + "=" + str2;
            return;
        }
        this.f69149h += "; " + str + "=" + str2;
    }

    @Override // zg.AbstractC6991a
    public void c() {
        try {
            if (this.f69153l != 1) {
                M();
            } else {
                this.f69153l = -1;
                this.f69165x.put(new e(this, 8, ""));
            }
        } catch (Exception e10) {
            Log.e("WMS", Log.getStackTraceString(e10));
        }
    }

    @Override // zg.AbstractC6991a
    public void d() {
        if (this.f69146e == null) {
            throw new C6689a("WebSocket Handler not found");
        }
        if (this.f69150i == null) {
            throw new C6689a("Invalid host " + this.f69150i);
        }
        if (this.f69151j >= 0) {
            this.f69160s = new d();
            this.f69164w = new b();
            com.zoho.messenger.api.g.g("WMS", this.f69124c, new Function1() { // from class: zg.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.n(g.this, (L) obj);
                }
            }, new Function0() { // from class: zg.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.o(g.this);
                }
            });
        } else {
            throw new C6689a("Invalid port " + this.f69151j);
        }
    }

    @Override // zg.AbstractC6991a
    public void e() {
        if (O()) {
            try {
                this.f69153l = 2;
                this.f69165x.put(new e(this, 1, "."));
            } catch (Exception e10) {
                Log.e("WMS", Log.getStackTraceString(e10));
            }
        }
    }

    @Override // zg.AbstractC6991a
    public boolean f() {
        return this.f69153l == 2;
    }

    @Override // zg.AbstractC6991a
    public void g() {
        if (f()) {
            try {
                this.f69153l = 1;
                this.f69165x.put(new e(this, 1, ","));
            } catch (Exception e10) {
                Log.e("WMS", Log.getStackTraceString(e10));
            }
        }
    }

    @Override // zg.AbstractC6991a
    public void h() {
        try {
            this.f69165x.put(new e(this, 1, "-"));
        } catch (Exception e10) {
            Log.e("WMS", Log.getStackTraceString(e10));
        }
    }

    @Override // zg.AbstractC6991a
    public void i(boolean z10) {
        this.f69156o = z10;
    }

    @Override // zg.AbstractC6991a
    public void j(zg.c cVar) {
        this.f69146e = cVar;
    }

    @Override // zg.AbstractC6991a
    public void k() {
        this.f69164w.run();
    }

    @Override // zg.AbstractC6991a
    public void l() {
        this.f69160s.run();
    }

    @Override // zg.AbstractC6991a
    public boolean m(String str) {
        if (this.f69144A) {
            throw new C6689a("WebSocket closed");
        }
        try {
            this.f69165x.put(new e(this, 1, str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
