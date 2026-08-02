package k;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends d5 {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectAnimator f18591a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18592b;

    public c(AnimationDrawable animationDrawable, boolean z5, boolean z7) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i5 = z5 ? numberOfFrames - 1 : 0;
        int i10 = z5 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f18594b = numberOfFrames2;
        int[] iArr = dVar.f18593a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f18593a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f18593a;
        int i11 = 0;
        for (int i12 = 0; i12 < numberOfFrames2; i12++) {
            int duration = animationDrawable.getDuration(z5 ? (numberOfFrames2 - i12) - 1 : i12);
            iArr2[i12] = duration;
            i11 += duration;
        }
        dVar.f18595c = i11;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i5, i10);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(dVar.f18595c);
        ofInt.setInterpolator(dVar);
        this.f18592b = z7;
        this.f18591a = ofInt;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void Q() {
        this.f18591a.reverse();
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void U() {
        this.f18591a.start();
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void V() {
        this.f18591a.cancel();
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final boolean e() {
        return this.f18592b;
    }
}
