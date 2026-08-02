package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import com.google.common.net.HttpHeaders;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2345b8 {
    private static final String a = "POST";
    private static final String b = "GET";
    private static final String c = "ISHttpService";

    /* renamed from: com.ironsource.b8$a */
    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final String j = "UTF-8";
        final String a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList<Pair<String, String>> g;

        /* renamed from: com.ironsource.b8$a$a, reason: collision with other inner class name */
        static class C0205a {
            String b;
            String d;
            List<Pair<String, String>> a = new ArrayList();
            String c = "POST";
            int e = Wa.u;
            int f = Wa.u;
            String g = "UTF-8";

            C0205a() {
            }

            C0205a a(String str) {
                this.d = str;
                return this;
            }

            C0205a b(String str) {
                this.g = str;
                return this;
            }

            C0205a c(String str) {
                this.b = str;
                return this;
            }

            C0205a d(String str) {
                this.c = str;
                return this;
            }

            C0205a a(int i) {
                this.e = i;
                return this;
            }

            C0205a b(int i) {
                this.f = i;
                return this;
            }

            C0205a a(Pair<String, String> pair) {
                this.a.add(pair);
                return this;
            }

            C0205a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            a a() {
                return new a(this);
            }
        }

        public a(C0205a c0205a) {
            this.a = c0205a.b;
            this.b = c0205a.c;
            this.c = c0205a.d;
            this.g = new ArrayList<>(c0205a.a);
            this.d = c0205a.e;
            this.e = c0205a.f;
            this.f = c0205a.g;
        }

        boolean a() {
            return "POST".equals(this.b);
        }
    }

    public static Pd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0205a c0205a = new a.C0205a();
        c0205a.c(build.toString()).a(str2).d("GET").a(list);
        return b(c0205a.a());
    }

    public static Pd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0205a c0205a = new a.C0205a();
        c0205a.c(str).a(str2).d("POST").a(list);
        return b(c0205a.a());
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a0: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:46:0x00a0 */
    public static com.ironsource.Pd b(com.ironsource.C2345b8.a r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C2345b8.b(com.ironsource.b8$a):com.ironsource.Pd");
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }
}
