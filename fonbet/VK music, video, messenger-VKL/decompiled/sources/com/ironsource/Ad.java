package com.ironsource;

import com.ironsource.InterfaceC4615w6;
import org.json.JSONObject;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Ad {
    public static final a b = new a(null);
    public static final String c = "type";
    public static final String d = "single";
    public static final String e = "onShowSuccess";
    public static final String f = "onLoadSuccess";
    private final InterfaceC4615w6.c a;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public Ad(JSONObject jSONObject) {
        InterfaceC4615w6.c cVar;
        String optString = jSONObject.optString("type");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1900843810) {
                if (hashCode != -999907609) {
                    if (hashCode == -902265784 && optString.equals(d)) {
                        cVar = InterfaceC4615w6.c.SINGLE;
                    }
                } else if (optString.equals(e)) {
                    cVar = InterfaceC4615w6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                }
            } else if (optString.equals(f)) {
                cVar = InterfaceC4615w6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            }
            this.a = cVar;
        }
        cVar = null;
        this.a = cVar;
    }

    public final InterfaceC4615w6.c a() {
        return this.a;
    }
}
