package com.vk.photo.editor.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.vk.photo.editor.api.R$styleable;
import com.vkontakte.android.R;
import xsna.bym;
import xsna.hv7;
import xsna.izs;
import xsna.ou1;
import xsna.ow4;
import xsna.ptb;
import xsna.pw4;
import xsna.q2p0;
import xsna.q60;
import xsna.s3q0;
import xsna.s8;
import xsna.x16;
import xsna.xa9;

/* compiled from: ToolButton.kt */
/* loaded from: classes4.dex */
public final class ToolButton extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public izs<? super ToolButton, s3q0> b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final View f;
    public boolean g;

    /* compiled from: ToolButton.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public boolean d;

        /* compiled from: ToolButton.kt */
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
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt() != 0;
        }
    }

    public ToolButton(Context context) {
        this(context, null, 0, 0, 14);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final izs<ToolButton, s3q0> getOnClick() {
        return this.b;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(this.c.isClickable());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.b);
            setSelected(state.d);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        State state = new State(onSaveInstanceState);
        state.d = isSelected();
        return state;
    }

    public final void setIcon(int i) {
        this.d.setImageResource(i);
    }

    public final void setIndicatorActive(boolean z) {
        this.f.setVisibility(z ? 0 : 4);
    }

    public final void setOnClick(izs<? super ToolButton, s3q0> izsVar) {
        this.b = izsVar;
        this.c.setOnClickListener(new bym(5, izsVar, this));
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.c.setSelected(isSelected());
        this.d.setSelected(isSelected());
        this.e.setSelected(isSelected());
    }

    public final void setTitle(String str) {
        TextView textView = this.e;
        textView.setText(str);
        textView.setVisibility(str.length() == 0 ? 8 : 0);
    }

    public ToolButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12);
    }

    public ToolButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8);
    }

    public final void setTitle(int i) {
        TextView textView = this.e;
        textView.setText(i);
        textView.setVisibility(textView.getText().length() == 0 ? 8 : 0);
    }

    public /* synthetic */ ToolButton(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.editorToolButtonStyle : i, (i3 & 8) != 0 ? R.style.EditorToolButton : i2);
    }

    public ToolButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f, i, i2);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getBoolean(0, false) ? R.layout.tool_button_indicatorless : R.layout.tool_button, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.wrapper);
        this.c = findViewById;
        TextView textView = (TextView) findViewById(R.id.title);
        this.e = textView;
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        this.d = imageView;
        View findViewById2 = findViewById(R.id.indicator);
        this.f = findViewById2;
        String string = obtainStyledAttributes.getString(5);
        string = string == null ? "" : string;
        textView.setText(string);
        textView.setVisibility(string.length() == 0 ? 8 : 0);
        int i3 = 0;
        int i4 = 1;
        q2p0.a(obtainStyledAttributes, 4, new s8(i4, findViewById2, View.class, "setBackgroundColor", "setBackgroundColor(I)V", i3, 17), new ow4(i4, findViewById2, View.class, "setBackgroundResource", "setBackgroundResource(I)V", i3, 11), null, 16);
        int i5 = 1;
        q2p0.a(obtainStyledAttributes, 1, new pw4(i5, findViewById, View.class, "setBackgroundColor", "setBackgroundColor(I)V", i3, 9), new q60(i5, findViewById, View.class, "setBackgroundResource", "setBackgroundResource(I)V", i3, 12), null, 16);
        textView.setTextColor(0);
        int i6 = 1;
        q2p0.a(obtainStyledAttributes, 2, new ptb(i6, textView, TextView.class, "setTextColor", "setTextColor(I)V", i3, 4), null, new ou1(i6, textView, TextView.class, "setTextColor", "setTextColor(Landroid/content/res/ColorStateList;)V", i3, 11), 8);
        if (obtainStyledAttributes.hasValue(3)) {
            imageView.setImageDrawable(obtainStyledAttributes.getDrawable(3));
        }
        int i7 = 0;
        int i8 = 1;
        q2p0.a(obtainStyledAttributes, 2, new hv7(i8, imageView, ImageView.class, "setColorFilter", "setColorFilter(I)V", i7, 9), null, new xa9(i8, imageView, ImageView.class, "setImageTintList", "setImageTintList(Landroid/content/res/ColorStateList;)V", i7, 13), 8);
        findViewById.setOnClickListener(new x16(this, 17));
        obtainStyledAttributes.recycle();
    }
}
