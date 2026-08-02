package com.vk.clips.design.view.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.clips.design.view.camera.ClipsTimerTimeSelectorTimeline;
import com.vk.clips.design.view.camera.ClipsTimerTimeSelectorWrap;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import xsna.bqz0;
import xsna.c5g;
import xsna.jpd;
import xsna.mz2;
import xsna.q9f;
import xsna.s9f;
import xsna.wzs;
import xsna.y8g0;

/* compiled from: ClipsTimerTimeSelectorWrap.kt */
/* loaded from: classes16.dex */
public final class ClipsTimerTimeSelectorWrap extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView b;
    public final ClipsTimerTimeSelectorTimeline c;

    public ClipsTimerTimeSelectorWrap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        View.inflate(context, R.layout.layout_clips_timer_time_selector, this);
        this.b = (TextView) findViewById(R.id.clips_camera_timer_record_stop);
        this.c = (ClipsTimerTimeSelectorTimeline) findViewById(R.id.camera_timer_time_selector);
    }

    public static String b(int i, wzs wzsVar) {
        if (i <= 59) {
            return (String) wzsVar.invoke(y8g0.d(R.plurals.clips_camera_timer_stop_recording_after_seconds, i, Integer.valueOf(i)), "");
        }
        if (i % 60 == 0) {
            int minutes = (int) TimeUnit.SECONDS.toMinutes(i);
            return (String) wzsVar.invoke(y8g0.d(R.plurals.clips_camera_timer_stop_recording_after_munites, minutes, Integer.valueOf(minutes)), "");
        }
        int minutes2 = (int) TimeUnit.SECONDS.toMinutes(i);
        int i2 = i - (minutes2 * 60);
        return (String) wzsVar.invoke(y8g0.d(R.plurals.clips_camera_timer_stop_recording_after_munites, minutes2, Integer.valueOf(minutes2)), y8g0.d(R.plurals.clips_camera_timer_stop_recording_after_seconds, i2, Integer.valueOf(i2)));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setOnTouchListeners(final q9f q9fVar) {
        final ClipsTimerTimeSelectorTimeline clipsTimerTimeSelectorTimeline = this.c;
        if (clipsTimerTimeSelectorTimeline != null) {
            clipsTimerTimeSelectorTimeline.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.r9f
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i = ClipsTimerTimeSelectorWrap.d;
                    byte b = 0;
                    if (motionEvent.getActionMasked() == 1) {
                        ClipsTimerTimeSelectorWrap clipsTimerTimeSelectorWrap = ClipsTimerTimeSelectorWrap.this;
                        ClipsTimerTimeSelectorTimeline clipsTimerTimeSelectorTimeline2 = clipsTimerTimeSelectorWrap.c;
                        String b2 = ClipsTimerTimeSelectorWrap.b(((int) (clipsTimerTimeSelectorTimeline.getCurrentValue() * q9fVar.j())) / 1000, new j21(b, 3));
                        ClipsTimerTimeSelectorTimeline clipsTimerTimeSelectorTimeline3 = clipsTimerTimeSelectorWrap.c;
                        if (clipsTimerTimeSelectorTimeline3 != null) {
                            clipsTimerTimeSelectorTimeline3.setContentDescription(b2);
                        }
                        if (clipsTimerTimeSelectorTimeline2 != null) {
                            clipsTimerTimeSelectorTimeline2.announceForAccessibility(b2);
                        }
                    }
                    return false;
                }
            });
        }
    }

    public final void a(bqz0 bqz0Var, Rect rect, int i) {
        jpd jpdVar = (jpd) bqz0Var.b;
        ClipsTimerTimeSelectorTimeline clipsTimerTimeSelectorTimeline = this.c;
        if (clipsTimerTimeSelectorTimeline != null) {
            clipsTimerTimeSelectorTimeline.setMaxDurationMs(bqz0Var.j());
            clipsTimerTimeSelectorTimeline.setRecordedLengthMs(jpdVar.G);
            ArrayList arrayList = jpdVar.q;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) (r3.c / ((ClipVideoItem) it.next()).h)));
            }
            Iterator it2 = arrayList2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                i2 += ((Number) it2.next()).intValue();
                clipsTimerTimeSelectorTimeline.r.add(Integer.valueOf(i2));
            }
            clipsTimerTimeSelectorTimeline.setContentDescription(b(clipsTimerTimeSelectorTimeline.getMaxDurationMs() / 1000, new mz2((byte) 0, 2)) + y8g0.e(R.string.clips_camera_timer_recording_descr_action));
            clipsTimerTimeSelectorTimeline.setOnSelectedChangeListener(new a(bqz0Var, this));
            float f = i == 0 ? 1.0f : i / clipsTimerTimeSelectorTimeline.b;
            clipsTimerTimeSelectorTimeline.z = f <= 1.0f ? f : 1.0f;
            clipsTimerTimeSelectorTimeline.x.setColor(clipsTimerTimeSelectorTimeline.u > 0 ? clipsTimerTimeSelectorTimeline.getContext().getColor(R.color.vk_sky_300) : -1);
            ClipsTimerTimeSelectorTimeline.c cVar = clipsTimerTimeSelectorTimeline.A;
            if (cVar != null) {
                cVar.onChanged(clipsTimerTimeSelectorTimeline.z);
            }
            if (!clipsTimerTimeSelectorTimeline.isLaidOut() || clipsTimerTimeSelectorTimeline.isLayoutRequested()) {
                clipsTimerTimeSelectorTimeline.addOnLayoutChangeListener(new s9f(rect));
            } else {
                rect.set(new Rect(clipsTimerTimeSelectorTimeline.getLeft(), clipsTimerTimeSelectorTimeline.getTop(), clipsTimerTimeSelectorTimeline.getRight(), clipsTimerTimeSelectorTimeline.getBottom()));
            }
            setOnTouchListeners(bqz0Var);
        }
    }

    public final Float getRecordingTimeFractionValue() {
        ClipsTimerTimeSelectorTimeline clipsTimerTimeSelectorTimeline = this.c;
        if (clipsTimerTimeSelectorTimeline != null) {
            return Float.valueOf(clipsTimerTimeSelectorTimeline.getCurrentValue());
        }
        return null;
    }
}
