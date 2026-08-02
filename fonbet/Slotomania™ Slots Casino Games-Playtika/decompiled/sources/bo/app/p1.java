package bo.app;

import com.braze.Constants;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lbo/app/p1;", "Lbo/app/s;", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/d;", "apiResponse", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "containsNoNewData", "Z", "c", "()Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "urlBase", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Ljava/lang/String;Lcom/braze/models/IBrazeLocation;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class p1 extends s {
    public static final a u = new a(null);
    private final x1 s;
    private final boolean t;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lbo/app/p1$a;", "", "", "LOCATION_EVENT", "Ljava/lang/String;", "URL_EXTENSION", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "GeofenceRefreshRequest executed successfully.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating geofence refresh request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(String urlBase, IBrazeLocation location) {
        super(new a5(Intrinsics.stringPlus(urlBase, "geofence/request")), null, 2, null);
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(location, "location");
        this.s = j.h.a(location);
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, d apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: c, reason: from getter */
    public boolean getT() {
        return this.t;
    }

    @Override // bo.app.s, bo.app.a2
    public JSONObject l() {
        JSONObject l = super.l();
        if (l == null) {
            return null;
        }
        try {
            x1 x1Var = this.s;
            if (x1Var == null) {
                return l;
            }
            l.put("location_event", x1Var.getKey());
            return l;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, c.b);
            return null;
        }
    }
}
