package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l1 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public d2 f2468a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2469b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2470c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2471d;

    public l1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2469b = new Rect();
        this.f2470c = true;
        this.f2471d = false;
    }

    public l1(int i5, int i10) {
        super(i5, i10);
        this.f2469b = new Rect();
        this.f2470c = true;
        this.f2471d = false;
    }

    public l1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2469b = new Rect();
        this.f2470c = true;
        this.f2471d = false;
    }

    public l1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2469b = new Rect();
        this.f2470c = true;
        this.f2471d = false;
    }

    public l1(l1 l1Var) {
        super((ViewGroup.LayoutParams) l1Var);
        this.f2469b = new Rect();
        this.f2470c = true;
        this.f2471d = false;
    }
}
