package com.ironsource;

import com.ironsource.InterfaceC2683u6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Ad {
    public static final a b = new a(null);
    public static final String c = "type";
    public static final String d = "single";
    public static final String e = "onShowSuccess";
    public static final String f = "onLoadSuccess";
    private final InterfaceC2683u6.c a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Ad(JSONObject features) {
        InterfaceC2683u6.c cVar;
        Intrinsics.checkNotNullParameter(features, "features");
        String optString = features.optString("type");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1900843810) {
                if (hashCode != -999907609) {
                    if (hashCode == -902265784 && optString.equals(d)) {
                        cVar = InterfaceC2683u6.c.SINGLE;
                    }
                } else if (optString.equals(e)) {
                    cVar = InterfaceC2683u6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                }
            } else if (optString.equals(f)) {
                cVar = InterfaceC2683u6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            }
            this.a = cVar;
        }
        cVar = null;
        this.a = cVar;
    }

    public final InterfaceC2683u6.c a() {
        return this.a;
    }
}
