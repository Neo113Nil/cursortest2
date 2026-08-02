package ad;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.G;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ad.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1933a extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final G f15122a;

    public C1933a(G mFragment) {
        Intrinsics.checkNotNullParameter(mFragment, "mFragment");
        this.f15122a = mFragment;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        super.applyTransformation(f10, t10);
        this.f15122a.m0(f10, !r3.isResumed());
    }
}
