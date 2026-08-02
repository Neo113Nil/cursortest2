package bo.app;

import bo.app.rg;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class rg implements y9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26028a;

    /* renamed from: b, reason: collision with root package name */
    public final nd f26029b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26030c;

    /* renamed from: d, reason: collision with root package name */
    public ng f26031d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f26032e;

    public rg(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        this.f26032e = arrayList;
        String string = json.getString(StackTraceHelper.ID_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f26028a = string;
        this.f26029b = new nd(json);
        JSONArray jSONArray = json.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            og ogVar = og.f25896a;
            Intrinsics.checkNotNull(jSONArray);
            arrayList.addAll(og.a(jSONArray));
        }
        this.f26030c = json.optBoolean("prefetch", true);
    }

    public static final String a(rg rgVar, v9 v9Var) {
        return "Triggered action " + rgVar.f26028a + " not eligible to be triggered by " + v9Var.a() + " event. Current device time outside triggered action time window.";
    }

    public final boolean b(final v9 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if ((this.f26029b.f25826a != -1 && DateTimeUtils.nowInSeconds() <= this.f26029b.f25826a) || (this.f26029b.f25827b != -1 && DateTimeUtils.nowInSeconds() >= this.f26029b.f25827b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ea
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return rg.a(rg.this, event);
                }
            }, 7, (Object) null);
            return false;
        }
        ArrayList arrayList = this.f26032e;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size) {
                i11 = -1;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((u9) obj).a(event)) {
                break;
            }
            i11++;
        }
        return i11 != -1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getJsonKey() {
        try {
            JSONObject jsonKey = this.f26029b.getJsonKey();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put(StackTraceHelper.ID_KEY, this.f26028a);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f26032e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((u9) obj).getJsonKey());
            }
            jsonKey.put("trigger_condition", jSONArray);
            jsonKey.put("prefetch", this.f26030c);
            return jsonKey;
        } catch (JSONException unused) {
            return null;
        }
    }
}
