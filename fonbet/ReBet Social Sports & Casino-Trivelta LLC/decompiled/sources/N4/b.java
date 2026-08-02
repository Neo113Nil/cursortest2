package N4;

import N4.d;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* loaded from: classes2.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f7900a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7901b;

    public b(int i10, boolean z10) {
        this.f7900a = i10;
        this.f7901b = z10;
    }

    @Override // N4.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, d.a aVar) {
        Drawable f10 = aVar.f();
        if (f10 == null) {
            f10 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{f10, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f7901b);
        transitionDrawable.startTransition(this.f7900a);
        aVar.setDrawable(transitionDrawable);
        return true;
    }
}
