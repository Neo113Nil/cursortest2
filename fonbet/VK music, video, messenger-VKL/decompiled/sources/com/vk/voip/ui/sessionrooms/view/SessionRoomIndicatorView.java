package com.vk.voip.ui.sessionrooms.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.bwt0;
import xsna.cn70;
import xsna.e3m;
import xsna.gzs;
import xsna.pvo0;
import xsna.s3q0;
import xsna.x7f;

/* compiled from: SessionRoomIndicatorView.kt */
/* loaded from: classes7.dex */
public final class SessionRoomIndicatorView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final TextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final View e;

    public SessionRoomIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void a(SessionRoomIndicatorView sessionRoomIndicatorView, int i, int i2) {
        AppCompatTextView appCompatTextView = sessionRoomIndicatorView.d;
        appCompatTextView.setPadding(i, appCompatTextView.getPaddingTop(), i2, appCompatTextView.getPaddingBottom());
    }

    public final void setRoomCountdownTimer(long j) {
        this.d.setText(pvo0.b(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    public final void setRoomCountdownTimerBackgroundTint(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        this.d.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i)));
    }

    public final void setRoomCountdownTimerVisible(boolean z) {
        bwt0.p0(this.c, z);
        bwt0.p0(this.d, z);
    }

    public final void setRoomLeaveButtonListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.e, new x7f(2, gzsVar));
    }

    public final void setRoomName(String str) {
        this.b.setText(str);
    }

    public SessionRoomIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View.inflate(context, R.layout.voip_session_room_indicator, this);
        View findViewById = findViewById(R.id.voip_call_session_room_indicator);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float c = cn70.c(16);
        shapeDrawable.setShape(new RoundRectShape(new float[]{c, c, c, c, c, c, c, c}, null, null));
        shapeDrawable.getPaint().setColor(context.getColor(R.color.vk_gray_700));
        shapeDrawable.getPaint().setAlpha(153);
        findViewById.setBackground(shapeDrawable);
        this.b = (TextView) findViewById(R.id.room_name);
        this.c = (AppCompatTextView) findViewById(R.id.room_count_down_dot);
        this.d = (AppCompatTextView) findViewById(R.id.room_count_down);
        this.e = findViewById(R.id.room_leave);
    }
}
