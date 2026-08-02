package v8;

import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: v8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6653b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6653b f67067a = new C6653b();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f67068b = MapsKt.hashMapOf(TuplesKt.to(String.class, new a()), TuplesKt.to(String[].class, new C0939b()), TuplesKt.to(JSONArray.class, new c()));

    /* renamed from: v8.b$a */
    public static final class a implements d {
        @Override // v8.C6653b.d
        public void a(JSONObject json, String key, Object obj) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            json.put(key, obj);
        }
    }

    /* renamed from: v8.b$b, reason: collision with other inner class name */
    public static final class C0939b implements d {
        @Override // v8.C6653b.d
        public void a(JSONObject json, String key, Object obj) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            JSONArray jSONArray = new JSONArray();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            }
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                jSONArray.put(str);
            }
            json.put(key, jSONArray);
        }
    }

    /* renamed from: v8.b$c */
    public static final class c implements d {
        @Override // v8.C6653b.d
        public void a(JSONObject json, String key, Object obj) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    /* renamed from: v8.b$d */
    public interface d {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    public static final JSONObject a(CameraEffectArguments cameraEffectArguments) {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.c()) {
            Object b10 = cameraEffectArguments.b(str);
            if (b10 != null) {
                d dVar = (d) f67068b.get(b10.getClass());
                if (dVar == null) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Unsupported type: ", b10.getClass()));
                }
                dVar.a(jSONObject, str, b10);
            }
        }
        return jSONObject;
    }
}
