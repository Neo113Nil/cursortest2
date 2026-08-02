package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public final ArrayList a(final JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (final int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject jSONObject = jsonArray.getJSONObject(i10);
                String string = jSONObject.getString("banner_id");
                long j10 = jSONObject.getLong("dismissal_time");
                Intrinsics.checkNotNull(string);
                arrayList.add(new d(string, j10));
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.c.a(i10, jsonArray);
                    }
                }, 4, (Object) null);
            }
        }
        return arrayList;
    }

    public static final String a(int i10, JSONArray jSONArray) {
        return "Skipping malformed acknowledged dismissal at index " + i10 + " in array " + jSONArray;
    }
}
