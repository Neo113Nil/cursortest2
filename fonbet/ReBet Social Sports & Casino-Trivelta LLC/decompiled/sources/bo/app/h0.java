package bo.app;

import com.braze.models.BannerPendingDismissal;
import com.braze.support.BrazeLogger;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f25497l;

    /* renamed from: m, reason: collision with root package name */
    public final List f25498m;

    /* renamed from: n, reason: collision with root package name */
    public final c9 f25499n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ArrayList ids, List pendingDismissals, ue serverConfigStorageProvider, String urlBase, String str) {
        super(new kd(urlBase + "banners/sync", false), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(pendingDismissals, "pendingDismissals");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f25497l = ids;
        this.f25498m = pendingDismissals;
        this.f25499n = c9.f25342l;
    }

    public static final String l() {
        return "Experienced JSONException while creating Banners Sync request. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f25497l;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StackTraceHelper.ID_KEY, ((Pair) obj).getFirst());
                jSONArray.put(jSONObject);
            }
            String str = this.f25541b;
            if (str != null && !StringsKt.isBlank(str)) {
                a10.put("user_id", this.f25541b);
            }
            Object obj2 = this.f25545f;
            if (obj2 != null) {
                a10.put("time_ms", obj2);
            }
            a10.put("placements", jSONArray);
            if (!this.f25498m.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (BannerPendingDismissal bannerPendingDismissal : this.f25498m) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("banner_id", bannerPendingDismissal.getBannerId());
                    jSONObject2.put("stable_key", bannerPendingDismissal.getStableKey());
                    jSONObject2.put("dismissal_time", bannerPendingDismissal.getDismissalTimeMs());
                    jSONArray2.put(jSONObject2);
                }
                a10.put("pending_dismissals", jSONArray2);
            }
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.O2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.h0.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f25499n;
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.h0.a(bo.app.h0.this);
            }
        }, 6, (Object) null);
        internalPublisher.b(new g0(this), g0.class);
    }

    public static final String a(h0 h0Var) {
        return "BannersSyncRequest executed successfully. placements=" + h0Var.f25497l.size() + " pendingDismissals=" + h0Var.f25498m.size();
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher, m9 externalPublisher, final t9 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.P2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.h0.a(bo.app.h0.this, responseError);
            }
        }, 6, (Object) null);
        internalPublisher.b(new f0(), f0.class);
    }

    public static final String a(h0 h0Var, t9 t9Var) {
        return "BannersSyncRequest failed. placements=" + h0Var.f25497l.size() + " pendingDismissals=" + h0Var.f25498m.size() + " error=" + t9Var.a();
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-BannersRequest", "true");
    }
}
