package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public a f1768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1769b;

    public b(d dVar) {
        this.f1769b = dVar;
    }

    public final boolean a() {
        boolean unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f1768a);
        this.f1768a = null;
        return unregisterDurationScaleChangeListener;
    }
}
