package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2707vc {
    private final C2536m2 a;
    private final boolean b;

    /* renamed from: com.ironsource.vc$a */
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
    public C2707vc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final HashMap<String, String> a() {
        C2625r2 g;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isOneFlow", String.valueOf(this.b));
        hashMap.put("isMultipleAdObjects", "true");
        List<P> a2 = Jb.u.d().I().a();
        String jSONObject = a2 != null ? IronSourceNetworkBridge.jsonObjectInit().put("success", true).put("data", a2).toString() : IronSourceNetworkBridge.jsonObjectInit().put("success", false).put("error", "Failed to get ad internal info").toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "if (jsonAdInternalInfo !…    .toString()\n        }");
        hashMap.put(a.e, jSONObject);
        C2536m2 c2536m2 = this.a;
        if (c2536m2 != null && (g = c2536m2.g()) != null) {
            hashMap.put("adm", g.a());
            hashMap.putAll(g.b());
        }
        return hashMap;
    }

    public C2707vc(C2536m2 c2536m2, boolean z) {
        this.a = c2536m2;
        this.b = z;
    }

    public /* synthetic */ C2707vc(C2536m2 c2536m2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c2536m2, (i & 2) != 0 ? false : z);
    }
}
