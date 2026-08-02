package com.vk.core.view.components.spinner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.customview.view.AbsSavedState;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.f4m;
import xsna.gpo0;
import xsna.hbh0;
import xsna.m3e0;
import xsna.stw;
import xsna.too0;
import xsna.zrp;

/* compiled from: VkSpinner.kt */
/* loaded from: classes.dex */
public final class VkSpinner extends ProgressBar implements too0 {
    public SpinnerSize b;
    public boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkSpinner.kt */
    public static final class IndicatorDirection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IndicatorDirection[] $VALUES;
        public static final IndicatorDirection Clockwise;
        public static final IndicatorDirection CounterClockwise;

        static {
            IndicatorDirection indicatorDirection = new IndicatorDirection("Clockwise", 0);
            Clockwise = indicatorDirection;
            IndicatorDirection indicatorDirection2 = new IndicatorDirection("CounterClockwise", 1);
            CounterClockwise = indicatorDirection2;
            IndicatorDirection[] indicatorDirectionArr = {indicatorDirection, indicatorDirection2};
            $VALUES = indicatorDirectionArr;
            $ENTRIES = new asp(indicatorDirectionArr);
        }

        public IndicatorDirection() {
            throw null;
        }

        public static IndicatorDirection valueOf(String str) {
            return (IndicatorDirection) Enum.valueOf(IndicatorDirection.class, str);
        }

        public static IndicatorDirection[] values() {
            return (IndicatorDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkSpinner.kt */
    public static final class SpinnerSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SpinnerSize[] $VALUES;
        public static final SpinnerSize Size16;
        public static final SpinnerSize Size24;
        public static final SpinnerSize Size28;
        public static final SpinnerSize Size36;
        public static final SpinnerSize Size56;

        static {
            SpinnerSize spinnerSize = new SpinnerSize("Size16", 0);
            Size16 = spinnerSize;
            SpinnerSize spinnerSize2 = new SpinnerSize("Size24", 1);
            Size24 = spinnerSize2;
            SpinnerSize spinnerSize3 = new SpinnerSize("Size28", 2);
            Size28 = spinnerSize3;
            SpinnerSize spinnerSize4 = new SpinnerSize("Size36", 3);
            Size36 = spinnerSize4;
            SpinnerSize spinnerSize5 = new SpinnerSize("Size56", 4);
            Size56 = spinnerSize5;
            SpinnerSize[] spinnerSizeArr = {spinnerSize, spinnerSize2, spinnerSize3, spinnerSize4, spinnerSize5};
            $VALUES = spinnerSizeArr;
            $ENTRIES = new asp(spinnerSizeArr);
        }

        public SpinnerSize() {
            throw null;
        }

        public static zrp<SpinnerSize> h() {
            return $ENTRIES;
        }

        public static SpinnerSize valueOf(String str) {
            return (SpinnerSize) Enum.valueOf(SpinnerSize.class, str);
        }

        public static SpinnerSize[] values() {
            return (SpinnerSize[]) $VALUES.clone();
        }
    }

    public VkSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final stw getSpinnerIndeterminateDrawable() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof stw) {
            return (stw) indeterminateDrawable;
        }
        return null;
    }

    private final m3e0 getSpinnerProgressDrawable() {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof m3e0) {
            return (m3e0) progressDrawable;
        }
        return null;
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        if (this.c) {
            ColorStateList valueOf = ColorStateList.valueOf(gpo0.d(R.attr.vk_ui_icon_medium, this));
            setIndeterminateTintList(valueOf);
            setProgressTintList(valueOf);
        }
    }

    public final SpinnerSize getSpinnerSize() {
        return this.b;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.d());
            this.c = state.e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        State state = new State(onSaveInstanceState);
        state.f(this.c);
        return state;
    }

    public final void setProgressIndicatorDirection(IndicatorDirection indicatorDirection) {
        m3e0 spinnerProgressDrawable = getSpinnerProgressDrawable();
        if (spinnerProgressDrawable != null) {
            spinnerProgressDrawable.d = indicatorDirection;
        }
    }

    public final void setSpinnerSize(SpinnerSize spinnerSize) {
        int b;
        float a;
        this.b = spinnerSize;
        Context context = getContext();
        SpinnerSize spinnerSize2 = this.b;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[spinnerSize2.ordinal()];
        if (i == 1) {
            b = hbh0.b(16, context);
        } else if (i == 2) {
            b = hbh0.b(24, context);
        } else if (i == 3) {
            b = hbh0.b(28, context);
        } else if (i == 4) {
            b = hbh0.b(36, context);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            b = hbh0.b(56, context);
        }
        Context context2 = getContext();
        int i2 = iArr[this.b.ordinal()];
        if (i2 == 1) {
            a = hbh0.a(context2, 2.0f);
        } else if (i2 == 2) {
            a = hbh0.a(context2, 2.5f);
        } else if (i2 == 3) {
            a = hbh0.a(context2, 2.5f);
        } else if (i2 == 4) {
            a = hbh0.a(context2, 3.0f);
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            a = hbh0.a(context2, 3.0f);
        }
        stw spinnerIndeterminateDrawable = getSpinnerIndeterminateDrawable();
        if (spinnerIndeterminateDrawable != null) {
            spinnerIndeterminateDrawable.c = b;
            spinnerIndeterminateDrawable.invalidateSelf();
            spinnerIndeterminateDrawable.a(a);
        }
        m3e0 spinnerProgressDrawable = getSpinnerProgressDrawable();
        if (spinnerProgressDrawable != null) {
            spinnerProgressDrawable.c = b;
            spinnerProgressDrawable.invalidateSelf();
            spinnerProgressDrawable.a(a);
        }
        f4m.z(b, b, this);
    }

    /* compiled from: VkSpinner.kt */
    /* loaded from: classes17.dex */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public boolean d;

        /* compiled from: VkSpinner.kt */
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
        }

        public final boolean e() {
            return this.d;
        }

        public final void f(boolean z) {
            this.d = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = true;
            this.d = parcel.readInt() != 0;
        }
    }

    public /* synthetic */ VkSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0, R.style.VkSpinnerStyle);
        this.b = SpinnerSize.Size16;
        this.c = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.A, 0, 0);
        this.c = (obtainStyledAttributes.hasValue(3) || obtainStyledAttributes.hasValue(2)) ? false : true;
        int integer = obtainStyledAttributes.getInteger(4, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        setIndeterminateDrawable(new stw(this));
        if (!z2) {
            setProgressDrawable(new m3e0());
        }
        setIndeterminate(z2 || z);
        setSpinnerSize((SpinnerSize) SpinnerSize.h().get(integer));
        a();
        obtainStyledAttributes.recycle();
    }
}
