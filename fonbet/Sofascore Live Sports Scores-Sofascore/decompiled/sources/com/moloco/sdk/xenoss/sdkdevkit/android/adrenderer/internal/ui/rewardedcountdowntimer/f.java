package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import defpackage.a70;
import defpackage.e1d;
import defpackage.hoi;
import defpackage.i4k;
import defpackage.jg5;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.q50;
import defpackage.rq3;
import defpackage.s02;
import defpackage.y6a;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ q50 w;
    public final /* synthetic */ Function0 x;
    public final /* synthetic */ e1d y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i2, q50 q50Var, Function0 function0, e1d e1dVar, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.u = i;
        this.v = i2;
        this.w = q50Var;
        this.x = function0;
        this.y = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new f(this.u, this.v, this.w, this.x, this.y, rq3Var, 0);
            default:
                return new f(this.u, this.v, this.w, this.x, this.y, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((f) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
    
        if (r7 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        r11.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (r7 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0126, code lost:
    
        if (r7 != 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0141, code lost:
    
        r11.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013f, code lost:
    
        if (r7 != 0) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [q50] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3 = this.r;
        int i4 = this.w;
        int i5 = this.v;
        e1d e1dVar = this.y;
        int i6 = this.u;
        Function0 function0 = this.x;
        switch (i3) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i7 = this.t;
                try {
                    if (i7 == 0) {
                        y6a.M(obj);
                        int intValue = ((Number) e1dVar.getValue()).intValue();
                        float a = com.facebook.appevents.j.a(i6, i5);
                        try {
                            if (i6 < intValue) {
                                int i8 = intValue - i6;
                                if (i8 < 0) {
                                    i8 = 0;
                                }
                                int i9 = i8 * 1000;
                                if (i9 < 0) {
                                    i9 = 0;
                                }
                                q50 q50Var = this.w;
                                Float f = new Float(a);
                                i4k h0 = s02.h0(i9, 0, jg5.d, 2);
                                this.s = i6;
                                this.t = 1;
                                if (q50.a(q50Var, f, h0, null, this, 12) != lu3Var) {
                                    i = i6;
                                    e1dVar.setValue(Integer.valueOf(i));
                                }
                            } else {
                                Float f2 = new Float(a);
                                this.s = i6;
                                this.t = 2;
                                if (i4.f(this, f2) != lu3Var) {
                                    i = i6;
                                    Unit unit = Unit.a;
                                    e1dVar.setValue(Integer.valueOf(i));
                                }
                            }
                            return lu3Var;
                        } catch (CancellationException unused) {
                            i4 = i6;
                            e1dVar.setValue(Integer.valueOf(i4));
                            break;
                        } catch (Throwable th) {
                            th = th;
                            i4 = i6;
                            e1dVar.setValue(Integer.valueOf(i4));
                            if (i6 == 0) {
                                function0.invoke();
                            }
                            throw th;
                        }
                    } else if (i7 == 1) {
                        i = this.s;
                        y6a.M(obj);
                        e1dVar.setValue(Integer.valueOf(i));
                    } else {
                        if (i7 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.s;
                        y6a.M(obj);
                        Unit unit2 = Unit.a;
                        e1dVar.setValue(Integer.valueOf(i));
                        break;
                    }
                } catch (CancellationException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i10 = this.t;
                try {
                    if (i10 == 0) {
                        y6a.M(obj);
                        int intValue2 = ((Number) e1dVar.getValue()).intValue();
                        float a2 = com.facebook.appevents.j.a(i6, i5);
                        try {
                            if (i6 < intValue2) {
                                int i11 = intValue2 - i6;
                                if (i11 < 0) {
                                    i11 = 0;
                                }
                                int i12 = i11 * 1000;
                                if (i12 < 0) {
                                    i12 = 0;
                                }
                                q50 q50Var2 = this.w;
                                Float f3 = new Float(a2);
                                i4k h02 = s02.h0(i12, 0, jg5.d, 2);
                                this.s = i6;
                                this.t = 1;
                                if (q50.a(q50Var2, f3, h02, null, this, 12) != lu3Var2) {
                                    i2 = i6;
                                    e1dVar.setValue(Integer.valueOf(i2));
                                }
                            } else {
                                Float f4 = new Float(a2);
                                this.s = i6;
                                this.t = 2;
                                if (i4.f(this, f4) != lu3Var2) {
                                    i2 = i6;
                                    Unit unit3 = Unit.a;
                                    e1dVar.setValue(Integer.valueOf(i2));
                                }
                            }
                            return lu3Var2;
                        } catch (CancellationException unused3) {
                            i4 = i6;
                            e1dVar.setValue(Integer.valueOf(i4));
                            break;
                        } catch (Throwable th3) {
                            th = th3;
                            i4 = i6;
                            e1dVar.setValue(Integer.valueOf(i4));
                            if (i6 == 0) {
                                function0.invoke();
                            }
                            throw th;
                        }
                    } else if (i10 == 1) {
                        i2 = this.s;
                        y6a.M(obj);
                        e1dVar.setValue(Integer.valueOf(i2));
                    } else {
                        if (i10 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = this.s;
                        y6a.M(obj);
                        Unit unit32 = Unit.a;
                        e1dVar.setValue(Integer.valueOf(i2));
                        break;
                    }
                } catch (CancellationException unused4) {
                } catch (Throwable th4) {
                    th = th4;
                }
                return Unit.a;
        }
    }
}
