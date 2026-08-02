package com.vk.core.view;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.baf0;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.m33;
import xsna.ozl;
import xsna.t440;
import xsna.uqm0;

/* compiled from: SimpleLikeView.kt */
@ozl
/* loaded from: classes17.dex */
public final class SimpleLikeView extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public final TextView b;
    public final ImageView c;
    public a d;
    public b e;

    /* compiled from: SimpleLikeView.kt */
    public interface a {
    }

    /* compiled from: SimpleLikeView.kt */
    public static final class b {
        public final int a;
        public final boolean b;

        public b(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(count=");
            sb.append(this.a);
            sb.append(", isLiked=");
            return q0.a(sb, this.b, ')');
        }
    }

    public SimpleLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = new b(0, false);
        LayoutInflater.from(context).inflate(R.layout.simple_like_view, (ViewGroup) this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClickable(true);
        setFocusable(true);
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(0);
        float f2 = 12;
        f4m.l(iah0.a(f2), iah0.a(f2), this);
        float f3 = 4;
        f4m.B(iah0.a(f3), iah0.a(f3), this);
        setBackground(m33.a(R.drawable.bg_simple_like, getContext()));
        setContentDescription(getResources().getString(R.string.accessibility_like));
        ImageView imageView = (ImageView) findViewById(R.id.likes_iv);
        this.c = imageView;
        this.b = (TextView) findViewById(R.id.likes_tv);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new baf0(m33.a(R.drawable.vk_icon_like_24, getContext()), getContext().getColor(R.color.vk_red_nice)));
        stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_24, getContext()), e3m.f(R.attr.vk_ui_icon_secondary, getContext())));
        imageView.setImageDrawable(stateListDrawable);
        bwt0.i0(this, new t440(context, this));
    }

    public final void a(int i) {
        String f2 = i > 0 ? uqm0.f(i) : null;
        boolean z = f2 != null;
        TextView textView = this.b;
        bwt0.p0(textView, z);
        textView.setText(f2);
        setContentDescription(i > 0 ? getResources().getQuantityString(R.plurals.accessibility_likes, i, Integer.valueOf(i)) : getResources().getString(R.string.accessibility_like));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.e = savedState.b;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.e;
        return savedState;
    }

    public final void setOnLikeClickListener(a aVar) {
        this.d = aVar;
    }

    public final void setState(b bVar) {
        this.e = bVar;
        setSelected(bVar.b);
        a(bVar.a);
    }

    /* compiled from: SimpleLikeView.kt */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public b b;

        /* compiled from: SimpleLikeView.kt */
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.b = new b(0, false);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b.a);
            parcel.writeInt(this.b.b ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.b = new b(0, false);
            this.b = new b(parcel.readInt(), parcel.readInt() == 1);
        }
    }
}
