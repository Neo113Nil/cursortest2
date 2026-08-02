package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fmk extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public fmk(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        gmk gmkVar = new gmk();
        gmkVar.a = (VectorDrawable) this.a.newDrawable();
        return gmkVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        gmk gmkVar = new gmk();
        gmkVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return gmkVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        gmk gmkVar = new gmk();
        gmkVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return gmkVar;
    }
}
