package com.inmobi.media;

import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3744s3 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095 A[Catch: Exception -> 0x00bc, CancellationException -> 0x00c5, TryCatch #2 {CancellationException -> 0x00c5, Exception -> 0x00bc, blocks: (B:11:0x002c, B:12:0x008b, B:14:0x0095, B:20:0x00a2, B:22:0x00a6, B:27:0x00b1, B:34:0x0076), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Z2 z2, sq3 sq3Var) {
        C3718r3 c3718r3;
        int i;
        InterfaceC3317bf interfaceC3317bf;
        Z2 z22 = z2;
        try {
            if (sq3Var instanceof C3718r3) {
                c3718r3 = (C3718r3) sq3Var;
                int i2 = c3718r3.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3718r3.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3718r3.b;
                    lu3 lu3Var = lu3.a;
                    i = c3718r3.d;
                    if (i != 0) {
                        y6a.M(obj);
                        E3 e3 = E3.a;
                        int i3 = z22.a;
                        Xe xe = new Xe(z22.b, E3.a(z22), new Ok(E3.c().getPingTimeout() * 1000, E3.c().getPingTimeout() * 1000, E3.c().getPingTimeout() * 1000), z22.c, null, z22.d, 16);
                        F9 f9 = (F9) Ve.f.getValue();
                        c3718r3.a = z22;
                        c3718r3.d = 1;
                        obj = f9.a.a(xe, c3718r3);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z22 = c3718r3.a;
                        y6a.M(obj);
                    }
                    interfaceC3317bf = (InterfaceC3317bf) obj;
                    E3 e32 = E3.a;
                    if (!Fl.a(interfaceC3317bf)) {
                        return null;
                    }
                    int c = interfaceC3317bf.c();
                    if (200 <= c && c < 300) {
                        return null;
                    }
                    if (!z22.d) {
                        C3437g6 c3437g6 = EnumC3489i6.b;
                        if (303 == c || 302 == c) {
                            return null;
                        }
                    }
                    EnumC3489i6.b.getClass();
                    return C3437g6.a(c);
                }
            }
            if (i != 0) {
            }
            interfaceC3317bf = (InterfaceC3317bf) obj;
            E3 e322 = E3.a;
            if (!Fl.a(interfaceC3317bf)) {
            }
        } catch (CancellationException unused) {
            E3 e33 = E3.a;
            return EnumC3489i6.n;
        } catch (Exception e) {
            E3 e34 = E3.a;
            e.getMessage();
            return EnumC3489i6.d;
        }
        c3718r3 = new C3718r3(this, sq3Var);
        Object obj2 = c3718r3.b;
        lu3 lu3Var2 = lu3.a;
        i = c3718r3.d;
    }
}
