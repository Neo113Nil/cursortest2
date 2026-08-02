package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f2794a;

    public f(Drawable.ConstantState constantState) {
        this.f2794a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f2794a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f2794a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(null, 0);
        Drawable newDrawable = this.f2794a.newDrawable();
        hVar.f2803a = newDrawable;
        newDrawable.setCallback(hVar.f2800f);
        return hVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        h hVar = new h(null, 0);
        Drawable newDrawable = this.f2794a.newDrawable(resources);
        hVar.f2803a = newDrawable;
        newDrawable.setCallback(hVar.f2800f);
        return hVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        h hVar = new h(null, 0);
        Drawable newDrawable = this.f2794a.newDrawable(resources, theme);
        hVar.f2803a = newDrawable;
        newDrawable.setCallback(hVar.f2800f);
        return hVar;
    }
}
