package com.facebook.drawee.drawable;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.drawee.drawable.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3013d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f30416f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f30418b;

    /* renamed from: c, reason: collision with root package name */
    public ColorFilter f30419c;

    /* renamed from: a, reason: collision with root package name */
    public int f30417a = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f30420d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f30421e = -1;

    /* renamed from: com.facebook.drawee.drawable.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i10 = this.f30417a;
        if (i10 != -1) {
            drawable.setAlpha(i10);
        }
        if (this.f30418b) {
            drawable.setColorFilter(this.f30419c);
        }
        int i11 = this.f30420d;
        if (i11 != -1) {
            drawable.setDither(i11 != 0);
        }
        int i12 = this.f30421e;
        if (i12 != -1) {
            drawable.setFilterBitmap(i12 != 0);
        }
    }

    public final void b(int i10) {
        this.f30417a = i10;
    }

    public final void c(ColorFilter colorFilter) {
        this.f30419c = colorFilter;
        this.f30418b = colorFilter != null;
    }

    public final void d(boolean z10) {
        this.f30420d = z10 ? 1 : 0;
    }

    public final void e(boolean z10) {
        this.f30421e = z10 ? 1 : 0;
    }
}
