package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f699a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f700b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f699a = i5;
        this.f700b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f699a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f700b;
                if (!actionBarContainer.f568g) {
                    Drawable drawable = actionBarContainer.f565d;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    Drawable drawable2 = actionBarContainer.f566e;
                    if (drawable2 != null && actionBarContainer.f569h) {
                        drawable2.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable3 = actionBarContainer.f567f;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                ((c4.m) this.f700b).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f699a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f699a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f700b;
                if (!actionBarContainer.f568g) {
                    Drawable drawable = actionBarContainer.f565d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        break;
                    }
                } else if (actionBarContainer.f567f != null) {
                    actionBarContainer.f565d.getOutline(outline);
                    break;
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        int i10 = this.f699a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i5 = this.f699a;
    }

    private final void a(int i5) {
    }

    private final void b(int i5) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
