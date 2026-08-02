package l6;

import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5407b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f55620e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f55621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55622b;

    /* renamed from: c, reason: collision with root package name */
    public final List f55623c;

    /* renamed from: d, reason: collision with root package name */
    public final String f55624d;

    /* renamed from: l6.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C5407b(JSONObject component) {
        int length;
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f55621a = string;
        String optString = component.optString(EventKeys.VALUE_KEY);
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f55622b = optString;
        String optString2 = component.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f55624d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new C5408c(jSONObject));
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f55623c = arrayList;
    }

    public final String a() {
        return this.f55621a;
    }

    public final List b() {
        return this.f55623c;
    }

    public final String c() {
        return this.f55624d;
    }

    public final String d() {
        return this.f55622b;
    }
}
