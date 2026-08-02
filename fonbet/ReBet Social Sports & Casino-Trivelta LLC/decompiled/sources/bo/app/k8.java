package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k8 extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final c9 f25662l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(ue serverConfigStorageProvider, String urlBase, String str, j2 requestInitiatedBy) {
        super(new kd(urlBase + "feature_flags/sync", false), str, serverConfigStorageProvider, requestInitiatedBy);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        this.f25662l = c9.f25335e;
    }

    public static final String l() {
        return "Experienced JSONException while creating Feature Flags request. Returning null.";
    }

    public static final String m() {
        return "FeatureFlagsSyncRequest failed.";
    }

    public static final String n() {
        return "FeatureFlagsSyncRequest executed successfully.";
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.S4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k8.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f25662l;
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.U4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.k8.n();
            }
        }, 7, (Object) null);
        internalPublisher.b(new j8(this), j8.class);
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher, m9 externalPublisher, t9 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.T4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.k8.m();
            }
        }, 6, (Object) null);
        internalPublisher.b(new i8(), i8.class);
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
