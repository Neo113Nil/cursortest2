package W6;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List f13071a = new ArrayList(2);

    public synchronized void a(d dVar) {
        this.f13071a.add(dVar);
    }

    public synchronized void b() {
        this.f13071a.clear();
    }

    public final synchronized void c(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    @Override // W6.d
    public synchronized void onFailure(String str, Throwable th2) {
        int size = this.f13071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f13071a.get(i10);
                if (dVar != null) {
                    dVar.onFailure(str, th2);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onFailure", e10);
            }
        }
    }

    @Override // W6.d
    public synchronized void onFinalImageSet(String str, Object obj, Animatable animatable) {
        int size = this.f13071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f13071a.get(i10);
                if (dVar != null) {
                    dVar.onFinalImageSet(str, obj, animatable);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    @Override // W6.d
    public void onIntermediateImageFailed(String str, Throwable th2) {
        int size = this.f13071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f13071a.get(i10);
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th2);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }

    @Override // W6.d
    public void onIntermediateImageSet(String str, Object obj) {
        int size = this.f13071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f13071a.get(i10);
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, obj);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    @Override // W6.d
    public synchronized void onRelease(String str) {
        int size = this.f13071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f13071a.get(i10);
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onRelease", e10);
            }
        }
    }

    @Override // W6.d
    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f13071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f13071a.get(i10);
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onSubmit", e10);
            }
        }
    }
}
