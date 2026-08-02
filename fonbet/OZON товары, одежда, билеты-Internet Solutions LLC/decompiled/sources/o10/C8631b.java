package o10;

import android.view.View;

/* renamed from: o10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8631b {

    /* renamed from: a, reason: collision with root package name */
    private final View f77610a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77611b;

    public C8631b(View view, int i11) {
        this.f77610a = view;
        this.f77611b = i11;
    }

    public final int a() {
        View view = this.f77610a;
        return (view != null ? view.getMeasuredHeight() : 0) - b();
    }

    public final int b() {
        View view = this.f77610a;
        return Math.min(this.f77611b, view != null ? view.getMeasuredHeight() : 0);
    }
}
