package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Nk {

    /* renamed from: a, reason: collision with root package name */
    public final String f12657a;

    /* renamed from: b, reason: collision with root package name */
    public final Ik f12658b;

    /* renamed from: c, reason: collision with root package name */
    public final Mk f12659c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f12660d;

    public Nk(Context context, Q4 q42) {
        q42.a();
        this.f12657a = "session_extras";
        this.f12658b = new Ik();
        this.f12659c = new Mk();
        this.f12660d = C0353na.k().B().a(context, q42);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f12660d.get(this.f12657a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f12658b.toModel(this.f12659c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Ik ik = this.f12658b;
        this.f12659c.getClass();
        return ik.toModel(new Kk());
    }
}
