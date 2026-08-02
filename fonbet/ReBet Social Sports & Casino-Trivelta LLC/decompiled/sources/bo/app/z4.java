package bo.app;

import android.content.Context;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z4 extends b {

    /* renamed from: e, reason: collision with root package name */
    public static final y4 f26342e = new y4();

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f26343b;

    /* renamed from: c, reason: collision with root package name */
    public final a5 f26344c;

    /* renamed from: d, reason: collision with root package name */
    public x4 f26345d;

    public z4(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26343b = new BrazeConfigurationProvider(context);
        this.f26344c = new a5(context, str, str2);
    }

    public static final String a(boolean z10, boolean z11) {
        return "Exporting the full device due to either: shouldSendFullDeviceOnNextExport: " + z10 + ", shouldReportPushPermissionsAsGranted: " + z11;
    }

    public static final String d() {
        return "Caught exception confirming and unlocking device cache.";
    }

    public static final String f() {
        return "Sending full device on next export but keeping cache intact.";
    }

    public static final String h() {
        return "Caught exception confirming and unlocking JSON objects.";
    }

    public static final String i() {
        return "Failed to generate diff between the cached and live device. Returning the live device.";
    }

    public static final String j() {
        return "Remote Notification Enabled changed to true. Updating user subscription.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Bd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.z4.f();
            }
        }, 6, (Object) null);
        this.f26344c.writeData(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.TRUE);
    }

    @Override // bo.app.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final x4 c() {
        JSONObject jsonObject;
        JSONObject jSONObject = new JSONObject();
        x4 x4Var = this.f26345d;
        JSONObject key = x4Var != null ? x4Var.getKey() : new JSONObject();
        try {
            a5 a5Var = this.f26344c;
            int i10 = a5.f25246e;
            String str = "{}";
            a5Var.getClass();
            Intrinsics.checkNotNullParameter("{}", "defaultValue");
            String readString = a5Var.readString(DataStoreKey.CACHED_DEVICE, "{}");
            if (readString != null) {
                str = readString;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Dd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.z4.h();
                }
            }, 4, (Object) null);
        }
        a5 a5Var2 = this.f26344c;
        int i11 = Build.VERSION.SDK_INT;
        a5Var2.getClass();
        Integer readInt = a5Var2.readInt(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION, Integer.valueOf(i11));
        int intValue = readInt != null ? readInt.intValue() : i11;
        y4 y4Var = f26342e;
        final boolean a10 = y4Var.a(jSONObject, key, intValue, i11);
        a5 a5Var3 = this.f26344c;
        a5Var3.getClass();
        Boolean readBoolean = a5Var3.readBoolean(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.FALSE);
        final boolean booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
        if (booleanValue || a10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ed
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.z4.a(booleanValue, a10);
                }
            }, 7, (Object) null);
            jsonObject = y4Var.a(new JSONObject(), key);
        } else {
            jsonObject = y4Var.a(jSONObject, key);
        }
        if (jsonObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Fd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.z4.i();
                }
            }, 7, (Object) null);
            return this.f26345d;
        }
        BrazeConfigurationProvider configurationProvider = this.f26343b;
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str8 = null;
        Boolean bool3 = null;
        for (DeviceKey deviceKey : DeviceKey.getEntries()) {
            String key2 = deviceKey.getKey();
            switch (v4.f26140a[deviceKey.ordinal()]) {
                case 1:
                    str7 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 2:
                    str3 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 3:
                    str2 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 4:
                    str6 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 5:
                    String optionalString = JsonUtils.getOptionalString(jsonObject, key2);
                    if (optionalString != null && !StringsKt.isBlank(optionalString)) {
                        str4 = optionalString;
                        break;
                    }
                    break;
                case 6:
                    str5 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 7:
                    if (jsonObject.has(key2)) {
                        bool = Boolean.valueOf(jsonObject.optBoolean(key2, true));
                    }
                    Unit unit = Unit.INSTANCE;
                    break;
                case 8:
                    if (jsonObject.has(key2)) {
                        bool2 = Boolean.valueOf(jsonObject.optBoolean(key2, false));
                    }
                    Unit unit2 = Unit.INSTANCE;
                    break;
                case 9:
                    str8 = JsonUtils.getOptionalString(jsonObject, key2);
                    break;
                case 10:
                    if (jsonObject.has(key2)) {
                        bool3 = Boolean.valueOf(jsonObject.optBoolean(key2));
                    }
                    Unit unit3 = Unit.INSTANCE;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        x4 x4Var2 = new x4(configurationProvider, str2, str3, str4, str5, str6, str7, bool, bool2, str8, bool3);
        if (a10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Gd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.z4.j();
                }
            }, 6, (Object) null);
            x4Var2.f26246l = true;
        }
        return x4Var2;
    }

    @Override // bo.app.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(x4 outboundObject, boolean z10) {
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        if (z10) {
            try {
                a5 a5Var = this.f26344c;
                int i10 = a5.f25246e;
                String str = "{}";
                a5Var.getClass();
                Intrinsics.checkNotNullParameter("{}", "defaultValue");
                DataStoreKey dataStoreKey = DataStoreKey.CACHED_DEVICE;
                String readString = a5Var.readString(dataStoreKey, "{}");
                if (readString != null) {
                    str = readString;
                }
                String jSONObject = JsonUtils.mergeJsonObjects(new JSONObject(str), outboundObject.getKey()).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                this.f26344c.batchUpdate(MapsKt.mapOf(TuplesKt.to(dataStoreKey.getKey(), jSONObject), TuplesKt.to(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), Boolean.FALSE), TuplesKt.to(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey(), Integer.valueOf(Build.VERSION.SDK_INT))), SetsKt.emptySet());
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Cd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.z4.d();
                    }
                }, 4, (Object) null);
            }
        }
    }
}
