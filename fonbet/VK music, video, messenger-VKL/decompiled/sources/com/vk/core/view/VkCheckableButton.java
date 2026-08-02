package com.vk.core.view;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

/* compiled from: VkCheckableButton.kt */
/* loaded from: classes17.dex */
public final class VkCheckableButton extends AppCompatImageButton implements Checkable {
    public static final int[] f = {R.attr.state_checked};
    public boolean e;

    /* compiled from: VkCheckableButton.kt */
    public static final class CustomState extends View.BaseSavedState {
        public static final Parcelable.Creator<CustomState> CREATOR = new a();
        public boolean b;

        /* compiled from: VkCheckableButton.kt */
        public static final class a implements Parcelable.Creator<CustomState> {
            @Override // android.os.Parcelable.Creator
            public final CustomState createFromParcel(Parcel parcel) {
                return new CustomState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomState[] newArray(int i) {
                return new CustomState[i];
            }
        }

        public CustomState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public CustomState(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt() != 0;
        }
    }

    public VkCheckableButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.e ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CustomState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CustomState customState = (CustomState) parcelable;
        super.onRestoreInstanceState(customState.getSuperState());
        this.e = customState.b;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CustomState customState = new CustomState(super.onSaveInstanceState());
        customState.b = this.e;
        return customState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z != this.e) {
            this.e = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.e);
    }

    public VkCheckableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
