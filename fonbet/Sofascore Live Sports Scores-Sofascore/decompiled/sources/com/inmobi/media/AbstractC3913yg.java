package com.inmobi.media;

import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.y6a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3913yg {
    public final Fg a;
    public final ConcurrentHashMap b;
    public final C3860wf c;

    public AbstractC3913yg(Fg fg) {
        fg.getClass();
        this.a = fg;
        this.b = new ConcurrentHashMap();
        this.c = new C3860wf(a());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3628ng c3628ng, InterfaceC3835vg interfaceC3835vg, rq3 rq3Var) {
        C3861wg c3861wg;
        int i;
        InterfaceC3835vg interfaceC3835vg2;
        C3473hg c3473hg;
        InterfaceC3835vg interfaceC3835vg3;
        C3473hg c3473hg2;
        InterfaceC3835vg interfaceC3835vg4;
        C3628ng c3628ng2 = c3628ng;
        if (rq3Var instanceof C3861wg) {
            c3861wg = (C3861wg) rq3Var;
            int i2 = c3861wg.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3861wg.f = i2 - Integer.MIN_VALUE;
                C3861wg c3861wg2 = c3861wg;
                Object obj = c3861wg2.d;
                Object obj2 = lu3.a;
                i = c3861wg2.f;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC3835vg interfaceC3835vg5 = c3861wg2.b;
                        c3628ng2 = c3861wg2.a;
                        y6a.M(obj);
                        interfaceC3835vg4 = interfaceC3835vg5;
                        a(c3628ng2.b, "Redirect URL is malformed", (short) 2258, c3628ng2.a, c3628ng2.d, interfaceC3835vg4);
                        return Unit.a;
                    }
                    if (i == 2) {
                        C3473hg c3473hg3 = c3861wg2.c;
                        InterfaceC3835vg interfaceC3835vg6 = c3861wg2.b;
                        C3628ng c3628ng3 = c3861wg2.a;
                        y6a.M(obj);
                        c3473hg2 = c3473hg3;
                        interfaceC3835vg3 = interfaceC3835vg6;
                        c3628ng2 = c3628ng3;
                        a(c3628ng2.b, c3628ng2.c, (short) 2249, c3473hg2, c3628ng2.d, interfaceC3835vg3);
                        return Unit.a;
                    }
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C3473hg c3473hg4 = c3861wg2.c;
                    InterfaceC3835vg interfaceC3835vg7 = c3861wg2.b;
                    C3628ng c3628ng4 = c3861wg2.a;
                    y6a.M(obj);
                    c3473hg = c3473hg4;
                    interfaceC3835vg2 = interfaceC3835vg7;
                    c3628ng2 = c3628ng4;
                    a(c3628ng2.b, c3628ng2.c, (short) 2247, c3473hg, c3628ng2.d, interfaceC3835vg2);
                    return Unit.a;
                }
                y6a.M(obj);
                C3473hg c3473hg5 = c3628ng2.a;
                String str = c3473hg5.a;
                int i3 = c3628ng2.b;
                C3437g6 c3437g6 = EnumC3489i6.b;
                if (i3 == 178) {
                    Fg fg = this.a;
                    c3861wg2.a = c3628ng2;
                    c3861wg2.b = interfaceC3835vg;
                    c3861wg2.f = 1;
                    Object a = fg.a.a("pings", "id=?", new String[]{c3473hg5.b}, c3861wg2);
                    if (a != obj2) {
                        a = Unit.a;
                    }
                    if (a != obj2) {
                        interfaceC3835vg4 = interfaceC3835vg;
                        a(c3628ng2.b, "Redirect URL is malformed", (short) 2258, c3628ng2.a, c3628ng2.d, interfaceC3835vg4);
                        return Unit.a;
                    }
                } else {
                    int i4 = c3473hg5.g + 1;
                    if (i4 > (Intrinsics.c(c3473hg5.e, FootballShotmapItem.GOAL_HIGH) ? a().getRetryConfig().getHigh().getMaxRetries() : a().getRetryConfig().getNormal().getMaxRetries())) {
                        Fg fg2 = this.a;
                        c3861wg2.a = c3628ng2;
                        c3861wg2.b = interfaceC3835vg;
                        c3861wg2.c = c3473hg5;
                        c3861wg2.f = 2;
                        Object a2 = fg2.a.a("pings", "id=?", new String[]{c3473hg5.b}, c3861wg2);
                        if (a2 != obj2) {
                            a2 = Unit.a;
                        }
                        if (a2 != obj2) {
                            interfaceC3835vg3 = interfaceC3835vg;
                            c3473hg2 = c3473hg5;
                            a(c3628ng2.b, c3628ng2.c, (short) 2249, c3473hg2, c3628ng2.d, interfaceC3835vg3);
                            return Unit.a;
                        }
                    } else {
                        Long l = new Long(System.currentTimeMillis() + ((long) (Math.pow(((Number) (Intrinsics.c(c3473hg5.e, FootballShotmapItem.GOAL_HIGH) ? new Pair(new Long(a().getRetryConfig().getHigh().getRetryInterval()), new Double(a().getRetryConfig().getHigh().getFactor())) : new Pair(new Long(a().getRetryConfig().getNormal().getRetryInterval()), new Double(a().getRetryConfig().getNormal().getFactor()))).b).doubleValue(), i4) * ((Number) r9.a).longValue() * 1000.0d)));
                        String str2 = c3473hg5.a;
                        String str3 = c3473hg5.b;
                        Map map = c3473hg5.c;
                        boolean z = c3473hg5.d;
                        String str4 = c3473hg5.e;
                        boolean z2 = c3473hg5.f;
                        String str5 = c3473hg5.h;
                        long j = c3473hg5.i;
                        Bi bi = c3473hg5.k;
                        str2.getClass();
                        str3.getClass();
                        map.getClass();
                        str4.getClass();
                        str5.getClass();
                        C3473hg c3473hg6 = new C3473hg(str2, str3, map, z, str4, z2, i4, str5, j, l, bi);
                        Fg fg3 = this.a;
                        c3861wg2.a = c3628ng2;
                        c3861wg2.b = interfaceC3835vg;
                        c3861wg2.c = c3473hg5;
                        c3861wg2.f = 3;
                        Object a3 = C3724r9.a(fg3.a, "pings", Gg.a(c3473hg6), "id=?", new String[]{str3}, c3861wg2, 16);
                        if (a3 != obj2) {
                            a3 = Unit.a;
                        }
                        if (a3 != obj2) {
                            interfaceC3835vg2 = interfaceC3835vg;
                            c3473hg = c3473hg5;
                            a(c3628ng2.b, c3628ng2.c, (short) 2247, c3473hg, c3628ng2.d, interfaceC3835vg2);
                            return Unit.a;
                        }
                    }
                }
                return obj2;
            }
        }
        c3861wg = new C3861wg(this, rq3Var);
        C3861wg c3861wg22 = c3861wg;
        Object obj3 = c3861wg22.d;
        Object obj22 = lu3.a;
        i = c3861wg22.f;
        if (i == 0) {
        }
    }

    public static void a(C3473hg c3473hg, short s) {
        Bi bi = c3473hg.k;
        if (bi != null) {
            Hi hi = new Hi(bi);
            String str = c3473hg.e;
            int i = c3473hg.g;
            str.getClass();
            Map a = hi.a();
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            a.put("trigger", str);
            a.put("retryCount", String.valueOf(i));
            AbstractC3939zg.a("PingFailed", a);
            return;
        }
        C3347cj c3347cj = AbstractC3939zg.a;
        AbstractC3939zg.a("PingFailed", tub.i(new Pair("trigger", c3473hg.e), new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)), new Pair("retryCount", Integer.valueOf(c3473hg.g))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0068, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        C3887xg c3887xg;
        Object obj;
        int i;
        String str2;
        C3473hg c3473hg;
        if (sq3Var instanceof C3887xg) {
            c3887xg = (C3887xg) sq3Var;
            int i2 = c3887xg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3887xg.d = i2 - Integer.MIN_VALUE;
                obj = c3887xg.b;
                lu3 lu3Var = lu3.a;
                i = c3887xg.d;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    Fg fg = this.a;
                    c3887xg.a = str;
                    c3887xg.d = 1;
                    C3724r9 c3724r9 = fg.a;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3492i9(c3724r9, "SELECT COUNT(*) FROM pings", null), c3887xg);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = c3887xg.a;
                            y6a.M(obj);
                            c3473hg = (C3473hg) obj;
                            if (c3473hg == null) {
                                Fg fg2 = this.a;
                                c3887xg.a = str;
                                c3887xg.d = 3;
                                obj = fg2.a(FootballShotmapItem.GOAL_HIGH, c3887xg);
                                if (obj != lu3Var) {
                                    str2 = str;
                                    c3473hg = (C3473hg) obj;
                                    str = str2;
                                }
                                return lu3Var;
                            }
                            if (c3473hg == null) {
                            }
                            return Boolean.valueOf(z);
                        }
                        if (i == 3) {
                            str2 = c3887xg.a;
                            y6a.M(obj);
                            c3473hg = (C3473hg) obj;
                            str = str2;
                            if (c3473hg == null) {
                            }
                            return Boolean.valueOf(z);
                        }
                        if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = c3887xg.a;
                        y6a.M(obj);
                        c3473hg = (C3473hg) obj;
                        str = str2;
                        if (c3473hg == null) {
                            a(c3473hg, (short) (Intrinsics.c(str, FootballShotmapItem.GOAL_HIGH) ? 2259 : 2260));
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    str = c3887xg.a;
                    y6a.M(obj);
                }
                if (((Number) obj).intValue() >= a().getMaxEntries()) {
                    return Boolean.TRUE;
                }
                C3347cj c3347cj = AbstractC3939zg.a;
                AbstractC3939zg.a("PingDBMaxLimitReached", new LinkedHashMap());
                boolean c = Intrinsics.c(str, FootballShotmapItem.GOAL_HIGH);
                Fg fg3 = this.a;
                if (c) {
                    c3887xg.a = str;
                    c3887xg.d = 2;
                    obj = fg3.a("normal", c3887xg);
                } else {
                    c3887xg.a = str;
                    c3887xg.d = 4;
                    obj = fg3.a("normal", c3887xg);
                    if (obj != lu3Var) {
                        str2 = str;
                        c3473hg = (C3473hg) obj;
                        str = str2;
                        if (c3473hg == null) {
                        }
                        return Boolean.valueOf(z);
                    }
                }
                return lu3Var;
            }
        }
        c3887xg = new C3887xg(this, sq3Var);
        obj = c3887xg.b;
        lu3 lu3Var2 = lu3.a;
        i = c3887xg.d;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Number) obj).intValue() >= a().getMaxEntries()) {
        }
    }

    public static AdConfig.PingsV2Config a() {
        return ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getPingV2();
    }

    public static void a(int i, String str, short s, C3473hg c3473hg, long j, InterfaceC3835vg interfaceC3835vg) {
        c3473hg.getClass();
        String str2 = c3473hg.a;
        Objects.toString(interfaceC3835vg);
        if (interfaceC3835vg != null) {
            ((C3809ug) interfaceC3835vg).a(c3473hg, i, str, c3473hg.g, j);
        } else {
            a(c3473hg, s);
        }
    }

    public static void a(C3628ng c3628ng, InterfaceC3835vg interfaceC3835vg) {
        String str = c3628ng.a.a;
        Objects.toString(interfaceC3835vg);
        C3473hg c3473hg = c3628ng.a;
        if (interfaceC3835vg != null) {
            ((C3809ug) interfaceC3835vg).a(c3473hg, c3628ng.b, c3628ng.d);
            return;
        }
        Bi bi = c3473hg.k;
        if (bi != null) {
            Hi hi = new Hi(bi);
            String str2 = c3473hg.e;
            long j = c3473hg.i;
            str2.getClass();
            Map a = hi.a();
            a.put("trigger", str2);
            a.put(Payload.LATENCY, Long.valueOf(j));
            AbstractC3939zg.a("PingSuccess", a);
            return;
        }
        C3347cj c3347cj = AbstractC3939zg.a;
        AbstractC3939zg.a("PingSuccess", tub.i(new Pair("trigger", c3473hg.e), new Pair("retryCount", Integer.valueOf(c3473hg.g))));
    }
}
