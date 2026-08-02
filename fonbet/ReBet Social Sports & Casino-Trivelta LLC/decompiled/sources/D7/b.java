package D7;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public abstract class b extends M6.b {
    public abstract void a(Bitmap bitmap);

    @Override // M6.b
    public void onNewResultImpl(M6.c cVar) {
        if (cVar.d()) {
            H6.a aVar = (H6.a) cVar.getResult();
            try {
                a((aVar == null || !(aVar.z0() instanceof H7.d)) ? null : ((H7.d) aVar.z0()).A1());
            } finally {
                H6.a.U(aVar);
            }
        }
    }
}
