package o6;

import T7.C1681v;
import com.facebook.react.uimanager.ViewProps;
import g6.C4331C;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import q6.f;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5816a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5816a f59346a = new C5816a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f59347b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f59348c;

    public static final void a() {
        if (Y7.a.d(C5816a.class)) {
            return;
        }
        try {
            f59347b = true;
            C1681v c1681v = C1681v.f11207a;
            f59348c = C1681v.d("FBSDKFeatureIntegritySample", C4331C.m(), false);
        } catch (Throwable th2) {
            Y7.a.b(th2, C5816a.class);
        }
    }

    public static final void c(Map parameters) {
        if (Y7.a.d(C5816a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (!f59347b || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> list = CollectionsKt.toList(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : list) {
                    Object obj = parameters.get(str);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str2 = (String) obj;
                    C5816a c5816a = f59346a;
                    if (!c5816a.d(str) && !c5816a.d(str2)) {
                    }
                    parameters.remove(str);
                    if (!f59348c) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                }
                if (jSONObject.length() != 0) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", jSONObject2);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C5816a.class);
        }
    }

    public final String b(String str) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            f fVar = f.f63425a;
            String[] q10 = f.q(f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q10 == null) {
                return ViewProps.NONE;
            }
            String str2 = q10[0];
            return str2 == null ? ViewProps.NONE : str2;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final boolean d(String str) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return !Intrinsics.areEqual(ViewProps.NONE, b(str));
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
