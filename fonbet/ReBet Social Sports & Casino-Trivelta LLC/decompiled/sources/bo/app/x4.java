package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x4 implements IPutIntoJson, l9 {

    /* renamed from: n, reason: collision with root package name */
    public static final w4 f26234n = new w4();

    /* renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f26235a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26237c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26238d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26239e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26240f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26241g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f26242h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f26243i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26244j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f26245k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26246l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26247m;

    public x4(BrazeConfigurationProvider configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f26235a = configurationProvider;
        this.f26236b = str;
        this.f26237c = str2;
        this.f26238d = str3;
        this.f26239e = str4;
        this.f26240f = str5;
        this.f26241g = str6;
        this.f26242h = bool;
        this.f26243i = bool2;
        this.f26244j = str7;
        this.f26245k = bool3;
        this.f26247m = true;
    }

    public static final String b() {
        return "Caught exception creating device Json.";
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        return getKey().length() == 0;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            w4 w4Var = f26234n;
            w4Var.a(this.f26235a, jSONObject, DeviceKey.ANDROID_VERSION, this.f26236b);
            w4Var.a(this.f26235a, jSONObject, DeviceKey.CARRIER, this.f26237c);
            w4Var.a(this.f26235a, jSONObject, DeviceKey.BRAND, this.f26238d);
            w4Var.a(this.f26235a, jSONObject, DeviceKey.MODEL, this.f26239e);
            w4Var.a(this.f26235a, jSONObject, DeviceKey.LOCALE, this.f26240f);
            if (this.f26247m) {
                w4Var.a(this.f26235a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.f26242h);
            }
            w4Var.a(this.f26235a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f26243i);
            w4Var.a(this.f26235a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f26244j);
            Boolean bool = this.f26245k;
            if (bool != null) {
                w4Var.a(this.f26235a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str = this.f26241g;
            if (str != null && !StringsKt.isBlank(str)) {
                w4Var.a(this.f26235a, jSONObject, DeviceKey.TIMEZONE, this.f26241g);
            }
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.mc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x4.b();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }
}
