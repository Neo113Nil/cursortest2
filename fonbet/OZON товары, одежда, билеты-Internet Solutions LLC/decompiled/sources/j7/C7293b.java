package j7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: j7.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7293b {
    public static void a(@NonNull AnimatorSet animatorSet, @NonNull ArrayList arrayList) {
        int size = arrayList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Animator animator = (Animator) arrayList.get(i11);
            j11 = Math.max(j11, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j11);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }
}
