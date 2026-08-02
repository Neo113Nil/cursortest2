package wg;

import android.content.Context;
import android.util.Log;
import dg.C4073a;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import qg.AbstractC6171b;
import ug.AbstractC6573a;
import ug.AbstractC6574b;
import ug.AbstractC6576d;
import vg.C6689a;
import xg.AbstractC6824a;
import xg.C6825b;
import zendesk.core.Constants;
import zg.AbstractC6991a;
import zg.AbstractC6992b;

/* renamed from: wg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6746a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6747b f67682a;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC6991a f67687f;

    /* renamed from: i, reason: collision with root package name */
    public long f67690i;

    /* renamed from: l, reason: collision with root package name */
    public b f67693l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC6824a f67694m;

    /* renamed from: n, reason: collision with root package name */
    public String f67695n;

    /* renamed from: o, reason: collision with root package name */
    public ug.e f67696o;

    /* renamed from: p, reason: collision with root package name */
    public long f67697p;

    /* renamed from: q, reason: collision with root package name */
    public long f67698q;

    /* renamed from: b, reason: collision with root package name */
    public String f67683b = "IAMAGENTTICKET";

    /* renamed from: c, reason: collision with root package name */
    public int f67684c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f67685d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final c f67686e = new c();

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f67688g = new ConcurrentHashMap(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, 0.8f, 32);

    /* renamed from: h, reason: collision with root package name */
    public final k f67689h = new k(this);

    /* renamed from: j, reason: collision with root package name */
    public ExecutorService f67691j = Executors.newFixedThreadPool(20);

    /* renamed from: k, reason: collision with root package name */
    public final LinkedBlockingQueue f67692k = new LinkedBlockingQueue();

    /* renamed from: r, reason: collision with root package name */
    public boolean f67699r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f67700s = 1;

    /* renamed from: t, reason: collision with root package name */
    public String f67701t = null;

    /* renamed from: u, reason: collision with root package name */
    public String f67702u = null;

    /* renamed from: v, reason: collision with root package name */
    public String f67703v = null;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC6171b f67704w = null;

    /* renamed from: wg.a$a, reason: collision with other inner class name */
    public class RunnableC0963a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC6749d f67705a;

        public RunnableC0963a(AbstractC6749d abstractC6749d) {
            this.f67705a = abstractC6749d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f67705a.h() != 0) {
                    throw new C6751f(107, "Invalid State");
                }
                if (C6746a.this.f67684c != 1) {
                    C6746a.this.f67684c = -1;
                    throw new C6751f(101, "No connection available");
                }
                if (this.f67705a.c() != null) {
                    this.f67705a.c().c(this.f67705a);
                }
                C6746a.this.f67688g.put(this.f67705a.d(), this.f67705a);
                C6746a.this.f67689h.e(this.f67705a);
                this.f67705a.n(1);
                C6746a.this.f67687f.m(AbstractC6574b.g(this.f67705a.e()));
                if (this.f67705a.c() == null) {
                    C6746a.this.f67687f.h();
                }
            } catch (C6689a e10) {
                e = e10;
                Log.e("PEX", Log.getStackTraceString(e));
            } catch (C6751f e11) {
                e = e11;
                Log.e("PEX", Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: wg.a$b */
    public class b extends Thread {
        public b() {
        }

        public void a(Hashtable hashtable) {
            String str = (String) hashtable.get("eid");
            if (str == null) {
                C6746a.this.f67682a.h(hashtable);
                return;
            }
            int parseInt = Integer.parseInt("" + hashtable.get("rs"));
            AbstractC6749d abstractC6749d = (AbstractC6749d) C6746a.this.f67688g.get(str);
            InterfaceC6750e c10 = abstractC6749d.c();
            if (c10 != null) {
                try {
                    if (parseInt < 0) {
                        c10.e(new C6748c((Hashtable) hashtable.get("err")));
                        c10.f(null, false);
                        C6746a.this.f67689h.d(abstractC6749d);
                        C6746a.this.f67688g.remove(str);
                        return;
                    }
                    C6753h g10 = abstractC6749d.g();
                    if (g10 == null || !g10.c()) {
                        if (!abstractC6749d.k() && !abstractC6749d.j()) {
                            g10 = new C6753h(hashtable.get("res"), abstractC6749d.i());
                            abstractC6749d.m(g10);
                        }
                        Hashtable hashtable2 = (Hashtable) hashtable.get("res");
                        g10 = (hashtable2.containsKey(W9.d.f13160a) && abstractC6749d.j()) ? new C6753h((String) hashtable2.get(W9.d.f13160a), abstractC6749d.j()) : new C6753h(hashtable.get("res"));
                        abstractC6749d.m(g10);
                    } else if (abstractC6749d.j()) {
                        Hashtable hashtable3 = (Hashtable) hashtable.get("res");
                        if (hashtable3.containsKey(W9.d.f13160a)) {
                            g10.b((String) hashtable3.get(W9.d.f13160a));
                        }
                    } else {
                        g10.a(hashtable.get("res"));
                    }
                    if (parseInt == C6752g.f67727e.a()) {
                        c10.a(g10);
                    } else if (parseInt == C6752g.f67728f.a()) {
                        c10.d(g10);
                        c10.f(g10, true);
                        C6746a.this.f67689h.d(abstractC6749d);
                        C6746a.this.f67688g.remove(str);
                    }
                } catch (Exception e10) {
                    Log.e("PEX", Log.getStackTraceString(e10));
                }
            }
        }

        public void b() {
            if (C6746a.this.f67692k.size() > 0) {
                ArrayList arrayList = new ArrayList();
                C6746a.this.f67692k.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a((Hashtable) it.next());
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (C6746a.this.f67684c == 1) {
                try {
                    Hashtable hashtable = (Hashtable) C6746a.this.f67692k.take();
                    a(hashtable);
                    hashtable.clear();
                } catch (Exception e10) {
                    Log.e("PEX", Log.getStackTraceString(e10));
                }
            }
        }
    }

    /* renamed from: wg.a$c */
    public class c implements zg.c {
        public c() {
        }

        @Override // zg.c
        public HashMap a() {
            HashMap a10 = C6746a.this.f67682a.a();
            HashMap hashMap = new HashMap();
            String f10 = C6746a.this.f67694m.f();
            if (f10 == null || f10.trim().isEmpty()) {
                hashMap.put(Constants.USER_AGENT_HEADER_KEY, System.getProperty("useragent"));
            } else {
                hashMap.put(Constants.USER_AGENT_HEADER_KEY, C6746a.this.f67694m.f());
            }
            hashMap.put(Constants.ACCEPT_LANGUAGE, Locale.getDefault().getLanguage());
            hashMap.putAll(a10);
            return hashMap;
        }

        @Override // zg.c
        public void b() {
            C6746a.this.f67682a.b();
        }

        @Override // zg.c
        public void c() {
            C6746a.this.f67697p = System.currentTimeMillis() - C6746a.this.f67697p;
            C6746a.this.f67684c = 1;
            C6746a.this.f67698q = -1L;
            C6746a.this.f67682a.j();
            C6746a.this.f67693l = C6746a.this.new b();
            C6746a.this.f67693l.start();
            AbstractC6824a unused = C6746a.this.f67694m;
        }

        @Override // zg.c
        public void d(int i10) {
            C6746a.this.f67684c = 0;
            C6746a.this.f67698q = -1L;
            C6746a.this.f67682a.i();
            try {
                if (C6746a.this.f67693l != null) {
                    C6746a.this.f67693l.interrupt();
                    C6746a.this.f67693l.b();
                    C6746a.this.f67693l = null;
                }
            } catch (Exception e10) {
                Log.e("PEX", Log.getStackTraceString(e10));
            }
            AbstractC6576d.a("websocket connection closed");
        }

        @Override // zg.c
        public void onMessage(String str) {
            boolean z10;
            String str2;
            C6746a.this.f67682a.d("WMS | onMessage | msg:" + str);
            if (str != null) {
                try {
                    if (str.equalsIgnoreCase("_")) {
                        C6746a.o(C6746a.this);
                        return;
                    }
                } catch (Exception e10) {
                    Log.e("PEX", Log.getStackTraceString(e10));
                    return;
                }
            }
            Iterator it = ((ArrayList) AbstractC6574b.d(str)).iterator();
            while (it.hasNext()) {
                Hashtable hashtable = (Hashtable) it.next();
                if (hashtable.containsKey("seq")) {
                    try {
                        Integer valueOf = Integer.valueOf("" + hashtable.get("seq"));
                        Hashtable hashtable2 = new Hashtable();
                        hashtable2.put("s", String.valueOf(valueOf));
                        C6746a.this.f67687f.m(AbstractC6574b.g(hashtable2));
                    } catch (C6689a e11) {
                        Log.e("PEX", Log.getStackTraceString(e11));
                    }
                }
                if (hashtable.containsKey("secured")) {
                    try {
                        z10 = Boolean.parseBoolean((String) hashtable.get("secured"));
                    } catch (Exception unused) {
                        z10 = false;
                    }
                    if (z10 && C6746a.this.f67703v != null && !C6746a.this.f67703v.trim().isEmpty()) {
                        Object obj = hashtable.get("msg");
                        if (obj instanceof String) {
                            try {
                                C6746a c6746a = C6746a.this;
                                str2 = c6746a.f67704w.c((String) obj, c6746a.f67703v, C6746a.this.f67694m.g());
                            } catch (Exception e12) {
                                C6746a.this.f67682a.d("WMS | onMessage | Decryption failed | " + Log.getStackTraceString(e12) + " for msg:" + obj);
                                Log.e("PEX", Log.getStackTraceString(e12));
                                str2 = null;
                            }
                            C6746a.this.f67682a.d("WMS | onMessage | decryptedMsg | " + str2);
                            if (str2 != null && !str2.trim().isEmpty()) {
                                hashtable.put("msg", AbstractC6574b.d(str2));
                            }
                        }
                    }
                }
                try {
                    if (((String) hashtable.get("eid")) == null) {
                        int intValue = Integer.valueOf(hashtable.get("mtype").toString()).intValue();
                        if (intValue == -3) {
                            C6746a.this.f67682a.f(hashtable);
                        } else if (intValue == -4) {
                            C6746a.this.f67682a.c(hashtable);
                        }
                    }
                } catch (Exception e13) {
                    Log.e("PEX", Log.getStackTraceString(e13));
                }
                try {
                    C6746a.this.f67692k.put(hashtable);
                } catch (Exception e14) {
                    Log.e("PEX", Log.getStackTraceString(e14));
                }
            }
        }
    }

    public static /* synthetic */ l o(C6746a c6746a) {
        c6746a.getClass();
        return null;
    }

    public static C6746a r() {
        return new C6746a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        if (r2 != 14) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(String str, String str2) {
        synchronized (this.f67685d) {
            try {
                if (this.f67684c > 0) {
                    return;
                }
                this.f67684c = 2;
                String str3 = this.f67695n;
                HashMap hashMap = new HashMap();
                if (this.f67694m.d() != null) {
                    int e10 = this.f67694m.e();
                    if (e10 == 0) {
                        hashMap.put(this.f67683b, this.f67694m.d());
                    } else if (e10 == 1) {
                        str3 = (str3 + s("ticket", this.f67694m.d())) + s("iscscope", this.f67694m.b("iscscope"));
                    } else if (e10 == 3) {
                        hashMap.put(this.f67683b, this.f67694m.d());
                        str3 = str3 + s("domain", this.f67694m.b("domain"));
                    } else if (e10 == 5) {
                        str3 = (str3 + s("ticket", this.f67694m.d())) + s("bundleid", this.f67694m.b("bundleid"));
                    } else if (e10 != 6) {
                        if (e10 != 9) {
                            if (e10 == 10) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3);
                                sb2.append(s("tid", this.f67694m.g() + "_" + this.f67696o.a() + "_" + System.currentTimeMillis()));
                                String sb3 = sb2.toString();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(sb3);
                                sb4.append(s("wmsid", this.f67694m.g()));
                                str3 = sb4.toString();
                            } else if (e10 == 13) {
                                String str4 = str3 + s("ticket", this.f67694m.d());
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(str4);
                                sb5.append(s("tid", this.f67694m.g() + "_" + this.f67696o.a() + "_" + System.currentTimeMillis()));
                                String sb6 = sb5.toString();
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(sb6);
                                sb7.append(s("wmsid", this.f67694m.g()));
                                str3 = sb7.toString();
                            }
                        }
                        if (this.f67694m instanceof C6825b) {
                            str3 = str3 + s("ticket", this.f67682a.e().get("token"));
                        } else {
                            str3 = str3 + s("ticket", this.f67694m.d());
                        }
                        if (this.f67694m.b("oprscope") != null) {
                            str3 = str3 + s("oprscope", this.f67694m.b("oprscope"));
                        }
                        if (this.f67694m.b("userscope") != null) {
                            str3 = str3 + s("userscope", this.f67694m.b("userscope"));
                        }
                        if (this.f67694m.b("orgscope") != null) {
                            str3 = str3 + s("orgscope", this.f67694m.b("orgscope"));
                        }
                        if (this.f67694m.g() != null) {
                            str3 = str3 + t("wmsid", this.f67694m.g());
                        }
                    } else {
                        str3 = (str3 + s("key", this.f67694m.d())) + s("zuid", this.f67694m.b("zuid"));
                    }
                }
                if (str != null) {
                    str3 = str3 + s(com.google.android.material.shape.i.f35755A, str);
                }
                if (str2 != null) {
                    str3 = str3 + s("xa", str2);
                }
                AbstractC6991a a10 = AbstractC6992b.a(str3);
                this.f67687f = a10;
                a10.f69124c = this.f67701t;
                if (!hashMap.isEmpty()) {
                    this.f67687f.b(hashMap);
                }
                this.f67687f.j(this.f67686e);
                this.f67682a.g();
                this.f67697p = System.currentTimeMillis();
                this.f67687f.i(this.f67699r);
                this.f67687f.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B(String str, String str2, String str3) {
        if (str != null) {
            this.f67695n = this.f67695n.replace(new URI(this.f67695n).getHost(), str);
        }
        A(str2, str3);
    }

    public void C() {
        AbstractC6991a abstractC6991a = this.f67687f;
        if (abstractC6991a != null) {
            abstractC6991a.g();
        }
    }

    public void D(boolean z10) {
        this.f67699r = z10;
    }

    public void E(int i10) {
        this.f67690i = i10 * 1000;
    }

    public void F(InterfaceC6747b interfaceC6747b) {
        this.f67682a = interfaceC6747b;
    }

    public void G(int i10) {
        this.f67700s = i10;
    }

    public void H() {
        AbstractC6991a abstractC6991a = this.f67687f;
        if (abstractC6991a != null) {
            abstractC6991a.c();
        }
    }

    public void I() {
        this.f67687f.k();
    }

    public void J() {
        this.f67687f.l();
    }

    public AbstractC6824a p() {
        return this.f67694m;
    }

    public long q() {
        return this.f67690i;
    }

    public final String s(String str, Object obj) {
        try {
            return "&" + str + "=" + URLEncoder.encode("" + obj, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Log.e("PEX", Log.getStackTraceString(e10));
            return "&" + str + "=" + URLEncoder.encode("" + obj);
        }
    }

    public final String t(String str, Object obj) {
        try {
            return "&" + str + "=" + obj;
        } catch (Exception e10) {
            Log.e("PEX", Log.getStackTraceString(e10));
            return "&" + str + "=" + obj;
        }
    }

    public void u(AbstractC6749d abstractC6749d) {
        abstractC6749d.c().b(abstractC6749d);
        this.f67688g.remove(abstractC6749d.d());
    }

    public void v() {
        AbstractC6991a abstractC6991a = this.f67687f;
        if (abstractC6991a != null) {
            abstractC6991a.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x022f, code lost:
    
        if (r7 != 14) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(Context context, String str, String str2, ug.e eVar, C4073a c4073a, AbstractC6824a abstractC6824a, boolean z10, Hashtable hashtable, String str3, String str4, String str5) {
        synchronized (this.f67685d) {
            try {
                if (this.f67684c > 0) {
                    return;
                }
                this.f67684c = 2;
                this.f67694m = abstractC6824a;
                this.f67696o = eVar;
                this.f67701t = str5;
                String property = System.getProperty("pex.url");
                if (property != null) {
                    str = property;
                } else if (str == null) {
                    str = "ws://wms.zoho.com/pconnect";
                }
                String str6 = str + "?nocache=" + System.currentTimeMillis();
                String a10 = eVar.a();
                String valueOf = String.valueOf(c4073a.a());
                String property2 = System.getProperty("appversion");
                String property3 = System.getProperty("oscode");
                this.f67683b = System.getProperty("iamticket.cookiename", this.f67683b);
                if (z10) {
                    if (context == null) {
                        throw new NullPointerException("Pass in a valid context to use payload encryption");
                    }
                    AbstractC6171b d10 = AbstractC6171b.d(context);
                    this.f67704w = d10;
                    KeyPair e10 = d10.e();
                    this.f67703v = AbstractC6573a.b(e10.getPrivate().getEncoded());
                    this.f67702u = AbstractC6573a.b(e10.getPublic().getEncoded());
                }
                if (a10 != null) {
                    str6 = str6 + "&prd=" + a10;
                }
                String str7 = str6 + "&config=" + valueOf;
                if (property3 != null) {
                    str7 = str7 + "&oscode=" + property3;
                }
                String str8 = str7 + "&sessiontype=64";
                String property4 = System.getProperty("pnskey");
                if (str2 != null) {
                    str8 = str8 + s("insid", str2);
                }
                if (property4 != null) {
                    str8 = str8 + s("pnskey", property4);
                }
                String str9 = str8 + "&authtype=" + abstractC6824a.e();
                String str10 = this.f67702u;
                if (str10 != null && !str10.trim().isEmpty()) {
                    str9 = str9 + s("publickey", this.f67702u);
                }
                if (abstractC6824a.h() != null) {
                    str9 = str9 + "&wmsid=" + abstractC6824a.h();
                }
                if (abstractC6824a.c() != null) {
                    str9 = str9 + s("dname", abstractC6824a.c());
                }
                if (property2 != null) {
                    str9 = str9 + s("appversion", property2);
                }
                if (hashtable != null) {
                    Enumeration keys = hashtable.keys();
                    while (keys.hasMoreElements()) {
                        String str11 = (String) keys.nextElement();
                        str9 = str9 + s(str11, hashtable.get(str11));
                    }
                }
                this.f67695n = str9;
                if (str3 != null) {
                    str9 = str9 + s(com.google.android.material.shape.i.f35755A, str3);
                }
                if (str4 != null) {
                    str9 = str9 + s("xa", str4);
                }
                HashMap hashMap = new HashMap();
                if (abstractC6824a.d() != null) {
                    int e11 = abstractC6824a.e();
                    if (e11 == 0) {
                        hashMap.put(this.f67683b, abstractC6824a.d());
                    } else if (e11 == 1) {
                        str9 = (str9 + s("ticket", abstractC6824a.d())) + s("iscscope", abstractC6824a.b("iscscope"));
                    } else if (e11 == 3) {
                        hashMap.put(this.f67683b, abstractC6824a.d());
                        str9 = str9 + s("domain", abstractC6824a.b("domain"));
                    } else if (e11 == 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str9);
                        sb2.append(s("tid", abstractC6824a.d() + "_" + a10 + "_" + System.currentTimeMillis()));
                        String sb3 = sb2.toString();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(sb3);
                        sb4.append(s("wmsid", abstractC6824a.d()));
                        str9 = sb4.toString();
                    } else if (e11 == 5) {
                        str9 = (str9 + s("ticket", abstractC6824a.d())) + s("bundleid", abstractC6824a.b("bundleid"));
                    } else if (e11 != 6) {
                        if (e11 != 9) {
                            if (e11 == 10) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(str9);
                                sb5.append(s("tid", abstractC6824a.g() + "_" + this.f67696o.a() + "_" + System.currentTimeMillis()));
                                String sb6 = sb5.toString();
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(sb6);
                                sb7.append(s("wmsid", abstractC6824a.g()));
                                str9 = sb7.toString();
                            } else if (e11 == 13) {
                                String str12 = str9 + s("ticket", abstractC6824a.d());
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(str12);
                                sb8.append(s("tid", abstractC6824a.g() + "_" + a10 + "_" + System.currentTimeMillis()));
                                String sb9 = sb8.toString();
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(sb9);
                                sb10.append(s("wmsid", abstractC6824a.g()));
                                str9 = sb10.toString();
                            }
                        }
                        str9 = str9 + s("ticket", abstractC6824a.d());
                        if (abstractC6824a.b("oprscope") != null) {
                            str9 = str9 + s("oprscope", abstractC6824a.b("oprscope"));
                        }
                        if (abstractC6824a.b("userscope") != null) {
                            str9 = str9 + s("userscope", abstractC6824a.b("userscope"));
                        }
                        if (abstractC6824a.b("orgscope") != null) {
                            str9 = str9 + s("orgscope", abstractC6824a.b("orgscope"));
                        }
                        if (abstractC6824a.g() != null) {
                            str9 = str9 + t("wmsid", abstractC6824a.g());
                        }
                    } else {
                        str9 = (str9 + s("key", abstractC6824a.d())) + s("zuid", abstractC6824a.b("zuid"));
                    }
                }
                AbstractC6991a a11 = AbstractC6992b.a(str9);
                this.f67687f = a11;
                a11.f69124c = str5;
                if (!hashMap.isEmpty()) {
                    this.f67687f.b(hashMap);
                }
                this.f67697p = System.currentTimeMillis();
                this.f67687f.j(this.f67686e);
                this.f67682a.g();
                this.f67687f.i(this.f67699r);
                this.f67687f.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean x() {
        AbstractC6991a abstractC6991a = this.f67687f;
        if (abstractC6991a != null) {
            return abstractC6991a.f();
        }
        return false;
    }

    public void y(AbstractC6749d abstractC6749d) {
        if (abstractC6749d != null) {
            abstractC6749d.a("X-PEX-MOBILE", "true");
        }
        z(abstractC6749d);
    }

    public final void z(AbstractC6749d abstractC6749d) {
        try {
            this.f67691j.submit(new RunnableC0963a(abstractC6749d));
        } catch (Exception e10) {
            Log.e("PEX", Log.getStackTraceString(e10));
        }
    }
}
