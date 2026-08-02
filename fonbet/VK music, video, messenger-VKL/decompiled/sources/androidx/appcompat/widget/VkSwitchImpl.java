package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.gi90;
import xsna.gpo0;
import xsna.hbh0;
import xsna.l8g;
import xsna.lpj;
import xsna.n8g;
import xsna.tko;
import xsna.too0;

/* compiled from: VkSwitchImpl.kt */
/* loaded from: classes11.dex */
public class VkSwitchImpl extends SwitchCompat implements too0 {
    public boolean U;
    public boolean V;
    public boolean W;
    public final boolean a0;
    public final Drawable b0;
    public final Drawable c0;
    public Drawable d0;
    public Drawable e0;
    public ColorStateList f0;
    public ColorStateList g0;
    public ColorStateList h0;
    public int[] i0;
    public int[] j0;

    /* compiled from: VkSwitchImpl.kt */
    public static final class a extends Property<VkSwitchImpl, Float> {
        @Override // android.util.Property
        public final Float get(VkSwitchImpl vkSwitchImpl) {
            return Float.valueOf(vkSwitchImpl.getThumbPosition());
        }

        @Override // android.util.Property
        public final void set(VkSwitchImpl vkSwitchImpl, Float f) {
            vkSwitchImpl.setThumbPosition(f.floatValue());
        }
    }

    static {
        new a(Float.TYPE, "thumbPos");
    }

    public VkSwitchImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialSwitchStyle);
    }

    @Override // xsna.too0
    public final void Ng() {
        f();
        setMinimumWidth(hbh0.b(52, getContext()));
        setSwitchMinWidth(hbh0.b(52, getContext()));
    }

    public final int e(ColorStateList colorStateList) {
        return n8g.d(getThumbPosition(), colorStateList.getColorForState(this.i0, 0), colorStateList.getColorForState(this.j0, 0));
    }

    public final void f() {
        getContext();
        setAlpha(1.0f);
        if (this.W) {
            getContext();
            this.d0 = this.b0;
        }
        if (this.a0) {
            getContext();
            setThumbDrawable(this.c0);
        }
        this.e0 = getContext().getDrawable(R.drawable.ds_internal_switch_track_decoration);
        if (this.U) {
            getContext();
            int d = gpo0.d(R.attr.vk_ui_background_accent, this);
            int d2 = gpo0.d(R.attr.vk_ui_background_secondary, this);
            this.f0 = new ColorStateList(new int[][]{new int[]{-16842912, -16842910}, new int[]{android.R.attr.state_checked, -16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{n8g.i(l8g.f(0.64f, d2), gpo0.d(R.attr.vk_ui_background_content, this)), n8g.i(l8g.f(0.64f, d), gpo0.d(R.attr.vk_ui_background_content, this)), d2, d});
        }
        if (this.V) {
            getContext();
            int d3 = gpo0.d(R.attr.vk_ui_icon_contrast, this);
            int d4 = gpo0.d(R.attr.vk_ui_icon_medium, this);
            this.g0 = new ColorStateList(new int[][]{new int[]{-16842912, -16842910}, new int[]{android.R.attr.state_checked, -16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{n8g.i(l8g.f(0.64f, d4), gpo0.d(R.attr.vk_ui_background_content, this)), n8g.i(l8g.f(0.64f, d3), gpo0.d(R.attr.vk_ui_background_content, this)), d4, d3});
        }
        getContext();
        int d5 = gpo0.d(R.attr.vk_ui_transparent, this);
        int d6 = gpo0.d(R.attr.vk_ui_field_border_alpha, this);
        this.h0 = new ColorStateList(new int[][]{new int[]{-16842912, -16842910}, new int[]{android.R.attr.state_checked, -16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{l8g.f((Color.alpha(d6) / 255.0f) * 0.64f, d6), d5, d6, d5});
        g();
    }

    public final void g() {
        Drawable drawable = this.d0;
        Drawable drawable2 = null;
        this.d0 = drawable != null ? drawable.mutate() : null;
        Drawable drawable3 = this.e0;
        this.e0 = drawable3 != null ? drawable3.mutate() : null;
        h();
        Drawable drawable4 = this.d0;
        if (drawable4 != null && this.e0 != null) {
            drawable2 = new LayerDrawable(new Drawable[]{this.d0, this.e0});
        } else if (drawable4 != null || (drawable4 = this.e0) != null) {
            drawable2 = drawable4;
        }
        super.setTrackDrawable(drawable2);
    }

    public final void h() {
        Drawable drawable;
        Drawable drawable2;
        ColorStateList colorStateList = this.f0;
        if (colorStateList != null && (drawable2 = this.d0) != null) {
            drawable2.setTint(e(colorStateList));
        }
        ColorStateList colorStateList2 = this.h0;
        if (colorStateList2 != null && (drawable = this.e0) != null) {
            drawable.setTint(e(colorStateList2));
        }
        ColorStateList colorStateList3 = this.g0;
        if (colorStateList3 != null) {
            super.setThumbTintList(ColorStateList.valueOf(e(colorStateList3)));
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        int[] iArr = new int[onCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.i0 = iArr;
        this.j0 = tko.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.b);
            this.U = state.d;
            this.V = state.e;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        State state = new State(onSaveInstanceState);
        state.d = this.U;
        state.e = this.V;
        return state;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        getContext();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getContext();
        setAlpha(1.0f);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.g0 = colorStateList;
        this.V = false;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.d0 = drawable;
        this.W = false;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f0 = colorStateList;
        this.U = false;
        h();
    }

    /* compiled from: VkSwitchImpl.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public boolean d;
        public boolean e;

        /* compiled from: VkSwitchImpl.kt */
        public static final class a implements Parcelable.ClassLoaderCreator<State> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new State(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new State[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final State createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new State(parcel, classLoader);
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
            this.d = true;
            this.e = true;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            boolean z = this.d;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                gi90.a(parcel, z);
            } else {
                parcel.writeInt(z ? 1 : 0);
            }
            boolean z2 = this.e;
            if (i2 >= 29) {
                gi90.a(parcel, z2);
            } else {
                parcel.writeInt(z2 ? 1 : 0);
            }
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = true;
            this.e = true;
            this.d = parcel.readInt() != 0;
            this.e = parcel.readInt() != 0;
        }
    }

    public VkSwitchImpl(Context context, AttributeSet attributeSet, int i) {
        super(new lpj(context, R$style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.U = true;
        this.V = true;
        this.W = true;
        this.a0 = true;
        Drawable background = getBackground();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialSwitch);
        this.U = !obtainStyledAttributes.hasValue(12);
        this.V = !obtainStyledAttributes.hasValue(9);
        this.W = !obtainStyledAttributes.hasValue(11);
        this.a0 = true ^ obtainStyledAttributes.hasValue(2);
        this.b0 = super.getTrackDrawable();
        this.c0 = super.getThumbDrawable();
        this.d0 = super.getTrackDrawable();
        this.f0 = super.getTrackTintList();
        super.setTrackTintList(null);
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(e3m.f(android.R.attr.colorControlHighlight, context)));
        }
        f();
        setShowText(false);
        setMinimumHeight(hbh0.b(32, context));
        setMinimumWidth(hbh0.b(52, context));
        setSwitchMinWidth(hbh0.b(52, context));
        setEnforceSwitchWidth(false);
        obtainStyledAttributes.recycle();
    }
}
