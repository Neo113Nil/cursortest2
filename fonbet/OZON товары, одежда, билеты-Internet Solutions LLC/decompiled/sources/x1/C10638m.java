package x1;

import android.view.MotionEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10638m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f104895a;

    /* renamed from: b, reason: collision with root package name */
    private final C10633h f104896b;

    /* renamed from: c, reason: collision with root package name */
    private final int f104897c;

    /* renamed from: d, reason: collision with root package name */
    private int f104898d;

    public C10638m() {
        throw null;
    }

    public C10638m(@NotNull List<x> list, C10633h c10633h) {
        this.f104895a = list;
        this.f104896b = c10633h;
        MotionEvent d11 = d();
        int i11 = 0;
        this.f104897c = d11 != null ? d11.getButtonState() : 0;
        MotionEvent d12 = d();
        if (d12 != null) {
            d12.getMetaState();
        }
        MotionEvent d13 = d();
        if (d13 != null) {
            int actionMasked = d13.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i11 = 6;
                                break;
                            case 9:
                                i11 = 4;
                                break;
                            case 10:
                                i11 = 5;
                                break;
                        }
                    }
                    i11 = 3;
                }
                i11 = 2;
            }
            i11 = 1;
        } else {
            int size = list.size();
            while (i11 < size) {
                x xVar = list.get(i11);
                if (C10639n.c(xVar)) {
                    i11 = 2;
                } else if (C10639n.a(xVar)) {
                    i11 = 1;
                } else {
                    i11++;
                }
            }
            i11 = 3;
        }
        this.f104898d = i11;
    }

    public final int a() {
        return this.f104897c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<x1.x>] */
    @NotNull
    public final List<x> b() {
        return this.f104895a;
    }

    public final C10633h c() {
        return this.f104896b;
    }

    public final MotionEvent d() {
        C10633h c10633h = this.f104896b;
        if (c10633h != null) {
            return c10633h.c();
        }
        return null;
    }

    public final int e() {
        return this.f104898d;
    }

    public final void f(int i11) {
        this.f104898d = i11;
    }
}
