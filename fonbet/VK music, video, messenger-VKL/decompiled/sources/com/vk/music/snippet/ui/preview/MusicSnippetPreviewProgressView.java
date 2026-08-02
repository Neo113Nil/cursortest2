package com.vk.music.snippet.ui.preview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.vk.core.view.SeekBarSamsungFixed;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: MusicSnippetPreviewProgressView.kt */
/* loaded from: classes3.dex */
public final class MusicSnippetPreviewProgressView extends ConstraintLayout {
    public int A;
    public final TextView t;
    public final TextView u;
    public final ConstraintLayout v;
    public final SeekBarSamsungFixed w;
    public final View x;
    public final View y;
    public int z;

    public MusicSnippetPreviewProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.music_snippet_progress_view, (ViewGroup) this, true);
        this.v = (ConstraintLayout) findViewById(R.id.container);
        this.t = (TextView) findViewById(R.id.duration);
        this.u = (TextView) findViewById(R.id.time);
        this.w = (SeekBarSamsungFixed) findViewById(R.id.snippet_seekbar);
        this.x = findViewById(R.id.border_start);
        this.y = findViewById(R.id.border_end);
    }

    private final void setTimeDuration(int i) {
        int i2 = i / 1000;
        String format = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
        TextView textView = this.t;
        if (TextUtils.equals(format, textView.getText())) {
            return;
        }
        textView.setText(format);
    }

    private final void setTimeStart(int i) {
        int i2 = i / 1000;
        String format = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
        TextView textView = this.u;
        if (TextUtils.equals(format, textView.getText())) {
            return;
        }
        textView.setText(format);
    }

    public final void P4(int i) {
        this.w.setProgress(i);
        setTimeStart(this.A + i);
    }

    public final void Q4(MusicTrack musicTrack, int i, int i2) {
        int i3 = musicTrack.c0;
        this.z = i3;
        this.A = i;
        float f = i3;
        float f2 = i / f;
        int i4 = i2 - i;
        float f3 = i4 / f;
        b bVar = new b();
        ConstraintLayout constraintLayout = this.v;
        bVar.i(constraintLayout);
        bVar.u(R.id.snippet_seekbar).e.e0 = f3;
        bVar.F(f2, R.id.snippet_seekbar);
        bVar.b(constraintLayout);
        SeekBarSamsungFixed seekBarSamsungFixed = this.w;
        seekBarSamsungFixed.setMax(i4);
        seekBarSamsungFixed.setEnabled(false);
        seekBarSamsungFixed.setVisibility(0);
        this.x.setVisibility(0);
        this.y.setVisibility(0);
        setTimeStart(i);
        setTimeDuration(this.z);
    }
}
