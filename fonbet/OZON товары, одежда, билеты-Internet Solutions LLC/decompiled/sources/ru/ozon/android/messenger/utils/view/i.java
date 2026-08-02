package ru.ozon.android.messenger.utils.view;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes10.dex */
public final class i implements VectorRatingBar.OnRatingBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private long f92007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Unit> f92008b;

    i(Function1 function1) {
        this.f92008b = function1;
    }

    @Override // ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(VectorRatingBar vectorRatingBar, float f7, boolean z11) {
        if (SystemClock.elapsedRealtime() - this.f92007a < 600 || !z11) {
            return;
        }
        this.f92007a = SystemClock.elapsedRealtime();
        int i11 = (int) f7;
        if (i11 < 1) {
            i11 = 1;
        }
        this.f92008b.invoke(Integer.valueOf(i11));
    }
}
