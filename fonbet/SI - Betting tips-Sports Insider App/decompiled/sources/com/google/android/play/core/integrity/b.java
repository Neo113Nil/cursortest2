package com.google.android.play.core.integrity;

import android.util.Base64;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import d8.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    public final g f6026a;

    public b(g gVar) {
        this.f6026a = gVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        g gVar = this.f6026a;
        d8.c cVar = gVar.f6041d;
        if (cVar == null) {
            return d5.p(new a(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.b(), 10);
            Long a7 = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof j) {
            }
            gVar.f6038a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            w7.g gVar2 = new w7.g();
            cVar.a().post(new q(cVar, gVar2, gVar2, new e(gVar, gVar2, decode, a7, gVar2, integrityTokenRequest)));
            return gVar2.f24979a;
        } catch (IllegalArgumentException e7) {
            return d5.p(new a(-13, e7));
        }
    }
}
