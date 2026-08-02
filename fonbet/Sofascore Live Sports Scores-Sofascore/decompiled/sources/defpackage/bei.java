package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bei implements zl4 {
    public final /* synthetic */ int a;
    public final Object b;

    public bei() {
        this.a = 1;
        this.b = soi.d;
    }

    @Override // defpackage.zl4
    public final am4 a(fwh fwhVar, tvd tvdVar) {
        ImageDecoder.Source Y;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bitmap.Config c = vt9.c(tvdVar);
                if ((c == Bitmap.Config.ARGB_8888 || c == Bitmap.Config.HARDWARE) && (Y = eq3.Y(fwhVar.a, tvdVar, false)) != null) {
                    return new dei(Y, fwhVar.a, tvdVar, (g4h) obj);
                }
                return null;
            default:
                String str = fwhVar.b;
                yt9 yt9Var = fwhVar.a;
                if (!Intrinsics.c(str, "image/svg+xml")) {
                    l62 source = yt9Var.source();
                    if (!source.I(0L, xl4.b) || source.R(1024L, xl4.a) == -1) {
                        return null;
                    }
                }
                return new soi(yt9Var, tvdVar, (Function1) obj);
        }
    }

    public bei(g4h g4hVar) {
        this.a = 0;
        this.b = g4hVar;
    }
}
