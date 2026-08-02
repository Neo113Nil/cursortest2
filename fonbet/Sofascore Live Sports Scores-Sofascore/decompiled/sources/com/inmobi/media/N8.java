package com.inmobi.media;

import com.mbridge.msdk.foundation.download.Command;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class N8 extends AbstractC3913yg {
    public final C3800u7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(Fg fg) {
        super(fg);
        fg.getClass();
        this.d = new C3800u7(fg, new M8(this), this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3473hg c3473hg, sq3 sq3Var) {
        K8 k8;
        int i;
        if (sq3Var instanceof K8) {
            k8 = (K8) sq3Var;
            int i2 = k8.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k8.d = i2 - Integer.MIN_VALUE;
                Object obj = k8.b;
                lu3 lu3Var = lu3.a;
                i = k8.d;
                if (i != 0) {
                    y6a.M(obj);
                    C3860wf c3860wf = this.c;
                    k8.a = c3473hg;
                    k8.d = 1;
                    c3860wf.getClass();
                    HashMap hashMap = new HashMap(c3473hg.c);
                    hashMap.put(Command.HTTP_HEADER_USER_AGENT, AbstractC3424fj.c());
                    obj = c3860wf.a.a.a(new Xe(c3473hg.a, hashMap, null, null, null, c3473hg.d, 28), k8);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c3473hg = k8.a;
                    y6a.M(obj);
                }
                InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) obj;
                return new C3628ng(c3473hg, interfaceC3317bf.c(), interfaceC3317bf.e());
            }
        }
        k8 = new K8(this, sq3Var);
        Object obj2 = k8.b;
        lu3 lu3Var2 = lu3.a;
        i = k8.d;
        if (i != 0) {
        }
        InterfaceC3317bf interfaceC3317bf2 = (InterfaceC3317bf) obj2;
        return new C3628ng(c3473hg, interfaceC3317bf2.c(), interfaceC3317bf2.e());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|95|6|7|8|9|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x013f, code lost:
    
        if (r0.a(r15) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        r12 = (com.inmobi.media.InterfaceC3835vg) r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        if (r13.a(r15) == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r12 = (com.inmobi.media.InterfaceC3835vg) r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b1, code lost:
    
        if (r13.a(r15) == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0195, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0051, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0054, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x006e, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x003c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x003f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3 A[Catch: Error -> 0x0050, Exception -> 0x0053, TryCatch #6 {Error -> 0x0050, Exception -> 0x0053, blocks: (B:24:0x004b, B:25:0x00eb, B:27:0x00f3, B:34:0x011a, B:35:0x0115, B:36:0x0120, B:40:0x005a, B:46:0x0065), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120 A[Catch: Error -> 0x0050, Exception -> 0x0053, TRY_LEAVE, TryCatch #6 {Error -> 0x0050, Exception -> 0x0053, blocks: (B:24:0x004b, B:25:0x00eb, B:27:0x00f3, B:34:0x011a, B:35:0x0115, B:36:0x0120, B:40:0x005a, B:46:0x0065), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[Catch: Error -> 0x00b5, Exception -> 0x00b9, TryCatch #4 {Error -> 0x00b5, Exception -> 0x00b9, blocks: (B:49:0x009e, B:51:0x00a6, B:53:0x00bd, B:58:0x00d3), top: B:48:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd A[Catch: Error -> 0x00b5, Exception -> 0x00b9, TryCatch #4 {Error -> 0x00b5, Exception -> 0x00b9, blocks: (B:49:0x009e, B:51:0x00a6, B:53:0x00bd, B:58:0x00d3), top: B:48:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0071  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C3473hg c3473hg, sq3 sq3Var) {
        L8 l8;
        ?? r2;
        InterfaceC3835vg interfaceC3835vg;
        InterfaceC3835vg interfaceC3835vg2;
        C3473hg c3473hg2;
        InterfaceC3835vg interfaceC3835vg3;
        C3473hg c3473hg3;
        C3473hg c3473hg4;
        InterfaceC3835vg interfaceC3835vg4;
        C3628ng c3628ng;
        C3473hg c3473hg5;
        if (sq3Var instanceof L8) {
            l8 = (L8) sq3Var;
            int i = l8.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8.e = i - Integer.MIN_VALUE;
                L8 l82 = l8;
                Object obj = l82.c;
                Object obj2 = lu3.a;
                r2 = l82.e;
                switch (r2) {
                    case 0:
                        y6a.M(obj);
                        String str = c3473hg.b;
                        WeakReference weakReference = (WeakReference) this.b.get(c3473hg.h);
                        InterfaceC3835vg interfaceC3835vg5 = weakReference != null ? (InterfaceC3835vg) weakReference.get() : null;
                        String str2 = c3473hg.e;
                        l82.a = c3473hg;
                        l82.b = interfaceC3835vg5;
                        l82.e = 1;
                        Object a = a(str2, l82);
                        if (a != obj2) {
                            c3473hg2 = c3473hg;
                            interfaceC3835vg3 = interfaceC3835vg5;
                            obj = a;
                            try {
                            } catch (Error e) {
                                e = e;
                                c3473hg = c3473hg2;
                                C3473hg c3473hg6 = c3473hg;
                                Error error = e;
                                error.getMessage();
                                WeakReference weakReference2 = (WeakReference) this.b.get(c3473hg6.h);
                                if (weakReference2 == null) {
                                }
                                AbstractC3913yg.a(0, error.getMessage(), (short) 2251, c3473hg6, System.currentTimeMillis(), interfaceC3835vg2);
                                C3800u7 c3800u7 = this.d;
                                l82.a = null;
                                l82.b = null;
                                l82.e = 8;
                                break;
                            } catch (Exception e2) {
                                e = e2;
                                c3473hg = c3473hg2;
                                C3473hg c3473hg7 = c3473hg;
                                Exception exc = e;
                                exc.getMessage();
                                WeakReference weakReference3 = (WeakReference) this.b.get(c3473hg7.h);
                                if (weakReference3 == null) {
                                }
                                AbstractC3913yg.a(0, exc.getMessage(), (short) 2250, c3473hg7, System.currentTimeMillis(), interfaceC3835vg);
                                C3800u7 c3800u72 = this.d;
                                l82.a = null;
                                l82.b = null;
                                l82.e = 7;
                                break;
                            }
                            if (!((Boolean) obj).booleanValue()) {
                                Fg fg = this.a;
                                l82.a = c3473hg2;
                                l82.b = interfaceC3835vg3;
                                l82.e = 2;
                                Object a2 = fg.a.a("pings", Gg.a(c3473hg2), 4, l82);
                                if (a2 != obj2) {
                                    a2 = Unit.a;
                                }
                                if (a2 != obj2) {
                                    c3473hg3 = c3473hg2;
                                    l82.a = c3473hg3;
                                    l82.b = interfaceC3835vg3;
                                    l82.e = 3;
                                    obj = a(c3473hg3, l82);
                                    if (obj != obj2) {
                                        c3473hg4 = c3473hg3;
                                        interfaceC3835vg4 = interfaceC3835vg3;
                                        c3628ng = (C3628ng) obj;
                                        if (!AbstractC3706qg.a(c3628ng)) {
                                            String str3 = c3628ng.a.b;
                                            l82.a = c3473hg4;
                                            l82.b = null;
                                            l82.e = 4;
                                            AbstractC3913yg.a(c3628ng, interfaceC3835vg4);
                                            Object a3 = this.a.a.a("pings", "id=?", new String[]{c3628ng.a.b}, l82);
                                            if (a3 != obj2) {
                                                a3 = Unit.a;
                                            }
                                            if (a3 != obj2) {
                                                a3 = Unit.a;
                                            }
                                            if (a3 == obj2) {
                                            }
                                            return Unit.a;
                                        }
                                        String str4 = c3628ng.a.b;
                                        l82.a = c3473hg4;
                                        l82.b = null;
                                        l82.e = 5;
                                        if (a(c3628ng, interfaceC3835vg4, l82) != obj2) {
                                            c3473hg5 = c3473hg4;
                                            C3800u7 c3800u73 = this.d;
                                            l82.a = c3473hg5;
                                            l82.e = 6;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                AbstractC3913yg.a(0, "Database capacity exceeded for pings", (short) 2248, c3473hg2, System.currentTimeMillis(), interfaceC3835vg3);
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 1:
                        InterfaceC3835vg interfaceC3835vg6 = l82.b;
                        C3473hg c3473hg8 = l82.a;
                        y6a.M(obj);
                        interfaceC3835vg3 = interfaceC3835vg6;
                        c3473hg2 = c3473hg8;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        InterfaceC3835vg interfaceC3835vg7 = l82.b;
                        C3473hg c3473hg9 = l82.a;
                        y6a.M(obj);
                        interfaceC3835vg3 = interfaceC3835vg7;
                        c3473hg3 = c3473hg9;
                        l82.a = c3473hg3;
                        l82.b = interfaceC3835vg3;
                        l82.e = 3;
                        obj = a(c3473hg3, l82);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 3:
                        interfaceC3835vg4 = l82.b;
                        c3473hg4 = l82.a;
                        y6a.M(obj);
                        c3628ng = (C3628ng) obj;
                        if (!AbstractC3706qg.a(c3628ng)) {
                        }
                        return obj2;
                    case 4:
                    case 6:
                        C3473hg c3473hg10 = l82.a;
                        y6a.M(obj);
                        return Unit.a;
                    case 5:
                        c3473hg5 = l82.a;
                        y6a.M(obj);
                        C3800u7 c3800u732 = this.d;
                        l82.a = c3473hg5;
                        l82.e = 6;
                        break;
                    case 7:
                    case 8:
                        y6a.M(obj);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        l8 = new L8(this, sq3Var);
        L8 l822 = l8;
        Object obj3 = l822.c;
        Object obj22 = lu3.a;
        r2 = l822.e;
        switch (r2) {
        }
    }
}
