package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class auh extends t01 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ auh(int i) {
        super(4);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    @Override // defpackage.t01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(Context context, re0 re0Var, sq3 sq3Var) {
        zth zthVar;
        int i;
        rkl rklVar;
        int i2;
        tll tllVar;
        int i3;
        int i4 = 1;
        switch (this.c) {
            case 0:
                if (sq3Var instanceof zth) {
                    zthVar = (zth) sq3Var;
                    int i5 = zthVar.t;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zthVar.t = i5 - Integer.MIN_VALUE;
                        Object obj = zthVar.r;
                        lu3 lu3Var = lu3.a;
                        i = zthVar.t;
                        if (i == 0) {
                            if (i == 1) {
                                throw wt3.i(obj);
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return;
                        } else {
                            y6a.M(obj);
                            tc3 tc3Var = new tc3(-610194936, new m04(context, i4), true);
                            zthVar.t = 1;
                            td4.p0(tc3Var, zthVar);
                            return;
                        }
                    }
                }
                zthVar = new zth(this, sq3Var);
                Object obj2 = zthVar.r;
                lu3 lu3Var2 = lu3.a;
                i = zthVar.t;
                if (i == 0) {
                }
            default:
                if (sq3Var instanceof rkl) {
                    rklVar = (rkl) sq3Var;
                    int i6 = rklVar.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        rklVar.v = i6 - Integer.MIN_VALUE;
                        Object obj3 = rklVar.t;
                        lu3 lu3Var3 = lu3.a;
                        i2 = rklVar.v;
                        if (i2 != 0) {
                            y6a.M(obj3);
                            new ry8(context);
                            if (re0Var == null) {
                                a70.p("This method only accepts App Widget Glance Id");
                                return;
                            }
                            int i7 = re0Var.a;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            tllVar = (tll) ((mc4) ((jll) l98.T(applicationContext, jll.class))).L0.get();
                            rklVar.r = tllVar;
                            rklVar.s = i7;
                            rklVar.v = 1;
                            Object a = tllVar.a(rklVar);
                            if (a == lu3Var3) {
                                return;
                            }
                            i3 = i7;
                            obj3 = a;
                        } else if (i2 != 1) {
                            if (i2 == 2) {
                                throw wt3.i(obj3);
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return;
                        } else {
                            int i8 = rklVar.s;
                            tllVar = rklVar.r;
                            y6a.M(obj3);
                            i3 = i8;
                        }
                        tll tllVar2 = tllVar;
                        String str = (String) obj3;
                        tc3 tc3Var2 = new tc3(206276188, new opg(tllVar2.d.f(new e5f("WC_26_MY_TEAM_ALPHA2"), ""), str != null ? "" : str, tllVar2, i3, 21), true);
                        rklVar.r = null;
                        rklVar.s = i3;
                        rklVar.v = 2;
                        td4.p0(tc3Var2, rklVar);
                        return;
                    }
                }
                rklVar = new rkl(this, sq3Var);
                Object obj32 = rklVar.t;
                lu3 lu3Var32 = lu3.a;
                i2 = rklVar.v;
                if (i2 != 0) {
                }
                tll tllVar22 = tllVar;
                String str2 = (String) obj32;
                tc3 tc3Var22 = new tc3(206276188, new opg(tllVar22.d.f(new e5f("WC_26_MY_TEAM_ALPHA2"), ""), str2 != null ? "" : str2, tllVar22, i3, 21), true);
                rklVar.r = null;
                rklVar.s = i3;
                rklVar.v = 2;
                td4.p0(tc3Var22, rklVar);
                return;
        }
    }

    @Override // defpackage.t01
    public dkh y() {
        switch (this.c) {
            case 0:
                return dkh.a;
            default:
                return super.y();
        }
    }

    @Override // defpackage.t01
    public doa z() {
        switch (this.c) {
            case 0:
                return doa.d;
            default:
                return super.z();
        }
    }
}
