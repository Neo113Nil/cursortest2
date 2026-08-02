package com.vk.core.view.components.radio;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.customview.view.AbsSavedState;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.hbh0;
import xsna.i35;
import xsna.too0;

/* compiled from: VkRadioButton.kt */
/* loaded from: classes17.dex */
public final class VkRadioButton extends AppCompatRadioButton implements too0 {
    public boolean f;

    public VkRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        setButtonDrawable(getContext().getDrawable(R.drawable.ds_internal_selector_radio_button));
        if (this.f) {
            getContext();
            setButtonTintMode(PorterDuff.Mode.SRC_IN);
            getContext();
            setButtonTintList(i35.c(this));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.b);
            this.f = state.d;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        State state = new State(onSaveInstanceState);
        state.d = this.f;
        return state;
    }

    /* compiled from: VkRadioButton.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public boolean d;

        /* compiled from: VkRadioButton.kt */
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.f = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.m, R.attr.radioButtonStyle, 0);
        this.f = !obtainStyledAttributes.hasValue(2);
        obtainStyledAttributes.recycle();
        Ng();
        setBackground(e3m.e(R.attr.selectableItemBackgroundBorderless, context));
        setMinimumHeight(hbh0.b(24, context));
        setMinimumWidth(hbh0.b(24, context));
    }
}
