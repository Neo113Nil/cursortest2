package o7;

import Ve.Iq;
import Ve.Jq;
import Wg0.c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.f;
import androidx.appcompat.view.d;
import androidx.core.view.Y;
import androidx.fragment.app.r;
import i7.C7017a;
import ru.ozon.app.android.R;
import s7.C9619n;
import y7.C10856g;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8656b extends f.a {

    /* renamed from: c, reason: collision with root package name */
    private C10856g f77786c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final Rect f77787d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8656b(@NonNull r rVar, int i11) {
        super(r8, r1);
        int i12;
        TypedValue a11 = v7.b.a(R.attr.materialAlertDialogTheme, rVar);
        int i13 = a11 == null ? 0 : a11.data;
        Context a12 = B7.a.a(rVar, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        a12 = i13 != 0 ? new d(a12, i13) : a12;
        if (i11 == 0) {
            TypedValue a13 = v7.b.a(R.attr.materialAlertDialogTheme, rVar);
            i12 = a13 == null ? 0 : a13.data;
        } else {
            i12 = i11;
        }
        Context context = getContext();
        Resources.Theme theme = context.getTheme();
        TypedArray e11 = C9619n.e(context, null, C7017a.f65952r, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = e11.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = e11.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = e11.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = e11.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        e11.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f77787d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int b11 = v7.b.b(context, R.attr.colorSurface, C8656b.class.getCanonicalName());
        C10856g c10856g = new C10856g(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        c10856g.v(context);
        c10856g.B(ColorStateList.valueOf(b11));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c10856g.y(dimension);
            }
        }
        this.f77786c = c10856g;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a b(boolean z11) {
        super.b(z11);
        return this;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a c(View view) {
        throw null;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f create() {
        f create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        C10856g c10856g = this.f77786c;
        if (c10856g != null) {
            c10856g.A(Y.k(decorView));
        }
        Rect rect = this.f77787d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c10856g, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC8655a(create, rect));
        return create;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a d(Drawable drawable) {
        super.d(drawable);
        return this;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a e(int i11) {
        throw null;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a f(CharSequence charSequence) {
        super.f(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a i(c cVar) {
        super.i(cVar);
        return this;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a j(DialogInterface.OnCancelListener onCancelListener) {
        throw null;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a k(DialogInterface.OnDismissListener onDismissListener) {
        throw null;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a l(DialogInterface.OnKeyListener onKeyListener) {
        throw null;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.m(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a n(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a p(int i11) {
        throw null;
    }

    @NonNull
    public final void r(String str) {
        super.f(str);
    }

    @NonNull
    public final void s(String str, Iq iq2) {
        super.h(str, iq2);
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
        return (C8656b) super.setNegativeButton(i11, onClickListener);
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
        return (C8656b) super.setPositiveButton(i11, onClickListener);
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a setTitle(CharSequence charSequence) {
        return (C8656b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.f.a
    @NonNull
    public final f.a setView(View view) {
        return (C8656b) super.setView(view);
    }

    @NonNull
    public final void t(Jq jq2) {
        super.j(jq2);
    }

    @NonNull
    public final void u(String str, Ti.d dVar) {
        super.m(str, dVar);
    }

    @NonNull
    public final C8656b v(String str) {
        return (C8656b) super.setTitle(str);
    }
}
