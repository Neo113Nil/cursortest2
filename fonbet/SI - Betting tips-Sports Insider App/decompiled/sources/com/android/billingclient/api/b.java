package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.p1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3969a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3970b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f3971c;

    public /* synthetic */ b(Object obj) {
        this.f3969a = obj;
    }

    public d a() {
        if (((Context) this.f3969a) == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((x) this.f3971c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((m3.f) this.f3970b) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((m3.f) this.f3970b).getClass();
        if (((x) this.f3971c) == null) {
            m3.f fVar = (m3.f) this.f3970b;
            Context context = (Context) this.f3969a;
            return b() ? new o0(fVar, context) : new d(fVar, context);
        }
        m3.f fVar2 = (m3.f) this.f3970b;
        Context context2 = (Context) this.f3969a;
        x xVar = (x) this.f3971c;
        return b() ? new o0(fVar2, context2, xVar) : new d(fVar2, context2, xVar);
    }

    public boolean b() {
        Context context = (Context) this.f3969a;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e7) {
            p1.h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e7);
            return false;
        }
    }
}
