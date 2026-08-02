package com.braze.triggers.conditions.logical;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public abstract class b implements com.braze.triggers.conditions.c {
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f808a;

    public b(ArrayList arrayList) {
        this.f808a = arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONArray getJsonObject() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = this.f808a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.c) it.next()).getJsonObject());
            }
            return jSONArray;
        } catch (Exception e) {
            BrazeLogger.e(b, "Caught exception creating Json.", e);
            return jSONArray;
        }
    }
}
