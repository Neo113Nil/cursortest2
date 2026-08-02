package com.vk.cameraui.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;
import xsna.lhg;
import xsna.m33;

/* compiled from: VideoRecordingTimerView.kt */
/* loaded from: classes.dex */
public final class VideoRecordingTimerView extends AppCompatTextView {
    public static final int c = iah0.a(6);
    public long b;

    public VideoRecordingTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1L;
        setCompoundDrawablePadding(iah0.a(6));
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.video_recording_dot, context2);
        int i = c;
        a.setBounds(0, 0, i, i);
        setCompoundDrawablesRelative(a, null, null, null);
        e(0L);
    }

    public static String b(int i) {
        return i == 0 ? "00" : i / 10 == 0 ? lhg.a(i, "0") : String.valueOf(i);
    }

    @SuppressLint({"SetTextI18n"})
    public final void e(long j) {
        long j2 = j / 1000;
        if (this.b == j2) {
            return;
        }
        this.b = j2;
        long j3 = 3600;
        long j4 = 60;
        setText(b((int) (j2 / j3)) + ':' + b((int) ((j2 % j3) / j4)) + ':' + b((int) (j2 % j4)));
    }
}
