package com.ironsource;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4362vc {

    @Nullable
    private final C4155k2 a;
    private final boolean b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.vc$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "adm";

        @NotNull
        public static final String c = "isOneFlow";

        @NotNull
        public static final String d = "isMultipleAdObjects";

        @NotNull
        public static final String e = "adsInternalInfo";

        @NotNull
        public static final String f = "success";

        @NotNull
        public static final String g = "error";

        @NotNull
        public static final String h = "data";

        private a() {
        }
    }

    public /* synthetic */ C4362vc(C4155k2 c4155k2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c4155k2, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final HashMap<String, String> a() {
        C4245p2 g;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isOneFlow", String.valueOf(this.b));
        hashMap.put("isMultipleAdObjects", "true");
        List<P> a2 = Ib.v.d().J().a();
        String jSONObject = a2 != null ? new JSONObject().put("success", true).put("data", a2).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        jSONObject.getClass();
        hashMap.put(a.e, jSONObject);
        C4155k2 c4155k2 = this.a;
        if (c4155k2 != null && (g = c4155k2.g()) != null) {
            hashMap.put("adm", g.a());
            hashMap.putAll(g.b());
        }
        return hashMap;
    }

    public C4362vc(@Nullable C4155k2 c4155k2, boolean z) {
        this.a = c4155k2;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4362vc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
