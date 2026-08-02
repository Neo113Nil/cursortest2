package com.ironsource;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.zcl;

/* renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4621wc {
    private final C4432m2 a;
    private final boolean b;

    /* renamed from: com.ironsource.wc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "adm";
        public static final String c = "isOneFlow";
        public static final String d = "isMultipleAdObjects";
        public static final String e = "adsInternalInfo";
        public static final String f = "success";
        public static final String g = "error";
        public static final String h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4621wc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final HashMap<String, String> a() {
        C4521r2 g;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isOneFlow", String.valueOf(this.b));
        hashMap.put("isMultipleAdObjects", "true");
        List<P> a2 = Kb.u.d().I().a();
        hashMap.put(a.e, a2 != null ? new JSONObject().put("success", true).put("data", a2).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString());
        C4432m2 c4432m2 = this.a;
        if (c4432m2 != null && (g = c4432m2.g()) != null) {
            hashMap.put("adm", g.a());
            hashMap.putAll(g.b());
        }
        return hashMap;
    }

    public C4621wc(C4432m2 c4432m2, boolean z) {
        this.a = c4432m2;
        this.b = z;
    }

    public /* synthetic */ C4621wc(C4432m2 c4432m2, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : c4432m2, (i & 2) != 0 ? false : z);
    }
}
