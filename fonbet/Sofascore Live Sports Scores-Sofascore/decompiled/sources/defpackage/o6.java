package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class o6 extends m6 {
    public final ArrayList y;
    public final OvershootInterpolator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(Context context) {
        super(context, null, true);
        context.getClass();
        this.y = b.l(0, 0, 0, 0);
        this.z = new OvershootInterpolator(1.5f);
    }

    public final void u(crc crcVar, Function1 function1) {
        ValueAnimator ofInt = ValueAnimator.ofInt(((Number) this.y.get(crcVar.ordinal())).intValue(), wzb.a(p(crcVar) * 1000.0d));
        ofInt.setInterpolator(getProgressAnimationInterpolator());
        ofInt.setDuration(500L);
        ofInt.addUpdateListener(new n6(0, this, crcVar, function1));
        ofInt.start();
    }

    @Override // defpackage.m6
    @NotNull
    public OvershootInterpolator getProgressAnimationInterpolator() {
        return this.z;
    }
}
