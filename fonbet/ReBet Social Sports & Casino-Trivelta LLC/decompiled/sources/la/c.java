package la;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class c extends f {
    @Override // la.f
    public int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override // la.f
    public int b() {
        return 0;
    }

    @Override // la.f
    public int c() {
        return 2;
    }

    @Override // la.f
    public ViewPropertyAnimator d(View view, int i10) {
        return view.animate().translationX(-i10);
    }

    @Override // la.f
    public void e(View view, int i10) {
        view.setTranslationX(-i10);
    }
}
