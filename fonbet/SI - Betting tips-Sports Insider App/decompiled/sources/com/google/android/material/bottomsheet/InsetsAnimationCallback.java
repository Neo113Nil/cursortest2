package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.i1;
import androidx.core.view.j1;
import androidx.core.view.k2;
import androidx.core.view.s1;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class InsetsAnimationCallback extends j1 {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation = new int[2];
    private final View view;

    public InsetsAnimationCallback(View view) {
        this.view = view;
    }

    @Override // androidx.core.view.j1
    public void onEnd(@NonNull s1 s1Var) {
        this.view.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.j1
    public void onPrepare(@NonNull s1 s1Var) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // androidx.core.view.j1
    @NonNull
    public k2 onProgress(@NonNull k2 k2Var, @NonNull List<s1> list) {
        Iterator<s1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().f1391a.d() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, r0.f1391a.c()));
                break;
            }
        }
        return k2Var;
    }

    @Override // androidx.core.view.j1
    @NonNull
    public i1 onStart(@NonNull s1 s1Var, @NonNull i1 i1Var) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i5 = this.startY - this.tmpLocation[1];
        this.startTranslationY = i5;
        this.view.setTranslationY(i5);
        return i1Var;
    }
}
