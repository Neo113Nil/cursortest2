package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class e {
    public static Animator a(Context context, int i10) {
        return AnimatorInflater.loadAnimator(context, i10);
    }
}
