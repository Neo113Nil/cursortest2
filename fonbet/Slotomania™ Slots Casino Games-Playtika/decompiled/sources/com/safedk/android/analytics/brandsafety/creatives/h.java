package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import io.ktor.sse.ServerSentEventKt;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class h extends e {
    private static final String q = "VastAdParser";
    private static final CharSequence r = "acao/yes";
    public static final LinkedHashSetWithItemLimit<i> p = new LinkedHashSetWithItemLimit<>(50);

    public static class a {
        private boolean a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private List<Pair<String, String>> i;
        private List<String> j;
        private List<String> k;
        private List<String> l;
        private List<String> m;
        private List<String> n;
        private List<String> o;
        private List<String> p;
        private List<String> q;
        private List<String> r;
        private List<String> s;
        private String t;

        a(String str, String str2, String str3, String str4, ArrayList<String> arrayList, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, boolean z, String str5, List<String> list9, String str6, List<Pair<String, String>> list10, String str7) {
            this.a = false;
            this.k = new ArrayList();
            this.l = new ArrayList();
            this.m = new ArrayList();
            this.n = new ArrayList();
            this.o = new ArrayList();
            this.d = str;
            this.e = str2;
            this.b = str3;
            this.c = str4;
            this.k = arrayList;
            this.l = list;
            this.m = list2;
            this.n = list3;
            this.o = list4;
            this.p = list5;
            this.q = list6;
            this.r = list7;
            this.s = list8;
            this.a = z;
            this.g = z ? str5 : null;
            this.j = list9;
            this.h = str6;
            this.i = list10;
            this.t = str7;
            Logger.v(h.q, "Vast ad created: vastAdId=", str, " adSystem=", str2);
            Logger.v(h.q, "clickUrl=", str3);
            Logger.v(h.q, "videoUrl=", str4);
            Object[] objArr = new Object[2];
            objArr[0] = "prefetchResourceUrls=";
            String str8 = AbstractJsonLexerKt.NULL;
            objArr[1] = arrayList != null ? arrayList.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = "staticResourceUrls=";
            objArr2[1] = list != null ? list.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr2);
            Object[] objArr3 = new Object[2];
            objArr3[0] = "scriptResourceUrls=";
            objArr3[1] = list2 != null ? list2.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr3);
            Object[] objArr4 = new Object[2];
            objArr4[0] = "htmlResourceUrls=";
            objArr4[1] = list3 != null ? list3.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr4);
            Object[] objArr5 = new Object[2];
            objArr5[0] = "videoCompletedUrls=";
            objArr5[1] = list5 != null ? list5.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr5);
            Object[] objArr6 = new Object[2];
            objArr6[0] = "videoTrackingEventUrls=";
            objArr6[1] = list6 != null ? list6.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr6);
            Object[] objArr7 = new Object[2];
            objArr7[0] = "clickTrackingUrls=";
            objArr7[1] = list7 != null ? list7.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr7);
            Object[] objArr8 = new Object[2];
            objArr8[0] = "companionClickTrackingUrls=";
            objArr8[1] = list8 != null ? list8.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr8);
            Logger.v(h.q, "containsMediaFileWithJsAppAttribute=", Boolean.valueOf(z));
            Logger.v(h.q, "adParameters=", str5);
            Object[] objArr9 = new Object[2];
            objArr9[0] = "impressionUrls=";
            objArr9[1] = list9 != null ? list9.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr9);
            Object[] objArr10 = new Object[2];
            objArr10[0] = "mediaUrlList=";
            objArr10[1] = list10 != null ? list10.toString() : str8;
            Logger.v(h.q, objArr10);
            Logger.v(h.q, "vastDocVersion=", str7);
        }

        a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str4) {
            this.a = false;
            this.k = new ArrayList();
            this.l = new ArrayList();
            this.m = new ArrayList();
            this.n = new ArrayList();
            this.o = new ArrayList();
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.j = list;
            this.p = list2;
            this.q = list3;
            this.r = list4;
            this.s = list5;
            this.t = str4;
            Logger.v(h.q, "Vast ad created: vastAdId=", str, " adSystem=", str2);
            Logger.v(h.q, "vastAdUri=", str3);
            Object[] objArr = new Object[2];
            objArr[0] = "videoCompletedUrls=";
            String str5 = AbstractJsonLexerKt.NULL;
            objArr[1] = list2 != null ? list2.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = "videoTrackingEventUrls=";
            objArr2[1] = list3 != null ? list3.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr2);
            Object[] objArr3 = new Object[2];
            objArr3[0] = "clickTrackingUrls=";
            objArr3[1] = list4 != null ? list4.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr3);
            Object[] objArr4 = new Object[2];
            objArr4[0] = "companionClickTrackingUrls=";
            objArr4[1] = list5 != null ? list5.toString() : AbstractJsonLexerKt.NULL;
            Logger.v(h.q, objArr4);
            Object[] objArr5 = new Object[2];
            objArr5[0] = "impressionUrls=";
            objArr5[1] = list != null ? list.toString() : str5;
            Logger.v(h.q, objArr5);
            Logger.v(h.q, "vastDocVersion=", str4);
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.d;
        }

        public void a(String str) {
            this.d = str;
        }

        public String d() {
            return this.e;
        }

        public void b(String str) {
            this.e = str;
        }

        public String e() {
            return this.f;
        }

        public void c(String str) {
            this.f = str;
        }

        public String f() {
            return this.g;
        }

        public String g() {
            return this.h;
        }

        public List<String> h() {
            ArrayList arrayList = new ArrayList();
            List<Pair<String, String>> list = this.i;
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().second);
                }
            }
            return arrayList;
        }

        public List<String> i() {
            return this.j;
        }

        public void a(List<String> list) {
            this.j = list;
        }

        public List<String> j() {
            return this.k;
        }

        public List<String> k() {
            return this.l;
        }

        public List<String> l() {
            return this.m;
        }

        public List<String> m() {
            return this.n;
        }

        public List<String> n() {
            return this.o;
        }

        public List<String> o() {
            return this.p;
        }

        public void b(List<String> list) {
            this.p = list;
        }

        public List<String> p() {
            return this.q;
        }

        public void c(List<String> list) {
            this.q = list;
        }

        public List<String> q() {
            return this.r;
        }

        public void d(List<String> list) {
            this.r = list;
        }

        public List<String> r() {
            return this.s;
        }

        public void e(List<String> list) {
            this.s = list;
        }

        public boolean s() {
            return this.a && !u();
        }

        public String t() {
            return this.t;
        }

        public void d(String str) {
            this.t = str;
        }

        private boolean u() {
            for (Pair<String, String> pair : this.i) {
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                if (str.startsWith("video")) {
                    Logger.d(h.q, "video file exists: ", str2);
                    return true;
                }
            }
            Logger.printFullVerboseLog(h.q, "video file doesn't exist: ", this.i);
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("vastAdId=");
            String str = this.d;
            String str2 = AbstractJsonLexerKt.NULL;
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            sb.append(str);
            sb.append(", adSystem=");
            String str3 = this.e;
            if (str3 == null) {
                str3 = AbstractJsonLexerKt.NULL;
            }
            sb.append(str3);
            sb.append(", clickUrl=");
            String str4 = this.b;
            if (str4 == null) {
                str4 = AbstractJsonLexerKt.NULL;
            }
            sb.append(str4);
            sb.append(", videoUrl=");
            String str5 = this.c;
            if (str5 == null) {
                str5 = AbstractJsonLexerKt.NULL;
            }
            sb.append(str5);
            sb.append(", vastAdUri=");
            String str6 = this.f;
            if (str6 == null) {
                str6 = AbstractJsonLexerKt.NULL;
            }
            sb.append(str6);
            sb.append(", mediaUrlList=");
            List<Pair<String, String>> list = this.i;
            if (list != null) {
                str2 = list.toString();
            }
            sb.append(str2);
            return sb.toString();
        }
    }

    public static ArrayList<a> a(String str, boolean z, String str2, boolean z2) {
        ArrayList<a> arrayList = new ArrayList<>();
        List<String> a2 = n.a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Ad(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Ad(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str);
        if (a2.isEmpty()) {
            Logger.d(q, "No ad blocks detected, exiting");
            return arrayList;
        }
        String c = c(str);
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            a a3 = a(it.next(), z, str2);
            if (a3 != null) {
                arrayList.add(a3);
                if (TextUtils.isEmpty(a3.t()) && z2) {
                    a3.d(c);
                    Logger.d(q, "parse multiple - updating vast doc version to= ", c);
                }
            }
        }
        return arrayList;
    }

    private static String c(String str) {
        return n.e(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)VAST[^>]*version(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([0-9.]+)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)"), str);
    }

    private static String a(String str, String str2) throws UnsupportedEncodingException {
        if (!CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false)) {
            return str;
        }
        if (str.contains("%25")) {
            String decode = URLDecoder.decode(str, C.UTF8_NAME);
            Logger.d(q, "Decoding URL - url was decoded once");
            if (decode.contains("%25")) {
                String decode2 = URLDecoder.decode(decode, C.UTF8_NAME);
                Logger.d(q, "Decoding URL - url was decoded twice");
                return decode2;
            }
            return decode;
        }
        return str;
    }

    public static a a(String str, boolean z, String str2) {
        int i;
        String str3;
        String str4;
        String str5;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String c = c(str);
            Logger.d(q, "Vast document version: ", c);
            if (a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)((.*?)(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str, -1, z).isEmpty()) {
                Logger.d(q, "No ad blocks detected, exiting");
                return null;
            }
            List<String> a2 = a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(Creative|Ad)(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str, 2, z);
            if (a2.isEmpty()) {
                str3 = null;
            } else {
                String a3 = a(a2.get(0), false);
                Logger.d(q, "Ad ID detected: ", a3);
                str3 = a3;
            }
            List<String> a4 = a(com.safedk.android.utils.g.a(a(k.g), 2), str, 1, z);
            if (a4.isEmpty()) {
                str4 = null;
            } else {
                str4 = a(CreativeInfoManager.e(str2), a(com.safedk.android.utils.k.g(a(a4.get(0), z)), str2));
                Logger.printFullVerboseLog(q, "Vast ad uri added to followed urls : ", str4);
                a(new f(str4));
            }
            List<String> a5 = a(com.safedk.android.utils.g.a(a(k.h), 2), str, 1, z);
            if (a5.isEmpty()) {
                str5 = null;
            } else {
                String a6 = a(a5.get(0), false);
                Logger.d(q, "Ad system detected : ", a6);
                str5 = a6;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = a(com.safedk.android.utils.g.a(a(k.n), 2), str, 1, z).iterator();
            while (it.hasNext()) {
                String replace = com.safedk.android.utils.k.g(a(it.next(), z)).replace("\\/", "/");
                arrayList.add(replace);
                Logger.d(q, "impression url identified : ", replace);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> a7 = a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Tracking(?:[\\s]|%20)event(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Tracking(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2), str, 1, 2, z);
            for (int i2 = 0; i2 < a7.size(); i2 += 2) {
                a7.get(i2);
                arrayList2.add(com.safedk.android.utils.k.g(a(a7.get(i2 + 1), z)));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> it2 = a(com.safedk.android.utils.g.a(a(k.z), 2), str, 1, z).iterator();
            while (it2.hasNext()) {
                arrayList4.add(com.safedk.android.utils.k.g(a(it2.next(), z)));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<String> it3 = a(com.safedk.android.utils.g.a(a(k.O), 2), str, 1, z).iterator();
            while (it3.hasNext()) {
                arrayList5.add(com.safedk.android.utils.k.g(a(it3.next(), z)));
            }
            if (str4 != null) {
                return a(str4, str3, str5, arrayList, arrayList3, arrayList2, arrayList4, arrayList5, c);
            }
            i = 2;
            try {
                return a(str, z, str, str3, str5, arrayList, arrayList3, arrayList2, arrayList4, arrayList5, c);
            } catch (Throwable th) {
                th = th;
                new CrashReporter().caughtException(th);
                Object[] objArr = new Object[i];
                objArr[0] = "failed to parse vast data";
                objArr[1] = th;
                Logger.e(q, objArr);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 2;
        }
    }

    private static a a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str4) {
        if (str != null) {
            Logger.d(q, "vast ad uri detected: ", str);
            return new a(str2, str3, str, list, list2, list3, list4, list5, str4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d2  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a a(String str, boolean z, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5) {
        Iterator<String> it;
        int i;
        ?? r7;
        int i2;
        String str6;
        char c;
        String str7;
        ArrayList arrayList;
        List<String> list6;
        char c2;
        String str8;
        ArrayList arrayList2;
        ?? r6 = 0;
        Logger.d(q, "no vast ad tag uri");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        List<String> a2 = a(k(), str2, 0, false);
        int i3 = 2;
        Logger.d(q, "Number of creatives XML elements: ", Integer.valueOf(a2.size()));
        if (a2.isEmpty()) {
            Logger.printFullVerboseLog(q, "Number of creatives XML elements is 0, the xml is:\n", str2);
        }
        Iterator<String> it2 = a2.iterator();
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z2 = false;
        String str12 = null;
        String str13 = null;
        while (it2.hasNext()) {
            String next = it2.next();
            List<String> a3 = a(com.safedk.android.utils.g.a(a(k.N), i3), next, 1, (boolean) r6);
            if (!a3.isEmpty()) {
                it = it2;
                Object[] objArr = new Object[2];
                objArr[r6] = "companion click url list: ";
                i = 1;
                objArr[1] = a3.toString();
                Logger.d(q, objArr);
                r7 = 0;
                str11 = a(a3.get(0), true);
            } else {
                it = it2;
                i = 1;
                r7 = 0;
                Logger.d(q, "companion click url list is empty");
            }
            List<String> a4 = a(com.safedk.android.utils.g.a(a(k.y), 2), next, i, (boolean) r7);
            if (!a4.isEmpty()) {
                Object[] objArr2 = new Object[2];
                objArr2[r7] = "click url list: ";
                objArr2[1] = a4;
                Logger.d(q, objArr2);
                str13 = a(a4.get(r7), z);
                if (str11 == null) {
                    str11 = a(a4.get(r7), true);
                }
                Iterator<String> it3 = a4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(a(it3.next(), z));
                }
            } else {
                Logger.d(q, "click url list is empty");
            }
            if (!TextUtils.isEmpty(str11)) {
                str9 = str11;
            }
            Pattern a5 = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)<TAG_NAME>[\\s\\S]*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)<TAG_NAME>(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)".replaceFirst("<TAG_NAME>", "MediaFile[^s]").replace("<TAG_NAME>", k.u), 2);
            Iterator<String> it4 = a(a5, next, -1, z).iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                Iterator<String> it5 = it4;
                List<String> a6 = a(com.safedk.android.utils.g.a("(apiFramework(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)VPAID(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)application/javascript(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2), next2, -1, z);
                String str14 = str9;
                List<String> a7 = a(a5, next2, 1, z);
                String a8 = a(a7.get(0), z);
                Pattern pattern = a5;
                String str15 = str10;
                Pattern a9 = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)MediaFile[\\s\\S]*?type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
                List<String> a10 = a(a9, next2, 1, z);
                if (!a10.isEmpty()) {
                    str7 = "";
                    arrayList = arrayList6;
                    list6 = a10;
                } else {
                    arrayList = arrayList6;
                    str7 = "";
                    list6 = a(a9, next2.replace(ServerSentEventKt.SPACE, ""), 1, z);
                }
                if (list6.isEmpty()) {
                    c2 = 0;
                    str8 = str7;
                } else {
                    c2 = 0;
                    str8 = list6.get(0);
                }
                if (!str8.isEmpty()) {
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = arrayList5;
                    Object[] objArr3 = new Object[2];
                    objArr3[c2] = "empty media type: ";
                    objArr3[1] = next2;
                    Logger.d(q, objArr3);
                }
                if (!a6.isEmpty()) {
                    arrayList3.add(a8);
                    Logger.d(q, "contains media file with JS app attribute");
                    z2 = true;
                } else if (!a7.isEmpty()) {
                    arrayList7.add(new Pair(str8, a8));
                    Logger.d(q, "adding media file : ", a8);
                } else {
                    Logger.d(q, "cannot detect media resource in. skipping");
                }
                it4 = it5;
                str9 = str14;
                a5 = pattern;
                str10 = str15;
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
            }
            String str16 = str9;
            String str17 = str10;
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList6;
            List<String> a11 = a(com.safedk.android.utils.g.a(a(k.r), 2), next, 1, z);
            if (a11.isEmpty()) {
                i2 = 1;
            } else {
                str12 = a(a11.get(0), z);
                if (n.n(str12)) {
                    Logger.printFullVerboseLog(q, "ad parameters is JSON : ", str12);
                    ArrayList<String> g = n.g(str12);
                    if (!g.isEmpty()) {
                        for (String str18 : g) {
                            Logger.d(q, "ad parameters media url : ", str18);
                            if (n.s(str18)) {
                                Logger.d(q, "ad parameters media url is video url : ", str18);
                                arrayList7.add(new Pair("video/*", a(str18, z)));
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 1;
                    Logger.printFullVerboseLog(q, "found ad parameters = ", str12);
                }
            }
            List<String> a12 = a(com.safedk.android.utils.g.a(a("YouTubeVideoId"), 2), str2, i2, z);
            if (!a12.isEmpty()) {
                arrayList3.add("element:ytId:" + a12.get(0));
                Logger.d(q, "handle no vast ad Uri - added element to prefetch collection: ", a12.get(0));
            }
            Iterator it6 = arrayList7.iterator();
            String str19 = null;
            String str20 = null;
            String str21 = null;
            while (true) {
                if (!it6.hasNext()) {
                    str6 = null;
                    break;
                }
                Pair pair = (Pair) it6.next();
                String a13 = a((Pair<String, String>) pair);
                str6 = (String) pair.second;
                Logger.d(q, "found extension : ", a13, " for media: ", pair);
                if (((String) pair.first).contains("video") && str6.contains(r)) {
                    if (a13 != null && a13.equals("mp4")) {
                        Logger.d(q, "found google videoUrl mp4: ", pair);
                        break;
                    }
                    Logger.d(q, "found google videoUrl regular: ", pair);
                    str21 = str6;
                }
                if (a13 != null && a13.equals("mp4") && str19 == null) {
                    Logger.d(q, "setting first mp4 media file as: ", pair);
                    str19 = str6;
                }
                if (a13 != null && !a13.equals("mp4") && str20 == null) {
                    Logger.d(q, "setting first non-mp4 media file as: ", pair);
                    str20 = str6;
                }
            }
            if (str6 == null) {
                if (str21 != null) {
                    str19 = str21;
                } else if (str19 != null) {
                    Logger.d(q, "found first MP4 videoUrl : ", str19);
                } else if (str20 != null) {
                    Logger.d(q, "found first non-MP4 videoUrl : ", str20);
                    str19 = str20;
                }
                if (TextUtils.isEmpty(str19)) {
                    if (!arrayList3.contains(str19)) {
                        arrayList3.add(str19);
                    }
                    str10 = str19;
                    c = 0;
                } else {
                    c = 0;
                    Logger.d(q, "VAST ad did NOT found video url");
                    str10 = str17;
                }
                if (TextUtils.isEmpty(str11)) {
                    Object[] objArr4 = new Object[2];
                    objArr4[c] = "VAST ad found click Url = ";
                    objArr4[1] = str11;
                    Logger.d(q, objArr4);
                }
                it2 = it;
                str9 = str16;
                arrayList5 = arrayList8;
                arrayList6 = arrayList9;
                r6 = 0;
                i3 = 2;
            }
            str19 = str6;
            if (TextUtils.isEmpty(str19)) {
            }
            if (TextUtils.isEmpty(str11)) {
            }
            it2 = it;
            str9 = str16;
            arrayList5 = arrayList8;
            arrayList6 = arrayList9;
            r6 = 0;
            i3 = 2;
        }
        String str22 = str10;
        ArrayList arrayList10 = arrayList5;
        ArrayList arrayList11 = arrayList6;
        a(str, z, arrayList4, com.safedk.android.utils.g.a(a(k.D), 2));
        a(str, z, arrayList10, com.safedk.android.utils.g.a(a(k.E), 2));
        Pattern a14 = com.safedk.android.utils.g.a(a(k.F), 2);
        a(str, z, arrayList11, a14);
        List<String> a15 = a(a14, str, 1, z);
        if (str9 != null) {
            arrayList3.remove(str9);
        }
        return new a(str3, str4, str9, str22, arrayList3, arrayList4, arrayList10, arrayList11, a15, list2, list3, list4, list5, z2, str12, list, str13, arrayList7, str5);
    }

    private static void a(String str, boolean z, List<String> list, Pattern pattern) {
        Iterator<String> it = a(pattern, str, 1, z).iterator();
        while (it.hasNext()) {
            String z2 = n.z(it.next());
            List<String> a2 = a(a(), z2, 1, z);
            if (!a2.isEmpty()) {
                z2 = a2.get(0);
            }
            try {
                new URL(z2);
                list.add(z2);
            } catch (MalformedURLException e) {
                Logger.d(q, "resources inner text is malformed. cannot add this url to the resources list");
            }
        }
    }

    public static boolean b(String str) {
        return com.safedk.android.utils.g.a("VAST.*/VAST", 34).matcher(str).find();
    }

    public static void a(String str, String[] strArr, String str2) {
        List<String> a2 = a(com.safedk.android.utils.g.a(a(k.g), 2), str, 1, true);
        if (!a2.isEmpty()) {
            String g = com.safedk.android.utils.k.g(a(a2.get(0), true));
            Logger.printFullVerboseLog(q, "Vast ad uri added to followed urls : ", g);
            a(new f(a(strArr, g)));
        }
    }

    private static String a(String[] strArr, String str) {
        if (strArr != null && strArr.length > 0) {
            String a2 = com.safedk.android.utils.k.a(str, strArr);
            Logger.d(q, "Vast ad uri, query params removed : ", strArr);
            return a2;
        }
        return str;
    }

    protected static void a(i iVar) {
        p.add(iVar);
    }

    protected static String a(Pair<String, String> pair) {
        String[] split = ((String) pair.first).split("/");
        if (split.length > 1 && "video".equals(split[0])) {
            return split[1];
        }
        return null;
    }

    public static Pattern j() {
        return com.safedk.android.utils.g.a(a("VAST"), 2);
    }

    public static Pattern k() {
        return com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Creative[^s]?(?:id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([0-9]+)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))?.*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Creative(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2);
    }
}
