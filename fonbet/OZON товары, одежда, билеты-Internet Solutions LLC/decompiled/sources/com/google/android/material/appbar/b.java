package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import y7.C10856g;

/* loaded from: classes9.dex */
final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10856g f57955a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppBarLayout f57956b;

    b(AppBarLayout appBarLayout, C10856g c10856g) {
        this.f57956b = appBarLayout;
        this.f57955a = c10856g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        Drawable drawable;
        ArrayList arrayList;
        Drawable drawable2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f57955a.A(floatValue);
        AppBarLayout appBarLayout = this.f57956b;
        drawable = appBarLayout.f57898q;
        if (drawable instanceof C10856g) {
            drawable2 = appBarLayout.f57898q;
            ((C10856g) drawable2).A(floatValue);
        }
        arrayList = appBarLayout.f57896o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AppBarLayout.e) it.next()).onUpdate();
        }
    }
}
