package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.OvershootInterpolator;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class q6 extends r6 {
    public int r;
    public final OvershootInterpolator s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(Context context) {
        super(context, true);
        context.getClass();
        this.s = new OvershootInterpolator(1.5f);
    }

    public final void q(Function1 function1) {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.r, (int) (o(crc.a) * 1000.0d));
        ofInt.setInterpolator(getProgressAnimationInterpolator());
        ofInt.setDuration(500L);
        ofInt.addUpdateListener(new p6(0, this, function1));
        ofInt.start();
    }

    @Override // defpackage.r6
    @NotNull
    public OvershootInterpolator getProgressAnimationInterpolator() {
        return this.s;
    }
}
