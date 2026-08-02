package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.AbstractC2082d0;
import n.AbstractC5596a;
import n0.AbstractC5597a;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2051f {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f17296a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f17297b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f17298c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17299d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17300e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17301f;

    public C2051f(CheckedTextView checkedTextView) {
        this.f17296a = checkedTextView;
    }

    public void a() {
        Drawable a10 = C0.b.a(this.f17296a);
        if (a10 != null) {
            if (this.f17299d || this.f17300e) {
                Drawable mutate = AbstractC5597a.r(a10).mutate();
                if (this.f17299d) {
                    AbstractC5597a.o(mutate, this.f17297b);
                }
                if (this.f17300e) {
                    AbstractC5597a.p(mutate, this.f17298c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f17296a.getDrawableState());
                }
                this.f17296a.setCheckMarkDrawable(mutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f17297b;
    }

    public PorterDuff.Mode c() {
        return this.f17298c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i10) {
        int n10;
        int n11;
        a0 v10 = a0.v(this.f17296a.getContext(), attributeSet, l.j.CheckedTextView, i10, 0);
        CheckedTextView checkedTextView = this.f17296a;
        AbstractC2082d0.j0(checkedTextView, checkedTextView.getContext(), l.j.CheckedTextView, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(l.j.f55175C0) && (n11 = v10.n(l.j.f55175C0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f17296a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC5596a.b(checkedTextView2.getContext(), n11));
                } catch (Resources.NotFoundException unused) {
                }
                if (v10.s(l.j.f55179D0)) {
                    C0.b.b(this.f17296a, v10.c(l.j.f55179D0));
                }
                if (v10.s(l.j.f55183E0)) {
                    C0.b.c(this.f17296a, I.e(v10.k(l.j.f55183E0, -1), null));
                }
                v10.x();
            }
            if (v10.s(l.j.f55171B0) && (n10 = v10.n(l.j.f55171B0, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.f17296a;
                checkedTextView3.setCheckMarkDrawable(AbstractC5596a.b(checkedTextView3.getContext(), n10));
            }
            if (v10.s(l.j.f55179D0)) {
            }
            if (v10.s(l.j.f55183E0)) {
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    public void e() {
        if (this.f17301f) {
            this.f17301f = false;
        } else {
            this.f17301f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f17297b = colorStateList;
        this.f17299d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f17298c = mode;
        this.f17300e = true;
        a();
    }
}
