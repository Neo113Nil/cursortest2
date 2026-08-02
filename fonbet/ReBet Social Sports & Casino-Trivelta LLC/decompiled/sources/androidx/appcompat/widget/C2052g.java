package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC2082d0;
import n.AbstractC5596a;
import n0.AbstractC5597a;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2052g {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f17302a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f17303b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f17304c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17305d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17306e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17307f;

    public C2052g(CompoundButton compoundButton) {
        this.f17302a = compoundButton;
    }

    public void a() {
        Drawable a10 = C0.c.a(this.f17302a);
        if (a10 != null) {
            if (this.f17305d || this.f17306e) {
                Drawable mutate = AbstractC5597a.r(a10).mutate();
                if (this.f17305d) {
                    AbstractC5597a.o(mutate, this.f17303b);
                }
                if (this.f17306e) {
                    AbstractC5597a.p(mutate, this.f17304c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f17302a.getDrawableState());
                }
                this.f17302a.setButtonDrawable(mutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f17303b;
    }

    public PorterDuff.Mode c() {
        return this.f17304c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i10) {
        int n10;
        int n11;
        a0 v10 = a0.v(this.f17302a.getContext(), attributeSet, l.j.CompoundButton, i10, 0);
        CompoundButton compoundButton = this.f17302a;
        AbstractC2082d0.j0(compoundButton, compoundButton.getContext(), l.j.CompoundButton, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(l.j.f55191G0) && (n11 = v10.n(l.j.f55191G0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f17302a;
                    compoundButton2.setButtonDrawable(AbstractC5596a.b(compoundButton2.getContext(), n11));
                } catch (Resources.NotFoundException unused) {
                }
                if (v10.s(l.j.f55195H0)) {
                    C0.c.d(this.f17302a, v10.c(l.j.f55195H0));
                }
                if (v10.s(l.j.f55199I0)) {
                    C0.c.e(this.f17302a, I.e(v10.k(l.j.f55199I0, -1), null));
                }
                v10.x();
            }
            if (v10.s(l.j.f55187F0) && (n10 = v10.n(l.j.f55187F0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f17302a;
                compoundButton3.setButtonDrawable(AbstractC5596a.b(compoundButton3.getContext(), n10));
            }
            if (v10.s(l.j.f55195H0)) {
            }
            if (v10.s(l.j.f55199I0)) {
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    public void e() {
        if (this.f17307f) {
            this.f17307f = false;
        } else {
            this.f17307f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f17303b = colorStateList;
        this.f17305d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f17304c = mode;
        this.f17306e = true;
        a();
    }
}
