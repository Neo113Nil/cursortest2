package bo.app;

import android.content.Context;
import bo.app.sf;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.twilio.voice.EventKeys;
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

/* loaded from: classes.dex */
public final class sf extends tg {

    /* renamed from: g, reason: collision with root package name */
    public final a9 f26058g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26059h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f26060i;

    /* renamed from: j, reason: collision with root package name */
    public long f26061j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(final JSONObject json, a9 brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f26060i = new ArrayList();
        this.f26061j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Sa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sf.a(json);
            }
        }, 7, (Object) null);
        this.f26058g = brazeManager;
        JSONObject jSONObject = json.getJSONObject(EventKeys.DATA);
        String string = jSONObject.getString("trigger_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f26059h = string;
        JSONArray optJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            a(optJSONArray, xc.f26270b);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            a(optJSONArray2, xc.f26269a);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            a(optJSONArray3, xc.f26271c);
        }
    }

    public static final String a(sf sfVar) {
        return "Posting templating request after delay of " + sfVar.f26029b.f25829d + " seconds.";
    }

    public static final String b() {
        return "Could not convert TemplatedTriggeredAction to JSON";
    }

    @Override // bo.app.rg, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getKey() {
        try {
            JSONObject key = super.getKey();
            if (key == null) {
                return null;
            }
            key.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.f26059h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList = this.f26060i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                wc wcVar = (wc) obj;
                int ordinal = wcVar.f26201a.ordinal();
                if (ordinal == 0) {
                    jSONArray2.put(wcVar.f26202b);
                } else if (ordinal == 1) {
                    jSONArray.put(wcVar.f26202b);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONArray3.put(wcVar.f26202b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            key.put(EventKeys.DATA, jSONObject);
            return key;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Ta
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return sf.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.y9
    public final ArrayList a() {
        return new ArrayList(this.f26060i);
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsing templated triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    @Override // bo.app.y9
    public final void a(Context context, r7 internalEventPublisher, v9 triggerEvent, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f26061j = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ua
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sf.a(sf.this);
            }
        }, 7, (Object) null);
        e2 e2Var = (e2) this.f26058g;
        e2Var.getClass();
        Intrinsics.checkNotNullParameter(this, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        e2Var.a(new pf(e2Var.f25410f, e2Var.f25409e.getBaseUrlForRequests(), this, triggerEvent, e2Var.f25406b));
    }

    public final void a(JSONArray jSONArray, xc xcVar) {
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new qf(jSONArray)), new rf(jSONArray)).iterator();
        while (it.hasNext()) {
            this.f26060i.add(new wc(xcVar, (String) it.next()));
        }
    }
}
