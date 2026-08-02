package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;
import s.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f1772i = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public final x5.h f1777e;

    /* renamed from: h, reason: collision with root package name */
    public b f1780h;

    /* renamed from: a, reason: collision with root package name */
    public final n f1773a = new n(0);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1774b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final h9.c f1775c = new h9.c(11, this);

    /* renamed from: d, reason: collision with root package name */
    public final aa.c f1776d = new aa.c(2, this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f1778f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f1779g = 1.0f;

    public d(x5.h hVar) {
        this.f1777e = hVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, androidx.dynamicanimation.animation.a] */
    public final void a(l lVar) {
        ArrayList arrayList = this.f1774b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f1777e.f25409a).postFrameCallback(new c(this.f1776d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.f1779g = ValueAnimator.getDurationScale();
                if (this.f1780h == null) {
                    this.f1780h = new b(this);
                }
                final b bVar = this.f1780h;
                if (bVar.f1768a == null) {
                    ?? r22 = new ValueAnimator.DurationScaleChangeListener() { // from class: androidx.dynamicanimation.animation.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f6) {
                            b.this.f1769b.f1779g = f6;
                        }
                    };
                    bVar.f1768a = r22;
                    ValueAnimator.registerDurationScaleChangeListener(r22);
                }
            }
        }
        if (arrayList.contains(lVar)) {
            return;
        }
        arrayList.add(lVar);
    }
}
