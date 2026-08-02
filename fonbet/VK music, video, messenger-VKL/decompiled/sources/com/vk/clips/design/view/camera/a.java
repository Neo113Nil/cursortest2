package com.vk.clips.design.view.camera;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.vk.clips.design.view.camera.ClipsTimerTimeSelectorTimeline;
import kotlin.text.Regex;
import xsna.bqz0;
import xsna.jpd;
import xsna.kjt;
import xsna.yx5;
import xsna.zk10;

/* compiled from: ClipsTimerTimeSelectorWrap.kt */
/* loaded from: classes16.dex */
public final class a implements ClipsTimerTimeSelectorTimeline.c {
    public final /* synthetic */ bqz0 a;
    public final /* synthetic */ ClipsTimerTimeSelectorWrap b;

    public a(bqz0 bqz0Var, ClipsTimerTimeSelectorWrap clipsTimerTimeSelectorWrap) {
        this.a = bqz0Var;
        this.b = clipsTimerTimeSelectorWrap;
    }

    @Override // com.vk.clips.design.view.camera.ClipsTimerTimeSelectorTimeline.c
    public final void onChanged(float f) {
        String b = ClipsTimerTimeSelectorWrap.b((((int) (r0.j() * f)) - ((jpd) this.a.b).G) / 1000, new yx5(2));
        TextView textView = this.b.b;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(b);
            kjt.a aVar = new kjt.a(Regex.d(new Regex("\\d+"), b));
            while (aVar.hasNext()) {
                zk10 zk10Var = (zk10) aVar.next();
                spannableString.setSpan(new StyleSpan(1), zk10Var.c().b, zk10Var.c().c + 1, 33);
            }
            textView.setText(spannableString);
        }
    }
}
