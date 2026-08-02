package com.vk.core.view.components.check;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.customview.view.AbsSavedState;
import com.vkontakte.android.R;
import xsna.hbh0;
import xsna.i35;
import xsna.too0;

/* compiled from: VkCheckCircle.kt */
/* loaded from: classes17.dex */
public final class VkCheckCircle extends AppCompatCheckBox implements too0 {
    public boolean f;

    public VkCheckCircle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        if (this.f) {
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

    /* compiled from: VkCheckCircle.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public boolean d;

        /* compiled from: VkCheckCircle.kt */
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
    public VkCheckCircle(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, R.attr.checkboxStyle);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.f = true;
        setButtonDrawable(R.drawable.ds_internal_selector_check_circle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.m, R.attr.checkboxStyle, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        this.f = !hasValue;
        if (!hasValue) {
            setButtonTintList(i35.c(this));
        }
        obtainStyledAttributes.recycle();
        setMinimumHeight(hbh0.b(24, context));
        setMinimumWidth(hbh0.b(24, context));
    }
}
