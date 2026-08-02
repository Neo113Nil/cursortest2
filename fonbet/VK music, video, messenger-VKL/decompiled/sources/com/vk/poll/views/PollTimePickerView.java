package com.vk.poll.views;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.log.L;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e3m;
import xsna.n1l;
import xsna.wvv0;
import xsna.xuo0;

/* compiled from: PollEditViews.kt */
/* loaded from: classes17.dex */
public final class PollTimePickerView extends LinearLayout {
    public final n1l b;

    public PollTimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate(R.layout.poll_time_picker_view, this);
        TextView textView = (TextView) findViewById(R.id.btn_start_date);
        TextView textView2 = (TextView) findViewById(R.id.btn_start_time);
        Context context2 = getContext();
        textView.setBackground(wvv0.a(context2, R.drawable.vkui_bg_edittext, dhr0.Y(R.attr.vk_ui_field_background, context2), dhr0.Y(R.attr.vk_ui_field_background, context2), dhr0.Y(R.attr.vk_ui_background_accent, context2), dhr0.Y(R.attr.vk_ui_field_border_alpha, context2)));
        Context context3 = getContext();
        textView2.setBackground(wvv0.a(context3, R.drawable.vkui_bg_edittext, dhr0.Y(R.attr.vk_ui_field_background, context3), dhr0.Y(R.attr.vk_ui_field_background, context3), dhr0.Y(R.attr.vk_ui_background_accent, context3), dhr0.Y(R.attr.vk_ui_field_border_alpha, context3)));
        n1l n1lVar = new n1l(textView, textView2, (AppCompatActivity) e3m.h(getContext()), getContext().getString(R.string.poll_start_limit_error), getContext().getString(R.string.poll_end_limit_error));
        this.b = n1lVar;
        xuo0.a.getClass();
        n1lVar.d.setTimeInMillis((((int) (xuo0.a() / 1000)) + 86400) * 1000);
        n1lVar.a();
    }

    public final void a() {
        AppCompatActivity appCompatActivity = this.b.c;
        Fragment findFragmentByTag = appCompatActivity.getFragmentManager().findFragmentByTag("datepicker");
        Fragment findFragmentByTag2 = appCompatActivity.getFragmentManager().findFragmentByTag("timepicker");
        try {
            if (findFragmentByTag instanceof DialogFragment) {
                ((DialogFragment) findFragmentByTag).dismiss();
            } else if (findFragmentByTag2 instanceof DialogFragment) {
                ((DialogFragment) findFragmentByTag2).dismiss();
            }
        } catch (IllegalStateException e) {
            L.i(e);
        }
    }

    public final long getUnixTime() {
        return this.b.d.getTimeInMillis() / 1000;
    }

    public final void setUnitTime(long j) {
        n1l n1lVar = this.b;
        n1lVar.d.setTimeInMillis(((int) j) * 1000);
        n1lVar.a();
    }
}
