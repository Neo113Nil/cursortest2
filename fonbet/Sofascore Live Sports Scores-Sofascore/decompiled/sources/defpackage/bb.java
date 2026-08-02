package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bb extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
                if (!actionBarContainer.g) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    Drawable drawable2 = actionBarContainer.e;
                    if (drawable2 != null && actionBarContainer.h) {
                        drawable2.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable3 = actionBarContainer.f;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                ((nr9) obj).c(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.g) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        break;
                    }
                } else if (actionBarContainer.f != null) {
                    actionBarContainer.d.getOutline(outline);
                    break;
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i2 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
