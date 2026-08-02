package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import s7.C9619n;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f57989a = {R.attr.stateListAnimator};

    static void a(@NonNull AppBarLayout appBarLayout, AttributeSet attributeSet) {
        Context context = appBarLayout.getContext();
        TypedArray e11 = C9619n.e(context, attributeSet, f57989a, ru.ozon.app.android.R.attr.appBarLayoutStyle, ru.ozon.app.android.R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (e11.hasValue(0)) {
                appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, e11.getResourceId(0, 0)));
            }
            e11.recycle();
        } catch (Throwable th2) {
            e11.recycle();
            throw th2;
        }
    }
}
