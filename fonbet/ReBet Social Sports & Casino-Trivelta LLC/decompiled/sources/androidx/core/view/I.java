package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public int f19165a;

    /* renamed from: b, reason: collision with root package name */
    public int f19166b;

    public I(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f19165a | this.f19166b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f19166b = i10;
        } else {
            this.f19165a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f19166b = 0;
        } else {
            this.f19165a = 0;
        }
    }
}
