package i6;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    final Set<Activity> f65881a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f65882b;

    i() {
    }

    @Override // i6.j
    public final void a(androidx.fragment.app.r rVar) {
        if (!this.f65882b && this.f65881a.add(rVar)) {
            View decorView = rVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new h(this, decorView));
        }
    }
}
