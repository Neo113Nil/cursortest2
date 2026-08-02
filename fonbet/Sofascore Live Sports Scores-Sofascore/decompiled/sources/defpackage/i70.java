package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i70 extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public i70(iz1 iz1Var) {
        this.a = 1;
        this.b = iz1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                k70 k70Var = new k70(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                k70Var.a = newDrawable;
                newDrawable.setCallback(k70Var.f);
                return k70Var;
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                return new xx8(this);
        }
    }

    public /* synthetic */ i70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k70 k70Var = new k70(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                k70Var.a = newDrawable;
                newDrawable.setCallback(k70Var.f);
                return k70Var;
            case 1:
                return (iz1) obj;
            default:
                return new xx8(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                k70 k70Var = new k70(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                k70Var.a = newDrawable;
                newDrawable.setCallback(k70Var.f);
                return k70Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
