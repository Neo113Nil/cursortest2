package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rz4 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Context s;
    public /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz4(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    private final Object e(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_SHOW_REFERRAL", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object f(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_FEED_IGNORE_CARD_RULES", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object g(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        nv.b = null;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_FORCE_TELEMETRY", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object h(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_SHOW_SOFA_SEASON", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object j(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_FORCE_DEVICE_TIME", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object k(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_SHOW_WORLD_CUP", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object l(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_FORCE_LIVE_ACTION_WIDGET", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object m(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_LEAK_CANARY_ENABLED", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object n(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_FORCE_BIDDING_ADAPTERS", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object o(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_MULTI_ENTITY_COMPARISON", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object p(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_SIMULATE_LOW_RAM", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    private final Object q(Object obj) {
        Context context = this.s;
        boolean z = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "FORCE_SHOW_FANTASY", z);
        Unit unit = Unit.a;
        i.apply();
        return Unit.a;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.r) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                rz4 rz4Var = new rz4(3, (rq3) obj3, 0);
                rz4Var.s = context;
                rz4Var.t = booleanValue;
                return rz4Var.invokeSuspend(Unit.a);
            case 1:
                boolean booleanValue2 = bool.booleanValue();
                rz4 rz4Var2 = new rz4(3, (rq3) obj3, 1);
                rz4Var2.s = context;
                rz4Var2.t = booleanValue2;
                return rz4Var2.invokeSuspend(Unit.a);
            case 2:
                boolean booleanValue3 = bool.booleanValue();
                rz4 rz4Var3 = new rz4(3, (rq3) obj3, 2);
                rz4Var3.s = context;
                rz4Var3.t = booleanValue3;
                return rz4Var3.invokeSuspend(Unit.a);
            case 3:
                boolean booleanValue4 = bool.booleanValue();
                rz4 rz4Var4 = new rz4(3, (rq3) obj3, 3);
                rz4Var4.s = context;
                rz4Var4.t = booleanValue4;
                return rz4Var4.invokeSuspend(Unit.a);
            case 4:
                boolean booleanValue5 = bool.booleanValue();
                rz4 rz4Var5 = new rz4(3, (rq3) obj3, 4);
                rz4Var5.s = context;
                rz4Var5.t = booleanValue5;
                return rz4Var5.invokeSuspend(Unit.a);
            case 5:
                boolean booleanValue6 = bool.booleanValue();
                rz4 rz4Var6 = new rz4(3, (rq3) obj3, 5);
                rz4Var6.s = context;
                rz4Var6.t = booleanValue6;
                return rz4Var6.invokeSuspend(Unit.a);
            case 6:
                boolean booleanValue7 = bool.booleanValue();
                rz4 rz4Var7 = new rz4(3, (rq3) obj3, 6);
                rz4Var7.s = context;
                rz4Var7.t = booleanValue7;
                return rz4Var7.invokeSuspend(Unit.a);
            case 7:
                boolean booleanValue8 = bool.booleanValue();
                rz4 rz4Var8 = new rz4(3, (rq3) obj3, 7);
                rz4Var8.s = context;
                rz4Var8.t = booleanValue8;
                return rz4Var8.invokeSuspend(Unit.a);
            case 8:
                boolean booleanValue9 = bool.booleanValue();
                rz4 rz4Var9 = new rz4(3, (rq3) obj3, 8);
                rz4Var9.s = context;
                rz4Var9.t = booleanValue9;
                return rz4Var9.invokeSuspend(Unit.a);
            case 9:
                boolean booleanValue10 = bool.booleanValue();
                rz4 rz4Var10 = new rz4(3, (rq3) obj3, 9);
                rz4Var10.s = context;
                rz4Var10.t = booleanValue10;
                return rz4Var10.invokeSuspend(Unit.a);
            case 10:
                boolean booleanValue11 = bool.booleanValue();
                rz4 rz4Var11 = new rz4(3, (rq3) obj3, 10);
                rz4Var11.s = context;
                rz4Var11.t = booleanValue11;
                return rz4Var11.invokeSuspend(Unit.a);
            case 11:
                boolean booleanValue12 = bool.booleanValue();
                rz4 rz4Var12 = new rz4(3, (rq3) obj3, 11);
                rz4Var12.s = context;
                rz4Var12.t = booleanValue12;
                return rz4Var12.invokeSuspend(Unit.a);
            case 12:
                boolean booleanValue13 = bool.booleanValue();
                rz4 rz4Var13 = new rz4(3, (rq3) obj3, 12);
                rz4Var13.s = context;
                rz4Var13.t = booleanValue13;
                return rz4Var13.invokeSuspend(Unit.a);
            case 13:
                boolean booleanValue14 = bool.booleanValue();
                rz4 rz4Var14 = new rz4(3, (rq3) obj3, 13);
                rz4Var14.s = context;
                rz4Var14.t = booleanValue14;
                return rz4Var14.invokeSuspend(Unit.a);
            case 14:
                boolean booleanValue15 = bool.booleanValue();
                rz4 rz4Var15 = new rz4(3, (rq3) obj3, 14);
                rz4Var15.s = context;
                rz4Var15.t = booleanValue15;
                return rz4Var15.invokeSuspend(Unit.a);
            default:
                boolean booleanValue16 = bool.booleanValue();
                rz4 rz4Var16 = new rz4(3, (rq3) obj3, 15);
                rz4Var16.s = context;
                rz4Var16.t = booleanValue16;
                return rz4Var16.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                Context context = this.s;
                boolean z = this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                context.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor i = dmi.i(sharedPreferences, "DEV_MODE_FUN_FACTS", z);
                Unit unit = Unit.a;
                i.apply();
                return Unit.a;
            case 1:
                Context context2 = this.s;
                boolean z2 = this.t;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                context2.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext2);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                SharedPreferences.Editor i2 = dmi.i(sharedPreferences2, "DEV_MODE_UNSAFE_NETWORK", z2);
                Unit unit2 = Unit.a;
                i2.apply();
                return Unit.a;
            case 2:
                Context context3 = this.s;
                boolean z3 = this.t;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                context3.getClass();
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = context3.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences3 = a5f.d(applicationContext3);
                        uic.j = sharedPreferences3;
                    }
                    sharedPreferences3.getClass();
                }
                SharedPreferences.Editor i3 = dmi.i(sharedPreferences3, "DEV_MODE_SHORTEN_AI_RELEVANCE", z3);
                Unit unit3 = Unit.a;
                i3.apply();
                return Unit.a;
            case 3:
                return e(obj);
            case 4:
                return f(obj);
            case 5:
                return g(obj);
            case 6:
                return h(obj);
            case 7:
                return j(obj);
            case 8:
                return k(obj);
            case 9:
                return l(obj);
            case 10:
                return m(obj);
            case 11:
                return n(obj);
            case 12:
                return o(obj);
            case 13:
                return p(obj);
            case 14:
                return q(obj);
            default:
                Context context4 = this.s;
                boolean z4 = this.t;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                context4.getClass();
                SharedPreferences sharedPreferences4 = uic.j;
                if (sharedPreferences4 == null) {
                    Context applicationContext4 = context4.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences4 = a5f.d(applicationContext4);
                        uic.j = sharedPreferences4;
                    }
                    sharedPreferences4.getClass();
                }
                SharedPreferences.Editor i4 = dmi.i(sharedPreferences4, "PREF_FORCE_SHOW_LEADERBOARD_NOTIFICATION", z4);
                Unit unit4 = Unit.a;
                i4.apply();
                return Unit.a;
        }
    }
}
