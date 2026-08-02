package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sc extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f26054l;

    /* renamed from: m, reason: collision with root package name */
    public final long f26055m;

    /* renamed from: n, reason: collision with root package name */
    public final List f26056n;

    /* renamed from: o, reason: collision with root package name */
    public final c9 f26057o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(ue serverConfigStorageProvider, String urlBase, String str, ArrayList campaignIds, long j10, List dedupeIds) {
        super(new kd(urlBase + "push/redeliver", false), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        Intrinsics.checkNotNullParameter(dedupeIds, "dedupeIds");
        this.f26054l = campaignIds;
        this.f26055m = j10;
        this.f26056n = dedupeIds;
        this.f26057o = c9.f25341k;
    }

    public static final String l() {
        return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
    }

    public static final String m() {
        return "PushMaxSendRequest executed successfully.";
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
            }
            a10.put("campaign_ids", new JSONArray((Collection) this.f26054l));
            a10.put("last_sync_at", this.f26055m);
            if (!this.f26056n.isEmpty()) {
                a10.put("dedupe_ids", new JSONArray((Collection) this.f26056n));
            }
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.Na
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.sc.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f26057o;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher, m9 externalPublisher, nb apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Oa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.sc.m();
            }
        }, 7, (Object) null);
        long j10 = apiResponse.f25821o;
        if (j10 != -1) {
            internalPublisher.b(new rc(j10), rc.class);
        }
    }
}
