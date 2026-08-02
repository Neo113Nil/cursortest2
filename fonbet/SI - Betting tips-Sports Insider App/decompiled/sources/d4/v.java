package d4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements k {

    /* renamed from: a, reason: collision with root package name */
    public final ng.i f8157a;

    public v(ng.i iVar) {
        this.f8157a = iVar;
    }

    @Override // d4.k
    public final l a(f4.l lVar, q4.n nVar) {
        ImageDecoder.Source m6;
        Bitmap.Config a7 = q4.j.a(nVar);
        if ((a7 == Bitmap.Config.ARGB_8888 || a7 == Bitmap.Config.HARDWARE) && (m6 = com.google.firebase.messaging.u.m(lVar.f9459a, nVar, false)) != null) {
            return new y(m6, lVar.f9459a, nVar, this.f8157a);
        }
        return null;
    }
}
