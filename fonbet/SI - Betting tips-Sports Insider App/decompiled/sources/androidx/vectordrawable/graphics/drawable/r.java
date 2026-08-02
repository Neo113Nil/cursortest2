package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2842a;

    /* renamed from: b, reason: collision with root package name */
    public q f2843b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2844c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f2845d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2846e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f2847f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2848g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2849h;

    /* renamed from: i, reason: collision with root package name */
    public int f2850i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2851k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f2852l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2842a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new t(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new t(this);
    }
}
