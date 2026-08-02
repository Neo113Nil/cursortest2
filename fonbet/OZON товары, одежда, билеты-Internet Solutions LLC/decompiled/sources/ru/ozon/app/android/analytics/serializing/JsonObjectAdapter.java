package ru.ozon.app.android.analytics.serializing;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import sf.C9681g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/analytics/serializing/JsonObjectAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/n;", "reader", "Lorg/json/JSONObject;", "fromJson", "(Lcom/squareup/moshi/n;)Lorg/json/JSONObject;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lorg/json/JSONObject;)V", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonObjectAdapter {
    @h
    public final JSONObject fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object t2 = reader.t();
        Map map = t2 instanceof Map ? (Map) t2 : null;
        if (map != null) {
            return new JSONObject(map);
        }
        return null;
    }

    @C
    public final void toJson(@NotNull x writer, JSONObject value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            C9681g c9681g = new C9681g();
            String jSONObject = value.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            c9681g.H0(jSONObject);
            writer.X(c9681g);
        }
    }
}
