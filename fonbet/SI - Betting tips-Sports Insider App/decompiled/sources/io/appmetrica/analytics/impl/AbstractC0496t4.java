package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0496t4 extends Ad {

    /* renamed from: f, reason: collision with root package name */
    public final Object f14664f;

    public AbstractC0496t4(int i5, String str, Object obj, so soVar, J2 j22) {
        super(i5, str, soVar, j22);
        this.f14664f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ad, io.appmetrica.analytics.impl.InterfaceC0137eo
    public final void a(@NonNull Cdo cdo) {
        if (f()) {
            J2 j22 = this.f11994d;
            int i5 = this.f11992b;
            C0163fo a7 = j22.a(cdo, (C0163fo) ((HashMap) cdo.f13622a.get(i5)).get(this.f11991a), this);
            if (a7 != null) {
                a(a7);
            }
        }
    }

    public abstract void a(@NonNull C0163fo c0163fo);

    @NonNull
    public final Object g() {
        return this.f14664f;
    }
}
