package com.ironsource;

import com.ironsource.InterfaceC4320t6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4435zd {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "type";

    @NotNull
    public static final String d = "single";

    @NotNull
    public static final String e = "onShowSuccess";

    @NotNull
    public static final String f = "onLoadSuccess";

    @Nullable
    private final InterfaceC4320t6.c a;

    public C4435zd(@NotNull JSONObject jSONObject) {
        InterfaceC4320t6.c cVar;
        jSONObject.getClass();
        String optString = jSONObject.optString("type");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1900843810) {
                if (hashCode != -999907609) {
                    if (hashCode == -902265784 && optString.equals(d)) {
                        cVar = InterfaceC4320t6.c.SINGLE;
                    }
                } else if (optString.equals(e)) {
                    cVar = InterfaceC4320t6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                }
            } else if (optString.equals(f)) {
                cVar = InterfaceC4320t6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            }
            this.a = cVar;
        }
        cVar = null;
        this.a = cVar;
    }

    @Nullable
    public final InterfaceC4320t6.c a() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.zd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
