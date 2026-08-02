package androidx.customview.widget;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1549a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        switch (this.f1549a) {
        }
        float f10 = f6 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
