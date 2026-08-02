package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v5 extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final c9 f26141l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(ue serverConfigStorageProvider, String urlBase, String str) {
        super(new kd(urlBase + "dust/config", false), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f26141l = c9.f25345o;
    }

    public static final String l() {
        return "Experienced JSONException while creating DUST config request. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            String str = this.f25541b;
            if (str != null && !StringsKt.isBlank(str)) {
                a10.put("user_id", this.f25541b);
                return a10;
            }
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.Fb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.v5.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f26141l;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }
}
