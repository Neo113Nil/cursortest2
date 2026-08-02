package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3741s0 {
    public static final C3741s0 a = new C3741s0();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Ze ze, sq3 sq3Var) {
        C3690q0 c3690q0;
        int i;
        InterfaceC3317bf interfaceC3317bf;
        if (sq3Var instanceof C3690q0) {
            c3690q0 = (C3690q0) sq3Var;
            int i2 = c3690q0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3690q0.c = i2 - Integer.MIN_VALUE;
                Object obj = c3690q0.a;
                Object obj2 = lu3.a;
                i = c3690q0.c;
                if (i != 0) {
                    y6a.M(obj);
                    c3690q0.c = 1;
                    obj = b(ze, c3690q0);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                interfaceC3317bf = (InterfaceC3317bf) obj;
                if (interfaceC3317bf.c() != 204) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new S6(interfaceC3317bf.c()));
                }
                int c = interfaceC3317bf.c();
                C3437g6 c3437g6 = EnumC3489i6.b;
                if (c == 176) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new R6((short) 2369));
                }
                if (interfaceC3317bf.c() == 200) {
                    return interfaceC3317bf;
                }
                int c2 = interfaceC3317bf.c();
                throw new Y(new InMobiAdRequestStatus(c2 != 192 ? c2 != 0 ? (c2 == 504 || c2 == 176) ? InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT : (400 > c2 || c2 >= 500) ? (500 > c2 || c2 > 599) ? InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : InMobiAdRequestStatus.StatusCode.SERVER_ERROR : InMobiAdRequestStatus.StatusCode.REQUEST_INVALID : InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE : InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), new S6(interfaceC3317bf.c()));
            }
        }
        c3690q0 = new C3690q0(this, sq3Var);
        Object obj3 = c3690q0.a;
        Object obj22 = lu3.a;
        i = c3690q0.c;
        if (i != 0) {
        }
        interfaceC3317bf = (InterfaceC3317bf) obj3;
        if (interfaceC3317bf.c() != 204) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Ze ze, sq3 sq3Var) {
        C3715r0 c3715r0;
        int i;
        try {
            if (sq3Var instanceof C3715r0) {
                c3715r0 = (C3715r0) sq3Var;
                int i2 = c3715r0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3715r0.c = i2 - Integer.MIN_VALUE;
                    Object obj = c3715r0.a;
                    lu3 lu3Var = lu3.a;
                    i = c3715r0.c;
                    if (i == 0) {
                        if (i == 1) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    F9 f9 = (F9) Ve.a.getValue();
                    c3715r0.c = 1;
                    Object a2 = f9.a.a(ze, c3715r0);
                    return a2 == lu3Var ? lu3Var : a2;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException unused) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new R6((short) 2206));
        }
        c3715r0 = new C3715r0(this, sq3Var);
        Object obj2 = c3715r0.a;
        lu3 lu3Var2 = lu3.a;
        i = c3715r0.c;
    }
}
