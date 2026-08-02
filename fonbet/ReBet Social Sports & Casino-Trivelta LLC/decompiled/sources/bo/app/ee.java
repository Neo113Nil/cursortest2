package bo.app;

import bo.app.ee;
import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ee extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f25436l;

    /* renamed from: m, reason: collision with root package name */
    public final c9 f25437m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ue serverConfigStorageProvider, String urlBase, String str, ArrayList logs) {
        super(new kd(urlBase + "debugger/log", true), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.f25436l = logs;
        this.f25437m = c9.f25344n;
    }

    public static final String d() {
        return "Experienced JSONException while creating SDK Debugger Log request. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            String str = this.f25541b;
            if (str != null && !StringsKt.isBlank(str)) {
                a10.put("user_id", this.f25541b);
            }
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f25436l;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                de deVar = (de) obj;
                deVar.getClass();
                jSONArray.put(new JSONObject().put("log", deVar.f25397a).put("time", deVar.f25398b));
            }
            a10.put(EventKeys.DATA, new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put(EventKeys.DATA, jSONArray)));
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, true, new Function0() { // from class: c3.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ee.d();
                }
            });
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f25437m;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return this.f25436l.isEmpty();
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher, m9 externalPublisher, final t9 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: c3.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ee.a(bo.app.t9.this);
            }
        }, 3, (Object) null);
        internalPublisher.b(new yd(new td()), yd.class);
    }

    public static final String a(t9 t9Var) {
        return "SDK Debugger Log Request failed " + t9Var.a() + ". Disabling SDK Debugger.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-Rec-Auth-Code", this.f25542c.z());
    }
}
