package com.vk.profile.community.impl.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e3m;
import xsna.iah0;
import xsna.jno0;
import xsna.m33;
import xsna.n23;
import xsna.omw;
import xsna.qoy;
import xsna.shy;
import xsna.too0;

/* compiled from: StatusButtonView.kt */
/* loaded from: classes5.dex */
public final class StatusButtonView extends FrameLayout {
    public final NotificationImageView b;
    public final TextView c;
    public int d;

    /* compiled from: StatusButtonView.kt */
    public static final class NotificationImageView extends AppCompatImageView implements too0 {
        public boolean b;
        public final float c;
        public final Paint d;
        public int e;
        public Drawable f;

        public NotificationImageView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.c = iah0.b(3.0f);
            this.d = new Paint(1);
            this.e = iah0.a(16);
            e3m.a aVar = e3m.a;
            Drawable a = m33.a(R.drawable.vk_icon_done_circle_16, context);
            a.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_accent), PorterDuff.Mode.SRC_IN);
            this.f = a;
        }

        @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
        public final void Ng() {
            this.f.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_accent), PorterDuff.Mode.SRC_IN);
        }

        public final Drawable getNotificationCircleDrawable() {
            return this.f;
        }

        public final int getNotificationSize() {
            return this.e;
        }

        public final Paint getPaint() {
            return this.d;
        }

        public final float getRadius() {
            return this.c;
        }

        public final boolean getShowNotificationCircle() {
            return this.b;
        }

        @Override // android.widget.ImageView, android.view.View
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.b) {
                this.f.draw(canvas);
            }
        }

        @Override // android.widget.ImageView, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.f.setBounds(getMeasuredWidth() - this.e, 0, getMeasuredWidth(), this.e);
        }

        public final void setNotificationCircleDrawable(Drawable drawable) {
            this.f = drawable;
        }

        public final void setNotificationSize(int i) {
            this.e = i;
        }

        public final void setShowNotificationCircle(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: StatusButtonView.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;

        public a(int i, boolean z, int i2, boolean z2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return qoy.b(qoy.b(shy.a(R.attr.vk_ui_icon_accent, shy.a(R.attr.vk_ui_text_accent, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.d), 961, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatusButtonData(type=");
            sb.append(this.a);
            sb.append(", icon=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", textColorRes=2130971845, iconColorRes=2130971803, showNotificationCircle=");
            sb.append(this.d);
            sb.append(", visible=");
            return n23.b(sb, this.e, ", customNotificationCircleRes=null, customNotificationSize=null)");
        }
    }

    public StatusButtonView(Context context) {
        super(context);
        this.d = -1;
        LayoutInflater.from(context).inflate(R.layout.community_item_status_button, (ViewGroup) this, true);
        this.b = (NotificationImageView) findViewById(R.id.icon);
        this.c = (TextView) findViewById(R.id.text);
    }

    public final int getType() {
        return this.d;
    }

    public final void setData(a aVar) {
        int i = aVar.c;
        TextView textView = this.c;
        textView.setText(i);
        jno0.c(textView, R.attr.vk_ui_text_accent);
        int i2 = aVar.b;
        NotificationImageView notificationImageView = this.b;
        notificationImageView.setImageResource(i2);
        notificationImageView.b = aVar.d;
        notificationImageView.invalidate();
        omw.b(notificationImageView, R.attr.vk_ui_icon_accent);
        this.d = aVar.a;
        setContentDescription(getContext().getString(i));
        setVisibility(aVar.e ? 0 : 8);
    }

    public final void setType(int i) {
        this.d = i;
    }
}
