package ta;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.view.d;
import com.google.android.material.shape.i;
import ia.l;
import ia.m;
import l.AbstractC5335a;
import sa.AbstractC6344a;

/* renamed from: ta.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6454b extends a.C0340a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f65802e = AbstractC5335a.f54996k;

    /* renamed from: f, reason: collision with root package name */
    public static final int f65803f = l.f48562a;

    /* renamed from: g, reason: collision with root package name */
    public static final int f65804g = ia.c.f48201F;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f65805c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f65806d;

    public C6454b(Context context) {
        this(context, 0);
    }

    public static Context q(Context context) {
        int r10 = r(context);
        Context d10 = La.a.d(context, null, f65802e, f65803f);
        return r10 == 0 ? d10 : new d(d10, r10);
    }

    public static int r(Context context) {
        TypedValue a10 = Ca.b.a(context, f65804g);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    public static int s(Context context, int i10) {
        return i10 == 0 ? r(context) : i10;
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C6454b setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C6454b h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.h(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C6454b i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.i(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C6454b j(DialogInterface.OnCancelListener onCancelListener) {
        return (C6454b) super.j(onCancelListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C6454b k(DialogInterface.OnDismissListener onDismissListener) {
        return (C6454b) super.k(onDismissListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C6454b l(DialogInterface.OnKeyListener onKeyListener) {
        return (C6454b) super.l(onKeyListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public C6454b setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C6454b m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.m(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C6454b n(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.n(listAdapter, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C6454b o(int i10) {
        return (C6454b) super.o(i10);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public C6454b setTitle(CharSequence charSequence) {
        return (C6454b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C6454b setView(View view) {
        return (C6454b) super.setView(view);
    }

    @Override // androidx.appcompat.app.a.C0340a
    public androidx.appcompat.app.a create() {
        androidx.appcompat.app.a create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f65805c;
        if (drawable instanceof i) {
            ((i) drawable).e0(decorView.getElevation());
        }
        window.setBackgroundDrawable(AbstractC6455c.b(this.f65805c, this.f65806d));
        decorView.setOnTouchListener(new ViewOnTouchListenerC6453a(create, this.f65806d));
        return create;
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C6454b a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.a(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C6454b b(boolean z10) {
        return (C6454b) super.b(z10);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C6454b c(View view) {
        return (C6454b) super.c(view);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C6454b d(Drawable drawable) {
        return (C6454b) super.d(drawable);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C6454b e(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (C6454b) super.e(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C6454b f(int i10) {
        return (C6454b) super.f(i10);
    }

    @Override // androidx.appcompat.app.a.C0340a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C6454b g(CharSequence charSequence) {
        return (C6454b) super.g(charSequence);
    }

    public C6454b(Context context, int i10) {
        super(q(context), s(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f65802e;
        int i12 = f65803f;
        this.f65806d = AbstractC6455c.a(context2, i11, i12);
        int c10 = AbstractC6344a.c(context2, ia.c.f48260t, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, m.MaterialAlertDialog, i11, i12);
        int color = obtainStyledAttributes.getColor(m.f48741P2, c10);
        obtainStyledAttributes.recycle();
        i iVar = new i(context2, null, i11, i12);
        iVar.T(context2);
        iVar.f0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                iVar.b0(dimension);
            }
        }
        this.f65805c = iVar;
    }
}
