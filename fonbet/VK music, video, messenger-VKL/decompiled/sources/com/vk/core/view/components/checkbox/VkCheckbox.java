package com.vk.core.view.components.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.hbh0;
import xsna.i35;
import xsna.izs;
import xsna.s3q0;
import xsna.too0;
import xsna.zrp;

/* compiled from: VkCheckbox.kt */
/* loaded from: classes17.dex */
public final class VkCheckbox extends AppCompatCheckBox implements too0 {
    public static final int[] j = {R$attr.state_indeterminate};
    public boolean f;
    public Type g;
    public State h;
    public izs<? super State, s3q0> i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCheckbox.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Checked;
        public static final State Indeterminate;
        public static final State Unchecked;

        static {
            State state = new State("Unchecked", 0);
            Unchecked = state;
            State state2 = new State("Indeterminate", 1);
            Indeterminate = state2;
            State state3 = new State("Checked", 2);
            Checked = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static zrp<State> h() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCheckbox.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Circle;
        public static final Type Radio;
        public static final Type Square;
        public static final Type Unknown;

        static {
            Type type = new Type(DeviceInfo.STR_TYPE_UNKNOWN, 0);
            Unknown = type;
            Type type2 = new Type("Square", 1);
            Square = type2;
            Type type3 = new Type("Circle", 2);
            Circle = type3;
            Type type4 = new Type("Radio", 3);
            Radio = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: VkCheckbox.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.Radio.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkCheckbox(Context context) {
        this(context, null, 0, 0, 14);
    }

    private final void setButtonDrawable(Type type) {
        getContext();
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            setButtonDrawable(R.drawable.ds_internal_selector_check_box);
            return;
        }
        if (i == 2) {
            setButtonDrawable(R.drawable.ds_internal_selector_check_circle);
        } else if (i == 3) {
            setButtonDrawable(R.drawable.ds_internal_selector_radio_button);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        setButtonDrawable(this.g);
        getContext();
        if (!this.f || this.g == Type.Unknown) {
            return;
        }
        setButtonTintList(i35.c(this));
    }

    public final State getCheckedState() {
        return this.h;
    }

    public final izs<State, s3q0> getCheckedStateChangeListener() {
        return this.i;
    }

    public final Type getType() {
        return this.g;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.h == State.Checked;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.h == State.Indeterminate) {
            View.mergeDrawableStates(onCreateDrawableState, j);
        }
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.b);
            this.f = savedState.d;
            setType((Type) Type.h().get(savedState.e));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.d = this.f;
        savedState.e = this.g.ordinal();
        return savedState;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? State.Checked : State.Unchecked);
    }

    public final void setCheckedState(State state) {
        if (this.h != state) {
            this.h = state;
            super.setChecked(state == State.Checked);
            refreshDrawableState();
            izs<? super State, s3q0> izsVar = this.i;
            if (izsVar != null) {
                izsVar.invoke(state);
            }
        }
    }

    public final void setCheckedStateChangeListener(izs<? super State, s3q0> izsVar) {
        this.i = izsVar;
    }

    public final void setType(Type type) {
        this.g = type;
        setButtonDrawable(type);
    }

    /* compiled from: VkCheckbox.kt */
    public static final class SavedState extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new a();
        public boolean d;
        public int e;

        /* compiled from: VkCheckbox.kt */
        public static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.d = true;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = true;
            this.d = parcel.readInt() != 0;
            this.e = parcel.readInt();
        }
    }

    public VkCheckbox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12);
    }

    public VkCheckbox(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8);
    }

    public /* synthetic */ VkCheckbox(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.checkboxStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkCheckbox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Type type;
        this.f = true;
        Type type2 = Type.Unknown;
        this.g = type2;
        this.h = State.Unchecked;
        Drawable background = getBackground();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.i, i, i2);
        int integer = obtainStyledAttributes.getInteger(0, -1);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R$styleable.m, 0, 0);
        this.f = !obtainStyledAttributes2.hasValue(2);
        boolean hasValue = obtainStyledAttributes2.hasValue(0);
        if (integer != -1 && !hasValue) {
            type = (Type) Type.h().get(integer + 1);
        } else {
            type = !hasValue ? Type.Square : type2;
        }
        setType(type);
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(e3m.f(android.R.attr.colorControlHighlight, context)));
        }
        getContext();
        if (this.f && this.g != type2) {
            setButtonTintList(i35.c(this));
        }
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
        setMinimumHeight(hbh0.b(24, context));
        setMinimumWidth(hbh0.b(24, context));
    }
}
