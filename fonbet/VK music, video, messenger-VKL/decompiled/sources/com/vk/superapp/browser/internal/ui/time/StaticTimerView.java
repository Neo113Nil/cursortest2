package com.vk.superapp.browser.internal.ui.time;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.enj;
import xsna.q6x;

/* compiled from: StaticTimerView.kt */
/* loaded from: classes6.dex */
public final class StaticTimerView extends ConstraintLayout {
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    public StaticTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.vk_time_view, this);
        this.t = (TextView) findViewById(R.id.vk_time_first_hour_number_view);
        this.u = (TextView) findViewById(R.id.vk_time_second_hour_number_view);
        this.v = (TextView) findViewById(R.id.vk_time_first_minute_number_view);
        this.w = (TextView) findViewById(R.id.vk_time_second_minute_number_view);
        this.x = (TextView) findViewById(R.id.vk_time_hours_view);
        this.y = (TextView) findViewById(R.id.vk_time_minutes_view);
    }

    public final void P4(int i) {
        Pair pair;
        int currentTimeMillis = i - ((int) (System.currentTimeMillis() / 1000));
        if (currentTimeMillis <= 0) {
            pair = new Pair(0, 0);
        } else if (currentTimeMillis >= 356400) {
            pair = new Pair(99, 0);
        } else {
            int i2 = currentTimeMillis / 60;
            pair = new Pair(Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60));
        }
        Pair q = q6x.q(((Number) pair.i()).intValue());
        Pair q2 = q6x.q(((Number) pair.j()).intValue());
        int intValue = ((Number) pair.i()).intValue();
        int intValue2 = ((Number) q.i()).intValue();
        int intValue3 = ((Number) q.j()).intValue();
        int intValue4 = ((Number) pair.j()).intValue();
        int intValue5 = ((Number) q2.i()).intValue();
        int intValue6 = ((Number) q2.j()).intValue();
        this.t.setText(String.valueOf(intValue2));
        this.u.setText(String.valueOf(intValue3));
        this.x.setText(enj.f(R.plurals.vk_apps_time_hours, intValue, getContext()));
        this.v.setText(String.valueOf(intValue5));
        this.w.setText(String.valueOf(intValue6));
        this.y.setText(enj.f(R.plurals.vk_apps_time_minutes, intValue4, getContext()));
    }
}
