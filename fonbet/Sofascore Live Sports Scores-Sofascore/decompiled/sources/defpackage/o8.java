package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class o8 extends FrameLayout {
    public final boolean a;
    public boolean b;
    public final View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = attributeSet != null;
        this.b = true;
        View inflate = LayoutInflater.from(context).inflate(getLayoutId(), (ViewGroup) this, false);
        this.c = inflate;
        super.addView(inflate);
        if (super.getVisibility() != 0) {
            inflate.setVisibility(super.getVisibility());
            super.setVisibility(0);
        }
    }

    public static void d(o8 o8Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        int i3 = (i2 & 4) == 0 ? 0 : 4;
        if (o8Var.b) {
            o8Var.setBackground(null);
            o8Var.setClipToPadding(false);
            Context context = o8Var.getContext();
            context.getClass();
            int s = ao2.s(i, context);
            Context context2 = o8Var.getContext();
            context2.getClass();
            int s2 = ao2.s(i3, context2);
            View childAt = o8Var.getChildAt(0);
            if (childAt != null) {
                childAt.setClipToOutline(true);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(s);
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = s2;
                layoutParams2.setMarginEnd(s);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = s2;
                childAt.setLayoutParams(layoutParams2);
                childAt.setBackground(o8Var.getContext().getDrawable(R.drawable.rounded_surface_level_1));
            }
        }
    }

    public abstract int getLayoutId();

    @NotNull
    public final View getRoot() {
        View view = this.c;
        view.getClass();
        return view;
    }

    public final boolean getShowAsCard() {
        return this.b;
    }

    @Override // android.view.View
    public int getVisibility() {
        View view = this.c;
        return view != null ? view.getVisibility() : super.getVisibility();
    }

    @Override // android.view.View
    @wx4
    public void setLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        if (!this.a) {
            if (layoutParams != null) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                layoutParams.width = layoutParams2 != null ? layoutParams2.width : -1;
            }
            if (layoutParams != null) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                layoutParams.height = layoutParams3 != null ? layoutParams3.height : -2;
            }
        }
        super.setLayoutParams(layoutParams);
    }

    public void setNewLayoutParams(@NotNull ViewGroup.LayoutParams layoutParams) {
        layoutParams.getClass();
        super.setLayoutParams(layoutParams);
    }

    public final void setShowAsCard(boolean z) {
        this.b = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.c;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private static /* synthetic */ void get_root$annotations() {
    }
}
