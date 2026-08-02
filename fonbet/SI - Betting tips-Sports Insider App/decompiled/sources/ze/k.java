package ze;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.core.view.f1;
import androidx.recyclerview.widget.a0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public View f25964a;

    /* renamed from: b, reason: collision with root package name */
    public g f25965b;

    /* renamed from: c, reason: collision with root package name */
    public g f25966c;

    /* renamed from: d, reason: collision with root package name */
    public int f25967d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25968e;

    /* renamed from: f, reason: collision with root package name */
    public float f25969f;

    public final void a(float f6, int i5) {
        g gVar = this.f25966c;
        float abs = 1.0f - (Math.abs(f6) * ((1.0f / i5) / 4));
        View view = gVar.f25941a;
        if (view != null) {
            view.setAlpha(abs);
        }
        View view2 = gVar.j;
        if (view2 != null) {
            view2.setAlpha(abs);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View v5, MotionEvent event) {
        float f6;
        float f10;
        float f11;
        View view = this.f25964a;
        Intrinsics.checkNotNullParameter(v5, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f25967d = v5.getHeight() / 4;
        int action = event.getAction();
        if (action == 0) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (rect.contains((int) event.getX(), (int) event.getY())) {
                this.f25968e = true;
            }
            this.f25969f = event.getY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.f25968e) {
                    float y5 = event.getY() - this.f25969f;
                    view.setTranslationY(y5);
                    a(y5, this.f25967d);
                    return true;
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (this.f25968e) {
            this.f25968e = false;
            int height = v5.getHeight();
            float translationY = view.getTranslationY();
            int i5 = this.f25967d;
            if (translationY < (-i5)) {
                f10 = height;
                f11 = -1.0f;
            } else if (translationY > i5) {
                f10 = height;
                f11 = 1.0f;
            } else {
                f6 = 0.0f;
                boolean z5 = f6 != 0.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", translationY, f6);
                Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.addListener(new a0(!z5, this));
                ofFloat.addUpdateListener(new f1(6, this));
                ofFloat.start();
            }
            f6 = f10 * f11;
            if (f6 != 0.0f) {
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", translationY, f6);
            Intrinsics.checkNotNullExpressionValue(ofFloat2, "ofFloat(...)");
            ofFloat2.setDuration(200L);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            ofFloat2.addListener(new a0(!z5, this));
            ofFloat2.addUpdateListener(new f1(6, this));
            ofFloat2.start();
        }
        return true;
    }
}
