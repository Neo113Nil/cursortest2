package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o8a implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public o8a(y6b y6bVar, d6b d6bVar) {
        this.a = 1;
        d6bVar.getClass();
        this.c = y6bVar;
        this.d = d6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0l j0lVar;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((t8a) obj).t.N((p8a) obj2, this.b);
                break;
            case 1:
                if (!this.b) {
                    ((y6b) obj2).g((d6b) obj);
                    this.b = true;
                    break;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                jsk jskVar = swipeDismissBehavior.a;
                if (jskVar != null && jskVar.f()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.b && (j0lVar = swipeDismissBehavior.b) != null) {
                    j0lVar.r(view);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o8a(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = z;
    }
}
