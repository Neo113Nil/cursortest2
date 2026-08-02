package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s40 implements hsk {
    public final ViewConfiguration a;

    public s40(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.hsk
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.hsk
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.hsk
    public final float c() {
        return this.a.getScaledMinimumFlingVelocity();
    }

    @Override // defpackage.hsk
    public final float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return q9.p(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.hsk
    public final float f() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.hsk
    public final float g() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.hsk
    public final float h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return q9.o(this.a);
        }
        return 16.0f;
    }
}
