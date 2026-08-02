package com.pierfrancescosoffritti.androidyoutubeplayer.core.customui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import com.vungle.ads.internal.task.g;
import defpackage.ane;
import defpackage.bne;
import defpackage.dad;
import defpackage.snl;
import defpackage.t4f;
import defpackage.tba;
import defpackage.tjf;
import defpackage.u61;
import defpackage.xnl;
import defpackage.yme;
import defpackage.ynl;
import defpackage.zme;
import defpackage.znl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/customui/views/YouTubePlayerSeekBar;", "Landroid/widget/LinearLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lynl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", TtmlNode.ATTR_TTS_FONT_SIZE, "", "setFontSize", "(F)V", "", "color", "setColor", "(I)V", "", "d", "Z", "getShowBufferingProgress", "()Z", "setShowBufferingProgress", "(Z)V", "showBufferingProgress", "Lznl;", "e", "Lznl;", "getYoutubePlayerSeekBarListener", "()Lznl;", "setYoutubePlayerSeekBarListener", "(Lznl;)V", "youtubePlayerSeekBarListener", "Landroid/widget/TextView;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/widget/TextView;", "getVideoCurrentTimeTextView", "()Landroid/widget/TextView;", "videoCurrentTimeTextView", g.e, "getVideoDurationTextView", "videoDurationTextView", "Landroid/widget/SeekBar;", h.b, "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBar", "custom-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YouTubePlayerSeekBar extends LinearLayout implements SeekBar.OnSeekBarChangeListener, ynl {
    public boolean a;
    public int b;
    public boolean c;

    /* renamed from: d, reason: from kotlin metadata */
    public boolean showBufferingProgress;

    /* renamed from: e, reason: from kotlin metadata */
    public znl youtubePlayerSeekBarListener;

    /* renamed from: f, reason: from kotlin metadata */
    public final TextView videoCurrentTimeTextView;

    /* renamed from: g, reason: from kotlin metadata */
    public final TextView videoDurationTextView;

    /* renamed from: h, reason: from kotlin metadata */
    public final SeekBar seekBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = -1;
        this.showBufferingProgress = true;
        TextView textView = new TextView(context);
        this.videoCurrentTimeTextView = textView;
        TextView textView2 = new TextView(context);
        this.videoDurationTextView = textView2;
        SeekBar seekBar = new SeekBar(context);
        this.seekBar = seekBar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, tjf.a, 0, 0);
        obtainStyledAttributes.getClass();
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.ayp_12sp));
        int color = obtainStyledAttributes.getColor(0, context.getColor(R.color.ayp_red));
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.ayp_8dp);
        textView.setText(getResources().getString(R.string.ayp_null_time));
        textView.setPadding(dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize2);
        textView.setTextColor(context.getColor(android.R.color.white));
        textView.setGravity(16);
        textView2.setText(getResources().getString(R.string.ayp_null_time));
        textView2.setPadding(0, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        textView2.setTextColor(context.getColor(android.R.color.white));
        textView2.setGravity(16);
        setFontSize(dimensionPixelSize);
        int i = dimensionPixelSize2 * 2;
        seekBar.setPadding(i, dimensionPixelSize2, i, dimensionPixelSize2);
        setColor(color);
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
        addView(seekBar, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        setGravity(16);
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // defpackage.ynl
    public final void a(snl snlVar, ane aneVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void b(snl snlVar, String str) {
        snlVar.getClass();
        str.getClass();
    }

    @Override // defpackage.ynl
    public final void c(snl snlVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void d(snl snlVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void e(snl snlVar, float f) {
        snlVar.getClass();
        if (this.a) {
            return;
        }
        if (this.b <= 0 || tba.n(f).equals(tba.n(this.b))) {
            this.b = -1;
            this.seekBar.setProgress((int) f);
        }
    }

    @Override // defpackage.ynl
    public final void f(snl snlVar, bne bneVar) {
        snlVar.getClass();
        this.b = -1;
        int ordinal = bneVar.ordinal();
        if (ordinal == 1) {
            SeekBar seekBar = this.seekBar;
            seekBar.setProgress(0);
            seekBar.setMax(0);
            this.videoDurationTextView.post(new t4f(this, 26));
            return;
        }
        if (ordinal == 2) {
            this.c = false;
        } else if (ordinal == 3) {
            this.c = true;
        } else {
            if (ordinal != 4) {
                return;
            }
            this.c = false;
        }
    }

    @Override // defpackage.ynl
    public final void g(snl snlVar, zme zmeVar) {
        snlVar.getClass();
    }

    @NotNull
    public final SeekBar getSeekBar() {
        return this.seekBar;
    }

    public final boolean getShowBufferingProgress() {
        return this.showBufferingProgress;
    }

    @NotNull
    public final TextView getVideoCurrentTimeTextView() {
        return this.videoCurrentTimeTextView;
    }

    @NotNull
    public final TextView getVideoDurationTextView() {
        return this.videoDurationTextView;
    }

    @Nullable
    public final znl getYoutubePlayerSeekBarListener() {
        return this.youtubePlayerSeekBarListener;
    }

    @Override // defpackage.ynl
    public final void h(snl snlVar, float f) {
        snlVar.getClass();
        this.videoDurationTextView.setText(tba.n(f));
        this.seekBar.setMax((int) f);
    }

    @Override // defpackage.ynl
    public final void i(snl snlVar, yme ymeVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void j(snl snlVar, float f) {
        snlVar.getClass();
        boolean z = this.showBufferingProgress;
        SeekBar seekBar = this.seekBar;
        if (z) {
            seekBar.setSecondaryProgress((int) (f * seekBar.getMax()));
        } else {
            seekBar.setSecondaryProgress(0);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        seekBar.getClass();
        this.videoCurrentTimeTextView.setText(tba.n(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        seekBar.getClass();
        this.a = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        seekBar.getClass();
        if (this.c) {
            this.b = seekBar.getProgress();
        }
        znl znlVar = this.youtubePlayerSeekBarListener;
        if (znlVar != null) {
            float progress = seekBar.getProgress();
            xnl xnlVar = (xnl) ((u61) ((dad) znlVar).b).b;
            xnlVar.b(xnlVar.a, "seekTo", Float.valueOf(progress));
        }
        this.a = false;
    }

    public final void setColor(int color) {
        SeekBar seekBar = this.seekBar;
        seekBar.getThumb().setTint(color);
        seekBar.getProgressDrawable().setTint(color);
    }

    public final void setFontSize(float fontSize) {
        this.videoCurrentTimeTextView.setTextSize(0, fontSize);
        this.videoDurationTextView.setTextSize(0, fontSize);
    }

    public final void setShowBufferingProgress(boolean z) {
        this.showBufferingProgress = z;
    }

    public final void setYoutubePlayerSeekBarListener(@Nullable znl znlVar) {
        this.youtubePlayerSeekBarListener = znlVar;
    }
}
