package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d70 implements am4 {
    public final yt9 a;
    public final tvd b;
    public final boolean c;

    public d70(yt9 yt9Var, tvd tvdVar, boolean z) {
        this.a = yt9Var;
        this.b = tvdVar;
        this.c = z;
    }

    public static final Drawable b(d70 d70Var, asf asfVar) {
        yt9 I = f5p.I(d70Var.a, d70Var.c);
        try {
            ImageDecoder.Source Y = eq3.Y(I, d70Var.b, true);
            if (Y == null) {
                l62 source = I.source();
                try {
                    source.request(Long.MAX_VALUE);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) source.u().b);
                    while (!source.u().w()) {
                        source.u().read(allocateDirect);
                    }
                    allocateDirect.flip();
                    source.close();
                    Y = ImageDecoder.createSource(allocateDirect);
                } finally {
                }
            }
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(Y, new y60(d70Var, asfVar, 0));
            o1j.t(I, null);
            return decodeDrawable;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.am4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        x60 x60Var;
        Object obj;
        int i;
        asf asfVar;
        Object F;
        Object c;
        asf asfVar2;
        if (rq3Var instanceof x60) {
            x60Var = (x60) rq3Var;
            int i2 = x60Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x60Var.u = i2 - Integer.MIN_VALUE;
                Object obj2 = x60Var.s;
                obj = lu3.a;
                i = x60Var.u;
                if (i != 0) {
                    y6a.M(obj2);
                    asfVar = new asf();
                    j4 j4Var = new j4(8, this, asfVar);
                    x60Var.r = asfVar;
                    x60Var.u = 1;
                    F = v8a.F(j4Var, x60Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        asfVar2 = x60Var.r;
                        y6a.M(obj2);
                        return new vl4(rfo.u((Drawable) obj2), asfVar2.a);
                    }
                    asf asfVar3 = x60Var.r;
                    y6a.M(obj2);
                    F = obj2;
                    asfVar = asfVar3;
                }
                x60Var.r = asfVar;
                x60Var.u = 2;
                c = c((Drawable) F, x60Var);
                if (c != obj) {
                    asf asfVar4 = asfVar;
                    obj2 = c;
                    asfVar2 = asfVar4;
                    return new vl4(rfo.u((Drawable) obj2), asfVar2.a);
                }
                return obj;
            }
        }
        x60Var = new x60(this, (sq3) rq3Var);
        Object obj22 = x60Var.s;
        obj = lu3.a;
        i = x60Var.u;
        if (i != 0) {
        }
        x60Var.r = asfVar;
        x60Var.u = 2;
        c = c((Drawable) F, x60Var);
        if (c != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Drawable drawable, sq3 sq3Var) {
        z60 z60Var;
        int i;
        if (sq3Var instanceof z60) {
            z60Var = (z60) sq3Var;
            int i2 = z60Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z60Var.u = i2 - Integer.MIN_VALUE;
                Object obj = z60Var.s;
                lu3 lu3Var = lu3.a;
                i = z60Var.u;
                tvd tvdVar = this.b;
                if (i != 0) {
                    y6a.M(obj);
                    if (!(drawable instanceof AnimatedImageDrawable)) {
                        return drawable;
                    }
                    sl6 sl6Var = qt9.a;
                    if (((Number) fqj.x(tvdVar, sl6Var)).intValue() != -2) {
                        ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) fqj.x(tvdVar, sl6Var)).intValue());
                    }
                    Function0 function0 = (Function0) fqj.x(tvdVar, qt9.c);
                    Function0 function02 = (Function0) fqj.x(tvdVar, qt9.d);
                    if (function0 != null || function02 != null) {
                        hs4 hs4Var = z45.a;
                        r69 r69Var = rob.a.f;
                        b70 b70Var = new b70(drawable, function0, function02, null);
                        z60Var.r = drawable;
                        z60Var.u = 1;
                        if (xw3.R(r69Var, b70Var, z60Var) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = (Drawable) z60Var.r;
                    y6a.M(obj);
                }
                return new lrg(drawable, tvdVar.c);
            }
        }
        z60Var = new z60(this, sq3Var);
        Object obj2 = z60Var.s;
        lu3 lu3Var2 = lu3.a;
        i = z60Var.u;
        tvd tvdVar2 = this.b;
        if (i != 0) {
        }
        return new lrg(drawable, tvdVar2.c);
    }
}
