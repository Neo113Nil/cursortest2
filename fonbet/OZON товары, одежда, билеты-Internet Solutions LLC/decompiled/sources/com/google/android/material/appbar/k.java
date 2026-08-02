package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.Y;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final View f57985a;

    /* renamed from: b, reason: collision with root package name */
    private int f57986b;

    /* renamed from: c, reason: collision with root package name */
    private int f57987c;

    /* renamed from: d, reason: collision with root package name */
    private int f57988d;

    public k(View view) {
        this.f57985a = view;
    }

    final void a() {
        int i11 = this.f57988d;
        View view = this.f57985a;
        int top = i11 - (view.getTop() - this.f57986b);
        int i12 = Y.f42258g;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f57987c));
    }

    public final int b() {
        return this.f57986b;
    }

    public final int c() {
        return this.f57988d;
    }

    final void d() {
        View view = this.f57985a;
        this.f57986b = view.getTop();
        this.f57987c = view.getLeft();
    }

    public final boolean e(int i11) {
        if (this.f57988d == i11) {
            return false;
        }
        this.f57988d = i11;
        a();
        return true;
    }
}
