package com.vk.auth.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.auth.common.R$styleable;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.e370;
import xsna.epx;
import xsna.fvr;
import xsna.ggn0;
import xsna.hnj;
import xsna.iah0;
import xsna.ifx0;
import xsna.krv0;
import xsna.lgr0;
import xsna.t65;
import xsna.x9;

/* compiled from: AuthExchangeAvatarControlView.kt */
/* loaded from: classes15.dex */
public final class AuthExchangeAvatarControlView extends FrameLayout {
    public static final int l = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 2);
    public static final int m;
    public final ImageView b;
    public final View c;
    public final TextView d;
    public boolean e;
    public final View f;
    public final com.vk.core.ui.image.a<View> g;
    public final Paint h;
    public final int i;
    public final int j;
    public boolean k;

    /* compiled from: AuthExchangeAvatarControlView.kt */
    public static final class CustomState extends View.BaseSavedState {
        public static final Parcelable.Creator<CustomState> CREATOR = new a();
        public boolean b;

        /* compiled from: AuthExchangeAvatarControlView.kt */
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

    static {
        bpn0 bpn0Var = t65.a;
        m = (int) ((20 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public AuthExchangeAvatarControlView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        this.e = true;
        ifx0 ifx0Var = e370.c;
        lgr0 create = (ifx0Var == null ? null : ifx0Var).a().create(getContext());
        this.g = create;
        Paint c = x9.c(true);
        c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c.setColor(0);
        this.h = c;
        setLayerType(1, null);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_exchange_avatar_layout, this);
        VKReplacerView vKReplacerView = (VKReplacerView) findViewById(R.id.exchange_user_avatar_view);
        ImageView imageView = (ImageView) findViewById(R.id.selected_icon);
        this.b = imageView;
        this.c = findViewById(R.id.delete_icon);
        this.d = (TextView) findViewById(R.id.notifications_counter);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            this.i = obtainStyledAttributes.getInt(4, 0);
            setBorderSelectionColor(obtainStyledAttributes.getColor(1, krv0.m(R.attr.vk_ui_stroke_accent, getContext())));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            this.j = obtainStyledAttributes.getDimensionPixelSize(2, l);
            obtainStyledAttributes.recycle();
            ggn0 view = create.getView();
            this.f = view;
            vKReplacerView.a(view);
            if (dimensionPixelSize != -1) {
                create.setAvatarSize(dimensionPixelSize);
            }
            if (dimensionPixelSize2 != -1) {
                imageView.getLayoutParams().width = dimensionPixelSize2;
                imageView.getLayoutParams().height = dimensionPixelSize2;
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setSelectionBorderVisible(boolean z) {
        this.k = z;
        this.g.c(z);
    }

    public final void a(View view, Canvas canvas) {
        if (view.getVisibility() != 0) {
            return;
        }
        canvas.drawCircle((view.getRight() + view.getLeft()) / 2.0f, (view.getBottom() + view.getTop()) / 2.0f, (view.getWidth() / 2.0f) + this.j, this.h);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (epx.f(view, this.f)) {
            if (this.e) {
                a(this.b, canvas);
            }
            a(this.c, canvas);
        }
        return drawChild;
    }

    public final View getDeleteButton() {
        return this.c;
    }

    public final TextView getNotificationsIcon() {
        return this.d;
    }

    public final ImageView getSelectedIcon() {
        return this.b;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CustomState customState = (CustomState) parcelable;
        super.onRestoreInstanceState(customState.getSuperState());
        setSelectionBorderVisible(customState.b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CustomState customState = new CustomState(super.onSaveInstanceState());
        customState.b = this.k;
        return customState;
    }

    public final void setBorderSelectionColor(int i) {
        this.g.g(i);
    }

    public final void setDeleteButtonVisible(boolean z) {
        int i = z ? 0 : 8;
        View view = this.c;
        view.setVisibility(i);
        if (z) {
            fvr.o(iah0.a(10), view);
        } else {
            setTouchDelegate(null);
        }
    }

    public final void setNotificationsCount(int i) {
        String valueOf = i < 100 ? String.valueOf(i) : "99+";
        TextView textView = this.d;
        textView.setText(valueOf);
        int length = valueOf.length();
        int i2 = m;
        if (length <= 1) {
            textView.getLayoutParams().width = i2;
            textView.getLayoutParams().height = i2;
            textView.setBackgroundResource(R.drawable.vk_auth_bg_exchange_notifications_oval);
        } else {
            textView.getLayoutParams().width = -2;
            textView.getLayoutParams().height = i2;
            textView.setBackgroundResource(R.drawable.vk_auth_bg_exchange_notifications_rect);
        }
        textView.requestLayout();
    }

    public final void setNotificationsIconVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public final void setSelectedIconBorderEnabled(boolean z) {
        this.e = z;
        invalidate();
    }

    public final void setSelectionVisible(boolean z) {
        ImageView imageView = this.b;
        int i = this.i;
        if (i == 0) {
            imageView.setVisibility(z ? 0 : 8);
            return;
        }
        if (i == 1) {
            setSelectionBorderVisible(z);
            invalidate();
        } else {
            if (i != 2) {
                return;
            }
            imageView.setVisibility(z ? 0 : 8);
            setSelectionBorderVisible(z);
            invalidate();
        }
    }

    private static /* synthetic */ void getSelectionStyle$annotations() {
    }
}
