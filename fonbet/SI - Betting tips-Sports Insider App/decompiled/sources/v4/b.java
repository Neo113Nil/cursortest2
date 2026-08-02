package v4;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import c4.v;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kh.h f24414a;

    public b(kh.h hVar) {
        this.f24414a = hVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        kh.h hVar = this.f24414a;
        synchronized (hVar) {
            if (((v) ((WeakReference) hVar.f19119b).get()) == null) {
                hVar.e();
            }
            Unit unit = Unit.f19194a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        l4.c d10;
        kh.h hVar = this.f24414a;
        synchronized (hVar) {
            try {
                v vVar = (v) ((WeakReference) hVar.f19119b).get();
                if (vVar != null) {
                    c4.r rVar = vVar.f3628a;
                    if (i5 >= 40) {
                        l4.c d11 = vVar.d();
                        if (d11 != null) {
                            d11.a();
                        }
                    } else if (i5 >= 20) {
                        ((a) hVar.f19120c).a(rVar.f3602a);
                    } else if (i5 >= 10 && (d10 = vVar.d()) != null) {
                        d10.e(d10.b() / 2);
                    }
                } else {
                    hVar.e();
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
