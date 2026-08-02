package com.braze.triggers.actions;

import android.content.Context;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.requests.y;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f extends h {
    public final r g;
    public final String h;
    public final ArrayList i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(final JSONObject json, r brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.i = new ArrayList();
        this.j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(json);
            }
        }, 7, (Object) null);
        this.g = brazeManager;
        JSONObject jSONObject = json.getJSONObject("data");
        this.h = jSONObject.getString(InAppMessageBase.TRIGGER_ID);
        JSONArray optJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            a(optJSONArray, com.braze.triggers.enums.b.b);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            a(optJSONArray2, com.braze.triggers.enums.b.f812a);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            a(optJSONArray3, com.braze.triggers.enums.b.c);
        }
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsing templated triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final String e() {
        return "Could not convert TemplatedTriggeredAction to JSON";
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList b() {
        return new ArrayList(this.i);
    }

    public final String f() {
        return this.h;
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonKey() {
        try {
            JSONObject jsonKey = super.getJsonKey();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                com.braze.triggers.utils.a aVar = (com.braze.triggers.utils.a) it.next();
                int ordinal = aVar.f820a.ordinal();
                if (ordinal == 0) {
                    jSONArray2.put(aVar.b);
                } else if (ordinal == 1) {
                    jSONArray.put(aVar.b);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONArray3.put(aVar.b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            jsonKey.put("data", jSONObject);
            return jsonKey;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.actions.f$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.e();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final long g() {
        return this.j;
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e internalEventPublisher, com.braze.triggers.events.b triggerEvent, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.j = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.f$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(f.this);
            }
        }, 7, (Object) null);
        r rVar = this.g;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(this, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        rVar.a(new y(rVar.f, rVar.e.getBaseUrlForRequests(), this, triggerEvent, rVar.b));
    }

    public static final String a(f fVar) {
        return "Posting templating request after delay of " + fVar.d().d() + " seconds.";
    }

    public final void a(JSONArray jSONArray, com.braze.triggers.enums.b bVar) {
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new d(jSONArray)), new e(jSONArray)).iterator();
        while (it.hasNext()) {
            this.i.add(new com.braze.triggers.utils.a(bVar, (String) it.next()));
        }
    }
}
