package com.inmobi.media;

import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.x5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3876x5 extends AbstractC3913yg {
    public final C3705qf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3876x5(Fg fg) {
        super(fg);
        fg.getClass();
        this.d = new C3705qf(fg, new C3824v5(this), this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (r13.a(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r15 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3473hg c3473hg, sq3 sq3Var) {
        C3850w5 c3850w5;
        Object obj;
        int i;
        if (sq3Var instanceof C3850w5) {
            c3850w5 = (C3850w5) sq3Var;
            int i2 = c3850w5.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3850w5.d = i2 - Integer.MIN_VALUE;
                obj = c3850w5.b;
                Object obj2 = lu3.a;
                i = c3850w5.d;
                if (i != 0) {
                    y6a.M(obj);
                    String str = c3473hg.b;
                    String str2 = c3473hg.e;
                    c3850w5.a = c3473hg;
                    c3850w5.d = 1;
                    obj = a(str2, c3850w5);
                } else if (i == 1) {
                    c3473hg = c3850w5.a;
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    C3705qf c3705qf = this.d;
                    c3850w5.d = 3;
                }
                C3473hg c3473hg2 = c3473hg;
                if (((Boolean) obj).booleanValue()) {
                    WeakReference weakReference = (WeakReference) this.b.get(c3473hg2.h);
                    AbstractC3913yg.a(0, "Database capacity exceeded for pings", (short) 2248, c3473hg2, System.currentTimeMillis(), weakReference != null ? (InterfaceC3835vg) weakReference.get() : null);
                    return Unit.a;
                }
                Fg fg = this.a;
                c3850w5.a = null;
                c3850w5.d = 2;
                Object a = fg.a.a("pings", Gg.a(c3473hg2), 4, c3850w5);
                if (a != obj2) {
                    a = Unit.a;
                }
            }
        }
        c3850w5 = new C3850w5(this, sq3Var);
        obj = c3850w5.b;
        Object obj22 = lu3.a;
        i = c3850w5.d;
        if (i != 0) {
        }
        C3473hg c3473hg22 = c3473hg;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
