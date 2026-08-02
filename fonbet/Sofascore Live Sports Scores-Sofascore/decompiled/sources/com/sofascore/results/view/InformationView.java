package com.sofascore.results.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.eq3;
import defpackage.nr1;
import defpackage.o8;
import defpackage.s61;
import defpackage.tgj;
import defpackage.tl3;
import defpackage.yhk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/sofascore/results/view/InformationView;", "Lo8;", "", "getLayoutId", "()I", "", "text", "", "setActionText", "(Ljava/lang/String;)V", "color", "setTextColor", "(I)V", "setBackgroundColor", "setContainerTintColor", "Landroid/graphics/drawable/Drawable;", "icon", "setActionIcon", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/widget/LinearLayout;", "getRoot", "()Landroid/widget/LinearLayout;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InformationView extends o8 {
    public static final /* synthetic */ int e = 0;
    public final nr1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InformationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        nr1 e2 = nr1.e(getRoot());
        this.d = e2;
        ((LinearLayout) e2.d).setVisibility(8);
    }

    public static void l(InformationView informationView, Function0 function0) {
        ImageView imageView = (ImageView) informationView.d.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(new s61(5, function0));
    }

    public static void n(InformationView informationView) {
        nr1 nr1Var = informationView.d;
        LinearLayout linearLayout = (LinearLayout) nr1Var.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        Context context = linearLayout.getContext();
        context.getClass();
        int s = ao2.s(4, context);
        Context context2 = linearLayout.getContext();
        context2.getClass();
        int s2 = ao2.s(8, context2);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        linearLayout.setBackground(null);
        linearLayout.setPaddingRelative(s2, s, s2, s);
        constraintLayout.getContext().getClass();
        constraintLayout.setElevation(ao2.s(2, r0));
        constraintLayout.setBackground(constraintLayout.getContext().getDrawable(R.drawable.rounded_surface_level_1));
        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(constraintLayout.getContext().getColor(R.color.surface_1)));
    }

    public static void o(InformationView informationView, String str) {
        TextView textView = (TextView) informationView.d.h;
        textView.setText(str);
        textView.setTextAppearance(R.style.BodySmall);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.text_icon_link_layout;
    }

    @Override // defpackage.o8
    @NotNull
    public final LinearLayout getRoot() {
        LinearLayout linearLayout = (LinearLayout) this.d.d;
        linearLayout.getClass();
        return linearLayout;
    }

    public final void j() {
        ImageView imageView = (ImageView) this.d.g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.i = 0;
        tl3Var.l = 0;
        imageView.setLayoutParams(tl3Var);
    }

    public final void p(boolean z, boolean z2) {
        LinearLayout linearLayout = (LinearLayout) this.d.d;
        if (!z || linearLayout.getVisibility() != 8) {
            if (z) {
                return;
            }
            linearLayout.setVisibility(8);
        } else if (z2) {
            tgj.p(linearLayout, 0L, 3);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public final void setActionIcon(@Nullable Drawable icon) {
        nr1 nr1Var = this.d;
        ((ImageView) nr1Var.e).setVisibility(0);
        ((ImageView) nr1Var.e).setImageDrawable(icon);
    }

    public final void setActionText(@NotNull String text) {
        text.getClass();
        nr1 nr1Var = this.d;
        nr1Var.b.setText(text);
        ((LinearLayout) nr1Var.i).setVisibility(0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        ((LinearLayout) this.d.d).setBackgroundColor(color);
    }

    public final void setContainerTintColor(int color) {
        ((ConstraintLayout) this.d.c).setBackgroundTintList(eq3.q(color, getContext()));
    }

    public final void setTextColor(int color) {
        ((TextView) this.d.h).setTextColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
