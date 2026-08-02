package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import y7.C10856g;

/* loaded from: classes9.dex */
final class g extends d {

    static class a extends C10856g {
        @Override // y7.C10856g, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @NonNull
    private AnimatorSet G(float f7, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f7};
        FloatingActionButton floatingActionButton = this.f58394u;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(d.f58366B);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    final boolean B() {
        if (FloatingActionButton.this.f58337h) {
            return true;
        }
        return this.f58379f && this.f58394u.o() < this.f58383j;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    final void D() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float l() {
        return this.f58394u.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    final void n(@NonNull Rect rect) {
        if (FloatingActionButton.this.f58337h) {
            super.n(rect);
            return;
        }
        if (this.f58379f) {
            FloatingActionButton floatingActionButton = this.f58394u;
            int o11 = floatingActionButton.o();
            int i11 = this.f58383j;
            if (o11 < i11) {
                int o12 = (i11 - floatingActionButton.o()) / 2;
                rect.set(o12, o12, o12, o12);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    final void t(float f7, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.f58367C, G(f7, f12));
        stateListAnimator.addState(d.f58368D, G(f7, f11));
        stateListAnimator.addState(d.f58369E, G(f7, f11));
        stateListAnimator.addState(d.f58370F, G(f7, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {f7};
        FloatingActionButton floatingActionButton = this.f58394u;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.f58366B);
        stateListAnimator.addState(d.f58371G, animatorSet);
        stateListAnimator.addState(d.f58372H, G(0.0f, 0.0f));
        floatingActionButton.setStateListAnimator(stateListAnimator);
        if (B()) {
            F();
        }
    }
}
