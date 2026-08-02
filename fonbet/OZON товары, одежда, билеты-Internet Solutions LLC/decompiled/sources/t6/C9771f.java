package t6;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import t6.C9772g;
import t6.InterfaceC9767b;
import u6.C9975a;
import v6.C10260d;
import v6.C10262f;
import v6.ServiceConnectionC10259c;
import w6.C10442a;
import x6.C10668f;

/* renamed from: t6.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9771f implements InterfaceC9767b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9767b.a f99214a;

    /* renamed from: b, reason: collision with root package name */
    private String f99215b;

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC10259c f99216c;

    private C9771f(ServiceConnectionC10259c serviceConnectionC10259c) {
        this.f99216c = serviceConnectionC10259c;
    }

    static C9771f d(ServiceConnectionC10259c serviceConnectionC10259c, String str) throws C9772g {
        C9772g.b bVar;
        C9771f c9771f = new C9771f(serviceConnectionC10259c);
        try {
            C10262f d11 = serviceConnectionC10259c.d(C10260d.f(C10668f.c(new K9.b(str, 1, 3))));
            if (!d11.d()) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(d11.a());
                        w6.b bVar2 = new w6.b(jSONObject.getString("sessionId"), jSONObject.getString("walletId"), jSONObject.getString("deviceId"));
                        c9771f.f99214a = new InterfaceC9767b.a(bVar2.a(), bVar2.c());
                        c9771f.f99215b = bVar2.b();
                        return c9771f;
                    } catch (JSONException e11) {
                        throw new w6.c("Failed to deserialize HostInfoResponse", e11);
                    }
                } catch (w6.c e12) {
                    throw new C9772g("Failed to serialize request", C9772g.b.INTERNAL_ERROR, e12);
                }
            }
            C10262f.a c11 = d11.c();
            switch (C9772g.a.f99218a[c11.ordinal()]) {
                case 1:
                    bVar = C9772g.b.SETUP_NOT_COMPLETE;
                    break;
                case 2:
                    bVar = C9772g.b.APP_UPDATE_REQUIRED;
                    break;
                case 3:
                    bVar = C9772g.b.SECURITY_ISSUE;
                    break;
                case 4:
                    bVar = C9772g.b.SDK_UPDATE_REQUIRED;
                    break;
                case 5:
                    bVar = C9772g.b.SDK_WRONG_VERSION;
                    break;
                case 6:
                    bVar = C9772g.b.ACCESS_DENIED;
                    break;
                case 7:
                    bVar = C9772g.b.INTERNAL_ERROR;
                    break;
                case 8:
                    bVar = C9772g.b.DISCONNECTED;
                    break;
                default:
                    throw new IllegalArgumentException("No matching error for result: " + c11);
            }
            throw new C9772g("Failed to initialize connection", bVar);
        } catch (w6.c e13) {
            throw new C9772g("Failed to serialize request", C9772g.b.INTERNAL_ERROR, e13);
        }
    }

    @Override // t6.InterfaceC9767b
    public final List<C9975a> a() throws C9772g {
        C10262f d11 = this.f99216c.d(C10260d.b(this.f99215b));
        if (d11.d() && d11.c() != C10262f.a.ERROR_MIRPAY_NO_AVAILABLE_PAYMENT_CARD) {
            throw new C9772g("Failed to get cards", C9772g.b.INTERNAL_ERROR);
        }
        ArrayList arrayList = new ArrayList();
        String a11 = d11.d() ? null : d11.a();
        if (a11 == null) {
            return arrayList;
        }
        try {
            return C10668f.a(a11);
        } catch (w6.c e11) {
            throw new C9772g("Failed to serialize request", C9772g.b.INTERNAL_ERROR, e11);
        }
    }

    @Override // t6.InterfaceC9767b
    public final InterfaceC9767b.a b() {
        return this.f99214a;
    }

    @Override // t6.InterfaceC9767b
    public final Intent c(String str) throws C9772g {
        try {
            return this.f99216c.d(C10260d.a(this.f99215b, C10668f.b(new C10442a(str)))).b();
        } catch (w6.c e11) {
            throw new C9772g("Failed to serialize request", C9772g.b.INTERNAL_ERROR, e11);
        }
    }

    @Override // t6.InterfaceC9767b
    public final void disconnect() throws C9772g {
        this.f99216c.c();
    }
}
