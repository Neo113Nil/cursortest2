package e6;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends d6.j {

    /* renamed from: b, reason: collision with root package name */
    public final d6.g f8750b;

    public s(d6.g gVar) {
        this.f8750b = gVar;
    }

    public final x5.f a(x5.f fVar) {
        boolean z5 = true;
        if (!fVar.f4478i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z5 = false;
        }
        fVar.f4478i = z5;
        d6.g gVar = this.f8750b;
        e eVar = gVar.f8258k;
        eVar.getClass();
        w wVar = new w(new b0(fVar), eVar.f8701i.get(), gVar);
        com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
        h0Var.sendMessage(h0Var.obtainMessage(4, wVar));
        return fVar;
    }
}
