package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2047b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f17257a;

    /* renamed from: androidx.appcompat.widget.b$a */
    public static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C2047b(ActionBarContainer actionBarContainer) {
        this.f17257a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f17257a;
        if (actionBarContainer.f16807h) {
            Drawable drawable = actionBarContainer.f16806g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f16804e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f17257a;
        Drawable drawable3 = actionBarContainer2.f16805f;
        if (drawable3 == null || !actionBarContainer2.f16808i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f17257a;
        if (actionBarContainer.f16807h) {
            if (actionBarContainer.f16806g != null) {
                a.a(actionBarContainer.f16804e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f16804e;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
