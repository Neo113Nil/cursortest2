package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class h implements d {
    public final HashSet a = new HashSet();
    public final boolean b;

    public h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.a.add(optString);
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.a.isEmpty() || eVar.c == null) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(eVar.c.value())) {
                return !this.b;
            }
        }
        return this.b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.a, Boolean.valueOf(this.b));
    }
}
