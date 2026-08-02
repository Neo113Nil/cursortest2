package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class uo implements to {

    /* renamed from: a, reason: collision with root package name */
    public final C8 f14760a;

    public uo() {
        this(new C8());
    }

    @Override // io.appmetrica.analytics.impl.to
    @NonNull
    public final byte[] a(@NonNull N8 n82, @NonNull C0285kh c0285kh) {
        if (!((X4) c0285kh.f14132l).B() && !TextUtils.isEmpty(n82.f12631b)) {
            try {
                JSONObject jSONObject = new JSONObject(n82.f12631b);
                jSONObject.remove("preloadInfo");
                n82.f12631b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f14760a.a(n82, c0285kh);
    }

    public uo(C8 c8) {
        this.f14760a = c8;
    }
}
