package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y3 extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public long f26314l;

    /* renamed from: m, reason: collision with root package name */
    public long f26315m;

    /* renamed from: n, reason: collision with root package name */
    public int f26316n;

    /* renamed from: o, reason: collision with root package name */
    public final c9 f26317o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ue serverConfigStorageProvider, String urlBase, long j10, long j11, String str, j2 requestInitiatedBy) {
        super(new kd(urlBase + "content_cards/sync", false), str, serverConfigStorageProvider, requestInitiatedBy);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        this.f26314l = j10;
        this.f26315m = j11;
        this.f26316n = 0;
        this.f26317o = c9.f25334d;
    }

    public static final String l() {
        return "Experienced JSONException while creating Content Cards request. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            a10.put("last_full_sync_at", this.f26315m);
            a10.put("last_card_updated_at", this.f26314l);
            String str = this.f25541b;
            if (str != null && !StringsKt.isBlank(str)) {
                a10.put("user_id", this.f25541b);
                return a10;
            }
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.fd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y3.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f26317o;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-ContentCardsRequest", "true");
        existingHeaders.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f26316n));
    }
}
