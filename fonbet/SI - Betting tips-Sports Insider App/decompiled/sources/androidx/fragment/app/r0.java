package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2055a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2056b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2057c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2058d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2059e;

    public r0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2059e = true;
        this.f2055a = viewGroup;
        this.f2056b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f2059e = true;
        if (this.f2057c) {
            return !this.f2058d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f2057c = true;
            androidx.core.view.z.a(this.f2055a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5 = this.f2057c;
        ViewGroup viewGroup = this.f2055a;
        if (z5 || !this.f2059e) {
            viewGroup.endViewTransition(this.f2056b);
            this.f2058d = true;
        } else {
            this.f2059e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f6) {
        this.f2059e = true;
        if (this.f2057c) {
            return !this.f2058d;
        }
        if (!super.getTransformation(j, transformation, f6)) {
            this.f2057c = true;
            androidx.core.view.z.a(this.f2055a, this);
        }
        return true;
    }
}
