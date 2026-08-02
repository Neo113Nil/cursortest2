package defpackage;

import android.content.Context;
import com.ironsource.Ua;
import com.ironsource.Y1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ukg {
    public static final List l = Arrays.asList("2.0", "3.0", "4.0", "4.1", "4.2");
    public static final DocumentBuilder m;
    public static final ParserConfigurationException n;
    public final ow9 d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final ArrayList i;
    public final pgg j;
    public final ArrayList a = new ArrayList();
    public final Stack b = new Stack();
    public final Stack c = new Stack();
    public final ExecutorService k = Executors.newFixedThreadPool(1);

    static {
        try {
            m = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            n = e;
        }
    }

    public ukg(skg skgVar) {
        String str = skgVar.a;
        this.e = str;
        this.f = skgVar.b;
        boolean z = skgVar.c;
        this.g = z;
        this.h = skgVar.d;
        this.i = skgVar.e;
        this.d = skgVar.f;
        pgg pggVar = skgVar.g;
        this.j = pggVar;
        DocumentBuilder documentBuilder = m;
        if (documentBuilder == null) {
            sha.G(pggVar, qkg.u, str);
            throw new wkg(n);
        }
        qkg qkgVar = z ? qkg.q : qkg.d;
        try {
            d(documentBuilder.parse(new ByteArrayInputStream(str.getBytes(C.UTF8_NAME))));
        } catch (wkg e) {
            qkg qkgVar2 = e.a;
            qkgVar = qkgVar2 != null ? qkgVar2 : qkgVar;
            if (!qkgVar.equals(qkg.p)) {
                sha.G(this.j, qkgVar, this.e);
            }
            throw e;
        } catch (Exception e2) {
            hkg.v(this.i, qkgVar.a, ujg.P(null));
            sha.G(this.j, qkgVar, this.e);
            throw new wkg(e2);
        }
    }

    public static HashMap a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (str2 == null) {
            str2 = Y1.f;
        }
        hashMap.put("APIFRAMEWORKS", str2);
        if (str == null) {
            str = Y1.f;
        }
        hashMap.put("APPBUNDLE", str);
        hashMap.put("OMIDPARTNER", "Equativ/8.6.1");
        hashMap.put("VASTVERSIONS", "2,3,5,6,7,8,11,12,13,14");
        StringBuilder sb = new StringBuilder("");
        glf.a.getClass();
        sb.append(glf.b.e(10000000, 100000000));
        hashMap.put("CACHEBUSTING", sb.toString());
        hashMap.put("TIMESTAMP", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ", Locale.getDefault()).format(new Date()));
        hashMap.put("VERIFICATIONVENDORS", "-2");
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jkg b() {
        long currentTimeMillis;
        long currentTimeMillis2;
        jkg jkgVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long currentTimeMillis3 = System.currentTimeMillis() + Ua.s;
        jkg jkgVar2 = null;
        while (!this.b.empty()) {
            long currentTimeMillis4 = currentTimeMillis3 - System.currentTimeMillis();
            if (currentTimeMillis4 <= 0) {
                throw new wo0("Timeout hit before trying to get next ad in ad pod");
            }
            tkg tkgVar = new tkg(this, currentTimeMillis4, false);
            ExecutorService executorService = this.k;
            try {
                jkgVar = (jkg) executorService.submit(tkgVar).get((currentTimeMillis4 / 3) * 2, timeUnit);
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                e = e;
                if (e instanceof ExecutionException) {
                    e = e.getCause();
                }
                if (tkgVar.c) {
                    sha.G(this.j, qkg.p, this.e);
                }
                fjg c = fjg.c();
                Objects.toString(e);
                c.f(1);
                currentTimeMillis = System.currentTimeMillis() + (currentTimeMillis3 - System.currentTimeMillis());
                while (true) {
                    currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                    if (currentTimeMillis2 > 0) {
                        throw new wo0("timeout hit before trying to get next ad in passbacks");
                    }
                    try {
                        jkgVar = (jkg) executorService.submit(new tkg(this, currentTimeMillis2, true)).get(currentTimeMillis2, timeUnit);
                        break;
                    } catch (InterruptedException | ExecutionException unused2) {
                    } catch (TimeoutException e2) {
                        throw new wo0("Timeout hit when resolving VAST wrappers in passbacks", e2);
                    }
                }
            } catch (TimeoutException e3) {
                e = e3;
                if (e instanceof ExecutionException) {
                }
                if (tkgVar.c) {
                }
                fjg c2 = fjg.c();
                Objects.toString(e);
                c2.f(1);
                currentTimeMillis = System.currentTimeMillis() + (currentTimeMillis3 - System.currentTimeMillis());
                while (true) {
                    currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                    if (currentTimeMillis2 > 0) {
                    }
                }
            }
            jkgVar2 = jkgVar;
            if (jkgVar2 != null) {
                break;
            }
        }
        return jkgVar2;
    }

    public final skg c() {
        skg skgVar = new skg(this.e);
        skgVar.c = this.g;
        skgVar.b = this.f;
        skgVar.d = this.h;
        skgVar.e = this.i;
        skgVar.f = this.d;
        skgVar.g = this.j;
        return skgVar;
    }

    public final void d(Document document) {
        NodeList nodeList;
        ikg kkgVar;
        pgg pggVar = this.j;
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = this.i;
        Element documentElement = document.getDocumentElement();
        boolean equals = documentElement.getTagName().equals("VAST");
        qkg qkgVar = qkg.e;
        if (!equals) {
            throw new wkg("VAST file does not contain VAST tag", qkgVar);
        }
        String attribute = documentElement.getAttribute("version");
        try {
            arrayList.addAll(Arrays.asList(elg.c(documentElement, "Error", true)));
            arrayList.addAll(arrayList2);
        } catch (XPathExpressionException unused) {
        }
        Context context = null;
        if (attribute == null || attribute.length() == 0) {
            hkg.v(arrayList2, 101, ujg.P(null));
            throw new wkg("Missing VAST version TAG", qkgVar);
        }
        boolean contains = l.contains(attribute);
        boolean z = this.g;
        if (!contains) {
            qkg qkgVar2 = z ? qkg.i : qkg.h;
            hkg.v(arrayList2, qkgVar2.a, ujg.P(null));
            throw new wkg("Unsupported VAST version:".concat(attribute), qkgVar2);
        }
        NodeList elementsByTagName = document.getElementsByTagName("Ad");
        int length = elementsByTagName.getLength();
        if (length == 0) {
            hkg.v(arrayList, 303, ujg.P(null));
            throw new wkg("VAST does not contain any Ad", qkg.p);
        }
        int i = length - 1;
        boolean z2 = false;
        while (true) {
            Stack stack = this.c;
            Stack stack2 = this.b;
            if (i < 0) {
                if (z2) {
                    Collections.sort(stack2, new laf(12));
                    Collections.reverse(stack2);
                    return;
                } else {
                    if (stack.size() > 0) {
                        stack2.push((ikg) stack.pop());
                        return;
                    }
                    return;
                }
            }
            Node item = elementsByTagName.item(i);
            Context context2 = context;
            String b = elg.b(item, "sequence");
            try {
                kkgVar = ikg.a(item, pggVar);
                nodeList = elementsByTagName;
            } catch (wkg e) {
                qkg qkgVar3 = e.a;
                if (qkgVar3 == null) {
                    qkgVar3 = qkgVar;
                }
                ArrayList arrayList3 = new ArrayList();
                nodeList = elementsByTagName;
                try {
                    arrayList3.addAll(Arrays.asList(elg.c(item, "Error", false)));
                } catch (XPathExpressionException unused2) {
                }
                arrayList3.addAll(arrayList2);
                hkg.v(arrayList3, qkgVar3.a, ujg.P(context2));
                if (z) {
                    throw e;
                }
                sha.G(pggVar, qkgVar3, this.e);
                kkgVar = new kkg(qkgVar3);
                kkgVar.a = b;
            }
            if (b != null && b.length() > 0) {
                stack2.push(kkgVar);
                z2 = true;
            } else if ((kkgVar instanceof jkg) || !this.h) {
                stack.push(kkgVar);
            } else if (kkgVar instanceof okg) {
                stack.add(0, kkgVar);
            }
            i--;
            context = context2;
            elementsByTagName = nodeList;
        }
    }

    public final String toString() {
        return "SCSVastManager adPod:" + this.b.size() + " passbacks:" + this.c.size();
    }
}
