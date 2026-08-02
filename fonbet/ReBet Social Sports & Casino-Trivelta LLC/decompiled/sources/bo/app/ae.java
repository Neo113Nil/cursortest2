package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ae extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final c9 f25253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ue serverConfigStorageProvider, String urlBase, String str) {
        super(new kd(urlBase + "debugger/init", true), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f25253l = c9.f25343m;
    }

    public static final String l() {
        return "Experienced JSONException while creating SDK Initialization request. Returning null.";
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ae.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f25253l;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-Rec-Auth-Code", this.f25542c.z());
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher, m9 externalPublisher, final t9 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: c3.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.ae.a(bo.app.t9.this);
            }
        }, 3, (Object) null);
        internalPublisher.b(new yd(new td()), yd.class);
    }

    public static final String a(t9 t9Var) {
        return "SDK Debugger Initialization Request failed " + t9Var.a() + ". Disabling SDK Debugger.";
    }
}
