package com.braze.triggers.actions;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f801a;
    public final com.braze.triggers.config.c b;
    public final boolean c;
    public com.braze.triggers.utils.b d;
    public final ArrayList e;

    public g(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f801a = json.getString("id");
        this.b = new com.braze.triggers.config.c(json);
        JSONArray jSONArray = json.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            com.braze.triggers.utils.c cVar = com.braze.triggers.utils.c.f822a;
            Intrinsics.checkNotNull(jSONArray);
            arrayList.addAll(com.braze.triggers.utils.c.a(jSONArray));
        }
        this.c = json.optBoolean("prefetch", true);
    }

    public static final String a(g gVar, com.braze.triggers.events.b bVar) {
        return "Triggered action " + gVar.f801a + " not eligible to be triggered by " + bVar.a() + " event. Current device time outside triggered action time window.";
    }

    public final boolean b(final com.braze.triggers.events.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if ((this.b.f810a != -1 && DateTimeUtils.nowInSeconds() <= this.b.f810a) || (this.b.b != -1 && DateTimeUtils.nowInSeconds() >= this.b.b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.g$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.a(g.this, event);
                }
            }, 7, (Object) null);
            return false;
        }
        Iterator it = this.e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((com.braze.triggers.conditions.d) it.next()).a(event)) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    public final String c() {
        return this.f801a;
    }

    public final com.braze.triggers.config.c d() {
        return this.b;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getJsonKey() {
        try {
            JSONObject jsonKey = this.b.getJsonKey();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put("id", this.f801a);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.d) it.next()).getJsonKey());
            }
            jsonKey.put("trigger_condition", jSONArray);
            jsonKey.put("prefetch", this.c);
            return jsonKey;
        } catch (JSONException unused) {
            return null;
        }
    }
}
