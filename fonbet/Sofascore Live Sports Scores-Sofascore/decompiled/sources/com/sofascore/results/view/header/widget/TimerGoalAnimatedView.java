package com.sofascore.results.view.header.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.mqi;
import defpackage.u6b;
import defpackage.w1i;
import defpackage.ypa;
import defpackage.z1g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/sofascore/results/view/header/widget/TimerGoalAnimatedView;", "Lcom/sofascore/results/view/header/widget/RollingTextView;", "", "l", "I", "getSize", "()I", "size", "Landroid/text/TextPaint;", "o", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "textPaint", "Landroid/animation/ObjectAnimator;", TtmlNode.TAG_P, "Ljoa;", "getGoalFadeOutFadeIn", "()Landroid/animation/ObjectAnimator;", "goalFadeOutFadeIn", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimerGoalAnimatedView extends RollingTextView {
    public static final /* synthetic */ int q = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final int size;
    public String m;
    public boolean n;

    /* renamed from: o, reason: from kotlin metadata */
    public final TextPaint textPaint;
    public final mqi p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerGoalAnimatedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        context.getClass();
        this.size = ao2.s(14, context);
        TextPaint textPaint = new TextPaint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_regular, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(getSize());
        this.textPaint = textPaint;
        this.p = ypa.b(new w1i(this, 21));
    }

    private final ObjectAnimator getGoalFadeOutFadeIn() {
        return (ObjectAnimator) this.p.getValue();
    }

    @Override // com.sofascore.results.view.header.widget.RollingTextView
    public final void b() {
        super.b();
        getGoalFadeOutFadeIn().start();
    }

    @Override // com.sofascore.results.view.header.widget.RollingTextView
    public final void d(String str, boolean z, boolean z2) {
        if (this.n) {
            this.m = str;
        } else {
            super.d(str, z, false);
        }
    }

    @Override // com.sofascore.results.view.header.widget.RollingTextView
    public int getSize() {
        return this.size;
    }

    @Override // com.sofascore.results.view.header.widget.RollingTextView
    @NotNull
    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    @Override // com.sofascore.results.view.header.widget.RollingTextView, defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        super.onDestroy(u6bVar);
        getGoalFadeOutFadeIn().cancel();
    }

    @Override // com.sofascore.results.view.header.widget.RollingTextView, defpackage.rq4
    public final void onStop(u6b u6bVar) {
        this.wasActivityStopped = true;
        a();
        getGoalFadeOutFadeIn().cancel();
    }
}
