package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w60 implements zl4 {
    public final boolean a;

    public w60() {
        this.a = Build.VERSION.SDK_INT < 34;
    }

    @Override // defpackage.zl4
    public final am4 a(fwh fwhVar, tvd tvdVar) {
        l62 source = fwhVar.a.source();
        if (!source.I(0L, yl4.b) && !source.I(0L, yl4.a) && (!source.I(0L, yl4.c) || !source.I(8L, yl4.d) || !source.I(12L, yl4.e) || !source.request(21L) || ((byte) (source.u().t(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !source.I(4L, yl4.f)) {
                return null;
            }
            if (!source.I(8L, yl4.g) && !source.I(8L, yl4.h) && !source.I(8L, yl4.i)) {
                return null;
            }
        }
        return new d70(fwhVar.a, tvdVar, this.a);
    }
}
