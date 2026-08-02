package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.notifications.NotificationSettingKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u41 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41() {
        super(2, null);
        this.r = 3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new u41(2, rq3Var, 0);
            case 1:
                return new u41(2, rq3Var, 1);
            case 2:
                return new u41(2, rq3Var, 2);
            case 3:
                return new u41(2, rq3Var, 3);
            case 4:
                return new u41(2, rq3Var, 4);
            case 5:
                u41 u41Var = new u41(2, rq3Var, 5);
                u41Var.s = ((Number) obj).intValue();
                return u41Var;
            case 6:
                return new u41(2, rq3Var, 6);
            case 7:
                return new u41(2, rq3Var, 7);
            case 8:
                return new u41(2, rq3Var, 8);
            case 9:
                return new u41(2, rq3Var, 9);
            case 10:
                return new u41(2, rq3Var, 10);
            case 11:
                return new u41(2, rq3Var, 11);
            case 12:
                return new u41(2, rq3Var, 12);
            case 13:
                return new u41(2, rq3Var, 13);
            case 14:
                return new u41(2, rq3Var, 14);
            case 15:
                return new u41(2, rq3Var, 15);
            default:
                return new u41(2, rq3Var, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 5:
                break;
        }
        return ((u41) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(1000L, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long Q = wkn.Q(0.5d, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(Q, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var2 = xd5.b;
                    long Q2 = wkn.Q(0.5d, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(Q2, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var3 = xd5.b;
                    long R = wkn.R(400, be5.MILLISECONDS);
                    this.s = 1;
                    if (n4o.z(R, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(200L, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                int i7 = this.s;
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(i7 > 0);
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var4 = xd5.b;
                    long Q3 = wkn.Q(0.5d, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(Q3, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    i40 i40Var = new i40(i, rq3Var, 4);
                    this.s = 1;
                    if (xw3.R(hs4Var, i40Var, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    jgd jgdVar = jgd.a;
                    this.s = 1;
                    if (jgdVar.d(this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wj0 wj0Var = new wj0(fg0.b, 3);
                this.s = 1;
                Object y = rd0.y(wj0Var, this);
                return y == lu3Var10 ? lu3Var10 : y;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    try {
                        Iterator it = Arrays.asList(new h7j(), new cpk(), new ydi()).iterator();
                        it.getClass();
                        hs4 hs4Var2 = z45.a;
                        r69 r69Var = rob.a;
                        ip1 ip1Var = new ip1(it, rq3Var, 29);
                        this.s = 1;
                        if (xw3.R(r69Var, ip1Var, this) == lu3Var11) {
                            return lu3Var11;
                        }
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(th.getMessage(), th);
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(2500L, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var5 = xd5.b;
                    long Q4 = wkn.Q(0.5d, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(Q4, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (fz8.X(this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    jgd jgdVar2 = jgd.a;
                    this.s = 1;
                    obj = jgd.a(this);
                    if (obj == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable<NotificationSetting> iterable = (Iterable) obj;
                int c = sub.c(k13.r(iterable, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (NotificationSetting notificationSetting : iterable) {
                    linkedHashMap.put(NotificationSettingKt.getBackendChannelName(notificationSetting), Boolean.valueOf(notificationSetting.getEnabled()));
                }
                return linkedHashMap;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var6 = xd5.b;
                    long R2 = wkn.R(1, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(R2, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var17 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    aeh aehVar = VastActivity.e;
                    c cVar = new c(b.b);
                    this.s = 1;
                    if (aehVar.emit(cVar, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u41(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }
}
