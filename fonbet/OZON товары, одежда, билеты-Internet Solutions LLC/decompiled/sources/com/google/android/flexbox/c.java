package com.google.android.flexbox;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    int f57840e;

    /* renamed from: f, reason: collision with root package name */
    int f57841f;

    /* renamed from: g, reason: collision with root package name */
    int f57842g;

    /* renamed from: h, reason: collision with root package name */
    int f57843h;

    /* renamed from: i, reason: collision with root package name */
    int f57844i;

    /* renamed from: j, reason: collision with root package name */
    float f57845j;

    /* renamed from: k, reason: collision with root package name */
    float f57846k;

    /* renamed from: l, reason: collision with root package name */
    int f57847l;

    /* renamed from: m, reason: collision with root package name */
    int f57848m;

    /* renamed from: o, reason: collision with root package name */
    int f57850o;

    /* renamed from: p, reason: collision with root package name */
    int f57851p;

    /* renamed from: q, reason: collision with root package name */
    boolean f57852q;

    /* renamed from: r, reason: collision with root package name */
    boolean f57853r;

    /* renamed from: a, reason: collision with root package name */
    int f57836a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    int f57837b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    int f57838c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: d, reason: collision with root package name */
    int f57839d = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: n, reason: collision with root package name */
    ArrayList f57849n = new ArrayList();

    c() {
    }

    public final int a() {
        return this.f57843h;
    }

    public final int b() {
        return this.f57843h - this.f57844i;
    }

    final void c(View view, int i11, int i12, int i13, int i14) {
        b bVar = (b) view.getLayoutParams();
        this.f57836a = Math.min(this.f57836a, (view.getLeft() - bVar.M1()) - i11);
        this.f57837b = Math.min(this.f57837b, (view.getTop() - bVar.O()) - i12);
        this.f57838c = Math.max(this.f57838c, view.getRight() + bVar.V1() + i13);
        this.f57839d = Math.max(this.f57839d, view.getBottom() + bVar.o0() + i14);
    }
}
