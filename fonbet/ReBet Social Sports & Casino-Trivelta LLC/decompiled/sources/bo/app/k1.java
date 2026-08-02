package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.twilio.voice.EventKeys;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k1 implements y8 {

    /* renamed from: a, reason: collision with root package name */
    public final w7 f25632a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f25633b;

    /* renamed from: c, reason: collision with root package name */
    public final double f25634c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25635d;

    /* renamed from: e, reason: collision with root package name */
    public final ra f25636e;

    /* renamed from: f, reason: collision with root package name */
    public final ra f25637f;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f25631h = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(k1.class, "userId", "getUserId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(k1.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0))};

    /* renamed from: g, reason: collision with root package name */
    public static final j1 f25630g = new j1();

    public k1(w7 type, JSONObject data, double d10, String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.f25632a = type;
        this.f25633b = data;
        this.f25634c = d10;
        this.f25635d = uniqueIdentifier;
        this.f25636e = new ra();
        this.f25637f = new ra();
        if (type == w7.f26167J) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    public static final String b() {
        return "Caught exception creating Braze event json";
    }

    public final void a(ye yeVar) {
        this.f25637f.setValue(this, f25631h[1], yeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f25635d, ((k1) obj).f25635d);
    }

    public final int hashCode() {
        return this.f25635d.hashCode();
    }

    public final String toString() {
        String jSONObject = getPropertiesJSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f25632a.f26194a);
            jSONObject.put(EventKeys.DATA, this.f25633b);
            jSONObject.put("time", this.f25634c);
            ra raVar = this.f25636e;
            KProperty[] kPropertyArr = f25631h;
            KProperty property = kPropertyArr[0];
            raVar.getClass();
            Intrinsics.checkNotNullParameter(this, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            String str = (String) raVar.f25987a;
            if (str != null && str.length() != 0) {
                ra raVar2 = this.f25636e;
                KProperty property2 = kPropertyArr[0];
                raVar2.getClass();
                Intrinsics.checkNotNullParameter(this, "thisRef");
                Intrinsics.checkNotNullParameter(property2, "property");
                jSONObject.put("user_id", (String) raVar2.f25987a);
            }
            ra raVar3 = this.f25637f;
            KProperty property3 = kPropertyArr[1];
            raVar3.getClass();
            Intrinsics.checkNotNullParameter(this, "thisRef");
            Intrinsics.checkNotNullParameter(property3, "property");
            ye yeVar = (ye) raVar3.f25987a;
            if (yeVar != null) {
                jSONObject.put("session_id", yeVar.f26327b);
            }
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.B4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k1.b();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ k1(w7 w7Var, JSONObject jSONObject, double d10, int i10) {
        this(w7Var, r2, d10, r5);
        JSONObject jSONObject2 = (i10 & 2) != 0 ? new JSONObject() : jSONObject;
        d10 = (i10 & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d10;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
    }
}
