package com.sofascore.results.redesign.emptystateblocks;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.iz8;
import defpackage.o8;
import defpackage.ujf;
import defpackage.v82;
import defpackage.wzb;
import defpackage.z8e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lcom/sofascore/results/redesign/emptystateblocks/GraphicLarge;", "Lo8;", "", "buttonText", "", "setButtonResource", "(Ljava/lang/String;)V", "", "getLayoutId", "()I", "Landroid/graphics/drawable/Drawable;", "drawable", "setSmallDrawableResource", "(Landroid/graphics/drawable/Drawable;)V", "color", "setCircleBackgroundColor", "(I)V", "setLargeDrawableResource", "drawableResId", "(Ljava/lang/Integer;)V", "title", "setTitleResource", "subtitle", "setSubtitleResource", "", "visible", "setTitleVisibility", "(Z)V", "setSubtitleVisibility", "Lcom/google/android/material/button/MaterialButton;", "getButtonLarge", "()Lcom/google/android/material/button/MaterialButton;", "maxLines", "setMaxLinesSubtitleText", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphicLarge extends o8 {
    public final v82 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GraphicLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        v82 d = v82.d(getRoot());
        this.d = d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.j, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        int color = obtainStyledAttributes.getColor(5, context.getColor(R.color.neutral_default));
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        String string = obtainStyledAttributes.getString(4);
        String string2 = obtainStyledAttributes.getString(3);
        String string3 = obtainStyledAttributes.getString(0);
        float dimension = obtainStyledAttributes.getDimension(2, ao2.s(48, context));
        obtainStyledAttributes.recycle();
        if (drawable != null) {
            setSmallDrawableResource(drawable);
        }
        if (drawable2 != null) {
            setLargeDrawableResource(drawable2);
        }
        if (string != null) {
            setTitleResource(string);
        }
        if (string2 != null) {
            setSubtitleResource(string2);
        }
        if (string3 != null) {
            setButtonResource(string3);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) d.b;
        constraintLayout.getClass();
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), wzb.b(dimension));
        setCircleBackgroundColor(color);
    }

    private final void setButtonResource(String buttonText) {
        v82 v82Var = this.d;
        v82Var.getClass();
        buttonText.getClass();
        MaterialButton materialButton = (MaterialButton) v82Var.h;
        materialButton.setText(buttonText);
        materialButton.setVisibility(0);
    }

    @NotNull
    public final MaterialButton getButtonLarge() {
        return (MaterialButton) this.d.h;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.graphic_large;
    }

    public final void setCircleBackgroundColor(int color) {
        v82 v82Var = this.d;
        v82Var.getClass();
        z8e.V(color, (View) v82Var.f);
    }

    public final void setLargeDrawableResource(@Nullable Integer drawableResId) {
        v82 v82Var = this.d;
        v82Var.getClass();
        ImageView imageView = (ImageView) v82Var.d;
        if (drawableResId != null) {
            imageView.setImageResource(drawableResId.intValue());
            imageView.setVisibility(0);
        }
    }

    public final void setMaxLinesSubtitleText(int maxLines) {
        ((TextView) this.d.e).setMaxLines(maxLines);
    }

    public final void setSmallDrawableResource(@Nullable Drawable drawable) {
        v82 v82Var = this.d;
        v82Var.getClass();
        ((View) v82Var.f).setVisibility(0);
        ImageView imageView = (ImageView) v82Var.g;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    public final void setSubtitleResource(@NotNull String subtitle) {
        subtitle.getClass();
        iz8.F(this.d, subtitle);
    }

    public final void setSubtitleVisibility(boolean visible) {
        v82 v82Var = this.d;
        v82Var.getClass();
        ((TextView) v82Var.e).setVisibility(visible ? 0 : 8);
    }

    public final void setTitleResource(@NotNull String title) {
        title.getClass();
        iz8.G(this.d, title);
    }

    public final void setTitleVisibility(boolean visible) {
        v82 v82Var = this.d;
        v82Var.getClass();
        ((TextView) v82Var.c).setVisibility(visible ? 0 : 8);
    }

    public final void setLargeDrawableResource(@Nullable Drawable drawable) {
        iz8.E(this.d, drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphicLarge(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
