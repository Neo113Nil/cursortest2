package defpackage;

import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dei implements am4 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final tvd c;
    public final g4h d;

    public dei(ImageDecoder.Source source, AutoCloseable autoCloseable, tvd tvdVar, g4h g4hVar) {
        this.a = source;
        this.b = autoCloseable;
        this.c = tvdVar;
        this.d = g4hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.am4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        cei ceiVar;
        int i;
        g4h g4hVar;
        try {
            try {
                if (rq3Var instanceof cei) {
                    ceiVar = (cei) rq3Var;
                    int i2 = ceiVar.u;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ceiVar.u = i2 - Integer.MIN_VALUE;
                        Object obj = ceiVar.s;
                        lu3 lu3Var = lu3.a;
                        i = ceiVar.u;
                        int i3 = 1;
                        if (i != 0) {
                            y6a.M(obj);
                            g4h g4hVar2 = this.d;
                            ceiVar.r = g4hVar2;
                            ceiVar.u = 1;
                            if (g4hVar2.a(ceiVar) == lu3Var) {
                                return lu3Var;
                            }
                            g4hVar = g4hVar2;
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g4hVar = ceiVar.r;
                            y6a.M(obj);
                        }
                        AutoCloseable autoCloseable = this.b;
                        asf asfVar = new asf();
                        vl4 vl4Var = new vl4(new ax1(ImageDecoder.decodeBitmap(this.a, new y60(this, asfVar, i3))), asfVar.a);
                        o1j.t(autoCloseable, null);
                        return vl4Var;
                    }
                }
                asf asfVar2 = new asf();
                vl4 vl4Var2 = new vl4(new ax1(ImageDecoder.decodeBitmap(this.a, new y60(this, asfVar2, i3))), asfVar2.a);
                o1j.t(autoCloseable, null);
                return vl4Var2;
            } finally {
            }
            AutoCloseable autoCloseable2 = this.b;
        } finally {
            g4hVar.c();
        }
        ceiVar = new cei(this, (sq3) rq3Var);
        Object obj2 = ceiVar.s;
        lu3 lu3Var2 = lu3.a;
        i = ceiVar.u;
        int i32 = 1;
        if (i != 0) {
        }
    }
}
