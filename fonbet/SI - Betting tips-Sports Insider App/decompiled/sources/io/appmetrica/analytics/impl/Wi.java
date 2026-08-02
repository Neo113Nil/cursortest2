package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Wi extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0507tf f13111b;

    public Wi(@NonNull X4 x42) {
        this(x42, C0353na.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(p52.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f13111b.b(C0433qf.a(jSONObject));
        return false;
    }

    public Wi(X4 x42, C0507tf c0507tf) {
        super(x42);
        this.f13111b = c0507tf;
    }
}
