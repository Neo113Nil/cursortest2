package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    public final w8 f26076a;

    public ta(w8 httpConnector) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        this.f26076a = httpConnector;
    }

    public static final String b(kd kdVar, Map map, JSONObject jSONObject) {
        Object[] requestArgs = {kdVar, map, jSONObject};
        String str = com.braze.support.h.f29485a;
        Intrinsics.checkNotNullParameter(requestArgs, "requestArgs");
        long j10 = 1;
        for (int i10 = 0; i10 < 3; i10++) {
            j10 *= requestArgs[i10].hashCode();
        }
        String hexString = Long.toHexString(j10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public final n9 a(final kd requestTarget, final Map requestHeaders, final JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: c3.gb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.ta.b(bo.app.kd.this, requestHeaders, payload);
            }
        });
        a(requestTarget, requestHeaders, lazy, payload);
        long currentTimeMillis = System.currentTimeMillis();
        n9 a10 = this.f26076a.a(requestTarget, requestHeaders, payload);
        a(lazy, requestTarget, a10.f25806b, a10.f25807c, System.currentTimeMillis() - currentTimeMillis);
        return a10;
    }

    public static final String b() {
        return "Exception while logging result: ";
    }

    public final void a(final kd kdVar, final Map map, final Lazy lazy, final JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, kdVar.f25670d, new Function0() { // from class: c3.cb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ta.a(Lazy.this, kdVar, this, map, jSONObject);
                }
            }, 3, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.db
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ta.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Lazy lazy, kd kdVar, ta taVar, Map map, JSONObject jSONObject) {
        String str;
        Object value = lazy.getValue();
        taVar.getClass();
        String a10 = a(map);
        if (jSONObject == null) {
            str = "";
        } else {
            str = "and JSON :\n" + JsonUtils.getPrettyPrintedString(jSONObject);
        }
        return StringsKt.trimMargin$default("\n                |Making request with id => \"" + value + "\"\n                |to url: " + kdVar + "\n                \n                |with headers:\n                " + a10 + "\n                |\n                |" + str + "\n                ", null, 1, null);
    }

    public static final String a() {
        return "Exception while logging request: ";
    }

    public final void a(final Lazy lazy, final kd kdVar, final Map map, final JSONObject jSONObject, final long j10) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.eb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ta.a(Lazy.this, kdVar, j10, this, map, jSONObject);
                }
            }, 7, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.fb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ta.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Lazy lazy, kd kdVar, long j10, ta taVar, Map map, JSONObject jSONObject) {
        Object value = lazy.getValue();
        taVar.getClass();
        return StringsKt.trimMargin$default("\n                |Made request with id => \"" + value + "\"\n                |to url: " + kdVar + "\n                |took: " + j10 + "ms\n                \n                |with response headers:\n                " + a(map) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(jSONObject) + "\n                ", null, 1, null);
    }

    public static String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("|\"" + ((String) entry.getKey()) + "\" => \"" + ((String) entry.getValue()) + "\"");
        }
        return CollectionsKt.joinToString$default(arrayList, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null);
    }
}
