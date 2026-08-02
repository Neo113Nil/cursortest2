package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public r1 f1391a;

    public s1(int i5, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1391a = new q1(o1.b(i5, interpolator, j));
        } else {
            this.f1391a = new n1(i5, interpolator, j);
        }
    }
}
