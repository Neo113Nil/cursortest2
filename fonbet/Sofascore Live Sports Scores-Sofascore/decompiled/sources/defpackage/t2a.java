package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class t2a extends o8 {
    public final u2a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        ConstraintLayout constraintLayout = (ConstraintLayout) root;
        int i = R.id.info_bubble_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.info_bubble_container, root);
        if (linearLayout != null) {
            i = R.id.info_bubble_triangle;
            ImageView imageView = (ImageView) nq8.B(R.id.info_bubble_triangle, root);
            if (imageView != null) {
                this.d = new u2a(constraintLayout, linearLayout, imageView);
                s2a s2aVar = s2a.a;
                r2a r2aVar = r2a.a;
                int s = ao2.s(8, context);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ujf.k, 0, 0);
                try {
                    int color = obtainStyledAttributes.getColor(2, context.getColor(R.color.primary_default));
                    if (obtainStyledAttributes.getInt(1, 0) != 0) {
                        s2aVar = s2a.b;
                    }
                    int i2 = obtainStyledAttributes.getInt(0, 0);
                    r2aVar = i2 != 0 ? i2 != 1 ? r2a.c : r2a.b : r2aVar;
                    obtainStyledAttributes.recycle();
                    setBubbleColor(color);
                    l(s2aVar, s);
                    j(r2aVar, s);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.d.b.addView(view, layoutParams);
    }

    @NotNull
    public final u2a getBinding() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.info_bubble_base_layout;
    }

    public final void j(r2a r2aVar, int i) {
        mm3 mm3Var = new mm3();
        u2a u2aVar = this.d;
        mm3Var.e(u2aVar.a);
        int ordinal = r2aVar.ordinal();
        if (ordinal == 0) {
            mm3Var.d(R.id.info_bubble_triangle, 6);
            mm3Var.d(R.id.info_bubble_triangle, 7);
            mm3Var.g(R.id.info_bubble_triangle, 6, 0, 6, i);
        } else if (ordinal == 1) {
            mm3Var.d(R.id.info_bubble_triangle, 6);
            mm3Var.d(R.id.info_bubble_triangle, 7);
            mm3Var.f(R.id.info_bubble_triangle, 6, 0, 6);
            mm3Var.f(R.id.info_bubble_triangle, 7, 0, 7);
        } else if (ordinal != 2) {
            zzl.b();
            return;
        } else {
            mm3Var.d(R.id.info_bubble_triangle, 6);
            mm3Var.d(R.id.info_bubble_triangle, 7);
            mm3Var.g(R.id.info_bubble_triangle, 7, 0, 7, i);
        }
        mm3Var.a(u2aVar.a);
    }

    public final void l(s2a s2aVar, int i) {
        mm3 mm3Var = new mm3();
        u2a u2aVar = this.d;
        mm3Var.e(u2aVar.a);
        int ordinal = s2aVar.ordinal();
        if (ordinal == 0) {
            mm3Var.d(R.id.info_bubble_container, 3);
            mm3Var.d(R.id.info_bubble_container, 4);
            mm3Var.g(R.id.info_bubble_container, 3, 0, 3, i);
            mm3Var.d(R.id.info_bubble_triangle, 4);
            mm3Var.d(R.id.info_bubble_triangle, 3);
            mm3Var.f(R.id.info_bubble_triangle, 3, R.id.info_bubble_container, 4);
        } else {
            if (ordinal != 1) {
                zzl.b();
                return;
            }
            mm3Var.d(R.id.info_bubble_container, 3);
            mm3Var.d(R.id.info_bubble_container, 4);
            mm3Var.f(R.id.info_bubble_container, 3, R.id.info_bubble_triangle, 4);
            mm3Var.g(R.id.info_bubble_container, 4, 0, 4, i);
            mm3Var.d(R.id.info_bubble_triangle, 3);
            mm3Var.d(R.id.info_bubble_triangle, 4);
            mm3Var.f(R.id.info_bubble_triangle, 3, 0, 3);
            mm3Var.j(R.id.info_bubble_triangle).e.a = 180.0f;
        }
        mm3Var.a(u2aVar.a);
    }

    public final void setArrowBias(float f) {
        mm3 mm3Var = new mm3();
        u2a u2aVar = this.d;
        mm3Var.e(u2aVar.a);
        mm3Var.d(R.id.info_bubble_triangle, 6);
        mm3Var.d(R.id.info_bubble_triangle, 7);
        mm3Var.f(R.id.info_bubble_triangle, 6, 0, 6);
        mm3Var.f(R.id.info_bubble_triangle, 7, 0, 7);
        mm3Var.j(R.id.info_bubble_triangle).d.w = f;
        mm3Var.a(u2aVar.a);
    }

    public final void setArrowX(int i) {
        j(r2a.a, i);
    }

    public final void setBubbleColor(int i) {
        u2a u2aVar = this.d;
        u2aVar.b.setBackgroundTintList(ColorStateList.valueOf(i));
        u2aVar.c.getDrawable().setTint(i);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        u2a u2aVar = this.d;
        u2aVar.b.setClipToOutline(true);
        u2aVar.b.setOnClickListener(onClickListener);
    }
}
