package io.sentry.protocol;

import com.sports.insider.data.room.general.table.AccountTable;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.sentry.ILogger;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.s1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16756a;

    public /* synthetic */ c0(int i5) {
        this.f16756a = i5;
    }

    public static io.sentry.rrweb.a b(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap hashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c03 = b2Var.c0();
            c03.getClass();
            if (c03.equals("data")) {
                b2Var.k();
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c04 = b2Var.c0();
                    c04.getClass();
                    if (c04.equals("payload")) {
                        b2Var.k();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            c02 = b2Var.c0();
                            c02.getClass();
                            switch (c02) {
                                case "data":
                                    ConcurrentHashMap A = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                                    if (A == null) {
                                        break;
                                    } else {
                                        aVar.f17001i = A;
                                        break;
                                    }
                                case "type":
                                    aVar.f16997e = b2Var.i0();
                                    break;
                                case "category":
                                    aVar.f16998f = b2Var.i0();
                                    break;
                                case "timestamp":
                                    aVar.f16996d = b2Var.z();
                                    break;
                                case "level":
                                    try {
                                        aVar.f17000h = b5.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e7) {
                                        iLogger.b(b5.DEBUG, e7, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                case "message":
                                    aVar.f16999g = b2Var.i0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    b2Var.j0(iLogger, concurrentHashMap2, c02);
                                    break;
                            }
                        }
                        aVar.f17002k = concurrentHashMap2;
                        b2Var.r();
                    } else if (c04.equals("tag")) {
                        String i02 = b2Var.i0();
                        if (i02 == null) {
                            i02 = "";
                        }
                        aVar.f16995c = i02;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, concurrentHashMap, c04);
                    }
                }
                aVar.f17003l = concurrentHashMap;
                b2Var.r();
            } else if (c03.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.f0(iLogger, new c0(10));
                y4.a.C(cVar, "");
                aVar.f17004a = cVar;
            } else if (c03.equals("timestamp")) {
                aVar.f17005b = b2Var.U();
            } else {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                b2Var.j0(iLogger, hashMap, c03);
            }
        }
        aVar.j = hashMap;
        b2Var.r();
        return aVar;
    }

    public static io.sentry.rrweb.g c(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap hashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c03 = b2Var.c0();
            c03.getClass();
            if (c03.equals("data")) {
                b2Var.k();
                HashMap hashMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    c02 = b2Var.c0();
                    c02.getClass();
                    switch (c02) {
                        case "x":
                            gVar.f17009f = b2Var.J();
                            break;
                        case "y":
                            gVar.f17010g = b2Var.J();
                            break;
                        case "id":
                            gVar.f17008e = b2Var.N();
                            break;
                        case "type":
                            gVar.f17007d = (io.sentry.rrweb.f) b2Var.f0(iLogger, new c0(13));
                            break;
                        case "pointerType":
                            gVar.f17011h = b2Var.N();
                            break;
                        case "pointerId":
                            gVar.f17012i = b2Var.N();
                            break;
                        default:
                            if (!c02.equals(AdRevenueConstants.SOURCE_KEY)) {
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                }
                                b2Var.j0(iLogger, hashMap2, c02);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) b2Var.f0(iLogger, new c0(11));
                                y4.a.C(dVar, "");
                                gVar.f17006c = dVar;
                                break;
                            }
                    }
                }
                gVar.f17013k = hashMap2;
                b2Var.r();
            } else if (c03.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.f0(iLogger, new c0(10));
                y4.a.C(cVar, "");
                gVar.f17004a = cVar;
            } else if (c03.equals("timestamp")) {
                gVar.f17005b = b2Var.U();
            } else {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                b2Var.j0(iLogger, hashMap, c03);
            }
        }
        gVar.j = hashMap;
        b2Var.r();
        return gVar;
    }

    public static io.sentry.rrweb.i d(b2 b2Var, ILogger iLogger) {
        b2Var.k();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap hashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c02 = b2Var.c0();
            c02.getClass();
            if (c02.equals("data")) {
                b2Var.k();
                HashMap hashMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c03 = b2Var.c0();
                    c03.getClass();
                    if (c03.equals("pointerId")) {
                        iVar.f17019d = b2Var.N();
                    } else if (c03.equals("positions")) {
                        iVar.f17020e = b2Var.R(iLogger, new c0(15));
                    } else if (c03.equals(AdRevenueConstants.SOURCE_KEY)) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) b2Var.f0(iLogger, new c0(11));
                        y4.a.C(dVar, "");
                        iVar.f17006c = dVar;
                    } else {
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap2, c03);
                    }
                }
                iVar.f17022g = hashMap2;
                b2Var.r();
            } else if (c02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.f0(iLogger, new c0(10));
                y4.a.C(cVar, "");
                iVar.f17004a = cVar;
            } else if (c02.equals("timestamp")) {
                iVar.f17005b = b2Var.U();
            } else {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                b2Var.j0(iLogger, hashMap, c02);
            }
        }
        iVar.f17021f = hashMap;
        b2Var.r();
        return iVar;
    }

    public static io.sentry.rrweb.j e(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap hashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c03 = b2Var.c0();
            c03.getClass();
            if (c03.equals("data")) {
                b2Var.k();
                AbstractMap abstractMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    c02 = b2Var.c0();
                    c02.getClass();
                    switch (c02) {
                        case "height":
                            Integer O = b2Var.O();
                            jVar.f17024d = O != null ? O.intValue() : 0;
                            break;
                        case "href":
                            String i02 = b2Var.i0();
                            if (i02 == null) {
                                i02 = "";
                            }
                            jVar.f17023c = i02;
                            break;
                        case "width":
                            Integer O2 = b2Var.O();
                            jVar.f17025e = O2 != null ? O2.intValue() : 0;
                            break;
                        default:
                            if (abstractMap == null) {
                                abstractMap = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, abstractMap, c02);
                            break;
                    }
                }
                b2Var.r();
            } else if (c03.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.f0(iLogger, new c0(10));
                y4.a.C(cVar, "");
                jVar.f17004a = cVar;
            } else if (c03.equals("timestamp")) {
                jVar.f17005b = b2Var.U();
            } else {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                b2Var.j0(iLogger, hashMap, c03);
            }
        }
        jVar.f17026f = hashMap;
        b2Var.r();
        return jVar;
    }

    public static io.sentry.rrweb.l f(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap hashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c03 = b2Var.c0();
            c03.getClass();
            if (c03.equals("data")) {
                b2Var.k();
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c04 = b2Var.c0();
                    c04.getClass();
                    if (c04.equals("payload")) {
                        b2Var.k();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            c02 = b2Var.c0();
                            c02.getClass();
                            switch (c02) {
                                case "description":
                                    lVar.f17031e = b2Var.i0();
                                    break;
                                case "endTimestamp":
                                    lVar.f17033g = b2Var.z();
                                    break;
                                case "startTimestamp":
                                    lVar.f17032f = b2Var.z();
                                    break;
                                case "op":
                                    lVar.f17030d = b2Var.i0();
                                    break;
                                case "data":
                                    ConcurrentHashMap A = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                                    if (A == null) {
                                        break;
                                    } else {
                                        lVar.f17034h = A;
                                        break;
                                    }
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    b2Var.j0(iLogger, concurrentHashMap2, c02);
                                    break;
                            }
                        }
                        lVar.j = concurrentHashMap2;
                        b2Var.r();
                    } else if (c04.equals("tag")) {
                        String i02 = b2Var.i0();
                        if (i02 == null) {
                            i02 = "";
                        }
                        lVar.f17029c = i02;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, concurrentHashMap, c04);
                    }
                }
                lVar.f17036k = concurrentHashMap;
                b2Var.r();
            } else if (c03.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.f0(iLogger, new c0(10));
                y4.a.C(cVar, "");
                lVar.f17004a = cVar;
            } else if (c03.equals("timestamp")) {
                lVar.f17005b = b2Var.U();
            } else {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                b2Var.j0(iLogger, hashMap, c03);
            }
        }
        lVar.f17035i = hashMap;
        b2Var.r();
        return lVar;
    }

    public static io.sentry.rrweb.m g(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap hashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c03 = b2Var.c0();
            c03.getClass();
            int i5 = 10;
            if (c03.equals("data")) {
                b2Var.k();
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c04 = b2Var.c0();
                    c04.getClass();
                    if (c04.equals("payload")) {
                        b2Var.k();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            c02 = b2Var.c0();
                            c02.getClass();
                            switch (c02) {
                                case "duration":
                                    mVar.f17040f = b2Var.U();
                                    break;
                                case "segmentId":
                                    mVar.f17038d = b2Var.N();
                                    break;
                                case "height":
                                    Integer O = b2Var.O();
                                    mVar.f17043i = O != null ? O.intValue() : 0;
                                    break;
                                case "container":
                                    String i02 = b2Var.i0();
                                    if (i02 == null) {
                                        i02 = "";
                                    }
                                    mVar.f17042h = i02;
                                    break;
                                case "frameCount":
                                    Integer O2 = b2Var.O();
                                    mVar.f17044k = O2 != null ? O2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer O3 = b2Var.O();
                                    mVar.f17048o = O3 != null ? O3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer O4 = b2Var.O();
                                    mVar.f17047n = O4 != null ? O4.intValue() : 0;
                                    break;
                                case "size":
                                    Long W = b2Var.W();
                                    mVar.f17039e = W == null ? 0L : W.longValue();
                                    break;
                                case "width":
                                    Integer O5 = b2Var.O();
                                    mVar.j = O5 != null ? O5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer O6 = b2Var.O();
                                    mVar.f17046m = O6 != null ? O6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String i03 = b2Var.i0();
                                    if (i03 == null) {
                                        i03 = "";
                                    }
                                    mVar.f17041g = i03;
                                    break;
                                case "frameRateType":
                                    String i04 = b2Var.i0();
                                    if (i04 == null) {
                                        i04 = "";
                                    }
                                    mVar.f17045l = i04;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    b2Var.j0(iLogger, concurrentHashMap2, c02);
                                    break;
                            }
                        }
                        mVar.q = concurrentHashMap2;
                        b2Var.r();
                    } else if (c04.equals("tag")) {
                        String i05 = b2Var.i0();
                        if (i05 == null) {
                            i05 = "";
                        }
                        mVar.f17037c = i05;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, concurrentHashMap, c04);
                    }
                }
                mVar.f17050r = concurrentHashMap;
                b2Var.r();
            } else if (c03.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.f0(iLogger, new c0(i5));
                y4.a.C(cVar, "");
                mVar.f17004a = cVar;
            } else if (c03.equals("timestamp")) {
                mVar.f17005b = b2Var.U();
            } else {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                b2Var.j0(iLogger, hashMap, c03);
            }
        }
        mVar.f17049p = hashMap;
        b2Var.r();
        return mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.sentry.s1
    public final Object a(b2 b2Var, ILogger iLogger) {
        char c2;
        char c8;
        char c10;
        boolean z5;
        char c11;
        boolean z7;
        boolean z10;
        boolean z11;
        int i5 = 7;
        int i10 = 8;
        int i11 = 4;
        int i12 = 6;
        switch (this.f16756a) {
            case 0:
                d0 d0Var = new d0();
                b2Var.k();
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c02 = b2Var.c0();
                    c02.getClass();
                    switch (c02.hashCode()) {
                        case -1339353468:
                            if (c02.equals("daemon")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1165461084:
                            if (c02.equals("priority")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -502917346:
                            if (c02.equals("held_locks")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3355:
                            if (c02.equals("id")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3343801:
                            if (c02.equals("main")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3373707:
                            if (c02.equals("name")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 109757585:
                            if (c02.equals("state")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1025385094:
                            if (c02.equals("crashed")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1126940025:
                            if (c02.equals("current")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2055832509:
                            if (c02.equals("stacktrace")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            d0Var.f16766g = b2Var.w();
                            break;
                        case 1:
                            d0Var.f16761b = b2Var.O();
                            break;
                        case 2:
                            HashMap Y = b2Var.Y(iLogger, new io.sentry.d(12));
                            if (Y == null) {
                                break;
                            } else {
                                d0Var.j = new HashMap(Y);
                                break;
                            }
                        case 3:
                            d0Var.f16760a = b2Var.W();
                            break;
                        case 4:
                            d0Var.f16767h = b2Var.w();
                            break;
                        case 5:
                            d0Var.f16762c = b2Var.i0();
                            break;
                        case 6:
                            d0Var.f16763d = b2Var.i0();
                            break;
                        case 7:
                            d0Var.f16764e = b2Var.w();
                            break;
                        case '\b':
                            d0Var.f16765f = b2Var.w();
                            break;
                        case '\t':
                            d0Var.f16768i = (b0) b2Var.f0(iLogger, new io.sentry.clientreport.b(28));
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap, c02);
                            break;
                    }
                }
                d0Var.f16769k = concurrentHashMap;
                b2Var.r();
                return d0Var;
            case 1:
                b2Var.k();
                e0 e0Var = new e0(new ArrayList(), new HashMap(), new g0(h0.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c03 = b2Var.c0();
                    c03.getClass();
                    switch (c03.hashCode()) {
                        case -1526966919:
                            if (c03.equals("start_timestamp")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -362243017:
                            if (c03.equals("measurements")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3575610:
                            if (c03.equals("type")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 55126294:
                            if (c03.equals("timestamp")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 109638249:
                            if (c03.equals("spans")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 508716399:
                            if (c03.equals("transaction_info")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 2141246174:
                            if (c03.equals("transaction")) {
                                c8 = 6;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            try {
                                Double C = b2Var.C();
                                if (C == null) {
                                    break;
                                } else {
                                    e0Var.q = C;
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                if (b2Var.y(iLogger) == null) {
                                    break;
                                } else {
                                    e0Var.q = Double.valueOf(r8.getTime() / 1000.0d);
                                    break;
                                }
                            }
                        case 1:
                            HashMap Y2 = b2Var.Y(iLogger, new io.sentry.clientreport.b(15));
                            if (Y2 == null) {
                                break;
                            } else {
                                e0Var.f16773t.putAll(Y2);
                                break;
                            }
                        case 2:
                            b2Var.h0();
                            break;
                        case 3:
                            try {
                                Double C2 = b2Var.C();
                                if (C2 == null) {
                                    break;
                                } else {
                                    e0Var.f16771r = C2;
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                if (b2Var.y(iLogger) == null) {
                                    break;
                                } else {
                                    e0Var.f16771r = Double.valueOf(r8.getTime() / 1000.0d);
                                    break;
                                }
                            }
                        case 4:
                            ArrayList R = b2Var.R(iLogger, new io.sentry.clientreport.b(26));
                            if (R == null) {
                                break;
                            } else {
                                e0Var.f16772s.addAll(R);
                                break;
                            }
                        case 5:
                            b2Var.k();
                            String str = null;
                            ConcurrentHashMap concurrentHashMap3 = null;
                            while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String c04 = b2Var.c0();
                                c04.getClass();
                                if (c04.equals(AdRevenueConstants.SOURCE_KEY)) {
                                    str = b2Var.i0();
                                } else {
                                    if (concurrentHashMap3 == null) {
                                        concurrentHashMap3 = new ConcurrentHashMap();
                                    }
                                    b2Var.j0(iLogger, concurrentHashMap3, c04);
                                }
                            }
                            g0 g0Var = new g0(str);
                            g0Var.f16806b = concurrentHashMap3;
                            b2Var.r();
                            e0Var.f16774u = g0Var;
                            break;
                        case 6:
                            e0Var.f16770p = b2Var.i0();
                            break;
                        default:
                            if (!f3.x.Z(e0Var, c03, b2Var, iLogger)) {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                b2Var.j0(iLogger, concurrentHashMap2, c03);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                e0Var.f16775v = concurrentHashMap2;
                b2Var.r();
                return e0Var;
            case 2:
                b2Var.k();
                i0 i0Var = new i0();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c05 = b2Var.c0();
                    c05.getClass();
                    switch (c05.hashCode()) {
                        case -265713450:
                            if (c05.equals("username")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3355:
                            if (c05.equals("id")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 102225:
                            if (c05.equals("geo")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3076010:
                            if (c05.equals("data")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3373707:
                            if (c05.equals("name")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 96619420:
                            if (c05.equals(AccountTable.emailColumn)) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1480014044:
                            if (c05.equals("ip_address")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            i0Var.f16818c = b2Var.i0();
                            break;
                        case 1:
                            i0Var.f16817b = b2Var.i0();
                            break;
                        case 2:
                            b2Var.k();
                            j jVar = new j();
                            ConcurrentHashMap concurrentHashMap5 = null;
                            while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String c06 = b2Var.c0();
                                c06.getClass();
                                switch (c06.hashCode()) {
                                    case -934795532:
                                        if (c06.equals("region")) {
                                            z5 = false;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    case 3053931:
                                        if (c06.equals("city")) {
                                            z5 = true;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    case 1481071862:
                                        if (c06.equals("country_code")) {
                                            z5 = 2;
                                            break;
                                        }
                                        z5 = -1;
                                        break;
                                    default:
                                        z5 = -1;
                                        break;
                                }
                                switch (z5) {
                                    case false:
                                        jVar.f16826c = b2Var.i0();
                                        break;
                                    case true:
                                        jVar.f16824a = b2Var.i0();
                                        break;
                                    case true:
                                        jVar.f16825b = b2Var.i0();
                                        break;
                                    default:
                                        if (concurrentHashMap5 == null) {
                                            concurrentHashMap5 = new ConcurrentHashMap();
                                        }
                                        b2Var.j0(iLogger, concurrentHashMap5, c06);
                                        break;
                                }
                            }
                            jVar.f16827d = concurrentHashMap5;
                            b2Var.r();
                            i0Var.f16821f = jVar;
                            break;
                        case 3:
                            i0Var.f16822g = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                            break;
                        case 4:
                            i0Var.f16820e = b2Var.i0();
                            break;
                        case 5:
                            i0Var.f16816a = b2Var.i0();
                            break;
                        case 6:
                            i0Var.f16819d = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap4, c05);
                            break;
                    }
                }
                i0Var.f16823h = concurrentHashMap4;
                b2Var.r();
                return i0Var;
            case 3:
                b2Var.k();
                String str2 = null;
                ArrayList arrayList = null;
                HashMap hashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c07 = b2Var.c0();
                    c07.getClass();
                    if (c07.equals("rendering_system")) {
                        str2 = b2Var.i0();
                    } else if (c07.equals("windows")) {
                        arrayList = b2Var.R(iLogger, new c0(i11));
                    } else {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap, c07);
                    }
                }
                b2Var.r();
                j0 j0Var = new j0(str2, arrayList);
                j0Var.f16830c = hashMap;
                return j0Var;
            case 4:
                k0 k0Var = new k0();
                b2Var.k();
                HashMap hashMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c08 = b2Var.c0();
                    c08.getClass();
                    switch (c08.hashCode()) {
                        case -1784982718:
                            if (c08.equals("rendering_system")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1618432855:
                            if (c08.equals("identifier")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1221029593:
                            if (c08.equals("height")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 120:
                            if (c08.equals("x")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 121:
                            if (c08.equals("y")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 114586:
                            if (c08.equals("tag")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3575610:
                            if (c08.equals("type")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 92909918:
                            if (c08.equals("alpha")) {
                                c11 = 7;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 113126854:
                            if (c08.equals("width")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1659526655:
                            if (c08.equals("children")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1941332754:
                            if (c08.equals("visibility")) {
                                c11 = '\n';
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            k0Var.f16840a = b2Var.i0();
                            break;
                        case 1:
                            k0Var.f16842c = b2Var.i0();
                            break;
                        case 2:
                            k0Var.f16845f = b2Var.C();
                            break;
                        case 3:
                            k0Var.f16846g = b2Var.C();
                            break;
                        case 4:
                            k0Var.f16847h = b2Var.C();
                            break;
                        case 5:
                            k0Var.f16843d = b2Var.i0();
                            break;
                        case 6:
                            k0Var.f16841b = b2Var.i0();
                            break;
                        case 7:
                            k0Var.j = b2Var.C();
                            break;
                        case '\b':
                            k0Var.f16844e = b2Var.C();
                            break;
                        case '\t':
                            k0Var.f16849k = b2Var.R(iLogger, this);
                            break;
                        case '\n':
                            k0Var.f16848i = b2Var.i0();
                            break;
                        default:
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap2, c08);
                            break;
                    }
                }
                b2Var.r();
                k0Var.f16850l = hashMap2;
                return k0Var;
            case 5:
                b2Var.k();
                io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c09 = b2Var.c0();
                    c09.getClass();
                    switch (c09.hashCode()) {
                        case -1266514778:
                            if (c09.equals("frames")) {
                                z7 = false;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -892498197:
                            if (c09.equals("stacks")) {
                                z7 = true;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 1864843273:
                            if (c09.equals("samples")) {
                                z7 = 2;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 2061486532:
                            if (c09.equals("thread_metadata")) {
                                z7 = 3;
                                break;
                            }
                            z7 = -1;
                            break;
                        default:
                            z7 = -1;
                            break;
                    }
                    switch (z7) {
                        case false:
                            ArrayList R2 = b2Var.R(iLogger, new io.sentry.clientreport.b(27));
                            if (R2 == null) {
                                break;
                            } else {
                                aVar.f16889c = R2;
                                break;
                            }
                        case true:
                            List list = (List) b2Var.f0(iLogger, new c0(i12));
                            if (list == null) {
                                break;
                            } else {
                                aVar.f16888b = list;
                                break;
                            }
                        case true:
                            ArrayList R3 = b2Var.R(iLogger, new c0(i5));
                            if (R3 == null) {
                                break;
                            } else {
                                aVar.f16887a = R3;
                                break;
                            }
                        case true:
                            HashMap Y3 = b2Var.Y(iLogger, new c0(i10));
                            if (Y3 == null) {
                                break;
                            } else {
                                aVar.f16890d = Y3;
                                break;
                            }
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap6, c09);
                            break;
                    }
                }
                aVar.f16891e = concurrentHashMap6;
                b2Var.r();
                return aVar;
            case 6:
                ArrayList arrayList2 = new ArrayList();
                b2Var.c();
                while (b2Var.t()) {
                    ArrayList arrayList3 = new ArrayList();
                    b2Var.c();
                    while (b2Var.t()) {
                        arrayList3.add(Integer.valueOf(b2Var.N()));
                    }
                    b2Var.n();
                    arrayList2.add(arrayList3);
                }
                b2Var.n();
                return arrayList2;
            case 7:
                b2Var.k();
                io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                HashMap hashMap3 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c010 = b2Var.c0();
                    c010.getClass();
                    switch (c010.hashCode()) {
                        case -1562235024:
                            if (c010.equals("thread_id")) {
                                z10 = false;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 55126294:
                            if (c010.equals("timestamp")) {
                                z10 = true;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 1302676018:
                            if (c010.equals("stack_id")) {
                                z10 = 2;
                                break;
                            }
                            z10 = -1;
                            break;
                        default:
                            z10 = -1;
                            break;
                    }
                    switch (z10) {
                        case false:
                            bVar.f16894c = b2Var.i0();
                            break;
                        case true:
                            bVar.f16892a = b2Var.z();
                            break;
                        case true:
                            bVar.f16893b = b2Var.N();
                            break;
                        default:
                            if (hashMap3 == null) {
                                hashMap3 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap3, c010);
                            break;
                    }
                }
                bVar.f16895d = hashMap3;
                b2Var.r();
                return bVar;
            case 8:
                b2Var.k();
                io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                HashMap hashMap4 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c011 = b2Var.c0();
                    c011.getClass();
                    if (c011.equals("priority")) {
                        cVar.f16897b = b2Var.N();
                    } else if (c011.equals("name")) {
                        cVar.f16896a = b2Var.i0();
                    } else {
                        if (hashMap4 == null) {
                            hashMap4 = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap4, c011);
                    }
                }
                cVar.f16898c = hashMap4;
                b2Var.r();
                return cVar;
            case 9:
                return b(b2Var, iLogger);
            case 10:
                return io.sentry.rrweb.c.values()[b2Var.N()];
            case 11:
                return io.sentry.rrweb.d.values()[b2Var.N()];
            case 12:
                return c(b2Var, iLogger);
            case 13:
                return io.sentry.rrweb.f.values()[b2Var.N()];
            case 14:
                return d(b2Var, iLogger);
            case 15:
                b2Var.k();
                io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                HashMap hashMap5 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c012 = b2Var.c0();
                    c012.getClass();
                    switch (c012.hashCode()) {
                        case 120:
                            if (c012.equals("x")) {
                                z11 = false;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 121:
                            if (c012.equals("y")) {
                                z11 = true;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 3355:
                            if (c012.equals("id")) {
                                z11 = 2;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 665490880:
                            if (c012.equals("timeOffset")) {
                                z11 = 3;
                                break;
                            }
                            z11 = -1;
                            break;
                        default:
                            z11 = -1;
                            break;
                    }
                    switch (z11) {
                        case false:
                            hVar.f17015b = b2Var.J();
                            break;
                        case true:
                            hVar.f17016c = b2Var.J();
                            break;
                        case true:
                            hVar.f17014a = b2Var.N();
                            break;
                        case true:
                            hVar.f17017d = b2Var.U();
                            break;
                        default:
                            if (hashMap5 == null) {
                                hashMap5 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap5, c012);
                            break;
                    }
                }
                hVar.f17018e = hashMap5;
                b2Var.r();
                return hVar;
            case 16:
                return e(b2Var, iLogger);
            case 17:
                return f(b2Var, iLogger);
            default:
                return g(b2Var, iLogger);
        }
    }
}
