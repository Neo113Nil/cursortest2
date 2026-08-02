package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sbh {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;

    public sbh() {
        e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        nbh nbhVar = new nbh(f4, f5, f4, f5);
        nbhVar.f = this.e;
        nbhVar.g = f3;
        this.h.add(new lbh(nbhVar));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pbh) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        obh obhVar = new obh();
        obhVar.b = f;
        obhVar.c = f2;
        this.g.add(obhVar);
        mbh mbhVar = new mbh(obhVar, this.c, this.d);
        float b = mbhVar.b() + 270.0f;
        float b2 = mbhVar.b() + 270.0f;
        a(b);
        this.h.add(mbhVar);
        this.e = b2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3, float f4) {
        qbh qbhVar = new qbh();
        qbhVar.b = f;
        qbhVar.c = f2;
        qbhVar.d = f3;
        qbhVar.e = f4;
        this.g.add(qbhVar);
        this.i = true;
        this.c = f3;
        this.d = f4;
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
        this.i = false;
    }
}
