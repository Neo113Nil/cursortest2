package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.annotation.NonNull;
import z.C10946d;
import z.C10953k;

/* renamed from: v.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10081a1 {

    /* renamed from: e, reason: collision with root package name */
    private static final Size f101188e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    private static final Size f101189f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    private static final Size f101190g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f101191h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile C10081a1 f101192i;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final DisplayManager f101193a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Size f101194b = null;

    /* renamed from: c, reason: collision with root package name */
    private final C10953k f101195c = new C10953k();

    /* renamed from: d, reason: collision with root package name */
    private final C10946d f101196d = new C10946d();

    private C10081a1(@NonNull Context context) {
        this.f101193a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = M.c.f17199a;
        if (size.getHeight() * size.getWidth() < M.c.a(f101189f) && (size = this.f101196d.a()) == null) {
            size = f101190g;
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f101188e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        return this.f101195c.a(size);
    }

    @NonNull
    public static C10081a1 b(@NonNull Context context) {
        if (f101192i == null) {
            synchronized (f101191h) {
                try {
                    if (f101192i == null) {
                        f101192i = new C10081a1(context);
                    }
                } finally {
                }
            }
        }
        return f101192i;
    }

    private static Display d(@NonNull Display[] displayArr, boolean z11) {
        Display display = null;
        int i11 = -1;
        for (Display display2 : displayArr) {
            if (!z11 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i12 = point.x * point.y;
                if (i12 > i11) {
                    display = display2;
                    i11 = i12;
                }
            }
        }
        return display;
    }

    @NonNull
    public final Display c(boolean z11) {
        Display[] displays = this.f101193a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d11 = d(displays, z11);
        if (d11 == null && z11) {
            d11 = d(displays, false);
        }
        if (d11 != null) {
            return d11;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    @NonNull
    final Size e() {
        if (this.f101194b != null) {
            return this.f101194b;
        }
        this.f101194b = a();
        return this.f101194b;
    }

    final void f() {
        this.f101194b = a();
    }
}
