package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ehg extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehg(Context context, h0 h0Var) {
        super(context);
        this.b = h0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                super.onDetachedFromWindow();
                h0 h0Var = (h0) this.b;
                ViewParent parent = h0Var.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(h0Var);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                fhg fhgVar = (fhg) this.b;
                int b = fhgVar.b();
                int a = fhgVar.a();
                if (b > 0 && a > 0) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    float f = size;
                    float f2 = b;
                    float f3 = f / f2;
                    float f4 = size2;
                    float f5 = a;
                    float f6 = f2 / f5;
                    if (f3 > f4 / f5) {
                        size = (int) (f4 * f6);
                    } else {
                        size2 = (int) (f / f6);
                    }
                    i = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehg(fhg fhgVar, Context context) {
        super(context);
        this.b = fhgVar;
    }
}
