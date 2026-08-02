package Lg;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static k f7188b = new k();

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f7189a;

    public static k d() {
        return f7188b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : c().getAll().entrySet()) {
            m.g(entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public final SharedPreferences c() {
        if (this.f7189a == null) {
            this.f7189a = Kg.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f7189a;
    }

    public void e(String str, boolean z10) {
        c().edit().putBoolean(str, z10).apply();
    }

    public void f(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }
}
