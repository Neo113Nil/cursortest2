package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements d {
    public final HashSet a = new HashSet();
    public final boolean b;

    public c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.a.add(Long.valueOf(optLong));
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.a.isEmpty() || eVar.a == null) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.a)) {
                return !this.b;
            }
        }
        return this.b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.a, Boolean.valueOf(this.b));
    }
}
